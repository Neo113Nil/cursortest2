package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bm extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4630a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Fm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bm(com.inmobi.media.Fm fm, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = fm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Bm bm = new com.inmobi.media.Bm(this.c, continuation);
        bm.b = obj;
        return bm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Bm bm = new com.inmobi.media.Bm(this.c, (kotlin.coroutines.Continuation) obj2);
        bm.b = (com.inmobi.media.AbstractC2493im) obj;
        return bm.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4630a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2493im abstractC2493im = (com.inmobi.media.AbstractC2493im) this.b;
            com.inmobi.media.Fm fm = this.c;
            this.f4630a = 1;
            if (fm.c.b.isEmpty()) {
                com.inmobi.media.C2799u9 c2799u9 = fm.e;
                if (c2799u9 != null) {
                    c2799u9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                obj2 = kotlin.Unit.INSTANCE;
            } else {
                if (fm.i == null) {
                    fm.i = new com.inmobi.media.O3(fm.f5284a, fm.b, fm.c.h, fm.e);
                    fm.c();
                }
                com.inmobi.media.O3 o3 = fm.i;
                if (o3 != null && kotlin.jvm.internal.Intrinsics.areEqual(o3.i, com.inmobi.media.Q3.f4909a) && (abstractC2493im instanceof com.inmobi.media.C2941zn)) {
                    com.inmobi.media.O3 o32 = fm.i;
                    if (o32 != null) {
                        o32.a(fm.c.b);
                    }
                } else if (abstractC2493im instanceof com.inmobi.media.C2442gm) {
                    com.inmobi.media.O3 o33 = fm.i;
                    if (o33 != null) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(o33.i, com.inmobi.media.P3.f4886a)) {
                            obj2 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Dm(fm, o33, null), this);
                            if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            }
                        } else {
                            com.inmobi.media.C2799u9 c2799u92 = fm.e;
                            if (c2799u92 != null) {
                                c2799u92.a("VideoExperienceManager", "Companion Ad is not Available");
                            }
                            java.util.Map a2 = com.inmobi.media.AbstractC2938zk.a(fm.c.h.f5078a);
                            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
                            com.inmobi.media.C2624nk.b("CompanionAdDropped", a2, com.inmobi.media.EnumC2728rk.f5431a);
                            obj2 = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.Cm(o33, null), this);
                            if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj2 = kotlin.Unit.INSTANCE;
                            }
                        }
                        if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = kotlin.Unit.INSTANCE;
                        }
                    }
                    obj2 = kotlin.Unit.INSTANCE;
                    if (obj2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                }
                obj2 = kotlin.Unit.INSTANCE;
            }
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
