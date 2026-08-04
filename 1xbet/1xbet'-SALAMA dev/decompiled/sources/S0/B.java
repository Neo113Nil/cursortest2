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

/* JADX INFO: loaded from: classes.dex */
public class B implements WebViewRendererClientBoundaryInterface, WebMessageCallbackBoundaryInterface, WebMessageListenerBoundaryInterface, A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f6227c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6229b;

    public /* synthetic */ B() {
        this.f6228a = 2;
    }

    public static String b(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }

    public static String h(String str) {
        byte b7 = 1;
        String str2 = null;
        if (str != null) {
            String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
            if (strGuessContentTypeFromName == null) {
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    String lowerCase = str.substring(iLastIndexOf + 1).toLowerCase();
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case 3315:
                            b7 = !lowerCase.equals("gz") ? (byte) -1 : (byte) 0;
                            break;
                        case 3401:
                            if (!lowerCase.equals("js")) {
                                b7 = -1;
                            }
                            break;
                        case 97669:
                            b7 = !lowerCase.equals("bmp") ? (byte) -1 : (byte) 2;
                            break;
                        case 98819:
                            b7 = !lowerCase.equals("css") ? (byte) -1 : (byte) 3;
                            break;
                        case 102340:
                            b7 = !lowerCase.equals("gif") ? (byte) -1 : (byte) 4;
                            break;
                        case 103649:
                            b7 = !lowerCase.equals("htm") ? (byte) -1 : (byte) 5;
                            break;
                        case 104085:
                            b7 = !lowerCase.equals("ico") ? (byte) -1 : (byte) 6;
                            break;
                        case 105441:
                            b7 = !lowerCase.equals("jpg") ? (byte) -1 : (byte) 7;
                            break;
                        case 106458:
                            b7 = !lowerCase.equals("m4a") ? (byte) -1 : (byte) 8;
                            break;
                        case 106479:
                            b7 = !lowerCase.equals("m4v") ? (byte) -1 : (byte) 9;
                            break;
                        case 108089:
                            b7 = !lowerCase.equals("mht") ? (byte) -1 : (byte) 10;
                            break;
                        case 108150:
                            b7 = !lowerCase.equals("mjs") ? (byte) -1 : (byte) 11;
                            break;
                        case 108272:
                            b7 = !lowerCase.equals("mp3") ? (byte) -1 : (byte) 12;
                            break;
                        case 108273:
                            b7 = !lowerCase.equals(RRWebVideoEvent.REPLAY_CONTAINER) ? (byte) -1 : (byte) 13;
                            break;
                        case 108324:
                            b7 = !lowerCase.equals("mpg") ? (byte) -1 : (byte) 14;
                            break;
                        case 109961:
                            b7 = !lowerCase.equals("oga") ? (byte) -1 : (byte) 15;
                            break;
                        case 109967:
                            b7 = !lowerCase.equals("ogg") ? (byte) -1 : (byte) 16;
                            break;
                        case 109973:
                            b7 = !lowerCase.equals("ogm") ? (byte) -1 : (byte) 17;
                            break;
                        case 109982:
                            b7 = !lowerCase.equals("ogv") ? (byte) -1 : (byte) 18;
                            break;
                        case 110834:
                            b7 = !lowerCase.equals("pdf") ? (byte) -1 : (byte) 19;
                            break;
                        case 111030:
                            b7 = !lowerCase.equals("pjp") ? (byte) -1 : (byte) 20;
                            break;
                        case 111145:
                            b7 = !lowerCase.equals("png") ? (byte) -1 : (byte) 21;
                            break;
                        case 114276:
                            b7 = !lowerCase.equals("svg") ? (byte) -1 : (byte) 22;
                            break;
                        case 114791:
                            b7 = !lowerCase.equals("tgz") ? (byte) -1 : (byte) 23;
                            break;
                        case 114833:
                            b7 = !lowerCase.equals("tif") ? (byte) -1 : (byte) 24;
                            break;
                        case 117484:
                            b7 = !lowerCase.equals("wav") ? (byte) -1 : (byte) 25;
                            break;
                        case 118660:
                            b7 = !lowerCase.equals("xht") ? (byte) -1 : (byte) 26;
                            break;
                        case 118807:
                            b7 = !lowerCase.equals("xml") ? (byte) -1 : (byte) 27;
                            break;
                        case 120609:
                            b7 = !lowerCase.equals("zip") ? (byte) -1 : (byte) 28;
                            break;
                        case 3000872:
                            b7 = !lowerCase.equals("apng") ? (byte) -1 : (byte) 29;
                            break;
                        case 3145576:
                            b7 = !lowerCase.equals("flac") ? (byte) -1 : (byte) 30;
                            break;
                        case 3213227:
                            b7 = !lowerCase.equals("html") ? (byte) -1 : (byte) 31;
                            break;
                        case 3259225:
                            b7 = !lowerCase.equals("jfif") ? (byte) -1 : (byte) 32;
                            break;
                        case 3268712:
                            b7 = !lowerCase.equals("jpeg") ? (byte) -1 : (byte) 33;
                            break;
                        case 3271912:
                            b7 = !lowerCase.equals("json") ? (byte) -1 : (byte) 34;
                            break;
                        case 3358085:
                            b7 = !lowerCase.equals("mpeg") ? (byte) -1 : (byte) 35;
                            break;
                        case 3418175:
                            b7 = !lowerCase.equals("opus") ? (byte) -1 : (byte) 36;
                            break;
                        case 3529614:
                            b7 = !lowerCase.equals("shtm") ? (byte) -1 : (byte) 37;
                            break;
                        case 3542678:
                            b7 = !lowerCase.equals("svgz") ? (byte) -1 : (byte) 38;
                            break;
                        case 3559925:
                            b7 = !lowerCase.equals("tiff") ? (byte) -1 : (byte) 39;
                            break;
                        case 3642020:
                            b7 = !lowerCase.equals("wasm") ? (byte) -1 : (byte) 40;
                            break;
                        case 3645337:
                            b7 = !lowerCase.equals("webm") ? (byte) -1 : (byte) 41;
                            break;
                        case 3645340:
                            b7 = !lowerCase.equals("webp") ? (byte) -1 : (byte) 42;
                            break;
                        case 3655064:
                            b7 = !lowerCase.equals("woff") ? (byte) -1 : (byte) 43;
                            break;
                        case 3678569:
                            b7 = !lowerCase.equals("xhtm") ? (byte) -1 : (byte) 44;
                            break;
                        case 96488848:
                            b7 = !lowerCase.equals("ehtml") ? (byte) -1 : (byte) 45;
                            break;
                        case 103877016:
                            b7 = !lowerCase.equals("mhtml") ? (byte) -1 : (byte) 46;
                            break;
                        case 106703064:
                            b7 = !lowerCase.equals("pjpeg") ? (byte) -1 : (byte) 47;
                            break;
                        case 109418142:
                            b7 = !lowerCase.equals("shtml") ? (byte) -1 : (byte) 48;
                            break;
                        case 114035747:
                            b7 = !lowerCase.equals("xhtml") ? (byte) -1 : (byte) 49;
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    switch (b7) {
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
                        case 37:
                        case 45:
                        case 48:
                            str2 = "text/html";
                            break;
                        case 6:
                            str2 = "image/x-icon";
                            break;
                        case 7:
                        case 20:
                        case 32:
                        case 33:
                        case 47:
                            str2 = "image/jpeg";
                            break;
                        case 8:
                            str2 = "audio/x-m4a";
                            break;
                        case 9:
                        case 13:
                            str2 = "video/mp4";
                            break;
                        case 10:
                        case 46:
                            str2 = "multipart/related";
                            break;
                        case 12:
                            str2 = "audio/mpeg";
                            break;
                        case 14:
                        case 35:
                            str2 = "video/mpeg";
                            break;
                        case 15:
                        case 16:
                        case 36:
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
                        case 38:
                            str2 = "image/svg+xml";
                            break;
                        case 24:
                        case 39:
                            str2 = "image/tiff";
                            break;
                        case 25:
                            str2 = "audio/wav";
                            break;
                        case 26:
                        case 44:
                        case 49:
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
                        case 34:
                            str2 = "application/json";
                            break;
                        case 40:
                            str2 = "application/wasm";
                            break;
                        case 41:
                            str2 = "video/webm";
                            break;
                        case 42:
                            str2 = "image/webp";
                            break;
                        case 43:
                            str2 = "application/font-woff";
                            break;
                    }
                }
            } else {
                str2 = strGuessContentTypeFromName;
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

    public InputStream j(String str) throws IOException {
        if (str.length() > 1 && str.charAt(0) == '/') {
            str = str.substring(1);
        }
        String[] strArrSplit = str.split("/", -1);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: ".concat(str));
        }
        String str2 = strArrSplit[0];
        String strSubstring = strArrSplit[1];
        int iLastIndexOf = strSubstring.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iLastIndexOf);
        }
        Context context = (Context) this.f6229b;
        int identifier = context.getResources().getIdentifier(strSubstring, str2, context.getPackageName());
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(identifier, typedValue, true);
        int i7 = typedValue.type;
        if (i7 != 3) {
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", str, Integer.valueOf(i7)));
        }
        InputStream inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStreamOpenRawResource) : inputStreamOpenRawResource;
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
        R0.n nVarA = p.a((WebMessageBoundaryInterface) P6.b.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (nVarA != null) {
            ((R0.d) this.f6229b).onMessage(new r(invocationHandler), nVarA);
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z4, InvocationHandler invocationHandler2) {
        R0.n nVarA = p.a((WebMessageBoundaryInterface) P6.b.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (nVarA != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) P6.b.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            ((R0.v) this.f6229b).onPostMessage(webView, nVarA, uri, z4, (i) jsReplyProxyBoundaryInterface.getOrCreatePeer(new K4.s(jsReplyProxyBoundaryInterface, 3)));
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
