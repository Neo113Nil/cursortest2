package com.helpshift.util;

/* loaded from: classes5.dex */
public class ResourceCacheUtil {
    private static final java.lang.String TAG = "ResCacheUtil";

    private ResourceCacheUtil() {
    }

    public static android.webkit.WebResourceResponse getWebResourceResponse(com.helpshift.cache.HelpshiftResourceCacheManager helpshiftResourceCacheManager, android.webkit.WebResourceRequest webResourceRequest) {
        if (com.helpshift.AndroidOSUtil.currentOSAPILevel() < 21) {
            return null;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        java.lang.String path = url.getPath();
        java.lang.String query = url.getQuery();
        java.io.InputStream fetchCachedResourceStream = helpshiftResourceCacheManager.fetchCachedResourceStream(webResourceRequest.getUrl().toString(), path, query, webResourceRequest.getRequestHeaders());
        if (fetchCachedResourceStream == null) {
            com.helpshift.log.HSLogger.e(TAG, "Error in receiving response for intercepted request to be cached- " + url + " \n Path: " + path + "\n Query: " + query);
            return null;
        }
        java.lang.String resourceMimeType = helpshiftResourceCacheManager.getResourceMimeType(path, query);
        java.util.Map<java.lang.String, java.lang.String> cachedResponseHeadersForResource = helpshiftResourceCacheManager.getCachedResponseHeadersForResource(path, query);
        com.helpshift.log.HSLogger.d(TAG, "Response received for intercepted request to be cached- " + url + " MimeType:" + resourceMimeType);
        return new android.webkit.WebResourceResponse(resourceMimeType, com.ironsource.B5.O, 200, "OK", cachedResponseHeadersForResource, fetchCachedResourceStream);
    }
}
