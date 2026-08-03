package com.helpshift.faq;

/* loaded from: classes2.dex */
public class HSHelpcenterEventsHandler {
    private static final java.lang.String ACTION_AUTH_TOKEN_UPDATE = "authTokenUpdate";
    private static final java.lang.String ACTION_CLEAR_USER_TRAIL = "clearUserTrail";
    private static final java.lang.String ACTION_REFRESH_TOKEN_EXPIRED = "refreshTokenExpired";
    private static final java.lang.String ACTION_TYPE = "actionType";
    private static final java.lang.String TAG = "HSHelpcenterEventsHandler";
    private final com.helpshift.config.HSConfigManager configManager;
    private final com.helpshift.cache.HelpshiftResourceCacheManager resourceCacheManager;
    private final com.helpshift.concurrency.HSThreadingService threadingService;
    private java.lang.ref.WeakReference<com.helpshift.faq.HelpcenterToUiCallback> uiCallback;
    private final com.helpshift.user.UserManager userManager;
    private boolean isPageCommitVisibleReceived = false;
    private java.lang.String storedNativeColorsJson = "";

    public HSHelpcenterEventsHandler(com.helpshift.user.UserManager userManager, com.helpshift.config.HSConfigManager hSConfigManager, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.cache.HelpshiftResourceCacheManager helpshiftResourceCacheManager) {
        this.configManager = hSConfigManager;
        this.threadingService = hSThreadingService;
        this.resourceCacheManager = helpshiftResourceCacheManager;
        this.userManager = userManager;
    }

    public void setHelpcenterUiCallback(com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback) {
        this.uiCallback = new java.lang.ref.WeakReference<>(helpcenterToUiCallback);
    }

    /* renamed from: lambda$onSetAdditionalHelpcenterData$0$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5662x4750cdd6(java.lang.String str) {
        this.configManager.setAdditionalHelpcenterData(str);
    }

    public void onSetAdditionalHelpcenterData(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5662x4750cdd6(str);
            }
        });
    }

    /* renamed from: lambda$onRemoveAdditionalHelpcenterData$1$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5661xb786bd71(java.lang.String str) {
        this.configManager.removeAdditionalHelpcenterData(str);
    }

    public void onRemoveAdditionalHelpcenterData(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5661xb786bd71(str);
            }
        });
    }

    public void closeHelpcenter() {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5653x863b633c();
            }
        });
    }

    /* renamed from: lambda$closeHelpcenter$2$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5653x863b633c() {
        com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback = this.uiCallback.get();
        if (helpcenterToUiCallback != null) {
            helpcenterToUiCallback.closeHelpcenter();
        }
    }

    public void openWebchat() {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5663lambda$openWebchat$3$comhelpshiftfaqHSHelpcenterEventsHandler();
            }
        });
    }

    /* renamed from: lambda$openWebchat$3$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5663lambda$openWebchat$3$comhelpshiftfaqHSHelpcenterEventsHandler() {
        com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback = this.uiCallback.get();
        if (helpcenterToUiCallback != null) {
            helpcenterToUiCallback.openWebchat();
        }
    }

    public void onHelpcenterLoaded(java.lang.String str) {
        com.helpshift.log.HSLogger.d(TAG, "onHelpcenterLoaded received in EventsHandler. isPageCommitVisible: " + this.isPageCommitVisibleReceived);
        this.storedNativeColorsJson = str;
        if (this.isPageCommitVisibleReceived) {
            loadHelpCenter(str);
        } else {
            loadHCWithFallbackDelay(20);
        }
    }

    private void loadHCWithFallbackDelay(final int i) {
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5657x75c1378a(i);
            }
        }, 100L);
    }

    /* renamed from: lambda$loadHCWithFallbackDelay$4$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5657x75c1378a(int i) {
        if (this.isPageCommitVisibleReceived || i == 0) {
            loadHelpCenter(this.storedNativeColorsJson);
        } else {
            loadHCWithFallbackDelay(i - 1);
        }
    }

    private void loadHelpCenter(final java.lang.String str) {
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5658xaa8ef3a7(str);
            }
        });
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5659x452fb628(str);
            }
        });
    }

    /* renamed from: lambda$loadHelpCenter$5$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5658xaa8ef3a7(java.lang.String str) {
        com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback = this.uiCallback.get();
        if (helpcenterToUiCallback != null) {
            helpcenterToUiCallback.onHelpcenterLoaded();
            helpcenterToUiCallback.setNativeUiColors(str);
            helpcenterToUiCallback.showNotificationBadgeOnHCLoad();
        }
    }

    /* renamed from: lambda$loadHelpCenter$6$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5659x452fb628(java.lang.String str) {
        this.configManager.saveUiConfigDataOfHelpcenter(str);
    }

    public void onHelpcenterError() {
        deleteAllCachedFilesOfHelpcenter();
        this.threadingService.runOnUIThread(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5660xa2049846();
            }
        });
    }

    /* renamed from: lambda$onHelpcenterError$7$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5660xa2049846() {
        com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback = this.uiCallback.get();
        if (helpcenterToUiCallback != null) {
            helpcenterToUiCallback.onHelpcenterError();
        }
    }

    public void onHCPageCommitVisible() {
        this.isPageCommitVisibleReceived = true;
    }

    private void deleteAllCachedFilesOfHelpcenter() {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5654x53303ba();
            }
        });
    }

    /* renamed from: lambda$deleteAllCachedFilesOfHelpcenter$8$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5654x53303ba() {
        this.resourceCacheManager.deleteAllCachedFiles();
    }

    public void getWebchatData() {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5655x7c96c36f();
            }
        });
    }

    /* renamed from: lambda$getWebchatData$9$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5655x7c96c36f() {
        com.helpshift.faq.HelpcenterToUiCallback helpcenterToUiCallback = this.uiCallback.get();
        if (helpcenterToUiCallback != null) {
            helpcenterToUiCallback.getWebchatData();
        }
    }

    public void hcActionSync(final java.lang.String str) {
        this.threadingService.runSerial(new java.lang.Runnable() { // from class: com.helpshift.faq.HSHelpcenterEventsHandler$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.faq.HSHelpcenterEventsHandler.this.m5656x934c33f7(str);
            }
        });
    }

    /* renamed from: lambda$hcActionSync$10$com-helpshift-faq-HSHelpcenterEventsHandler, reason: not valid java name */
    /* synthetic */ void m5656x934c33f7(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                java.lang.String string = jSONObject.getString("actionType");
                com.helpshift.log.HSLogger.d(TAG, "Received action type " + string);
                if (ACTION_CLEAR_USER_TRAIL.equalsIgnoreCase(string)) {
                    this.configManager.clearUserTrail();
                } else if (ACTION_AUTH_TOKEN_UPDATE.equalsIgnoreCase(string)) {
                    storeAuthTokens(jSONObject);
                } else if (ACTION_REFRESH_TOKEN_EXPIRED.equalsIgnoreCase(string)) {
                    this.userManager.sessionExpiryLogoutWhenSDKIsOpen();
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in executing action updates from Helpcenter.", e);
        }
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
            com.helpshift.log.HSLogger.d(TAG, "Stored new tokens for user from HC: " + com.helpshift.util.Utils.isEmpty(optString) + com.helpshift.util.Utils.isEmpty(optString2));
            return;
        }
        com.helpshift.log.HSLogger.e(TAG, "Received tokens for non-identity user");
    }
}
