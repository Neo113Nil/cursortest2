package com.adjust.sdk;

/* loaded from: classes2.dex */
public class ActivityHandler implements com.adjust.sdk.IActivityHandler, com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback {
    private static final java.lang.String ACTIVITY_STATE_NAME = "Activity state";
    private static final java.lang.String ATTRIBUTION_NAME = "Attribution";
    private static long BACKGROUND_TIMER_INTERVAL = 0;
    private static final java.lang.String BACKGROUND_TIMER_NAME = "Background timer";
    private static final java.lang.String DELAY_START_TIMER_NAME = "Delay Start timer";
    private static final java.lang.String EVENT_METADATA_NAME = "Event metadata";
    private static long FOREGROUND_TIMER_INTERVAL = 0;
    private static final java.lang.String FOREGROUND_TIMER_NAME = "Foreground timer";
    private static long FOREGROUND_TIMER_START = 0;
    private static final java.lang.String GLOBAL_CALLBACK_PARAMETERS_NAME = "Global Callback parameters";
    private static final java.lang.String GLOBAL_PARAMETERS_NAME = "Global parameters";
    private static final java.lang.String GLOBAL_PARTNER_PARAMETERS_NAME = "Global Partner parameters";
    private static long SESSION_INTERVAL = 0;
    private static long SUBSESSION_INTERVAL = 0;
    private static final java.lang.String TIME_TRAVEL = "Time travel!";
    private com.adjust.sdk.ActivityState activityState;
    private com.adjust.sdk.AdjustConfig adjustConfig;
    private com.adjust.sdk.AdjustAttribution attribution;
    private com.adjust.sdk.IAttributionHandler attributionHandler;
    private com.adjust.sdk.scheduler.TimerOnce backgroundTimer;
    private java.lang.String basePath;
    private java.util.List<com.adjust.sdk.AdjustThirdPartySharing> cachedAdjustThirdPartySharingArray;
    private com.adjust.sdk.OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    private java.lang.Boolean cachedLastMeasurementConsentTrack;
    private com.adjust.sdk.DeviceInfo deviceInfo;
    com.adjust.sdk.scheduler.ThreadExecutor executor;
    private com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager;
    private com.adjust.sdk.scheduler.TimerCycle foregroundTimer;
    private java.lang.String gdprPath;
    private com.adjust.sdk.GlobalParameters globalParameters;
    private com.adjust.sdk.InstallReferrer installReferrer;
    private com.adjust.sdk.ActivityHandler.InternalState internalState;
    private com.adjust.sdk.ILogger logger;
    private com.adjust.sdk.IPackageHandler packageHandler;
    private com.adjust.sdk.IPurchaseVerificationHandler purchaseVerificationHandler;
    private com.adjust.sdk.ISdkClickHandler sdkClickHandler;
    private java.lang.String subscriptionPath;
    private com.adjust.sdk.SystemLifecycle systemLifecycle;
    private final java.util.ArrayList<com.adjust.sdk.OnAdidReadListener> cachedAdidReadCallbacks = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.adjust.sdk.AdjustTimeoutCallback> cachedAdidReadTimeoutCallbacks = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.adjust.sdk.OnAttributionReadListener> cachedAttributionReadCallbacks = new java.util.ArrayList<>();
    private final java.util.ArrayList<com.adjust.sdk.AdjustTimeoutCallback> cachedAttributionReadTimeoutCallbacks = new java.util.ArrayList<>();
    private com.adjust.sdk.EventMetadata eventMetadata = new com.adjust.sdk.EventMetadata();

    public class InternalState {
        boolean enabled;
        boolean firstLaunch;
        java.lang.Boolean foregroundOrElseBackground;
        boolean offline;
        boolean preinstallHasBeenRead;
        boolean sessionResponseProcessed;

        public InternalState() {
        }

        public boolean hasPreinstallBeenRead() {
            return this.preinstallHasBeenRead;
        }

        public boolean hasSessionResponseNotBeenProcessed() {
            return !this.sessionResponseProcessed;
        }

        public boolean isDisabled() {
            return !this.enabled;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public boolean isFirstLaunch() {
            return this.firstLaunch;
        }

        public boolean isInBackground() {
            java.lang.Boolean bool = this.foregroundOrElseBackground;
            return (bool == null || bool.booleanValue()) ? false : true;
        }

        public boolean isInForeground() {
            java.lang.Boolean bool = this.foregroundOrElseBackground;
            return bool != null && bool.booleanValue();
        }

        public boolean isOffline() {
            return this.offline;
        }

        public boolean isOnline() {
            return !this.offline;
        }
    }

    private ActivityHandler(final com.adjust.sdk.AdjustConfig adjustConfig) {
        init(adjustConfig);
        com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
        this.logger = logger;
        logger.lockLogLevel();
        this.executor = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("ActivityHandler");
        com.adjust.sdk.ActivityHandler.InternalState internalState = new com.adjust.sdk.ActivityHandler.InternalState();
        this.internalState = internalState;
        java.lang.Boolean bool = adjustConfig.startEnabled;
        internalState.enabled = bool != null ? bool.booleanValue() : true;
        com.adjust.sdk.ActivityHandler.InternalState internalState2 = this.internalState;
        internalState2.offline = adjustConfig.startOffline;
        internalState2.sessionResponseProcessed = false;
        internalState2.preinstallHasBeenRead = false;
        this.cachedAdjustThirdPartySharingArray = null;
        this.cachedLastMeasurementConsentTrack = null;
        this.firstSessionDelayManager = new com.adjust.sdk.FirstSessionDelayManager(this);
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5008lambda$new$2$comadjustsdkActivityHandler(adjustConfig);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void backgroundTimerFiredI() {
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
    }

    private void bootstrapLifecycleI() {
        com.adjust.sdk.SystemLifecycle singletonInstance = com.adjust.sdk.SystemLifecycle.getSingletonInstance();
        this.systemLifecycle = singletonInstance;
        java.util.Iterator<java.lang.String> it = singletonInstance.logMessageList.iterator();
        while (it.hasNext()) {
            this.logger.debug("Lifecycle: %s", it.next());
        }
        this.systemLifecycle.overwriteCallback(this);
        if (com.adjust.sdk.AdjustFactory.isSystemLifecycleBootstrapIgnored()) {
            return;
        }
        this.internalState.foregroundOrElseBackground = this.systemLifecycle.foregroundOrElseBackgroundCached();
        if (this.internalState.isInForeground()) {
            onResumeI();
        }
    }

    private boolean canTrackMeasurementConsentI() {
        return checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten;
    }

    private boolean canTrackThirdPartySharingI() {
        if (!checkActivityStateI(this.activityState) || !isEnabledI() || this.activityState.isGdprForgotten) {
            return false;
        }
        if (!this.adjustConfig.coppaComplianceEnabled) {
            return true;
        }
        this.logger.warn("Calling third party sharing API not allowed when COPPA enabled", new java.lang.Object[0]);
        return false;
    }

    private boolean checkActivityStateI(com.adjust.sdk.ActivityState activityState) {
        if (activityState != null) {
            return true;
        }
        this.logger.error("Sdk did not yet start", new java.lang.Object[0]);
        return false;
    }

    private boolean checkAdjustAdRevenue(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        if (adjustAdRevenue == null) {
            this.logger.error("Ad revenue object missing", new java.lang.Object[0]);
            return false;
        }
        if (adjustAdRevenue.isValid()) {
            return true;
        }
        this.logger.error("Ad revenue object not initialized correctly", new java.lang.Object[0]);
        return false;
    }

    private void checkAfterNewStartI() {
        checkAfterNewStartI(com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()));
    }

    private void checkAttributionStateI() {
        if (checkActivityStateI(this.activityState)) {
            if (this.internalState.isFirstLaunch() && this.internalState.hasSessionResponseNotBeenProcessed()) {
                return;
            }
            if (this.attribution == null || this.activityState.askingAttribution) {
                this.attributionHandler.getAttribution();
            }
        }
    }

    private boolean checkEventI(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (adjustEvent == null) {
            this.logger.error("Event missing", new java.lang.Object[0]);
            return false;
        }
        if (adjustEvent.isValid()) {
            return true;
        }
        this.logger.error("Event not initialized correctly", new java.lang.Object[0]);
        return false;
    }

    private void checkForInstallReferrerInfo(com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        if (sdkClickResponseData.isInstallReferrer) {
            java.lang.String str = sdkClickResponseData.referrerApi;
            if (str != null && str.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS)) {
                com.adjust.sdk.ActivityState activityState = this.activityState;
                activityState.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState.installReferrerHuawei = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            java.lang.String str2 = sdkClickResponseData.referrerApi;
            if (str2 != null && str2.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
                com.adjust.sdk.ActivityState activityState2 = this.activityState;
                activityState2.clickTimeHuawei = sdkClickResponseData.clickTime;
                activityState2.installBeginHuawei = sdkClickResponseData.installBegin;
                activityState2.installReferrerHuaweiAppGallery = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            java.lang.String str3 = sdkClickResponseData.referrerApi;
            if (str3 != null && str3.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_META)) {
                com.adjust.sdk.ActivityState activityState3 = this.activityState;
                activityState3.clickTimeMeta = sdkClickResponseData.clickTime;
                activityState3.installReferrerMeta = sdkClickResponseData.installReferrer;
                activityState3.isClickMeta = sdkClickResponseData.isClick;
                writeActivityStateI();
                return;
            }
            java.lang.String str4 = sdkClickResponseData.referrerApi;
            if (str4 != null && str4.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG)) {
                com.adjust.sdk.ActivityState activityState4 = this.activityState;
                activityState4.clickTimeSamsung = sdkClickResponseData.clickTime;
                activityState4.installBeginSamsung = sdkClickResponseData.installBegin;
                activityState4.installReferrerSamsung = sdkClickResponseData.installReferrer;
                writeActivityStateI();
                return;
            }
            java.lang.String str5 = sdkClickResponseData.referrerApi;
            if (str5 != null && str5.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_XIAOMI)) {
                com.adjust.sdk.ActivityState activityState5 = this.activityState;
                activityState5.clickTimeXiaomi = sdkClickResponseData.clickTime;
                activityState5.installBeginXiaomi = sdkClickResponseData.installBegin;
                activityState5.installReferrerXiaomi = sdkClickResponseData.installReferrer;
                activityState5.clickTimeServerXiaomi = sdkClickResponseData.clickTimeServer;
                activityState5.installBeginServerXiaomi = sdkClickResponseData.installBeginServer;
                activityState5.installVersionXiaomi = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            java.lang.String str6 = sdkClickResponseData.referrerApi;
            if (str6 != null && str6.equalsIgnoreCase(com.adjust.sdk.Constants.REFERRER_API_VIVO)) {
                com.adjust.sdk.ActivityState activityState6 = this.activityState;
                activityState6.clickTimeVivo = sdkClickResponseData.clickTime;
                activityState6.installBeginVivo = sdkClickResponseData.installBegin;
                activityState6.installReferrerVivo = sdkClickResponseData.installReferrer;
                activityState6.installVersionVivo = sdkClickResponseData.installVersion;
                writeActivityStateI();
                return;
            }
            com.adjust.sdk.ActivityState activityState7 = this.activityState;
            activityState7.clickTime = sdkClickResponseData.clickTime;
            activityState7.installBegin = sdkClickResponseData.installBegin;
            activityState7.installReferrer = sdkClickResponseData.installReferrer;
            activityState7.clickTimeServer = sdkClickResponseData.clickTimeServer;
            activityState7.installBeginServer = sdkClickResponseData.installBeginServer;
            activityState7.installVersion = sdkClickResponseData.installVersion;
            activityState7.googlePlayInstant = sdkClickResponseData.googlePlayInstant;
            writeActivityStateI();
        }
    }

    private void checkForPreinstallI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState == null || !activityState.enabled || activityState.isGdprForgotten) {
            return;
        }
        m5019lambda$sendPreinstallReferrer$18$comadjustsdkActivityHandler();
        if (this.adjustConfig.isPreinstallTrackingEnabled && !this.internalState.hasPreinstallBeenRead()) {
            java.lang.String str = this.deviceInfo.packageName;
            if (str == null || str.isEmpty()) {
                this.logger.debug("Can't read preinstall payload, invalid package name", new java.lang.Object[0]);
                return;
            }
            com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
            long preinstallPayloadReadStatus = defaultInstance.getPreinstallPayloadReadStatus();
            if (com.adjust.sdk.PreinstallUtil.hasAllLocationsBeenRead(preinstallPayloadReadStatus)) {
                this.internalState.preinstallHasBeenRead = true;
                return;
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemProperty = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemProperty(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemProperty == null || payloadFromSystemProperty.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemProperty, com.adjust.sdk.Constants.SYSTEM_PROPERTIES);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyReflection = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyReflection == null || payloadFromSystemPropertyReflection.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyReflection, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_REFLECTION);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyFilePath = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyFilePath(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePath == null || payloadFromSystemPropertyFilePath.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePath, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromSystemPropertyFilePathReflection = com.adjust.sdk.PreinstallUtil.getPayloadFromSystemPropertyFilePathReflection(this.deviceInfo.packageName, this.logger);
                if (payloadFromSystemPropertyFilePathReflection == null || payloadFromSystemPropertyFilePathReflection.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromSystemPropertyFilePathReflection, com.adjust.sdk.Constants.SYSTEM_PROPERTIES_PATH_REFLECTION);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromContentProviderDefault = com.adjust.sdk.PreinstallUtil.getPayloadFromContentProviderDefault(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadFromContentProviderDefault == null || payloadFromContentProviderDefault.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromContentProviderDefault, com.adjust.sdk.Constants.CONTENT_PROVIDER);
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus)) {
                java.util.List<java.lang.String> payloadsFromContentProviderIntentAction = com.adjust.sdk.PreinstallUtil.getPayloadsFromContentProviderIntentAction(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderIntentAction == null || payloadsFromContentProviderIntentAction.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION, preinstallPayloadReadStatus);
                } else {
                    java.util.Iterator<java.lang.String> it = payloadsFromContentProviderIntentAction.iterator();
                    while (it.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it.next(), com.adjust.sdk.Constants.CONTENT_PROVIDER_INTENT_ACTION);
                    }
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus)) {
                java.util.List<java.lang.String> payloadsFromContentProviderNoPermission = com.adjust.sdk.PreinstallUtil.getPayloadsFromContentProviderNoPermission(this.adjustConfig.context, this.deviceInfo.packageName, this.logger);
                if (payloadsFromContentProviderNoPermission == null || payloadsFromContentProviderNoPermission.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION, preinstallPayloadReadStatus);
                } else {
                    java.util.Iterator<java.lang.String> it2 = payloadsFromContentProviderNoPermission.iterator();
                    while (it2.hasNext()) {
                        this.sdkClickHandler.sendPreinstallPayload(it2.next(), com.adjust.sdk.Constants.CONTENT_PROVIDER_NO_PERMISSION);
                    }
                }
            }
            if (com.adjust.sdk.PreinstallUtil.hasNotBeenRead(com.adjust.sdk.Constants.FILE_SYSTEM, preinstallPayloadReadStatus)) {
                java.lang.String payloadFromFileSystem = com.adjust.sdk.PreinstallUtil.getPayloadFromFileSystem(this.deviceInfo.packageName, this.adjustConfig.preinstallFilePath, this.logger);
                if (payloadFromFileSystem == null || payloadFromFileSystem.isEmpty()) {
                    preinstallPayloadReadStatus = com.adjust.sdk.PreinstallUtil.markAsRead(com.adjust.sdk.Constants.FILE_SYSTEM, preinstallPayloadReadStatus);
                } else {
                    this.sdkClickHandler.sendPreinstallPayload(payloadFromFileSystem, com.adjust.sdk.Constants.FILE_SYSTEM);
                }
            }
            defaultInstance.setPreinstallPayloadReadStatus(preinstallPayloadReadStatus);
            this.internalState.preinstallHasBeenRead = true;
        }
    }

    private android.content.Intent createDeeplinkIntentI(android.net.Uri uri) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        intent.setPackage(this.adjustConfig.context.getPackageName());
        return intent;
    }

    public static boolean deleteActivityState(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME);
    }

    public static boolean deleteAttribution(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.ATTRIBUTION_FILENAME);
    }

    public static boolean deleteEventMetadata(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.EVENT_METADATA_FILENAME);
    }

    public static boolean deleteGlobalCallbackParameters(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME);
    }

    public static boolean deleteGlobalPartnerParameters(android.content.Context context) {
        return context.deleteFile(com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME);
    }

    public static void deleteState(android.content.Context context) {
        deleteActivityState(context);
        deleteAttribution(context);
        deleteGlobalCallbackParameters(context);
        deleteGlobalPartnerParameters(context);
        deleteEventMetadata(context);
        com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(context).clear();
    }

    private void disableThirdPartySharingForCoppaEnabledI() {
        if (shouldDisableThirdPartySharingWhenCoppaEnabled()) {
            this.activityState.isThirdPartySharingDisabledForCoppa = true;
            writeActivityStateI();
            this.packageHandler.addPackage(new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis()).buildThirdPartySharingPackage(new com.adjust.sdk.AdjustThirdPartySharing(java.lang.Boolean.FALSE)));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void endI() {
        if (!toSendI()) {
            pauseSendingI();
        }
        if (updateActivityStateI(java.lang.System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void foregroundTimerFiredI() {
        if (!isEnabledI()) {
            stopForegroundTimerI();
            return;
        }
        if (toSendI()) {
            this.packageHandler.sendFirstPackage();
        }
        if (updateActivityStateI(java.lang.System.currentTimeMillis())) {
            writeActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gdprForgetMeI, reason: merged with bridge method [inline-methods] */
    public void m5003lambda$gdprForgetMe$34$comadjustsdkActivityHandler() {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten) {
                return;
            }
            activityState.isGdprForgotten = true;
            writeActivityStateI();
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildGdprPackage());
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).removeGdprForgetMe();
            this.packageHandler.sendFirstPackage();
        }
    }

    public static com.adjust.sdk.ActivityHandler getInstance(com.adjust.sdk.AdjustConfig adjustConfig) {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (adjustConfig == null) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig missing", new java.lang.Object[0]);
            return null;
        }
        if (!adjustConfig.isValid()) {
            com.adjust.sdk.AdjustFactory.getLogger().error("AdjustConfig not initialized correctly", new java.lang.Object[0]);
            return null;
        }
        if (adjustConfig.processName != null) {
            int myPid = android.os.Process.myPid();
            android.app.ActivityManager activityManager = (android.app.ActivityManager) adjustConfig.context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (!next.processName.equalsIgnoreCase(adjustConfig.processName)) {
                            com.adjust.sdk.AdjustFactory.getLogger().info("Skipping initialization in background process (%s)", next.processName);
                            return null;
                        }
                    }
                }
            } else {
                return null;
            }
        }
        return new com.adjust.sdk.ActivityHandler(adjustConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gotOptOutResponseI() {
        this.activityState.isGdprForgotten = true;
        writeActivityStateI();
        this.packageHandler.flush();
        m5024lambda$setEnabled$5$comadjustsdkActivityHandler(false);
    }

    private void handleAdidCallbackI() {
        final java.util.ArrayList arrayList;
        final java.util.ArrayList arrayList2;
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.addAll(this.adjustConfig.cachedAdidReadCallbacks);
            this.adjustConfig.cachedAdidReadCallbacks.clear();
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            this.cachedAdidReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAdidReadTimeoutCallbacks);
            this.adjustConfig.cachedAdidReadTimeoutCallbacks.clear();
        }
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState == null || activityState.adid == null) {
            return;
        }
        synchronized (this.cachedAdidReadCallbacks) {
            arrayList = null;
            if (this.cachedAdidReadCallbacks.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(this.cachedAdidReadCallbacks);
                this.cachedAdidReadCallbacks.clear();
            }
        }
        if (arrayList2 != null) {
            final java.lang.String str = this.activityState.adid;
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.29
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.OnAdidReadListener onAdidReadListener = (com.adjust.sdk.OnAdidReadListener) obj;
                        if (onAdidReadListener != null) {
                            onAdidReadListener.onAdidRead(str);
                        }
                    }
                }
            });
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                arrayList = new java.util.ArrayList(this.cachedAdidReadTimeoutCallbacks);
                this.cachedAdidReadTimeoutCallbacks.clear();
            }
        }
        if (arrayList != null) {
            final java.lang.String str2 = this.activityState.adid;
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.30
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = (com.adjust.sdk.AdjustTimeoutCallback) obj;
                        if (adjustTimeoutCallback != null) {
                            com.adjust.sdk.scheduler.TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                            if (timeoutTimer != null) {
                                timeoutTimer.cancel();
                            }
                            com.adjust.sdk.OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                            if (onAdidReadListener != null) {
                                onAdidReadListener.onAdidRead(str2);
                            }
                            adjustTimeoutCallback.setOnAdidReadListener(null);
                        }
                    }
                }
            });
        }
    }

    private void handleAttributionCallbackI() {
        final java.util.ArrayList arrayList;
        final java.util.ArrayList arrayList2;
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.addAll(this.adjustConfig.cachedAttributionReadCallbacks);
            this.adjustConfig.cachedAttributionReadCallbacks.clear();
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            this.cachedAttributionReadTimeoutCallbacks.addAll(this.adjustConfig.cachedAttributionReadTimeoutCallbacks);
            this.adjustConfig.cachedAttributionReadTimeoutCallbacks.clear();
        }
        if (this.attribution == null) {
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            arrayList = null;
            if (this.cachedAttributionReadCallbacks.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(this.cachedAttributionReadCallbacks);
                this.cachedAttributionReadCallbacks.clear();
            }
        }
        if (arrayList2 != null) {
            final com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.27
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.OnAttributionReadListener onAttributionReadListener = (com.adjust.sdk.OnAttributionReadListener) obj;
                        if (onAttributionReadListener != null) {
                            onAttributionReadListener.onAttributionRead(adjustAttribution);
                        }
                    }
                }
            });
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                arrayList = new java.util.ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                this.cachedAttributionReadTimeoutCallbacks.clear();
            }
        }
        if (arrayList != null) {
            final com.adjust.sdk.AdjustAttribution adjustAttribution2 = this.attribution;
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.28
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = (com.adjust.sdk.AdjustTimeoutCallback) obj;
                        if (adjustTimeoutCallback != null) {
                            com.adjust.sdk.scheduler.TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                            if (timeoutTimer != null) {
                                timeoutTimer.cancel();
                            }
                            com.adjust.sdk.OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback.getOnAttributionReadListener();
                            if (onAttributionReadListener != null) {
                                onAttributionReadListener.onAttributionRead(adjustAttribution2);
                            }
                            adjustTimeoutCallback.setOnAttributionReadListener(null);
                        }
                    }
                }
            });
        }
    }

    private boolean hasChangedStateI(boolean z, boolean z2, java.lang.String str, java.lang.String str2) {
        if (z != z2) {
            return true;
        }
        if (z) {
            this.logger.debug(str, new java.lang.Object[0]);
        } else {
            this.logger.debug(str2, new java.lang.Object[0]);
        }
        return false;
    }

    private boolean isEnabledI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        return activityState != null ? activityState.enabled : this.internalState.isEnabled();
    }

    private boolean isValidReferrerDetails(com.adjust.sdk.ReferrerDetails referrerDetails) {
        java.lang.String str;
        return (referrerDetails == null || (str = referrerDetails.installReferrer) == null || str.length() == 0) ? false : true;
    }

    private void launchAttributionListenerI(android.os.Handler handler) {
        if (this.adjustConfig.onAttributionChangedListener == null) {
            return;
        }
        handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.43
            @Override // java.lang.Runnable
            public final void run() {
                if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onAttributionChangedListener == null) {
                    return;
                }
                com.adjust.sdk.ActivityHandler.this.adjustConfig.onAttributionChangedListener.onAttributionChanged(com.adjust.sdk.ActivityHandler.this.attribution);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchAttributionResponseTasksI(com.adjust.sdk.AttributionResponseData attributionResponseData) {
        processRemoteTriggersI(attributionResponseData);
        updateAdidI(attributionResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(attributionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        prepareDeeplinkI(attributionResponseData.deeplink, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchDeeplinkMain(android.content.Intent intent, android.net.Uri uri) {
        if (this.adjustConfig.context.getPackageManager().queryIntentActivities(intent, 0).size() <= 0) {
            this.logger.error("Unable to open deferred deeplink (%s)", uri);
        } else {
            this.logger.info("Open deferred deeplink (%s)", uri);
            this.adjustConfig.context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchEventResponseTasksI(final com.adjust.sdk.EventResponseData eventResponseData) {
        updateAdidI(eventResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        boolean z = eventResponseData.success;
        if (z && this.adjustConfig.onEventTrackingSucceededListener != null) {
            this.logger.debug("Launching success event tracking listener", new java.lang.Object[0]);
            handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.38
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener == null) {
                        return;
                    }
                    com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingSucceededListener.onEventTrackingSucceeded(eventResponseData.getSuccessResponseData());
                }
            });
        } else {
            if (z || this.adjustConfig.onEventTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed event tracking listener", new java.lang.Object[0]);
            handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.39
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingFailedListener == null) {
                        return;
                    }
                    com.adjust.sdk.ActivityHandler.this.adjustConfig.onEventTrackingFailedListener.onEventTrackingFailed(eventResponseData.getFailureResponseData());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchPurchaseVerificationResponseTasksI(final com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData) {
        com.adjust.sdk.AdjustEvent adjustEvent;
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        org.json.JSONObject jSONObject = purchaseVerificationResponseData.jsonResponse;
        final com.adjust.sdk.AdjustPurchaseVerificationResult adjustPurchaseVerificationResult = jSONObject == null ? new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 101, purchaseVerificationResponseData.message) : new com.adjust.sdk.AdjustPurchaseVerificationResult(com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "verification_status"), com.adjust.sdk.network.UtilNetworking.extractJsonInt(jSONObject, "code"), com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "message"));
        handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.44
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.PurchaseVerificationResponseData.this.activityPackage.getPurchaseVerificationCallback().onVerificationFinished(adjustPurchaseVerificationResult);
            }
        });
        com.adjust.sdk.ActivityPackage activityPackage = purchaseVerificationResponseData.activityPackage;
        if (activityPackage == null || (adjustEvent = activityPackage.event) == null) {
            return;
        }
        trackEventI(adjustEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSdkClickResponseTasksI(final com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        updateAdidI(sdkClickResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sdkClickResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (android.text.TextUtils.isEmpty(sdkClickResponseData.resolvedDeeplink)) {
            return;
        }
        final com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
        this.cachedDeeplinkResolutionCallback = null;
        if (onDeeplinkResolvedListener != null) {
            handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.40
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.OnDeeplinkResolvedListener.this.onDeeplinkResolved(sdkClickResponseData.resolvedDeeplink);
                }
            });
        }
    }

    private void launchSessionResponseListenerI(final com.adjust.sdk.SessionResponseData sessionResponseData, android.os.Handler handler) {
        boolean z = sessionResponseData.success;
        if (z && this.adjustConfig.onSessionTrackingSucceededListener != null) {
            this.logger.debug("Launching success session tracking listener", new java.lang.Object[0]);
            handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.41
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener == null) {
                        return;
                    }
                    com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingSucceededListener.onSessionTrackingSucceeded(sessionResponseData.getSuccessResponseData());
                }
            });
        } else {
            if (z || this.adjustConfig.onSessionTrackingFailedListener == null) {
                return;
            }
            this.logger.debug("Launching failed session tracking listener", new java.lang.Object[0]);
            handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.42
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener == null) {
                        return;
                    }
                    com.adjust.sdk.ActivityHandler.this.adjustConfig.onSessionTrackingFailedListener.onSessionTrackingFailed(sessionResponseData.getFailureResponseData());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchSessionResponseTasksI(com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.logger.debug("Launching SessionResponse tasks", new java.lang.Object[0]);
        updateAdidI(sessionResponseData.adid);
        android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
        if (updateAttributionI(sessionResponseData.attribution)) {
            launchAttributionListenerI(handler);
        }
        if (this.attribution == null && !this.activityState.askingAttribution) {
            this.attributionHandler.getAttribution();
        }
        if (sessionResponseData.success) {
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).setInstallTracked();
        }
        launchSessionResponseListenerI(sessionResponseData, handler);
        prepareDeeplinkI(sessionResponseData.deeplink, handler);
        this.internalState.sessionResponseProcessed = true;
    }

    private void pauseSendingI() {
        this.attributionHandler.pauseSending();
        this.packageHandler.pauseSending();
        if (toSendI(true)) {
            this.sdkClickHandler.resumeSending();
            this.purchaseVerificationHandler.resumeSending();
        } else {
            this.sdkClickHandler.pauseSending();
            this.purchaseVerificationHandler.pauseSending();
        }
    }

    private boolean pausedI() {
        return pausedI(false);
    }

    private void preLaunchActionsI(java.util.List<com.adjust.sdk.IRunActivityHandler> list) {
        if (list == null) {
            return;
        }
        java.util.Iterator<com.adjust.sdk.IRunActivityHandler> it = list.iterator();
        while (it.hasNext()) {
            it.next().run(this);
        }
    }

    private void prepareDeeplinkI(final android.net.Uri uri, android.os.Handler handler) {
        if (uri == null) {
            return;
        }
        this.logger.info("Deferred deeplink received (%s)", uri);
        final android.content.Intent createDeeplinkIntentI = createDeeplinkIntentI(uri);
        handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.46
            @Override // java.lang.Runnable
            public final void run() {
                if (com.adjust.sdk.ActivityHandler.this.adjustConfig == null) {
                    return;
                }
                if (com.adjust.sdk.ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener == null || com.adjust.sdk.ActivityHandler.this.adjustConfig.onDeferredDeeplinkResponseListener.launchReceivedDeeplink(uri)) {
                    com.adjust.sdk.ActivityHandler.this.launchDeeplinkMain(createDeeplinkIntentI, uri);
                }
            }
        });
    }

    private void processCachedDeeplinkI() {
        if (checkActivityStateI(this.activityState)) {
            com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
            java.lang.String deeplinkUrl = defaultInstance.getDeeplinkUrl();
            java.lang.String deeplinkReferrer = defaultInstance.getDeeplinkReferrer();
            long deeplinkClickTime = defaultInstance.getDeeplinkClickTime();
            if (deeplinkUrl == null || deeplinkClickTime == -1) {
                return;
            }
            com.adjust.sdk.AdjustDeeplink adjustDeeplink = new com.adjust.sdk.AdjustDeeplink(android.net.Uri.parse(deeplinkUrl));
            if (deeplinkReferrer != null) {
                adjustDeeplink.setReferrer(android.net.Uri.parse(deeplinkReferrer));
            }
            processDeeplink(adjustDeeplink, deeplinkClickTime);
            defaultInstance.removeDeeplink();
        }
    }

    private void processCoppaComplianceI() {
        if (this.adjustConfig.coppaComplianceEnabled) {
            disableThirdPartySharingForCoppaEnabledI();
        } else {
            resetThirdPartySharingCoppaActivityStateI();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processDeeplinkI, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m5013lambda$processDeeplink$12$comadjustsdkActivityHandler(com.adjust.sdk.AdjustDeeplink adjustDeeplink, long j) {
        if (isEnabledI() && adjustDeeplink != null) {
            if (com.adjust.sdk.Util.isUrlFilteredOut(adjustDeeplink.getUrl())) {
                if (adjustDeeplink.getUrl() != null) {
                    this.logger.debug("Deeplink (" + adjustDeeplink.getUrl().toString() + ") processing skipped", new java.lang.Object[0]);
                    return;
                }
                return;
            }
            if (com.adjust.sdk.Util.isUrlWithTrackerQueryParam(adjustDeeplink.getUrl())) {
                final java.lang.String uri = adjustDeeplink.getUrl().toString();
                android.os.Handler handler = new android.os.Handler(this.adjustConfig.context.getMainLooper());
                final com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener = this.cachedDeeplinkResolutionCallback;
                this.cachedDeeplinkResolutionCallback = null;
                if (onDeeplinkResolvedListener != null) {
                    handler.post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.47
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.adjust.sdk.OnDeeplinkResolvedListener.this.onDeeplinkResolved(uri);
                        }
                    });
                }
            }
            com.adjust.sdk.ActivityPackage buildDeeplinkSdkClickPackage = com.adjust.sdk.PackageFactory.buildDeeplinkSdkClickPackage(adjustDeeplink.getUrl(), adjustDeeplink.getReferrer(), j, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState);
            if (buildDeeplinkSdkClickPackage == null) {
                return;
            }
            this.sdkClickHandler.sendSdkClick(buildDeeplinkSdkClickPackage);
        }
    }

    private void processPreLaunchArraysI() {
        if (this.cachedAdjustThirdPartySharingArray != null && canTrackThirdPartySharingI()) {
            java.util.Iterator<com.adjust.sdk.AdjustThirdPartySharing> it = this.cachedAdjustThirdPartySharingArray.iterator();
            while (it.hasNext()) {
                trackThirdPartySharingI(it.next());
            }
        }
        this.cachedAdjustThirdPartySharingArray = null;
        if (this.cachedLastMeasurementConsentTrack != null && canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(this.cachedLastMeasurementConsentTrack.booleanValue());
        }
        this.cachedLastMeasurementConsentTrack = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRemoteTriggersI(com.adjust.sdk.ResponseData responseData) {
        org.json.JSONArray optJSONArray;
        org.json.JSONObject jSONObject = responseData.jsonResponse;
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("remote_triggers")) == null || optJSONArray.length() == 0 || this.adjustConfig.onRemoteTriggerListener == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                this.logger.warn("Invalid remote trigger item, skipping", new java.lang.Object[0]);
            } else {
                java.lang.String optString = optJSONObject.optString("label");
                if (optString.isEmpty()) {
                    this.logger.warn("Remote trigger missing or invalid label, skipping", new java.lang.Object[0]);
                } else {
                    org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("payload");
                    if (optJSONObject2 == null) {
                        this.logger.warn("Remote trigger missing or invalid payload, skipping", new java.lang.Object[0]);
                    } else {
                        final com.adjust.sdk.AdjustRemoteTrigger adjustRemoteTrigger = new com.adjust.sdk.AdjustRemoteTrigger(optString, optJSONObject2);
                        new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.45
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (com.adjust.sdk.ActivityHandler.this.adjustConfig.onRemoteTriggerListener != null) {
                                    com.adjust.sdk.ActivityHandler.this.adjustConfig.onRemoteTriggerListener.onRemoteTrigger(adjustRemoteTrigger);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    private void processSessionI() {
        if (this.activityState.isGdprForgotten) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j = currentTimeMillis - activityState.lastActivity;
        if (j < 0) {
            this.logger.error(TIME_TRAVEL, new java.lang.Object[0]);
            this.activityState.lastActivity = currentTimeMillis;
            writeActivityStateI();
            return;
        }
        if (j > SESSION_INTERVAL) {
            trackNewSessionI(currentTimeMillis);
            checkAfterNewStartI();
            return;
        }
        if (j <= SUBSESSION_INTERVAL) {
            this.logger.verbose("Time span since last activity too short for a new subsession", new java.lang.Object[0]);
            return;
        }
        int i = activityState.subsessionCount + 1;
        activityState.subsessionCount = i;
        activityState.sessionLength += j;
        activityState.lastActivity = currentTimeMillis;
        this.logger.verbose("Started subsession %d of session %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(this.activityState.sessionCount));
        writeActivityStateI();
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    public static void queueGetAdidWithTimeout(long j, com.adjust.sdk.OnAdidReadListener onAdidReadListener, final java.util.ArrayList<com.adjust.sdk.AdjustTimeoutCallback> arrayList, final android.content.Context context) {
        final com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = new com.adjust.sdk.AdjustTimeoutCallback(onAdidReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        com.adjust.sdk.scheduler.TimerOnce timerOnce = new com.adjust.sdk.scheduler.TimerOnce(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.21
            @Override // java.lang.Runnable
            public final void run() {
                if (com.adjust.sdk.AdjustTimeoutCallback.this.getOnAdidReadListener() != null) {
                    synchronized (arrayList) {
                        arrayList.remove(com.adjust.sdk.AdjustTimeoutCallback.this);
                    }
                    new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.21.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.adjust.sdk.OnAdidReadListener onAdidReadListener2 = com.adjust.sdk.AdjustTimeoutCallback.this.getOnAdidReadListener();
                            if (onAdidReadListener2 != null) {
                                onAdidReadListener2.onAdidRead(null);
                            }
                            com.adjust.sdk.AdjustTimeoutCallback.this.setOnAdidReadListener(null);
                        }
                    });
                }
            }
        }, com.adjust.sdk.Constants.ADID_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j);
    }

    public static void queueGetAttributionWithTimeout(long j, com.adjust.sdk.OnAttributionReadListener onAttributionReadListener, final java.util.ArrayList<com.adjust.sdk.AdjustTimeoutCallback> arrayList, final android.content.Context context) {
        final com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = new com.adjust.sdk.AdjustTimeoutCallback(onAttributionReadListener);
        synchronized (arrayList) {
            arrayList.add(adjustTimeoutCallback);
        }
        com.adjust.sdk.scheduler.TimerOnce timerOnce = new com.adjust.sdk.scheduler.TimerOnce(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.22
            @Override // java.lang.Runnable
            public final void run() {
                if (com.adjust.sdk.AdjustTimeoutCallback.this.getOnAttributionReadListener() != null) {
                    synchronized (arrayList) {
                        arrayList.remove(com.adjust.sdk.AdjustTimeoutCallback.this);
                    }
                    new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.22.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.adjust.sdk.OnAttributionReadListener onAttributionReadListener2 = com.adjust.sdk.AdjustTimeoutCallback.this.getOnAttributionReadListener();
                            if (onAttributionReadListener2 != null) {
                                onAttributionReadListener2.onAttributionRead(null);
                            }
                            com.adjust.sdk.AdjustTimeoutCallback.this.setOnAttributionReadListener(null);
                        }
                    });
                }
            }
        }, com.adjust.sdk.Constants.ATTRIBUTION_TIMEOUT_TIMER_NAME);
        adjustTimeoutCallback.setTimer(timerOnce);
        timerOnce.startIn(j);
    }

    private void readActivityStateI(android.content.Context context) {
        try {
            this.activityState = (com.adjust.sdk.ActivityState) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME, com.adjust.sdk.ActivityState.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", ACTIVITY_STATE_NAME, e.getMessage());
            this.activityState = null;
        }
    }

    private void readAttributionI(android.content.Context context) {
        try {
            this.attribution = (com.adjust.sdk.AdjustAttribution) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME, com.adjust.sdk.AdjustAttribution.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", ATTRIBUTION_NAME, e.getMessage());
            this.attribution = null;
        }
    }

    private void readConfigFile(android.content.Context context) {
        try {
            java.io.InputStream open = context.getAssets().open("adjust_config.properties");
            java.util.Properties properties = new java.util.Properties();
            properties.load(open);
            this.logger.verbose("adjust_config.properties file read and loaded", new java.lang.Object[0]);
            java.lang.String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.adjustConfig.defaultTracker = property;
            }
        } catch (java.lang.Exception e) {
            this.logger.debug("%s file not found in this app", e.getMessage());
        }
    }

    private void readEventMetadataI(android.content.Context context) {
        try {
            this.eventMetadata = (com.adjust.sdk.EventMetadata) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME, com.adjust.sdk.EventMetadata.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", EVENT_METADATA_NAME, e.getMessage());
        }
        if (this.eventMetadata == null) {
            this.eventMetadata = new com.adjust.sdk.EventMetadata();
        }
    }

    private void readGlobalCallbackParametersI(android.content.Context context) {
        try {
            this.globalParameters.callbackParameters = (java.util.Map) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME, java.util.Map.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_CALLBACK_PARAMETERS_NAME, e.getMessage());
            this.globalParameters.callbackParameters = null;
        }
    }

    private void readGlobalPartnerParametersI(android.content.Context context) {
        try {
            this.globalParameters.partnerParameters = (java.util.Map) com.adjust.sdk.Util.readObject(context, com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME, java.util.Map.class);
        } catch (java.lang.Exception e) {
            this.logger.error("Failed to read %s file (%s)", GLOBAL_PARTNER_PARAMETERS_NAME, e.getMessage());
            this.globalParameters.partnerParameters = null;
        }
    }

    private void readInstallReferrerHuaweiAds() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.33
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails huaweiAdsReferrer = com.adjust.sdk.Reflection.getHuaweiAdsReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
                if (huaweiAdsReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(huaweiAdsReferrer, com.adjust.sdk.Constants.REFERRER_API_HUAWEI_ADS);
                }
            }
        });
    }

    private void readInstallReferrerHuaweiAppGallery() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.34
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails huaweiAppGalleryReferrer = com.adjust.sdk.Reflection.getHuaweiAppGalleryReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
                if (huaweiAppGalleryReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(huaweiAppGalleryReferrer, com.adjust.sdk.Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                }
            }
        });
    }

    private void readInstallReferrerMeta() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.31
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails metaReferrer = com.adjust.sdk.Reflection.getMetaReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.adjustConfig.fbAppId, com.adjust.sdk.ActivityHandler.this.logger);
                if (metaReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(metaReferrer, com.adjust.sdk.Constants.REFERRER_API_META);
                }
            }
        });
    }

    private void readInstallReferrerSamsung() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.35
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails samsungReferrer = com.adjust.sdk.Reflection.getSamsungReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
                if (samsungReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(samsungReferrer, com.adjust.sdk.Constants.REFERRER_API_SAMSUNG);
                }
            }
        });
    }

    private void readInstallReferrerVivo() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.37
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails vivoReferrer = com.adjust.sdk.Reflection.getVivoReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
                if (vivoReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(vivoReferrer, com.adjust.sdk.Constants.REFERRER_API_VIVO);
                }
            }
        });
    }

    private void readInstallReferrerXiaomi() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.36
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ReferrerDetails xiaomiReferrer = com.adjust.sdk.Reflection.getXiaomiReferrer(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger);
                if (xiaomiReferrer != null) {
                    com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(xiaomiReferrer, com.adjust.sdk.Constants.REFERRER_API_XIAOMI);
                }
            }
        });
    }

    private void readLicenseVerificationData() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.32
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.LicenseData licenseRequiredData;
                if (com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(com.adjust.sdk.ActivityHandler.this.getContext()).getLicenseVerificationTracked() || (licenseRequiredData = com.adjust.sdk.Reflection.getLicenseRequiredData(com.adjust.sdk.ActivityHandler.this.getContext(), com.adjust.sdk.ActivityHandler.this.logger, com.adjust.sdk.ActivityHandler.this.deviceInfo.appInstallTime)) == null) {
                    return;
                }
                com.adjust.sdk.ActivityHandler.this.sendLicenseVerificationData(licenseRequiredData);
            }
        });
    }

    private void resetThirdPartySharingCoppaActivityStateI() {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null && activityState.isThirdPartySharingDisabledForCoppa) {
            activityState.isThirdPartySharingDisabledForCoppa = false;
            writeActivityStateI();
        }
    }

    private void resumeSendingI() {
        this.attributionHandler.resumeSending();
        this.packageHandler.resumeSending();
        this.sdkClickHandler.resumeSending();
        this.purchaseVerificationHandler.resumeSending();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInstallReferrerI(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str) {
        if (isEnabledI() && isValidReferrerDetails(referrerDetails) && !com.adjust.sdk.Util.isEqualReferrerDetails(referrerDetails, str, this.activityState)) {
            this.sdkClickHandler.sendSdkClick(com.adjust.sdk.PackageFactory.buildInstallReferrerSdkClickPackage(referrerDetails, str, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLicenseVerificationDataI(com.adjust.sdk.LicenseData licenseData) {
        if (isEnabledI() && licenseData != null && licenseData.isValid()) {
            this.sdkClickHandler.sendSdkClick(com.adjust.sdk.PackageFactory.buildLicenseVerificationSdkClickPackage(licenseData, this.activityState, this.adjustConfig, this.deviceInfo, this.globalParameters, this.firstSessionDelayManager, this.internalState));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendPreinstallReferrerI, reason: merged with bridge method [inline-methods] */
    public void m5019lambda$sendPreinstallReferrer$18$comadjustsdkActivityHandler() {
        java.lang.String preinstallReferrer;
        if (!isEnabledI() || this.activityState == null || (preinstallReferrer = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getPreinstallReferrer()) == null || preinstallReferrer.isEmpty()) {
            return;
        }
        this.sdkClickHandler.sendPreinstallPayload(preinstallReferrer, com.adjust.sdk.Constants.SYSTEM_INSTALLER_REFERRER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendReftagReferrerI, reason: merged with bridge method [inline-methods] */
    public void m5021lambda$sendReftagReferrer$16$comadjustsdkActivityHandler() {
        if (isEnabledI() && this.activityState != null) {
            this.sdkClickHandler.sendReftagReferrers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAskingAttributionI(boolean z) {
        this.activityState.askingAttribution = z;
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEnabledI, reason: merged with bridge method [inline-methods] */
    public void m5024lambda$setEnabled$5$comadjustsdkActivityHandler(boolean z) {
        com.adjust.sdk.ActivityState activityState;
        if (hasChangedStateI(isEnabledI(), z, "Adjust already enabled", "Adjust already disabled")) {
            if (z && (activityState = this.activityState) != null && activityState.isGdprForgotten) {
                this.logger.error("Re-enabling SDK not possible for forgotten user", new java.lang.Object[0]);
                return;
            }
            this.internalState.enabled = z;
            com.adjust.sdk.ActivityState activityState2 = this.activityState;
            if (activityState2 == null) {
                updateStatusI(!z, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
                return;
            }
            activityState2.enabled = z;
            writeActivityStateI();
            if (z) {
                com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
                if (defaultInstance.getGdprForgetMe()) {
                    m5003lambda$gdprForgetMe$34$comadjustsdkActivityHandler();
                } else {
                    processCoppaComplianceI();
                    processPreLaunchArraysI();
                }
                if (!defaultInstance.getInstallTracked()) {
                    this.logger.debug("Detected that install was not tracked at enable time", new java.lang.Object[0]);
                    trackNewSessionI(java.lang.System.currentTimeMillis());
                }
                checkAfterNewStartI(defaultInstance);
            }
            updateStatusI(!z, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setOfflineModeI, reason: merged with bridge method [inline-methods] */
    public void m5027lambda$setOfflineMode$7$comadjustsdkActivityHandler(boolean z) {
        if (hasChangedStateI(this.internalState.isOffline(), z, "Adjust already in offline mode", "Adjust already in online mode")) {
            this.internalState.offline = z;
            if (this.activityState == null) {
                updateStatusI(z, "Handlers will start paused due to SDK being offline", "Handlers will still start as paused", "Handlers will start as active due to SDK being online");
            } else {
                updateStatusI(z, "Pausing handlers to put SDK offline mode", "Handlers remain paused", "Resuming handlers to put SDK in online mode");
            }
        }
    }

    private void setPushTokenI(java.lang.String str) {
        if (checkActivityStateI(this.activityState) && isEnabledI()) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState.isGdprForgotten || str == null || str.equals(activityState.pushToken)) {
                return;
            }
            this.activityState.pushToken = str;
            writeActivityStateI();
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildInfoPackage(com.adjust.sdk.Constants.PUSH));
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).removePushToken();
            this.packageHandler.sendFirstPackage();
        }
    }

    private boolean shouldDisableThirdPartySharingWhenCoppaEnabled() {
        if (this.activityState == null || !isEnabledI()) {
            return false;
        }
        if (this.activityState.isGdprForgotten) {
            return false;
        }
        return !r0.isThirdPartySharingDisabledForCoppa;
    }

    private boolean shouldProcessEventI(java.lang.String str) {
        if (str != null && !str.isEmpty()) {
            if (this.activityState.eventDeduplicationIdExists(str)) {
                this.logger.info("Skipping duplicate event with deduplication ID '%s'", str);
                return false;
            }
            this.activityState.addDeduplicationId(str);
            this.logger.verbose("Added deduplication ID '%s'", str);
        }
        return true;
    }

    private void startBackgroundTimerI() {
        if (this.backgroundTimer != null && toSendI() && this.backgroundTimer.getFireIn() <= 0) {
            this.backgroundTimer.startIn(BACKGROUND_TIMER_INTERVAL);
        }
    }

    private void startFirstSessionI() {
        com.adjust.sdk.ActivityState activityState = new com.adjust.sdk.ActivityState();
        this.activityState = activityState;
        activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        updateHandlersStatusAndSendI();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.adjust.sdk.SharedPreferencesManager defaultInstance = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext());
        this.activityState.pushToken = defaultInstance.getPushToken();
        if (this.internalState.isEnabled()) {
            if (defaultInstance.getGdprForgetMe()) {
                m5003lambda$gdprForgetMe$34$comadjustsdkActivityHandler();
            } else {
                processCoppaComplianceI();
                processPreLaunchArraysI();
                this.activityState.sessionCount = 1;
                transferSessionPackageI(currentTimeMillis);
                checkAfterNewStartI(defaultInstance);
            }
        }
        this.activityState.resetSessionAttributes(currentTimeMillis);
        this.activityState.enabled = this.internalState.isEnabled();
        writeActivityStateI();
        defaultInstance.removePushToken();
        defaultInstance.removeGdprForgetMe();
        processCachedDeeplinkI();
    }

    private void startForegroundTimerI() {
        if (isEnabledI()) {
            this.foregroundTimer.start();
        }
    }

    private void startI() {
        if (this.activityState == null) {
            com.adjust.sdk.AdjustSigner.onResume(this.adjustConfig.logger);
            startFirstSessionI();
            return;
        }
        processPreLaunchArraysI();
        if (this.activityState.enabled) {
            com.adjust.sdk.AdjustSigner.onResume(this.adjustConfig.logger);
            updateHandlersStatusAndSendI();
            processCoppaComplianceI();
            processSessionI();
            checkAttributionStateI();
            processCachedDeeplinkI();
        }
    }

    private void stopBackgroundTimerI() {
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce == null) {
            return;
        }
        timerOnce.cancel();
    }

    private void stopForegroundTimerI() {
        this.foregroundTimer.suspend();
    }

    private void teardownActivityStateS() {
        synchronized (com.adjust.sdk.ActivityState.class) {
            if (this.activityState == null) {
                return;
            }
            this.activityState = null;
        }
    }

    private void teardownAllGlobalParametersS() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            if (this.globalParameters == null) {
                return;
            }
            this.globalParameters = null;
        }
    }

    private void teardownAttributionS() {
        synchronized (com.adjust.sdk.AdjustAttribution.class) {
            if (this.attribution == null) {
                return;
            }
            this.attribution = null;
        }
    }

    private void teardownEventMetadataS() {
        synchronized (com.adjust.sdk.EventMetadata.class) {
            if (this.eventMetadata == null) {
                return;
            }
            this.eventMetadata = null;
        }
    }

    private boolean toSendI() {
        return toSendI(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trackAdRevenueI, reason: merged with bridge method [inline-methods] */
    public void m5032lambda$trackAdRevenue$40$comadjustsdkActivityHandler(com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkAdjustAdRevenue(adjustAdRevenue) && !this.activityState.isGdprForgotten) {
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildAdRevenuePackage(adjustAdRevenue));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackEventI(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && checkEventI(adjustEvent) && !this.activityState.isGdprForgotten && shouldProcessEventI(adjustEvent.deduplicationId)) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int incrementSequenceForEvent = this.eventMetadata.incrementSequenceForEvent(adjustEvent.eventToken);
            this.activityState.eventCount++;
            updateActivityStateI(currentTimeMillis);
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, currentTimeMillis);
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildEventPackage(adjustEvent, incrementSequenceForEvent));
            this.packageHandler.sendFirstPackage();
            if (this.adjustConfig.isSendingInBackgroundEnabled && this.internalState.isInBackground()) {
                startBackgroundTimerI();
            }
            writeActivityStateI();
            writeEventMetadataI();
        }
    }

    private void trackMeasurementConsentI(boolean z) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildMeasurementConsentPackage(z));
        this.packageHandler.sendFirstPackage();
    }

    private void trackNewSessionI(long j) {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j2 = j - activityState.lastActivity;
        activityState.sessionCount++;
        activityState.lastInterval = j2;
        transferSessionPackageI(j);
        this.activityState.resetSessionAttributes(j);
        writeActivityStateI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: trackPlayStoreSubscriptionI, reason: merged with bridge method [inline-methods] */
    public void m5037xcb9cd494(com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        if (checkActivityStateI(this.activityState) && isEnabledI() && !this.activityState.isGdprForgotten) {
            com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
            packageBuilder.internalState = this.internalState;
            this.packageHandler.addPackage(packageBuilder.buildSubscriptionPackage(adjustPlayStoreSubscription));
            this.packageHandler.sendFirstPackage();
        }
    }

    private void trackThirdPartySharingI(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildThirdPartySharingPackage(adjustThirdPartySharing));
        this.packageHandler.sendFirstPackage();
    }

    private void transferSessionPackageI(long j) {
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, j);
        packageBuilder.internalState = this.internalState;
        this.packageHandler.addPackage(packageBuilder.buildSessionPackage());
        this.packageHandler.sendFirstPackage();
    }

    private boolean updateActivityStateI(long j) {
        if (!checkActivityStateI(this.activityState)) {
            return false;
        }
        com.adjust.sdk.ActivityState activityState = this.activityState;
        long j2 = j - activityState.lastActivity;
        if (j2 > SESSION_INTERVAL) {
            return false;
        }
        activityState.lastActivity = j;
        if (j2 < 0) {
            this.logger.error(TIME_TRAVEL, new java.lang.Object[0]);
            return true;
        }
        activityState.sessionLength += j2;
        activityState.timeSpent += j2;
        return true;
    }

    private void updateAdidI(final java.lang.String str) {
        final java.util.ArrayList arrayList;
        final java.util.ArrayList arrayList2;
        if (str == null) {
            return;
        }
        if (!str.equals(this.activityState.adid)) {
            this.activityState.adid = str;
            writeActivityStateI();
        }
        synchronized (this.cachedAdidReadCallbacks) {
            arrayList = null;
            if (this.cachedAdidReadCallbacks.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(this.cachedAdidReadCallbacks);
                this.cachedAdidReadCallbacks.clear();
            }
        }
        if (arrayList2 != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.1
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.OnAdidReadListener onAdidReadListener = (com.adjust.sdk.OnAdidReadListener) obj;
                        if (onAdidReadListener != null) {
                            onAdidReadListener.onAdidRead(str);
                        }
                    }
                }
            });
        }
        synchronized (this.cachedAdidReadTimeoutCallbacks) {
            if (!this.cachedAdidReadTimeoutCallbacks.isEmpty()) {
                arrayList = new java.util.ArrayList(this.cachedAdidReadTimeoutCallbacks);
                this.cachedAdidReadTimeoutCallbacks.clear();
            }
        }
        if (arrayList != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.2
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = (com.adjust.sdk.AdjustTimeoutCallback) obj;
                        if (adjustTimeoutCallback != null) {
                            com.adjust.sdk.scheduler.TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                            if (timeoutTimer != null) {
                                timeoutTimer.cancel();
                            }
                            com.adjust.sdk.OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                            if (onAdidReadListener != null) {
                                onAdidReadListener.onAdidRead(str);
                            }
                            adjustTimeoutCallback.setOnAdidReadListener(null);
                        }
                    }
                }
            });
        }
    }

    private void updateHandlersStatusAndSendI() {
        if (!toSendI()) {
            pauseSendingI();
        } else {
            resumeSendingI();
            this.packageHandler.sendFirstPackage();
        }
    }

    private void updateStatusI(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z) {
            this.logger.info(str, new java.lang.Object[0]);
        } else if (!pausedI(false)) {
            this.logger.info(str3, new java.lang.Object[0]);
        } else if (pausedI(true)) {
            this.logger.info(str2, new java.lang.Object[0]);
        } else {
            this.logger.info(str2 + ", except the Sdk Click Handler", new java.lang.Object[0]);
        }
        updateHandlersStatusAndSendI();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyAndTrackPlayStorePurchaseI, reason: merged with bridge method [inline-methods] */
    public void m5040x261e5b58(com.adjust.sdk.AdjustEvent adjustEvent, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new java.lang.Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new java.lang.Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new java.lang.Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new java.lang.Object[0]);
            return;
        }
        if (adjustEvent == null) {
            this.logger.warn("Purchase verification aborted because event instance is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because event instance is null"));
            return;
        }
        com.adjust.sdk.ActivityPackage buildVerificationPackage = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis()).buildVerificationPackage(adjustEvent, onPurchaseVerificationFinishedListener);
        if (buildVerificationPackage == null) {
            this.logger.warn("Purchase verification aborted because verification package is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 107, "Purchase verification aborted because verification package is null"));
        } else {
            buildVerificationPackage.event = adjustEvent;
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(buildVerificationPackage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyPlayStorePurchaseI, reason: merged with bridge method [inline-methods] */
    public void m5042lambda$verifyPlayStorePurchase$44$comadjustsdkActivityHandler(com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        if (onPurchaseVerificationFinishedListener == null) {
            this.logger.warn("Purchase verification aborted because verification callback is null", new java.lang.Object[0]);
            return;
        }
        if (this.adjustConfig.isDataResidency) {
            this.logger.warn("Purchase verification not available for data residency users right now", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 109, "Purchase verification not available for data residency users right now"));
            return;
        }
        if (!checkActivityStateI(this.activityState)) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 102, "Purchase verification aborted because SDK is still not initialized"));
            this.logger.warn("Purchase verification aborted because SDK is still not initialized", new java.lang.Object[0]);
            return;
        }
        if (!isEnabledI()) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 103, "Purchase verification aborted because SDK is disabled"));
            this.logger.warn("Purchase verification aborted because SDK is disabled", new java.lang.Object[0]);
            return;
        }
        if (this.activityState.isGdprForgotten) {
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 104, "Purchase verification aborted because user is GDPR forgotten"));
            this.logger.warn("Purchase verification aborted because user is GDPR forgotten", new java.lang.Object[0]);
            return;
        }
        if (adjustPlayStorePurchase == null) {
            this.logger.warn("Purchase verification aborted because purchase instance is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 105, "Purchase verification aborted because purchase instance is null"));
            return;
        }
        com.adjust.sdk.PackageBuilder packageBuilder = new com.adjust.sdk.PackageBuilder(this.adjustConfig, this.deviceInfo, this.activityState, this.globalParameters, this.firstSessionDelayManager, java.lang.System.currentTimeMillis());
        packageBuilder.internalState = this.internalState;
        com.adjust.sdk.ActivityPackage buildVerificationPackage = packageBuilder.buildVerificationPackage(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        if (buildVerificationPackage != null) {
            this.purchaseVerificationHandler.sendPurchaseVerificationPackage(buildVerificationPackage);
        } else {
            this.logger.warn("Purchase verification aborted because verification package is null", new java.lang.Object[0]);
            onPurchaseVerificationFinishedListener.onVerificationFinished(new com.adjust.sdk.AdjustPurchaseVerificationResult("not_verified", 106, "Purchase verification aborted because verification package is null"));
        }
    }

    private void writeActivityStateI() {
        synchronized (com.adjust.sdk.ActivityState.class) {
            com.adjust.sdk.ActivityState activityState = this.activityState;
            if (activityState == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(activityState, this.adjustConfig.context, com.adjust.sdk.Constants.ACTIVITY_STATE_FILENAME, ACTIVITY_STATE_NAME);
        }
    }

    private void writeAttributionI() {
        synchronized (com.adjust.sdk.AdjustAttribution.class) {
            com.adjust.sdk.AdjustAttribution adjustAttribution = this.attribution;
            if (adjustAttribution == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(adjustAttribution, this.adjustConfig.context, com.adjust.sdk.Constants.ATTRIBUTION_FILENAME, ATTRIBUTION_NAME);
        }
    }

    private void writeEventMetadataI() {
        synchronized (com.adjust.sdk.EventMetadata.class) {
            com.adjust.sdk.EventMetadata eventMetadata = this.eventMetadata;
            if (eventMetadata == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(eventMetadata, this.adjustConfig.context, com.adjust.sdk.Constants.EVENT_METADATA_FILENAME, EVENT_METADATA_NAME);
        }
    }

    private void writeGlobalCallbackParametersI() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(globalParameters.callbackParameters, this.adjustConfig.context, com.adjust.sdk.Constants.GLOBAL_CALLBACK_PARAMETERS_FILENAME, GLOBAL_CALLBACK_PARAMETERS_NAME);
        }
    }

    private void writeGlobalPartnerParametersI() {
        synchronized (com.adjust.sdk.GlobalParameters.class) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters == null) {
                return;
            }
            com.adjust.sdk.Util.writeObject(globalParameters.partnerParameters, this.adjustConfig.context, com.adjust.sdk.Constants.GLOBAL_PARTNER_PARAMETERS_FILENAME, GLOBAL_PARTNER_PARAMETERS_NAME);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalCallbackParameter(final java.lang.String str, final java.lang.String str2) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5000x17863ad4(str, str2);
            }
        });
    }

    public void addGlobalCallbackParameterI(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.X3.i.W, "Global Callback") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Global Callback")) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.callbackParameters == null) {
                globalParameters.callbackParameters = new java.util.LinkedHashMap();
            }
            java.lang.String str3 = this.globalParameters.callbackParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.callbackParameters.put(str, str2);
            writeGlobalCallbackParametersI();
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void addGlobalPartnerParameter(final java.lang.String str, final java.lang.String str2) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5001x4b984c1d(str, str2);
            }
        });
    }

    public void addGlobalPartnerParameterI(java.lang.String str, java.lang.String str2) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.X3.i.W, "Global Partner") && com.adjust.sdk.Util.isValidParameter(str2, "value", "Global Partner")) {
            com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
            if (globalParameters.partnerParameters == null) {
                globalParameters.partnerParameters = new java.util.LinkedHashMap();
            }
            java.lang.String str3 = this.globalParameters.partnerParameters.get(str);
            if (str2.equals(str3)) {
                this.logger.verbose("Key %s already present with the same value", str);
                return;
            }
            if (str3 != null) {
                this.logger.warn("Key %s will be overwritten", str);
            }
            this.globalParameters.partnerParameters.put(str, str2);
            writeGlobalPartnerParametersI();
        }
    }

    public void backgroundTimerFired() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.16
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.backgroundTimerFiredI();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void endFirstSessionDelay() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5002lambda$endFirstSessionDelay$48$comadjustsdkActivityHandler();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void finishedTrackingActivity(com.adjust.sdk.ResponseData responseData) {
        processRemoteTriggers(responseData);
        if (responseData instanceof com.adjust.sdk.SessionResponseData) {
            this.logger.debug("Finished tracking session", new java.lang.Object[0]);
            this.attributionHandler.checkSessionResponse((com.adjust.sdk.SessionResponseData) responseData);
            return;
        }
        if (responseData instanceof com.adjust.sdk.SdkClickResponseData) {
            com.adjust.sdk.SdkClickResponseData sdkClickResponseData = (com.adjust.sdk.SdkClickResponseData) responseData;
            checkForInstallReferrerInfo(sdkClickResponseData);
            this.attributionHandler.checkSdkClickResponse(sdkClickResponseData);
        } else if (responseData instanceof com.adjust.sdk.EventResponseData) {
            launchEventResponseTasks((com.adjust.sdk.EventResponseData) responseData);
        } else if (responseData instanceof com.adjust.sdk.PurchaseVerificationResponseData) {
            launchPurchaseVerificationResponseTasks((com.adjust.sdk.PurchaseVerificationResponseData) responseData);
        }
    }

    public void foregroundTimerFired() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.15
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.foregroundTimerFiredI();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gdprForgetMe() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda37
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5004lambda$gdprForgetMe$35$comadjustsdkActivityHandler();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.ActivityState getActivityState() {
        return this.activityState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdid(final com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.17
                @Override // java.lang.Runnable
                public final void run() {
                    onAdidReadListener.onAdidRead(com.adjust.sdk.ActivityHandler.this.activityState.adid);
                }
            });
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new java.lang.Object[0]);
        }
        synchronized (this.cachedAdidReadCallbacks) {
            this.cachedAdidReadCallbacks.add(onAdidReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAdidWithTimeout(long j, final com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null && activityState.adid != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.18
                @Override // java.lang.Runnable
                public final void run() {
                    onAdidReadListener.onAdidRead(com.adjust.sdk.ActivityHandler.this.activityState.adid);
                }
            });
            return;
        }
        if (activityState == null) {
            this.logger.warn("SDK needs to be initialized before getting adid", new java.lang.Object[0]);
        }
        queueGetAdidWithTimeout(j, onAdidReadListener, this.cachedAdidReadTimeoutCallbacks, getContext());
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.AdjustConfig getAdjustConfig() {
        return this.adjustConfig;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttribution(final com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.19
                @Override // java.lang.Runnable
                public final void run() {
                    onAttributionReadListener.onAttributionRead(com.adjust.sdk.ActivityHandler.this.attribution);
                }
            });
            return;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            this.cachedAttributionReadCallbacks.add(onAttributionReadListener);
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void getAttributionWithTimeout(long j, final com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        if (this.attribution != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.20
                @Override // java.lang.Runnable
                public final void run() {
                    onAttributionReadListener.onAttributionRead(com.adjust.sdk.ActivityHandler.this.attribution);
                }
            });
        } else {
            queueGetAttributionWithTimeout(j, onAttributionReadListener, this.cachedAttributionReadTimeoutCallbacks, getContext());
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public android.content.Context getContext() {
        return this.adjustConfig.context;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.FirstSessionDelayManager getFirstSessionDelayManager() {
        return this.firstSessionDelayManager;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.GlobalParameters getGlobalParameters() {
        return this.globalParameters;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public com.adjust.sdk.ActivityHandler.InternalState getInternalState() {
        return this.internalState;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void gotOptOutResponse() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.14
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.gotOptOutResponseI();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void init(com.adjust.sdk.AdjustConfig adjustConfig) {
        this.adjustConfig = adjustConfig;
    }

    public void initI() {
        java.lang.String pushToken;
        SESSION_INTERVAL = com.adjust.sdk.AdjustFactory.getSessionInterval();
        SUBSESSION_INTERVAL = com.adjust.sdk.AdjustFactory.getSubsessionInterval();
        FOREGROUND_TIMER_INTERVAL = com.adjust.sdk.AdjustFactory.getTimerInterval();
        FOREGROUND_TIMER_START = com.adjust.sdk.AdjustFactory.getTimerStart();
        BACKGROUND_TIMER_INTERVAL = com.adjust.sdk.AdjustFactory.getTimerInterval();
        this.globalParameters = new com.adjust.sdk.GlobalParameters();
        readGlobalCallbackParametersI(this.adjustConfig.context);
        readGlobalPartnerParametersI(this.adjustConfig.context);
        com.adjust.sdk.ActivityState activityState = this.activityState;
        if (activityState != null) {
            activityState.setEventDeduplicationIdsMaxSize(this.adjustConfig.getEventDeduplicationIdsMaxSize());
        }
        com.adjust.sdk.AdjustConfig adjustConfig = this.adjustConfig;
        if (adjustConfig.startEnabled != null) {
            adjustConfig.preLaunchActions.preLaunchActionsArray.add(new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler.23
                @Override // com.adjust.sdk.IRunActivityHandler
                public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                    activityHandler.m5024lambda$setEnabled$5$comadjustsdkActivityHandler(com.adjust.sdk.ActivityHandler.this.adjustConfig.startEnabled.booleanValue());
                }
            });
        }
        com.adjust.sdk.ActivityState activityState2 = this.activityState;
        if (activityState2 != null) {
            com.adjust.sdk.ActivityHandler.InternalState internalState = this.internalState;
            internalState.enabled = activityState2.enabled;
            internalState.firstLaunch = false;
        } else {
            this.internalState.firstLaunch = true;
        }
        readConfigFile(this.adjustConfig.context);
        com.adjust.sdk.DeviceInfo deviceInfo = new com.adjust.sdk.DeviceInfo(this.adjustConfig);
        this.deviceInfo = deviceInfo;
        deviceInfo.reloadPlayIds(this.adjustConfig);
        if (this.deviceInfo.playAdId == null) {
            if (com.adjust.sdk.Util.canReadPlayIds(this.adjustConfig)) {
                this.logger.warn("Unable to get Google Play Services Advertising ID at start time", new java.lang.Object[0]);
            } else {
                this.logger.info("Cannot read Google Play Services Advertising ID with COPPA or play store kids app enabled", new java.lang.Object[0]);
            }
            if (this.deviceInfo.androidId == null) {
                if (com.adjust.sdk.Util.canReadNonPlayIds(this.adjustConfig)) {
                    this.logger.error("Unable to get any Device IDs. Please check if Proguard is correctly set with Adjust SDK", new java.lang.Object[0]);
                } else {
                    this.logger.info("Cannot read non Play IDs with COPPA or play store kids app enabled", new java.lang.Object[0]);
                }
            }
        } else {
            this.logger.info("Google Play Services Advertising ID read correctly at start time", new java.lang.Object[0]);
        }
        java.lang.String str = this.adjustConfig.defaultTracker;
        if (str != null) {
            this.logger.info("Default tracker: '%s'", str);
        }
        java.lang.String str2 = this.adjustConfig.pushToken;
        if (str2 != null) {
            this.logger.info("Push token: '%s'", str2);
            if (this.activityState != null) {
                setPushToken(this.adjustConfig.pushToken, false);
            } else {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(this.adjustConfig.pushToken);
            }
        } else if (this.activityState != null && (pushToken = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getPushToken()) != null) {
            setPushToken(pushToken, true);
        }
        if (this.cachedDeeplinkResolutionCallback == null) {
            this.cachedDeeplinkResolutionCallback = this.adjustConfig.cachedDeeplinkResolutionCallback;
        }
        handleAdidCallbackI();
        handleAttributionCallbackI();
        if (this.activityState != null && com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).getGdprForgetMe()) {
            gdprForgetMe();
        }
        this.foregroundTimer = new com.adjust.sdk.scheduler.TimerCycle(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.24
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.foregroundTimerFired();
            }
        }, FOREGROUND_TIMER_START, FOREGROUND_TIMER_INTERVAL, FOREGROUND_TIMER_NAME);
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            this.logger.info("Send in background configured", new java.lang.Object[0]);
            this.backgroundTimer = new com.adjust.sdk.scheduler.TimerOnce(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.25
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.ActivityHandler.this.backgroundTimerFired();
                }
            }, BACKGROUND_TIMER_NAME);
        }
        com.adjust.sdk.AdjustConfig adjustConfig2 = this.adjustConfig;
        this.packageHandler = com.adjust.sdk.AdjustFactory.getPackageHandler(this, this.adjustConfig.context, toSendI(false), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig2.urlStrategyDomains, adjustConfig2.useSubdomains, adjustConfig2.basePath, adjustConfig2.gdprPath, adjustConfig2.subscriptionPath, adjustConfig2.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig2.context));
        com.adjust.sdk.AdjustConfig adjustConfig3 = this.adjustConfig;
        this.attributionHandler = com.adjust.sdk.AdjustFactory.getAttributionHandler(this, toSendI(false), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig3.urlStrategyDomains, adjustConfig3.useSubdomains, adjustConfig3.basePath, adjustConfig3.gdprPath, adjustConfig3.subscriptionPath, adjustConfig3.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig3.context));
        com.adjust.sdk.AdjustConfig adjustConfig4 = this.adjustConfig;
        this.sdkClickHandler = com.adjust.sdk.AdjustFactory.getSdkClickHandler(this, toSendI(true), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig4.urlStrategyDomains, adjustConfig4.useSubdomains, adjustConfig4.basePath, adjustConfig4.gdprPath, adjustConfig4.subscriptionPath, adjustConfig4.purchaseVerificationPath, this.deviceInfo.clientSdk, 60000, adjustConfig4.context));
        com.adjust.sdk.AdjustConfig adjustConfig5 = this.adjustConfig;
        this.purchaseVerificationHandler = com.adjust.sdk.AdjustFactory.getPurchaseVerificationHandler(this, toSendI(true), new com.adjust.sdk.network.ActivityPackageSender(adjustConfig5.urlStrategyDomains, adjustConfig5.useSubdomains, adjustConfig5.basePath, adjustConfig5.gdprPath, adjustConfig5.subscriptionPath, adjustConfig5.purchaseVerificationPath, this.deviceInfo.clientSdk, 30000, adjustConfig5.context));
        this.installReferrer = new com.adjust.sdk.InstallReferrer(this.adjustConfig.context, new com.adjust.sdk.InstallReferrerReadListener() { // from class: com.adjust.sdk.ActivityHandler.26
            @Override // com.adjust.sdk.InstallReferrerReadListener
            public final void onFail(java.lang.String str3) {
                com.adjust.sdk.ActivityHandler.this.logger.debug(str3, new java.lang.Object[0]);
            }

            @Override // com.adjust.sdk.InstallReferrerReadListener
            public final void onInstallReferrerRead(com.adjust.sdk.ReferrerDetails referrerDetails, java.lang.String str3) {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrer(referrerDetails, str3);
            }
        });
        preLaunchActionsI(this.adjustConfig.preLaunchActions.preLaunchActionsArray);
        m5021lambda$sendReftagReferrer$16$comadjustsdkActivityHandler();
        bootstrapLifecycleI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean isEnabled() {
        return isEnabledI();
    }

    /* renamed from: lambda$addGlobalCallbackParameter$21$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5000x17863ad4(final java.lang.String str, final java.lang.String str2) {
        this.firstSessionDelayManager.a("add global callback parameter", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda26
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.addGlobalCallbackParameterI(str, str2);
            }
        });
    }

    /* renamed from: lambda$addGlobalPartnerParameter$23$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5001x4b984c1d(final java.lang.String str, final java.lang.String str2) {
        this.firstSessionDelayManager.a("add global partner parameter", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda18
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.addGlobalPartnerParameterI(str, str2);
            }
        });
    }

    /* renamed from: lambda$endFirstSessionDelay$48$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    void m5002lambda$endFirstSessionDelay$48$comadjustsdkActivityHandler() {
        com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager = this.firstSessionDelayManager;
        if (firstSessionDelayManager.c != 3) {
            return;
        }
        firstSessionDelayManager.c = 4;
        firstSessionDelayManager.f3422a.initI();
        java.util.ArrayList arrayList = firstSessionDelayManager.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ((java.lang.Runnable) obj).run();
        }
    }

    /* renamed from: lambda$gdprForgetMe$35$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5004lambda$gdprForgetMe$35$comadjustsdkActivityHandler() {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5003lambda$gdprForgetMe$34$comadjustsdkActivityHandler();
            }
        }, "GDPR forget device");
    }

    /* renamed from: lambda$isEnabled$10$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5005lambda$isEnabled$10$comadjustsdkActivityHandler(final com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5007lambda$isEnabled$9$comadjustsdkActivityHandler(onIsEnabledListener);
            }
        });
    }

    /* renamed from: lambda$isEnabled$11$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5006lambda$isEnabled$11$comadjustsdkActivityHandler(final com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda42
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5005lambda$isEnabled$10$comadjustsdkActivityHandler(onIsEnabledListener);
            }
        }, "is SDK enabled");
    }

    /* renamed from: lambda$isEnabled$9$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5007lambda$isEnabled$9$comadjustsdkActivityHandler(com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        onIsEnabledListener.onIsEnabledRead(isEnabledI());
    }

    /* renamed from: lambda$new$2$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    void m5008lambda$new$2$comadjustsdkActivityHandler(com.adjust.sdk.AdjustConfig adjustConfig) {
        readAttributionI(adjustConfig.context);
        readActivityStateI(adjustConfig.context);
        readEventMetadataI(adjustConfig.context);
        com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager = this.firstSessionDelayManager;
        if (firstSessionDelayManager.f3422a.getActivityState() == null && firstSessionDelayManager.f3422a.getAdjustConfig().isFirstSessionDelayEnabled) {
            firstSessionDelayManager.c = 3;
            return;
        }
        firstSessionDelayManager.c = 2;
        firstSessionDelayManager.f3422a.initI();
        java.util.ArrayList arrayList = firstSessionDelayManager.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            ((java.lang.Runnable) obj).run();
        }
    }

    /* renamed from: lambda$onActivityLifecycle$0$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5009lambda$onActivityLifecycle$0$comadjustsdkActivityHandler(boolean z) {
        java.lang.Boolean bool = this.internalState.foregroundOrElseBackground;
        if (bool == null || bool.booleanValue() != z) {
            this.internalState.foregroundOrElseBackground = java.lang.Boolean.valueOf(z);
            if (z) {
                onResumeI();
            } else {
                onPauseI();
            }
        }
    }

    /* renamed from: lambda$onActivityLifecycle$1$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5010lambda$onActivityLifecycle$1$comadjustsdkActivityHandler(final boolean z) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5009lambda$onActivityLifecycle$0$comadjustsdkActivityHandler(z);
            }
        }, "activity state");
    }

    /* renamed from: lambda$processAndResolveDeeplink$15$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5012xe6a7b9ff(final com.adjust.sdk.AdjustDeeplink adjustDeeplink, final long j) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5011x5e777a20(adjustDeeplink, j);
            }
        }, "process and resolve deep link");
    }

    /* renamed from: lambda$processDeeplink$13$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5014lambda$processDeeplink$13$comadjustsdkActivityHandler(final com.adjust.sdk.AdjustDeeplink adjustDeeplink, final long j) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5013lambda$processDeeplink$12$comadjustsdkActivityHandler(adjustDeeplink, j);
            }
        }, "process deep link");
    }

    /* renamed from: lambda$removeGlobalCallbackParameter$25$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5015x867b5f33(final java.lang.String str) {
        this.firstSessionDelayManager.a("remove global callback parameter", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda41
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.removeGlobalCallbackParameterI(str);
            }
        });
    }

    /* renamed from: lambda$removeGlobalCallbackParameters$29$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5016xa96985e2() {
        this.firstSessionDelayManager.a("remove global callback parameters", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda2
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.removeGlobalCallbackParametersI();
            }
        });
    }

    /* renamed from: lambda$removeGlobalPartnerParameter$27$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5017xa06b7e56(final java.lang.String str) {
        this.firstSessionDelayManager.a("remove global partner parameter", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda6
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.removeGlobalPartnerParameterI(str);
            }
        });
    }

    /* renamed from: lambda$removeGlobalPartnerParameters$31$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5018xe239026() {
        this.firstSessionDelayManager.a("remove global partner parameters", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda10
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.removeGlobalPartnerParametersI();
            }
        });
    }

    /* renamed from: lambda$sendPreinstallReferrer$19$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5020lambda$sendPreinstallReferrer$19$comadjustsdkActivityHandler() {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5019lambda$sendPreinstallReferrer$18$comadjustsdkActivityHandler();
            }
        }, "send preinstall referrer");
    }

    /* renamed from: lambda$sendReftagReferrer$17$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5022lambda$sendReftagReferrer$17$comadjustsdkActivityHandler() {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5021lambda$sendReftagReferrer$16$comadjustsdkActivityHandler();
            }
        }, "send referrer");
    }

    /* renamed from: lambda$setCoppaComplianceInDelay$49$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    void m5023x46726ce4(boolean z) {
        com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager = this.firstSessionDelayManager;
        if (firstSessionDelayManager.c != 3) {
            return;
        }
        firstSessionDelayManager.f3422a.getAdjustConfig().coppaComplianceEnabled = z;
    }

    /* renamed from: lambda$setEnabled$6$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5025lambda$setEnabled$6$comadjustsdkActivityHandler(final boolean z) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5024lambda$setEnabled$5$comadjustsdkActivityHandler(z);
            }
        }, z ? com.ironsource.mediationsdk.metadata.a.j : "disable");
    }

    /* renamed from: lambda$setExternalDeviceIdInDelay$51$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    void m5026x94e41b37(java.lang.String str) {
        com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager = this.firstSessionDelayManager;
        if (firstSessionDelayManager.c != 3) {
            return;
        }
        firstSessionDelayManager.f3422a.getAdjustConfig().externalDeviceId = str;
    }

    /* renamed from: lambda$setOfflineMode$8$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5028lambda$setOfflineMode$8$comadjustsdkActivityHandler(final boolean z) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5027lambda$setOfflineMode$7$comadjustsdkActivityHandler(z);
            }
        }, z ? "put SDK in offline mode" : "put SDK back to online mode");
    }

    /* renamed from: lambda$setPlayStoreKidsComplianceInDelay$50$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    void m5029xcaa71549(boolean z) {
        com.adjust.sdk.FirstSessionDelayManager firstSessionDelayManager = this.firstSessionDelayManager;
        if (firstSessionDelayManager.c != 3) {
            return;
        }
        firstSessionDelayManager.f3422a.getAdjustConfig().playStoreKidsComplianceEnabled = z;
    }

    /* renamed from: lambda$setPushToken$32$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5030lambda$setPushToken$32$comadjustsdkActivityHandler(boolean z, java.lang.String str) {
        if (!z) {
            com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(getContext()).savePushToken(str);
        }
        if (this.activityState == null) {
            return;
        }
        setPushTokenI(str);
    }

    /* renamed from: lambda$setPushToken$33$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5031lambda$setPushToken$33$comadjustsdkActivityHandler(final boolean z, final java.lang.String str) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5030lambda$setPushToken$32$comadjustsdkActivityHandler(z, str);
            }
        }, "set push token");
    }

    /* renamed from: lambda$trackAdRevenue$41$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5033lambda$trackAdRevenue$41$comadjustsdkActivityHandler(final com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda45
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5032lambda$trackAdRevenue$40$comadjustsdkActivityHandler(adjustAdRevenue);
            }
        }, "track ad revenue");
    }

    /* renamed from: lambda$trackEvent$3$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5034lambda$trackEvent$3$comadjustsdkActivityHandler(com.adjust.sdk.AdjustEvent adjustEvent) {
        if (this.activityState == null) {
            this.logger.warn("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new java.lang.Object[0]);
            startI();
        }
        trackEventI(adjustEvent);
    }

    /* renamed from: lambda$trackEvent$4$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5035lambda$trackEvent$4$comadjustsdkActivityHandler(final com.adjust.sdk.AdjustEvent adjustEvent) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5034lambda$trackEvent$3$comadjustsdkActivityHandler(adjustEvent);
            }
        }, "track event");
    }

    /* renamed from: lambda$trackMeasurementConsent$39$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5036lambda$trackMeasurementConsent$39$comadjustsdkActivityHandler(final boolean z) {
        this.firstSessionDelayManager.a("track measurement consent", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda28
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.tryTrackMeasurementConsentI(z);
            }
        });
    }

    /* renamed from: lambda$trackPlayStoreSubscription$43$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5038x53cd1473(final com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5037xcb9cd494(adjustPlayStoreSubscription);
            }
        }, "track play store subscription");
    }

    /* renamed from: lambda$trackThirdPartySharing$37$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5039lambda$trackThirdPartySharing$37$comadjustsdkActivityHandler(final com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        this.firstSessionDelayManager.a("track third party sharing", new com.adjust.sdk.IRunActivityHandler() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda21
            @Override // com.adjust.sdk.IRunActivityHandler
            public final void run(com.adjust.sdk.ActivityHandler activityHandler) {
                activityHandler.tryTrackThirdPartySharingI(com.adjust.sdk.AdjustThirdPartySharing.this);
            }
        });
    }

    /* renamed from: lambda$verifyAndTrackPlayStorePurchase$47$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5041xae4e9b37(final com.adjust.sdk.AdjustEvent adjustEvent, final com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5040x261e5b58(adjustEvent, onPurchaseVerificationFinishedListener);
            }
        }, "verify and track play store purchase");
    }

    /* renamed from: lambda$verifyPlayStorePurchase$45$com-adjust-sdk-ActivityHandler, reason: not valid java name */
    /* synthetic */ void m5043lambda$verifyPlayStorePurchase$45$comadjustsdkActivityHandler(final com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, final com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.firstSessionDelayManager.a(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5042lambda$verifyPlayStorePurchase$44$comadjustsdkActivityHandler(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
            }
        }, "verify play store purchase");
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchAttributionResponseTasks(final com.adjust.sdk.AttributionResponseData attributionResponseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.11
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.launchAttributionResponseTasksI(attributionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchEventResponseTasks(final com.adjust.sdk.EventResponseData eventResponseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.8
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.launchEventResponseTasksI(eventResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchPurchaseVerificationResponseTasks(final com.adjust.sdk.PurchaseVerificationResponseData purchaseVerificationResponseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.12
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.launchPurchaseVerificationResponseTasksI(purchaseVerificationResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSdkClickResponseTasks(final com.adjust.sdk.SdkClickResponseData sdkClickResponseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.9
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.launchSdkClickResponseTasksI(sdkClickResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void launchSessionResponseTasks(final com.adjust.sdk.SessionResponseData sessionResponseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.10
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.launchSessionResponseTasksI(sessionResponseData);
            }
        });
    }

    @Override // com.adjust.sdk.SystemLifecycle.SystemLifecycleCallback
    public void onActivityLifecycle(final boolean z) {
        try {
            this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    com.adjust.sdk.ActivityHandler.this.m5010lambda$onActivityLifecycle$1$comadjustsdkActivityHandler(z);
                }
            });
        } catch (java.lang.Exception unused) {
            com.adjust.sdk.ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.error("Exception while executing onActivityLifecycle task", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onPause() {
        onActivityLifecycle(false);
    }

    public void onPauseI() {
        stopForegroundTimerI();
        startBackgroundTimerI();
        this.logger.verbose("Subsession end", new java.lang.Object[0]);
        endI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void onResume() {
        onActivityLifecycle(true);
    }

    public void onResumeI() {
        stopBackgroundTimerI();
        startForegroundTimerI();
        this.logger.verbose("Subsession start", new java.lang.Object[0]);
        startI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processAndResolveDeeplink(final com.adjust.sdk.AdjustDeeplink adjustDeeplink, final long j, com.adjust.sdk.OnDeeplinkResolvedListener onDeeplinkResolvedListener) {
        this.cachedDeeplinkResolutionCallback = onDeeplinkResolvedListener;
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda49
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5012xe6a7b9ff(adjustDeeplink, j);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processDeeplink(final com.adjust.sdk.AdjustDeeplink adjustDeeplink, final long j) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5014lambda$processDeeplink$13$comadjustsdkActivityHandler(adjustDeeplink, j);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void processRemoteTriggers(final com.adjust.sdk.ResponseData responseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.13
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.processRemoteTriggersI(responseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameter(final java.lang.String str) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda46
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5015x867b5f33(str);
            }
        });
    }

    public void removeGlobalCallbackParameterI(java.lang.String str) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.X3.i.W, "Session Callback")) {
            java.util.Map<java.lang.String, java.lang.String> map = this.globalParameters.callbackParameters;
            if (map == null) {
                this.logger.warn("Session Callback parameters are not set", new java.lang.Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalCallbackParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalCallbackParameters() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5016xa96985e2();
            }
        });
    }

    public void removeGlobalCallbackParametersI() {
        if (this.globalParameters.callbackParameters == null) {
            this.logger.warn("Session Callback parameters are not set", new java.lang.Object[0]);
        }
        this.globalParameters.callbackParameters = null;
        writeGlobalCallbackParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameter(final java.lang.String str) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5017xa06b7e56(str);
            }
        });
    }

    public void removeGlobalPartnerParameterI(java.lang.String str) {
        if (com.adjust.sdk.Util.isValidParameter(str, com.ironsource.X3.i.W, "Session Partner")) {
            java.util.Map<java.lang.String, java.lang.String> map = this.globalParameters.partnerParameters;
            if (map == null) {
                this.logger.warn("Session Partner parameters are not set", new java.lang.Object[0]);
            } else if (map.remove(str) == null) {
                this.logger.warn("Key %s does not exist", str);
            } else {
                this.logger.debug("Key %s will be removed", str);
                writeGlobalPartnerParametersI();
            }
        }
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void removeGlobalPartnerParameters() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5018xe239026();
            }
        });
    }

    public void removeGlobalPartnerParametersI() {
        if (this.globalParameters.partnerParameters == null) {
            this.logger.warn("Session Partner parameters are not set", new java.lang.Object[0]);
        }
        this.globalParameters.partnerParameters = null;
        writeGlobalPartnerParametersI();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendInstallReferrer(final com.adjust.sdk.ReferrerDetails referrerDetails, final java.lang.String str) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.6
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.sendInstallReferrerI(referrerDetails, str);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendLicenseVerificationData(final com.adjust.sdk.LicenseData licenseData) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.7
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.sendLicenseVerificationDataI(licenseData);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendPreinstallReferrer() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5020lambda$sendPreinstallReferrer$19$comadjustsdkActivityHandler();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void sendReftagReferrer() {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5022lambda$sendReftagReferrer$17$comadjustsdkActivityHandler();
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setAskingAttribution(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.5
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.setAskingAttributionI(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setCoppaComplianceInDelay(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5023x46726ce4(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setEnabled(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5025lambda$setEnabled$6$comadjustsdkActivityHandler(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setExternalDeviceIdInDelay(final java.lang.String str) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5026x94e41b37(str);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setOfflineMode(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5028lambda$setOfflineMode$8$comadjustsdkActivityHandler(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPlayStoreKidsComplianceInDelay(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5029xcaa71549(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void setPushToken(final java.lang.String str, final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5031lambda$setPushToken$33$comadjustsdkActivityHandler(z, str);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void teardown() {
        com.adjust.sdk.scheduler.TimerOnce timerOnce = this.backgroundTimer;
        if (timerOnce != null) {
            timerOnce.teardown();
        }
        com.adjust.sdk.scheduler.TimerCycle timerCycle = this.foregroundTimer;
        if (timerCycle != null) {
            timerCycle.teardown();
        }
        com.adjust.sdk.scheduler.ThreadExecutor threadExecutor = this.executor;
        if (threadExecutor != null) {
            threadExecutor.teardown();
        }
        com.adjust.sdk.IPackageHandler iPackageHandler = this.packageHandler;
        if (iPackageHandler != null) {
            iPackageHandler.teardown();
        }
        com.adjust.sdk.IAttributionHandler iAttributionHandler = this.attributionHandler;
        if (iAttributionHandler != null) {
            iAttributionHandler.teardown();
        }
        com.adjust.sdk.ISdkClickHandler iSdkClickHandler = this.sdkClickHandler;
        if (iSdkClickHandler != null) {
            iSdkClickHandler.teardown();
        }
        com.adjust.sdk.IPurchaseVerificationHandler iPurchaseVerificationHandler = this.purchaseVerificationHandler;
        if (iPurchaseVerificationHandler != null) {
            iPurchaseVerificationHandler.teardown();
        }
        com.adjust.sdk.GlobalParameters globalParameters = this.globalParameters;
        if (globalParameters != null) {
            java.util.Map<java.lang.String, java.lang.String> map = globalParameters.callbackParameters;
            if (map != null) {
                map.clear();
            }
            java.util.Map<java.lang.String, java.lang.String> map2 = this.globalParameters.partnerParameters;
            if (map2 != null) {
                map2.clear();
            }
        }
        teardownActivityStateS();
        teardownAttributionS();
        teardownAllGlobalParametersS();
        teardownEventMetadataS();
        this.packageHandler = null;
        this.logger = null;
        this.foregroundTimer = null;
        this.executor = null;
        this.backgroundTimer = null;
        this.internalState = null;
        this.deviceInfo = null;
        this.adjustConfig = null;
        this.attributionHandler = null;
        this.sdkClickHandler = null;
        this.purchaseVerificationHandler = null;
        this.globalParameters = null;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackAdRevenue(final com.adjust.sdk.AdjustAdRevenue adjustAdRevenue) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5033lambda$trackAdRevenue$41$comadjustsdkActivityHandler(adjustAdRevenue);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackEvent(final com.adjust.sdk.AdjustEvent adjustEvent) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5035lambda$trackEvent$4$comadjustsdkActivityHandler(adjustEvent);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackMeasurementConsent(final boolean z) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5036lambda$trackMeasurementConsent$39$comadjustsdkActivityHandler(z);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackPlayStoreSubscription(final com.adjust.sdk.AdjustPlayStoreSubscription adjustPlayStoreSubscription) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5038x53cd1473(adjustPlayStoreSubscription);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void trackThirdPartySharing(final com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5039lambda$trackThirdPartySharing$37$comadjustsdkActivityHandler(adjustThirdPartySharing);
            }
        });
    }

    public void tryTrackMeasurementConsentI(boolean z) {
        if (canTrackMeasurementConsentI()) {
            trackMeasurementConsentI(z);
        } else {
            this.cachedLastMeasurementConsentTrack = java.lang.Boolean.valueOf(z);
        }
    }

    public void tryTrackThirdPartySharingI(com.adjust.sdk.AdjustThirdPartySharing adjustThirdPartySharing) {
        if (canTrackThirdPartySharingI()) {
            trackThirdPartySharingI(adjustThirdPartySharing);
            return;
        }
        if (this.cachedAdjustThirdPartySharingArray == null) {
            this.cachedAdjustThirdPartySharingArray = new java.util.ArrayList();
        }
        this.cachedAdjustThirdPartySharingArray.add(adjustThirdPartySharing);
    }

    @Override // com.adjust.sdk.IActivityHandler
    public boolean updateAttributionI(final com.adjust.sdk.AdjustAttribution adjustAttribution) {
        final java.util.ArrayList arrayList;
        final java.util.ArrayList arrayList2;
        if (adjustAttribution == null || this.activityState.askingAttribution) {
            return false;
        }
        synchronized (this.cachedAttributionReadCallbacks) {
            arrayList = null;
            if (this.cachedAttributionReadCallbacks.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = new java.util.ArrayList(this.cachedAttributionReadCallbacks);
                this.cachedAttributionReadCallbacks.clear();
            }
        }
        if (arrayList2 != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.3
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList2;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.OnAttributionReadListener onAttributionReadListener = (com.adjust.sdk.OnAttributionReadListener) obj;
                        if (onAttributionReadListener != null) {
                            onAttributionReadListener.onAttributionRead(adjustAttribution);
                        }
                    }
                }
            });
        }
        synchronized (this.cachedAttributionReadTimeoutCallbacks) {
            if (!this.cachedAttributionReadTimeoutCallbacks.isEmpty()) {
                arrayList = new java.util.ArrayList(this.cachedAttributionReadTimeoutCallbacks);
                this.cachedAttributionReadTimeoutCallbacks.clear();
            }
        }
        if (arrayList != null) {
            new android.os.Handler(this.adjustConfig.context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler.4
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.ArrayList arrayList3 = arrayList;
                    int size = arrayList3.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList3.get(i);
                        i++;
                        com.adjust.sdk.AdjustTimeoutCallback adjustTimeoutCallback = (com.adjust.sdk.AdjustTimeoutCallback) obj;
                        if (adjustTimeoutCallback != null) {
                            com.adjust.sdk.scheduler.TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                            if (timeoutTimer != null) {
                                timeoutTimer.cancel();
                            }
                            com.adjust.sdk.OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback.getOnAttributionReadListener();
                            if (onAttributionReadListener != null) {
                                onAttributionReadListener.onAttributionRead(adjustAttribution);
                            }
                            adjustTimeoutCallback.setOnAttributionReadListener(null);
                        }
                    }
                }
            });
        }
        if (adjustAttribution.equals(this.attribution)) {
            return false;
        }
        this.attribution = adjustAttribution;
        writeAttributionI();
        return true;
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyAndTrackPlayStorePurchase(final com.adjust.sdk.AdjustEvent adjustEvent, final com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5041xae4e9b37(adjustEvent, onPurchaseVerificationFinishedListener);
            }
        });
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void verifyPlayStorePurchase(final com.adjust.sdk.AdjustPlayStorePurchase adjustPlayStorePurchase, final com.adjust.sdk.OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda44
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5043lambda$verifyPlayStorePurchase$45$comadjustsdkActivityHandler(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
            }
        });
    }

    private void checkAfterNewStartI(com.adjust.sdk.SharedPreferencesManager sharedPreferencesManager) {
        java.lang.String pushToken = sharedPreferencesManager.getPushToken();
        if (pushToken != null && !pushToken.equals(this.activityState.pushToken)) {
            setPushToken(pushToken, true);
        }
        if (sharedPreferencesManager.getRawReferrerArray() != null) {
            sendReftagReferrer();
        }
        checkForPreinstallI();
        this.installReferrer.startConnection();
        readInstallReferrerMeta();
        readInstallReferrerHuaweiAds();
        readInstallReferrerHuaweiAppGallery();
        readInstallReferrerSamsung();
        readInstallReferrerXiaomi();
        readInstallReferrerVivo();
        readLicenseVerificationData();
    }

    private boolean pausedI(boolean z) {
        return z ? this.internalState.isOffline() || !isEnabledI() : this.internalState.isOffline() || !isEnabledI();
    }

    private boolean toSendI(boolean z) {
        if (pausedI(z)) {
            return false;
        }
        if (this.adjustConfig.isSendingInBackgroundEnabled) {
            return true;
        }
        return this.internalState.isInForeground();
    }

    @Override // com.adjust.sdk.IActivityHandler
    public void isEnabled(final com.adjust.sdk.OnIsEnabledListener onIsEnabledListener) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.ActivityHandler$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                com.adjust.sdk.ActivityHandler.this.m5006lambda$isEnabled$11$comadjustsdkActivityHandler(onIsEnabledListener);
            }
        });
    }
}
