package com.inmobi.media;

/* renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2795u5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5480a;
    public final /* synthetic */ com.inmobi.media.C2821v5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2795u5(com.inmobi.media.C2821v5 c2821v5, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = c2821v5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2795u5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2795u5(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5480a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.inmobi.media.AbstractC2735s1 abstractC2735s1 = this.b.b;
            if (abstractC2735s1 != null) {
                abstractC2735s1.a();
            }
            com.inmobi.media.Nc nc = this.b.f5502a;
            if (nc != null) {
                this.f5480a = 1;
                if (nc.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
