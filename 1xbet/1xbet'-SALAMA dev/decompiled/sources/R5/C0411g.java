package R5;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p155w1.F0;

/* JADX INFO: renamed from: R5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0411g extends C0406b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6164e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I4.j f6165d;

    public C0411g(I4.j jVar) {
        t6.h.e(jVar, "registrar");
        this.f6165d = jVar;
    }

    @Override // R5.C0406b, A5.x
    public final Object f(byte b7, ByteBuffer byteBuffer) {
        t6.h.e(byteBuffer, "buffer");
        if (b7 != -128) {
            return super.f(b7, byteBuffer);
        }
        Object objE = e(byteBuffer);
        t6.h.c(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((C0407c) this.f6165d.f3679c).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // R5.C0406b, A5.x
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        r rVar;
        EnumC0414j enumC0414j;
        t6.h.e(byteArrayOutputStream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof r) || (obj instanceof EnumC0414j) || (obj instanceof EnumC0428y) || (obj instanceof U) || (obj instanceof EnumC0427x) || obj == null) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        boolean z4 = obj instanceof WebResourceRequest;
        Object obj2 = null;
        I4.j jVar = this.f6165d;
        if (z4) {
            jVar.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C0410f c0410f = new C0410f(0);
            C0407c c0407c = (C0407c) jVar.f3679c;
            if (!c0407c.d(webResourceRequest)) {
                long jB = c0407c.b(webResourceRequest);
                String string = webResourceRequest.getUrl().toString();
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(jB), string, Boolean.valueOf(zIsForMainFrame), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders()), new D(c0410f, 25));
            }
        } else if (obj instanceof WebResourceResponse) {
            jVar.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C0410f c0410f2 = new C0410f(0);
            C0407c c0407c2 = (C0407c) jVar.f3679c;
            if (!c0407c2.d(webResourceResponse)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(c0407c2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new D(c0410f2, 26));
            }
        } else if (obj instanceof WebResourceError) {
            jVar.getClass();
            WebResourceError webResourceError = (WebResourceError) obj;
            C0410f c0410f3 = new C0410f(0);
            C0407c c0407c3 = (C0407c) jVar.f3679c;
            if (!c0407c3.d(webResourceError)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(c0407c3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new D(c0410f3, 23));
            }
        } else if (obj instanceof R0.p) {
            jVar.getClass();
            R0.p pVar = (R0.p) obj;
            C0410f c0410f4 = new C0410f(0);
            C0407c c0407c4 = (C0407c) jVar.f3679c;
            if (!c0407c4.d(pVar)) {
                long jB2 = c0407c4.b(pVar);
                S0.s sVar = (S0.s) pVar;
                S0.w.f6299o.getClass();
                if (sVar.f6263a == null) {
                    sVar.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) S0.x.f6311a.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar.f6264b));
                }
                long errorCode = sVar.f6263a.getErrorCode();
                S0.w.f6298n.getClass();
                if (sVar.f6263a == null) {
                    sVar.f6263a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) S0.x.f6311a.f6229b).convertWebResourceError(Proxy.getInvocationHandler(sVar.f6264b));
                }
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(jB2), Long.valueOf(errorCode), sVar.f6263a.getDescription().toString()), new D(c0410f4, 24));
            }
        } else if (obj instanceof g0) {
            jVar.getClass();
            g0 g0Var = (g0) obj;
            C0410f c0410f5 = new C0410f(0);
            C0407c c0407c5 = (C0407c) jVar.f3679c;
            if (!c0407c5.d(g0Var)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(c0407c5.b(g0Var)), Long.valueOf(g0Var.f6166a), Long.valueOf(g0Var.f6167b)), new M(c0410f5, 6));
            }
        } else if (obj instanceof ConsoleMessage) {
            jVar.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C0410f c0410f6 = new C0410f(0);
            C0407c c0407c6 = (C0407c) jVar.f3679c;
            if (!c0407c6.d(consoleMessage)) {
                long jB3 = c0407c6.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i7 = AbstractC0415k.f6188a[consoleMessage.messageLevel().ordinal()];
                if (i7 == 1) {
                    enumC0414j = EnumC0414j.TIP;
                } else if (i7 == 2) {
                    enumC0414j = EnumC0414j.LOG;
                } else if (i7 == 3) {
                    enumC0414j = EnumC0414j.WARNING;
                } else if (i7 != 4) {
                    enumC0414j = i7 != 5 ? EnumC0414j.UNKNOWN : EnumC0414j.DEBUG;
                } else {
                    enumC0414j = EnumC0414j.ERROR;
                }
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(jB3), Long.valueOf(jLineNumber), strMessage, enumC0414j, consoleMessage.sourceId()), new H5.k(c0410f6, 23));
            }
        } else if (obj instanceof CookieManager) {
            jVar.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C0410f c0410f7 = new C0410f(0);
            C0407c c0407c7 = (C0407c) jVar.f3679c;
            if (!c0407c7.d(cookieManager)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c7.b(cookieManager))), new H5.k(c0410f7, 24));
            }
        } else if (obj instanceof WebView) {
            jVar.getClass();
            WebView webView = (WebView) obj;
            C0410f c0410f8 = new C0410f(0);
            C0407c c0407c8 = (C0407c) jVar.f3679c;
            if (!c0407c8.d(webView)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c8.b(webView))), new M(c0410f8, 1));
            }
        } else if (obj instanceof WebSettings) {
            jVar.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C0410f c0410f9 = new C0410f(0);
            C0407c c0407c9 = (C0407c) jVar.f3679c;
            if (!c0407c9.d(webSettings)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c9.b(webSettings))), new D(c0410f9, 27));
            }
        } else if (obj instanceof C0425v) {
            jVar.getClass();
            if (!((C0407c) jVar.f3679c).d((C0425v) obj)) {
                p150v0.a.m("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof WebViewClient) {
            jVar.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C0410f c0410f10 = new C0410f(0);
            C0407c c0407c10 = (C0407c) jVar.f3679c;
            if (!c0407c10.d(webViewClient)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c10.b(webViewClient))), new M(c0410f10, 3));
            }
        } else if (obj instanceof DownloadListener) {
            jVar.getClass();
            if (!((C0407c) jVar.f3679c).d((DownloadListener) obj)) {
                p150v0.a.m("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof Z) {
            jVar.getClass();
            if (!((C0407c) jVar.f3679c).d((Z) obj)) {
                p150v0.a.m("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "");
            }
        } else if (obj instanceof C0422s) {
            jVar.getClass();
            C0422s c0422s = (C0422s) obj;
            C0410f c0410f11 = new C0410f(0);
            C0407c c0407c11 = (C0407c) jVar.f3679c;
            if (!c0407c11.d(c0422s)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c11.b(c0422s))), new H5.k(c0410f11, 29));
            }
        } else if (obj instanceof WebStorage) {
            jVar.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C0410f c0410f12 = new C0410f(0);
            C0407c c0407c12 = (C0407c) jVar.f3679c;
            if (!c0407c12.d(webStorage)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c12.b(webStorage))), new D(c0410f12, 29));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            jVar.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C0410f c0410f13 = new C0410f(0);
            C0407c c0407c13 = (C0407c) jVar.f3679c;
            if (!c0407c13.d(fileChooserParams)) {
                long jB4 = c0407c13.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                if (mode == 0) {
                    rVar = r.OPEN;
                } else if (mode != 1) {
                    rVar = mode != 3 ? r.UNKNOWN : r.SAVE;
                } else {
                    rVar = r.OPEN_MULTIPLE;
                }
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(jB4), Boolean.valueOf(zIsCaptureEnabled), listAsList, rVar, fileChooserParams.getFilenameHint()), new H5.k(c0410f13, 28));
            }
        } else if (obj instanceof PermissionRequest) {
            jVar.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C0410f c0410f14 = new C0410f(0);
            C0407c c0407c14 = (C0407c) jVar.f3679c;
            if (!c0407c14.d(permissionRequest)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(c0407c14.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new D(c0410f14, 4));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            jVar.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C0410f c0410f15 = new C0410f(0);
            C0407c c0407c15 = (C0407c) jVar.f3679c;
            if (!c0407c15.d(customViewCallback)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c15.b(customViewCallback))), new H5.k(c0410f15, 25));
            }
        } else if (obj instanceof View) {
            jVar.getClass();
            View view = (View) obj;
            C0410f c0410f16 = new C0410f(0);
            C0407c c0407c16 = (C0407c) jVar.f3679c;
            if (!c0407c16.d(view)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c16.b(view))), new D(c0410f16, 15));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            jVar.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C0410f c0410f17 = new C0410f(0);
            C0407c c0407c17 = (C0407c) jVar.f3679c;
            if (!c0407c17.d(callback)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c17.b(callback))), new D(c0410f17, 0));
            }
        } else if (obj instanceof HttpAuthHandler) {
            jVar.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C0410f c0410f18 = new C0410f(0);
            C0407c c0407c18 = (C0407c) jVar.f3679c;
            if (!c0407c18.d(httpAuthHandler)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c18.b(httpAuthHandler))), new D(c0410f18, 2));
            }
        } else if (obj instanceof Message) {
            jVar.getClass();
            Message message = (Message) obj;
            C0410f c0410f19 = new C0410f(0);
            C0407c c0407c19 = (C0407c) jVar.f3679c;
            if (!c0407c19.d(message)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c19.b(message))), new H5.k(c0410f19, 18));
            }
        } else if (obj instanceof ClientCertRequest) {
            jVar.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C0410f c0410f20 = new C0410f(0);
            C0407c c0407c20 = (C0407c) jVar.f3679c;
            if (!c0407c20.d(clientCertRequest)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c20.b(clientCertRequest))), new H5.k(c0410f20, 22));
            }
        } else if (obj instanceof PrivateKey) {
            jVar.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C0410f c0410f21 = new C0410f(0);
            C0407c c0407c21 = (C0407c) jVar.f3679c;
            if (!c0407c21.d(privateKey)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c21.b(privateKey))), new D(c0410f21, 7));
            }
        } else if (obj instanceof X509Certificate) {
            jVar.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C0410f c0410f22 = new C0410f(0);
            C0407c c0407c22 = (C0407c) jVar.f3679c;
            if (!c0407c22.d(x509Certificate)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c22.b(x509Certificate))), new M(c0410f22, 7));
            }
        } else if (obj instanceof SslErrorHandler) {
            jVar.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C0410f c0410f23 = new C0410f(0);
            C0407c c0407c23 = (C0407c) jVar.f3679c;
            if (!c0407c23.d(sslErrorHandler)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c23.b(sslErrorHandler))), new D(c0410f23, 12));
            }
        } else if (obj instanceof SslError) {
            jVar.getClass();
            SslError sslError = (SslError) obj;
            C0410f c0410f24 = new C0410f(0);
            C0407c c0407c24 = (C0407c) jVar.f3679c;
            if (!c0407c24.d(sslError)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", jVar.a(), obj2, 1).L(p050g6.i.M0(Long.valueOf(c0407c24.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new D(c0410f24, 10));
            }
        } else if (obj instanceof SslCertificate.DName) {
            jVar.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C0410f c0410f25 = new C0410f(0);
            C0407c c0407c25 = (C0407c) jVar.f3679c;
            if (!c0407c25.d(dName)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c25.b(dName))), new D(c0410f25, 9));
            }
        } else if (obj instanceof SslCertificate) {
            jVar.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C0410f c0410f26 = new C0410f(0);
            C0407c c0407c26 = (C0407c) jVar.f3679c;
            if (!c0407c26.d(sslCertificate)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c26.b(sslCertificate))), new D(c0410f26, 8));
            }
        } else if (obj instanceof Certificate) {
            jVar.getClass();
            Certificate certificate = (Certificate) obj;
            C0410f c0410f27 = new C0410f(0);
            C0407c c0407c27 = (C0407c) jVar.f3679c;
            if (!c0407c27.d(certificate)) {
                new F0((A5.f) jVar.f3678b, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", jVar.a(), obj2, 1).L(Y4.D.D(Long.valueOf(c0407c27.b(certificate))), new H5.k(c0410f27, 20));
            }
        }
        if (!((C0407c) jVar.f3679c).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        byteArrayOutputStream.write(128);
        C0407c c0407c28 = (C0407c) jVar.f3679c;
        c0407c28.f();
        Long l7 = (Long) c0407c28.f6136b.get(obj);
        if (l7 != null) {
            c0407c28.f6138d.put(l7, obj);
        }
        k(byteArrayOutputStream, l7);
    }
}
