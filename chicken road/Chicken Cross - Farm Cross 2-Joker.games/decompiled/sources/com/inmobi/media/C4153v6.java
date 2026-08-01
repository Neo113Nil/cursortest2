package com.inmobi.media;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4153v6 extends W2 {
    public final String f;
    public final Function0 g;
    public final Function1 h;
    public final Function2 i;
    public final InterfaceC4072s9 j;
    public Yb k;
    public Wb l;
    public final Ck m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4153v6(String api, Function0 onUserLandingCompleted, Function1 onLpLifecycleEvent, Function2 fireLandingPageTracker, Y9 y9, InterfaceC4072s9 interfaceC4072s9, long j) {
        super(y9);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(onUserLandingCompleted, "onUserLandingCompleted");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        Intrinsics.checkNotNullParameter(fireLandingPageTracker, "fireLandingPageTracker");
        this.f = api;
        this.g = onUserLandingCompleted;
        this.h = onLpLifecycleEvent;
        this.i = fireLandingPageTracker;
        this.j = interfaceC4072s9;
        this.m = new Ck(j, y9, new Function1() { // from class: com.inmobi.media.v6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4153v6.a(C4153v6.this, (String) obj);
            }
        });
        String str = "init constructor " + this;
    }

    public final boolean a(WebView webView, String url) {
        Integer num;
        int i;
        InterfaceC4125u6 interfaceC4125u6;
        InterfaceC3917mn userLeftApplicationListener;
        if (this.e.get()) {
            return true;
        }
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onShouldOverrideUrlLoading: " + url);
        }
        Ck ck = this.m;
        if (!ck.f) {
            ck.g = Ak.c;
        }
        ck.h = true;
        ck.a();
        if (webView instanceof V2) {
            Tb a2 = Ub.a(((V2) webView).getLandingPageHandler(), this.f, (String) null, url, this.k, 16);
            num = a2.b;
            i = a2.f6870a;
        } else {
            num = null;
            i = 0;
        }
        if (i == 0) {
            Ck ck2 = this.m;
            ck2.getClass();
            ck2.g = Ak.d;
            return false;
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return false;
            }
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 10);
            Wb wb = this.l;
            if (wb != null) {
                wb.a(3, false, url, valueOf);
            }
            return true;
        }
        Ck ck3 = this.m;
        ck3.getClass();
        ck3.g = Ak.e;
        boolean z = webView instanceof C4180w6;
        if (z) {
            ViewParent parent = ((C4180w6) webView).getParent();
            if ((parent instanceof C4041r6) && (userLeftApplicationListener = ((C4041r6) parent).getUserLeftApplicationListener()) != null) {
                userLeftApplicationListener.a();
            }
        }
        Function1 function1 = this.h;
        C3855kj c3855kj = Ej.h1;
        String str = this.f;
        c3855kj.getClass();
        function1.invoke(C3855kj.a(str, "onNavigatingAway"));
        a(webView);
        Intrinsics.checkNotNullParameter(url, "url");
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (!Y3.a(parse) || Intrinsics.areEqual("play.google.com", parse.getHost()) || Intrinsics.areEqual("market.android.com", parse.getHost()) || Intrinsics.areEqual("market", parse.getScheme())) {
            if (webView.canGoBack()) {
                webView.goBack();
            } else if (z) {
                ViewParent parent2 = ((C4180w6) webView).getParent();
                if ((parent2 instanceof C4041r6) && (interfaceC4125u6 = ((C4041r6) parent2).d) != null) {
                    C4156v9.a(((C4128u9) interfaceC4125u6).f7410a);
                }
            }
            InterfaceC4072s9 interfaceC4072s9 = this.j;
            if (interfaceC4072s9 != null) {
                ((C4082sj) interfaceC4072s9).f7378a.z();
            }
        }
        a(this, 2, false, url, 8);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        Job launch$default;
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onPageCommitVisible: " + str);
        }
        Ck ck = this.m;
        if (!ck.f && ck.f6497a > 0) {
            long j = ck.e;
            ck.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(ck.d, null, null, new Bk(ck, j, str, webView, null), 3, null);
            ck.i = launch$default;
        }
        a(this, 4, true, str, 8);
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onPageFinished: " + str);
        }
        a(this, 2, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Ck ck = this.m;
        if (!ck.f && ck.f6497a > 0) {
            ck.e++;
            ck.f = false;
            ck.g = Ak.b;
            ck.h = false;
            ck.a();
        }
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onPageStarted: " + str);
        }
        Function1 function1 = this.h;
        C3855kj c3855kj = Ej.h1;
        String str2 = this.f;
        c3855kj.getClass();
        function1.invoke(C3855kj.a(str2, "onPageStart"));
        a(this, 1, true, str, 8);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        Integer valueOf = Integer.valueOf(i);
        Wb wb = this.l;
        if (wb != null) {
            wb.a(3, false, failingUrl, valueOf);
        }
        Ck ck = this.m;
        ck.getClass();
        Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
        ck.a("RECEIVED_ERROR", failingUrl);
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onReceivedError: " + failingUrl);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        Ck ck = this.m;
        String uri = webResourceRequest.getUrl().toString();
        ck.getClass();
        Intrinsics.checkNotNullParameter("RECEIVED_HTTP_ERROR", "reason");
        ck.a("RECEIVED_HTTP_ERROR", uri);
    }

    @Override // com.inmobi.media.W2, android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        boolean onRenderProcessGone = super.onRenderProcessGone(view, detail);
        if (Build.VERSION.SDK_INT >= 26) {
            Wb wb = this.l;
            if (wb != null) {
                wb.a(3, true, null, 8007);
            }
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("source", "embedded_browser"), TuplesKt.to("isCrashed", Boolean.valueOf(detail.didCrash())));
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("WebViewRenderProcessGoneEvent", mutableMapOf, EnumC3944nm.f7271a);
        }
        Ck ck = this.m;
        String url = view.getUrl();
        ck.getClass();
        Intrinsics.checkNotNullParameter("RENDER_PROCESS_GONE", "reason");
        ck.a("RENDER_PROCESS_GONE", url);
        return onRenderProcessGone;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        Y5.f6965a.getClass();
        if (!Y5.x()) {
            return false;
        }
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (str = url.toString()) == null) {
            str = "";
        }
        if (webView == null || str.length() <= 0) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "shouldOverrideUrlLoading Called");
        }
        if (webView == null || str == null) {
            return false;
        }
        return a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        Y9 y9 = this.f6921a;
        if (y9 != null) {
            ((Z9) y9).a("EmbeddedBrowserViewClient", "onReceivedError: " + request.getUrl());
        }
        if (request.isForMainFrame()) {
            Integer valueOf = Integer.valueOf(error.getErrorCode());
            String uri = request.getUrl().toString();
            Wb wb = this.l;
            if (wb != null) {
                wb.a(3, true, uri, valueOf);
            }
            Ck ck = this.m;
            String uri2 = request.getUrl().toString();
            ck.getClass();
            Intrinsics.checkNotNullParameter("RECEIVED_ERROR", "reason");
            ck.a("RECEIVED_ERROR", uri2);
        }
    }

    public static final Unit a(C4153v6 c4153v6, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        InterfaceC4072s9 interfaceC4072s9 = c4153v6.j;
        if (interfaceC4072s9 != null) {
            C4082sj c4082sj = (C4082sj) interfaceC4072s9;
            Intrinsics.checkNotNullParameter(reason, "reason");
            if (c4082sj.f7378a.getFullScreenActivity() instanceof InMobiAdActivity) {
                Activity fullScreenActivity = c4082sj.f7378a.getFullScreenActivity();
                Intrinsics.checkNotNull(fullScreenActivity, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
                ((InMobiAdActivity) fullScreenActivity).a(reason);
            }
        }
        return Unit.INSTANCE;
    }

    public static void a(C4153v6 c4153v6, int i, boolean z, String str, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        Wb wb = c4153v6.l;
        if (wb != null) {
            wb.a(i, z, str, null);
        }
    }
}
