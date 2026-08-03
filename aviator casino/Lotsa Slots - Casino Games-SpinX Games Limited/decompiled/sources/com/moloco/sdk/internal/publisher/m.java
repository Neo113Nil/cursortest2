package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class m {

    public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function8<android.content.Context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a, com.moloco.sdk.internal.ortb.model.C3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.internal.A, com.moloco.sdk.internal.services.s, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g>> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.publisher.m.a f7104a = new com.moloco.sdk.internal.publisher.m.a();

        public a() {
            super(8, com.moloco.sdk.internal.publisher.m.class, "createXenossAggregatedBanner", "createXenossAggregatedBanner(Landroid/content/Context;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService;Lcom/moloco/sdk/internal/ortb/model/Bid;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ExternalLinkHandler;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/Watermark;Lcom/moloco/sdk/internal/ViewLifecycleOwner;Lcom/moloco/sdk/internal/services/ClickthroughService;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/ButtonTracker;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/XenossBannerView;", 1);
        }

        @Override // kotlin.jvm.functions.Function8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> invoke(android.content.Context p0, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a p1, com.moloco.sdk.internal.ortb.model.C3415e p2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r p3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y p4, com.moloco.sdk.internal.A p5, com.moloco.sdk.internal.services.s p6, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h p7) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "p1");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "p2");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "p3");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "p4");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "p5");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "p6");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "p7");
            return com.moloco.sdk.internal.publisher.m.b(p0, p1, p2, p3, p4, p5, p6, p7);
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.internal.publisher.m.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.moloco.sdk.internal.publisher.m.b f7105a = new com.moloco.sdk.internal.publisher.m.b();

        public b() {
            super(1, com.moloco.sdk.internal.publisher.m.class, "createXenossAggregatedAdShowListener", "createXenossAggregatedAdShowListener(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/VastAdShowListener;)Lcom/moloco/sdk/internal/publisher/BannerKt$createXenossAggregatedAdShowListener$1;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.moloco.sdk.internal.publisher.m.c invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
            return com.moloco.sdk.internal.publisher.m.b(p0);
        }
    }

    public static final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w f7106a;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
            this.f7106a = wVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a() {
            this.f7106a.a();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void b() {
            this.f7106a.b();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            this.f7106a.a(internalShowError);
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w
        public void a(boolean z) {
            this.f7106a.a(z);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g> b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.internal.A a2, com.moloco.sdk.internal.services.s sVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.h hVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3445b(context, aVar, null, c3415e, a(c3415e.getExt().getPlayer()), rVar, yVar, a2, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null))), sVar, hVar);
    }

    public static final com.moloco.sdk.publisher.Banner a(android.content.Context context, com.moloco.sdk.internal.services.InterfaceC3435f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adUnitId, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.internal.publisher.C3417a adCreateLoadTimeoutManager, com.moloco.sdk.internal.A viewLifecycleOwnerSingleton, com.moloco.sdk.internal.i bannerSize, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q viewVisibilityTracker, com.moloco.sdk.publisher.AdFormatType adFormatType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewLifecycleOwnerSingleton, "viewLifecycleOwnerSingleton");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        return new com.moloco.sdk.internal.publisher.n(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, z, externalLinkHandler, com.moloco.sdk.internal.publisher.m.a.f7104a, com.moloco.sdk.internal.publisher.m.b.f7105a, watermark, adCreateLoadTimeoutManager, viewLifecycleOwnerSingleton, bannerSize, clickthroughService, metricsRecorder, viewVisibilityTracker, adFormatType);
    }

    public static final com.moloco.sdk.internal.publisher.m.c b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w wVar) {
        return new com.moloco.sdk.internal.publisher.m.c(wVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a(com.moloco.sdk.internal.ortb.model.z zVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h a2;
        return (zVar == null || (a2 = com.moloco.sdk.internal.d.a(zVar)) == null) ? com.moloco.sdk.internal.d.a() : a2;
    }
}
