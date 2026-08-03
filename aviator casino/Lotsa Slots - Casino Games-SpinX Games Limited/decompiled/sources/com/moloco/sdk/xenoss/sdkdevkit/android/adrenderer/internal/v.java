package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class v implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3464u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7675a = 0;

    public /* synthetic */ class a extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
        public a(java.lang.Object obj) {
            super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d>> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b) this.receiver).b(continuation);
        }
    }

    public static final class b extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e {
        public final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f fVar, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> mutableStateFlow, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r rVar2) {
            super(context, str, rVar2, null, null, null, rVar, false, fVar, 184, null);
            this.o = mutableStateFlow;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e
        public void s() {
            super.s();
            this.o.setValue(java.lang.Boolean.FALSE);
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
        public c(java.lang.Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b.class, "closeFullscreenAdRepresentation", "closeFullscreenAdRepresentation()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b) this.receiver).s();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            a();
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3464u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(android.content.Context context, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isAdDisplaying, boolean z, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isAdDisplaying, "isAdDisplaying");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h.a(context, scope, z);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.b(context, externalLinkHandler, a2, isAdDisplaying, bid.getAdm(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r.c);
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.B.a(context, watermark, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y(scope, bid, com.moloco.sdk.service_locator.a.C0211a.f7342a.a(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.a(bVar)), bVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k(true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v.c(bVar), scope, kotlin.UInt.m10896constructorimpl(kotlin.ranges.RangesKt.coerceAtLeast(0, 0)), a2.c(), a2.v(), null, 64, null), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.INSTANCE, bid.getBundle(), metricsRecorder);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3464u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(android.content.Context context, com.moloco.sdk.internal.ortb.model.C3415e bid, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.P.a(context, bid, com.moloco.sdk.service_locator.a.g.f7348a.b().h(), watermark, metricsRecorder, null, null, 96, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3464u
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f> a(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, java.lang.String adm, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.H.a(context, customUserEventBuilderService, adm, externalLinkHandler, watermark);
    }
}
