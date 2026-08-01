package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a {
    public static final a c = new a(null);
    public static final int d = 8;
    public static final String e = "TemplateBridgeImpl";

    /* renamed from: a, reason: collision with root package name */
    public final WebView f11084a;
    public final MetricsRecorder b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public b(WebView webView, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f11084a = webView;
        this.b = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.S.c()).withTag("attached", String.valueOf(this.f11084a.isAttachedToWindow())));
        this.f11084a.evaluateJavascript("notifyReadyEvent()", new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b$$ExternalSyntheticLambda1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                b.a(b.this, (String) obj);
            }
        });
    }

    public static final void a(b bVar, String str) {
        bVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.T.c()).withTag("attached", String.valueOf(bVar.f11084a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "notifyReadyEvent call completed, result: " + str, null, false, 12, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a
    public void a(final boolean z) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "viewVisible: " + z + " called, invoking setIsViewable in WebView", null, false, 12, null);
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.U.c()).withTag("viewable", String.valueOf(z)).withTag("attached", String.valueOf(this.f11084a.isAttachedToWindow())));
        this.f11084a.evaluateJavascript("setIsViewable(" + z + ')', new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                b.a(b.this, z, (String) obj);
            }
        });
    }

    public static final void a(b bVar, boolean z, String str) {
        bVar.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.V.c()).withTag("viewable", String.valueOf(z)).withTag("attached", String.valueOf(bVar.f11084a.isAttachedToWindow())));
        MolocoLogger.info$default(MolocoLogger.INSTANCE, e, "setIsViewable call completed, result: " + str, null, false, 12, null);
    }
}
