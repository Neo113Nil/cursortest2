package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class C implements com.moloco.sdk.internal.publisher.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.z f7072a;
    public final com.moloco.sdk.publisher.BannerAdShowListener b;

    public C(com.moloco.sdk.publisher.BannerAdShowListener bannerAdShowListener, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.publisher.C3427k> provideBUrlData, com.moloco.sdk.publisher.AdFormatType adType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        com.moloco.sdk.internal.publisher.z a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.B.a(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.y.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : function0);
        this.f7072a = a2;
        this.b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.s internalError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f7072a.a(internalError);
    }

    public final com.moloco.sdk.publisher.BannerAdShowListener b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7072a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7072a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7072a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        this.f7072a.a();
    }

    public /* synthetic */ C(com.moloco.sdk.publisher.BannerAdShowListener bannerAdShowListener, com.moloco.sdk.internal.services.InterfaceC3435f interfaceC3435f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0 function03, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdShowListener, interfaceC3435f, aVar, function0, function02, adFormatType, metricsRecorder, (i & 128) != 0 ? null : function03);
    }
}
