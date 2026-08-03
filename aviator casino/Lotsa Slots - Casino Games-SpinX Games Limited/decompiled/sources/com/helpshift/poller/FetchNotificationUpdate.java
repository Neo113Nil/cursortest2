package com.helpshift.poller;

/* loaded from: classes2.dex */
public class FetchNotificationUpdate {
    private static final java.lang.String TAG = "ftchNotif";
    private final com.helpshift.platform.Device device;
    private final com.helpshift.storage.HSGenericDataManager genericDataManager;
    private final com.helpshift.chat.HSEventProxy hsEventProxy;
    private final com.helpshift.network.HTTPTransport httpTransport;
    private final com.helpshift.notification.CoreNotificationManager notificationManager;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final com.helpshift.user.UserManager userManager;

    public FetchNotificationUpdate(com.helpshift.platform.Device device, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.storage.HSGenericDataManager hSGenericDataManager, com.helpshift.user.UserManager userManager, com.helpshift.notification.CoreNotificationManager coreNotificationManager, com.helpshift.network.HTTPTransport hTTPTransport, com.helpshift.chat.HSEventProxy hSEventProxy) {
        this.device = device;
        this.persistentStorage = hSPersistentStorage;
        this.genericDataManager = hSGenericDataManager;
        this.userManager = userManager;
        this.notificationManager = coreNotificationManager;
        this.httpTransport = hTTPTransport;
        this.hsEventProxy = hSEventProxy;
    }

    public synchronized int execute(java.lang.String str, java.lang.String str2, boolean z) {
        com.helpshift.log.HSLogger.d(TAG, "Fetching notification count from network.");
        java.util.Map<java.lang.String, java.lang.String> networkHeaders = this.genericDataManager.getNetworkHeaders();
        java.lang.String pollingRoute = this.genericDataManager.getPollingRoute();
        java.util.Map<java.lang.String, java.lang.String> activeUserDataForNetworkCall = this.userManager.getActiveUserDataForNetworkCall();
        if (!isValidNetworkRequest(networkHeaders, pollingRoute, activeUserDataForNetworkCall)) {
            return -1;
        }
        prepareRequestBody(activeUserDataForNetworkCall, this.userManager, this.device, this.persistentStorage, str);
        try {
            return handleResponse(createNetwork(this.httpTransport, pollingRoute, this.userManager).makeRequest(new com.helpshift.network.HSRequestData(networkHeaders, activeUserDataForNetworkCall)), this.userManager, this.notificationManager, this.genericDataManager, str2, z);
        } catch (java.lang.Exception e) {
            handleException(e, this.userManager);
            return -1;
        }
    }

    private boolean isValidNetworkRequest(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map2) {
        if (com.helpshift.util.Utils.isEmpty(map) || com.helpshift.util.Utils.isEmpty(str)) {
            com.helpshift.log.HSLogger.d(TAG, "Skipping notification count fetch. Invalid params for network call.");
            return false;
        }
        com.helpshift.util.Utils.removeEmptyKeyValues(map2);
        if (this.userManager.isUserDataNeededForNetworkCall() && com.helpshift.util.Utils.isEmpty(map2)) {
            com.helpshift.log.HSLogger.d(TAG, "Skipping notification count fetch. Empty body params for network call.");
            return false;
        }
        if (this.userManager.isUserDataValidForNetworkCall()) {
            return true;
        }
        com.helpshift.log.HSLogger.e(TAG, "UserId/Email not valid, skipping fetch notification api call.");
        return false;
    }

    private void prepareRequestBody(java.util.Map<java.lang.String, java.lang.String> map, com.helpshift.user.UserManager userManager, com.helpshift.platform.Device device, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, java.lang.String str) {
        long pollerCursor = userManager.getPollerCursor();
        if (pollerCursor != 0) {
            map.put(com.helpshift.user.UserConstants.POLLING_CURSOR, java.lang.String.valueOf(pollerCursor));
        }
        map.put("did", device.getDeviceId());
        map.put("platform-id", hSPersistentStorage.getPlatformId());
        map.put("origin", str);
    }

    private com.helpshift.network.HSNetwork createNetwork(com.helpshift.network.HTTPTransport hTTPTransport, java.lang.String str, com.helpshift.user.UserManager userManager) {
        return new com.helpshift.network.RetryNetworkWithNewToken(new com.helpshift.network.AuthenticationFailureNetwork(new com.helpshift.network.GETNetwork(hTTPTransport, str)), userManager, hTTPTransport, userManager.getCurrentUser() instanceof com.helpshift.user.UserWithIdentity, userManager.getTokenDataForRotation());
    }

    private int handleResponse(com.helpshift.network.HSResponse hSResponse, com.helpshift.user.UserManager userManager, com.helpshift.notification.CoreNotificationManager coreNotificationManager, com.helpshift.storage.HSGenericDataManager hSGenericDataManager, java.lang.String str, boolean z) throws org.json.JSONException {
        int status = hSResponse.getStatus();
        if (hSResponse.isNetworkCallSuccess()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(hSResponse.getResponseString());
            int optInt = jSONObject.optInt("uc", 0);
            updateUserPollingSettings(jSONObject, userManager);
            if (optInt > 0) {
                int unreadNotificationCount = userManager.getUnreadNotificationCount() + optInt;
                userManager.updateUnreadCountBy(optInt);
                if (!userManager.isPushTokenSynced()) {
                    coreNotificationManager.showIssueMessageNotification(hSGenericDataManager.getNotificationStringForCount(unreadNotificationCount), false);
                }
                if (z) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, java.lang.Integer.valueOf(userManager.getUnreadNotificationCount()));
                    hashMap.put(com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT_FROM_CACHE, false);
                    this.hsEventProxy.sendEvent(com.helpshift.HelpshiftEvent.RECEIVED_UNREAD_MESSAGE_COUNT, hashMap);
                }
            }
            userManager.setPollerCursor(jSONObject.optLong("c", 0L));
            userManager.removeUserFromErrorList(str);
        } else if (status == 404) {
            userManager.addUserInErrorList(str);
        }
        return status;
    }

    private void updateUserPollingSettings(org.json.JSONObject jSONObject, com.helpshift.user.UserManager userManager) {
        int optInt = jSONObject.optInt("bpi", 5000);
        int optInt2 = jSONObject.optInt("mpi", 60000);
        int optInt3 = jSONObject.optInt("afi", 60000);
        int optInt4 = jSONObject.optInt("iafi", com.helpshift.util.Utils.FALLBACK_PASSIVE_REMOTE_FETCH_INTERVAL);
        boolean optBoolean = jSONObject.optBoolean("cp", false);
        userManager.setPollingBaseInterval(optInt);
        userManager.setPollingMaxInterval(optInt2);
        userManager.setShouldPollFlag(optBoolean);
        userManager.setActiveUnreadCountFetchInterval(optInt3);
        userManager.setPassiveUnreadCountFetchInterval(optInt4);
    }

    private void handleException(java.lang.Exception exc, com.helpshift.user.UserManager userManager) {
        if (exc instanceof com.helpshift.network.exception.HSRootApiException) {
            handleNetworkException((com.helpshift.network.exception.HSRootApiException) exc, userManager);
        } else {
            com.helpshift.log.HSLogger.e(TAG, "Error in poller request", exc);
        }
    }

    /* renamed from: com.helpshift.poller.FetchNotificationUpdate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$network$exception$NetworkException;

        static {
            int[] iArr = new int[com.helpshift.network.exception.NetworkException.values().length];
            $SwitchMap$com$helpshift$network$exception$NetworkException = iArr;
            try {
                iArr[com.helpshift.network.exception.NetworkException.SESSION_EXPIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$network$exception$NetworkException[com.helpshift.network.exception.NetworkException.IDENTITY_FEATURE_NOT_ENABLED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$network$exception$NetworkException[com.helpshift.network.exception.NetworkException.INVALID_AUTH_TOKEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$helpshift$network$exception$NetworkException[com.helpshift.network.exception.NetworkException.AUTH_TOKEN_NOT_PROVIDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private void handleNetworkException(com.helpshift.network.exception.HSRootApiException hSRootApiException, com.helpshift.user.UserManager userManager) {
        int i = com.helpshift.poller.FetchNotificationUpdate.AnonymousClass1.$SwitchMap$com$helpshift$network$exception$NetworkException[((com.helpshift.network.exception.NetworkException) hSRootApiException.exceptionType).ordinal()];
        if (i == 1 || i == 2) {
            userManager.logoutUserForNetworkException(hSRootApiException.exceptionType);
            return;
        }
        if (i == 3) {
            this.hsEventProxy.sendAuthFailureEvent(com.helpshift.network.AuthenticationFailureNetwork.REASON_INVALID_AUTH_TOKEN);
        } else if (i == 4) {
            this.hsEventProxy.sendAuthFailureEvent(com.helpshift.network.AuthenticationFailureNetwork.REASON_AUTH_TOKEN_NOT_PROVIDED);
        } else {
            com.helpshift.log.HSLogger.e(TAG, "HSRootApiException in poller request", hSRootApiException);
        }
    }
}
