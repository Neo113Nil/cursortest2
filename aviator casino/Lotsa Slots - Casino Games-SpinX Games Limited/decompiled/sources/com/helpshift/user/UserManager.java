package com.helpshift.user;

/* loaded from: classes5.dex */
public class UserManager implements com.helpshift.network.UserManagerProxy {
    public static final java.lang.String APP_ATTRIBUTES = "app_attributes";
    public static final java.lang.String ERROR = "error";
    public static final java.lang.String LOGIN_CALL_ALREADY_IN_PROGRESS = "login call already in progress";
    private static final java.lang.String TAG = "UsrMngr";
    private static final java.util.Set<java.lang.String> usersNotFound = new java.util.HashSet();
    private final com.helpshift.user.AnonymousUser anonymousUser;
    private com.helpshift.poller.ConversationPoller conversationPoller;
    private final com.helpshift.platform.Device device;
    private com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate;
    private final com.helpshift.storage.HSGenericDataManager genericDataManager;
    private final com.helpshift.chat.HSEventProxy hsEventProxy;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;
    private final com.helpshift.network.HTTPTransport httpTransport;
    private com.helpshift.poller.SimplePoller identityDataSyncPoller;
    private com.helpshift.notification.NotificationEventsProxy notificationEventsProxy;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.notification.HSPushTokenManager pushTokenManager;
    private final com.helpshift.analytics.HSWebchatAnalyticsManager webchatAnalyticsManager;
    private final java.util.Map<java.lang.String, java.lang.ref.WeakReference<com.helpshift.user_lifecyle.UserLifecycleListener>> userLifecycleListeners = new java.util.HashMap();
    private java.util.concurrent.atomic.AtomicBoolean isLoginCallInProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.util.concurrent.atomic.AtomicBoolean dataSyncCallProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean loginOnSessionExpiryMarker = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected com.helpshift.user.BaseUser currentUser = initiateLoggedInUser();

    public UserManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.notification.HSPushTokenManager hSPushTokenManager, com.helpshift.storage.HSGenericDataManager hSGenericDataManager, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.network.HTTPTransport hTTPTransport, com.helpshift.platform.Device device, com.helpshift.chat.HSEventProxy hSEventProxy, com.helpshift.analytics.HSWebchatAnalyticsManager hSWebchatAnalyticsManager) {
        this.persistentStorage = hSPersistentStorage;
        this.genericDataManager = hSGenericDataManager;
        this.pushTokenManager = hSPushTokenManager;
        this.hsThreadingService = hSThreadingService;
        this.httpTransport = hTTPTransport;
        this.device = device;
        this.hsEventProxy = hSEventProxy;
        this.anonymousUser = new com.helpshift.user.AnonymousUser(hSPersistentStorage);
        this.webchatAnalyticsManager = hSWebchatAnalyticsManager;
    }

    private com.helpshift.user.BaseUser initiateLoggedInUser() {
        com.helpshift.user.AnonymousUser anonymousUser = new com.helpshift.user.AnonymousUser(this.persistentStorage);
        try {
            if (com.helpshift.util.Utils.isEmpty(this.persistentStorage.getActiveUser())) {
                return anonymousUser;
            }
            java.lang.String string = this.persistentStorage.getString(com.helpshift.user.UserConstants.ACTIVE_USER_DATA);
            return (com.helpshift.util.Utils.isNotEmpty(string) && com.helpshift.util.JsonUtils.isValidJsonString(string)) ? getUserFromType(new org.json.JSONObject(string).optInt(com.helpshift.user.UserConstants.USER_TYPE, 0)) : anonymousUser;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error initializing user", e);
            return anonymousUser;
        }
    }

    public com.helpshift.user.BaseUser getCurrentUser() {
        return this.currentUser;
    }

    public void setConversationPoller(com.helpshift.poller.ConversationPoller conversationPoller) {
        this.conversationPoller = conversationPoller;
    }

    public void setIdentityDataSyncPoller(com.helpshift.poller.SimplePoller simplePoller) {
        this.identityDataSyncPoller = simplePoller;
        startIdentityDataSyncPoller("user_init");
    }

    public void setFetchNotificationUpdateFunction(com.helpshift.poller.FetchNotificationUpdate fetchNotificationUpdate) {
        this.fetchNotificationUpdate = fetchNotificationUpdate;
    }

    private void sendLoginEventToUserLifecycle() {
        for (java.util.Map.Entry<java.lang.String, java.lang.ref.WeakReference<com.helpshift.user_lifecyle.UserLifecycleListener>> entry : this.userLifecycleListeners.entrySet()) {
            if (entry.getValue().get() != null) {
                entry.getValue().get().onUserDidLogin();
            }
        }
    }

    private void sendLogoutEventToUserLifecycle() {
        for (java.util.Map.Entry<java.lang.String, java.lang.ref.WeakReference<com.helpshift.user_lifecyle.UserLifecycleListener>> entry : this.userLifecycleListeners.entrySet()) {
            if (entry.getValue().get() != null) {
                entry.getValue().get().onUserDidLogout();
            }
        }
    }

    public boolean retryPushTokenSync() {
        if (isPushTokenSynced() || com.helpshift.util.Utils.isEmpty(this.persistentStorage.getCurrentPushToken())) {
            return false;
        }
        if (this.currentUser.isIdentityUser()) {
            collectAndStoreSDKCollectibleAttributes();
            triggerIdentityAttributeSync();
            return true;
        }
        if (!shouldPoll()) {
            return false;
        }
        this.pushTokenManager.registerPushTokenWithBackend(this, this.persistentStorage.getCurrentPushToken(), getActiveUserDataForNetworkCall(), new com.helpshift.user.UpdatePushSyncStatus(this));
        return true;
    }

    public void registerPushToken(final java.lang.String str) {
        if (com.helpshift.util.Utils.isEmpty(str) || !shouldSyncPushToken(str)) {
            return;
        }
        boolean z = com.helpshift.util.Utils.isNotEmpty(str) && !str.equals(this.persistentStorage.getCurrentPushToken());
        this.pushTokenManager.savePushToken(str);
        setPushTokenSynced(false);
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = this.currentUser.getUserLoginInfo();
        if (!(isUserDataNeededForNetworkCall() && com.helpshift.util.Utils.isEmpty(userLoginInfo)) && z) {
            if (this.currentUser.isIdentityUser()) {
                collectAndStoreSDKCollectibleAttributes();
                triggerIdentityAttributeSync();
            } else if (shouldPoll()) {
                this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.helpshift.user.UserManager.this.m5703lambda$registerPushToken$0$comhelpshiftuserUserManager(str);
                    }
                });
            }
        }
    }

    /* renamed from: lambda$registerPushToken$0$com-helpshift-user-UserManager, reason: not valid java name */
    /* synthetic */ void m5703lambda$registerPushToken$0$comhelpshiftuserUserManager(java.lang.String str) {
        this.fetchNotificationUpdate.execute(com.helpshift.util.Utils.ORIGIN_REGISTER_PUSH_TOKEN, getHashForUser(this.currentUser), true);
        if (shouldPoll()) {
            this.pushTokenManager.registerPushTokenWithBackend(this, str, getActiveUserDataForNetworkCall(), new com.helpshift.user.UpdatePushSyncStatus(this));
        }
    }

    private void registerPushTokenWithBackend(com.helpshift.user.UserManager userManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.helpshift.user.UpdatePushSyncStatus updatePushSyncStatus) {
        if (this.currentUser.isIdentityUser()) {
            collectAndStoreSDKCollectibleAttributes();
            triggerIdentityAttributeSync();
        } else {
            this.pushTokenManager.registerPushTokenWithBackend(userManager, str, map, updatePushSyncStatus);
        }
    }

    private void clearAnonymousUserOnLogin() {
        if (getClearAnonymousUserOnLoginFlag()) {
            this.anonymousUser.removeAnonymousUser();
            generateAndSaveAnonymousUserIdIfNeeded();
            this.persistentStorage.retainAnonUidForIdentityUser("");
        }
    }

    public void removeAnonymousUser() {
        this.anonymousUser.removeAnonymousUser();
    }

    private com.helpshift.user.BaseUser getUserFromType(int i) {
        if (i == 0) {
            return new com.helpshift.user.OldLoginUser(this.persistentStorage);
        }
        if (i == 1) {
            return new com.helpshift.user.UserWithIdentity(this.persistentStorage);
        }
        if (i == 2) {
            return new com.helpshift.user.AnonymousUserWithIdentity(this.persistentStorage);
        }
        return new com.helpshift.user.AnonymousUser(this.persistentStorage);
    }

    void onNewLoginSuccess(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2, boolean z, boolean z2) {
        this.conversationPoller.stopPoller();
        stopIdentityDataSyncPoller("new_login");
        if (isPushTokenSynced()) {
            deregisterPushTokenOrLogout(this.currentUser.isIdentityUser());
        }
        boolean z3 = this.currentUser instanceof com.helpshift.user.AnonymousUserWithIdentity;
        int intValue = ((java.lang.Integer) map2.get(com.helpshift.user.UserConstants.USER_TYPE)).intValue();
        this.currentUser = getUserFromType(intValue);
        this.persistentStorage.shouldAllowUserSessionExpiryAlerts(intValue == 1 || intValue == 2);
        boolean z4 = this.currentUser instanceof com.helpshift.user.AnonymousUserWithIdentity;
        if (!z3 || !z4) {
            clearAnonymousUserOnLogin();
        }
        this.persistentStorage.retainAnonUidForIdentityUser((java.lang.String) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.AnonymousUserWithIdentity.ANONYMOUS_USER_WITH_IDENTITY_ID, ""));
        if (!z || !z2) {
            cleanUpActiveUser(this.currentUser);
        }
        collectAndStoreSDKCollectibleAttributes();
        this.persistentStorage.setActiveUser(new org.json.JSONObject(map).toString());
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map2.entrySet()) {
            this.currentUser.setUserDataValues(entry.getKey(), entry.getValue());
        }
        startIdentityDataSyncPoller(com.google.firebase.analytics.FirebaseAnalytics.Event.LOGIN);
        sendLoginEventToUserLifecycle();
        this.loginOnSessionExpiryMarker.set(true);
        startNotificationUpdatesSync(this.currentUser, com.helpshift.util.Utils.ORIGIN_LOGIN_WITH_USER);
    }

    private void logoutUserWithBackend() {
        if (this.currentUser.isIdentityUser()) {
            try {
                final com.helpshift.network.HSRequestData requestDataForLogout = com.helpshift.network.NetworkUtils.getRequestDataForLogout(this.persistentStorage, (com.helpshift.user.UserWithIdentity) this.currentUser, this.device);
                final com.helpshift.network.POSTNetwork pOSTNetwork = new com.helpshift.network.POSTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getLogoutRoute(this.persistentStorage));
                this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.helpshift.user.UserManager.lambda$logoutUserWithBackend$1(com.helpshift.network.HSNetwork.this, requestDataForLogout);
                    }
                });
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error in logging out user", e);
            }
        }
    }

    static /* synthetic */ void lambda$logoutUserWithBackend$1(com.helpshift.network.HSNetwork hSNetwork, com.helpshift.network.HSRequestData hSRequestData) {
        try {
            hSNetwork.makeRequest(hSRequestData);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Netowrk Error in logging out user", e);
        }
    }

    private void deregisterPushTokenOrLogout(boolean z) {
        if (!z) {
            this.pushTokenManager.deregisterPushTokenForUser(this, getActiveUserDataForNetworkCall(), new com.helpshift.user.UpdatePushSyncStatus(this));
        } else if (isPushTokenSynced()) {
            logoutUserWithBackend();
        }
    }

    public synchronized void startIdentityDataSyncPoller(java.lang.String str) {
        if (!this.currentUser.isIdentityUser()) {
            com.helpshift.log.HSLogger.d(TAG, "User is not of identity type, not starting polling for data: source: " + str);
        } else {
            if (this.identityDataSyncPoller != null) {
                com.helpshift.log.HSLogger.d(TAG, "Starting identity data sync poller: " + str);
                this.identityDataSyncPoller.start();
            }
        }
    }

    public synchronized void stopIdentityDataSyncPoller(java.lang.String str) {
        if (this.identityDataSyncPoller != null) {
            com.helpshift.log.HSLogger.d(TAG, "Stopping identity data sync poller: " + str);
            this.identityDataSyncPoller.stop();
        }
    }

    public boolean scheduleAttributeDataSyncPoller() {
        if (!this.currentUser.isIdentityUser()) {
            com.helpshift.log.HSLogger.d(TAG, "User is not of identity type, not polling for data");
            return false;
        }
        triggerIdentityAttributeSync();
        return true;
    }

    public void scanRefreshTokenExpiry() {
        if ((this.currentUser instanceof com.helpshift.user.AnonymousUser) && this.persistentStorage.isUserSessionExpiryAlertsAllowed()) {
            this.hsEventProxy.sendEvent(com.helpshift.HelpshiftEvent.USER_SESSION_EXPIRED, null);
        } else if (this.currentUser.isIdentityUser() && isRefreshTokenInExpiryAlertPeriod()) {
            this.hsEventProxy.sendEvent(com.helpshift.HelpshiftEvent.REFRESH_USER_CREDENTIALS, null);
        }
    }

    boolean isRefreshTokenInExpiryAlertPeriod() {
        return (java.lang.System.currentTimeMillis() / 1000) - ((java.lang.Number) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.REFRESH_TOKEN_START_TIME_SECONDS, 0)).longValue() > ((java.lang.Number) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.REFRESH_TOKEN_TTL, 0)).longValue() - com.helpshift.user.UserConstants.REFRESH_TOKEN_EXPIRY_ALERT_PERIOD_SECONDS;
    }

    private void requestLoginWithIdentity(final java.util.Map<java.lang.String, java.lang.String> map, final java.util.Map<java.lang.String, java.lang.Object> map2, final java.util.Map<java.lang.String, java.lang.Object> map3, final boolean z, final boolean z2, final com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        if (this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, "Login already in progress");
            helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.LOGIN_IN_PROGRESS, null);
            return;
        }
        java.lang.String platformId = this.persistentStorage.getPlatformId();
        java.lang.String deviceId = this.device.getDeviceId();
        java.util.Map<java.lang.String, java.lang.String> buildHeaderMap = com.helpshift.network.NetworkUtils.buildHeaderMap(this.device, platformId);
        java.util.HashMap hashMap = new java.util.HashMap(com.helpshift.util.Utils.getStringMapFromObjectMap(map2));
        hashMap.put("did", deviceId);
        final com.helpshift.network.HSRequestData hSRequestData = new com.helpshift.network.HSRequestData(buildHeaderMap, hashMap);
        final com.helpshift.network.POSTNetwork pOSTNetwork = new com.helpshift.network.POSTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getLoginWithIdentityRoute(this.persistentStorage));
        this.isLoginCallInProgress = this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.this.m5704lambda$requestLoginWithIdentity$2$comhelpshiftuserUserManager(hSRequestData, pOSTNetwork, map2, map, map3, z, z2, helpshiftUserLoginEventsListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleLoginNetworkCall, reason: merged with bridge method [inline-methods] */
    public void m5704lambda$requestLoginWithIdentity$2$comhelpshiftuserUserManager(com.helpshift.network.HSRequestData hSRequestData, com.helpshift.network.HSNetwork hSNetwork, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.Object> map3, boolean z, boolean z2, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        try {
            com.helpshift.log.HSLogger.d(TAG, "Triggering network call to login identity user: " + map);
            com.helpshift.network.HSResponse makeRequest = hSNetwork.makeRequest(hSRequestData);
            org.json.JSONObject jSONObject = new org.json.JSONObject(makeRequest.getResponseString());
            int status = makeRequest.getStatus();
            if (makeRequest.isNetworkCallSuccess()) {
                handleSuccessfulLoginResponse(jSONObject, map2, map3, z, z2, helpshiftUserLoginEventsListener);
                return;
            }
            try {
                handleErrorResponse(status, jSONObject, helpshiftUserLoginEventsListener);
            } catch (java.lang.Exception e) {
                e = e;
                com.helpshift.log.HSLogger.e(TAG, "Requesting identity login failed", e);
                helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.UNKNOWN_ERROR, null);
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    private void handleSuccessfulLoginResponse(org.json.JSONObject jSONObject, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2, boolean z, boolean z2, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        map2.put("access_token", jSONObject.optString("access_token", ""));
        map2.put(com.helpshift.user.UserConstants.REFRESH_TOKEN, jSONObject.optString(com.helpshift.user.UserConstants.REFRESH_TOKEN, ""));
        map2.put(com.helpshift.user.UserConstants.REFRESH_TOKEN_TTL, java.lang.Long.valueOf(jSONObject.optLong(com.helpshift.user.UserConstants.REFRESH_TOKEN_TTL, 0L)));
        map2.put(com.helpshift.user.UserConstants.REFRESH_TOKEN_START_TIME_SECONDS, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / 1000));
        onNewLoginSuccess(map, map2, z, z2);
        helpshiftUserLoginEventsListener.onLoginSuccess();
    }

    private void handleErrorResponse(int i, org.json.JSONObject jSONObject, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        if (i == 400) {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (!com.helpshift.util.JsonUtils.isEmpty(optJSONObject)) {
                handleSpecificErrorCases(optJSONObject, helpshiftUserLoginEventsListener);
                return;
            } else {
                com.helpshift.log.HSLogger.e(TAG, "Login Network call failed due to invalid data");
                helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.NETWORK_ERROR, null);
                return;
            }
        }
        if (i == 403) {
            com.helpshift.log.HSLogger.e(TAG, "Login Network call failed since identity feature is not enabled");
            helpshiftUserLoginEventsListener.onLoginFailure("identityFeatureNotEnabled", null);
        } else {
            com.helpshift.log.HSLogger.e(TAG, "Login Network call failed with code " + i);
            helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.NETWORK_ERROR, null);
        }
    }

    private void handleSpecificErrorCases(org.json.JSONObject jSONObject, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("invalid-identities");
        org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("invalid-identity-tokens");
        org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("missing-fields");
        org.json.JSONArray optJSONArray4 = jSONObject.optJSONArray("invalid-fields");
        if (!com.helpshift.util.JsonUtils.isEmpty(optJSONArray3) || !com.helpshift.util.JsonUtils.isEmpty(optJSONArray4)) {
            com.helpshift.log.HSLogger.e(TAG, "Unknown error in network response");
            helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.NETWORK_ERROR, null);
            return;
        }
        if (!com.helpshift.util.JsonUtils.isEmpty(optJSONArray2)) {
            com.helpshift.log.HSLogger.e(TAG, "Login Network call failed due to invalid identity token");
            helpshiftUserLoginEventsListener.onLoginFailure("identityTokenInvalid", null);
        } else {
            if (!com.helpshift.util.JsonUtils.isEmpty(optJSONArray)) {
                java.util.List listFromJsonArrayString = com.helpshift.util.JsonUtils.listFromJsonArrayString(optJSONArray.toString());
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it = listFromJsonArrayString.iterator();
                while (it.hasNext()) {
                    hashMap.put((java.lang.String) it.next(), com.helpshift.user.error.InvalidDataErrorReason.INVALID_DATA);
                }
                com.helpshift.log.HSLogger.e(TAG, "Login Network call failed since identities are invalid");
                helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.IDENTITIES_DATA_INVALID, hashMap);
                return;
            }
            helpshiftUserLoginEventsListener.onLoginFailure(com.helpshift.user.error.UserLoginFailureReason.NETWORK_ERROR, null);
        }
    }

    public void loginWithIdentity(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, com.helpshift.HelpshiftUserLoginEventsListener helpshiftUserLoginEventsListener) {
        com.helpshift.user.InternalUserLoginEventListener internalUserLoginEventListener = new com.helpshift.user.InternalUserLoginEventListener(this.hsThreadingService, helpshiftUserLoginEventsListener);
        if (!str.isEmpty() && !com.helpshift.util.Utils.isJWTValid(str, this.device)) {
            internalUserLoginEventListener.onLoginFailure("identityTokenInvalid", null);
            return;
        }
        java.util.List<com.helpshift.user.InternalIdentity> arrayList = new java.util.ArrayList<>();
        boolean isFullPrivacyEnabled = isFullPrivacyEnabled(map);
        if (!com.helpshift.util.Utils.isEmpty(str)) {
            org.json.JSONObject jsonObjectFromJwt = com.helpshift.util.Utils.getJsonObjectFromJwt(this.device, str);
            if (com.helpshift.util.JsonUtils.isEmpty(jsonObjectFromJwt)) {
                com.helpshift.log.HSLogger.d(TAG, "Empty json object in token");
                internalUserLoginEventListener.onLoginFailure("identityTokenInvalid", null);
                return;
            }
            if (jsonObjectFromJwt.optLong(com.facebook.AuthenticationTokenClaims.JSON_KEY_IAT, 0L) == 0) {
                com.helpshift.log.HSLogger.d(TAG, "iat is mandatory in token");
                internalUserLoginEventListener.onLoginFailure("iatIsMandatory", null);
                return;
            }
            arrayList = com.helpshift.user.IdentityValidationUtil.getIdentitiesFromTokenJsonObject(jsonObjectFromJwt);
            com.helpshift.util.ValuePair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validateIdentitiesForLogin = com.helpshift.user.IdentityValidationUtil.validateIdentitiesForLogin(arrayList, isFullPrivacyEnabled);
            if (validateIdentitiesForLogin != null) {
                com.helpshift.log.HSLogger.d(TAG, "Validation failed for identities " + validateIdentitiesForLogin.first);
                internalUserLoginEventListener.onLoginFailure(validateIdentitiesForLogin.first, validateIdentitiesForLogin.second);
                return;
            }
        }
        com.helpshift.util.ValuePair<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validateLoginConfig = com.helpshift.user.IdentityValidationUtil.validateLoginConfig(map);
        if (validateLoginConfig != null) {
            com.helpshift.log.HSLogger.d(TAG, "Validation failed for login config " + validateLoginConfig.first);
            internalUserLoginEventListener.onLoginFailure(validateLoginConfig.first, validateLoginConfig.second);
            return;
        }
        if (!map.containsKey(com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED)) {
            map.put(com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false);
        }
        java.util.Map<java.lang.String, java.lang.String> activeUserDataFromIdentities = getActiveUserDataFromIdentities(arrayList, str);
        java.util.Map<java.lang.String, java.lang.Object> userDataFromLoginConfig = getUserDataFromLoginConfig(map, str);
        java.util.Map<java.lang.String, java.lang.Object> userDataForComparison = getUserDataForComparison(activeUserDataFromIdentities, map);
        boolean isRefreshTokenInExpiryAlertPeriod = isRefreshTokenInExpiryAlertPeriod();
        boolean isUserSame = this.currentUser.isUserSame(userDataForComparison);
        if (this.currentUser.isIdentityUser() && !isRefreshTokenInExpiryAlertPeriod && isUserSame) {
            internalUserLoginEventListener.onLoginSuccess();
            return;
        }
        if (shouldGenerateAnonIdForUserWithIdentity(str, isFullPrivacyEnabled, arrayList)) {
            activeUserDataFromIdentities.put(com.helpshift.user.AnonymousUserWithIdentity.ANONYMOUS_USER_WITH_IDENTITY_ID, generateAndAddAnonIdInActiveUserMap(userDataForComparison, isUserSame, ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(userDataFromLoginConfig, com.helpshift.user.UserConstants.USER_TYPE, -1)).intValue()));
        }
        requestLoginWithIdentity(activeUserDataFromIdentities, getNetworkConfigFromLoginConfigAndIdentityJwt(activeUserDataFromIdentities, map, str), userDataFromLoginConfig, isRefreshTokenInExpiryAlertPeriod, isUserSame, internalUserLoginEventListener);
    }

    private boolean isFullPrivacyEnabled(java.util.Map<java.lang.String, java.lang.Object> map) {
        try {
            return ((java.lang.Boolean) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false)).booleanValue();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> getActiveUserDataFromIdentities(java.util.List<com.helpshift.user.InternalIdentity> list, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.helpshift.util.Utils.isEmpty(list)) {
            hashMap.put(com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, com.helpshift.user.InternalIdentityUtils.getHashForIdentities(list).toString());
            hashMap.put(com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, com.helpshift.util.Utils.getSignatureFromJwtToken(str));
        }
        return hashMap;
    }

    private boolean shouldGenerateAnonIdForUserWithIdentity(java.lang.String str, boolean z, java.util.List<com.helpshift.user.InternalIdentity> list) {
        if (com.helpshift.util.Utils.isEmpty(str)) {
            return true;
        }
        return z && !com.helpshift.user.InternalIdentityUtils.isIdentifierPresent(list, "uid");
    }

    private java.lang.String generateAndAddAnonIdInActiveUserMap(java.util.Map<java.lang.String, java.lang.Object> map, boolean z, int i) {
        java.lang.String retainedAnonUidForIdentityUser = this.persistentStorage.getRetainedAnonUidForIdentityUser();
        return (com.helpshift.util.Utils.isEmpty(retainedAnonUidForIdentityUser) || (!z && !isNewUserSameBeforeExpiry(map, i))) ? generateAnonymousUserId() : retainedAnonUidForIdentityUser;
    }

    public boolean isNewUserSameBeforeExpiry(java.util.Map<java.lang.String, java.lang.Object> map, int i) {
        java.util.Map<java.lang.String, java.lang.Object> jsonStringToMap = com.helpshift.util.JsonUtils.jsonStringToMap(this.persistentStorage.getLastLoggedOutUser());
        if ((this.currentUser instanceof com.helpshift.user.AnonymousUser) && !jsonStringToMap.isEmpty() && ((java.lang.Integer) com.helpshift.util.Utils.getOrDefault(jsonStringToMap, com.helpshift.user.UserConstants.USER_TYPE, -1)).intValue() == i) {
            return com.helpshift.user.IdentityValidationUtil.isNewIdentityUserSame(map, jsonStringToMap);
        }
        return false;
    }

    private java.util.Map<java.lang.String, java.lang.Object> getUserDataForComparison(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, com.helpshift.util.Utils.getOrDefault(map2, com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, false));
        hashMap.put(com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, ""));
        hashMap.put(com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, ""));
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.Object> getUserDataFromLoginConfig(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.helpshift.user.UserConstants.USER_TYPE, java.lang.Integer.valueOf(com.helpshift.util.Utils.isEmpty(str) ? 2 : 1));
        hashMap.put(com.helpshift.user.UserConstants.USER_LOGIN_CONFIG, new org.json.JSONObject(map).toString());
        return hashMap;
    }

    private java.util.Map<java.lang.String, java.lang.Object> getNetworkConfigFromLoginConfigAndIdentityJwt(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.Object> map2, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap(map2);
        if (com.helpshift.util.Utils.isEmpty(str)) {
            str = "";
        }
        hashMap.put(com.helpshift.user.UserWithIdentity.IDENTITY_TOKEN, str);
        java.lang.String str2 = (java.lang.String) com.helpshift.util.Utils.getOrDefault(map, com.helpshift.user.AnonymousUserWithIdentity.ANONYMOUS_USER_WITH_IDENTITY_ID, "");
        if (com.helpshift.util.Utils.isNotEmpty(str2)) {
            hashMap.put(com.helpshift.user.AnonymousUserWithIdentity.ANONYMOUS_USER_WITH_IDENTITY_ID, str2);
        }
        return hashMap;
    }

    public void login(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap(map);
        if (com.helpshift.util.Utils.isEmpty(hashMap)) {
            com.helpshift.log.HSLogger.e(TAG, "Empty data for user login");
            return;
        }
        com.helpshift.user.BaseUser baseUser = this.currentUser;
        if ((baseUser instanceof com.helpshift.user.OldLoginUser) && baseUser.isUserSame(hashMap)) {
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(com.helpshift.user.UserConstants.USER_TYPE, 0);
        onNewLoginSuccess(map, hashMap2, false, false);
    }

    public void logout(boolean z) {
        if (this.currentUser instanceof com.helpshift.user.AnonymousUser) {
            return;
        }
        if (z) {
            this.persistentStorage.retainAnonUidForIdentityUser("");
        }
        saveLoggedOutUser(z);
        this.persistentStorage.shouldAllowUserSessionExpiryAlerts(!z);
        stopIdentityDataSyncPoller("logout");
        this.conversationPoller.stopPoller();
        deregisterPushTokenOrLogout(this.currentUser.isIdentityUser());
        cleanUpActiveUser(this.currentUser);
        this.currentUser = this.anonymousUser;
        sendLogoutEventToUserLifecycle();
        startNotificationUpdatesSync(this.currentUser, com.helpshift.util.Utils.ORIGIN_LOGIN_WITH_ANONYMOUS_USER);
    }

    private void saveLoggedOutUser(boolean z) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (z) {
            this.persistentStorage.saveLoggedOutUser(jSONObject.toString());
            return;
        }
        jSONObject.put(com.helpshift.user.UserConstants.USER_TYPE, this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.USER_TYPE, -1));
        jSONObject.put(com.helpshift.user.UserConstants.FULL_PRIVACY_ENABLED, isFullPrivacyEnabled(com.helpshift.util.JsonUtils.jsonStringToMap((java.lang.String) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.USER_LOGIN_CONFIG, ""))));
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = this.currentUser.getUserLoginInfo();
        jSONObject.put(com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, com.helpshift.util.Utils.getOrDefault(userLoginInfo, com.helpshift.user.UserWithIdentity.IDENTITIES_HASH_LIST, ""));
        jSONObject.put(com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, com.helpshift.util.Utils.getOrDefault(userLoginInfo, com.helpshift.user.UserWithIdentity.IDENTITIES_SIGNATURE, ""));
        this.persistentStorage.saveLoggedOutUser(jSONObject.toString());
    }

    public void sessionExpiryLogoutWhenSDKIsOpen() {
        com.helpshift.log.HSLogger.d(TAG, "session expired when SDK is open " + isRefreshTokenInExpiryAlertPeriod());
        this.loginOnSessionExpiryMarker.set(false);
        this.hsEventProxy.sendEvent(com.helpshift.HelpshiftEvent.USER_SESSION_EXPIRED, null);
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.this.m5705xfe343fef();
            }
        }, 5000L);
    }

    /* renamed from: lambda$sessionExpiryLogoutWhenSDKIsOpen$3$com-helpshift-user-UserManager, reason: not valid java name */
    /* synthetic */ void m5705xfe343fef() {
        if (!this.loginOnSessionExpiryMarker.get() && !this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, "logging out user, since it doesn't re-login");
            logout(false);
        } else {
            com.helpshift.log.HSLogger.d(TAG, "Not logging out. User relogined");
        }
    }

    public void addUserIdentities(java.lang.String str) {
        if (this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, LOGIN_CALL_ALREADY_IN_PROGRESS);
        } else {
            com.helpshift.user.IdentityValidationUtil.addUserIdentities(this.currentUser, this.device, str, this.hsEventProxy);
        }
    }

    public void updateMasterAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, LOGIN_CALL_ALREADY_IN_PROGRESS);
        } else {
            com.helpshift.user.IdentityAttributesUtil.updateMasterAttributes(this.currentUser, map, this.hsEventProxy);
        }
    }

    public void updateAppAttributes(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, LOGIN_CALL_ALREADY_IN_PROGRESS);
        } else {
            com.helpshift.user.IdentityAttributesUtil.updateAppAttributes(this.currentUser, map, this.hsEventProxy);
        }
    }

    public void collectAndStoreSDKCollectibleAttributes() {
        com.helpshift.user.IdentityAttributesUtil.collectAndStoreSDKCollectibleAttributes(this.currentUser, this.device, this.persistentStorage, this.hsEventProxy);
    }

    public synchronized void triggerIdentityAttributeSync() {
        if (this.currentUser.isIdentityUser()) {
            com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) this.currentUser;
            java.util.List<java.lang.String> unSyncIdentitiesList = userWithIdentity.getUnSyncIdentitiesList();
            java.util.Map<java.lang.String, java.lang.Object> unsyncedMasterAttributes = userWithIdentity.getUnsyncedMasterAttributes();
            java.util.Map<java.lang.String, java.lang.Object> unsyncAppAttributes = userWithIdentity.getUnsyncAppAttributes();
            if (com.helpshift.util.Utils.isEmpty(unSyncIdentitiesList) && com.helpshift.util.Utils.isEmpty(unsyncAppAttributes) && com.helpshift.util.Utils.isEmpty(unsyncedMasterAttributes)) {
                return;
            }
            syncUnSyncIdentitiesAndAttributes(unSyncIdentitiesList, unsyncedMasterAttributes, unsyncAppAttributes);
        }
    }

    public void delayForDataSync(final java.lang.ref.WeakReference<com.helpshift.util.ConsumeOnceListener<java.lang.Boolean>> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (!this.dataSyncCallProgress.get() && weakReference.get() != null) {
            weakReference.get().emit(true);
            return;
        }
        com.helpshift.log.HSLogger.d(TAG, "Scheduling delay to listen for data attribute sync: callback " + weakReference.hashCode());
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.lambda$delayForDataSync$4(weakReference);
            }
        }, 300L);
    }

    static /* synthetic */ void lambda$delayForDataSync$4(java.lang.ref.WeakReference weakReference) {
        if (weakReference.get() != null) {
            ((com.helpshift.util.ConsumeOnceListener) weakReference.get()).emit(true);
        }
    }

    private void syncUnSyncIdentitiesAndAttributes(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        if (this.isLoginCallInProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, "Identity login already in progress. Skipping sync attributes call.");
            return;
        }
        if (this.dataSyncCallProgress.get()) {
            com.helpshift.log.HSLogger.d(TAG, "Identity/attribute sync already in progress. Skipping repeated call.");
            return;
        }
        final com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) this.currentUser;
        final java.util.Map<java.lang.String, java.lang.String> buildUnsyncedDataMap = buildUnsyncedDataMap(list, map, map2);
        if (buildUnsyncedDataMap.isEmpty()) {
            return;
        }
        java.lang.String platformId = this.persistentStorage.getPlatformId();
        java.lang.String deviceId = this.device.getDeviceId();
        java.util.Map<java.lang.String, java.lang.String> buildHeaderMap = com.helpshift.network.NetworkUtils.buildHeaderMap(this.device, platformId);
        java.util.Map<java.lang.String, java.lang.String> activeUserDataForNetworkCall = getActiveUserDataForNetworkCall(new java.util.HashMap());
        activeUserDataForNetworkCall.put("did", deviceId);
        activeUserDataForNetworkCall.putAll(buildUnsyncedDataMap);
        final com.helpshift.network.HSRequestData hSRequestData = new com.helpshift.network.HSRequestData(buildHeaderMap, activeUserDataForNetworkCall);
        final com.helpshift.network.RetryNetworkWithNewToken retryNetworkWithNewToken = new com.helpshift.network.RetryNetworkWithNewToken(new com.helpshift.network.PUTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getSyncIdentitiesRoute(this.persistentStorage)), this, this.httpTransport, true, userWithIdentity.getDataForTokenRotation());
        this.dataSyncCallProgress = this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.this.m5707x2ab2fb85(retryNetworkWithNewToken, hSRequestData, userWithIdentity, buildUnsyncedDataMap);
            }
        });
    }

    /* renamed from: lambda$syncUnSyncIdentitiesAndAttributes$5$com-helpshift-user-UserManager, reason: not valid java name */
    /* synthetic */ void m5707x2ab2fb85(com.helpshift.network.HSNetwork hSNetwork, com.helpshift.network.HSRequestData hSRequestData, com.helpshift.user.UserWithIdentity userWithIdentity, java.util.Map map) {
        try {
            com.helpshift.log.HSLogger.d(TAG, "Triggering network call to sync identities and attributes.");
            handleNetworkResponse(hSNetwork.makeRequest(hSRequestData), userWithIdentity, map);
        } catch (java.lang.Exception e) {
            handleSyncError(e);
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> buildUnsyncedDataMap(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.Object> map, java.util.Map<java.lang.String, java.lang.Object> map2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONArray jsonArrayFromList = com.helpshift.util.JsonUtils.jsonArrayFromList(list);
            java.lang.String str = "";
            java.lang.String mapToJsonString = com.helpshift.util.Utils.isEmpty(map) ? "" : com.helpshift.util.JsonUtils.mapToJsonString(map);
            if (!com.helpshift.util.Utils.isEmpty(map2)) {
                str = com.helpshift.util.JsonUtils.mapToJsonString(map2);
            }
            if (!com.helpshift.util.JsonUtils.isEmpty(jsonArrayFromList)) {
                hashMap.put("identity_tokens", jsonArrayFromList.toString());
            }
            if (com.helpshift.util.Utils.isNotEmpty(mapToJsonString)) {
                hashMap.put("core_attributes", mapToJsonString);
            }
            if (com.helpshift.util.Utils.isNotEmpty(str)) {
                hashMap.put(APP_ATTRIBUTES, str);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting unSync data for active user.", e);
        }
        return hashMap;
    }

    private void handleNetworkResponse(com.helpshift.network.HSResponse hSResponse, com.helpshift.user.UserWithIdentity userWithIdentity, java.util.Map<java.lang.String, java.lang.String> map) throws org.json.JSONException {
        if (hSResponse.isNetworkCallSuccess()) {
            if (hSResponse.getStatus() == 206) {
                handlePartialUpdate(hSResponse);
            }
            if (com.helpshift.util.JsonUtils.jsonStringToMap(map.get(APP_ATTRIBUTES)).containsKey(com.helpshift.user.IdentityAttributesUtil.ATTRIBUTE_PUSH_TOKEN)) {
                setPushTokenSynced(true);
            }
            userWithIdentity.updateSyncedAppAttributes(map.get(APP_ATTRIBUTES), com.helpshift.user.IdentityAttributesUtil.sdkCollectibleAttributeKeys);
            userWithIdentity.clearUnSyncAttributesAndIdentities();
            return;
        }
        com.helpshift.log.HSLogger.e(TAG, "Error syncing identity and attributes in network call. Code " + hSResponse.getStatus());
    }

    private void handlePartialUpdate(com.helpshift.network.HSResponse hSResponse) throws org.json.JSONException {
        org.json.JSONObject optJSONObject = new org.json.JSONObject(hSResponse.getResponseString()).optJSONObject("error");
        checkAndHandleInvalidFields(optJSONObject, "invalid-identity-tokens", "identityTokenInvalid");
        checkAndHandleInvalidFields(optJSONObject, "invalid-identities", com.helpshift.HelpshiftEvent.IDENTITY_DATA_SYNC_FAILED);
        checkAndHandleInvalidFields(optJSONObject, "invalid-core-attributes", com.helpshift.HelpshiftEvent.MASTER_ATTRIBUTES_SYNC_FAILED);
        checkAndHandleInvalidFields(optJSONObject, "invalid-app-attributes", com.helpshift.HelpshiftEvent.APP_ATTRIBUTES_SYNC_FAILED);
        com.helpshift.log.HSLogger.e(TAG, "Partial updates in syncing identity and attributes, status: " + hSResponse.getStatus());
    }

    private void checkAndHandleInvalidFields(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        if (com.helpshift.util.JsonUtils.isEmpty(jSONObject.optJSONArray(str))) {
            return;
        }
        com.helpshift.log.HSLogger.e(TAG, "Syncing failed because of invalid " + str);
        if (str2.equals("identityTokenInvalid")) {
            sendEventForInvalidResponse(str2, null);
        } else {
            sendEventForInvalidResponse(str2, jSONObject.optJSONArray(str));
        }
    }

    private void handleSyncError(java.lang.Exception exc) {
        if (exc instanceof com.helpshift.network.exception.HSRootApiException) {
            com.helpshift.network.exception.HSRootApiException hSRootApiException = (com.helpshift.network.exception.HSRootApiException) exc;
            if (hSRootApiException.exceptionType == com.helpshift.network.exception.NetworkException.SESSION_EXPIRED || hSRootApiException.exceptionType == com.helpshift.network.exception.NetworkException.IDENTITY_FEATURE_NOT_ENABLED) {
                logoutUserForNetworkException(hSRootApiException.exceptionType);
            }
        }
        com.helpshift.log.HSLogger.e(TAG, "Error syncing identity and attributes", exc);
    }

    private void sendEventForInvalidResponse(java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            this.hsEventProxy.sendEvent(str, null);
        } else {
            if (com.helpshift.util.JsonUtils.isEmpty(jSONArray)) {
                return;
            }
            com.helpshift.user.IdentityAttributesUtil.sendUserIdentityAttributeFailureEvent(str, com.helpshift.user.IdentityAttributesUtil.getValuePairsFromArray(jSONArray, com.helpshift.user.error.InvalidDataErrorReason.INVALID_DATA), this.hsEventProxy);
        }
    }

    public void setNotificationEventsProxy(com.helpshift.notification.NotificationEventsProxy notificationEventsProxy) {
        this.notificationEventsProxy = notificationEventsProxy;
    }

    private void cleanUpActiveUser(com.helpshift.user.BaseUser baseUser) {
        baseUser.cleanupUser();
        this.notificationEventsProxy.cancelNotifications();
        usersNotFound.clear();
    }

    public void saveClearAnonymousUserOnLoginConfig(boolean z) {
        this.persistentStorage.setClearAnonymousUser(z);
    }

    private boolean getClearAnonymousUserOnLoginFlag() {
        return this.persistentStorage.isClearAnonymousUser();
    }

    public java.util.Map<java.lang.String, java.lang.String> getActiveUserDataForNetworkCall() {
        return this.currentUser.getUserDataForNetworkCall(this.genericDataManager.getUserDataKeyMapping());
    }

    public boolean isUserDataNeededForNetworkCall() {
        return this.currentUser.isUserDataNeededForNetworkCall();
    }

    public java.util.Map<java.lang.String, java.lang.String> getActiveUserDataForNetworkCall(java.util.Map<java.lang.String, java.lang.String> map) {
        return this.currentUser.getUserDataForNetworkCall(map);
    }

    public java.util.Map<java.lang.String, java.lang.String> getTokenDataForRotation() {
        return this.currentUser.getDataForTokenRotation();
    }

    protected java.lang.String generateAnonymousUserId() {
        return "hsft_anon_" + java.lang.System.currentTimeMillis() + "-" + java.util.UUID.randomUUID().toString().replace("-", "").substring(0, 15);
    }

    public void generateAndSaveAnonymousUserIdIfNeeded() {
        if (!this.anonymousUser.userDataExists()) {
            com.helpshift.log.HSLogger.d(TAG, "Existing anon user details not found. Generating new anon user ID");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("userId", generateAnonymousUserId());
                this.anonymousUser.saveAnonUserData(jSONObject);
                return;
            } catch (java.lang.Exception unused) {
                com.helpshift.log.HSLogger.d(TAG, "Error in saving the anonymous local user id");
                return;
            }
        }
        com.helpshift.log.HSLogger.d(TAG, "Existing anon user details found. Not generating new anon user ID");
    }

    public void addUserLifecycleListener(java.lang.String str, com.helpshift.user_lifecyle.UserLifecycleListener userLifecycleListener) {
        this.userLifecycleListeners.put(str, new java.lang.ref.WeakReference<>(userLifecycleListener));
    }

    public void removeUserLifeCycleListener(java.lang.String str) {
        this.userLifecycleListeners.remove(str);
    }

    private void startNotificationUpdatesSync(final com.helpshift.user.BaseUser baseUser, final java.lang.String str) {
        this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.this.m5706xebaebfd5(str, baseUser);
            }
        });
    }

    /* renamed from: lambda$startNotificationUpdatesSync$6$com-helpshift-user-UserManager, reason: not valid java name */
    /* synthetic */ void m5706xebaebfd5(java.lang.String str, com.helpshift.user.BaseUser baseUser) {
        this.fetchNotificationUpdate.execute(str, getHashForUser(baseUser), true);
        if (shouldPoll()) {
            java.lang.String currentPushToken = this.persistentStorage.getCurrentPushToken();
            if (com.helpshift.util.Utils.isEmpty(currentPushToken)) {
                this.conversationPoller.startPoller();
            } else {
                registerPushTokenWithBackend(this, currentPushToken, getActiveUserDataForNetworkCall(), new com.helpshift.user.UpdatePushSyncStatus(this));
            }
        }
    }

    private boolean shouldSyncPushToken(java.lang.String str) {
        java.lang.String currentPushToken = this.persistentStorage.getCurrentPushToken();
        return (!com.helpshift.util.Utils.isEmpty(currentPushToken) && currentPushToken.equals(str) && isPushTokenSynced()) ? false : true;
    }

    public java.lang.Boolean isRequestUnreadMessageCountAllowed(java.lang.String str) {
        return java.lang.Boolean.valueOf(!usersNotFound.contains(str));
    }

    public void removeUserFromErrorList(java.lang.String str) {
        usersNotFound.remove(str);
    }

    public void addUserInErrorList(java.lang.String str) {
        usersNotFound.add(str);
    }

    public boolean isUserDataValidForNetworkCall() {
        return this.currentUser.isUserDataValidForNetworkCall();
    }

    public java.lang.String getHashForActiveUser() {
        return getHashForUser(this.currentUser);
    }

    private java.lang.String getHashForUser(com.helpshift.user.BaseUser baseUser) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.TreeMap treeMap = new java.util.TreeMap(baseUser.getUserLoginInfo());
        if (com.helpshift.util.Utils.isEmpty(treeMap)) {
            return "";
        }
        java.util.Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            sb.append((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
        }
        return sb.toString();
    }

    public void setShouldPollFlag(boolean z) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.SHOULD_POLL, java.lang.Boolean.valueOf(z));
    }

    public void setPollerCursor(long j) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.POLLING_CURSOR, java.lang.Long.valueOf(j));
    }

    public void setPollingBaseInterval(int i) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.BASE_POLLING_INTERVAL, java.lang.Integer.valueOf(i));
    }

    public void setPollingMaxInterval(int i) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.MAX_POLLING_INTERVAL, java.lang.Integer.valueOf(i));
    }

    public void setActiveUnreadCountFetchInterval(int i) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.ACTIVE_UNREAD_COUNT_FETCH_INTERVAL, java.lang.Integer.valueOf(i));
    }

    public void setPassiveUnreadCountFetchInterval(int i) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.PASSIVE_UNREAD_COUNT_FETCH_INTERVAL, java.lang.Integer.valueOf(i));
    }

    public void updateUnreadCountBy(int i) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.UNREAD_COUNT, java.lang.Integer.valueOf(getUnreadNotificationCount() + i));
    }

    public void markAllMessagesAsRead() {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.UNREAD_COUNT, 0);
    }

    public void setPushTokenSynced(boolean z) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.PUSH_TOKEN_SYNCED, java.lang.Boolean.valueOf(z));
    }

    public boolean shouldPoll() {
        return ((java.lang.Boolean) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.SHOULD_POLL, false)).booleanValue();
    }

    public int getActiveRemoteFetchInterval() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.ACTIVE_UNREAD_COUNT_FETCH_INTERVAL, 60000)).intValue();
    }

    public int getPassiveRemoteFetchInterval() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.PASSIVE_UNREAD_COUNT_FETCH_INTERVAL, java.lang.Integer.valueOf(com.helpshift.util.Utils.FALLBACK_PASSIVE_REMOTE_FETCH_INTERVAL))).intValue();
    }

    public long getPollerCursor() {
        return java.lang.Long.valueOf(this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.POLLING_CURSOR, 0) + "").longValue();
    }

    public int getPollingMaxInterval() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.MAX_POLLING_INTERVAL, 60000)).intValue();
    }

    public int getPollingBaseInterval() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.BASE_POLLING_INTERVAL, 5000)).intValue();
    }

    public int getUnreadNotificationCount() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.UNREAD_COUNT, 0)).intValue();
    }

    public int getPushUnreadNotificationCount() {
        return ((java.lang.Integer) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.PUSH_UNREAD_COUNT, 0)).intValue();
    }

    public void updatePushUnreadCountBy(int i) {
        int pushUnreadNotificationCount = getPushUnreadNotificationCount() + i;
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.PUSH_UNREAD_COUNT, java.lang.Integer.valueOf(pushUnreadNotificationCount));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(pushUnreadNotificationCount));
        hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT_FROM_CACHE, false);
        this.hsEventProxy.sendEvent(com.helpshift.HelpshiftEvent.RECEIVED_UNREAD_MESSAGE_COUNT, hashMap);
    }

    public void markAllPushMessagesAsRead() {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.PUSH_UNREAD_COUNT, 0);
    }

    public boolean isPushTokenSynced() {
        return ((java.lang.Boolean) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.PUSH_TOKEN_SYNCED, false)).booleanValue();
    }

    public boolean isLoginCallInProgress() {
        return this.isLoginCallInProgress.get();
    }

    public void setShowChatIconInHelpcenter(boolean z) {
        this.currentUser.setUserDataValues(com.helpshift.user.UserConstants.SHOW_CHAT_ICON_IN_HELPCENTER, java.lang.Boolean.valueOf(z));
    }

    public boolean shouldShowChatIconInHelpcenter() {
        return ((java.lang.Boolean) this.currentUser.getUserDataValue(com.helpshift.user.UserConstants.SHOW_CHAT_ICON_IN_HELPCENTER, false)).booleanValue();
    }

    @Override // com.helpshift.network.UserManagerProxy
    public com.helpshift.network.HSRequest getRequestBodyForRotatingToken(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.helpshift.user.UserConstants.REFRESH_TOKEN, str);
        hashMap.put("source", "android");
        return com.helpshift.network.NetworkUtils.getRequestBodyForRotatingToken(this.persistentStorage, this.device, hashMap);
    }

    @Override // com.helpshift.network.UserManagerProxy
    public void updateNewTokensInStorage(java.lang.String str, java.lang.String str2, long j) {
        if (this.currentUser.isIdentityUser()) {
            com.helpshift.user.UserWithIdentity userWithIdentity = (com.helpshift.user.UserWithIdentity) this.currentUser;
            userWithIdentity.setAccessToken(str);
            userWithIdentity.setRefreshToken(str2);
            if (j != 0) {
                userWithIdentity.setRefreshTokenExpiry(j);
            }
        }
    }

    @Override // com.helpshift.network.UserManagerProxy
    public void logoutUserForNetworkException(com.helpshift.network.exception.HSRootApiException.ExceptionType exceptionType) {
        java.lang.String str;
        logout(false);
        if (exceptionType != com.helpshift.network.exception.NetworkException.IDENTITY_FEATURE_NOT_ENABLED) {
            str = com.helpshift.HelpshiftEvent.USER_SESSION_EXPIRED;
        } else {
            str = "identityFeatureNotEnabled";
        }
        this.hsEventProxy.sendEvent(str, null);
    }

    private java.lang.String generateSDKDataSyncUserKey() {
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = this.currentUser.getUserLoginInfo();
        return com.helpshift.util.Utils.getSHAHash(((java.lang.String) com.helpshift.util.Utils.getOrDefault(userLoginInfo, "userId", "")) + ((java.lang.String) com.helpshift.util.Utils.getOrDefault(userLoginInfo, "userEmail", ""))) + this.device.getSDKVersion();
    }

    public void syncSdkDataWithBackend() {
        if (getCurrentUser().isIdentityUser()) {
            return;
        }
        java.lang.String generateSDKDataSyncUserKey = generateSDKDataSyncUserKey();
        if (!shouldRetrySdkSync(generateSDKDataSyncUserKey)) {
            com.helpshift.log.HSLogger.d(TAG, "Retry for SDK data sync is false, skipping!");
        } else {
            performVersionSyncRequest(generateSDKDataSyncUserKey);
        }
    }

    public boolean shouldRetrySdkSync(java.lang.String str) {
        org.json.JSONObject optJSONObject = getStoredSdkDataSyncInfo().optJSONObject(str);
        return optJSONObject == null || optJSONObject.optBoolean("shouldRetry", true);
    }

    private void performVersionSyncRequest(final java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> buildHeaderMap = com.helpshift.network.NetworkUtils.buildHeaderMap(this.device, this.persistentStorage.getPlatformId());
        java.util.Map<java.lang.String, java.lang.String> buildSdkVersionSyncRequestMap = buildSdkVersionSyncRequestMap();
        final com.helpshift.network.POSTNetwork pOSTNetwork = new com.helpshift.network.POSTNetwork(this.httpTransport, com.helpshift.network.NetworkUtils.getSdkVersionSyncRoute(this.persistentStorage));
        final com.helpshift.network.HSRequestData hSRequestData = new com.helpshift.network.HSRequestData(buildHeaderMap, buildSdkVersionSyncRequestMap);
        this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.user.UserManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.user.UserManager.this.m5702x6f4a9c89(pOSTNetwork, hSRequestData, str);
            }
        });
    }

    /* renamed from: lambda$performVersionSyncRequest$7$com-helpshift-user-UserManager, reason: not valid java name */
    /* synthetic */ void m5702x6f4a9c89(com.helpshift.network.HSNetwork hSNetwork, com.helpshift.network.HSRequestData hSRequestData, java.lang.String str) {
        try {
            handleSDKSyncNetworkResponse(hSNetwork.makeRequest(hSRequestData), str);
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in SDK data sync", e);
        } catch (java.lang.Exception e2) {
            com.helpshift.log.HSLogger.e(TAG, "Error in SDK data sync", e2);
        }
    }

    private void handleSDKSyncNetworkResponse(com.helpshift.network.HSResponse hSResponse, java.lang.String str) {
        int status = hSResponse.getStatus();
        boolean z = true;
        boolean z2 = false;
        if (status < 200 || status >= 300) {
            if (status == 401 || status >= 500) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        }
        addOrUpdateSdkSyncInfo(str, z, z2);
        com.helpshift.log.HSLogger.d(TAG, "SDK data sync Network called  with code : " + status);
    }

    private java.util.Map<java.lang.String, java.lang.String> buildSdkVersionSyncRequestMap() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = this.currentUser.getUserLoginInfo();
        hashMap.put("uid", (java.lang.String) com.helpshift.util.Utils.getOrDefault(userLoginInfo, "userId", ""));
        hashMap.put("email", (java.lang.String) com.helpshift.util.Utils.getOrDefault(userLoginInfo, "userEmail", ""));
        hashMap.put("user_auth_token", (java.lang.String) com.helpshift.util.Utils.getOrDefault(userLoginInfo, "userAuthToken", ""));
        hashMap.put("did", this.device.getDeviceId());
        hashMap.put("sdk_version", this.device.getSDKVersion());
        hashMap.put("plugin_version", this.webchatAnalyticsManager.getCommonAnalyticsMap().get("pv"));
        com.helpshift.util.Utils.removeEmptyKeyValues(hashMap);
        return hashMap;
    }

    public void addOrUpdateSdkSyncInfo(java.lang.String str, boolean z, boolean z2) {
        try {
            org.json.JSONObject storedSdkDataSyncInfo = getStoredSdkDataSyncInfo();
            org.json.JSONObject optJSONObject = storedSdkDataSyncInfo.optJSONObject(str);
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            optJSONObject.put("synced", z);
            optJSONObject.put("shouldRetry", z2);
            storedSdkDataSyncInfo.put(str, optJSONObject);
            storeSdkDataSyncInfo(storedSdkDataSyncInfo.toString());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in storing SDK sync info", e);
        }
    }

    private org.json.JSONObject getStoredSdkDataSyncInfo() {
        try {
            java.lang.String sDKDataSyncStatus = this.persistentStorage.getSDKDataSyncStatus();
            return com.helpshift.util.Utils.isEmpty(sDKDataSyncStatus) ? new org.json.JSONObject() : new org.json.JSONObject(sDKDataSyncStatus);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error reading sdk data sync status from storage.", e);
            return new org.json.JSONObject();
        }
    }

    private void storeSdkDataSyncInfo(java.lang.String str) {
        this.persistentStorage.setSDKDataSyncStatus(str);
    }
}
