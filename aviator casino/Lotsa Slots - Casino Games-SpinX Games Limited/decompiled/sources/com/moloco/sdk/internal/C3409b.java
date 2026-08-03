package com.moloco.sdk.internal;

/* renamed from: com.moloco.sdk.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3409b implements com.moloco.sdk.internal.InterfaceC3408a {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.Init.SDKInitResponse f6932a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a b;
    public final com.moloco.sdk.internal.services.s c;
    public final kotlin.Lazy d;

    /* renamed from: com.moloco.sdk.internal.b$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a> {
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r b;
        public final /* synthetic */ android.content.Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, android.content.Context context) {
            super(1, kotlin.jvm.internal.Intrinsics.Kotlin.class, "createVastController", "createNativeAd$createVastController(Lcom/moloco/sdk/internal/AdFactoryImpl;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/Ad;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/AdController;", 0);
            this.b = rVar;
            this.c = context;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            return com.moloco.sdk.internal.C3409b.b(com.moloco.sdk.internal.C3409b.this, this.b, this.c, p0);
        }
    }

    public C3409b(com.moloco.sdk.Init.SDKInitResponse initResponse, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.internal.services.s clickthroughService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        this.f6932a = initResponse;
        this.b = customUserEventBuilderService;
        this.c = clickthroughService;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.b$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.moloco.sdk.internal.C3409b.a(com.moloco.sdk.internal.C3409b.this));
            }
        });
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.Banner b(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.moloco.sdk.publisher.Banner a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? com.moloco.sdk.publisher.AdFormatType.BANNER : null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.Banner c(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.moloco.sdk.publisher.Banner a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, (r29 & 8192) != 0 ? com.moloco.sdk.publisher.AdFormatType.BANNER : null);
        return a2;
    }

    public final boolean a() {
        return ((java.lang.Boolean) this.d.getValue()).booleanValue();
    }

    public static final boolean a(com.moloco.sdk.internal.C3409b c3409b) {
        return c3409b.f6932a.getVerifyBannerVisible();
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.Banner a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.internal.publisher.m.a(context, appLifecycleTrackerService, this.b, adUnitId, a(), externalLinkHandler, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, this.c, metricsRecorder, viewVisibilityTracker, com.moloco.sdk.publisher.AdFormatType.MREC);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a b(com.moloco.sdk.internal.C3409b c3409b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a(aVar, rVar, context, c3409b.b, true, java.lang.Boolean.FALSE, 0, 0, 0, false, false, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(false, false, false, false, null, null, null).a(rVar, null));
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.NativeAd a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.internal.services.n audioService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.services.J timeProvider, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioService, "audioService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.nativead.b(adUnitId, new com.moloco.sdk.internal.publisher.nativead.c(context, adUnitId, new com.moloco.sdk.internal.publisher.p(com.moloco.sdk.internal.ortb.d.a(), com.moloco.sdk.internal.publisher.r.a()), new com.moloco.sdk.internal.publisher.nativead.parser.a(), adCreateLoadTimeoutManager, metricsRecorder, timeProvider), new com.moloco.sdk.internal.publisher.nativead.a(context, viewVisibilityTracker, viewLifecycleOwnerSingleton, watermark, new com.moloco.sdk.internal.C3409b.a(externalLinkHandler, context)), appLifecycleTrackerService, this.b, externalLinkHandler, persistentHttpRequest, adCreateLoadTimeoutManager, metricsRecorder);
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.InterstitialAd a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        com.moloco.sdk.publisher.InterstitialAd a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        a2 = com.moloco.sdk.internal.publisher.G.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r29 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder);
        return a2;
    }

    @Override // com.moloco.sdk.internal.InterfaceC3408a
    public com.moloco.sdk.publisher.RewardedInterstitialAd a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, java.lang.String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i persistentHttpRequest, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.config.a configService) {
        com.moloco.sdk.publisher.RewardedInterstitialAd a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configService, "configService");
        a2 = com.moloco.sdk.internal.publisher.I.a(context, appLifecycleTrackerService, this.b, adUnitId, externalLinkHandler, persistentHttpRequest, (r31 & 64) != 0 ? new com.moloco.sdk.internal.publisher.u(null, null, null, null, null, 31, null) : null, watermark, adCreateLoadTimeoutManager, metricsRecorder, configService);
        return a2;
    }
}
