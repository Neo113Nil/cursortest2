package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Id extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.Vc f4764a;
    public int b;
    public /* synthetic */ java.lang.Object c;
    public final /* synthetic */ com.inmobi.media.Ld d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Id(com.inmobi.media.Ld ld, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.d = ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Id id = new com.inmobi.media.Id(this.d, continuation);
        id.c = obj;
        return id;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Id id = new com.inmobi.media.Id(this.d, (kotlin.coroutines.Continuation) obj2);
        id.c = (kotlinx.coroutines.CoroutineScope) obj;
        return id.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if (r15 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        android.view.View view;
        com.inmobi.media.G6 g6;
        com.inmobi.media.Vc vc;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.c;
            com.inmobi.media.InterfaceC2772t9 l = this.d.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "loadMediaViews - building experience loader");
            }
            com.inmobi.media.Ld ld = this.d;
            com.inmobi.media.Mc nativeAdUnitComponent = ld.b;
            com.inmobi.media.AbstractC2367e1 adSessionManager = ld.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
            java.lang.String type = (assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType();
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.inmobi.media.Hd(kotlin.jvm.internal.Intrinsics.areEqual(type, "static") ? new com.inmobi.media.Gj(nativeAdUnitComponent, adSessionManager) : kotlin.jvm.internal.Intrinsics.areEqual(type, "video") ? new com.inmobi.media.C2626nm(nativeAdUnitComponent, adSessionManager) : new com.inmobi.media.Sk(nativeAdUnitComponent, adSessionManager), null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.inmobi.media.Gd(this.d, null), 3, null);
            com.inmobi.media.Ld ld2 = this.d;
            this.c = async$default;
            this.b = 1;
            obj = ld2.a(async$default2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vc = this.f4764a;
                    view = (android.view.View) this.c;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.d.a(null, view, vc);
                    return kotlin.Unit.INSTANCE;
                }
                view = (android.view.View) this.c;
                kotlin.ResultKt.throwOnFailure(obj);
                g6 = (com.inmobi.media.G6) obj;
                if (!(g6 instanceof com.inmobi.media.D6)) {
                    com.inmobi.media.InterfaceC2772t9 l2 = this.d.l();
                    if (l2 != null) {
                        ((com.inmobi.media.C2799u9) l2).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((com.inmobi.media.D6) g6).f4655a));
                    }
                    this.d.a(((com.inmobi.media.D6) g6).f4655a);
                } else {
                    if (!(g6 instanceof com.inmobi.media.E6)) {
                        if (!(g6 instanceof com.inmobi.media.F6)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.inmobi.media.InterfaceC2772t9 l3 = this.d.l();
                        if (l3 != null) {
                            ((com.inmobi.media.C2799u9) l3).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                        }
                        com.inmobi.media.Ld ld3 = this.d;
                        com.inmobi.media.Bl bl = ((com.inmobi.media.F6) g6).f4698a;
                        com.inmobi.media.C2313c0 c2313c0 = ld3.f5559a.f5538a.d;
                        com.inmobi.media.Mc mc = ld3.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
                        com.inmobi.media.Vc vc2 = new com.inmobi.media.Vc(bl, c2313c0, new com.inmobi.media.Ji(mc.f4836a.b.g));
                        com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.d.b.g.getValue();
                        this.c = view;
                        this.f4764a = vc2;
                        this.b = 3;
                        c2775tc.getClass();
                        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.C2720rc(c2775tc, null), this);
                        if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            withContext = kotlin.Unit.INSTANCE;
                        }
                        if (withContext != coroutine_suspended) {
                            vc = vc2;
                            this.d.a(null, view, vc);
                        }
                        return coroutine_suspended;
                    }
                    com.inmobi.media.InterfaceC2772t9 l4 = this.d.l();
                    if (l4 != null) {
                        ((com.inmobi.media.C2799u9) l4).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                    }
                    com.inmobi.media.Ld ld4 = this.d;
                    com.inmobi.media.E6 e6 = (com.inmobi.media.E6) g6;
                    com.inmobi.media.Bl bl2 = e6.b;
                    com.inmobi.media.C2313c0 c2313c02 = ld4.f5559a.f5538a.d;
                    com.inmobi.media.Mc mc2 = ld4.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc2, "<this>");
                    this.d.a(e6.f4677a, view, new com.inmobi.media.Vc(bl2, c2313c02, new com.inmobi.media.Ji(mc2.f4836a.b.g)));
                }
                return kotlin.Unit.INSTANCE;
            }
            async$default = (kotlinx.coroutines.Deferred) this.c;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.view.View view2 = (android.view.View) obj;
        this.c = view2;
        this.b = 2;
        java.lang.Object await = async$default.await(this);
        if (await != coroutine_suspended) {
            view = view2;
            obj = await;
            g6 = (com.inmobi.media.G6) obj;
            if (!(g6 instanceof com.inmobi.media.D6)) {
            }
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
