package com.moloco.sdk.internal;

import android.content.Context;
import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.i;
import com.moloco.sdk.internal.publisher.C4786a;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.internal.publisher.J;
import com.moloco.sdk.internal.services.I;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4774b implements InterfaceC4773a {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Init.SDKInitResponse f10436a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final com.moloco.sdk.internal.services.s c;
    public final Lazy d;

    /* renamed from: com.moloco.sdk.internal.b$a */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context) {
            super(1, Intrinsics.Kotlin.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.b = rVar;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return C4774b.b(C4774b.this, this.b, this.c, p0);
        }
    }

    public C4774b(Init.SDKInitResponse initResponse, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.internal.services.s clickthroughService) {
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.f10436a = initResponse;
        this.b = customUserEventBuilderService;
        this.c = clickthroughService;
        this.d = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4774b.a(C4774b.this));
            }
        });
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public Banner b(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, C viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public Banner c(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, C viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Banner a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? AdFormatType.BANNER : null);
        return a2;
    }

    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public static final boolean a(C4774b c4774b) {
        return c4774b.f10436a.getVerifyBannerVisible();
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public Banner a(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, C viewLifecycleOwnerSingleton, i bannerSize, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, AdFormatType.MREC);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(C4774b c4774b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a2;
        a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, rVar, context, c4774b.b, (r28 & 16) != 0 ? true : true, Boolean.FALSE, 0, 0, 0, false, false, (r28 & 2048) != 0 ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g(false, 0.0f, 0, 0, 15, null) : null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.i(false, false, false, false, null, null, null).a(rVar, null));
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public Banner a(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, C viewLifecycleOwnerSingleton, i.c bannerSize, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, AdFormatType.INLINE_ADAPTIVE_BANNER);
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public Banner a(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, C viewLifecycleOwnerSingleton, i.a bannerSize, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, AdFormatType.ANCHORED_ADAPTIVE_BANNER);
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public NativeAd a(Context context, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.internal.services.n audioService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, C viewLifecycleOwnerSingleton, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, I timeProvider, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(audioService, "audioService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new com.moloco.sdk.internal.publisher.p(com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.r.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new a(externalLinkHandler, context), metricsRecorder), appLifecycleTrackerService, this.b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public InterstitialAd a(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, MetricsRecorder metricsRecorder) {
        InterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = H.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r29 & 64) != 0 ? new com.moloco.sdk.internal.publisher.v(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC4773a
    public RewardedInterstitialAd a(Context context, InterfaceC4805f appLifecycleTrackerService, String adUnitId, Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, C4786a adCreateLoadTimeoutManager, MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a configService) {
        RewardedInterstitialAd a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(configService, "configService");
        a2 = J.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r31 & 64) != 0 ? new com.moloco.sdk.internal.publisher.v(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder, configService);
        return a2;
    }
}
