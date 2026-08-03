package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class D<T extends com.moloco.sdk.publisher.AdShowListener> implements com.moloco.sdk.internal.publisher.z {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.internal.publisher.z f7073a;
    public final T b;
    public final com.moloco.sdk.internal.services.InterfaceC3435f c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;
    public final com.moloco.sdk.publisher.AdFormatType e;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f;

    public D(T adShowListener, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.ortb.model.B> provideSdkEvents, kotlin.jvm.functions.Function0<com.moloco.sdk.internal.publisher.C3427k> provideBUrlData, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> getCreativeType) {
        com.moloco.sdk.internal.publisher.z a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        a2 = com.moloco.sdk.internal.publisher.B.a(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.y.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adFormatType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : getCreativeType);
        this.f7073a = a2;
        this.b = adShowListener;
        this.c = appLifecycleTrackerService;
        this.d = customUserEventBuilderService;
        this.e = adFormatType;
        this.f = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.internal.s internalError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f7073a.a(internalError);
    }

    public final T b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdClicked(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7073a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void onAdHidden(com.moloco.sdk.publisher.MolocoAd molocoAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7073a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a(com.moloco.sdk.publisher.MolocoAd molocoAd, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f7073a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.z
    public void a() {
        this.f7073a.a();
    }
}
