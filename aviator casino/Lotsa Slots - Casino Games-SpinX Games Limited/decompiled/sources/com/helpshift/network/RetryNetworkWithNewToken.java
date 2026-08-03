package com.helpshift.network;

/* loaded from: classes2.dex */
public class RetryNetworkWithNewToken implements com.helpshift.network.HSNetwork {
    static final java.lang.String ERROR = "error";
    static java.lang.String INVALID_ACCESS_TOKEN = "Invalid access token";
    static java.lang.String MISSING_ACCESS_TOKEN = "Missing access token";
    static java.lang.String USER_IDENTITY_FEATURE_NOT_ENABLED = "Access to feature User identity is disallowed. Reason: Feature not enabled";
    private final java.lang.String TAG = "RetryNetworkWithNewToken";
    private final com.helpshift.network.HTTPTransport httpTransport;
    private final boolean isUserWithIdentity;
    private final com.helpshift.network.HSNetwork network;
    private final java.util.Map<java.lang.String, java.lang.String> tokenMap;
    private final com.helpshift.network.UserManagerProxy userManagerProxy;

    public RetryNetworkWithNewToken(com.helpshift.network.HSNetwork hSNetwork, com.helpshift.network.UserManagerProxy userManagerProxy, com.helpshift.network.HTTPTransport hTTPTransport, boolean z, java.util.Map<java.lang.String, java.lang.String> map) {
        this.network = hSNetwork;
        this.userManagerProxy = userManagerProxy;
        this.httpTransport = hTTPTransport;
        this.tokenMap = map;
        this.isUserWithIdentity = z;
    }

    @Override // com.helpshift.network.HSNetwork
    public com.helpshift.network.HSResponse makeRequest(com.helpshift.network.HSRequestData hSRequestData) {
        java.lang.String rotateAndGetNewToken;
        if (!this.isUserWithIdentity) {
            return this.network.makeRequest(hSRequestData);
        }
        addTokenAccessTokenInHeaders(hSRequestData);
        com.helpshift.network.HSResponse makeRequest = this.network.makeRequest(hSRequestData);
        if (isFeatureDisabled(makeRequest)) {
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "Received 403.Feature is not enabled");
            throw com.helpshift.network.exception.HSRootApiException.wrap(null, com.helpshift.network.exception.NetworkException.IDENTITY_FEATURE_NOT_ENABLED);
        }
        if (!shouldRotateToken(makeRequest) || (rotateAndGetNewToken = rotateAndGetNewToken()) == null) {
            return makeRequest;
        }
        updateTokenInHeaders(hSRequestData.headers, rotateAndGetNewToken);
        com.helpshift.network.HSResponse makeRequest2 = this.network.makeRequest(hSRequestData);
        if (shouldRotateToken(makeRequest2)) {
            throw com.helpshift.network.exception.HSRootApiException.wrap(null, com.helpshift.network.exception.NetworkException.SESSION_EXPIRED);
        }
        return makeRequest2;
    }

    private void addTokenAccessTokenInHeaders(com.helpshift.network.HSRequestData hSRequestData) {
        if (this.isUserWithIdentity) {
            updateTokenInHeaders(hSRequestData.headers, (java.lang.String) com.helpshift.util.Utils.getOrDefault(this.tokenMap, "access_token", ""));
        }
    }

    private void updateTokenInHeaders(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str) {
        map.put(com.helpshift.network.NetworkUtils.X_HS_ACCESS_TOKEN, str);
    }

    private java.lang.String rotateAndGetNewToken() {
        try {
            com.helpshift.network.HSResponse makeRequest = this.httpTransport.makeRequest(this.userManagerProxy.getRequestBodyForRotatingToken((java.lang.String) com.helpshift.util.Utils.getOrDefault(this.tokenMap, com.helpshift.user.UserConstants.REFRESH_TOKEN, "")));
            if (!makeRequest.isNetworkCallSuccess()) {
                if (makeRequest.getStatus() >= 400 && makeRequest.getStatus() < 500) {
                    com.helpshift.log.HSLogger.d("RetryNetworkWithNewToken", "Rotating token network call failed");
                    throw com.helpshift.network.exception.HSRootApiException.wrap(null, com.helpshift.network.exception.NetworkException.SESSION_EXPIRED);
                }
                return null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(makeRequest.getResponseString());
            java.lang.String optString = jSONObject.optString("access_token", "");
            java.lang.String optString2 = jSONObject.optString(com.helpshift.user.UserConstants.REFRESH_TOKEN, "");
            long optLong = jSONObject.optLong(com.helpshift.user.UserConstants.REFRESH_TOKEN_TTL, 0L);
            if (com.helpshift.util.Utils.isEmpty(optString) || com.helpshift.util.Utils.isEmpty(optString2)) {
                com.helpshift.log.HSLogger.d("RetryNetworkWithNewToken", "new token is empty, failing the call");
                throw com.helpshift.network.exception.HSRootApiException.wrap(null, com.helpshift.network.exception.NetworkException.SESSION_EXPIRED);
            }
            this.userManagerProxy.updateNewTokensInStorage(optString, optString2, optLong);
            return optString;
        } catch (com.helpshift.network.exception.HSRootApiException e) {
            if (e.exceptionType == com.helpshift.network.exception.NetworkException.SESSION_EXPIRED) {
                throw e;
            }
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "HSRoot error in rotating token", e);
            return null;
        } catch (java.lang.Exception e2) {
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "Error in rotating token", e2);
            return null;
        }
    }

    private boolean shouldRotateToken(com.helpshift.network.HSResponse hSResponse) {
        return isTokenMissing(hSResponse) || isAccessTokenInvalid(hSResponse);
    }

    private boolean isFeatureDisabled(com.helpshift.network.HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 403) {
                return false;
            }
            return new org.json.JSONObject(hSResponse.getResponseString()).optString("error", "").equals(USER_IDENTITY_FEATURE_NOT_ENABLED);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "Error in checking if feature is disabled", e);
            return false;
        }
    }

    private boolean isTokenMissing(com.helpshift.network.HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 400) {
                return false;
            }
            return new org.json.JSONObject(hSResponse.getResponseString()).optString("error", "").equals(MISSING_ACCESS_TOKEN);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "Error in checking  if token is missing", e);
            return false;
        }
    }

    private boolean isAccessTokenInvalid(com.helpshift.network.HSResponse hSResponse) {
        try {
            if (hSResponse.getStatus() != 401) {
                return false;
            }
            return new org.json.JSONObject(hSResponse.getResponseString()).optString("error", "").equals(INVALID_ACCESS_TOKEN);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e("RetryNetworkWithNewToken", "Error in checking if access token is invalid", e);
            return false;
        }
    }
}
