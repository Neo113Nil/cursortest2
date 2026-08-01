package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class E<T extends AdShowListener> implements A {
    public static final int g = 8;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A f10585a;
    public final T b;
    public final InterfaceC4805f c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a d;
    public final AdFormatType e;
    public final MetricsRecorder f;

    public E(T adShowListener, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, Function0<com.moloco.sdk.internal.ortb.model.D> provideSdkEvents, Function0<C4796k> provideBUrlData, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> getCreativeType) {
        A a2;
        Intrinsics.checkNotNullParameter(adShowListener, "adShowListener");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(provideBUrlData, "provideBUrlData");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(getCreativeType, "getCreativeType");
        a2 = C.a(adShowListener, appLifecycleTrackerService, customUserEventBuilderService, provideSdkEvents, provideBUrlData, (r24 & 32) != 0 ? com.moloco.sdk.internal.A.b() : null, (r24 & 64) != 0 ? com.moloco.sdk.internal.h.a() : null, adFormatType, metricsRecorder, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(metricsRecorder) : null, (r24 & 1024) != 0 ? null : getCreativeType);
        this.f10585a = a2;
        this.b = adShowListener;
        this.c = appLifecycleTrackerService;
        this.d = customUserEventBuilderService;
        this.e = adFormatType;
        this.f = metricsRecorder;
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(com.moloco.sdk.internal.t internalError) {
        Intrinsics.checkNotNullParameter(internalError, "internalError");
        this.f10585a.a(internalError);
    }

    public final T b() {
        return this.b;
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdClicked(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10585a.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void onAdHidden(MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10585a.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a(MolocoAd molocoAd, String str) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f10585a.a(molocoAd, str);
    }

    @Override // com.moloco.sdk.internal.publisher.A
    public void a() {
        this.f10585a.a();
    }
}
