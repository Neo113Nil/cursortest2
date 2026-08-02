package S0;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzbbd;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.URLConnection;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.GZIPInputStream;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class B implements WebViewRendererClientBoundaryInterface, WebMessageCallbackBoundaryInterface, WebMessageListenerBoundaryInterface, A {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f6227c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6228a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6229b;

    public /* synthetic */ B() {
        this.f6228a = 2;
    }

    public static String b(File file) {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02be, code lost:
    
        if (r5.equals("js") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String h(String str) {
        char c3 = 1;
        String str2 = null;
        if (str != null) {
            String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (guessContentTypeFromName == null) {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf != -1) {
                    String lowerCase = str.substring(lastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            if (lowerCase.equals("gz")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3401:
                            break;
                        case 97669:
                            if (lowerCase.equals("bmp")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 98819:
                            if (lowerCase.equals("css")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 102340:
                            if (lowerCase.equals("gif")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 103649:
                            if (lowerCase.equals("htm")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 104085:
                            if (lowerCase.equals("ico")) {
                                c3 = 6;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 105441:
                            if (lowerCase.equals("jpg")) {
                                c3 = 7;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 106458:
                            if (lowerCase.equals("m4a")) {
                                c3 = '\b';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 106479:
                            if (lowerCase.equals("m4v")) {
                                c3 = '\t';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108089:
                            if (lowerCase.equals("mht")) {
                                c3 = '\n';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108150:
                            if (lowerCase.equals("mjs")) {
                                c3 = 11;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108272:
                            if (lowerCase.equals("mp3")) {
                                c3 = '\f';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108273:
                            if (lowerCase.equals(RRWebVideoEvent.REPLAY_CONTAINER)) {
                                c3 = '\r';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 108324:
                            if (lowerCase.equals("mpg")) {
                                c3 = 14;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109961:
                            if (lowerCase.equals("oga")) {
                                c3 = 15;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109967:
                            if (lowerCase.equals("ogg")) {
                                c3 = 16;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109973:
                            if (lowerCase.equals("ogm")) {
                                c3 = 17;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109982:
                            if (lowerCase.equals("ogv")) {
                                c3 = 18;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 110834:
                            if (lowerCase.equals("pdf")) {
                                c3 = 19;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 111030:
                            if (lowerCase.equals("pjp")) {
                                c3 = 20;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 111145:
                            if (lowerCase.equals("png")) {
                                c3 = 21;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 114276:
                            if (lowerCase.equals("svg")) {
                                c3 = 22;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 114791:
                            if (lowerCase.equals("tgz")) {
                                c3 = 23;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 114833:
                            if (lowerCase.equals("tif")) {
                                c3 = 24;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 117484:
                            if (lowerCase.equals("wav")) {
                                c3 = 25;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 118660:
                            if (lowerCase.equals("xht")) {
                                c3 = 26;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 118807:
                            if (lowerCase.equals("xml")) {
                                c3 = 27;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 120609:
                            if (lowerCase.equals("zip")) {
                                c3 = 28;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3000872:
                            if (lowerCase.equals("apng")) {
                                c3 = 29;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3145576:
                            if (lowerCase.equals("flac")) {
                                c3 = 30;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3213227:
                            if (lowerCase.equals("html")) {
                                c3 = 31;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3259225:
                            if (lowerCase.equals("jfif")) {
                                c3 = ' ';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3268712:
                            if (lowerCase.equals("jpeg")) {
                                c3 = '!';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3271912:
                            if (lowerCase.equals("json")) {
                                c3 = '\"';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3358085:
                            if (lowerCase.equals("mpeg")) {
                                c3 = '#';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3418175:
                            if (lowerCase.equals("opus")) {
                                c3 = '$';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3529614:
                            if (lowerCase.equals("shtm")) {
                                c3 = '%';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3542678:
                            if (lowerCase.equals("svgz")) {
                                c3 = '&';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3559925:
                            if (lowerCase.equals("tiff")) {
                                c3 = '\'';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3642020:
                            if (lowerCase.equals("wasm")) {
                                c3 = '(';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3645337:
                            if (lowerCase.equals("webm")) {
                                c3 = ')';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3645340:
                            if (lowerCase.equals("webp")) {
                                c3 = '*';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3655064:
                            if (lowerCase.equals("woff")) {
                                c3 = '+';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3678569:
                            if (lowerCase.equals("xhtm")) {
                                c3 = ',';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 96488848:
                            if (lowerCase.equals("ehtml")) {
                                c3 = '-';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 103877016:
                            if (lowerCase.equals("mhtml")) {
                                c3 = '.';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 106703064:
                            if (lowerCase.equals("pjpeg")) {
                                c3 = '/';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 109418142:
                            if (lowerCase.equals("shtml")) {
                                c3 = '0';
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 114035747:
                            if (lowerCase.equals("xhtml")) {
                                c3 = '1';
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    switch (c3) {
                        case 0:
                        case 23:
                            str2 = "application/gzip";
                            break;
                        case 1:
                        case 11:
                            str2 = "text/javascript";
                            break;
                        case 2:
                            str2 = "image/bmp";
                            break;
                        case 3:
                            str2 = "text/css";
                            break;
                        case 4:
                            str2 = "image/gif";
                            break;
                        case 5:
                        case 31:
                        case '%':
                        case '-':
                        case '0':
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case ' ':
                        case '!':
                        case '/':
                            str2 = "image/jpeg";
                            break;
                        case '\b':
                            str2 = "audio/x-m4a";
                            break;
                        case '\t':
                        case '\r':
                            str2 = "video/mp4";
                            break;
                        case '\n':
                        case '.':
                            str2 = "multipart/related";
                            break;
                        case '\f':
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case '#':
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case '$':
                            str2 = "audio/ogg";
                            break;
                        case 17:
                        case 18:
                            str2 = "video/ogg";
                            break;
                        case 19:
                            str2 = "application/pdf";
                            break;
                        case zzbbd.zzt.zzm /* 21 */:
                            str2 = "image/png";
                            break;
                        case 22:
                        case '&':
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case '\'':
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case ',':
                        case '1':
                            str2 = "application/xhtml+xml";
                            break;
                        case 27:
                            str2 = "text/xml";
                            break;
                        case 28:
                            str2 = "application/zip";
                            break;
                        case 29:
                            str2 = "image/apng";
                            break;
                        case 30:
                            str2 = "audio/flac";
                            break;
                        case '\"':
                            str2 = "application/json";
                            break;
                        case '(':
                            str2 = "application/wasm";
                            break;
                        case ')':
                            str2 = "video/webm";
                            break;
                        case '*':
                            str2 = "image/webp";
                            break;
                        case '+':
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = guessContentTypeFromName;
            }
        }
        return str2 == null ? "text/plain" : str2;
    }

    @Override // S0.A
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f6229b).getSupportedFeatures();
    }

    public boolean c() {
        return ((WebSettingsBoundaryInterface) this.f6229b).getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    @Override // S0.A
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) P6.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f6229b).createWebView(webView));
    }

    public int d() {
        return ((WebSettingsBoundaryInterface) this.f6229b).getForceDark();
    }

    public ServiceWorkerWebSettings e() {
        if (((ServiceWorkerWebSettings) this.f6229b) == null) {
            B b7 = x.f6311a;
            this.f6229b = (ServiceWorkerWebSettings) ((WebkitToCompatConverterBoundaryInterface) b7.f6229b).convertServiceWorkerSettings(Proxy.getInvocationHandler(null));
        }
        return (ServiceWorkerWebSettings) this.f6229b;
    }

    public Set f() {
        return ((WebSettingsBoundaryInterface) this.f6229b).getRequestedWithHeaderOriginAllowList();
    }

    public boolean g() {
        return ((WebSettingsBoundaryInterface) this.f6229b).getSafeBrowsingEnabled();
    }

    @Override // S0.A
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) P6.b.a(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f6229b).getProxyController());
    }

    @Override // S0.A
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) P6.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f6229b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        switch (this.f6228a) {
            case 0:
                return f6227c;
            case 3:
                return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
            default:
                return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
        }
    }

    @Override // S0.A
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) P6.b.a(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f6229b).getTracingController());
    }

    @Override // S0.A
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) P6.b.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f6229b).getWebkitToCompatConverter());
    }

    public boolean i() {
        return ((WebSettingsBoundaryInterface) this.f6229b).isAlgorithmicDarkeningAllowed();
    }

    public InputStream j(String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] split = str.split("/", -1);
        if (split.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = split[0];
        String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        Context context = (Context) this.f6229b;
        int identifier = context.getResources().getIdentifier(str3, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i7 = typedValue.type;
        if (i7 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i7)));
        }
        InputStream openRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(openRawResource) : openRawResource;
    }

    public void k(boolean z4) {
        ((WebSettingsBoundaryInterface) this.f6229b).setAlgorithmicDarkeningAllowed(z4);
    }

    public void l(boolean z4) {
        ((WebSettingsBoundaryInterface) this.f6229b).setEnterpriseAuthenticationAppLinkPolicyEnabled(z4);
    }

    public void m(int i7) {
        ((WebSettingsBoundaryInterface) this.f6229b).setForceDark(i7);
    }

    public void n(int i7) {
        ((WebSettingsBoundaryInterface) this.f6229b).setForceDarkBehavior(i7);
    }

    public void o(boolean z4) {
        ((WebSettingsBoundaryInterface) this.f6229b).setPaymentRequestEnabled(z4);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        R0.n a2 = p.a((WebMessageBoundaryInterface) P6.b.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (a2 != null) {
            ((R0.d) this.f6229b).onMessage(new r(invocationHandler), a2);
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z4, InvocationHandler invocationHandler2) {
        R0.n a2 = p.a((WebMessageBoundaryInterface) P6.b.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (a2 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) P6.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((R0.v) this.f6229b).onPostMessage(webView, a2, uri, z4, (i) jsReplyProxyBoundaryInterface.getOrCreatePeer(new K4.s(jsReplyProxyBoundaryInterface, 3)));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = D.f6231c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) P6.b.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        ((InAppWebViewRenderProcessClient) this.f6229b).onRenderProcessResponsive(webView, (D) webViewRendererBoundaryInterface.getOrCreatePeer(new K4.s(webViewRendererBoundaryInterface, 4)));
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap weakHashMap = D.f6231c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) P6.b.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        ((InAppWebViewRenderProcessClient) this.f6229b).onRenderProcessUnresponsive(webView, (D) webViewRendererBoundaryInterface.getOrCreatePeer(new K4.s(webViewRendererBoundaryInterface, 4)));
    }

    public void p(Set set) {
        ((WebSettingsBoundaryInterface) this.f6229b).setRequestedWithHeaderOriginAllowList(set);
    }

    public void q(boolean z4) {
        ((WebSettingsBoundaryInterface) this.f6229b).setSafeBrowsingEnabled(z4);
    }

    public /* synthetic */ B(Object obj, int i7) {
        this.f6228a = i7;
        this.f6229b = obj;
    }
}
