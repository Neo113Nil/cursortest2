package com.datadog.android.sessionreplay.internal.resources;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR,\u0010\u0019\u001a\u001a\u0012\b\u0012\u0006*\u00020\b0\b*\f\u0012\b\u0012\u0006*\u00020\b0\b0\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/resources/ResourceDataStoreManager;", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "featureSdkCore", "Lcom/datadog/android/core/persistence/Serializer;", "Lcom/datadog/android/sessionreplay/model/ResourceHashesEntry;", "resourceHashesSerializer", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "", "resourceHashesDeserializer", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/core/persistence/Serializer;Lcom/datadog/android/core/internal/persistence/Deserializer;)V", "resourceHash", "", "cacheResourceHash$dd_sdk_android_session_replay_release", "(Ljava/lang/String;)V", "", "isPreviouslySentResource$dd_sdk_android_session_replay_release", "(Ljava/lang/String;)Z", "isReady$dd_sdk_android_session_replay_release", "()Z", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "Lcom/datadog/android/core/internal/persistence/Deserializer;", "Lcom/datadog/android/core/persistence/Serializer;", "Ljava/util/concurrent/atomic/AtomicLong;", "getInputFormats", "Ljava/util/concurrent/atomic/AtomicLong;", "getInputSizeshNQ4ISI", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceDataStoreManager {
    public static final long DATASTORE_EXPIRATION_NS = 2592000000000000L;
    public static final java.lang.String DATASTORE_HASHES_ENTRY_NAME = "resource-hash-store";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.sessionreplay.model.ResourceHashesEntry> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicBoolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.core.persistence.Serializer<com.datadog.android.sessionreplay.model.ResourceHashesEntry> Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicLong getInputSizeshNQ4ISI;

    public ResourceDataStoreManager(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.core.persistence.Serializer<com.datadog.android.sessionreplay.model.ResourceHashesEntry> serializer, com.datadog.android.core.internal.persistence.Deserializer<java.lang.String, com.datadog.android.sessionreplay.model.ResourceHashesEntry> deserializer) {
        com.datadog.android.api.storage.datastore.DataStoreHandler dataStore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deserializer, "");
        this.getHighSpeedVideoSizes = featureSdkCore;
        this.Camera2StreamConfigurationMap = serializer;
        this.getHighSpeedVideoFpsRanges = deserializer;
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
        this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicLong(featureSdkCore.getTimeProvider().getDeviceElapsedTimeNanos());
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean(false);
        final kotlin.jvm.functions.Function1<com.datadog.android.core.persistence.datastore.DataStoreContent<com.datadog.android.sessionreplay.model.ResourceHashesEntry>, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<com.datadog.android.core.persistence.datastore.DataStoreContent<com.datadog.android.sessionreplay.model.ResourceHashesEntry>, kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.core.persistence.datastore.DataStoreContent<com.datadog.android.sessionreplay.model.ResourceHashesEntry> dataStoreContent) {
                Camera2StreamConfigurationMap(dataStoreContent);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.datadog.android.core.persistence.datastore.DataStoreContent<com.datadog.android.sessionreplay.model.ResourceHashesEntry> dataStoreContent) {
                com.datadog.android.sessionreplay.model.ResourceHashesEntry data = dataStoreContent != null ? dataStoreContent.getData() : null;
                if (data == null) {
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this);
                    return;
                }
                long longValue = data.getLastUpdateDateNs().longValue();
                java.util.List<java.lang.String> resourceHashes = data.getResourceHashes();
                if (!com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$didDataStoreExpire(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this, longValue)) {
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this.getInputSizeshNQ4ISI.set(longValue);
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this.getHighSpeedVideoFpsRangesFor.addAll(resourceHashes);
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this);
                } else {
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager = com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this;
                    final com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager2 = com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this;
                    com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$deleteStoredHashesEntry(resourceDataStoreManager, new com.datadog.android.api.storage.datastore.DataStoreWriteCallback() { // from class: com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.1.1
                        @Override // com.datadog.android.api.storage.datastore.DataStoreWriteCallback
                        public final void onSuccess() {
                            com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this);
                        }

                        @Override // com.datadog.android.api.storage.datastore.DataStoreWriteCallback
                        public final void onFailure() {
                            com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this);
                        }
                    });
                }
            }

            {
                super(1);
            }
        };
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.2
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                Camera2StreamConfigurationMap();
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap() {
                com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager.this);
            }

            {
                super(0);
            }
        };
        com.datadog.android.api.feature.FeatureScope feature = featureSdkCore.getFeature("session-replay-resources");
        if (feature == null || (dataStore = feature.getDataStore()) == null) {
            return;
        }
        com.datadog.android.api.storage.datastore.DataStoreHandler.DefaultImpls.value$default(dataStore, DATASTORE_HASHES_ENTRY_NAME, null, new com.datadog.android.api.storage.datastore.DataStoreReadCallback<com.datadog.android.sessionreplay.model.ResourceHashesEntry>() { // from class: com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager$fetchStoredResourceHashes$1
            @Override // com.datadog.android.api.storage.datastore.DataStoreReadCallback
            public final void onSuccess(com.datadog.android.core.persistence.datastore.DataStoreContent<com.datadog.android.sessionreplay.model.ResourceHashesEntry> dataStoreContent) {
                function1.invoke(dataStoreContent);
            }

            @Override // com.datadog.android.api.storage.datastore.DataStoreReadCallback
            public final void onFailure() {
                function0.invoke();
            }
        }, deserializer, 2, null);
    }

    public final boolean isPreviouslySentResource$dd_sdk_android_session_replay_release(java.lang.String resourceHash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceHash, "");
        return this.getHighSpeedVideoFpsRangesFor.contains(resourceHash);
    }

    public final void cacheResourceHash$dd_sdk_android_session_replay_release(java.lang.String resourceHash) {
        com.datadog.android.api.storage.datastore.DataStoreHandler dataStore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceHash, "");
        this.getHighSpeedVideoFpsRangesFor.add(resourceHash);
        java.util.concurrent.atomic.AtomicLong atomicLong = this.getInputSizeshNQ4ISI;
        java.util.Set<java.lang.String> set = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(set, "");
        com.datadog.android.sessionreplay.model.ResourceHashesEntry resourceHashesEntry = new com.datadog.android.sessionreplay.model.ResourceHashesEntry(atomicLong, kotlin.collections.CollectionsKt.toList(set));
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("session-replay-resources");
        if (feature == null || (dataStore = feature.getDataStore()) == null) {
            return;
        }
        com.datadog.android.api.storage.datastore.DataStoreHandler.DefaultImpls.setValue$default(dataStore, DATASTORE_HASHES_ENTRY_NAME, resourceHashesEntry, 0, null, this.Camera2StreamConfigurationMap, 12, null);
    }

    public final boolean isReady$dd_sdk_android_session_replay_release() {
        return this.getHighResolutionOutputSizeshNQ4ISI.get();
    }

    public static final /* synthetic */ kotlin.Unit access$deleteStoredHashesEntry(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, com.datadog.android.api.storage.datastore.DataStoreWriteCallback dataStoreWriteCallback) {
        com.datadog.android.api.storage.datastore.DataStoreHandler dataStore;
        com.datadog.android.api.feature.FeatureScope feature = resourceDataStoreManager.getHighSpeedVideoSizes.getFeature("session-replay-resources");
        if (feature == null || (dataStore = feature.getDataStore()) == null) {
            return null;
        }
        dataStore.removeValue(DATASTORE_HASHES_ENTRY_NAME, dataStoreWriteCallback);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ boolean access$didDataStoreExpire(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager, long j) {
        return resourceDataStoreManager.getHighSpeedVideoSizes.getTimeProvider().getDeviceElapsedTimeNanos() - j > DATASTORE_EXPIRATION_NS;
    }

    public static final /* synthetic */ void access$finishedInitializingManager(com.datadog.android.sessionreplay.internal.resources.ResourceDataStoreManager resourceDataStoreManager) {
        resourceDataStoreManager.getHighResolutionOutputSizeshNQ4ISI.set(true);
    }
}
