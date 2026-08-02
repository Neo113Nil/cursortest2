package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class WebViewCookieCollector {
    private final com.knotapi.knot.interfaces.CookieBuilder cookieBuilder;

    public WebViewCookieCollector(com.knotapi.knot.interfaces.CookieBuilder cookieBuilder) {
        this.cookieBuilder = cookieBuilder;
    }

    public java.util.Map<java.lang.String, java.lang.String> collectAllCookies(android.webkit.WebView webView, java.lang.String str) {
        java.lang.String cookie;
        java.lang.String cookie2;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
        if (str != null && (cookie2 = cookieManager.getCookie(str)) != null) {
            hashMap.put(str, cookie2);
        }
        android.webkit.WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
        for (int i = 0; i < copyBackForwardList.getSize(); i++) {
            android.webkit.WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            java.lang.String url = itemAtIndex.getUrl();
            java.lang.String cookie3 = cookieManager.getCookie(url);
            if (cookie3 != null) {
                hashMap.put(url, cookie3);
            }
            java.lang.String originalUrl = itemAtIndex.getOriginalUrl();
            if (originalUrl != null && !originalUrl.equals(url) && (cookie = cookieManager.getCookie(originalUrl)) != null) {
                hashMap.put(originalUrl, cookie);
            }
        }
        return hashMap;
    }

    public java.util.List<com.knotapi.knot.utilities.Cookie> getAllCookiesAsList(android.webkit.WebView webView, java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> collectAllCookies = collectAllCookies(webView, str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : collectAllCookies.entrySet()) {
            java.lang.String key = entry.getKey();
            for (java.lang.String str2 : entry.getValue().split(";")) {
                com.knotapi.knot.utilities.Cookie buildCookie = this.cookieBuilder.buildCookie(str2, key);
                if (buildCookie != null) {
                    arrayList.add(buildCookie);
                }
            }
        }
        return com.knotapi.knot.utilities.Cookie.mergeAll(new java.util.ArrayList(), arrayList);
    }
}
