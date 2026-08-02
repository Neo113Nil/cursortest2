package com.google.firebase.messaging;

/* loaded from: classes4.dex */
public class FirebaseMessaging {
    private static final java.lang.String EXTRA_DUMMY_P_INTENT = "app";
    static final java.lang.String GMS_PACKAGE = "com.google.android.gms";

    @java.lang.Deprecated
    public static final java.lang.String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final java.lang.String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final java.lang.String SUBTYPE_DEFAULT = "";
    static final java.lang.String TAG = "FirebaseMessaging";
    private static com.google.firebase.messaging.Store store;
    static java.util.concurrent.ScheduledExecutorService syncExecutor;
    private final com.google.firebase.messaging.FirebaseMessaging.AutoInit autoInit;
    private final android.content.Context context;
    private final java.util.concurrent.Executor fileExecutor;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.messaging.GmsRpc gmsRpc;
    private final com.google.firebase.iid.internal.FirebaseInstanceIdInternal iid;
    private final java.util.concurrent.Executor initExecutor;
    private final android.app.Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final com.google.firebase.messaging.Metadata metadata;
    private final com.google.firebase.messaging.RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final com.google.android.gms.tasks.Task<com.google.firebase.messaging.TopicsSubscriber> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
    static com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> transportFactory = new com.google.firebase.inject.Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda8
        @Override // com.google.firebase.inject.Provider
        public final java.lang.Object get() {
            return com.google.firebase.messaging.FirebaseMessaging.lambda$static$0();
        }
    };

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    static /* synthetic */ com.google.android.datatransport.TransportFactory lambda$static$0() {
        return null;
    }

    public static com.google.firebase.messaging.FirebaseMessaging getInstance() {
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            firebaseMessaging = getInstance(com.google.firebase.FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    private static com.google.firebase.messaging.Store getStore(android.content.Context context) {
        com.google.firebase.messaging.Store store2;
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            if (store == null) {
                store = new com.google.firebase.messaging.Store(context);
            }
            store2 = store;
        }
        return store2;
    }

    static void clearStoreForTest() {
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            store = null;
        }
    }

    static com.google.firebase.messaging.FirebaseMessaging getInstance(com.google.firebase.FirebaseApp firebaseApp) {
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging;
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            firebaseMessaging = (com.google.firebase.messaging.FirebaseMessaging) firebaseApp.get(com.google.firebase.messaging.FirebaseMessaging.class);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider3, com.google.firebase.events.Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new com.google.firebase.messaging.Metadata(firebaseApp.getApplicationContext()));
    }

    FirebaseMessaging(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> provider, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> provider2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider3, com.google.firebase.events.Subscriber subscriber, com.google.firebase.messaging.Metadata metadata) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, metadata, new com.google.firebase.messaging.GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi), com.google.firebase.messaging.FcmExecutors.newTaskExecutor(), com.google.firebase.messaging.FcmExecutors.newInitExecutor(), com.google.firebase.messaging.FcmExecutors.newFileIOExecutor());
    }

    FirebaseMessaging(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal, com.google.firebase.inject.Provider<com.google.android.datatransport.TransportFactory> provider, com.google.firebase.events.Subscriber subscriber, com.google.firebase.messaging.Metadata metadata, com.google.firebase.messaging.GmsRpc gmsRpc, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = provider;
        this.firebaseApp = firebaseApp;
        this.iid = firebaseInstanceIdInternal;
        this.autoInit = new com.google.firebase.messaging.FirebaseMessaging.AutoInit(subscriber);
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        this.context = applicationContext;
        com.google.firebase.messaging.FcmLifecycleCallbacks fcmLifecycleCallbacks = new com.google.firebase.messaging.FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new com.google.firebase.messaging.RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        android.content.Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof android.app.Application) {
            ((android.app.Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda3
                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(java.lang.String str) {
                    com.google.firebase.messaging.FirebaseMessaging.this.m10453lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str);
                }
            });
        }
        executor2.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.FirebaseMessaging.this.m10454lambda$new$2$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
        com.google.android.gms.tasks.Task<com.google.firebase.messaging.TopicsSubscriber> createInstance = com.google.firebase.messaging.TopicsSubscriber.createInstance(this, metadata, gmsRpc, applicationContext, com.google.firebase.messaging.FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = createInstance;
        createInstance.addOnSuccessListener(executor2, new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.firebase.messaging.FirebaseMessaging.this.m10455lambda$new$3$comgooglefirebasemessagingFirebaseMessaging((com.google.firebase.messaging.TopicsSubscriber) obj);
            }
        });
        executor2.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.FirebaseMessaging.this.m10456lambda$new$4$comgooglefirebasemessagingFirebaseMessaging();
            }
        });
    }

    /* renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10454lambda$new$2$comgooglefirebasemessagingFirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* renamed from: lambda$new$3$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10455lambda$new$3$comgooglefirebasemessagingFirebaseMessaging(com.google.firebase.messaging.TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void m10456lambda$new$4$comgooglefirebasemessagingFirebaseMessaging() {
        com.google.firebase.messaging.ProxyNotificationInitializer.initialize(this.context);
        com.google.firebase.messaging.ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    private boolean shouldRetainProxyNotifications() {
        com.google.firebase.messaging.ProxyNotificationInitializer.initialize(this.context);
        if (!com.google.firebase.messaging.ProxyNotificationInitializer.isProxyNotificationEnabled(this.context)) {
            return false;
        }
        if (this.firebaseApp.get(com.google.firebase.analytics.connector.AnalyticsConnector.class) != null) {
            return true;
        }
        return com.google.firebase.messaging.MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled() && transportFactory != null;
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.getProxyNotificationData().addOnSuccessListener(this.initExecutor, new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda12
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.firebase.messaging.FirebaseMessaging.this.m10452x8ede5a30((com.google.android.gms.cloudmessaging.CloudMessage) obj);
            }
        });
    }

    /* renamed from: lambda$handleProxiedNotificationData$5$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10452x8ede5a30(com.google.android.gms.cloudmessaging.CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            com.google.firebase.messaging.MessagingAnalytics.logNotificationReceived(cloudMessage.getIntent());
            handleProxiedNotificationData();
        }
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.setEnabled(z);
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return com.google.firebase.messaging.MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        com.google.firebase.messaging.MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
        com.google.firebase.messaging.ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public boolean isNotificationDelegationEnabled() {
        return com.google.firebase.messaging.ProxyNotificationInitializer.isProxyNotificationEnabled(this.context);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setNotificationDelegationEnabled(boolean z) {
        return com.google.firebase.messaging.ProxyNotificationInitializer.setEnableProxyNotification(this.initExecutor, this.context, z).addOnSuccessListener(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.OnSuccessListener() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(java.lang.Object obj) {
                com.google.firebase.messaging.FirebaseMessaging.this.m10457x6495830d((java.lang.Void) obj);
            }
        });
    }

    /* renamed from: lambda$setNotificationDelegationEnabled$6$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10457x6495830d(java.lang.Void r3) {
        com.google.firebase.messaging.ProxyNotificationPreferences.setProxyRetention(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    public com.google.android.gms.tasks.Task<java.lang.String> getToken() {
        com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.initExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.FirebaseMessaging.this.m10451x6a533e85(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: lambda$getToken$7$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10451x6a533e85(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (java.lang.Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> deleteToken() {
        if (this.iid != null) {
            final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            this.initExecutor.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.firebase.messaging.FirebaseMessaging.this.m10449xd5738b77(taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (getTokenWithoutTriggeringSync() == null) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2 = new com.google.android.gms.tasks.TaskCompletionSource();
        com.google.firebase.messaging.FcmExecutors.newNetworkIOExecutor().execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.FirebaseMessaging.this.m10450xd4fd2578(taskCompletionSource2);
            }
        });
        return taskCompletionSource2.getTask();
    }

    /* renamed from: lambda$deleteToken$8$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10449xd5738b77(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            this.iid.deleteToken(com.google.firebase.messaging.Metadata.getDefaultSenderId(this.firebaseApp), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (java.lang.Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: lambda$deleteToken$9$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ void m10450xd4fd2578(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            com.google.android.gms.tasks.Tasks.await(this.gmsRpc.deleteToken());
            getStore(this.context).deleteToken(getSubtype(), com.google.firebase.messaging.Metadata.getDefaultSenderId(this.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (java.lang.Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> subscribeToTopic(final java.lang.String str) {
        return this.topicsSubscriberTask.onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.android.gms.tasks.Task subscribeToTopic;
                subscribeToTopic = ((com.google.firebase.messaging.TopicsSubscriber) obj).subscribeToTopic(str);
                return subscribeToTopic;
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> unsubscribeFromTopic(final java.lang.String str) {
        return this.topicsSubscriberTask.onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda13
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                com.google.android.gms.tasks.Task unsubscribeFromTopic;
                unsubscribeFromTopic = ((com.google.firebase.messaging.TopicsSubscriber) obj).unsubscribeFromTopic(str);
                return unsubscribeFromTopic;
            }
        });
    }

    @java.lang.Deprecated
    public void send(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        if (android.text.TextUtils.isEmpty(remoteMessage.getTo())) {
            throw new java.lang.IllegalArgumentException("Missing 'to'");
        }
        android.content.Intent intent = new android.content.Intent(SEND_INTENT_ACTION);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra("app", android.app.PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        remoteMessage.populateSendMessageIntent(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    com.google.android.gms.tasks.Task<com.google.firebase.messaging.TopicsSubscriber> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public static com.google.android.datatransport.TransportFactory getTransportFactory() {
        return transportFactory.get();
    }

    static void clearTransportFactoryForTest() {
        transportFactory = new com.google.firebase.inject.Provider() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda7
            @Override // com.google.firebase.inject.Provider
            public final java.lang.Object get() {
                return com.google.firebase.messaging.FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            }
        };
    }

    boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    android.content.Context getApplicationContext() {
        return this.context;
    }

    void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    void syncWithDelaySecondsInternal(long j) {
        synchronized (this) {
            enqueueTaskWithDelaySeconds(new com.google.firebase.messaging.SyncTask(this, java.lang.Math.min(java.lang.Math.max(30L, 2 * j), MAX_DELAY_SEC)), j);
            this.syncScheduledOrRunning = true;
        }
    }

    void enqueueTaskWithDelaySeconds(java.lang.Runnable runnable, long j) {
        synchronized (com.google.firebase.messaging.FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, java.util.concurrent.TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    private void startSync() {
        synchronized (this) {
            if (!this.syncScheduledOrRunning) {
                syncWithDelaySecondsInternal(0L);
            }
        }
    }

    com.google.firebase.messaging.Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), com.google.firebase.messaging.Metadata.getDefaultSenderId(this.firebaseApp));
    }

    java.lang.String blockingGetToken() throws java.io.IOException {
        com.google.firebase.iid.internal.FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (java.lang.String) com.google.android.gms.tasks.Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                throw new java.io.IOException(e);
            }
        }
        final com.google.firebase.messaging.Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.token;
        }
        final java.lang.String defaultSenderId = com.google.firebase.messaging.Metadata.getDefaultSenderId(this.firebaseApp);
        try {
            return (java.lang.String) com.google.android.gms.tasks.Tasks.await(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda14
                @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
                public final com.google.android.gms.tasks.Task start() {
                    return com.google.firebase.messaging.FirebaseMessaging.this.m10448xb7d2b1c4(defaultSenderId, tokenWithoutTriggeringSync);
                }
            }));
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
            throw new java.io.IOException(e2);
        }
    }

    /* renamed from: lambda$blockingGetToken$14$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m10448xb7d2b1c4(final java.lang.String str, final com.google.firebase.messaging.Store.Token token) {
        return this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.firebase.messaging.FirebaseMessaging$$ExternalSyntheticLambda9
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.firebase.messaging.FirebaseMessaging.this.m10447xb84917c3(str, token, (java.lang.String) obj);
            }
        });
    }

    /* renamed from: lambda$blockingGetToken$13$com-google-firebase-messaging-FirebaseMessaging, reason: not valid java name */
    /* synthetic */ com.google.android.gms.tasks.Task m10447xb84917c3(java.lang.String str, com.google.firebase.messaging.Store.Token token, java.lang.String str2) throws java.lang.Exception {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            m10453lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(str2);
        }
        return com.google.android.gms.tasks.Tasks.forResult(str2);
    }

    private java.lang.String getSubtype() {
        if (com.google.firebase.FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            return "";
        }
        return this.firebaseApp.getPersistenceKey();
    }

    boolean tokenNeedsRefresh(com.google.firebase.messaging.Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void m10453lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(java.lang.String str) {
        if (com.google.firebase.FirebaseApp.DEFAULT_APP_NAME.equals(this.firebaseApp.getName())) {
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                this.firebaseApp.getName();
            }
            android.content.Intent intent = new android.content.Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, str);
            new com.google.firebase.messaging.FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    /* loaded from: classes9.dex */
    class AutoInit {
        private static final java.lang.String AUTO_INIT_PREF = "auto_init";
        private static final java.lang.String FCM_PREFERENCES = "com.google.firebase.messaging";
        private static final java.lang.String MANIFEST_METADATA_AUTO_INIT_ENABLED = "firebase_messaging_auto_init_enabled";
        private java.lang.Boolean autoInitEnabled;
        private com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final com.google.firebase.events.Subscriber subscriber;

        AutoInit(com.google.firebase.events.Subscriber subscriber) {
            this.subscriber = subscriber;
        }

        void initialize() {
            synchronized (this) {
                if (this.initialized) {
                    return;
                }
                java.lang.Boolean readEnabled = readEnabled();
                this.autoInitEnabled = readEnabled;
                if (readEnabled == null) {
                    com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> eventHandler = new com.google.firebase.events.EventHandler() { // from class: com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0
                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(com.google.firebase.events.Event event) {
                            com.google.firebase.messaging.FirebaseMessaging.AutoInit.this.m10458x1061f0b8(event);
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = eventHandler;
                    this.subscriber.subscribe(com.google.firebase.DataCollectionDefaultChange.class, eventHandler);
                }
                this.initialized = true;
            }
        }

        /* renamed from: lambda$initialize$0$com-google-firebase-messaging-FirebaseMessaging$AutoInit, reason: not valid java name */
        /* synthetic */ void m10458x1061f0b8(com.google.firebase.events.Event event) {
            if (isEnabled()) {
                com.google.firebase.messaging.FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        boolean isEnabled() {
            boolean isDataCollectionDefaultEnabled;
            synchronized (this) {
                initialize();
                java.lang.Boolean bool = this.autoInitEnabled;
                if (bool == null) {
                    isDataCollectionDefaultEnabled = com.google.firebase.messaging.FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
                } else {
                    isDataCollectionDefaultEnabled = bool.booleanValue();
                }
            }
            return isDataCollectionDefaultEnabled;
        }

        void setEnabled(boolean z) {
            synchronized (this) {
                initialize();
                com.google.firebase.events.EventHandler<com.google.firebase.DataCollectionDefaultChange> eventHandler = this.dataCollectionDefaultChangeEventHandler;
                if (eventHandler != null) {
                    this.subscriber.unsubscribe(com.google.firebase.DataCollectionDefaultChange.class, eventHandler);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                android.content.SharedPreferences.Editor edit = com.google.firebase.messaging.FirebaseMessaging.this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean(AUTO_INIT_PREF, z);
                edit.apply();
                if (z) {
                    com.google.firebase.messaging.FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.autoInitEnabled = java.lang.Boolean.valueOf(z);
            }
        }

        private java.lang.Boolean readEnabled() {
            android.content.pm.ApplicationInfo applicationInfo;
            android.content.Context applicationContext = com.google.firebase.messaging.FirebaseMessaging.this.firebaseApp.getApplicationContext();
            android.content.SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(AUTO_INIT_PREF)) {
                return java.lang.Boolean.valueOf(sharedPreferences.getBoolean(AUTO_INIT_PREF, false));
            }
            try {
                android.content.pm.PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(MANIFEST_METADATA_AUTO_INIT_ENABLED)) {
                    return null;
                }
                return java.lang.Boolean.valueOf(applicationInfo.metaData.getBoolean(MANIFEST_METADATA_AUTO_INIT_ENABLED));
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
