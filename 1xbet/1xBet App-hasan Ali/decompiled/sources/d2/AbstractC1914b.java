package d2;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import e2.AbstractC1934o;
import e2.C1930k;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1914b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16884a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static C1930k b(WebView webView) {
        WebViewProviderBoundaryInterface createWebView = AbstractC1934o.f16917a.createWebView(webView);
        C1930k c1930k = new C1930k(24, false);
        c1930k.f16910l = createWebView;
        return c1930k;
    }
}
