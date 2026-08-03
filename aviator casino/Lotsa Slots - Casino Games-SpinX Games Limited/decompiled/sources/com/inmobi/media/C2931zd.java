package com.inmobi.media;

/* renamed from: com.inmobi.media.zd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2931zd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5590a;
    public final /* synthetic */ com.inmobi.media.Ld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2931zd(com.inmobi.media.Ld ld, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = ld;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2931zd(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2931zd(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r14.a(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Ad(r14, null), r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5590a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Ld ld = this.b;
            com.inmobi.media.InterfaceC2772t9 l = ld.l();
            if (l != null) {
                ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "fireAdLoadCalledBeacons - firing ad load called beacons");
            }
            ((com.inmobi.media.C2756sj) ld.g.getValue()).a(com.inmobi.media.C2302bf.f5123a);
            com.inmobi.media.Ld ld2 = this.b;
            this.f5590a = 1;
            ld2.getClass();
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.Ld ld3 = this.b;
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = ld3.b.b.getAssetsObject();
            if ((assetsObject != null ? assetsObject.getMedia() : null) == null) {
                com.inmobi.media.InterfaceC2772t9 l2 = ld3.l();
                if (l2 != null) {
                    ((com.inmobi.media.C2799u9) l2).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - no media assets, skipping");
                }
            } else {
                com.inmobi.media.InterfaceC2772t9 l3 = ld3.l();
                if (l3 != null) {
                    ((com.inmobi.media.C2799u9) l3).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - media assets found, setting up listener");
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(ld3.e, null, null, new com.inmobi.media.Cd(new com.inmobi.media.Fd(((com.inmobi.media.C2775tc) ld3.b.g.getValue()).e), null, ld3), 3, null);
            }
            com.inmobi.media.Ld ld4 = this.b;
            this.f5590a = 3;
            ld4.getClass();
            java.lang.Object supervisorScope = kotlinx.coroutines.SupervisorKt.supervisorScope(new com.inmobi.media.Id(ld4, null), this);
            if (supervisorScope != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                supervisorScope = kotlin.Unit.INSTANCE;
            }
        }
        com.inmobi.media.C2883xf c2883xf = com.inmobi.media.C2883xf.f5551a;
        this.f5590a = 2;
    }
}
