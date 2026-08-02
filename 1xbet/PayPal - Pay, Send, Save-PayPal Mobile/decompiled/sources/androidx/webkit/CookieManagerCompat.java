package androidx.webkit;

/* loaded from: classes7.dex */
public class CookieManagerCompat {
    private CookieManagerCompat() {
    }

    public static java.util.List<java.lang.String> getCookieInfo(android.webkit.CookieManager cookieManager, java.lang.String str) {
        if (androidx.webkit.internal.WebViewFeatureInternal.GET_COOKIE_INFO.isSupportedByWebView()) {
            return Camera2StreamConfigurationMap(cookieManager).getCookieInfo(str);
        }
        throw androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException();
    }

    private static androidx.webkit.internal.CookieManagerAdapter Camera2StreamConfigurationMap(android.webkit.CookieManager cookieManager) {
        return androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter().convertCookieManager(cookieManager);
    }
}
