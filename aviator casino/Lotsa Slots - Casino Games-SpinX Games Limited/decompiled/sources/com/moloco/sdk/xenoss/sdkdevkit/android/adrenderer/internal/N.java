package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class N extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w> {
    public static final int p = 8;
    public final android.content.Context h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a i;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r k;
    public final kotlinx.coroutines.CoroutineScope l;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L m;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i n;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a o;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.VastBannerView$listenToPlayerEvents$1", f = "VastBannerView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7404a;
        public /* synthetic */ java.lang.Object b;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.a) create(bVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7404a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.b;
            if (kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.i.b)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.this.getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.a(true);
                }
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.j.b)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.c.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.this.getAdShowListener();
                    if (adShowListener2 != null) {
                        adShowListener2.a(false);
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.a.b)) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener3 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.this.getAdShowListener();
                    if (adShowListener3 != null) {
                        adShowListener3.b();
                    }
                } else if (bVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.this.getAdShowListener();
                    if (adShowListener4 != null) {
                        adShowListener4.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) bVar).a());
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.g.b) && !kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.C0287b.b) && !kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d.b) && !kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.h.b) && !kotlin.jvm.internal.Intrinsics.areEqual(bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L adLoader) {
        super(context, scope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "options");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        this.h = context;
        this.i = customUserEventBuilderService;
        this.j = options;
        this.k = externalLinkHandler;
        this.l = scope;
        this.m = adLoader;
        setTag("MolocoVastBannerView");
        this.n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i.f7361a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.o;
        if (aVar != null) {
            aVar.destroy();
        }
        this.o = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i getCreativeType() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public void k() {
        com.moloco.sdk.internal.v<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c> d = getAdLoader().d();
        if (d instanceof com.moloco.sdk.internal.v.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((com.moloco.sdk.internal.v.a) d).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w adShowListener = getAdShowListener();
            if (adShowListener != null) {
                adShowListener.a(cVar);
                return;
            }
            return;
        }
        if (!(d instanceof com.moloco.sdk.internal.v.b)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((com.moloco.sdk.internal.v.b) d).a(), this.k, this.h, this.i, this.j.i(), this.j.g(), this.j.h(), this.j.e(), this.j.f(), this.j.d(), this.j.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j(false, false, false, false, null, null, null).a(this.k, null));
        this.o = a2;
        setAdView(this.j.j().invoke(this.h, a2));
        n();
        a2.d();
    }

    public final void n() {
        kotlinx.coroutines.flow.Flow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b> a2;
        kotlinx.coroutines.flow.Flow onEach;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.o;
        if (aVar == null || (a2 = aVar.a()) == null || (onEach = kotlinx.coroutines.flow.FlowKt.onEach(a2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.N.a(null))) == null) {
            return;
        }
        kotlinx.coroutines.flow.FlowKt.launchIn(onEach, this.l);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.B
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L getAdLoader() {
        return this.m;
    }
}
