package R0;

import S0.B;
import S0.C;
import S0.C0431b;
import S0.y;
import S0.z;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f5874a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f5875b = Uri.parse("");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5876c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f5877d = new WeakHashMap();

    public static S0.l a(WebView webView, String str, Set set) {
        if (!S0.w.f6277K.b()) {
            throw S0.w.a();
        }
        z f7 = f(webView);
        return new S0.l((ScriptHandlerBoundaryInterface) P6.b.a(ScriptHandlerBoundaryInterface.class, f7.f6313a.addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
    }

    public static void b(WebView webView, String str, Set set, v vVar) {
        if (!S0.w.f6276J.b()) {
            throw S0.w.a();
        }
        z f7 = f(webView);
        f7.f6313a.addWebMessageListener(str, (String[]) set.toArray(new String[0]), new P6.a(new B(vVar, 4)));
    }

    public static void c(WebView webView) {
        Looper webViewLooper;
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        webViewLooper = webView.getWebViewLooper();
        if (webViewLooper == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + webViewLooper + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static PackageInfo d(Context context) {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = e();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    public static PackageInfo e() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static z f(WebView webView) {
        if (!S0.w.f6284R.b() || !f5876c) {
            return new z(y.f6312a.createWebView(webView));
        }
        WeakHashMap weakHashMap = f5877d;
        z zVar = (z) weakHashMap.get(webView);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(y.f6312a.createWebView(webView));
        weakHashMap.put(webView, zVar2);
        return zVar2;
    }

    public static void g(WebView webView, n nVar, Uri uri) {
        if (f5874a.equals(uri)) {
            uri = f5875b;
        }
        C0431b c0431b = S0.w.f6308x;
        c0431b.getClass();
        int i7 = nVar.f5865d;
        if (i7 == 0) {
            webView.postWebMessage(S0.r.b(nVar), uri);
            return;
        }
        if (!c0431b.b() || (i7 != 0 && (i7 != 1 || !S0.w.f6305u.b()))) {
            throw S0.w.a();
        }
        c(webView);
        z f7 = f(webView);
        f7.f6313a.postMessageToMainFrame(new P6.a(new S0.p(nVar)), uri);
    }

    public static void h(HashSet hashSet, ValueCallback valueCallback) {
        C0431b c0431b = S0.w.f6291f;
        C0431b c0431b2 = S0.w.f6290e;
        if (c0431b.b()) {
            y.f6312a.getStatics().setSafeBrowsingAllowlist(hashSet, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (c0431b2.a()) {
            WebView.setSafeBrowsingWhitelist(arrayList, valueCallback);
        } else {
            if (!c0431b2.b()) {
                throw S0.w.a();
            }
            y.f6312a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    public static void i(InAppWebView inAppWebView, InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        C0431b c0431b = S0.w.f6270D;
        if (c0431b.a()) {
            inAppWebView.setWebViewRenderProcessClient(inAppWebViewRenderProcessClient != null ? new C(inAppWebViewRenderProcessClient) : null);
        } else {
            if (!c0431b.b()) {
                throw S0.w.a();
            }
            c(inAppWebView);
            f(inAppWebView).f6313a.setWebViewRendererClient(inAppWebViewRenderProcessClient != null ? new P6.a(new B(inAppWebViewRenderProcessClient, 0)) : null);
        }
    }
}
