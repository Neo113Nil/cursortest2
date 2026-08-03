package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a {
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.a c = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.a(null);
    public static final int d = 8;
    public static final java.lang.String e = "TemplateBridgeImpl";

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebView f7558a;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(android.webkit.WebView webView, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7558a = webView;
        this.b = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.S.c()).withTag("attached", java.lang.String.valueOf(this.f7558a.isAttachedToWindow())));
        this.f7558a.evaluateJavascript("notifyReadyEvent()", new android.webkit.ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.this, (java.lang.String) obj);
            }
        });
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b bVar, java.lang.String str) {
        bVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.T.c()).withTag("attached", java.lang.String.valueOf(bVar.f7558a.isAttachedToWindow())));
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "notifyReadyEvent call completed, result: " + str, null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a(final boolean z) {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "viewVisible: " + z + " called, invoking setIsViewable in WebView", null, false, 12, null);
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.U.c()).withTag("viewable", java.lang.String.valueOf(z)).withTag("attached", java.lang.String.valueOf(this.f7558a.isAttachedToWindow())));
        this.f7558a.evaluateJavascript("setIsViewable(" + z + ')', new android.webkit.ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(java.lang.Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b.this, z, (java.lang.String) obj);
            }
        });
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b bVar, boolean z, java.lang.String str) {
        bVar.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.V.c()).withTag("viewable", java.lang.String.valueOf(z)).withTag("attached", java.lang.String.valueOf(bVar.f7558a.isAttachedToWindow())));
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "setIsViewable call completed, result: " + str, null, false, 12, null);
    }
}
