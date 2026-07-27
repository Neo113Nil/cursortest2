package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.BannerAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class D implements A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f10584a;
    public final BannerAdShowListener b;

    public D(BannerAdShowListener bannerAdShowListener, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.D> provideSdkEvents, Function0<C4796k> provideBUrlData, AdFormatType adType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        A a2;
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = C.a(bannerAdShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.A.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : function0);
        this.f10584a = a2;
        this.b = bannerAdShowListener;
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(com.moloco.sdk.internal.t internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f10584a.a(internalError);
    }

    public final BannerAdShowListener b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10584a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10584a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(MolocoAd molocoAd, String str) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10584a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a() {
        this.f10584a.a();
    }

    public /* synthetic */ D(BannerAdShowListener bannerAdShowListener, InterfaceC4805f interfaceC4805f, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, Function0 function0, Function0 function02, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0 function03, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdShowListener, interfaceC4805f, aVar, function0, function02, adFormatType, metricsRecorder, (i & 128) != 0 ? null : function03);
    }
}
