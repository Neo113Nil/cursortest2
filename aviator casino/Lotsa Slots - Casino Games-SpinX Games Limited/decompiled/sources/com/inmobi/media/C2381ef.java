package com.inmobi.media;

/* renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2381ef extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5179a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.C2538kf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381ef(com.inmobi.media.C2538kf c2538kf, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = c2538kf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2381ef c2381ef = new com.inmobi.media.C2381ef(this.c, continuation);
        c2381ef.b = obj;
        return c2381ef;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.C2381ef c2381ef = new com.inmobi.media.C2381ef(this.c, (kotlin.coroutines.Continuation) obj2);
        c2381ef.b = (com.inmobi.media.C2409fg) obj;
        return c2381ef.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5179a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.C2409fg c2409fg = (com.inmobi.media.C2409fg) this.b;
            com.inmobi.media.C2538kf c2538kf = this.c;
            this.f5179a = 1;
            java.lang.Object a2 = c2538kf.b.a(c2409fg, this);
            if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = kotlin.Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
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
