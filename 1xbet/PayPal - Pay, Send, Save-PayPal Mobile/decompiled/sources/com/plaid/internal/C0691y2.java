package com.plaid.internal;

/* renamed from: com.plaid.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0691y2 extends android.widget.FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.Lazy f6627a;
    public final com.plaid.internal.P5 b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691y2(android.content.Context context) {
        super(context, null, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f6627a = kotlin.LazyKt.lazy(new com.plaid.internal.C0664v2(this));
        com.plaid.internal.P5 p5 = new com.plaid.internal.P5(context);
        this.b = p5;
        this.c = kotlin.LazyKt.lazy(new com.plaid.internal.C0682x2(this));
        this.d = kotlin.LazyKt.lazy(new com.plaid.internal.C0673w2(this));
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(true);
        }
        android.view.View.inflate(context, com.plaid.link.R.layout.plaid_link_embedded_view, this);
        ((android.widget.FrameLayout) findViewById(com.plaid.link.R.id.embedded_webview_container)).addView(p5);
    }

    public final android.widget.ProgressBar getProgressBar$link_sdk_release() {
        java.lang.Object value = this.f6627a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.widget.ProgressBar) value;
    }

    public final android.view.View getRetryButton$link_sdk_release() {
        java.lang.Object value = this.d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    public final android.view.View getRetryContainer$link_sdk_release() {
        java.lang.Object value = this.c.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    public final com.plaid.internal.P5 getWebView$link_sdk_release() {
        return this.b;
    }
}
