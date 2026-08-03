package com.helpshift.network;

/* loaded from: classes2.dex */
public class AuthenticationFailureNetwork implements com.helpshift.network.HSNetwork {
    public static final java.lang.String REASON_AUTH_TOKEN_NOT_PROVIDED = "missing user auth token";
    public static final java.lang.String REASON_INVALID_AUTH_TOKEN = "invalid user auth token";
    private final com.helpshift.network.HSNetwork network;

    public AuthenticationFailureNetwork(com.helpshift.network.HSNetwork hSNetwork) {
        this.network = hSNetwork;
    }

    @Override // com.helpshift.network.HSNetwork
    public com.helpshift.network.HSResponse makeRequest(com.helpshift.network.HSRequestData hSRequestData) {
        com.helpshift.network.HSResponse makeRequest = this.network.makeRequest(hSRequestData);
        if (makeRequest.getStatus() == 401 && !com.helpshift.util.Utils.isEmpty(makeRequest.getResponseString())) {
            if (REASON_AUTH_TOKEN_NOT_PROVIDED.equalsIgnoreCase(makeRequest.getResponseString())) {
                com.helpshift.network.exception.NetworkException networkException = com.helpshift.network.exception.NetworkException.AUTH_TOKEN_NOT_PROVIDED;
                networkException.serverStatusCode = com.helpshift.network.NetworkResponseCodes.AUTH_TOKEN_NOT_PROVIDED;
                throw com.helpshift.network.exception.HSRootApiException.wrap(null, networkException);
            }
            if (REASON_INVALID_AUTH_TOKEN.equalsIgnoreCase(makeRequest.getResponseString())) {
                com.helpshift.network.exception.NetworkException networkException2 = com.helpshift.network.exception.NetworkException.INVALID_AUTH_TOKEN;
                networkException2.serverStatusCode = 443;
                throw com.helpshift.network.exception.HSRootApiException.wrap(null, networkException2);
            }
        }
        return makeRequest;
    }
}
