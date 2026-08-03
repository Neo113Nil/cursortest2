package com.helpshift.core;

/* loaded from: classes.dex */
public class HSContext {
    public static final java.lang.String CHAT_CACHE_SUBDIR = "webchat";
    public static final java.lang.String CHAT_CACHE_URLS_CONFIG_FILE_NAME = "chat_cacheURLs";
    public static final java.lang.String HC_CACHE_SUBDIR = "helpcenter";
    public static final java.lang.String HC_CACHE_URLS_CONFIG_FILE_NAME = "helpcenter_cacheURLs";
    private static final java.lang.String TAG = "HSContext";
    private static final java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.helpshift.HSActivityEventHandler>> hsActivityEventHandlers = new java.util.HashMap<>();
    public static java.util.concurrent.atomic.AtomicBoolean installCallSuccessful = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static com.helpshift.core.HSContext instance;
    private com.helpshift.analytics.HSAnalyticsEventDM analyticsEventDM;
    private com.helpshift.analytics.HSWebchatAnalyticsManager analyticsManager;
    private com.helpshift.storage.AssetStore assetStore;
    private com.helpshift.cache.HelpshiftResourceCacheManager chatResourceCacheManager;
    private com.helpshift.config.HSConfigManager configManager;
    public final android.content.Context context;
    private com.helpshift.poller.ConversationPoller conversationPoller;
    private com.helpshift.platform.Device device;
    private com.helpshift.storage.HSGenericDataManager genericDataManager;
    private com.helpshift.cache.HelpcenterCacheEvictionManager helpcenterCacheEvictionManager;
    private com.helpshift.cache.HelpshiftResourceCacheManager helpcenterResourceCacheManager;
    private com.helpshift.util.network.connectivity.HSConnectivityManager hsConnectivityManager;
    private com.helpshift.chat.HSEventProxy hsEventProxy;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;
    private com.helpshift.network.HTTPTransport httpTransport;
    private com.helpshift.proactive.InAppViewManager inAppViewManager;
    private boolean isAppInBackground = true;
    private boolean isClosingHSActivities;
    private boolean isSDKLoggingEnabled;
    private boolean isSdkOpen;
    private boolean isWebchatOpen;
    private boolean isWebchatOpenedFromHelpcenter;
    private com.helpshift.config.HSJSGenerator jsGenerator;
    private final com.helpshift.migrator.NativeToSdkxMigrator nativeToSdkxMigrator;
    private com.helpshift.notification.CoreNotificationManager notificationManager;
    private com.helpshift.notification.HelpshiftNotificationResourceCacheManager notificationResourceCacheManager;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private com.helpshift.notification.HSPushTokenManager pushTokenManager;
    private com.helpshift.notification.RequestUnreadMessageCountHandler requestUnreadMessageCountHandler;
    private com.helpshift.user.UserManager userManager;

    public static synchronized void initInstance(android.content.Context context) {
        synchronized (com.helpshift.core.HSContext.class) {
            if (instance == null) {
                instance = new com.helpshift.core.HSContext(context);
            }
        }
    }

    public static com.helpshift.core.HSContext getInstance() {
        return instance;
    }

    public HSContext(android.content.Context context) {
        this.context = context;
        com.helpshift.storage.HSPersistentStorage hSPersistentStorage = new com.helpshift.storage.HSPersistentStorage(new com.helpshift.storage.SharedPreferencesStore(context, com.helpshift.storage.HSPersistentStorage.FILE_NAME, 0));
        this.persistentStorage = hSPersistentStorage;
        this.hsThreadingService = new com.helpshift.concurrency.HSThreadingService(new com.helpshift.concurrency.HSWorkerThreader(java.util.concurrent.Executors.newFixedThreadPool(2)), new com.helpshift.concurrency.HSWorkerThreader(java.util.concurrent.Executors.newSingleThreadExecutor()), new com.helpshift.concurrency.HSUIThreader());
        this.nativeToSdkxMigrator = new com.helpshift.migrator.NativeToSdkxMigrator(context, hSPersistentStorage);
    }

    public void initialiseComponents(android.content.Context context) {
        com.helpshift.util.Utils.setScheduledExecutorService(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
        this.device = new com.helpshift.core.AndroidDevice(context, this.persistentStorage);
        this.inAppViewManager = new com.helpshift.proactive.InAppViewManager(this.persistentStorage);
        this.genericDataManager = new com.helpshift.storage.HSGenericDataManager(this.persistentStorage);
        this.httpTransport = new com.helpshift.network.HSHttpTransport();
        this.analyticsManager = new com.helpshift.analytics.HSWebchatAnalyticsManager(this.persistentStorage, this.device);
        com.helpshift.chat.HSEventProxy hSEventProxy = new com.helpshift.chat.HSEventProxy(this.hsThreadingService);
        this.hsEventProxy = hSEventProxy;
        this.pushTokenManager = new com.helpshift.notification.HSPushTokenManager(this.device, this.persistentStorage, this.hsThreadingService, hSEventProxy, this.httpTransport, this.genericDataManager);
        com.helpshift.user.UserManager userManager = new com.helpshift.user.UserManager(this.persistentStorage, this.pushTokenManager, this.genericDataManager, this.hsThreadingService, this.httpTransport, this.device, this.hsEventProxy, this.analyticsManager);
        this.userManager = userManager;
        com.helpshift.notification.HSNotificationManager hSNotificationManager = new com.helpshift.notification.HSNotificationManager(context, this.device, userManager, this.persistentStorage, this.hsThreadingService, this.inAppViewManager);
        this.notificationManager = hSNotificationManager;
        this.userManager.setNotificationEventsProxy(hSNotificationManager);
        com.helpshift.config.HSConfigManager hSConfigManager = new com.helpshift.config.HSConfigManager(this.persistentStorage, this.analyticsManager, this.device, this.userManager);
        this.configManager = hSConfigManager;
        this.notificationManager.setConfigManager(hSConfigManager);
        com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate = new com.helpshift.poller.FetchNotificationUpdate(this.device, this.persistentStorage, this.genericDataManager, this.userManager, this.notificationManager, this.httpTransport, this.hsEventProxy);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.helpshift.concurrency.HSThreadFactory("notif_poller"));
        com.helpshift.poller.ConversationPoller conversationPoller = new com.helpshift.poller.ConversationPoller(new com.helpshift.poller.PollerController(fetchNotificationUpdate, this.userManager, new com.helpshift.poller.ExponentialBackoff(5000, 60000), scheduledThreadPoolExecutor), this.userManager);
        this.conversationPoller = conversationPoller;
        this.userManager.setConversationPoller(conversationPoller);
        this.userManager.setIdentityDataSyncPoller(new com.helpshift.poller.SimplePoller(new com.helpshift.poller.PollFunction() { // from class: com.helpshift.core.HSContext$$ExternalSyntheticLambda0
            @Override // com.helpshift.poller.PollFunction
            public final boolean execute() {
                return com.helpshift.core.HSContext.this.m5652lambda$initialiseComponents$0$comhelpshiftcoreHSContext();
            }
        }, 30000L, "identityDataSyncPoller", new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.helpshift.concurrency.HSThreadFactory("usrmngr_datasync_poller"))));
        this.userManager.setFetchNotificationUpdateFunction(fetchNotificationUpdate);
        com.helpshift.analytics.HSAnalyticsEventDM hSAnalyticsEventDM = new com.helpshift.analytics.HSAnalyticsEventDM(this.device, this.userManager, this.persistentStorage, this.analyticsManager, this.hsThreadingService, this.httpTransport);
        this.analyticsEventDM = hSAnalyticsEventDM;
        this.notificationManager.setAnalyticsEventDM(hSAnalyticsEventDM);
        this.notificationManager.setResourceCacheManager(getNotificationResourceCacheManager());
        this.jsGenerator = new com.helpshift.config.HSJSGenerator(this.configManager);
        this.requestUnreadMessageCountHandler = new com.helpshift.notification.RequestUnreadMessageCountHandler(this.persistentStorage, fetchNotificationUpdate, this.userManager, this.hsEventProxy, this.hsThreadingService);
        this.assetStore = new com.helpshift.storage.AssetStore(this.device);
        this.hsConnectivityManager = new com.helpshift.util.network.connectivity.HSConnectivityManager();
    }

    /* renamed from: lambda$initialiseComponents$0$com-helpshift-core-HSContext, reason: not valid java name */
    /* synthetic */ boolean m5652lambda$initialiseComponents$0$comhelpshiftcoreHSContext() {
        return this.userManager.scheduleAttributeDataSyncPoller();
    }

    public com.helpshift.util.network.connectivity.HSConnectivityManager getHsConnectivityManager() {
        return this.hsConnectivityManager;
    }

    public com.helpshift.storage.AssetStore getAssetStore() {
        return this.assetStore;
    }

    public com.helpshift.migrator.NativeToSdkxMigrator getNativeToSdkxMigrator() {
        return this.nativeToSdkxMigrator;
    }

    public com.helpshift.notification.RequestUnreadMessageCountHandler getRequestUnreadMessageCountHandler() {
        return this.requestUnreadMessageCountHandler;
    }

    public com.helpshift.poller.ConversationPoller getConversationPoller() {
        return this.conversationPoller;
    }

    public com.helpshift.platform.Device getDevice() {
        return this.device;
    }

    public com.helpshift.user.UserManager getUserManager() {
        return this.userManager;
    }

    public com.helpshift.concurrency.HSThreadingService getHsThreadingService() {
        return this.hsThreadingService;
    }

    public com.helpshift.chat.HSEventProxy getHsEventProxy() {
        return this.hsEventProxy;
    }

    public com.helpshift.notification.HelpshiftNotificationResourceCacheManager getNotificationResourceCacheManager() {
        if (this.notificationResourceCacheManager == null) {
            this.notificationResourceCacheManager = new com.helpshift.notification.HelpshiftNotificationResourceCacheManager(new com.helpshift.network.HSDownloaderNetwork(new com.helpshift.network.URLConnectionProvider()), this.context.getCacheDir().getAbsolutePath(), this.hsThreadingService);
        }
        return this.notificationResourceCacheManager;
    }

    public com.helpshift.cache.HelpshiftResourceCacheManager getChatResourceCacheManager() {
        if (this.chatResourceCacheManager == null) {
            this.chatResourceCacheManager = getHelpshiftResourceCacheManager(new com.helpshift.storage.SharedPreferencesStore(this.context, com.helpshift.storage.HSPersistentStorage.CHAT_RESOURCE_CACHE_SHARED_PREF_NAME, 0), new com.helpshift.cache.ChatResourceEvictStrategy(), com.helpshift.util.SdkURLs.AWS_CACHE_URLS_CONFIG, CHAT_CACHE_URLS_CONFIG_FILE_NAME, CHAT_CACHE_SUBDIR);
        }
        return this.chatResourceCacheManager;
    }

    public com.helpshift.cache.HelpshiftResourceCacheManager getHelpcenterResourceCacheManager() {
        if (this.helpcenterResourceCacheManager == null) {
            this.helpcenterResourceCacheManager = getHelpshiftResourceCacheManager(new com.helpshift.storage.SharedPreferencesStore(this.context, com.helpshift.storage.HSPersistentStorage.HC_RESOURCE_CACHE_SHARED_PREF_NAME, 0), new com.helpshift.cache.HCResourceCacheEvictStrategy(), com.helpshift.util.SdkURLs.HC_CACHE_URLS_CONFIG, HC_CACHE_URLS_CONFIG_FILE_NAME, "helpcenter");
        }
        return this.helpcenterResourceCacheManager;
    }

    public com.helpshift.cache.HelpcenterCacheEvictionManager getHelpcenterCacheEvictionManager() {
        if (this.helpcenterCacheEvictionManager == null) {
            this.helpcenterCacheEvictionManager = new com.helpshift.cache.HelpcenterCacheEvictionManager(this.persistentStorage, this.context.getCacheDir().getAbsolutePath(), "helpcenter");
        }
        return this.helpcenterCacheEvictionManager;
    }

    private com.helpshift.cache.HelpshiftResourceCacheManager getHelpshiftResourceCacheManager(com.helpshift.storage.SharedPreferencesStore sharedPreferencesStore, com.helpshift.cache.ResourceCacheEvictStrategy resourceCacheEvictStrategy, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new com.helpshift.cache.HelpshiftResourceCacheManager(sharedPreferencesStore, new com.helpshift.network.HSDownloaderNetwork(new com.helpshift.network.URLConnectionProvider()), resourceCacheEvictStrategy, this.context.getCacheDir().getAbsolutePath(), str, str2, str3);
    }

    public void sendMigrationFailureLogs() {
        new com.helpshift.migrator.MigrationFailureLogProvider(new com.helpshift.storage.SharedPreferencesStore(this.context, com.helpshift.migrator.MigratorSharedPrefConstants.MIGRATION_SHARED_PREF, 0), this.httpTransport, this.persistentStorage, this.device, this.hsThreadingService).sendMigrationFailureLogs();
    }

    public com.helpshift.config.HSConfigManager getConfigManager() {
        return this.configManager;
    }

    public com.helpshift.notification.HSPushTokenManager getPushTokenManager() {
        return this.pushTokenManager;
    }

    public com.helpshift.notification.CoreNotificationManager getNotificationManager() {
        return this.notificationManager;
    }

    public com.helpshift.proactive.InAppViewManager getInAppViewManager() {
        return this.inAppViewManager;
    }

    public com.helpshift.analytics.HSWebchatAnalyticsManager getWebchatAnalyticsManager() {
        return this.analyticsManager;
    }

    public com.helpshift.analytics.HSAnalyticsEventDM getAnalyticsEventDM() {
        return this.analyticsEventDM;
    }

    public com.helpshift.storage.HSGenericDataManager getGenericDataManager() {
        return this.genericDataManager;
    }

    public com.helpshift.storage.HSPersistentStorage getPersistentStorage() {
        return this.persistentStorage;
    }

    public com.helpshift.config.HSJSGenerator getJsGenerator() {
        return this.jsGenerator;
    }

    public void setWebchatUIIsOpen(boolean z) {
        this.isWebchatOpen = z;
    }

    public boolean isWebchatUIOpen() {
        return this.isWebchatOpen;
    }

    public void setSdkIsOpen(boolean z) {
        this.isSdkOpen = z;
    }

    public boolean isSdkOpen() {
        return this.isSdkOpen;
    }

    public boolean isIsWebchatOpenedFromHelpcenter() {
        return this.isWebchatOpenedFromHelpcenter;
    }

    public void setIsWebchatOpenedFromHelpcenter(boolean z) {
        this.isWebchatOpenedFromHelpcenter = z;
    }

    public void setSDKLoggingEnabled(boolean z) {
        this.isSDKLoggingEnabled = z;
    }

    public boolean isSDKLoggingEnabled() {
        return this.isSDKLoggingEnabled;
    }

    public static boolean verifyInstall() {
        if (installCallSuccessful.get()) {
            return true;
        }
        android.util.Log.e(TAG, "Helpshift install() is not called or has failed. Not logging errors since the app is not in DEBUG build.");
        return false;
    }

    public void setHSActivityHandler(java.lang.Integer num, com.helpshift.HSActivityEventHandler hSActivityEventHandler) {
        java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.helpshift.HSActivityEventHandler>> hashMap = hsActivityEventHandlers;
        if (hashMap.containsKey(num)) {
            return;
        }
        hashMap.put(num, new java.lang.ref.WeakReference<>(hSActivityEventHandler));
    }

    public void clearHSActivityHandler(java.lang.Integer num) {
        if (this.isClosingHSActivities) {
            return;
        }
        hsActivityEventHandlers.remove(num);
    }

    public void closeHSActivities() {
        this.isClosingHSActivities = true;
        java.util.Iterator<java.util.Map.Entry<java.lang.Integer, java.lang.ref.WeakReference<com.helpshift.HSActivityEventHandler>>> it = hsActivityEventHandlers.entrySet().iterator();
        while (it.hasNext()) {
            com.helpshift.HSActivityEventHandler hSActivityEventHandler = it.next().getValue().get();
            if (hSActivityEventHandler != null) {
                hSActivityEventHandler.closeActivity();
            }
        }
        hsActivityEventHandlers.clear();
        this.isClosingHSActivities = false;
    }

    public void setAppBackgroundStatus(boolean z) {
        this.isAppInBackground = z;
    }

    public boolean isAppInBackground() {
        return this.isAppInBackground;
    }
}
