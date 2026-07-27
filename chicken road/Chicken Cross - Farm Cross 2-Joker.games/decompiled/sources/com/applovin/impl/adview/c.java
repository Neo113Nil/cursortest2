package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.c4;
import com.applovin.impl.c5;
import com.applovin.impl.g8;
import com.applovin.impl.h2;
import com.applovin.impl.j2;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import com.applovin.impl.u7;
import com.applovin.impl.x7;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAdSize;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import com.tiktok.util.UrlConst;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class c extends y4 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f4130a;
    private final p b;
    private final com.applovin.impl.adview.a c;

    public c(com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.l lVar) {
        this.f4130a = lVar;
        this.b = lVar.Q();
        this.c = aVar;
    }

    private void b() {
        this.c.y();
    }

    private void c() {
        this.c.a();
    }

    private WebResourceResponse e() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return new WebResourceResponse(AssetHelper.DEFAULT_MIME_TYPE, C4761z5.O, 404, "Not Found", hashMap, new ByteArrayInputStream(new byte[0]));
    }

    @Override // com.applovin.impl.y4
    protected Map a() {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("name", "AdWebViewClient");
        hashMap.putAll(j2.a((AppLovinAdImpl) this.c.g()));
        return hashMap;
    }

    protected com.applovin.impl.adview.a d() {
        return this.c;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (p.a()) {
            this.b.d("AdWebView", "Loaded resource: " + str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (p.a()) {
            this.b.d("AdWebView", "Loaded URL: " + str);
        }
        this.c.a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        if (p.a()) {
            this.b.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + g);
        }
        if (t7.a(webResourceRequest.getUrl().toString(), this.f4130a)) {
            this.f4130a.E().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str = "Received SSL error: " + sslError;
        if (p.a()) {
            this.b.b("AdWebView", str + " for ad: " + g);
        }
    }

    @Override // com.applovin.impl.y4, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), null);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        p.h("AdWebView", "Render process gone for ad: " + g + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        boolean onRenderProcessGone = super.onRenderProcessGone(webView, renderProcessGoneDetail);
        if (((Boolean) this.f4130a.a(c5.c6)).booleanValue()) {
            a(webView, renderProcessGoneDetail, g);
        }
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url == null || !"sdk".equals(url.getScheme())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        com.applovin.impl.sdk.ad.b g = this.c.g();
        if (!(g instanceof com.applovin.impl.sdk.ad.a)) {
            return e();
        }
        c4 i1 = ((com.applovin.impl.sdk.ad.a) g).i1();
        if (i1 == null) {
            return e();
        }
        n I = this.f4130a.I();
        String uri = url.toString();
        if (uri.equals(i1.e())) {
            byte[] d = i1.d();
            if (d == null) {
                return e();
            }
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
            return new WebResourceResponse("application/dash+xml", C4761z5.O, 200, "OK", hashMap, new ByteArrayInputStream(d));
        }
        String replace = uri.replace("sdk://", UrlConst.HTTPS);
        String str = webResourceRequest.getRequestHeaders().get("Range");
        if (str == null) {
            return e();
        }
        String replace2 = str.replace("bytes=", "");
        byte[] a2 = i1.a(replace, replace2);
        if (a2 == null) {
            return e();
        }
        InputStream a3 = a(a2, replace2);
        String a4 = I.a(replace);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(HttpHeaders.CONTENT_RANGE, "bytes " + replace2 + "/*");
        hashMap2.put(HttpHeaders.ACCEPT_RANGES, "bytes");
        hashMap2.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        return new WebResourceResponse(a4, null, 206, "Partial Content", hashMap2, a3);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!p.a()) {
            return false;
        }
        this.b.b("AdWebView", "No url found for request");
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.applovin.impl.sdk.ad.b g = this.c.g();
        String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
        if (p.a()) {
            this.b.b("AdWebView", str3 + " for ad: " + g);
        }
        if (t7.a(str2, this.f4130a)) {
            this.f4130a.E().a("adWebViewReceivedError", str2, i, str);
        }
    }

    protected boolean a(WebView webView, String str) {
        boolean z;
        if (this.c == null) {
            return true;
        }
        if (p.a()) {
            this.b.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            com.applovin.impl.sdk.ad.b g = this.c.g();
            if (g == null) {
                if (p.a()) {
                    this.b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            boolean a2 = bVar.a();
            if ("applovin".equals(scheme) && "com.applovin.sdk".equals(host)) {
                if ("/vibrate".equals(path)) {
                    long parseLong = StringUtils.parseLong(parse.getQueryParameter("duration_ms"), 0L);
                    if (parseLong > 0) {
                        t7.a(StringUtils.parseFloat(parse.getQueryParameter("intensity"), 0.5f), parseLong, this.f4130a);
                    }
                } else if ("/adservice/close_ad".equals(path)) {
                    b();
                } else if ("/adservice/expand_ad".equals(path)) {
                    if (a(a2, g, parse)) {
                        if (p.a()) {
                            this.b.b("AdWebView", "Skipping expand command without user interaction");
                        }
                        return true;
                    }
                    a(bVar.getLastClickEvent());
                } else if ("/adservice/contract_ad".equals(path)) {
                    c();
                } else {
                    if ("/adservice/no_op".equals(path)) {
                        return true;
                    }
                    if ("/adservice/load_url".equals(path)) {
                        if (a(a2, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping URL load command without user interaction");
                            }
                            return true;
                        }
                        q7.a(parse, this.c, this.f4130a);
                    } else if ("/adservice/track_click_now".equals(path)) {
                        if (a(a2, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping click tracking command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof u7) {
                            a((u7) g, bVar);
                        } else {
                            a(bVar, Uri.parse("/adservice/track_click_now"));
                        }
                    } else if ("/adservice/deeplink".equals(path)) {
                        if (a(a2, g, parse)) {
                            if (p.a()) {
                                this.b.b("AdWebView", "Skipping deep link plus command without user interaction");
                            }
                            return true;
                        }
                        if (g instanceof u7) {
                            u7 u7Var = (u7) g;
                            if (u7Var.w1()) {
                                a(u7Var, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if ("/adservice/postback".equals(path)) {
                        q7.a(parse, g, this.f4130a);
                    } else if ("/ga_init".equals(path)) {
                        this.c.c(parse);
                    } else if ("/ga_event".equals(path)) {
                        this.c.b(parse);
                    } else if ("/playable_event".equals(path)) {
                        a(parse);
                    } else if ("/save_template_state".equals(path)) {
                        g.b(parse.getQueryParameter("state"));
                    } else if ("/template_error".equals(path)) {
                        q7.c(parse, g, this.f4130a);
                    } else if ("/adservice/fully_watched".equals(path)) {
                        this.c.z();
                    } else if ("/adservice/preload".equals(path)) {
                        q7.b(parse, g, this.f4130a);
                    } else if ("/adservice/custom_intent".equals(path)) {
                        q7.a(parse, g, this.c.i(), this.f4130a);
                    } else if ("/config_system_bars".equals(path)) {
                        this.c.a(parse);
                    } else if ("/save_template_stage_info".equals(path)) {
                        g.c(parse.getQueryParameter("stage_info"));
                    } else {
                        if (p.a()) {
                            this.b.k("AdWebView", "Unknown URL: " + str);
                        }
                        if (p.a()) {
                            this.b.k("AdWebView", "Path: " + path);
                        }
                    }
                }
            } else {
                Iterator it = g.Y().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (StringUtils.isValidString(path) && path.contains(str2)) {
                        z = false;
                        break;
                    }
                }
                if (!a2) {
                    boolean X0 = g.X0();
                    boolean z2 = X0 ? false : z;
                    a(parse, X0, g, this.f4130a);
                    z = z2;
                }
                if (z) {
                    List r0 = g.r0();
                    List q0 = g.q0();
                    if ((!r0.isEmpty() && !r0.contains(scheme)) || (!q0.isEmpty() && !q0.contains(host))) {
                        if (p.a()) {
                            this.b.b("AdWebView", "URL is not whitelisted - bypassing click");
                        }
                    } else {
                        if (g instanceof u7) {
                            u7 u7Var2 = (u7) g;
                            if (u7Var2.w1()) {
                                a(u7Var2, bVar);
                            }
                        }
                        a(bVar, parse);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    private static class a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        final int f4131a;
        final byte[] b;
        int c = 0;

        a(int i, byte[] bArr) {
            this.f4131a = i;
            this.b = bArr;
        }

        @Override // java.io.InputStream
        public int available() {
            return (this.f4131a + this.b.length) - this.c;
        }

        @Override // java.io.InputStream
        public int read() {
            int i = this.c;
            int i2 = this.f4131a;
            if (i < i2) {
                this.c = i + 1;
                return 0;
            }
            int i3 = i - i2;
            byte[] bArr = this.b;
            if (i3 >= bArr.length) {
                return -1;
            }
            this.c = i + 1;
            return bArr[i3] & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5 = 0;
            if (i2 == 0) {
                return 0;
            }
            int i6 = this.f4131a;
            int length = this.b.length + i6;
            int i7 = this.c;
            if (i7 >= length) {
                return -1;
            }
            if (i7 < i6) {
                int min = Math.min(i2, i6 - i7);
                for (int i8 = 0; i8 < min; i8++) {
                    bArr[i + i8] = 0;
                }
                this.c += min;
                i5 = min;
            }
            int i9 = i2 - i5;
            if (i9 > 0 && (i3 = this.c) >= (i4 = this.f4131a)) {
                int i10 = i3 - i4;
                int min2 = Math.min(i9, this.b.length - i10);
                if (min2 > 0) {
                    System.arraycopy(this.b, i10, bArr, i + i5, min2);
                    this.c += min2;
                    i5 += min2;
                }
            }
            if (i5 > 0) {
                return i5;
            }
            return -1;
        }
    }

    private void a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail, com.applovin.impl.sdk.ad.b bVar) {
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f4130a.a(c5.i6)).booleanValue()) {
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + (bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null"));
        }
        if (webView == null || !webView.equals(this.c.f())) {
            return;
        }
        this.c.a(((Boolean) this.f4130a.a(c5.g7)).booleanValue());
        AppLovinAdSize k = this.c.k();
        if (t7.a(k)) {
            this.c.a(k);
            this.c.D();
        }
    }

    private boolean a(boolean z, com.applovin.impl.sdk.ad.b bVar, Uri uri) {
        if (z) {
            return false;
        }
        boolean Y0 = bVar.Y0();
        a(uri, Y0, bVar, this.f4130a);
        return Y0;
    }

    private static void a(Uri uri, boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar) {
        if (lVar.c(c5.Y6).contains(uri.getScheme())) {
            return;
        }
        lVar.E().d(h2.V0, a(bVar, uri, z));
    }

    private static Map a(com.applovin.impl.sdk.ad.b bVar, Uri uri, boolean z) {
        Map a2 = j2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a2);
        CollectionUtils.putStringIfValid("is_blocked_auto_redirect", String.valueOf(z), a2);
        return a2;
    }

    private void a(MotionEvent motionEvent) {
        this.c.a(motionEvent);
    }

    private void a(u7 u7Var, b bVar) {
        x7 g1 = u7Var.g1();
        if (g1 != null) {
            g8.a(g1.b(), this.c.j());
            a(bVar, g1.c());
        }
    }

    private void a(b bVar, Uri uri) {
        com.applovin.impl.sdk.ad.b currentAd = bVar.getCurrentAd();
        AppLovinAdView i = this.c.i();
        if (i != null && currentAd != null) {
            if (currentAd instanceof u7) {
                ((u7) currentAd).getAdEventTracker().v();
            }
            this.c.a(currentAd, i, uri, bVar.getAndClearLastClickEvent());
        } else if (p.a()) {
            this.b.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        t7.a(str, com.applovin.impl.sdk.l.p());
    }

    private InputStream a(byte[] bArr, String str) {
        if (((Boolean) this.f4130a.a(c5.C2)).booleanValue()) {
            int i = 0;
            try {
                i = Integer.parseInt(str.split("-")[0]);
            } catch (NumberFormatException unused) {
            }
            return new a(i, bArr);
        }
        return new ByteArrayInputStream(bArr);
    }
}
