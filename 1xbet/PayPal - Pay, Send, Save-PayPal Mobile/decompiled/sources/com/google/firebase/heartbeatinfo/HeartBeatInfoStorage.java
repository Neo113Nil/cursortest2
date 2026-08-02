package com.google.firebase.heartbeatinfo;

/* loaded from: classes4.dex */
class HeartBeatInfoStorage {
    private static final java.lang.String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final java.lang.String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static com.google.firebase.heartbeatinfo.HeartBeatInfoStorage instance;
    private final com.google.firebase.datastorage.JavaDataStorage firebaseDataStore;
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> GLOBAL = androidx.content.preferences.core.PreferencesKeys.longKey("fire-global");
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> HEART_BEAT_COUNT_TAG = androidx.content.preferences.core.PreferencesKeys.longKey("fire-count");
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> LAST_STORED_DATE = androidx.content.preferences.core.PreferencesKeys.stringKey("last-used-date");

    public HeartBeatInfoStorage(android.content.Context context, java.lang.String str) {
        this.firebaseDataStore = new com.google.firebase.datastorage.JavaDataStorage(context, HEARTBEAT_PREFERENCES_NAME.concat(java.lang.String.valueOf(str)));
    }

    HeartBeatInfoStorage(com.google.firebase.datastorage.JavaDataStorage javaDataStorage) {
        this.firebaseDataStore = javaDataStorage;
    }

    int getHeartBeatCount() {
        return ((java.lang.Long) this.firebaseDataStore.getSync(HEART_BEAT_COUNT_TAG, 0L)).intValue();
    }

    void deleteAllHeartBeats() {
        synchronized (this) {
            this.firebaseDataStore.editSync(new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.this.m10438xe97e9b5a((androidx.content.preferences.core.MutablePreferences) obj);
                }
            });
        }
    }

    /* renamed from: lambda$deleteAllHeartBeats$0$com-google-firebase-heartbeatinfo-HeartBeatInfoStorage, reason: not valid java name */
    /* synthetic */ kotlin.Unit m10438xe97e9b5a(androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        java.util.Set m9181m;
        long j = 0;
        for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof java.util.Set) {
                androidx.datastore.preferences.core.Preferences.Key<?> key = entry.getKey();
                java.util.Set set = (java.util.Set) entry.getValue();
                java.lang.String formattedDate = getFormattedDate(java.lang.System.currentTimeMillis());
                if (set.contains(formattedDate)) {
                    m9181m = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9181m(new java.lang.Object[]{formattedDate});
                    mutablePreferences.set(key, m9181m);
                    j++;
                } else {
                    mutablePreferences.remove(key);
                }
            }
        }
        if (j == 0) {
            mutablePreferences.remove(HEART_BEAT_COUNT_TAG);
            return null;
        }
        mutablePreferences.set(HEART_BEAT_COUNT_TAG, java.lang.Long.valueOf(j));
        return null;
    }

    java.util.List<com.google.firebase.heartbeatinfo.HeartBeatResult> getAllHeartBeats() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            java.lang.String formattedDate = getFormattedDate(java.lang.System.currentTimeMillis());
            for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : this.firebaseDataStore.getAllSync().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    java.util.HashSet hashSet = new java.util.HashSet((java.util.Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(com.google.firebase.heartbeatinfo.HeartBeatResult.create(entry.getKey().getName(), new java.util.ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(java.lang.System.currentTimeMillis());
        }
        return arrayList;
    }

    private androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> getStoredUserAgentString(androidx.content.preferences.core.MutablePreferences mutablePreferences, java.lang.String str) {
        synchronized (this) {
            for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : mutablePreferences.asMap().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((java.lang.String) it.next())) {
                            return androidx.content.preferences.core.PreferencesKeys.stringSetKey(entry.getKey().getName());
                        }
                    }
                }
            }
            return null;
        }
    }

    private void updateStoredUserAgent(androidx.content.preferences.core.MutablePreferences mutablePreferences, androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> key, java.lang.String str) {
        synchronized (this) {
            removeStoredDate(mutablePreferences, str);
            java.util.HashSet hashSet = new java.util.HashSet((java.util.Collection) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, key, new java.util.HashSet()));
            hashSet.add(str);
            mutablePreferences.set(key, hashSet);
        }
    }

    private void removeStoredDate(androidx.content.preferences.core.MutablePreferences mutablePreferences, java.lang.String str) {
        synchronized (this) {
            androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> storedUserAgentString = getStoredUserAgentString(mutablePreferences, str);
            if (storedUserAgentString == null) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet((java.util.Collection) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, storedUserAgentString, new java.util.HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(storedUserAgentString);
            } else {
                mutablePreferences.set(storedUserAgentString, hashSet);
            }
        }
    }

    void postHeartBeatCleanUp() {
        synchronized (this) {
            final java.lang.String formattedDate = getFormattedDate(java.lang.System.currentTimeMillis());
            this.firebaseDataStore.editSync(new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.this.m10439x44e9f764(formattedDate, (androidx.content.preferences.core.MutablePreferences) obj);
                }
            });
        }
    }

    /* renamed from: lambda$postHeartBeatCleanUp$1$com-google-firebase-heartbeatinfo-HeartBeatInfoStorage, reason: not valid java name */
    /* synthetic */ kotlin.Unit m10439x44e9f764(java.lang.String str, androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        mutablePreferences.set(LAST_STORED_DATE, str);
        removeStoredDate(mutablePreferences, str);
        return null;
    }

    private java.lang.String getFormattedDate(long j) {
        java.lang.String format;
        synchronized (this) {
            format = new java.util.Date(j).toInstant().atOffset(java.time.ZoneOffset.UTC).toLocalDateTime().format(java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return format;
    }

    void storeHeartBeat(long j, final java.lang.String str) {
        synchronized (this) {
            final java.lang.String formattedDate = getFormattedDate(j);
            final androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey = androidx.content.preferences.core.PreferencesKeys.stringSetKey(str);
            this.firebaseDataStore.editSync(new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.this.m10440x76ccc570(formattedDate, str, stringSetKey, (androidx.content.preferences.core.MutablePreferences) obj);
                }
            });
        }
    }

    /* renamed from: lambda$storeHeartBeat$2$com-google-firebase-heartbeatinfo-HeartBeatInfoStorage, reason: not valid java name */
    /* synthetic */ kotlin.Unit m10440x76ccc570(java.lang.String str, java.lang.String str2, androidx.datastore.preferences.core.Preferences.Key key, androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        androidx.datastore.preferences.core.Preferences.Key<java.lang.String> key2 = LAST_STORED_DATE;
        if (((java.lang.String) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, key2, "")).equals(str)) {
            androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> storedUserAgentString = getStoredUserAgentString(mutablePreferences, str);
            if (storedUserAgentString == null || storedUserAgentString.getName().equals(str2)) {
                return null;
            }
            updateStoredUserAgent(mutablePreferences, key, str);
            return null;
        }
        androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> key3 = HEART_BEAT_COUNT_TAG;
        long longValue = ((java.lang.Long) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, key3, 0L)).longValue();
        if (longValue + 1 == 30) {
            longValue = cleanUpStoredHeartBeats(mutablePreferences);
        }
        java.util.HashSet hashSet = new java.util.HashSet((java.util.Collection) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, key, new java.util.HashSet()));
        hashSet.add(str);
        mutablePreferences.set(key, hashSet);
        mutablePreferences.set(key3, java.lang.Long.valueOf(longValue + 1));
        mutablePreferences.set(key2, str);
        return null;
    }

    private long cleanUpStoredHeartBeats(androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        long j;
        synchronized (this) {
            long longValue = ((java.lang.Long) com.google.firebase.datastorage.JavaDataStorageKt.getOrDefault(mutablePreferences, HEART_BEAT_COUNT_TAG, 0L)).longValue();
            java.lang.String str = "";
            java.util.Set hashSet = new java.util.HashSet();
            java.lang.String str2 = null;
            for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : mutablePreferences.asMap().entrySet()) {
                if (entry.getValue() instanceof java.util.Set) {
                    java.util.Set<java.lang.String> set = (java.util.Set) entry.getValue();
                    for (java.lang.String str3 : set) {
                        if (str2 == null || str2.compareTo(str3) > 0) {
                            str = entry.getKey().getName();
                            hashSet = set;
                            str2 = str3;
                        }
                    }
                }
            }
            java.util.HashSet hashSet2 = new java.util.HashSet(hashSet);
            hashSet2.remove(str2);
            mutablePreferences.set(androidx.content.preferences.core.PreferencesKeys.stringSetKey(str), hashSet2);
            j = longValue - 1;
            mutablePreferences.set(HEART_BEAT_COUNT_TAG, java.lang.Long.valueOf(j));
        }
        return j;
    }

    long getLastGlobalHeartBeat() {
        long longValue;
        synchronized (this) {
            longValue = ((java.lang.Long) this.firebaseDataStore.getSync(GLOBAL, -1L)).longValue();
        }
        return longValue;
    }

    void updateGlobalHeartBeat(final long j) {
        synchronized (this) {
            this.firebaseDataStore.editSync(new kotlin.jvm.functions.Function1() { // from class: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.lambda$updateGlobalHeartBeat$3(j, (androidx.content.preferences.core.MutablePreferences) obj);
                }
            });
        }
    }

    static /* synthetic */ kotlin.Unit lambda$updateGlobalHeartBeat$3(long j, androidx.content.preferences.core.MutablePreferences mutablePreferences) {
        mutablePreferences.set(GLOBAL, java.lang.Long.valueOf(j));
        return null;
    }

    boolean isSameDateUtc(long j, long j2) {
        boolean equals;
        synchronized (this) {
            equals = getFormattedDate(j).equals(getFormattedDate(j2));
        }
        return equals;
    }

    boolean shouldSendSdkHeartBeat(androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> key, long j) {
        synchronized (this) {
            if (isSameDateUtc(((java.lang.Long) this.firebaseDataStore.getSync(key, -1L)).longValue(), j)) {
                return false;
            }
            this.firebaseDataStore.putSync(key, java.lang.Long.valueOf(j));
            return true;
        }
    }

    boolean shouldSendGlobalHeartBeat(long j) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat(GLOBAL, j);
        }
        return shouldSendSdkHeartBeat;
    }
}
