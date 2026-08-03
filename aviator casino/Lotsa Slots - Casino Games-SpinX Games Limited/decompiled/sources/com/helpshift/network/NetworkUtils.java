package com.helpshift.network;

/* loaded from: classes2.dex */
public class NetworkUtils {
    private static final java.lang.String API_VERSION_HEADER = "application/vnd+hsapi-v2+json";
    private static final java.lang.String CRASH_LOG_PATH = "/sdkx/crash-log";
    private static final java.lang.String EVENTS_PATH = "/events/v1/";
    private static final java.lang.String HTTPS_API_PREFIX = "https://api.";
    private static final java.lang.String IDENTITIES_PATH = "/identity";
    private static final java.lang.String LOGOUT = "/logout";
    private static final java.lang.String ROTATE_TOKEN = "/rotate-tokens";
    private static final java.lang.String SDK_VERSION_SYNC_PATH = "/sdk-data";
    public static final java.lang.String SOURCE = "android";
    private static final java.lang.String WEBSDK_PATH = "/websdk/";
    public static final java.lang.String X_HS_ACCESS_TOKEN = "x-hs-access-token";

    private NetworkUtils() {
    }

    public static java.lang.String getSdkVersionSyncRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + SDK_VERSION_SYNC_PATH;
    }

    public static java.lang.String getAnalyticsAPIRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + EVENTS_PATH + hSPersistentStorage.getDomain() + WEBSDK_PATH;
    }

    public static java.lang.String getCrashLogsRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + EVENTS_PATH + hSPersistentStorage.getDomain() + CRASH_LOG_PATH;
    }

    public static java.lang.String getLoginWithIdentityRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + IDENTITIES_PATH;
    }

    public static java.lang.String getSyncIdentitiesRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + IDENTITIES_PATH;
    }

    public static java.lang.String getRotateTokenRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + ROTATE_TOKEN;
    }

    public static java.lang.String getLogoutRoute(com.helpshift.storage.HSPersistentStorage hSPersistentStorage) {
        return HTTPS_API_PREFIX + hSPersistentStorage.getHost() + WEBSDK_PATH + hSPersistentStorage.getDomain() + LOGOUT;
    }

    public static java.util.Map<java.lang.String, java.lang.String> buildHeaderMap(com.helpshift.platform.Device device, java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String encodeBase64 = device.encodeBase64(str + ":");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Basic ");
        sb.append(encodeBase64);
        hashMap.put(com.google.common.net.HttpHeaders.AUTHORIZATION, sb.toString());
        hashMap.put(com.google.common.net.HttpHeaders.ACCEPT, API_VERSION_HEADER);
        return hashMap;
    }

    public static java.lang.String getBodyForPostMethod(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            try {
                arrayList.add(java.net.URLEncoder.encode(entry.getKey(), "UTF-8") + com.ironsource.X3.j.b + java.net.URLEncoder.encode(entry.getValue(), "UTF-8"));
            } catch (java.io.UnsupportedEncodingException e) {
                throw com.helpshift.network.exception.HSRootApiException.wrap(e, com.helpshift.network.exception.NetworkException.UNSUPPORTED_ENCODING_EXCEPTION);
            }
        }
        return com.helpshift.util.Utils.join(com.ironsource.X3.j.c, arrayList);
    }

    public static java.util.Map<java.lang.String, java.lang.String> cleanDataForNetworkBody(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            if (key != null && value != null) {
                hashMap.put(key, value);
            }
        }
        return hashMap;
    }

    public static com.helpshift.network.HSRequest getRequestBodyForRotatingToken(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.platform.Device device, java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.helpshift.network.HSRequest(com.helpshift.network.HSRequest.Method.POST, getRotateTokenRoute(hSPersistentStorage), buildHeaderMap(device, hSPersistentStorage.getPlatformId()), getBodyForPostMethod(cleanDataForNetworkBody(map)), 5000);
    }

    public static com.helpshift.network.HSRequestData getRequestDataForLogout(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, com.helpshift.user.UserWithIdentity userWithIdentity, com.helpshift.platform.Device device) {
        java.lang.String currentPushToken = hSPersistentStorage.getCurrentPushToken();
        java.lang.String refreshToken = userWithIdentity.getRefreshToken();
        java.lang.String accessToken = userWithIdentity.getAccessToken();
        java.lang.String platformId = hSPersistentStorage.getPlatformId();
        java.lang.String deviceId = device.getDeviceId();
        java.util.Map<java.lang.String, java.lang.String> buildHeaderMap = buildHeaderMap(device, platformId);
        buildHeaderMap.put(X_HS_ACCESS_TOKEN, accessToken);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("did", deviceId);
        hashMap.put(com.helpshift.user.IdentityAttributesUtil.ATTRIBUTE_PUSH_TOKEN, currentPushToken);
        hashMap.put(com.helpshift.user.UserConstants.REFRESH_TOKEN, refreshToken);
        return new com.helpshift.network.HSRequestData(buildHeaderMap, hashMap);
    }
}
