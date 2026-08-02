package M60;

import B0.A0;
import B90.h0;
import C90.d;
import Ca.s;
import D90.g;
import H30.l;
import L60.e;
import L60.f;
import L60.h;
import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import g30.InterfaceC6618a;
import h3.C6788a;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.Pin;
import ru.ozon.fintech.settings.models.Pins;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import ya0.C10877b;

/* loaded from: classes3.dex */
public final class c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<String> f17482a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f17483b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C6788a f17484c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Q90.c f17485d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f17486e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C10877b f17487f;

    /* renamed from: g, reason: collision with root package name */
    private h0 f17488g;

    /* renamed from: h, reason: collision with root package name */
    private F90.c f17489h;

    /* renamed from: i, reason: collision with root package name */
    private e f17490i;

    /* renamed from: j, reason: collision with root package name */
    private f f17491j;

    /* renamed from: k, reason: collision with root package name */
    private g f17492k;

    /* renamed from: l, reason: collision with root package name */
    private L60.g f17493l;

    /* renamed from: m, reason: collision with root package name */
    private h f17494m;

    /* renamed from: n, reason: collision with root package name */
    private d f17495n;

    /* renamed from: o, reason: collision with root package name */
    private s f17496o;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.ui.client.FintechWebViewClient$shouldInterceptRequest$1", f = "FintechWebViewClient.kt", l = {149}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f17497d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WebView f17498e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f17499f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Pins f17500g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Uri f17501h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.ui.client.FintechWebViewClient$shouldInterceptRequest$1$1", f = "FintechWebViewClient.kt", l = {}, m = "invokeSuspend")
        /* renamed from: M60.c$a$a, reason: collision with other inner class name */
        static final class C0339a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ SslCertificate f17502d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f17503e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Pins f17504f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f17505g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0339a(SslCertificate sslCertificate, c cVar, Pins pins, Uri uri, kotlin.coroutines.d<? super C0339a> dVar) {
                super(2, dVar);
                this.f17502d = sslCertificate;
                this.f17503e = cVar;
                this.f17504f = pins;
                this.f17505g = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0339a(this.f17502d, this.f17503e, this.f17504f, this.f17505g, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0339a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                X509Certificate x509Certificate;
                List<Pin> pins;
                SslCertificate.DName issuedTo;
                SslCertificate.DName issuedBy;
                List<Pin> pins2;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                I i11 = new I();
                Pins pins3 = this.f17504f;
                SslCertificate sslCertificate = this.f17502d;
                String str = null;
                if (sslCertificate != null) {
                    try {
                        x509Certificate = sslCertificate.getX509Certificate();
                        byte[] encoded = x509Certificate != null ? x509Certificate.getEncoded() : null;
                        String encodeToString = Base64.getEncoder().encodeToString(encoded != null ? l.a(encoded) : null);
                        if (pins3 != null && (pins = pins3.getPins()) != null) {
                            Iterator<T> it = pins.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.d(((Pin) it.next()).getHash(), encodeToString)) {
                                    i11.f71783a = true;
                                }
                            }
                        }
                    } catch (Exception e11) {
                        L80.a.c("FintechWebViewClient", null, e11);
                    }
                }
                if (!i11.f71783a) {
                    InterfaceC6618a interfaceC6618a = this.f17503e.f17486e;
                    String valueOf = String.valueOf(pins3 != null ? pins3.getPiningState() : null);
                    String V11 = (pins3 == null || (pins2 = pins3.getPins()) == null) ? null : C7714v.V(pins2, ", ", null, null, new M60.b(0), 30);
                    if (V11 == null) {
                        V11 = "";
                    }
                    String b11 = A0.b("[", V11, "]");
                    String dName = (sslCertificate == null || (issuedBy = sslCertificate.getIssuedBy()) == null) ? null : issuedBy.getDName();
                    if (sslCertificate != null && (issuedTo = sslCertificate.getIssuedTo()) != null) {
                        str = issuedTo.getDName();
                    }
                    String a11 = V.e.a("[", dName, "\n", str, "]");
                    String uri = this.f17505g.toString();
                    Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                    interfaceC6618a.U1(valueOf, b11, a11, uri);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WebView webView, c cVar, Pins pins, Uri uri, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f17498e = webView;
            this.f17499f = cVar;
            this.f17500g = pins;
            this.f17501h = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f17498e, this.f17499f, this.f17500g, this.f17501h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17497d;
            if (i11 == 0) {
                Sc.s.b(obj);
                WebView webView = this.f17498e;
                SslCertificate certificate = webView != null ? webView.getCertificate() : null;
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                C0339a c0339a = new C0339a(certificate, this.f17499f, this.f17500g, this.f17501h, null);
                this.f17497d = 1;
                if (C10727i.f(bVar, c0339a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.ui.client.FintechWebViewClient$shouldInterceptRequest$2", f = "FintechWebViewClient.kt", l = {187}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f17506d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WebView f17507e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ c f17508f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.ui.client.FintechWebViewClient$shouldInterceptRequest$2$1", f = "FintechWebViewClient.kt", l = {}, m = "invokeSuspend")
        static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ SslCertificate f17509d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f17510e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SslCertificate sslCertificate, c cVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f17509d = sslCertificate;
                this.f17510e = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f17509d, this.f17510e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                X509Certificate x509Certificate;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                Sc.s.b(obj);
                try {
                    SslCertificate sslCertificate = this.f17509d;
                    if (sslCertificate != null) {
                        c cVar = this.f17510e;
                        x509Certificate = sslCertificate.getX509Certificate();
                        byte[] encoded = x509Certificate != null ? x509Certificate.getEncoded() : null;
                        cVar.f17483b.x(Base64.getEncoder().encodeToString(encoded != null ? l.a(encoded) : null));
                    }
                } catch (Exception e11) {
                    L80.a.c("FintechWebViewClient", null, e11);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WebView webView, c cVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f17507e = webView;
            this.f17508f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(this.f17507e, this.f17508f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17506d;
            if (i11 == 0) {
                Sc.s.b(obj);
                WebView webView = this.f17507e;
                SslCertificate certificate = webView != null ? webView.getCertificate() : null;
                C10720e0 c10720e0 = C10720e0.f105451a;
                He.b bVar = He.b.f10879b;
                a aVar2 = new a(certificate, this.f17508f, null);
                this.f17506d = 1;
                if (C10727i.f(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public c(@NotNull Function0 provideAppConfigId, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings, @NotNull C6788a scope, @NotNull Q90.c featureToggles, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull C10877b fintechWebviewHeadersInfoProvider) {
        Intrinsics.checkNotNullParameter(provideAppConfigId, "provideAppConfigId");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(fintechWebviewHeadersInfoProvider, "fintechWebviewHeadersInfoProvider");
        this.f17482a = provideAppConfigId;
        this.f17483b = fintechSettings;
        this.f17484c = scope;
        this.f17485d = featureToggles;
        this.f17486e = fintechAnalyticInteractor;
        this.f17487f = fintechWebviewHeadersInfoProvider;
    }

    public final void c(boolean z11) {
        this.f17487f.c(z11);
    }

    public final void d(boolean z11) {
        this.f17487f.b(z11);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z11) {
        super.doUpdateVisitedHistory(webView, str, z11);
        e eVar = this.f17490i;
        if (eVar != null) {
            eVar.invoke(str, Boolean.valueOf(z11), Boolean.valueOf(webView != null ? webView.canGoBack() : false));
        }
    }

    public final void e(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.loadUrl(url, this.f17487f.a(context, url, this.f17482a.invoke()).c());
    }

    public final void f(@NotNull d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17495n = listener;
    }

    public final void g(@NotNull h0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17488g = listener;
    }

    public final void h(@NotNull f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17491j = listener;
    }

    public final void i(@NotNull F90.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17489h = listener;
    }

    public final void j(@NotNull L60.g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17493l = listener;
    }

    public final void k(@NotNull h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17494m = listener;
    }

    public final void l(@NotNull g listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17492k = listener;
    }

    public final void m(@NotNull s listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17496o = listener;
    }

    public final void n(@NotNull e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f17490i = listener;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        d dVar = this.f17495n;
        if (dVar != null) {
            dVar.invoke(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        Ns.b.c("onPageCommitVisible: ", str, "FintechWebViewClient");
        h0 h0Var = this.f17488g;
        if (h0Var != null) {
            if (str == null) {
                str = "";
            }
            h0Var.invoke(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(webView, url);
        Ns.b.c("onPageFinished: ", url, "FintechWebViewClient");
        f fVar = this.f17491j;
        if (fVar != null) {
            boolean z11 = false;
            if (webView != null && webView.canGoBack()) {
                z11 = true;
            }
            fVar.invoke(url, Boolean.valueOf(z11));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, @NotNull String url, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageStarted(webView, url, bitmap);
        Ns.b.c("onPageStarted: ", url, "FintechWebViewClient");
        F90.c cVar = this.f17489h;
        if (cVar != null) {
            cVar.invoke(url);
        }
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC3999a
    public final void onReceivedError(WebView webView, int i11, String str, String str2) {
        super.onReceivedError(webView, i11, str, str2);
        L80.a.b("FintechWebViewClient", "onReceivedError (deprecated)" + str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        h hVar = this.f17494m;
        if (hVar != null) {
            hVar.invoke(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    @SuppressLint({"WebViewClientOnReceivedSslError"})
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        L80.a.b("FintechWebViewClient", "onReceivedSslError error = " + sslError);
        if (!this.f17483b.b()) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Ns.b.c("onRenderProcessGone: ", renderProcessGoneDetail != null ? renderProcessGoneDetail.toString() : null, "FintechWebViewClient");
        L80.a.a("FintechWebViewClient", "onRenderProcessGone: " + (renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null));
        s sVar = this.f17496o;
        if (sVar == null) {
            return true;
        }
        sVar.invoke(Boolean.TRUE);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebView webView2;
        String host;
        S90.c cVar = S90.c.MOB_SSL_PINNING;
        Q90.c cVar2 = this.f17485d;
        boolean f7 = Tl.a.f(cVar2, cVar);
        C6788a c6788a = this.f17484c;
        if (f7) {
            Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
            Pins d11 = this.f17483b.d();
            if (Build.VERSION.SDK_INT >= 29) {
                if ((d11 != null ? d11.getPiningState() : null) != S90.e.DISABLE && url != null && (host = url.getHost()) != null && kotlin.text.h.t(host, "finance.ozon.ru", false)) {
                    webView2 = webView;
                    C10727i.c(c6788a, null, null, new a(webView2, this, d11, url, null), 3);
                    if (Tl.a.f(cVar2, S90.c.MOB_CERT_ANTIFRAUD) && Build.VERSION.SDK_INT >= 29) {
                        C10727i.c(c6788a, null, null, new b(webView2, this, null), 3);
                    }
                    return super.shouldInterceptRequest(webView2, webResourceRequest);
                }
            }
        }
        webView2 = webView;
        if (Tl.a.f(cVar2, S90.c.MOB_CERT_ANTIFRAUD)) {
            C10727i.c(c6788a, null, null, new b(webView2, this, null), 3);
        }
        return super.shouldInterceptRequest(webView2, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC3999a
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        L80.a.a("FintechWebViewClient", "shouldOverrideUrlLoading (deprecated): " + url);
        g gVar = this.f17492k;
        if (gVar != null) {
            return ((Boolean) gVar.invoke(url)).booleanValue();
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, @NotNull WebResourceRequest request, @NotNull WebResourceError error) {
        L60.g gVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
        super.onReceivedError(webView, request, error);
        if (!request.isForMainFrame() || (gVar = this.f17493l) == null) {
            return;
        }
        gVar.invoke(request, error);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        L80.a.a("FintechWebViewClient", "shouldOverrideUrlLoading: " + request.getUrl());
        g gVar = this.f17492k;
        if (gVar == null) {
            return false;
        }
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return ((Boolean) gVar.invoke(uri)).booleanValue();
    }
}
