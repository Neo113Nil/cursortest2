package com.vungle.ads.internal.ui;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.p1;
import com.vungle.ads.internal.protos.Sdk;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.files.FileSystemKt;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public final class z extends WebViewClient implements com.vungle.ads.internal.util.v {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f12176a;
    public final j3 b;
    public final ExecutorService c;
    public final com.vungle.ads.internal.platform.f d;
    public final com.vungle.ads.internal.load.f e;
    public final Long f;
    public final Lazy g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public WebView m;
    public boolean n;
    public com.vungle.ads.internal.ui.view.n o;
    public com.vungle.ads.internal.ui.view.o p;
    public com.vungle.ads.internal.omsdk.f q;
    public Boolean r;
    public final p1 s;
    public final p1 t;

    public /* synthetic */ z(i0 i0Var, j3 j3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(i0Var, j3Var, executorService, fVar, null, null);
    }

    public static final void b(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.load.f fVar = this$0.e;
        if (fVar != null) {
            fVar.b();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public static final void c(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.vungle.ads.internal.load.f fVar = this$0.e;
        if (fVar != null) {
            fVar.a();
        }
        this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", s.f12160a);
        if (webView == null) {
            return;
        }
        this.m = webView;
        webView.setVisibility(0);
        a();
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new o(this.p));
        }
        com.vungle.ads.internal.omsdk.f fVar = this.q;
        if (fVar != null) {
            ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(webView, i, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String valueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        boolean z3 = (valueOf2.length() > 0 ? this.f12176a.b(valueOf2) : false) && z;
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.o oVar = this.p;
        if (oVar != null) {
            ((com.vungle.ads.internal.presenter.r) oVar).a(z3, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.m = null;
        if (Build.VERSION.SDK_INT < 26) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView));
            com.vungle.ads.internal.ui.view.o oVar = this.p;
            if (oVar != null) {
                ((com.vungle.ads.internal.presenter.r) oVar).a((VungleError) new WebViewRenderingProcessGone("didCrash=true"), true, (String) null);
            }
            return true;
        }
        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new u(webView, renderProcessGoneDetail));
        com.vungle.ads.internal.ui.view.o oVar2 = this.p;
        if (oVar2 != null) {
            Boolean valueOf = renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null;
            com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) oVar2;
            boolean booleanValue = valueOf != null ? valueOf.booleanValue() : true;
            rVar.a(new WebViewRenderingProcessGone("didCrash=" + booleanValue), booleanValue, (String) null);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Object m8079constructorimpl;
        long j;
        Pair pair;
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        if (url == null) {
            return null;
        }
        String scheme = url.getScheme();
        if (scheme != null) {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = scheme.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (lowerCase != null) {
                if (!Intrinsics.areEqual(lowerCase, ProxyConfig.MATCH_HTTP) && !Intrinsics.areEqual(lowerCase, "https")) {
                    return null;
                }
                if (!this.f12176a.B()) {
                    boolean z = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.a("VungleWebClient", x.f12174a);
                    return null;
                }
                String uri = url.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "uri.toString()");
                com.vungle.ads.internal.model.b a2 = this.f12176a.a(uri);
                String c = a2 != null ? a2.c() : null;
                if (c == null || c.length() == 0) {
                    return null;
                }
                File file = new File(c);
                if (!file.exists()) {
                    return null;
                }
                long b = a2.b();
                if (b <= 0) {
                    return null;
                }
                long length = file.length();
                String str2 = webResourceRequest.getRequestHeaders().get("Range");
                this.s.a(str2 + " cached:" + length + ' ' + uri);
                AnalyticsClient.a(AnalyticsClient.INSTANCE, this.s, this.f12176a.q());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    try {
                    } catch (Throwable th) {
                        th = th;
                        Result.Companion companion2 = Result.INSTANCE;
                        m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
                        }
                        Pair pair2 = (Pair) m8079constructorimpl;
                        a2.c(((Number) pair2.getFirst()).longValue());
                        a2.a((Long) pair2.getSecond());
                        long longValue = ((Number) pair2.component1()).longValue();
                        Long l = (Long) pair2.component2();
                        j = length - longValue;
                        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                        com.vungle.ads.internal.util.t.a(">>request: " + url + " rangeStart=" + longValue + " rangeEnd=" + l + " cachedFileLength=" + length + " availableBytes=" + j + " contentLength=" + b + ' ');
                        if (j <= 0) {
                        }
                        if (l == null) {
                        }
                        long j2 = (r0 - longValue) + 1;
                        Result.Companion companion3 = Result.INSTANCE;
                        WebResourceResponse webResourceResponse = new WebResourceResponse(a2.d(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", a2.d()), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j2)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + longValue + '-' + r0 + FileSystemKt.UnixPathSeparator + b)), new BufferedInputStream(new FileInputStream(file), 1024));
                        com.vungle.ads.internal.util.t.a("<<Return:" + webResourceResponse.getResponseHeaders());
                        return webResourceResponse;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = uri;
                }
                try {
                    if (str2 != null) {
                        str = uri;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Companion companion22 = Result.INSTANCE;
                            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
                            if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
                            }
                            Pair pair22 = (Pair) m8079constructorimpl;
                            a2.c(((Number) pair22.getFirst()).longValue());
                            a2.a((Long) pair22.getSecond());
                            long longValue2 = ((Number) pair22.component1()).longValue();
                            Long l2 = (Long) pair22.component2();
                            j = length - longValue2;
                            boolean z22 = com.vungle.ads.internal.util.u.f12190a;
                            com.vungle.ads.internal.util.t.a(">>request: " + url + " rangeStart=" + longValue2 + " rangeEnd=" + l2 + " cachedFileLength=" + length + " availableBytes=" + j + " contentLength=" + b + ' ');
                            if (j <= 0) {
                            }
                            if (l2 == null) {
                            }
                            long j22 = (r0 - longValue2) + 1;
                            Result.Companion companion32 = Result.INSTANCE;
                            WebResourceResponse webResourceResponse2 = new WebResourceResponse(a2.d(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", a2.d()), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j22)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + longValue2 + '-' + r0 + FileSystemKt.UnixPathSeparator + b)), new BufferedInputStream(new FileInputStream(file), 1024));
                            com.vungle.ads.internal.util.t.a("<<Return:" + webResourceResponse2.getResponseHeaders());
                            return webResourceResponse2;
                        }
                        if (StringsKt.startsWith$default(str2, "bytes=", false, 2, (Object) null)) {
                            List split$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(str2, (CharSequence) "bytes="), new String[]{"-"}, false, 0, 6, (Object) null);
                            String str3 = (String) CollectionsKt.getOrNull(split$default, 0);
                            Long longOrNull = str3 != null ? StringsKt.toLongOrNull(str3) : null;
                            String str4 = (String) CollectionsKt.getOrNull(split$default, 1);
                            Long longOrNull2 = str4 != null ? StringsKt.toLongOrNull(str4) : null;
                            if (longOrNull == null) {
                                if (longOrNull2 == null) {
                                    longOrNull = 0L;
                                } else {
                                    longOrNull = Long.valueOf(b - longOrNull2.longValue());
                                    longOrNull2 = null;
                                }
                            }
                            pair = new Pair(longOrNull, longOrNull2);
                            m8079constructorimpl = Result.m8079constructorimpl(pair);
                            if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
                                m8079constructorimpl = new Pair(0L, null);
                            }
                            Pair pair222 = (Pair) m8079constructorimpl;
                            a2.c(((Number) pair222.getFirst()).longValue());
                            a2.a((Long) pair222.getSecond());
                            long longValue22 = ((Number) pair222.component1()).longValue();
                            Long l22 = (Long) pair222.component2();
                            j = length - longValue22;
                            boolean z222 = com.vungle.ads.internal.util.u.f12190a;
                            com.vungle.ads.internal.util.t.a(">>request: " + url + " rangeStart=" + longValue22 + " rangeEnd=" + l22 + " cachedFileLength=" + length + " availableBytes=" + j + " contentLength=" + b + ' ');
                            if (j <= 0) {
                                com.vungle.ads.internal.util.t.a("VungleWebClient", new y(str2));
                                a2.q();
                                length = file.length();
                            }
                            long longValue3 = l22 == null ? l22.longValue() : length - 1;
                            long j222 = (longValue3 - longValue22) + 1;
                            Result.Companion companion322 = Result.INSTANCE;
                            WebResourceResponse webResourceResponse22 = new WebResourceResponse(a2.d(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", a2.d()), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j222)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + longValue22 + '-' + longValue3 + FileSystemKt.UnixPathSeparator + b)), new BufferedInputStream(new FileInputStream(file), 1024));
                            com.vungle.ads.internal.util.t.a("<<Return:" + webResourceResponse22.getResponseHeaders());
                            return webResourceResponse22;
                        }
                    } else {
                        str = uri;
                    }
                    Result.Companion companion3222 = Result.INSTANCE;
                    WebResourceResponse webResourceResponse222 = new WebResourceResponse(a2.d(), "UTF-8", 206, "Partial Content", MapsKt.mapOf(TuplesKt.to("Content-Type", a2.d()), TuplesKt.to(HttpHeaders.ACCEPT_RANGES, "bytes"), TuplesKt.to(HttpHeaders.CONTENT_LENGTH, String.valueOf(j222)), TuplesKt.to(HttpHeaders.CONTENT_RANGE, "bytes " + longValue22 + '-' + longValue3 + FileSystemKt.UnixPathSeparator + b)), new BufferedInputStream(new FileInputStream(file), 1024));
                    com.vungle.ads.internal.util.t.a("<<Return:" + webResourceResponse222.getResponseHeaders());
                    return webResourceResponse222;
                } catch (Throwable th4) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(Result.m8079constructorimpl(ResultKt.createFailure(th4)));
                    if (m8082exceptionOrNullimpl == null) {
                        return null;
                    }
                    boolean z3 = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.a("VungleWebClient", com.iab.omid.library.vungle.internal.l.a("Error serving local range video: ").append(m8082exceptionOrNullimpl.getMessage()).toString(), m8082exceptionOrNullimpl);
                    this.t.a(str + ' ' + m8082exceptionOrNullimpl.getMessage());
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, this.t, this.f12176a.q());
                    return null;
                }
                pair = new Pair(0L, null);
                m8079constructorimpl = Result.m8079constructorimpl(pair);
                if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
                }
                Pair pair2222 = (Pair) m8079constructorimpl;
                a2.c(((Number) pair2222.getFirst()).longValue());
                a2.a((Long) pair2222.getSecond());
                long longValue222 = ((Number) pair2222.component1()).longValue();
                Long l222 = (Long) pair2222.component2();
                j = length - longValue222;
                boolean z2222 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a(">>request: " + url + " rangeStart=" + longValue222 + " rangeEnd=" + l222 + " cachedFileLength=" + length + " availableBytes=" + j + " contentLength=" + b + ' ');
                if (j <= 0) {
                }
                if (l222 == null) {
                }
                long j2222 = (longValue3 - longValue222) + 1;
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str, true);
    }

    public z(i0 advertisement, j3 placement, ExecutorService offloadExecutor, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.f fVar2, Long l) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(offloadExecutor, "offloadExecutor");
        this.f12176a = advertisement;
        this.b = placement;
        this.c = offloadExecutor;
        this.d = fVar;
        this.e = fVar2;
        this.f = l;
        this.g = LazyKt.lazy(p.f12157a);
        Sdk.SDKMetric.SDKMetricType sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET;
        this.s = new p1(sDKMetricType);
        this.t = new p1(sDKMetricType);
    }

    public final void a(int i) {
        ((com.vungle.ads.internal.util.j) this.g.getValue()).a(this.m, i, new q(this));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        return a(webView, (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString(), webResourceRequest != null ? webResourceRequest.isForMainFrame() : true);
    }

    public final void b(boolean z) {
        this.r = Boolean.valueOf(z);
        WebView webView = this.m;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, U3.i.o, Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void a(boolean z, String str, String str2, String str3, String str4) {
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.n nVar) {
        this.o = nVar;
    }

    public final boolean a(WebView webView, String str, boolean z) {
        boolean a2;
        String str2;
        try {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + str + " mainFrame=" + z);
            if (str != null && str.length() != 0) {
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                String scheme = parse.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    if (!z) {
                        if (Intrinsics.areEqual(scheme, CampaignEx.JSON_KEY_MRAID)) {
                            str2 = parse.getHost();
                        } else {
                            if (!StringsKt.equals(scheme, ProxyConfig.MATCH_HTTP, true) && !StringsKt.equals(scheme, "https", true)) {
                                str2 = "unknownScheme";
                            }
                            str2 = "openNonMraid";
                        }
                        if (str2 != null) {
                            com.vungle.ads.internal.ui.view.n nVar = this.o;
                            if (nVar != null) {
                                ((com.vungle.ads.internal.presenter.r) nVar).a(str2, str);
                            }
                            return true;
                        }
                    }
                    if (Intrinsics.areEqual(scheme, CampaignEx.JSON_KEY_MRAID)) {
                        a2 = a(webView, parse);
                    } else {
                        if (!StringsKt.equals(scheme, ProxyConfig.MATCH_HTTP, true) && !StringsKt.equals(scheme, "https", true)) {
                            a2 = false;
                        }
                        a2 = a(str);
                    }
                    if (a2) {
                        return true;
                    }
                    com.vungle.ads.internal.util.t.a("VungleWebClient", new r(str));
                }
                return false;
            }
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        boolean z = webResourceRequest != null && webResourceRequest.isForMainFrame();
        boolean z2 = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + valueOf + ' ' + z + " for URL " + valueOf2);
        boolean z3 = (valueOf2.length() > 0 ? this.f12176a.b(valueOf2) : false) && z;
        String str = valueOf2 + ' ' + valueOf;
        com.vungle.ads.internal.ui.view.o oVar = this.p;
        if (oVar != null) {
            ((com.vungle.ads.internal.presenter.r) oVar).a(z3, str);
        }
    }

    public final boolean a(final WebView webView, Uri uri) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        int hashCode = host.hashCode();
        if (hashCode == -1943542072) {
            if (host.equals("propertiesChangeCompleted")) {
                if (!this.n) {
                    this.n = true;
                    this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            z.a(z.this, webView);
                        }
                    });
                }
            }
            a(webView, uri, host);
        } else if (hashCode == 88409791) {
            if (host.equals("failToLoad")) {
                this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.c(z.this, webView);
                    }
                });
            }
            a(webView, uri, host);
        } else {
            if (hashCode == 119543762 && host.equals("readyToPlay")) {
                this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        z.b(z.this, webView);
                    }
                });
            }
            a(webView, uri, host);
        }
        return true;
    }

    public static final void a(z this$0, WebView webView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this$0.f12176a.g() + ')');
    }

    public final void a(final WebView webView, final Uri uri, final String str) {
        final com.vungle.ads.internal.ui.view.n nVar = this.o;
        if (nVar == null) {
            a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        } else {
            this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    z.a(com.vungle.ads.internal.ui.view.n.this, str, this, webView, uri);
                }
            });
        }
    }

    public final boolean a(final String str) {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Open URL" + str);
        final com.vungle.ads.internal.ui.view.n nVar = this.o;
        if (nVar == null) {
            return true;
        }
        this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                z.a(com.vungle.ads.internal.ui.view.n.this, str);
            }
        });
        return true;
    }

    public final void a() {
        final boolean z = true;
        this.c.execute(new Runnable() { // from class: com.vungle.ads.internal.ui.z$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                z.a(z, this);
            }
        });
    }

    public final void a(long j, long j2) {
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(" + j + '-' + j2 + ')');
        }
    }

    public final void a(String errorMessage, int i) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i + ')');
        }
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i + '%');
        if (i >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i, this.f12176a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, errorMessage, this.f12176a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        WebView webView = this.m;
        if (webView != null) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(z));
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.o errorHandler) {
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.p = errorHandler;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new v(str));
        Handler handler = com.vungle.ads.internal.util.y.f12193a;
        com.vungle.ads.internal.util.y.a(new w(this, webView, str));
    }

    public static final void a(com.vungle.ads.internal.ui.view.n mraidDelegateSnapshot, String command, z this$0, WebView webView, Uri uri) {
        Intrinsics.checkNotNullParameter(mraidDelegateSnapshot, "$mraidDelegateSnapshot");
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uri, "$uri");
        try {
            try {
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                for (String param : uri.getQueryParameterNames()) {
                    Intrinsics.checkNotNullExpressionValue(param, "param");
                    JsonElementBuildersKt.put(jsonObjectBuilder, param, uri.getQueryParameter(param));
                }
                ((com.vungle.ads.internal.presenter.r) mraidDelegateSnapshot).a(command, jsonObjectBuilder.build());
            } catch (Exception e) {
                boolean z = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID command failed", e);
            }
        } finally {
            this$0.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public static final void a(com.vungle.ads.internal.ui.view.n mraidDelegateSnapshot, String url) {
        Intrinsics.checkNotNullParameter(mraidDelegateSnapshot, "$mraidDelegateSnapshot");
        Intrinsics.checkNotNullParameter(url, "$url");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "url", url);
        ((com.vungle.ads.internal.presenter.r) mraidDelegateSnapshot).a("openNonMraid", jsonObjectBuilder.build());
    }

    public static final void a(boolean z, z this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "placementType", this$0.f12176a.G());
        Boolean bool = this$0.r;
        if (bool != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, U3.i.o, Boolean.valueOf(bool.booleanValue()));
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, L6.F, "android");
        JsonElementBuildersKt.put(jsonObjectBuilder, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        JsonElementBuildersKt.put(jsonObjectBuilder, "incentivized", Boolean.valueOf(this$0.b.j()));
        com.vungle.ads.internal.platform.f fVar = this$0.d;
        if (fVar != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "isSilent", Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).n()));
        }
        Long l = this$0.f;
        if (l != null) {
            l.longValue();
            JsonElementBuildersKt.put(jsonObjectBuilder, "timeLoaded", this$0.f);
        }
        if (this$0.h) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.TRUE);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentTitleText", this$0.i);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentBodyText", this$0.j);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentAcceptButtonText", this$0.k);
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentDenyButtonText", this$0.l);
        } else {
            JsonElementBuildersKt.put(jsonObjectBuilder, "consentRequired", Boolean.FALSE);
        }
        JsonElementBuildersKt.put(jsonObjectBuilder, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + jsonObjectBuilder.build() + AbstractJsonLexerKt.COMMA + z + ')';
        WebView webView = this$0.m;
        if (webView != null) {
            this$0.a(webView, str);
        }
    }
}
