package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import d2.C0277g;
import d2.InterfaceC0273c;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yk implements rk {

    /* renamed from: a, reason: collision with root package name */
    public final ib f4736a;

    /* renamed from: b, reason: collision with root package name */
    public final ib f4737b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4738c;

    /* renamed from: d, reason: collision with root package name */
    public final ib f4739d;

    /* renamed from: e, reason: collision with root package name */
    public final i7 f4740e;
    public final e3 f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4741g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0273c f4742h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0273c f4743i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC0273c f4744j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0273c f4745k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedList f4746l;

    /* renamed from: m, reason: collision with root package name */
    public volatile String f4747m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4748n;

    public yk(Context context, ib prefs, ib threadPool, ib uiExecutor, ib looperIdleDetector, i7 metadataHolder, e3 clock) {
        boolean isUiContext;
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(prefs, "prefs");
        kotlin.jvm.internal.j.e(threadPool, "threadPool");
        kotlin.jvm.internal.j.e(uiExecutor, "uiExecutor");
        kotlin.jvm.internal.j.e(looperIdleDetector, "looperIdleDetector");
        kotlin.jvm.internal.j.e(metadataHolder, "metadataHolder");
        kotlin.jvm.internal.j.e(clock, "clock");
        this.f4736a = prefs;
        this.f4737b = threadPool;
        this.f4738c = uiExecutor;
        this.f4739d = looperIdleDetector;
        this.f4740e = metadataHolder;
        this.f = clock;
        if (Build.VERSION.SDK_INT >= 31) {
            isUiContext = context.isUiContext();
            if (!isUiContext) {
                context = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
                kotlin.jvm.internal.j.b(context);
            }
        }
        this.f4741g = context;
        final int i3 = 0;
        this.f4742h = new C0277g(new o2.a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f3429b;

            {
                this.f3429b = this;
            }

            @Override // o2.a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return yk.b(this.f3429b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f3429b));
                    case 2:
                        return yk.c(this.f3429b);
                    default:
                        return Long.valueOf(yk.e(this.f3429b));
                }
            }
        });
        final int i4 = 1;
        this.f4743i = new C0277g(new o2.a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f3429b;

            {
                this.f3429b = this;
            }

            @Override // o2.a
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return yk.b(this.f3429b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f3429b));
                    case 2:
                        return yk.c(this.f3429b);
                    default:
                        return Long.valueOf(yk.e(this.f3429b));
                }
            }
        });
        final int i5 = 2;
        this.f4744j = new C0277g(new o2.a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f3429b;

            {
                this.f3429b = this;
            }

            @Override // o2.a
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return yk.b(this.f3429b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f3429b));
                    case 2:
                        return yk.c(this.f3429b);
                    default:
                        return Long.valueOf(yk.e(this.f3429b));
                }
            }
        });
        final int i6 = 3;
        this.f4745k = new C0277g(new o2.a(this) { // from class: com.startapp.sdk.internal.M

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ yk f3429b;

            {
                this.f3429b = this;
            }

            @Override // o2.a
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return yk.b(this.f3429b);
                    case 1:
                        return Boolean.valueOf(yk.j(this.f3429b));
                    case 2:
                        return yk.c(this.f3429b);
                    default:
                        return Long.valueOf(yk.e(this.f3429b));
                }
            }
        });
        this.f4746l = new LinkedList();
        this.f4748n = true;
    }

    public static final WvfMetadata b(yk this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        return (WvfMetadata) this$0.f4740e.a();
    }

    public static final String c(yk this$0) {
        WeightedChoice b3;
        String a3;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0277g) this$0.f4742h).a();
        return (wvfMetadata == null || (b3 = wvfMetadata.b()) == null || (a3 = b3.a()) == null) ? "default" : a3;
    }

    public static final long e(yk this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0277g) this$0.f4742h).a();
        return Math.min(Math.max(60000L, wvfMetadata != null ? wvfMetadata.d() : 2592000000L), 31536000000L);
    }

    public static final void g(yk this$0) {
        kotlin.jvm.internal.j.e(this$0, "this$0");
        try {
            if (this$0.f.a() < ((sf) this$0.f4736a.a()).getLong("06202469550e108e", 0L) + ((Number) ((C0277g) this$0.f4745k).a()).longValue()) {
                String string = ((sf) this$0.f4736a.a()).getString("5b47fb537d32a117", null);
                String c3 = string != null ? si.c(string) : null;
                if (c3 != null && !v2.m.n0(c3)) {
                    this$0.f4747m = c3;
                }
            }
        } catch (Throwable th) {
            if (this$0.a(4096)) {
                d9.a(th);
            }
        }
        ((k8) this$0.f4738c.a()).f3952a.post(new L(this$0, 3));
    }

    public static final boolean j(yk this$0) {
        EnabledConfig e3;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0277g) this$0.f4742h).a();
        if (wvfMetadata == null || (e3 = wvfMetadata.e()) == null) {
            return false;
        }
        return e3.a(this$0.f);
    }

    public final boolean a(int i3) {
        ComponentInfoEventConfig a3;
        WvfMetadata wvfMetadata = (WvfMetadata) ((C0277g) this.f4742h).a();
        if (wvfMetadata == null || (a3 = wvfMetadata.a()) == null) {
            return false;
        }
        return a3.a(i3);
    }

    public final void d() {
        try {
            if (!this.f4746l.isEmpty()) {
                if (!this.f4748n) {
                    return;
                }
                String str = this.f4747m;
                if (str != null && !v2.m.n0(str)) {
                    return;
                }
            }
            dc dcVar = (dc) this.f4739d.a();
            L l3 = new L(this, 0);
            synchronized (dcVar) {
                if (dcVar.f3585c != null) {
                    return;
                }
                Thread thread = new Thread(new cc(dcVar, l3), "startapp-lid-" + dc.f3582g.incrementAndGet());
                dcVar.f3585c = thread;
                thread.start();
            }
        } catch (Throwable th) {
            if (a(256)) {
                d9.a(th);
            }
        }
    }

    public final void f() {
        try {
            if (this.f4748n) {
                String str = this.f4747m;
                if (str != null && !v2.m.n0(str)) {
                    return;
                }
                this.f4748n = false;
                String str2 = (String) ((C0277g) this.f4744j).a();
                if (kotlin.jvm.internal.j.a(str2, "default")) {
                    e();
                } else if (kotlin.jvm.internal.j.a(str2, "headers")) {
                    a(c());
                }
            }
        } catch (Throwable th) {
            if (a(8192)) {
                d9.a(th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0012, B:10:0x0023, B:12:0x0033, B:16:0x0049), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:2:0x0000, B:4:0x0004, B:9:0x0012, B:10:0x0023, B:12:0x0033, B:16:0x0049), top: B:1:0x0000 }] */
    @Override // com.startapp.sdk.internal.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z3;
        try {
            String str = this.f4747m;
            if (str != null && !v2.m.n0(str)) {
                z3 = false;
                if (z3) {
                    ((Executor) this.f4737b.a()).execute(new L(this, 4));
                }
                if (!((Boolean) ((C0277g) this.f4743i).a()).booleanValue()) {
                    k8 k8Var = (k8) this.f4738c.a();
                    k8Var.f3952a.post(new L(this, 5));
                    return;
                } else {
                    if (z3) {
                        return;
                    }
                    k8 k8Var2 = (k8) this.f4738c.a();
                    k8Var2.f3952a.post(new L(this, 1));
                    return;
                }
            }
            z3 = true;
            if (z3) {
            }
            if (!((Boolean) ((C0277g) this.f4743i).a()).booleanValue()) {
            }
        } catch (Throwable th) {
            if (a(16384)) {
                d9.a(th);
            }
        }
    }

    @Override // com.startapp.sdk.internal.rk
    public final String a() {
        String str = this.f4747m;
        if (str != null) {
            if (v2.m.n0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null || v2.m.n0(property)) {
            return null;
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.rk
    public final WebView c() {
        WebView webView = (WebView) this.f4746l.poll();
        if (webView == null) {
            webView = new WebView(this.f4741g);
            webView.setWebViewClient(new qk());
        }
        if (((Boolean) ((C0277g) this.f4743i).a()).booleanValue()) {
            d();
        }
        return webView;
    }

    public final void e() {
        try {
            ((Executor) this.f4737b.a()).execute(new L(this, 2));
        } catch (Throwable th) {
            if (a(8)) {
                d9.a(th);
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                String h3 = si.h(str);
                if (h3 != null) {
                    rf edit = ((sf) this.f4736a.a()).edit();
                    edit.a("5b47fb537d32a117", h3);
                    edit.f4299a.putString("5b47fb537d32a117", h3);
                    long a3 = this.f.a();
                    edit.a("06202469550e108e", Long.valueOf(a3));
                    edit.f4299a.putLong("06202469550e108e", a3);
                    edit.f4299a.commit();
                }
            } catch (IOException e3) {
                if (a(2048)) {
                    d9.a(e3);
                }
            }
        }
    }

    public static final void b(WebView webView) {
        kotlin.jvm.internal.j.e(webView, "$webView");
        String a3 = si.a();
        kotlin.jvm.internal.j.d(a3, "cipherVigenere(...)");
        webView.loadUrl(a3);
    }

    public static final void d(yk ykVar) {
        ykVar.getClass();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(ykVar.f4741g);
            if (defaultUserAgent != null) {
                if (!v2.m.n0(defaultUserAgent)) {
                    ykVar.f4747m = defaultUserAgent;
                }
                ykVar.a(defaultUserAgent);
            }
        } catch (Throwable th) {
            if (ykVar.a(16)) {
                d9.a(th);
            }
        }
    }

    public static final void a(yk ykVar) {
        WebView webView;
        ykVar.getClass();
        try {
            if (ykVar.f4746l.isEmpty()) {
                try {
                    webView = new WebView(ykVar.f4741g);
                    webView.setWebViewClient(new qk());
                } catch (Throwable th) {
                    if (ykVar.a(2)) {
                        d9.a(th);
                    }
                    webView = null;
                }
                if (webView != null) {
                    ykVar.f4746l.add(webView);
                    ykVar.d();
                    return;
                }
                return;
            }
            ykVar.f();
        } catch (Throwable th2) {
            if (ykVar.a(1024)) {
                d9.a(th2);
            }
        }
    }

    public final void a(WebView webView) {
        try {
            webView.setWebViewClient(new xk(this));
            k8 k8Var = (k8) this.f4738c.a();
            k8Var.f3952a.post(new G0.m(18, webView));
        } catch (Throwable th) {
            if (a(32)) {
                d9.a(th);
            }
        }
    }

    public static final void a(WebView webView, yk this$0) {
        kotlin.jvm.internal.j.e(webView, "$webView");
        kotlin.jvm.internal.j.e(this$0, "this$0");
        webView.setWebViewClient(new qk());
        this$0.f4746l.add(webView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001b, code lost:
    
        if (v2.m.n0(r4) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, WebResourceRequest webResourceRequest) {
        kotlin.jvm.internal.j.e(webView, "webView");
        try {
            if (webResourceRequest != null) {
                try {
                    Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                    if (requestHeaders != null && (r4 = requestHeaders.get("User-Agent")) != null) {
                    }
                } catch (Throwable th) {
                    if (a(128)) {
                        d9.a(th);
                    }
                }
            }
            String str = null;
            if (str != null && !v2.m.n0(str)) {
                this.f4747m = str;
            }
            a(str);
            ((k8) this.f4738c.a()).f3952a.post(new D1.a(webView, 12, this));
        } catch (Throwable th2) {
            if (a(64)) {
                d9.a(th2);
            }
        }
    }
}
