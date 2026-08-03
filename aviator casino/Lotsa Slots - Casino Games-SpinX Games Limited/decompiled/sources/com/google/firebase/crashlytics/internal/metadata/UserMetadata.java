package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
public class UserMetadata {
    public static final java.lang.String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final java.lang.String KEYDATA_FILENAME = "keys";
    public static final int MAX_ATTRIBUTES = 64;
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final java.lang.String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final java.lang.String USERDATA_FILENAME = "user-data";
    private final com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers;
    private final com.google.firebase.crashlytics.internal.metadata.MetaDataStore metaDataStore;
    private java.lang.String sessionIdentifier;
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap customKeys = new com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap(false);
    private final com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap internalKeys = new com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap(true);
    private final com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList rolloutsState = new com.google.firebase.crashlytics.internal.metadata.RolloutAssignmentList(128);
    private final java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> userId = new java.util.concurrent.atomic.AtomicMarkableReference<>(null, false);

    public static java.lang.String readUserId(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore) {
        return new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore).readUserId(str);
    }

    public static com.google.firebase.crashlytics.internal.metadata.UserMetadata loadFromExistingSession(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        com.google.firebase.crashlytics.internal.metadata.MetaDataStore metaDataStore = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore);
        com.google.firebase.crashlytics.internal.metadata.UserMetadata userMetadata = new com.google.firebase.crashlytics.internal.metadata.UserMetadata(str, fileStore, crashlyticsWorkers);
        userMetadata.customKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, false));
        userMetadata.internalKeys.map.getReference().setKeys(metaDataStore.readKeyData(str, true));
        userMetadata.userId.set(metaDataStore.readUserId(str), false);
        userMetadata.rolloutsState.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    public UserMetadata(java.lang.String str, com.google.firebase.crashlytics.internal.persistence.FileStore fileStore, com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers crashlyticsWorkers) {
        this.sessionIdentifier = str;
        this.metaDataStore = new com.google.firebase.crashlytics.internal.metadata.MetaDataStore(fileStore);
        this.crashlyticsWorkers = crashlyticsWorkers;
    }

    public void setNewSession(final java.lang.String str) {
        synchronized (this.sessionIdentifier) {
            this.sessionIdentifier = str;
            final java.util.Map<java.lang.String, java.lang.String> keys = this.customKeys.getKeys();
            final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.m5538xeeb41fb7(str, keys, rolloutAssignmentList);
                }
            });
        }
    }

    /* renamed from: lambda$setNewSession$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m5538xeeb41fb7(java.lang.String str, java.util.Map map, java.util.List list) {
        if (getUserId() != null) {
            this.metaDataStore.writeUserData(str, getUserId());
        }
        if (!map.isEmpty()) {
            this.metaDataStore.writeKeyData(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        this.metaDataStore.writeRolloutState(str, list);
    }

    public java.lang.String getUserId() {
        return this.userId.getReference();
    }

    public void setUserId(java.lang.String str) {
        java.lang.String sanitizeString = com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(str, 1024);
        synchronized (this.userId) {
            if (com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(sanitizeString, this.userId.getReference())) {
                return;
            }
            this.userId.set(sanitizeString, true);
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.serializeUserDataIfNeeded();
                }
            });
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.isEmpty()) {
            return this.customKeys.getKeys();
        }
        java.util.HashMap hashMap = new java.util.HashMap(this.customKeys.getKeys());
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String sanitizeString = com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(entry.getKey(), 1024);
            if (hashMap.size() < 64 || hashMap.containsKey(sanitizeString)) {
                hashMap.put(sanitizeString, com.google.firebase.crashlytics.internal.metadata.KeysMap.sanitizeString(entry.getValue(), 1024));
            } else {
                i++;
            }
        }
        if (i > 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public java.util.Map<java.lang.String, java.lang.String> getCustomKeys() {
        return this.customKeys.getKeys();
    }

    public boolean setCustomKey(java.lang.String str, java.lang.String str2) {
        return this.customKeys.setKey(str, str2);
    }

    public void setCustomKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        this.customKeys.setKeys(map);
    }

    public java.util.Map<java.lang.String, java.lang.String> getInternalKeys() {
        return this.internalKeys.getKeys();
    }

    public boolean setInternalKey(java.lang.String str, java.lang.String str2) {
        return this.internalKeys.setKey(str, str2);
    }

    public java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.rolloutsState.getReportRolloutsState();
    }

    public boolean updateRolloutsState(java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> list) {
        synchronized (this.rolloutsState) {
            if (!this.rolloutsState.updateRolloutAssignmentList(list)) {
                return false;
            }
            final java.util.List<com.google.firebase.crashlytics.internal.metadata.RolloutAssignment> rolloutAssignmentList = this.rolloutsState.getRolloutAssignmentList();
            this.crashlyticsWorkers.diskWrite.submit(new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.m5539x8982b7e8(rolloutAssignmentList);
                }
            });
            return true;
        }
    }

    /* renamed from: lambda$updateRolloutsState$1$com-google-firebase-crashlytics-internal-metadata-UserMetadata, reason: not valid java name */
    /* synthetic */ void m5539x8982b7e8(java.util.List list) {
        this.metaDataStore.writeRolloutState(this.sessionIdentifier, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializeUserDataIfNeeded() {
        boolean z;
        java.lang.String str;
        synchronized (this.userId) {
            z = false;
            if (this.userId.isMarked()) {
                str = getUserId();
                this.userId.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.metaDataStore.writeUserData(this.sessionIdentifier, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SerializeableKeysMap {
        private final boolean isInternal;
        final java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> map;
        private final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> queuedSerializer = new java.util.concurrent.atomic.AtomicReference<>(null);

        public SerializeableKeysMap(boolean z) {
            this.isInternal = z;
            this.map = new java.util.concurrent.atomic.AtomicMarkableReference<>(new com.google.firebase.crashlytics.internal.metadata.KeysMap(64, z ? 8192 : 1024), false);
        }

        public java.util.Map<java.lang.String, java.lang.String> getKeys() {
            return this.map.getReference().getKeys();
        }

        public boolean setKey(java.lang.String str, java.lang.String str2) {
            synchronized (this) {
                if (!this.map.getReference().setKey(str, str2)) {
                    return false;
                }
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                scheduleSerializationTaskIfNeeded();
                return true;
            }
        }

        public void setKeys(java.util.Map<java.lang.String, java.lang.String> map) {
            synchronized (this) {
                this.map.getReference().setKeys(map);
                java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            scheduleSerializationTaskIfNeeded();
        }

        private void scheduleSerializationTaskIfNeeded() {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.UserMetadata$SerializeableKeysMap$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.firebase.crashlytics.internal.metadata.UserMetadata.SerializeableKeysMap.this.m5540xb9b680d3();
                }
            };
            if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(this.queuedSerializer, null, runnable)) {
                com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.crashlyticsWorkers.diskWrite.submit(runnable);
            }
        }

        /* renamed from: lambda$scheduleSerializationTaskIfNeeded$0$com-google-firebase-crashlytics-internal-metadata-UserMetadata$SerializeableKeysMap, reason: not valid java name */
        /* synthetic */ void m5540xb9b680d3() {
            this.queuedSerializer.set(null);
            serializeIfMarked();
        }

        private void serializeIfMarked() {
            java.util.Map<java.lang.String, java.lang.String> map;
            synchronized (this) {
                if (this.map.isMarked()) {
                    map = this.map.getReference().getKeys();
                    java.util.concurrent.atomic.AtomicMarkableReference<com.google.firebase.crashlytics.internal.metadata.KeysMap> atomicMarkableReference = this.map;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.metaDataStore.writeKeyData(com.google.firebase.crashlytics.internal.metadata.UserMetadata.this.sessionIdentifier, map, this.isInternal);
            }
        }
    }
}
