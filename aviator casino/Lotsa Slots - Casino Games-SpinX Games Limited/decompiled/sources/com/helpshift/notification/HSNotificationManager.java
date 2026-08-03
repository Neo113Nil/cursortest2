package com.helpshift.notification;

/* loaded from: classes2.dex */
public class HSNotificationManager implements com.helpshift.notification.CoreNotificationManager, com.helpshift.notification.NotificationEventsProxy {
    private static final java.lang.String TAG = "notifMngr";
    private final android.content.Context context;
    private final com.helpshift.platform.Device device;
    private com.helpshift.analytics.HSAnalyticsEventDM hsAnalyticsEventDM;
    private com.helpshift.config.HSConfigManager hsConfigManager;
    private final com.helpshift.proactive.InAppViewManager inAppViewManager;
    private java.lang.ref.WeakReference<com.helpshift.notification.NotificationReceivedCallback> notificationReceivedCallback;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private com.helpshift.notification.HelpshiftNotificationResourceCacheManager resourceCacheManager;
    private final com.helpshift.concurrency.HSThreadingService threadingService;
    private final com.helpshift.user.UserManager userManager;
    private boolean shouldPauseInAppNotification = false;
    private java.util.concurrent.atomic.AtomicBoolean isInAppNotificationInProgress = new java.util.concurrent.atomic.AtomicBoolean(false);

    public HSNotificationManager(android.content.Context context, com.helpshift.platform.Device device, com.helpshift.user.UserManager userManager, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.proactive.InAppViewManager inAppViewManager) {
        this.context = context;
        this.device = device;
        this.persistentStorage = hSPersistentStorage;
        this.threadingService = hSThreadingService;
        this.inAppViewManager = inAppViewManager;
        this.userManager = userManager;
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setResourceCacheManager(com.helpshift.notification.HelpshiftNotificationResourceCacheManager helpshiftNotificationResourceCacheManager) {
        this.resourceCacheManager = helpshiftNotificationResourceCacheManager;
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setAnalyticsEventDM(com.helpshift.analytics.HSAnalyticsEventDM hSAnalyticsEventDM) {
        this.hsAnalyticsEventDM = hSAnalyticsEventDM;
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setConfigManager(com.helpshift.config.HSConfigManager hSConfigManager) {
        this.hsConfigManager = hSConfigManager;
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setNotificationChannelId(java.lang.String str) {
        this.persistentStorage.setNotificationChannelId(str);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setNotificationSoundId(int i) {
        this.persistentStorage.setNotificationSoundId(i);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setNotificationIcon(int i) {
        this.persistentStorage.setNotificationIcon(i);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setNotificationLargeIcon(int i) {
        this.persistentStorage.setNotificationLargeIcon(i);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setNotificationReceivedCallback(com.helpshift.notification.NotificationReceivedCallback notificationReceivedCallback) {
        this.notificationReceivedCallback = new java.lang.ref.WeakReference<>(notificationReceivedCallback);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void handlePush(java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        java.lang.String str = map.get("type");
        if (com.helpshift.util.Utils.isEmpty(str)) {
            str = "issue_message";
        }
        if ("issue_message".equalsIgnoreCase(str)) {
            com.helpshift.core.HSContext.getInstance().getUserManager().updatePushUnreadCountBy(1);
            handleNotificationForMessage(map.get("alert"), z);
        } else if (com.helpshift.util.ConfigValues.SOURCE_PROACTIVE.equalsIgnoreCase(str)) {
            handlePushForProactive(map);
        }
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void showIssueMessageNotification(java.lang.String str, boolean z) {
        handleNotificationForMessage(str, z);
    }

    private void handleNotificationForMessage(final java.lang.String str, boolean z) {
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        if (hSContext.isSdkOpen()) {
            this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.notification.HSNotificationManager.this.m5669xbcfbda17();
                }
            });
        } else {
            if (hSContext.isWebchatUIOpen()) {
                return;
            }
            if (z || this.persistentStorage.getEnableInAppNotification()) {
                this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.helpshift.notification.HSNotificationManager.this.m5670xaea58036(str);
                    }
                });
            }
        }
    }

    /* renamed from: lambda$handleNotificationForMessage$0$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5669xbcfbda17() {
        com.helpshift.notification.NotificationReceivedCallback notificationReceivedCallback;
        java.lang.ref.WeakReference<com.helpshift.notification.NotificationReceivedCallback> weakReference = this.notificationReceivedCallback;
        if (weakReference == null || (notificationReceivedCallback = weakReference.get()) == null) {
            return;
        }
        notificationReceivedCallback.onNotificationReceived();
    }

    /* renamed from: lambda$handleNotificationForMessage$1$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5670xaea58036(java.lang.String str) {
        showNotificationInternal(str, com.helpshift.activities.HSMainActivity.class);
    }

    private void handlePushForProactive(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "";
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            java.lang.String decodeZlib = this.device.decodeZlib(map.get("proactiveData"));
            if (com.helpshift.util.JsonUtils.isValidJsonString(decodeZlib)) {
                java.lang.String str5 = map.get("id");
                try {
                    java.lang.String str6 = map.get(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID);
                    try {
                        java.lang.Object obj = (java.lang.String) map.get(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TITLE);
                        java.lang.Object obj2 = (java.lang.String) map.get(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TEXT);
                        java.lang.Object valueOf = java.lang.Boolean.valueOf(map.get("defaultNotificationEnabled"));
                        java.lang.String str7 = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.proactive.InAppViewConstants.EXPIRY, java.lang.String.valueOf(currentTimeMillis + 172800000));
                        com.helpshift.log.HSLogger.d(TAG, "Preparing to show pro-active notification received from API. id " + com.helpshift.util.Utils.getMaskedString(str5));
                        str = TAG;
                        try {
                            if (!shouldShowNotificationIfUserMismatch(map, str5, str6, currentTimeMillis)) {
                                return;
                            }
                            this.persistentStorage.storeLastProactiveNotificationData(getProactiveAnalyticsEventDataToStore(str5, str6, str7, currentTimeMillis).toString());
                            java.lang.String encodeBase64 = this.device.encodeBase64(com.helpshift.util.JsonUtils.mapToJsonString(map));
                            org.json.JSONObject jSONObject = new org.json.JSONObject(decodeZlib);
                            java.lang.String str8 = map.get("subType");
                            if (!com.adjust.sdk.Constants.PUSH.equalsIgnoreCase(str8)) {
                                if ("inapp".equalsIgnoreCase(str8)) {
                                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                                    str3 = str5;
                                    try {
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, str3);
                                        str2 = str6;
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        str2 = str6;
                                    }
                                    try {
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, str2);
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, currentTimeMillis);
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TEXT, obj2);
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.FALLBACK_TITLE, obj);
                                        jSONObject2.put("defaultNotificationEnabled", valueOf);
                                        jSONObject2.put(com.helpshift.proactive.ProactiveNotificationConstants.ENCODED_NOTIF_PAYLOAD, encodeBase64);
                                        jSONObject2.put(com.helpshift.proactive.InAppViewConstants.EXPIRY, str7);
                                        jSONObject2.put(com.helpshift.proactive.InAppViewConstants.IN_APP_DATA, jSONObject);
                                        this.persistentStorage.storeInAppNotificationData(jSONObject2.toString());
                                        showProactiveInAppNotification(jSONObject2);
                                        return;
                                    } catch (java.lang.Exception e2) {
                                        e = e2;
                                        str4 = str3;
                                        handleExceptionInProactiveHandling(str4, str2, currentTimeMillis);
                                        com.helpshift.log.HSLogger.e(str, "Error handling proactive JSON payload. id " + com.helpshift.util.Utils.getMaskedString(str4), e);
                                    }
                                }
                                return;
                            }
                            try {
                                handleProactivePushNotification(encodeBase64, jSONObject, str5, str6, currentTimeMillis);
                                return;
                            } catch (java.lang.Exception e3) {
                                e = e3;
                                str2 = str6;
                                str4 = str5;
                            }
                        } catch (java.lang.Exception e4) {
                            e = e4;
                            str2 = str6;
                            str3 = str5;
                        }
                    } catch (java.lang.Exception e5) {
                        e = e5;
                        str2 = str6;
                        str3 = str5;
                        str = TAG;
                    }
                } catch (java.lang.Exception e6) {
                    e = e6;
                    str3 = str5;
                    str = TAG;
                    str2 = "";
                }
            } else {
                try {
                    com.helpshift.log.HSLogger.e(TAG, "Invalid json for proactive data! + \n" + decodeZlib);
                    handleExceptionInProactiveHandling("", "", currentTimeMillis);
                    return;
                } catch (java.lang.Exception e7) {
                    e = e7;
                    str2 = "";
                    str = TAG;
                }
            }
        } catch (java.lang.Exception e8) {
            e = e8;
            str = TAG;
            str2 = "";
        }
        handleExceptionInProactiveHandling(str4, str2, currentTimeMillis);
        com.helpshift.log.HSLogger.e(str, "Error handling proactive JSON payload. id " + com.helpshift.util.Utils.getMaskedString(str4), e);
    }

    private org.json.JSONObject getProactiveAnalyticsEventDataToStore(java.lang.String str, java.lang.String str2, java.lang.String str3, long j) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.helpshift.proactive.ProactiveNotificationConstants.NOTIFICATION_ID, str);
        jSONObject.put(com.helpshift.proactive.ProactiveNotificationConstants.ANALYTICS_ID, str2);
        jSONObject.put(com.helpshift.proactive.InAppViewConstants.EXPIRY, str3);
        jSONObject.put(com.helpshift.proactive.ProactiveNotificationConstants.DELIVERY_TIME, j);
        return jSONObject;
    }

    private boolean shouldShowNotificationIfUserMismatch(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2, long j) throws org.json.JSONException {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(map.get("shouldVerifyUser"));
        org.json.JSONObject jSONObject = new org.json.JSONObject(this.device.decodeZlib(map.get("userInfo")));
        boolean matchUserForNotification = com.helpshift.util.Utils.matchUserForNotification(this.userManager.getCurrentUser(), this.device, jSONObject.optString("appProfileId", ""), jSONObject.optString("uid", ""), jSONObject.optString("email", ""));
        if (!matchUserForNotification) {
            com.helpshift.log.HSLogger.d(TAG, " User mismatch for proactive notification. Logged in user and push notification user are different.");
            this.hsAnalyticsEventDM.addEventToStorage(j, com.helpshift.analytics.AnalyticsEventType.PROACTIVE_USER_MISMATCH, com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(str, str2, j));
        }
        if (!parseBoolean || matchUserForNotification) {
            return true;
        }
        com.helpshift.log.HSLogger.e(TAG, "Logged in user and push notification user are different. Skipping proactive notification.");
        return false;
    }

    private void showProactiveInAppNotification(org.json.JSONObject jSONObject) {
        com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
        com.helpshift.proactive.ProactiveInappNotification parseInAppNotification = com.helpshift.proactive.ProactiveNotificationParser.parseInAppNotification(this.persistentStorage, jSONObject);
        if (hSContext.isAppInBackground()) {
            boolean z = parseInAppNotification.isDefaultNotificationEnabled;
            com.helpshift.log.HSLogger.d(TAG, "App is in background, is fallback push enabled? - " + z);
            if (z) {
                com.helpshift.log.HSLogger.d(TAG, "Showing fallback push notification");
                showProactiveFallbackPushNotification(parseInAppNotification);
                return;
            }
            return;
        }
        showProactiveInAppNotificationInternal(parseInAppNotification, false, true);
    }

    private void showProactiveFallbackPushNotification(final com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSNotificationManager.this.m5674x911ba6c3(proactiveInappNotification);
            }
        });
    }

    /* renamed from: lambda$showProactiveFallbackPushNotification$2$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5674x911ba6c3(com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification) {
        com.helpshift.util.ApplicationUtil.showNotification(this.context, com.helpshift.notification.HSNotification.createProactiveFallbackNotification(this.context, this.device, proactiveInappNotification, getActiveNotificationChannel(this.context, proactiveInappNotification.supportEngageChannelId, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_ID, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_DESCRIPTION, proactiveInappNotification.defaultSoundId)).build(), proactiveInappNotification.notificationId);
    }

    private void handleProactivePushNotification(final java.lang.String str, org.json.JSONObject jSONObject, final java.lang.String str2, java.lang.String str3, long j) {
        final com.helpshift.proactive.ProactivePushNotification parsePushNotification = com.helpshift.proactive.ProactiveNotificationParser.parsePushNotification(jSONObject, this.device, this.persistentStorage, str2, str3, j);
        final java.lang.String activeProactiveNotificationChannelId = getActiveProactiveNotificationChannelId(parsePushNotification);
        if (!com.helpshift.util.ApplicationUtil.isNotificationAllowed(this.context)) {
            this.hsAnalyticsEventDM.addEventToStorage(j, com.helpshift.analytics.AnalyticsEventType.PROACTIVE_PUSH_NOT_ALLOWED, com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(parsePushNotification.notificationId, parsePushNotification.analyticsId, parsePushNotification.deliveryTime));
            com.helpshift.log.HSLogger.e(TAG, "Not showing proactive push notification as notification permission is not allowed");
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(parsePushNotification.largeImageUrl);
            this.resourceCacheManager.queueDownloads(hashSet, new com.helpshift.util.ValueListener() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda3
                @Override // com.helpshift.util.ValueListener
                public final void update(java.lang.Object obj) {
                    com.helpshift.notification.HSNotificationManager.this.m5672xd84353ae(str, activeProactiveNotificationChannelId, parsePushNotification, str2, (java.util.Map) obj);
                }
            });
        }
    }

    /* renamed from: lambda$handleProactivePushNotification$4$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5672xd84353ae(final java.lang.String str, final java.lang.String str2, final com.helpshift.proactive.ProactivePushNotification proactivePushNotification, final java.lang.String str3, final java.util.Map map) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSNotificationManager.this.m5671xe699ad8f(str, str2, proactivePushNotification, map, str3);
            }
        });
    }

    /* renamed from: lambda$handleProactivePushNotification$3$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5671xe699ad8f(java.lang.String str, java.lang.String str2, com.helpshift.proactive.ProactivePushNotification proactivePushNotification, java.util.Map map, java.lang.String str3) {
        com.helpshift.util.ApplicationUtil.showNotification(this.context, com.helpshift.notification.HSNotification.createProactiveNotification(this.context, str, str2, proactivePushNotification, (java.io.File) map.get(proactivePushNotification.largeImageUrl)).build(), str3);
    }

    private java.lang.String getActiveProactiveNotificationChannelId(com.helpshift.proactive.ProactivePushNotification proactivePushNotification) {
        if (proactivePushNotification.baseAction.action == com.helpshift.proactive.ProactiveActions.DEEPLINK && !com.helpshift.proactive.ProactiveNotificationParser.hasSupportAction(proactivePushNotification.buttons)) {
            return getActiveNotificationChannel(this.context, proactivePushNotification.clientProactiveEngageChannelId, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_ENGAGE_CHANNEL_ID, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_ENGAGE_CHANNEL_DESCRIPTION, proactivePushNotification.defaultSoundId);
        }
        return getActiveNotificationChannel(this.context, proactivePushNotification.clientProactiveSupportChannelId, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_ID, com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_PROACTIVE_SUPPORT_CHANNEL_DESCRIPTION, proactivePushNotification.defaultSoundId);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void showProactiveInAppNotificationIfPresent(boolean z) {
        java.lang.String inAppNotificationData = this.persistentStorage.getInAppNotificationData();
        if (com.helpshift.util.Utils.isEmpty(inAppNotificationData)) {
            com.helpshift.log.HSLogger.d(TAG, "No in-notification present in storage ");
            return;
        }
        if (!com.helpshift.util.JsonUtils.isValidJsonString(inAppNotificationData)) {
            com.helpshift.log.HSLogger.e(TAG, "Not showing in-app notification from storage, Invalid data");
            return;
        }
        try {
            com.helpshift.proactive.ProactiveInappNotification parseInAppNotification = com.helpshift.proactive.ProactiveNotificationParser.parseInAppNotification(this.persistentStorage, new org.json.JSONObject(inAppNotificationData));
            com.helpshift.log.HSLogger.d(TAG, "Preparing to show stored in-app notification, id " + com.helpshift.util.Utils.getMaskedString(parseInAppNotification.notificationId));
            showProactiveInAppNotificationInternal(parseInAppNotification, z, false);
        } catch (com.helpshift.proactive.HSProactiveParsingException e) {
            handleExceptionInProactiveHandling(e.notificationId, e.analyticsId, e.deliveryTime);
            com.helpshift.log.HSLogger.e(TAG, "Error in handling stored in-app notification ", e);
        } catch (java.lang.Exception e2) {
            handleExceptionInProactiveHandling("", "", 0L);
            com.helpshift.log.HSLogger.e(TAG, "Error in showing stored in-app notification ", e2);
        }
    }

    public void handleExceptionInProactiveHandling(java.lang.String str, java.lang.String str2, long j) {
        this.persistentStorage.storeInAppNotificationData("");
        this.persistentStorage.storeLastProactiveNotificationData("");
        this.isInAppNotificationInProgress.set(false);
        com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(this.hsAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_FAILED, java.lang.System.currentTimeMillis(), com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(str, str2, j));
    }

    private synchronized void showProactiveInAppNotificationInternal(final com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, final boolean z, final boolean z2) {
        try {
            if (this.isInAppNotificationInProgress.get()) {
                com.helpshift.log.HSLogger.d(TAG, "In app notification already in progress");
                return;
            }
            if (this.shouldPauseInAppNotification) {
                com.helpshift.log.HSLogger.d(TAG, "Not showing in-app notification since it's not allowed");
                return;
            }
            final com.helpshift.core.HSContext hSContext = com.helpshift.core.HSContext.getInstance();
            if (proactiveInappNotification.isExpired() && this.hsAnalyticsEventDM != null) {
                com.helpshift.log.HSLogger.d(TAG, "In-App notification is expired, id " + com.helpshift.util.Utils.getMaskedString(proactiveInappNotification.notificationId));
                com.helpshift.proactive.ProactiveAnalyticsUtil.sendInAppEventToAnalytics(this.hsAnalyticsEventDM, com.helpshift.analytics.AnalyticsEventType.IN_APP_EXPIRED, java.lang.System.currentTimeMillis(), com.helpshift.proactive.ProactiveAnalyticsUtil.getCommonEventData(proactiveInappNotification));
                com.helpshift.util.ApplicationUtil.cancelNotification(this.context, proactiveInappNotification.notificationId);
                this.persistentStorage.storeInAppNotificationData("");
                this.persistentStorage.storeLastProactiveNotificationData("");
                return;
            }
            this.isInAppNotificationInProgress.compareAndSet(false, true);
            java.util.HashSet hashSet = new java.util.HashSet();
            com.helpshift.proactive.InAppViewUtil.parseProactiveDataAndGetURLs(proactiveInappNotification.inAppData, hashSet);
            this.resourceCacheManager.queueDownloads(hashSet, new com.helpshift.util.ValueListener() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda5
                @Override // com.helpshift.util.ValueListener
                public final void update(java.lang.Object obj) {
                    com.helpshift.notification.HSNotificationManager.this.m5678xd0f491f2(z, proactiveInappNotification, hSContext, z2, (java.util.Map) obj);
                }
            });
        } catch (java.lang.Exception e) {
            throw new com.helpshift.proactive.HSProactiveParsingException(e.getMessage(), proactiveInappNotification, e);
        }
    }

    /* renamed from: lambda$showProactiveInAppNotificationInternal$8$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5678xd0f491f2(boolean z, final com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, final com.helpshift.core.HSContext hSContext, final boolean z2, final java.util.Map map) {
        long j = z ? proactiveInappNotification.showAfter : 0L;
        com.helpshift.log.HSLogger.d(TAG, "Adding a delay of " + j + " seconds before showing in-app notification");
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSNotificationManager.this.m5677xdf4aebd3(hSContext, proactiveInappNotification, map, z2);
            }
        }, j * 1000);
    }

    /* renamed from: lambda$showProactiveInAppNotificationInternal$7$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5677xdf4aebd3(final com.helpshift.core.HSContext hSContext, final com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, final java.util.Map map, final boolean z) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSNotificationManager.this.m5676xeda145b4(hSContext, proactiveInappNotification, map, z);
            }
        });
    }

    /* renamed from: lambda$showProactiveInAppNotificationInternal$6$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5676xeda145b4(com.helpshift.core.HSContext hSContext, com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, java.util.Map map, boolean z) {
        try {
            if (hSContext.isAppInBackground()) {
                this.isInAppNotificationInProgress.set(false);
                com.helpshift.log.HSLogger.d(TAG, "Not showing in-app notification, app is in background");
            } else if (!this.device.isOnline()) {
                this.isInAppNotificationInProgress.set(false);
                com.helpshift.log.HSLogger.d(TAG, "Not showing in-app notification, internet is not connected");
            } else if (hSContext.isWebchatUIOpen()) {
                this.isInAppNotificationInProgress.set(false);
                com.helpshift.log.HSLogger.d(TAG, "Not showing in-app notification, webchat is already open");
            } else {
                this.inAppViewManager.showInAppNotification(this.hsAnalyticsEventDM, this.hsConfigManager, proactiveInappNotification, map, z, new com.helpshift.proactive.InAppNotificationViewCallback() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda7
                    @Override // com.helpshift.proactive.InAppNotificationViewCallback
                    public final void inAppViewed() {
                        com.helpshift.notification.HSNotificationManager.this.m5675xfbf79f95();
                    }
                });
            }
        } catch (java.lang.Exception unused) {
            handleExceptionInProactiveHandling(proactiveInappNotification.notificationId, proactiveInappNotification.analyticsId, proactiveInappNotification.deliveryTime);
        }
    }

    /* renamed from: lambda$showProactiveInAppNotificationInternal$5$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5675xfbf79f95() {
        this.isInAppNotificationInProgress.set(false);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void showDebugLogNotification() {
        android.util.Log.d(TAG, "Posting debug notification");
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.notification.HSNotificationManager$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSNotificationManager.this.m5673x428af226();
            }
        });
    }

    /* renamed from: lambda$showDebugLogNotification$9$com-helpshift-notification-HSNotificationManager, reason: not valid java name */
    /* synthetic */ void m5673x428af226() {
        showNotificationInternal("Helpshift Debugger: Tap to share debug logs", com.helpshift.activities.HSDebugActivity.class);
    }

    private void showNotificationInternal(java.lang.String str, java.lang.Class<? extends android.app.Activity> cls) {
        androidx.core.app.NotificationCompat.Builder createNotification = com.helpshift.notification.HSNotification.createNotification(this.context, this.device, getActiveNotificationChannel(this.context, this.persistentStorage.getNotificationChannelId(), com.helpshift.notification.HSNotification.HELPSHIFT_DEFAULT_CHANNEL_ID, "", this.persistentStorage.getNotificationSoundId()), str, this.persistentStorage.getNotificationIcon(), this.persistentStorage.getNotificationLargeIcon(), this.persistentStorage.getNotificationSoundId(), cls);
        if (createNotification != null) {
            android.app.Notification build = createNotification.build();
            com.helpshift.log.HSLogger.d(TAG, "Notification built, trying to post now.");
            com.helpshift.util.ApplicationUtil.showNotification(this.context, build, cls.getName());
        }
    }

    private java.lang.String getActiveNotificationChannel(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 26) {
            return "";
        }
        if (com.helpshift.util.Utils.isEmpty(str)) {
            ensureDefaultNotificationChannelCreated(context, str2, str3, i);
            return str2;
        }
        deleteDefaultNotificationChannel(context, str2);
        return str;
    }

    private void deleteDefaultNotificationChannel(android.content.Context context, java.lang.String str) {
        android.app.NotificationManager notificationManager = com.helpshift.util.ApplicationUtil.getNotificationManager(context);
        if (notificationManager == null || notificationManager.getNotificationChannel(str) == null) {
            return;
        }
        notificationManager.deleteNotificationChannel(str);
    }

    private void ensureDefaultNotificationChannelCreated(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        android.app.NotificationManager notificationManager = com.helpshift.util.ApplicationUtil.getNotificationManager(context);
        if (notificationManager == null) {
            return;
        }
        android.net.Uri notificationSoundUri = com.helpshift.notification.HSNotification.getNotificationSoundUri(context, i);
        android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel != null) {
            if (notificationSoundUri != null) {
                notificationChannel.setSound(notificationSoundUri, new android.media.AudioAttributes.Builder().build());
                return;
            }
            return;
        }
        android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(str, str, 3);
        notificationChannel2.setDescription(str2);
        notificationChannel2.enableVibration(true);
        notificationChannel2.enableLights(true);
        if (notificationSoundUri != null) {
            notificationChannel2.setSound(notificationSoundUri, new android.media.AudioAttributes.Builder().build());
        }
        notificationManager.createNotificationChannel(notificationChannel2);
    }

    @Override // com.helpshift.notification.CoreNotificationManager, com.helpshift.notification.NotificationEventsProxy
    public void cancelNotifications() {
        com.helpshift.util.ApplicationUtil.cancelNotification(this.context);
    }

    @Override // com.helpshift.notification.CoreNotificationManager
    public void setShouldPauseInAppNotification(boolean z) {
        this.shouldPauseInAppNotification = z;
        if (z) {
            return;
        }
        showProactiveInAppNotificationIfPresent(false);
    }
}
