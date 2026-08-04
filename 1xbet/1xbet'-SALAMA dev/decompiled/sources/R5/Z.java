package R5;

import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import p155w1.F0;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends W {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f6121h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0423t f6122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6123c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6124d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6125e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6126f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6127g = false;

    public Z(C0423t c0423t) {
        this.f6122b = c0423t;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(consoleMessage, "messageArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, consoleMessage), new D(c0410f, 20));
        return this.f6124d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", jVar.a(), (Object) null, 1).L(Y4.D.D(this), new D(c0410f, 22));
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(str, "originArg");
        t6.h.e(callback, "callbackArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, str, callback), new D(c0410f, 21));
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", jVar.a(), (Object) null, 1).L(Y4.D.D(this), new D(c0410f, 16));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f6125e) {
            return false;
        }
        Q q7 = new Q(new X(this, jsResult, 1), 0);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(webView, "webViewArg");
        t6.h.e(str, "urlArg");
        t6.h.e(str2, "messageArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, webView, str, str2), new J(q7, 1));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f6126f) {
            return false;
        }
        Q q7 = new Q(new X(this, jsResult, 0), 0);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(webView, "webViewArg");
        t6.h.e(str, "urlArg");
        t6.h.e(str2, "messageArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, webView, str, str2), new J(q7, 3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!this.f6127g) {
            return false;
        }
        Q q7 = new Q(new X(this, jsPromptResult, 2), 0);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(webView, "webViewArg");
        t6.h.e(str, "urlArg");
        t6.h.e(str2, "messageArg");
        t6.h.e(str3, "defaultValueArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, webView, str, str2, str3), new J(q7, 0));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(permissionRequest, "requestArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, permissionRequest), new D(c0410f, 18));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        long j = i7;
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(webView, "webViewArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, webView, Long.valueOf(j)), new D(c0410f, 17));
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C0410f c0410f = new C0410f(2);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(view, "viewArg");
        t6.h.e(customViewCallback, "callbackArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, view, customViewCallback), new D(c0410f, 19));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final boolean z4 = this.f6123c;
        Q q7 = new Q(new Function1() { // from class: R5.Y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                S s7 = (S) obj;
                Z z7 = this.f6118a;
                z7.getClass();
                if (s7.f6100d) {
                    I4.j jVar = z7.f6122b.f6213a;
                    Throwable th = s7.f6099c;
                    Objects.requireNonNull(th);
                    jVar.getClass();
                    I4.j.i(th);
                    return null;
                }
                List list = (List) s7.f6098b;
                Objects.requireNonNull(list);
                if (!z4) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i7 = 0; i7 < list.size(); i7++) {
                    uriArr[i7] = Uri.parse((String) list.get(i7));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        }, 0);
        C0423t c0423t = this.f6122b;
        c0423t.getClass();
        t6.h.e(webView, "webViewArg");
        t6.h.e(fileChooserParams, "paramsArg");
        I4.j jVar = c0423t.f6213a;
        jVar.getClass();
        new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", jVar.a(), (Object) null, 1).L(p050g6.i.M0(this, webView, fileChooserParams), new J(q7, 2));
        return z4;
    }
}
