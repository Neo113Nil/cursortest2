package R5;

import A1.C0042s;
import android.content.Context;
import android.webkit.WebViewClient;
import java.util.List;
import p155w1.C1009l0;
import p155w1.C1013m0;
import p155w1.F0;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public class f0 implements p159w5.c, p164x5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p159w5.b f6162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I4.j f6163b;

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        I4.j jVar = this.f6163b;
        if (jVar != null) {
            jVar.f3681e = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        final int i7 = 1;
        final int i8 = 0;
        this.f6162a = bVar;
        A5.f fVar = bVar.f18083c;
        Context context = bVar.f18081a;
        I4.j jVar = new I4.j(fVar, context, new C0422s(context.getAssets(), bVar.f18085e));
        this.f6163b = jVar;
        ((io.flutter.plugin.platform.p) bVar.f18084d).k("plugins.flutter.io/webview", new L5.W((C0407c) jVar.f3679c));
        I4.j jVar2 = this.f6163b;
        jVar2.getClass();
        p044f6.g gVar = C0409e.f6156b;
        C0407c c0407c = (C0407c) jVar2.f3679c;
        A5.f fVar2 = (A5.f) jVar2.f3678b;
        Y4.D.V(fVar2, c0407c);
        P6.b.J(fVar2, new C0417m(jVar2, 0));
        Y4.D.W(fVar2, new C0413i(jVar2, 2));
        Q0.a.V(fVar2, new C0424u(jVar2, 1));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", jVar2.a(), (Object) null, 1).M(new F(new C0426w(jVar2, 0), 0));
        final T t7 = new T(jVar2, 1);
        A5.n nVarA = jVar2.a();
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", nVarA, (Object) null, 1).M(new A5.b() { // from class: R5.P
            @Override // A5.b
            public final void i(Object obj, V0 v6) {
                List listW0;
                List listW1;
                switch (i8) {
                    case 0:
                        T t8 = t7;
                        t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0407c) t8.f6101a.f3679c).a(((Long) obj2).longValue(), new e0(t8));
                            listW0 = Y4.D.D(null);
                            break;
                        } catch (Throwable th) {
                            listW0 = p003a.a.w0(th);
                        }
                        v6.f(listW0);
                        return;
                    default:
                        T t9 = t7;
                        t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof a0) {
                                ((a0) webViewClient).getClass();
                            } else {
                                t9.f6101a.getClass();
                                if (!(webViewClient instanceof e0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((e0) webViewClient).f6160b = zBooleanValue;
                            }
                            listW1 = Y4.D.D(null);
                        } catch (Throwable th2) {
                            listW1 = p003a.a.w0(th2);
                        }
                        v6.f(listW1);
                        return;
                }
            }
        });
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", nVarA, (Object) null, 1).M(new A5.b() { // from class: R5.P
            @Override // A5.b
            public final void i(Object obj, V0 v6) {
                List listW0;
                List listW1;
                switch (i7) {
                    case 0:
                        T t8 = t7;
                        t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        Object obj2 = ((List) obj).get(0);
                        t6.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                        try {
                            ((C0407c) t8.f6101a.f3679c).a(((Long) obj2).longValue(), new e0(t8));
                            listW0 = Y4.D.D(null);
                            break;
                        } catch (Throwable th) {
                            listW0 = p003a.a.w0(th);
                        }
                        v6.f(listW0);
                        return;
                    default:
                        T t9 = t7;
                        t6.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                        List list = (List) obj;
                        Object obj3 = list.get(0);
                        t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                        WebViewClient webViewClient = (WebViewClient) obj3;
                        Object obj4 = list.get(1);
                        t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        try {
                            if (webViewClient instanceof a0) {
                                ((a0) webViewClient).getClass();
                            } else {
                                t9.f6101a.getClass();
                                if (!(webViewClient instanceof e0)) {
                                    throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                                }
                                ((e0) webViewClient).f6160b = zBooleanValue;
                            }
                            listW1 = Y4.D.D(null);
                        } catch (Throwable th2) {
                            listW1 = p003a.a.w0(th2);
                        }
                        v6.f(listW1);
                        return;
                }
            }
        });
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", jVar2.a(), (Object) null, 1).M(new C0042s(new C0421q(jVar2, 0), 29));
        P6.b.K(fVar2, new C0423t(jVar2, 1));
        Q0.a.U(fVar2, new C0423t(jVar2, 0));
        C0426w c0426w = new C0426w(jVar2, 1);
        A5.n nVarA2 = jVar2.a();
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", nVarA2, (Object) null, 1).M(new F(c0426w, 2));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", nVarA2, (Object) null, 1).M(new M(c0426w, 0));
        B4.V v6 = new B4.V(11);
        A5.n nVarA3 = jVar2.a();
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", nVarA3, (Object) null, 1).M(new D(v6, 5));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", nVarA3, (Object) null, 1).M(new D(v6, 6));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", jVar2.a(), (Object) null, 1).M(new H5.k(new C1013m0(9), 26));
        p113p3.f.Z(fVar2, new C0421q(jVar2, 1));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", jVar2.a(), (Object) null, 1).M(new D(new M4.e(), 1));
        Y4.D.X(fVar2, new C0424u(jVar2, 0));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", jVar2.a(), (Object) null, 1).M(new H5.k(new p036e6.c(10), 19));
        p113p3.f.Y(fVar2, new C0413i(jVar2, 0));
        M4.e eVar = new M4.e();
        A5.n nVarA4 = jVar2.a();
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", nVarA4, (Object) null, 1).M(new D(eVar, 13));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", nVarA4, (Object) null, 1).M(new D(eVar, 14));
        C0417m c0417m = new C0417m(jVar2, 1);
        A5.n nVarA5 = jVar2.a();
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", nVarA5, (Object) null, 1).M(new D(c0417m, 11));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", nVarA5, (Object) null, 1).M(new F(c0417m, 1));
        p097n3.a.S(fVar2, new T(jVar2, 0));
        p003a.a.o0(fVar2, new C0413i(jVar2, 1));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", jVar2.a(), (Object) null, 1).M(new H5.k(new p036e6.c(9), 21));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", jVar2.a(), (Object) null, 1).M(new D(new C1009l0(11), 28));
        new F0(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", jVar2.a(), (Object) null, 1).M(new M(new C1013m0(11), 5));
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        this.f6163b.f3681e = this.f6162a.f18081a;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f6163b.f3681e = this.f6162a.f18081a;
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        I4.j jVar = this.f6163b;
        if (jVar != null) {
            p044f6.g gVar = C0409e.f6156b;
            A5.f fVar = (A5.f) jVar.f3678b;
            Y4.D.V(fVar, null);
            P6.b.J(fVar, null);
            Y4.D.W(fVar, null);
            Q0.a.V(fVar, null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new C0406b(), (Object) null, 1).M(null);
            C0406b c0406b = new C0406b();
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", c0406b, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", c0406b, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new C0406b(), (Object) null, 1).M(null);
            P6.b.K(fVar, null);
            Q0.a.U(fVar, null);
            C0406b c0406b2 = new C0406b();
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", c0406b2, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", c0406b2, (Object) null, 1).M(null);
            C0406b c0406b3 = new C0406b();
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", c0406b3, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", c0406b3, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new C0406b(), (Object) null, 1).M(null);
            p113p3.f.Z(fVar, null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new C0406b(), (Object) null, 1).M(null);
            Y4.D.X(fVar, null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new C0406b(), (Object) null, 1).M(null);
            p113p3.f.Y(fVar, null);
            C0406b c0406b4 = new C0406b();
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", c0406b4, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", c0406b4, (Object) null, 1).M(null);
            C0406b c0406b5 = new C0406b();
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", c0406b5, (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", c0406b5, (Object) null, 1).M(null);
            p097n3.a.S(fVar, null);
            p003a.a.o0(fVar, null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new C0406b(), (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new C0406b(), (Object) null, 1).M(null);
            new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new C0406b(), (Object) null, 1).M(null);
            C0407c c0407c = (C0407c) this.f6163b.f3679c;
            c0407c.f6141g.removeCallbacks(c0407c.f6142h);
            c0407c.j = true;
            this.f6163b = null;
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        this.f6163b.f3681e = (p121q5.c) ((Q3.o) bVar).f5822a;
    }
}
