package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f5863a;
    public com.plaid.internal.P5 b;

    @javax.inject.Inject
    public N5(android.app.Application application) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        this.f5863a = application;
    }

    public final void a() {
        com.plaid.internal.C0452a6.a.d(com.plaid.internal.C0452a6.f5996a, "Destroying webview ".concat(java.lang.String.valueOf(this.b)));
        com.plaid.internal.P5 p5 = this.b;
        if (p5 != null && !p5.a().getAndSet(true)) {
            p5.destroy();
        }
        this.b = null;
    }

    public final com.plaid.internal.P5 b() {
        com.plaid.internal.C0452a6.a.d(com.plaid.internal.C0452a6.f5996a, "Creating webview");
        if ((this.f5863a.getApplicationInfo().flags & 2) != 0) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(true);
        }
        com.plaid.internal.P5 p5 = new com.plaid.internal.P5(this.f5863a);
        this.b = p5;
        kotlin.jvm.internal.Intrinsics.checkNotNull(p5);
        return p5;
    }

    public final com.plaid.internal.P5 c() {
        com.plaid.internal.C0452a6.a.d(com.plaid.internal.C0452a6.f5996a, "Returning webview ".concat(java.lang.String.valueOf(this.b)));
        com.plaid.internal.P5 p5 = this.b;
        if (p5 == null) {
            p5 = b();
        }
        this.b = null;
        return p5;
    }
}
