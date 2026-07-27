package a0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;
import b0.m;
import b0.n;
import b0.o;
import java.util.WeakHashMap;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0088b {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f1782a;

    static {
        Uri.parse("*");
        Uri.parse("");
        f1782a = new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static o b(WebView webView) {
        if (!m.f2468d.b()) {
            return new o(n.f2469a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f1782a;
        o oVar = (o) weakHashMap.get(webView);
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(n.f2469a.createWebView(webView));
        weakHashMap.put(webView, oVar2);
        return oVar2;
    }
}
