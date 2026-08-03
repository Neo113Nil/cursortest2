package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigRealtimeHandler {
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedCacheClient;
    private final com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler;
    private final com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient configRealtimeHttpClient;
    private final android.content.Context context;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final java.util.Set<com.google.firebase.remoteconfig.ConfigUpdateListener> listeners;
    private final java.lang.String namespace;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;
    private final com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient sharedPrefsClient;

    public ConfigRealtimeHandler(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.remoteconfig.internal.ConfigFetchHandler configFetchHandler, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, android.content.Context context, java.lang.String str, com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient configSharedPrefsClient, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        this.listeners = linkedHashSet;
        this.configRealtimeHttpClient = new com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, str, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCacheClient = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private synchronized void beginRealtime() {
        if (!this.listeners.isEmpty()) {
            this.configRealtimeHttpClient.startHttpConnection();
        }
    }

    public synchronized com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration addRealtimeConfigUpdateListener(com.google.firebase.remoteconfig.ConfigUpdateListener configUpdateListener) {
        this.listeners.add(configUpdateListener);
        beginRealtime();
        return new com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler.ConfigUpdateListenerRegistrationInternal(configUpdateListener);
    }

    public synchronized void setBackgroundState(boolean z) {
        this.configRealtimeHttpClient.setIsInBackground(z);
        if (!z) {
            beginRealtime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRealtimeConfigUpdateListener(com.google.firebase.remoteconfig.ConfigUpdateListener configUpdateListener) {
        this.listeners.remove(configUpdateListener);
    }

    public class ConfigUpdateListenerRegistrationInternal implements com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration {
        private final com.google.firebase.remoteconfig.ConfigUpdateListener listener;

        public ConfigUpdateListenerRegistrationInternal(com.google.firebase.remoteconfig.ConfigUpdateListener configUpdateListener) {
            this.listener = configUpdateListener;
        }

        @Override // com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration
        public void remove() {
            com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler.this.removeRealtimeConfigUpdateListener(this.listener);
        }
    }
}
