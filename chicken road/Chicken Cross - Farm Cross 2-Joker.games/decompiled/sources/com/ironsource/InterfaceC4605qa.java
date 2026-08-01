package com.ironsource;

import android.os.Build;
import android.webkit.WebView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4605qa {

    /* renamed from: com.ironsource.qa$a */
    public static final class a implements InterfaceC4605qa {

        /* renamed from: a, reason: collision with root package name */
        private WebView f8490a;
        private boolean b;

        public a() {
            this(0, 1, null);
        }

        private final void b(String str) {
            WebView webView = this.f8490a;
            if (webView != null) {
                webView.evaluateJavascript(str, null);
            }
        }

        private final void c(String str) {
            WebView webView = this.f8490a;
            if (webView != null) {
                webView.loadUrl("javascript:" + str);
            }
        }

        @Override // com.ironsource.InterfaceC4605qa
        public boolean a() {
            return this.f8490a != null;
        }

        public a(int i) {
            this.b = i >= 19;
        }

        @Override // com.ironsource.InterfaceC4605qa
        public void a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.b) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable th) {
                C4491k4.d().a(th);
                this.b = false;
                c(script);
            }
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        @Override // com.ironsource.InterfaceC4605qa
        public void a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.f8490a = webView;
        }
    }

    void a(WebView webView);

    void a(String str);

    boolean a();
}
