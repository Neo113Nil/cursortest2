package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfig {
    public static final boolean DEFAULT_VALUE_FOR_BOOLEAN = false;
    public static final byte[] DEFAULT_VALUE_FOR_BYTE_ARRAY = new byte[0];
    public static final double DEFAULT_VALUE_FOR_DOUBLE = 0.0d;
    public static final long DEFAULT_VALUE_FOR_LONG = 0;
    public static final java.lang.String DEFAULT_VALUE_FOR_STRING = "";
    public static final int LAST_FETCH_STATUS_FAILURE = 1;
    public static final int LAST_FETCH_STATUS_NO_FETCH_YET = 0;
    public static final int LAST_FETCH_STATUS_SUCCESS = -1;
    public static final int LAST_FETCH_STATUS_THROTTLED = 2;
    public static final java.lang.String TAG = "FirebaseRemoteConfig";
    public static final int VALUE_SOURCE_DEFAULT = 1;
    public static final int VALUE_SOURCE_REMOTE = 2;
    public static final int VALUE_SOURCE_STATIC = 0;
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedConfigsCache;
    private final com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler configRealtimeHandler;
    private final android.content.Context context;
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient defaultConfigsCache;
    private final java.util.concurrent.Executor executor;
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHandler fetchHandler;
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient fetchedConfigsCache;
    private final com.google.firebase.abt.FirebaseABTesting firebaseAbt;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient frcSharedPrefs;
    private final com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler getHandler;
    private final com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler;

    public static com.google.firebase.remoteconfig.FirebaseRemoteConfig getInstance() {
        return getInstance(com.google.firebase.FirebaseApp.getInstance());
    }

    public static com.google.firebase.remoteconfig.FirebaseRemoteConfig getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        return ((com.google.firebase.remoteconfig.RemoteConfigComponent) firebaseApp.get(com.google.firebase.remoteconfig.RemoteConfigComponent.class)).getDefault();
    }

    FirebaseRemoteConfig(android.content.Context context, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.abt.FirebaseABTesting firebaseABTesting, java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient3, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler configGetParameterHandler, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient, com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler configRealtimeHandler, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.context = context;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.executor = executor;
        this.fetchedConfigsCache = configCacheClient;
        this.activatedConfigsCache = configCacheClient2;
        this.defaultConfigsCache = configCacheClient3;
        this.fetchHandler = configFetchHandler;
        this.getHandler = configGetParameterHandler;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.configRealtimeHandler = configRealtimeHandler;
        this.rolloutsStateSubscriptionsHandler = rolloutsStateSubscriptionsHandler;
    }

    public com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo> ensureInitialized() {
        com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task = this.activatedConfigsCache.get();
        com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task2 = this.defaultConfigsCache.get();
        com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task3 = this.fetchedConfigsCache.get();
        final com.google.android.gms.tasks.Task call = com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda8
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.getInfo();
            }
        });
        return com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{task, task2, task3, call, this.firebaseInstallations.getId(), this.firebaseInstallations.getToken(false)}).continueWith(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task4) {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.lambda$ensureInitialized$0(com.google.android.gms.tasks.Task.this, task4);
            }
        });
    }

    static /* synthetic */ com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo lambda$ensureInitialized$0(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2) throws java.lang.Exception {
        return (com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo) task.getResult();
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> fetchAndActivate() {
        return fetch().onSuccessTask(this.executor, new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.m5575xebd5994c((java.lang.Void) obj);
            }
        });
    }

    /* renamed from: lambda$fetchAndActivate$1$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5575xebd5994c(java.lang.Void r1) throws java.lang.Exception {
        return activate();
    }

    public com.google.android.gms.tasks.Task<java.lang.Boolean> activate() {
        final com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task = this.fetchedConfigsCache.get();
        final com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task2 = this.activatedConfigsCache.get();
        return com.google.android.gms.tasks.Tasks.whenAllComplete((com.google.android.gms.tasks.Task<?>[]) new com.google.android.gms.tasks.Task[]{task, task2}).continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task3) {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.m5574x98ca96b0(task, task2, task3);
            }
        });
    }

    /* renamed from: lambda$activate$2$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m5574x98ca96b0(com.google.android.gms.tasks.Task task, com.google.android.gms.tasks.Task task2, com.google.android.gms.tasks.Task task3) throws java.lang.Exception {
        if (!task.isSuccessful() || task.getResult() == null) {
            return com.google.android.gms.tasks.Tasks.forResult(false);
        }
        com.google.firebase.remoteconfig.internal.ConfigContainer configContainer = (com.google.firebase.remoteconfig.internal.ConfigContainer) task.getResult();
        if (task2.isSuccessful() && !isFetchedFresh(configContainer, (com.google.firebase.remoteconfig.internal.ConfigContainer) task2.getResult())) {
            return com.google.android.gms.tasks.Tasks.forResult(false);
        }
        return this.activatedConfigsCache.put(configContainer).continueWith(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task4) {
                boolean processActivatePutTask;
                processActivatePutTask = com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.processActivatePutTask(task4);
                return java.lang.Boolean.valueOf(processActivatePutTask);
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> fetch() {
        return this.fetchHandler.fetch().onSuccessTask(com.google.firebase.concurrent.FirebaseExecutors.directExecutor(), new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.android.gms.tasks.Task forResult;
                forResult = com.google.android.gms.tasks.Tasks.forResult(null);
                return forResult;
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> fetch(long j) {
        return this.fetchHandler.fetch(j).onSuccessTask(com.google.firebase.concurrent.FirebaseExecutors.directExecutor(), new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.android.gms.tasks.Task forResult;
                forResult = com.google.android.gms.tasks.Tasks.forResult(null);
                return forResult;
            }
        });
    }

    public java.lang.String getString(java.lang.String str) {
        return this.getHandler.getString(str);
    }

    public boolean getBoolean(java.lang.String str) {
        return this.getHandler.getBoolean(str);
    }

    public double getDouble(java.lang.String str) {
        return this.getHandler.getDouble(str);
    }

    public long getLong(java.lang.String str) {
        return this.getHandler.getLong(str);
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigValue getValue(java.lang.String str) {
        return this.getHandler.getValue(str);
    }

    public java.util.Set<java.lang.String> getKeysByPrefix(java.lang.String str) {
        return this.getHandler.getKeysByPrefix(str);
    }

    public java.util.Map<java.lang.String, com.google.firebase.remoteconfig.FirebaseRemoteConfigValue> getAll() {
        return this.getHandler.getAll();
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo getInfo() {
        return this.frcSharedPrefs.getInfo();
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setConfigSettingsAsync(final com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        return com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda7
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.m5577xd6203cf5(firebaseRemoteConfigSettings);
            }
        });
    }

    /* renamed from: lambda$setConfigSettingsAsync$5$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ java.lang.Void m5577xd6203cf5(com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) throws java.lang.Exception {
        this.frcSharedPrefs.setConfigSettings(firebaseRemoteConfigSettings);
        return null;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setDefaultsAsync(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put(entry.getKey(), new java.lang.String((byte[]) value));
            } else {
                hashMap.put(entry.getKey(), value.toString());
            }
        }
        return setDefaultsWithStringsMapAsync(hashMap);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setDefaultsAsync(int i) {
        return setDefaultsWithStringsMapAsync(com.google.firebase.remoteconfig.internal.DefaultsXmlParser.getDefaultsFromXml(this.context, i));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> reset() {
        return com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda6
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.m5576xf98246b6();
            }
        });
    }

    /* renamed from: lambda$reset$6$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ java.lang.Void m5576xf98246b6() throws java.lang.Exception {
        this.activatedConfigsCache.clear();
        this.fetchedConfigsCache.clear();
        this.defaultConfigsCache.clear();
        this.frcSharedPrefs.clear();
        return null;
    }

    public com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration addOnConfigUpdateListener(com.google.firebase.remoteconfig.ConfigUpdateListener configUpdateListener) {
        return this.configRealtimeHandler.addRealtimeConfigUpdateListener(configUpdateListener);
    }

    void startLoadingConfigsFromDisk() {
        this.activatedConfigsCache.get();
        this.defaultConfigsCache.get();
        this.fetchedConfigsCache.get();
    }

    public void schedule(java.lang.Runnable runnable) {
        this.executor.execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processActivatePutTask(com.google.android.gms.tasks.Task<com.google.firebase.remoteconfig.internal.ConfigContainer> task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.fetchedConfigsCache.clear();
        com.google.firebase.remoteconfig.internal.ConfigContainer result = task.getResult();
        if (result != null) {
            updateAbtWithActivatedExperiments(result.getAbtExperiments());
            this.rolloutsStateSubscriptionsHandler.publishActiveRolloutsState(result);
            return true;
        }
        android.util.Log.e(TAG, "Activated configs written to disk are null.");
        return true;
    }

    private com.google.android.gms.tasks.Task<java.lang.Void> setDefaultsWithStringsMapAsync(java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            return this.defaultConfigsCache.put(com.google.firebase.remoteconfig.internal.ConfigContainer.newBuilder().replaceConfigsWith(map).build()).onSuccessTask(com.google.firebase.concurrent.FirebaseExecutors.directExecutor(), new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                    com.google.android.gms.tasks.Task forResult;
                    forResult = com.google.android.gms.tasks.Tasks.forResult(null);
                    return forResult;
                }
            });
        } catch (org.json.JSONException e) {
            android.util.Log.e(TAG, "The provided defaults map could not be processed.", e);
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setCustomSignals(final com.google.firebase.remoteconfig.CustomSignals customSignals) {
        return com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.FirebaseRemoteConfig$$ExternalSyntheticLambda5
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return com.google.firebase.remoteconfig.FirebaseRemoteConfig.this.m5578x5520461b(customSignals);
            }
        });
    }

    /* renamed from: lambda$setCustomSignals$8$com-google-firebase-remoteconfig-FirebaseRemoteConfig, reason: not valid java name */
    /* synthetic */ java.lang.Void m5578x5520461b(com.google.firebase.remoteconfig.CustomSignals customSignals) throws java.lang.Exception {
        this.frcSharedPrefs.setCustomSignals(customSignals.customSignals);
        return null;
    }

    void updateAbtWithActivatedExperiments(org.json.JSONArray jSONArray) {
        if (this.firebaseAbt == null) {
            return;
        }
        try {
            this.firebaseAbt.replaceAllExperiments(toExperimentInfoMaps(jSONArray));
        } catch (com.google.firebase.abt.AbtException e) {
            android.util.Log.w(TAG, "Could not update ABT experiments.", e);
        } catch (org.json.JSONException e2) {
            android.util.Log.e(TAG, "Could not parse ABT experiments from the JSON response.", e2);
        }
    }

    void setConfigUpdateBackgroundState(boolean z) {
        this.configRealtimeHandler.setBackgroundState(z);
    }

    static java.util.List<java.util.Map<java.lang.String, java.lang.String>> toExperimentInfoMaps(org.json.JSONArray jSONArray) throws org.json.JSONException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            java.util.HashMap hashMap = new java.util.HashMap();
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler() {
        return this.rolloutsStateSubscriptionsHandler;
    }

    private static boolean isFetchedFresh(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer2) {
        return configContainer2 == null || !configContainer.getFetchTime().equals(configContainer2.getFetchTime());
    }
}
