package com.helpshift.chat;

/* loaded from: classes.dex */
public class HSChatEventsHandler {
    private static final java.lang.String ACTION_AUTH_TOKEN_UPDATE = "authTokenUpdate";
    private static final java.lang.String ACTION_REFRESH_TOKEN_EXPIRED = "refreshTokenExpired";
    private static final java.lang.String ACTION_TYPE = "actionType";
    private static final java.lang.String TAG = "wbEvntHndlr";
    private final com.helpshift.config.HSConfigManager configManager;
    private final com.helpshift.storage.HSGenericDataManager genericDataManager;
    private boolean isPageCommitVisibleReceived = false;
    private final com.helpshift.migrator.NativeToSdkxMigrator nativeToSdkxMigrator;
    private final com.helpshift.cache.HelpshiftResourceCacheManager resourceCacheManager;
    private final com.helpshift.concurrency.HSThreadingService threadingService;
    private java.lang.ref.WeakReference<com.helpshift.chat.HSWebchatToUiCallback> uiCallback;
    private final com.helpshift.user.UserManager userManager;

    public HSChatEventsHandler(com.helpshift.user.UserManager userManager, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.config.HSConfigManager hSConfigManager, com.helpshift.cache.HelpshiftResourceCacheManager helpshiftResourceCacheManager, com.helpshift.storage.HSGenericDataManager hSGenericDataManager, com.helpshift.migrator.NativeToSdkxMigrator nativeToSdkxMigrator) {
        this.threadingService = hSThreadingService;
        this.userManager = userManager;
        this.configManager = hSConfigManager;
        this.resourceCacheManager = helpshiftResourceCacheManager;
        this.genericDataManager = hSGenericDataManager;
        this.nativeToSdkxMigrator = nativeToSdkxMigrator;
    }

    public void setUiEventsListener(com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback) {
        this.uiCallback = new java.lang.ref.WeakReference<>(hSWebchatToUiCallback);
    }

    public void sdkxMigrationLogSynced(boolean z) {
        this.nativeToSdkxMigrator.setErrorLogsSyncedWithWebchat(z);
    }

    /* renamed from: lambda$onSetLocalStorage$0$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5637x8daf4b33(java.lang.String str) {
        this.configManager.setLocalStorageData(str);
    }

    public void onSetLocalStorage(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5637x8daf4b33(str);
            }
        });
    }

    /* renamed from: lambda$onRemoveLocalStorage$1$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5636x81910fb8(java.lang.String str) {
        this.configManager.removeLocalStorageData(str);
    }

    public void onRemoveLocalStorage(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5636x81910fb8(str);
            }
        });
    }

    public void getHelpcenterData() {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.setHelpcenterData();
        }
    }

    /* renamed from: lambda$onReceivePushTokenSyncRequestData$2$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5634x3c1852c1() {
        this.userManager.setPushTokenSynced(true);
    }

    public void onReceivePushTokenSyncRequestData(java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5634x3c1852c1();
            }
        });
    }

    /* renamed from: lambda$onRemoveAnonymousUser$3$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5635x76ede46e() {
        this.userManager.removeAnonymousUser();
    }

    public void onRemoveAnonymousUser() {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5635x76ede46e();
            }
        });
    }

    void setPollingStatus(java.lang.String str) {
        try {
            this.userManager.setShouldPollFlag(new org.json.JSONObject(str).optBoolean("shouldPoll", false));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error getting polling status", e);
        }
    }

    /* renamed from: lambda$setGenericSdkData$4$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5643x9276ae33(java.lang.String str) {
        this.genericDataManager.saveGenericSdkData(str);
    }

    void setGenericSdkData(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5643x9276ae33(str);
            }
        });
    }

    void setIssueExistsForUser(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5644x77c5b720(str);
            }
        });
    }

    /* renamed from: lambda$setIssueExistsForUser$5$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5644x77c5b720(java.lang.String str) {
        try {
            boolean optBoolean = new org.json.JSONObject(str).optBoolean("issueExists", false);
            this.userManager.setShowChatIconInHelpcenter(optBoolean);
            if (optBoolean) {
                com.helpshift.user.UserManager userManager = this.userManager;
                userManager.removeUserFromErrorList(userManager.getHashForActiveUser());
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "error in getting the issue exist flag", e);
        }
    }

    void onWebchatClosed() {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5640lambda$onWebchatClosed$6$comhelpshiftchatHSChatEventsHandler();
            }
        });
    }

    /* renamed from: lambda$onWebchatClosed$6$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5640lambda$onWebchatClosed$6$comhelpshiftchatHSChatEventsHandler() {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.onWebchatClosed();
        }
    }

    void onWebchatLoaded() {
        com.helpshift.log.HSLogger.d(TAG, "onWebchatLoaded received in EventsHandler. isPageCommitVisible: " + this.isPageCommitVisibleReceived);
        if (this.isPageCommitVisibleReceived) {
            loadWC();
        } else {
            loadWCWithFallbackDelay(20);
        }
    }

    private void loadWCWithFallbackDelay(final int i) {
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5633x27f235f6(i);
            }
        }, 100L);
    }

    /* renamed from: lambda$loadWCWithFallbackDelay$7$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5633x27f235f6(int i) {
        if (this.isPageCommitVisibleReceived || i == 0) {
            loadWC();
        } else {
            loadWCWithFallbackDelay(i - 1);
        }
    }

    private void loadWC() {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5632lambda$loadWC$8$comhelpshiftchatHSChatEventsHandler();
            }
        });
    }

    /* renamed from: lambda$loadWC$8$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5632lambda$loadWC$8$comhelpshiftchatHSChatEventsHandler() {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.onWebchatLoaded();
        }
    }

    void onWebchatError(final java.lang.String str) {
        deleteAllCachedFilesOfWebchat();
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5641lambda$onWebchatError$9$comhelpshiftchatHSChatEventsHandler(str);
            }
        });
    }

    /* renamed from: lambda$onWebchatError$9$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5641lambda$onWebchatError$9$comhelpshiftchatHSChatEventsHandler(java.lang.String str) {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.onWebchatError(str);
        }
    }

    void onUserAuthenticationFailure() {
        deleteAllCachedFilesOfWebchat();
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5639x44ac3b1d();
            }
        });
    }

    /* renamed from: lambda$onUserAuthenticationFailure$10$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5639x44ac3b1d() {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.onUserAuthenticationFailure();
        }
    }

    private void deleteAllCachedFilesOfWebchat() {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5631x716662ea();
            }
        });
    }

    /* renamed from: lambda$deleteAllCachedFilesOfWebchat$11$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5631x716662ea() {
        this.resourceCacheManager.deleteAllCachedFiles();
    }

    void onUiConfigChange(final java.lang.String str) {
        saveUiConfigDataForWebchat(str);
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5638xbcd8b8f2(str);
            }
        });
    }

    /* renamed from: lambda$onUiConfigChange$12$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5638xbcd8b8f2(java.lang.String str) {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.onUiConfigChange(str);
        }
    }

    private void saveUiConfigDataForWebchat(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5642xf8c15b2c(str);
            }
        });
    }

    /* renamed from: lambda$saveUiConfigDataForWebchat$13$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5642xf8c15b2c(java.lang.String str) {
        this.configManager.saveUiConfigDataOfWebchat(str);
    }

    void requestConversationMetadata(java.lang.String str) {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.requestConversationMetadata(str);
        }
    }

    void webchatJsFileLoaded() {
        com.helpshift.chat.HSWebchatToUiCallback hSWebchatToUiCallback = this.uiCallback.get();
        if (hSWebchatToUiCallback != null) {
            hSWebchatToUiCallback.webchatJsFileLoaded();
        }
    }

    void wcActionSync(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.chat.HSChatEventsHandler$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.chat.HSChatEventsHandler.this.m5645lambda$wcActionSync$14$comhelpshiftchatHSChatEventsHandler(str);
            }
        });
    }

    /* renamed from: lambda$wcActionSync$14$com-helpshift-chat-HSChatEventsHandler, reason: not valid java name */
    /* synthetic */ void m5645lambda$wcActionSync$14$comhelpshiftchatHSChatEventsHandler(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String string = jSONObject.getString("actionType");
                com.helpshift.log.HSLogger.d(TAG, "Received action type " + string);
                if (ACTION_AUTH_TOKEN_UPDATE.equalsIgnoreCase(string)) {
                    storeAuthTokens(jSONObject);
                } else if (ACTION_REFRESH_TOKEN_EXPIRED.equalsIgnoreCase(string)) {
                    this.userManager.sessionExpiryLogoutWhenSDKIsOpen();
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in executing action updates from Webchat", e);
        }
    }

    public void onWCPageCommitVisible() {
        this.isPageCommitVisibleReceived = true;
    }

    private void storeAuthTokens(org.json.JSONObject jSONObject) {
        if (this.userManager.getCurrentUser() instanceof com.helpshift.user.UserWithIdentity) {
            com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) this.userManager.getCurrentUser();
            java.lang.String optString = jSONObject.optString("accessToken", "");
            java.lang.String optString2 = jSONObject.optString("refreshToken", "");
            long optLong = jSONObject.optLong("refreshTokenExpiry", 0L);
            userWithIdentity.setAccessToken(optString);
            userWithIdentity.setRefreshToken(optString2);
            userWithIdentity.setRefreshTokenExpiry(optLong);
            com.helpshift.log.HSLogger.d(TAG, "Stored new tokens for user from WebChat: " + com.helpshift.util.Utils.isEmpty(optString) + io.ktor.sse.ServerSentEventKt.SPACE + com.helpshift.util.Utils.isEmpty(optString2));
            return;
        }
        com.helpshift.log.HSLogger.e(TAG, "Received tokens for non-identity user");
    }
}
