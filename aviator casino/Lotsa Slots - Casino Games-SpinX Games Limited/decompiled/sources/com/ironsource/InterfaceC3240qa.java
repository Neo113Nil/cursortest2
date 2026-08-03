package com.ironsource;

/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC3240qa {

    /* renamed from: com.ironsource.qa$a */
    public static final class a implements com.ironsource.InterfaceC3240qa {

        /* renamed from: a, reason: collision with root package name */
        private android.webkit.WebView f6574a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        private final void b(java.lang.String str) {
            android.webkit.WebView webView = this.f6574a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(java.lang.String str) {
            android.webkit.WebView webView = this.f6574a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC3240qa
        public boolean a() {
            return this.f6574a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC3240qa
        public void a(java.lang.String script) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                this.b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? android.os.Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC3240qa
        public void a(android.webkit.WebView webView) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
            this.f6574a = webView;
        }
    }

    void a(android.webkit.WebView webView);

    void a(java.lang.String str);

    boolean a();
}
