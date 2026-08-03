package com.helpshift;

/* loaded from: classes4.dex */
public class Helpshift {
    private static final java.lang.String TAG = "Helpshift";
    private static com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector proactiveLocalConfigCollector;

    private Helpshift() {
    }

    public static void setHelpshiftEventsListener(final com.helpshift.HelpshiftEventsListener helpshiftEventsListener) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            com.helpshift.log.HSLogger.d(TAG, "setHelpshiftEventsListener() is called: " + helpshiftEventsListener);
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda18
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getHsEventProxy().setHelpshiftEventsListener(helpshiftEventsListener);
                }
            });
        }
    }

    public static void setHelpshiftProactiveConfigCollector(final com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "setHelpshiftProactiveConfigCollector() is called.");
            com.helpshift.core.HSContext.getInstance().getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.Helpshift.lambda$setHelpshiftProactiveConfigCollector$1(com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector.this);
                }
            });
        }
    }

    static /* synthetic */ void lambda$setHelpshiftProactiveConfigCollector$1(com.helpshift.proactive.HelpshiftProactiveAPIConfigCollector helpshiftProactiveAPIConfigCollector) {
        proactiveLocalConfigCollector = helpshiftProactiveAPIConfigCollector;
        com.helpshift.proactive.ProactiveActionHandler.configCollector = helpshiftProactiveAPIConfigCollector;
    }

    public static synchronized void install(final android.app.Application application, java.lang.String str, java.lang.String str2, final java.util.Map<java.lang.String, java.lang.Object> map) throws com.helpshift.HelpshiftInstallException, com.helpshift.UnsupportedOSVersionException {
        synchronized (com.helpshift.Helpshift.class) {
            if (android.os.Build.VERSION.SDK_INT < 24) {
                throw new com.helpshift.UnsupportedOSVersionException("Android OS below Nougat version (API level 24) are not supported");
            }
            if (com.helpshift.core.HSContext.installCallSuccessful.get()) {
                com.helpshift.log.HSLogger.d(TAG, "Helpshift is already initialized !");
                return;
            }
            com.helpshift.util.SchemaUtil.validateInstallCredentials(str2, str);
            final boolean isApplicationInDebugMode = com.helpshift.util.ApplicationUtil.isApplicationInDebugMode(application);
            com.helpshift.log.HSPreInstallLogger.initLogger(new com.helpshift.log.PreInstallLogger(isApplicationInDebugMode));
            final java.lang.String trim = str2.trim();
            final java.lang.String trim2 = str.trim();
            final java.util.Map<java.lang.String, java.lang.Object> sanitizeConfig = com.helpshift.HSInstallHelper.sanitizeConfig(map);
            java.lang.Object obj = sanitizeConfig.get("isForChina");
            if ((obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue()) {
                com.helpshift.util.SdkURLs.updateHosts("webchat.hsftcn.cn", "media.hsftcn.cn");
            }
            com.helpshift.HSInstallCredsChangeManager.changeInstallCredentials(trim2, trim, new com.helpshift.storage.SharedPreferencesStore(application, com.helpshift.HSInstallCredsChangeManager.HS_CREDS_PREFS_FILE_NAME, 0), new com.helpshift.storage.SharedPreferencesStore(application, com.helpshift.storage.HSPersistentStorage.FILE_NAME, 0), new com.helpshift.storage.SharedPreferencesStore(application, com.helpshift.storage.HSPersistentStorage.CHAT_RESOURCE_CACHE_SHARED_PREF_NAME, 0), new com.helpshift.storage.SharedPreferencesStore(application, com.helpshift.storage.HSPersistentStorage.HC_RESOURCE_CACHE_SHARED_PREF_NAME, 0), application.getCacheDir(), application.getFilesDir());
            com.helpshift.core.HSContext.initInstance(application);
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSync(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.Helpshift.lambda$install$2(com.helpshift.core.HSContext.this, application, sanitizeConfig);
                }
            });
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.Helpshift.lambda$install$3(com.helpshift.core.HSContext.this, trim2, trim, sanitizeConfig, isApplicationInDebugMode, application, map);
                }
            });
            com.helpshift.core.HSContext.installCallSuccessful.compareAndSet(false, true);
        }
    }

    static /* synthetic */ void lambda$install$2(com.helpshift.core.HSContext hSContext, android.app.Application application, java.util.Map map) {
        hSContext.getNativeToSdkxMigrator().migrate();
        hSContext.initialiseComponents(application);
        setupLifecycleListeners(application, map, hSContext);
    }

    static /* synthetic */ void lambda$install$3(com.helpshift.core.HSContext hSContext, java.lang.String str, java.lang.String str2, java.util.Map map, boolean z, android.app.Application application, java.util.Map map2) {
        hSContext.getConfigManager().saveInstallKeys(str, str2);
        java.lang.Object obj = map.get(com.helpshift.util.ConfigValues.ENABLE_LOGGING);
        boolean z2 = true;
        boolean z3 = (obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue();
        boolean enableLoggingViaWebchat = !z3 ? hSContext.getPersistentStorage().getEnableLoggingViaWebchat() : false;
        if (!z3 && !enableLoggingViaWebchat) {
            z2 = false;
        }
        hSContext.setSDKLoggingEnabled(z2);
        com.helpshift.log.InternalHelpshiftLogger internalHelpshiftLogger = new com.helpshift.log.InternalHelpshiftLogger(z2);
        if (z && z2) {
            internalHelpshiftLogger.setLogCollector(new com.helpshift.log.LogCollector(application.getFilesDir(), com.helpshift.log.LogCollector.getLogFileName(), android.os.Looper.getMainLooper().getThread().getId(), java.util.concurrent.Executors.newSingleThreadExecutor(), z));
            com.helpshift.exception.HSUncaughtExceptionHandler.init();
            hSContext.getNotificationManager().showDebugLogNotification();
        }
        com.helpshift.log.HSLogger.initLogger(internalHelpshiftLogger);
        com.helpshift.log.HSLogger.d(TAG, "Install called: Domain : " + str2 + ", Config: " + map2 + " SDK X Version: " + hSContext.getDevice().getSDKVersion());
        com.helpshift.HSInstallHelper.setNotificationConfigValues(hSContext.getDevice(), hSContext.getNotificationManager(), map);
        hSContext.getWebchatAnalyticsManager().setAnalyticsEventsData(map);
        com.helpshift.HSInstallHelper.setEnableInAppNotification(map, hSContext.getPersistentStorage());
        com.helpshift.HSInstallHelper.setScreenOrientation(map, hSContext.getPersistentStorage(), -1);
        hSContext.getHelpcenterCacheEvictionManager().deleteOlderHelpcenterCachedFiles();
        hSContext.getNotificationResourceCacheManager().deleteOlderCachedFiles();
        hSContext.getUserManager().generateAndSaveAnonymousUserIdIfNeeded();
        if (com.helpshift.HSPluginEventBridge.shouldCallFirstForegroundEvent()) {
            com.helpshift.lifecycle.HSAppLifeCycleController.getInstance().onAppForeground();
        }
        setupInAppNotificationLifecycleTracker(application, hSContext);
        storeSdkVersion(hSContext);
    }

    private static void storeSdkVersion(com.helpshift.core.HSContext hSContext) {
        com.helpshift.storage.HSPersistentStorage persistentStorage = hSContext.getPersistentStorage();
        java.lang.String sdkVersion = persistentStorage.getSdkVersion();
        java.lang.String sDKVersion = hSContext.getDevice().getSDKVersion();
        if (com.helpshift.util.Utils.isEmpty(sdkVersion) || !sdkVersion.equals(sDKVersion)) {
            persistentStorage.setSdkVersion(sDKVersion);
        }
    }

    private static void setupInAppNotificationLifecycleTracker(android.app.Application application, com.helpshift.core.HSContext hSContext) {
        new com.helpshift.proactive.ProactiveInAppLifecycleTracker(new com.helpshift.proactive.ProactiveInAppEventHandler(hSContext.getNotificationManager(), hSContext.getInAppViewManager(), hSContext.getHsThreadingService()), hSContext.getHsConnectivityManager()).registerActivityCallback(application);
    }

    private static void setupLifecycleListeners(android.app.Application application, java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.core.HSContext hSContext) {
        java.lang.Object obj = map.get(com.helpshift.util.ConfigValues.MANUAL_LIFECYCLE_TRACKING);
        com.helpshift.lifecycle.HSAppLifeCycleController.getInstance().init(application, (obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue(), new com.helpshift.lifecycle.HSAppLifeCycleEventsHandler(hSContext));
    }

    public static java.lang.String getSDKVersion() {
        return com.helpshift.core.AndroidDevice.LITE_SDK_VERSION;
    }

    public static void handleProactiveLink(final java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !com.helpshift.core.HSContext.verifyInstall()) {
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "handleProactiveLink is called with: " + str);
        final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getHsThreadingService().runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.Helpshift.lambda$handleProactiveLink$4(str, hSContext);
            }
        });
    }

    static /* synthetic */ void lambda$handleProactiveLink$4(java.lang.String str, com.helpshift.core.HSContext hSContext) {
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            if (!"helpshift.com".equals(parse.getHost())) {
                com.helpshift.log.HSLogger.e(TAG, "Incorrect host for proactive link, skipping!");
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(parse.getQueryParameter("payload"), 0)));
            java.lang.String optString = jSONObject.optString("action");
            if (com.helpshift.util.Utils.isEmpty(optString)) {
                com.helpshift.log.HSLogger.e(TAG, "No action found in proactive link, skipping!");
                return;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("chatConfig");
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject(com.adjust.sdk.Constants.REFERRER_API_META);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            if (!"chat".equals(optString)) {
                jSONObject2 = jSONObject.optJSONObject("hcConfig");
            }
            java.util.Map<java.lang.String, java.lang.Object> proactiveLocalConfig = com.helpshift.internal.HelpshiftAPIInternalHandler.getProactiveLocalConfig(proactiveLocalConfigCollector);
            saveLocalConfig(proactiveLocalConfig);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject(proactiveLocalConfig);
            boolean isEmpty = com.helpshift.util.JsonUtils.isEmpty(optJSONObject);
            com.helpshift.log.HSLogger.d(TAG, "Is proactive config empty? " + isEmpty);
            if (!isEmpty) {
                jSONObject3 = com.helpshift.proactive.ProactiveConfigMerge.mergeProactiveConfig(jSONObject3, optJSONObject);
            }
            if (!com.helpshift.util.JsonUtils.isEmpty(optJSONObject2)) {
                jSONObject3.put("outboundSupportMeta", optJSONObject2);
            }
            java.util.Map<java.lang.String, java.lang.Object> parseConfigDictionary = com.helpshift.util.JsonUtils.parseConfigDictionary(jSONObject3.toString());
            android.content.Context context = hSContext.context;
            com.helpshift.log.HSLogger.d(TAG, "Starting SDK with proactive support action : " + optString);
            processProactiveAction(context, optString, jSONObject2, parseConfigDictionary);
        } catch (java.lang.Exception unused) {
            com.helpshift.log.HSLogger.e(TAG, "Error handling proactive link : " + str);
        }
    }

    private static void processProactiveAction(android.content.Context context, java.lang.String str, org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.Object> map) {
        com.helpshift.log.HSLogger.d(TAG, "Starting SDK with proactive support action: " + str);
        str.hashCode();
        switch (str) {
            case "hc-app":
                com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQsInternal(context, map, true);
                break;
            case "hc-faq":
                if (!com.helpshift.util.JsonUtils.isEmpty(jSONObject)) {
                    com.helpshift.internal.HelpshiftAPIInternalHandler.showSingleFAQInternal(context, jSONObject.optString("faqId", ""), map, true);
                    break;
                }
                break;
            case "chat":
                com.helpshift.internal.HelpshiftAPIInternalHandler.showConversationInternal(context, map, true);
                break;
            case "hc-section":
                if (!com.helpshift.util.JsonUtils.isEmpty(jSONObject)) {
                    com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQSectionInternal(context, jSONObject.optString("faqSectionId", ""), map, true);
                    break;
                }
                break;
        }
    }

    public static void showConversation(android.app.Activity activity, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.util.HSTimer.setStartTime("api");
            com.helpshift.internal.HelpshiftAPIInternalHandler.showConversationInternal(activity, map, false);
        }
    }

    public static void showFAQs(android.app.Activity activity, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQsInternal(activity, map, false);
        }
    }

    public static void showFAQSection(android.app.Activity activity, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.internal.HelpshiftAPIInternalHandler.showFAQSectionInternal(activity, str, map, false);
        }
    }

    public static void showSingleFAQ(android.app.Activity activity, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.internal.HelpshiftAPIInternalHandler.showSingleFAQInternal(activity, str, map, false);
        }
    }

    public static void leaveBreadCrumb(final java.lang.String str) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "leaveBreadCrumb() is called with action: " + str);
            if (com.helpshift.util.Utils.isEmpty(str)) {
                return;
            }
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getConfigManager().pushBreadCrumb(str);
                }
            });
        }
    }

    public static void clearBreadCrumbs() {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "Clearing Breadcrumbs");
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getConfigManager().clearBreadCrumbs();
                }
            });
        }
    }

    private static void saveLocalConfig(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        com.helpshift.core.HSContext.getInstance().getConfigManager().saveLocalProactiveConfig(map);
    }

    public static void loginWithIdentity(final java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, final com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            final java.util.HashMap hashMap = new java.util.HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            com.helpshift.log.HSLogger.d(TAG, "Logging in the User with identity: " + str + " , loginConfig " + hashMap);
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().loginWithIdentity(str, hashMap, helpshiftUserLoginEventsListener);
                }
            });
        }
    }

    public static void addUserIdentities(final java.lang.String str) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            com.helpshift.log.HSLogger.d(TAG, "addUserIdentities() is called with " + str);
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().addUserIdentities(str);
                }
            });
        }
    }

    public static void updateMasterAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            final java.util.HashMap hashMap = new java.util.HashMap();
            if (com.helpshift.util.Utils.isNotEmpty(map)) {
                hashMap.putAll(com.helpshift.util.Utils.getDeepCopy(map));
            }
            com.helpshift.log.HSLogger.d(TAG, "updateMasterAttributes() is called with " + hashMap);
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().updateMasterAttributes(hashMap);
                }
            });
        }
    }

    public static void updateAppAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            final java.util.HashMap hashMap = new java.util.HashMap();
            if (com.helpshift.util.Utils.isNotEmpty(map)) {
                hashMap.putAll(com.helpshift.util.Utils.getDeepCopy(map));
            }
            com.helpshift.log.HSLogger.d(TAG, "updateAppAttributes() is called with " + hashMap);
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().updateAppAttributes(hashMap);
                }
            });
        }
    }

    public static boolean login(java.util.Map<java.lang.String, java.lang.String> map) {
        if (com.helpshift.util.Utils.isEmpty(map) || !com.helpshift.core.HSContext.verifyInstall()) {
            return false;
        }
        final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        if (hSContext.getUserManager().isLoginCallInProgress()) {
            com.helpshift.log.HSLogger.d(TAG, com.helpshift.user.UserManager.LOGIN_CALL_ALREADY_IN_PROGRESS);
            return false;
        }
        final java.util.HashMap hashMap = new java.util.HashMap(map);
        if (!com.helpshift.util.Utils.validateUserIdEmailForLogin((java.lang.String) hashMap.get("userId"), (java.lang.String) hashMap.get("userEmail"))) {
            com.helpshift.log.HSLogger.e(TAG, "userId/userEmail validation failed, skipping login.");
            return false;
        }
        com.helpshift.util.Utils.removeEmptyKeyValues(hashMap);
        com.helpshift.log.HSLogger.d(TAG, "Logging in the user: " + hashMap);
        hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.core.HSContext.this.getUserManager().login(hashMap);
            }
        });
        return true;
    }

    public static void logout() {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "Logging out the user");
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda21
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().logout(true);
                }
            });
        }
    }

    public static void setLanguage(final java.lang.String str) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "setLanguage() is called for language - " + str);
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda22
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getConfigManager().saveLanguage(str);
                }
            });
        }
    }

    public static void registerPushToken(final java.lang.String str) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "Registering push token, token is empty?- " + com.helpshift.util.Utils.isEmpty(str));
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().registerPushToken(str);
                }
            });
        }
    }

    public static void handlePush(final java.util.Map<java.lang.String, java.lang.String> map) {
        if (!com.helpshift.core.HSContext.verifyInstall() || map == null || map.size() == 0) {
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "handlePush() is called.");
        final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.core.HSContext.this.getNotificationManager().handlePush(map, true);
            }
        });
    }

    public static void setProactivePushNotificationDefaults(final java.util.Map<java.lang.String, java.lang.Object> map) {
        if (!com.helpshift.core.HSContext.verifyInstall() || map == null || map.size() == 0) {
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "setProactivePushNotificationDefaults() is called.");
        final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                hSContext.getPersistentStorage().setProactivePushNotificationDefaults(com.helpshift.util.JsonUtils.mapToJsonString(map));
            }
        });
    }

    public static void shouldPauseInAppNotification(final boolean z) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "shouldPauseInAppNotification() is called with shouldPause = " + z);
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getNotificationManager().setShouldPauseInAppNotification(z);
                }
            });
        }
    }

    @java.lang.Deprecated
    public static void clearAnonymousUserOnLogin() {
        com.helpshift.log.HSLogger.d(TAG, "Deprecated clearAnonymousUserOnLogin() is called.");
        clearAnonymousUserOnLogin(true);
    }

    public static void clearAnonymousUserOnLogin(final boolean z) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "clearAnonymousUserOnLogin() with param " + z + " is called.");
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.core.HSContext.this.getUserManager().saveClearAnonymousUserOnLoginConfig(z);
                }
            });
        }
    }

    public static void requestUnreadMessageCount(final boolean z) {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "requestUnreadMessageCount is called with shouldFetchFromServer = " + z);
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.Helpshift.lambda$requestUnreadMessageCount$19(z, hSContext);
                }
            });
        }
    }

    static /* synthetic */ void lambda$requestUnreadMessageCount$19(boolean z, com.helpshift.core.HSContext hSContext) {
        if (z) {
            hSContext.getRequestUnreadMessageCountHandler().handleRemoteRequest(hSContext.getUserManager().getHashForActiveUser());
        } else {
            hSContext.getRequestUnreadMessageCountHandler().handleLocalCacheRequest();
        }
    }

    public static void onAppForeground() {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "onAppForeground() is called for Manual App lifecycle tracking");
            com.helpshift.core.HSContext.getInstance().getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.lifecycle.HSAppLifeCycleController.getInstance().onManualAppForegroundAPI();
                }
            });
        }
    }

    public static void onAppBackground() {
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.log.HSLogger.d(TAG, "onAppBackground() is called for Manual App lifecycle tracking");
            com.helpshift.core.HSContext.getInstance().getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.lifecycle.HSAppLifeCycleController.getInstance().onManualAppBackgroundAPI();
                }
            });
        }
    }

    public static void addUserTrail(final java.lang.String str) {
        if (!com.helpshift.core.HSContext.verifyInstall() || com.helpshift.util.Utils.isEmpty(str)) {
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "addUserTrail() is called for User tracking for clients");
        final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        hSContext.getHsThreadingService().runSerial(new java.lang.Runnable() { // from class: com.helpshift.Helpshift$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.core.HSContext.this.getConfigManager().addUserTrail(str);
            }
        });
    }

    public static void closeSession() {
        com.helpshift.log.HSLogger.d(TAG, "closeSession: called");
        if (com.helpshift.core.HSContext.verifyInstall()) {
            com.helpshift.core.HSContext.getInstance().closeHSActivities();
        }
    }
}
