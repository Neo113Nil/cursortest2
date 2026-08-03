package com.helpshift.notification;

/* loaded from: classes2.dex */
public class HSPushTokenManager {
    private static final java.lang.String TAG = "pshTknManagr";
    private final com.helpshift.platform.Device device;
    private final com.helpshift.storage.HSGenericDataManager genericDataManager;
    private final com.helpshift.chat.HSEventProxy hsEventProxy;
    private final com.helpshift.concurrency.HSThreadingService hsThreadingService;
    private final com.helpshift.network.HTTPTransport httpTransport;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;

    public HSPushTokenManager(com.helpshift.platform.Device device, com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.concurrency.HSThreadingService hSThreadingService, com.helpshift.chat.HSEventProxy hSEventProxy, com.helpshift.network.HTTPTransport hTTPTransport, com.helpshift.storage.HSGenericDataManager hSGenericDataManager) {
        this.device = device;
        this.persistentStorage = hSPersistentStorage;
        this.hsThreadingService = hSThreadingService;
        this.hsEventProxy = hSEventProxy;
        this.httpTransport = hTTPTransport;
        this.genericDataManager = hSGenericDataManager;
    }

    public void savePushToken(java.lang.String str) {
        this.persistentStorage.setCurrentPushToken(str);
    }

    public void registerPushTokenWithBackend(com.helpshift.user.UserManager userManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.helpshift.util.ValueListener<java.lang.Boolean> valueListener) {
        pushTokenRequest(userManager, str, map, false, valueListener);
    }

    public void deregisterPushTokenForUser(com.helpshift.user.UserManager userManager, java.util.Map<java.lang.String, java.lang.String> map, com.helpshift.util.ValueListener<java.lang.Boolean> valueListener) {
        pushTokenRequest(userManager, "unreg", map, true, valueListener);
    }

    private void pushTokenRequest(com.helpshift.user.UserManager userManager, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z, com.helpshift.util.ValueListener<java.lang.Boolean> valueListener) {
        if (!this.device.isOnline() || com.helpshift.util.Utils.isEmpty(str) || (userManager.isUserDataNeededForNetworkCall() && com.helpshift.util.Utils.isEmpty(map))) {
            com.helpshift.log.HSLogger.e(TAG, "Error in syncing push token, preconditions failed.");
            return;
        }
        java.util.Map<java.lang.String, java.lang.String> networkHeaders = this.genericDataManager.getNetworkHeaders();
        java.lang.String pushTokenSyncRoute = this.genericDataManager.getPushTokenSyncRoute();
        java.lang.String platformId = this.persistentStorage.getPlatformId();
        java.lang.String deviceId = this.device.getDeviceId();
        if (com.helpshift.util.Utils.isEmpty(networkHeaders) || com.helpshift.util.Utils.isEmpty(pushTokenSyncRoute) || com.helpshift.util.Utils.isEmpty(platformId) || com.helpshift.util.Utils.isEmpty(deviceId)) {
            com.helpshift.log.HSLogger.e(TAG, "Error in reading network header and route data");
            return;
        }
        try {
            map.put("token", str);
            map.put("did", deviceId);
            map.put("platform-id", platformId);
            makePushTokenRequest(new com.helpshift.network.RetryNetworkWithNewToken(new com.helpshift.network.AuthenticationFailureNetwork(new com.helpshift.network.POSTNetwork(this.httpTransport, pushTokenSyncRoute)), userManager, this.httpTransport, userManager.getCurrentUser() instanceof com.helpshift.user.UserWithIdentity, userManager.getTokenDataForRotation()), new com.helpshift.network.HSRequestData(networkHeaders, map), z, valueListener, userManager);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in syncing push token", e);
        }
    }

    private void makePushTokenRequest(final com.helpshift.network.HSNetwork hSNetwork, final com.helpshift.network.HSRequestData hSRequestData, final boolean z, final com.helpshift.util.ValueListener<java.lang.Boolean> valueListener, final com.helpshift.user.UserManager userManager) {
        this.hsThreadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.notification.HSPushTokenManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HSPushTokenManager.this.m5679x1c29af06(hSNetwork, hSRequestData, z, valueListener, userManager);
            }
        });
    }

    /* renamed from: lambda$makePushTokenRequest$0$com-helpshift-notification-HSPushTokenManager, reason: not valid java name */
    /* synthetic */ void m5679x1c29af06(com.helpshift.network.HSNetwork hSNetwork, com.helpshift.network.HSRequestData hSRequestData, boolean z, com.helpshift.util.ValueListener valueListener, com.helpshift.user.UserManager userManager) {
        try {
            handlePushTokenResponse(hSNetwork.makeRequest(hSRequestData), z, valueListener);
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            if (z) {
                com.helpshift.log.HSLogger.e(TAG, "Network error for deregister push token request", e);
                return;
            }
            valueListener.update(false);
            handleExceptions(e, userManager);
            com.helpshift.log.HSLogger.e(TAG, "HSRootApiException in syncing push token", e);
        }
    }

    /* renamed from: com.helpshift.notification.HSPushTokenManager$1, reason: invalid class name */
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

    private void handleExceptions(com.helpshift.network.exception.HSRootApiException hSRootApiException, com.helpshift.user.UserManager userManager) {
        int i = com.helpshift.notification.HSPushTokenManager.AnonymousClass1.$SwitchMap$com$helpshift$network$exception$NetworkException[((com.helpshift.network.exception.NetworkException) hSRootApiException.exceptionType).ordinal()];
        if (i == 1 || i == 2) {
            userManager.logoutUserForNetworkException(hSRootApiException.exceptionType);
        } else if (i == 3) {
            this.hsEventProxy.sendAuthFailureEvent(com.helpshift.network.AuthenticationFailureNetwork.REASON_INVALID_AUTH_TOKEN);
        } else {
            if (i != 4) {
                return;
            }
            this.hsEventProxy.sendAuthFailureEvent(com.helpshift.network.AuthenticationFailureNetwork.REASON_AUTH_TOKEN_NOT_PROVIDED);
        }
    }

    private void handlePushTokenResponse(com.helpshift.network.HSResponse hSResponse, boolean z, com.helpshift.util.ValueListener<java.lang.Boolean> valueListener) {
        if (z) {
            return;
        }
        int status = hSResponse.getStatus();
        valueListener.update(java.lang.Boolean.valueOf(status >= 200 && status <= 300));
    }
}
