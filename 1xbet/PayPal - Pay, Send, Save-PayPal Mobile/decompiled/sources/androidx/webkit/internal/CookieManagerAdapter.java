package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class CookieManagerAdapter {
    private final org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface getHighResolutionOutputSizeshNQ4ISI;

    public CookieManagerAdapter(org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.getHighResolutionOutputSizeshNQ4ISI = webViewCookieManagerBoundaryInterface;
    }

    public java.util.List<java.lang.String> getCookieInfo(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCookieInfo(str);
    }
}
