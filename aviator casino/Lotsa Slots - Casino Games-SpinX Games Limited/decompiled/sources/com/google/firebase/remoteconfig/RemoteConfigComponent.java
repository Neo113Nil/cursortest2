package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class RemoteConfigComponent implements com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop {
    public static final java.lang.String ACTIVATE_FILE_NAME = "activate";
    public static final long CONNECTION_TIMEOUT_IN_SECONDS = 60;
    public static final java.lang.String DEFAULTS_FILE_NAME = "defaults";
    public static final java.lang.String DEFAULT_NAMESPACE = "firebase";
    public static final java.lang.String FETCH_FILE_NAME = "fetch";
    private static final java.lang.String FIREBASE_REMOTE_CONFIG_FILE_NAME_PREFIX = "frc";
    private static final java.lang.String PREFERENCES_FILE_NAME = "settings";
    private final com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> analyticsConnector;
    private final java.lang.String appId;
    private final android.content.Context context;
    private java.util.Map<java.lang.String, java.lang.String> customHeaders;
    private final java.util.concurrent.ScheduledExecutorService executor;
    private final com.google.firebase.abt.FirebaseABTesting firebaseAbt;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final java.util.Map<java.lang.String, com.google.firebase.remoteconfig.FirebaseRemoteConfig> frcNamespaceInstances;
    private static final com.google.android.gms.common.util.Clock DEFAULT_CLOCK = com.google.android.gms.common.util.DefaultClock.getInstance();
    private static final java.util.Random DEFAULT_RANDOM = new java.util.Random();
    private static final java.util.Map<java.lang.String, com.google.firebase.remoteconfig.FirebaseRemoteConfig> frcNamespaceInstancesStatic = new java.util.HashMap();

    static /* synthetic */ com.google.firebase.analytics.connector.AnalyticsConnector lambda$getFetchHandler$0() {
        return null;
    }

    RemoteConfigComponent(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.abt.FirebaseABTesting firebaseABTesting, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider) {
        this(context, scheduledExecutorService, firebaseApp, firebaseInstallationsApi, firebaseABTesting, provider, true);
    }

    protected RemoteConfigComponent(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.abt.FirebaseABTesting firebaseABTesting, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider, boolean z) {
        this.frcNamespaceInstances = new java.util.HashMap();
        this.customHeaders = new java.util.HashMap();
        this.context = context;
        this.executor = scheduledExecutorService;
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.firebaseAbt = firebaseABTesting;
        this.analyticsConnector = provider;
        this.appId = firebaseApp.getOptions().getApplicationId();
        com.google.firebase.remoteconfig.RemoteConfigComponent.GlobalBackgroundListener.ensureBackgroundListenerIsRegistered(context);
        if (z) {
            com.google.android.gms.tasks.Tasks.call(scheduledExecutorService, new java.util.concurrent.Callable() { // from class: com.google.firebase.remoteconfig.RemoteConfigComponent$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.google.firebase.remoteconfig.RemoteConfigComponent.this.getDefault();
                }
            });
        }
    }

    com.google.firebase.remoteconfig.FirebaseRemoteConfig getDefault() {
        return get(DEFAULT_NAMESPACE);
    }

    public synchronized com.google.firebase.remoteconfig.FirebaseRemoteConfig get(java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigCacheClient cacheClient;
        com.google.firebase.remoteconfig.internal.ConfigCacheClient cacheClient2;
        com.google.firebase.remoteconfig.internal.ConfigCacheClient cacheClient3;
        com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient sharedPrefsClient;
        com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler getHandler;
        cacheClient = getCacheClient(str, FETCH_FILE_NAME);
        cacheClient2 = getCacheClient(str, ACTIVATE_FILE_NAME);
        cacheClient3 = getCacheClient(str, DEFAULTS_FILE_NAME);
        sharedPrefsClient = getSharedPrefsClient(this.context, this.appId, str);
        getHandler = getGetHandler(cacheClient2, cacheClient3);
        final com.google.firebase.remoteconfig.internal.Personalization personalization = getPersonalization(this.firebaseApp, str, this.analyticsConnector);
        if (personalization != null) {
            java.util.Objects.requireNonNull(personalization);
            getHandler.addListener(new com.google.android.gms.common.util.BiConsumer() { // from class: com.google.firebase.remoteconfig.RemoteConfigComponent$$ExternalSyntheticLambda0
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    com.google.firebase.remoteconfig.internal.Personalization.this.logArmActive((java.lang.String) obj, (com.google.firebase.remoteconfig.internal.ConfigContainer) obj2);
                }
            });
        }
        return get(this.firebaseApp, str, this.firebaseInstallations, this.firebaseAbt, this.executor, cacheClient, cacheClient2, cacheClient3, getFetchHandler(str, cacheClient, sharedPrefsClient), getHandler, sharedPrefsClient, getRolloutsStateSubscriptionsHandler(cacheClient2, cacheClient3));
    }

    synchronized com.google.firebase.remoteconfig.FirebaseRemoteConfig get(com.google.firebase.FirebaseApp firebaseApp, java.lang.String str, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.abt.FirebaseABTesting firebaseABTesting, java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient3, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler configGetParameterHandler, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        if (!this.frcNamespaceInstances.containsKey(str)) {
            com.google.firebase.remoteconfig.FirebaseRemoteConfig firebaseRemoteConfig = new com.google.firebase.remoteconfig.FirebaseRemoteConfig(this.context, firebaseApp, firebaseInstallationsApi, isAbtSupported(firebaseApp, str) ? firebaseABTesting : null, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, getRealtime(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, this.context, str, configSharedPrefsClient), rolloutsStateSubscriptionsHandler);
            firebaseRemoteConfig.startLoadingConfigsFromDisk();
            this.frcNamespaceInstances.put(str, firebaseRemoteConfig);
            frcNamespaceInstancesStatic.put(str, firebaseRemoteConfig);
        }
        return this.frcNamespaceInstances.get(str);
    }

    public synchronized void setCustomHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.customHeaders = map;
    }

    private com.google.firebase.remoteconfig.internal.ConfigCacheClient getCacheClient(java.lang.String str, java.lang.String str2) {
        return com.google.firebase.remoteconfig.internal.ConfigCacheClient.getInstance(this.executor, com.google.firebase.remoteconfig.internal.ConfigStorageClient.getInstance(this.context, java.lang.String.format("%s_%s_%s_%s.json", "frc", this.appId, str, str2)));
    }

    com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient getFrcBackendApiClient(java.lang.String str, java.lang.String str2, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient) {
        return new com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient(this.context, this.firebaseApp.getOptions().getApplicationId(), str, str2, configSharedPrefsClient.getFetchTimeoutInSeconds(), configSharedPrefsClient.getFetchTimeoutInSeconds());
    }

    synchronized com.google.firebase.remoteconfig.internal.ConfigFetchHandler getFetchHandler(java.lang.String str, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient) {
        return new com.google.firebase.remoteconfig.internal.ConfigFetchHandler(this.firebaseInstallations, isPrimaryApp(this.firebaseApp) ? this.analyticsConnector : new com.google.firebase.inject.Provider() { // from class: com.google.firebase.remoteconfig.RemoteConfigComponent$$ExternalSyntheticLambda2
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.firebase.remoteconfig.RemoteConfigComponent.lambda$getFetchHandler$0();
            }
        }, this.executor, DEFAULT_CLOCK, DEFAULT_RANDOM, configCacheClient, getFrcBackendApiClient(this.firebaseApp.getOptions().getApiKey(), str, configSharedPrefsClient), configSharedPrefsClient, this.customHeaders);
    }

    synchronized com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler getRealtime(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, android.content.Context context, java.lang.String str, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient) {
        return new com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, configSharedPrefsClient, this.executor);
    }

    private com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler getGetHandler(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2) {
        return new com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler(this.executor, configCacheClient, configCacheClient2);
    }

    static com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient getSharedPrefsClient(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return new com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient(context.getSharedPreferences(java.lang.String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static com.google.firebase.remoteconfig.internal.Personalization getPersonalization(com.google.firebase.FirebaseApp firebaseApp, java.lang.String str, com.google.firebase.inject.Provider<com.google.firebase.analytics.connector.AnalyticsConnector> provider) {
        if (isPrimaryApp(firebaseApp) && str.equals(DEFAULT_NAMESPACE)) {
            return new com.google.firebase.remoteconfig.internal.Personalization(provider);
        }
        return null;
    }

    private com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler getRolloutsStateSubscriptionsHandler(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2) {
        return new com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler(configCacheClient, com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory.create(configCacheClient, configCacheClient2), this.executor);
    }

    private static boolean isAbtSupported(com.google.firebase.FirebaseApp firebaseApp, java.lang.String str) {
        return str.equals(DEFAULT_NAMESPACE) && isPrimaryApp(firebaseApp);
    }

    private static boolean isPrimaryApp(com.google.firebase.FirebaseApp firebaseApp) {
        return firebaseApp.getName().equals(com.google.firebase.FirebaseApp.DEFAULT_APP_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void notifyRCInstances(boolean z) {
        synchronized (com.google.firebase.remoteconfig.RemoteConfigComponent.class) {
            java.util.Iterator<com.google.firebase.remoteconfig.FirebaseRemoteConfig> it = frcNamespaceInstancesStatic.values().iterator();
            while (it.hasNext()) {
                it.next().setConfigUpdateBackgroundState(z);
            }
        }
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public void registerRolloutsStateSubscriber(java.lang.String str, com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber rolloutsStateSubscriber) {
        get(str).getRolloutsStateSubscriptionsHandler().registerRolloutsStateSubscriber(rolloutsStateSubscriber);
    }

    private static class GlobalBackgroundListener implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
        private static final java.util.concurrent.atomic.AtomicReference<com.google.firebase.remoteconfig.RemoteConfigComponent.GlobalBackgroundListener> INSTANCE = new java.util.concurrent.atomic.AtomicReference<>();

        private GlobalBackgroundListener() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureBackgroundListenerIsRegistered(android.content.Context context) {
            android.app.Application application = (android.app.Application) context.getApplicationContext();
            java.util.concurrent.atomic.AtomicReference<com.google.firebase.remoteconfig.RemoteConfigComponent.GlobalBackgroundListener> atomicReference = INSTANCE;
            if (atomicReference.get() == null) {
                com.google.firebase.remoteconfig.RemoteConfigComponent.GlobalBackgroundListener globalBackgroundListener = new com.google.firebase.remoteconfig.RemoteConfigComponent.GlobalBackgroundListener();
                if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, globalBackgroundListener)) {
                    com.google.android.gms.common.api.internal.BackgroundDetector.initialize(application);
                    com.google.android.gms.common.api.internal.BackgroundDetector.getInstance().addListener(globalBackgroundListener);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            com.google.firebase.remoteconfig.RemoteConfigComponent.notifyRCInstances(z);
        }
    }
}
