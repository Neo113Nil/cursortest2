package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3422f implements com.moloco.sdk.internal.publisher.y {
    public static final com.moloco.sdk.internal.publisher.C3422f.a g = new com.moloco.sdk.internal.publisher.C3422f.a(null);
    public static final int h = 8;
    public static final java.lang.String i = "AdLoadListenerTrackerImpl";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.publisher.AdLoad.Listener f7100a;
    public final com.moloco.sdk.internal.w b;
    public final com.moloco.sdk.acm.TimerEvent c;
    public final com.moloco.sdk.publisher.AdFormatType d;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder e;
    public final kotlin.jvm.functions.Function0<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> f;

    /* renamed from: com.moloco.sdk.internal.publisher.f$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3422f(com.moloco.sdk.publisher.AdLoad.Listener listener, com.moloco.sdk.internal.w sdkEventUrlTracker, com.moloco.sdk.acm.TimerEvent acmLoadTimerEvent, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7100a = listener;
        this.b = sdkEventUrlTracker;
        this.c = acmLoadTimerEvent;
        this.d = adFormatType;
        this.e = metricsRecorder;
        this.f = function0;
    }

    @Override // com.moloco.sdk.internal.publisher.y
    public void a(com.moloco.sdk.publisher.MolocoAd molocoAd, long j, com.moloco.sdk.internal.ortb.model.B b) {
        java.lang.String onAdLoadStart;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "onAdLoadStarted: " + molocoAd + ", " + j, null, false, 12, null);
        if (b == null || (onAdLoadStart = b.getOnAdLoadStart()) == null) {
            return;
        }
        com.moloco.sdk.internal.w.a.a(this.b, onAdLoadStart, j, null, 4, null);
    }

    @Override // com.moloco.sdk.internal.publisher.y
    public void a(com.moloco.sdk.publisher.MolocoAd molocoAd, com.moloco.sdk.internal.ortb.model.B b) {
        java.lang.String onAdLoadSuccess;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "onAdLoadSuccess: " + molocoAd, null, false, 12, null);
        if (b != null && (onAdLoadSuccess = b.getOnAdLoadSuccess()) != null) {
            com.moloco.sdk.internal.w.a.a(this.b, onAdLoadSuccess, java.lang.System.currentTimeMillis(), null, 4, null);
        }
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.e;
        com.moloco.sdk.acm.TimerEvent withTag = this.c.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.c;
        java.lang.String c = dVar.c();
        java.lang.String name = this.d.name();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = name.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordTimerEvent(com.moloco.sdk.internal.publisher.C3424h.a(withTag.withTag(c, lowerCase), this.f));
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.e;
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.l.c());
        java.lang.String c2 = dVar.c();
        java.lang.String lowerCase2 = this.d.name().toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        metricsRecorder2.recordCountEvent(com.moloco.sdk.internal.publisher.C3424h.a(countEvent.withTag(c2, lowerCase2), this.f));
        com.moloco.sdk.publisher.AdLoad.Listener listener = this.f7100a;
        if (listener != null) {
            listener.onAdLoadSuccess(molocoAd);
        }
    }

    public /* synthetic */ C3422f(com.moloco.sdk.publisher.AdLoad.Listener listener, com.moloco.sdk.internal.w wVar, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0 function0, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(listener, wVar, timerEvent, adFormatType, metricsRecorder, (i2 & 32) != 0 ? null : function0);
    }

    @Override // com.moloco.sdk.internal.publisher.y
    public void a(com.moloco.sdk.internal.s internalError, com.moloco.sdk.internal.ortb.model.B b) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, i, "onAdLoadFailed: " + internalError, null, false, 12, null);
        if (b != null && (str = b.getCom.ironsource.Vf.b java.lang.String()) != null) {
            this.b.a(str, java.lang.System.currentTimeMillis(), internalError);
        }
        java.lang.String str2 = internalError.d().get("missing_fields");
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.e;
        com.moloco.sdk.acm.TimerEvent withTag = this.c.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
        com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.b;
        com.moloco.sdk.acm.TimerEvent withTag2 = withTag.withTag(dVar.c(), internalError.f().a());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.c;
        java.lang.String c = dVar2.c();
        java.lang.String name = this.d.name();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = name.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        metricsRecorder.recordTimerEvent(withTag2.withTag(c, lowerCase));
        com.moloco.sdk.acm.CountEvent withTag3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.m.c()).withTag("network", internalError.e().getNetworkName()).withTag(dVar.c(), internalError.f().a());
        java.lang.String c2 = dVar2.c();
        java.lang.String lowerCase2 = this.d.name().toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        com.moloco.sdk.acm.CountEvent a2 = com.moloco.sdk.internal.publisher.C3424h.a(withTag3.withTag(c2, lowerCase2), this.f);
        if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
            a2 = a2.withTag(com.moloco.sdk.internal.client_metrics_data.d.i.c(), str2);
        }
        this.e.recordCountEvent(a2);
        com.moloco.sdk.publisher.AdLoad.Listener listener = this.f7100a;
        if (listener != null) {
            listener.onAdLoadFailed(internalError.e());
        }
    }
}
