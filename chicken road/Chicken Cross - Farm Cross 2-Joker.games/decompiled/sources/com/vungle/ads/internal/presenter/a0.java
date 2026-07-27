package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f12079a;
    public final com.vungle.ads.internal.ui.z b;

    public a0(com.vungle.ads.internal.ui.z webViewClient, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewClient, "webViewClient");
        this.f12079a = webView;
        this.b = webViewClient;
    }

    public final WebView a() {
        return this.f12079a;
    }

    public final com.vungle.ads.internal.ui.z b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f12079a, a0Var.f12079a) && Intrinsics.areEqual(this.b, a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12079a.hashCode() * 31);
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("WebViewEntry(webView=").append(this.f12079a).append(", webViewClient=").append(this.b).append(')').toString();
    }
}
