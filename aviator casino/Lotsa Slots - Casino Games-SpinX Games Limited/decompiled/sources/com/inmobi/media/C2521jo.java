package com.inmobi.media;

/* renamed from: com.inmobi.media.jo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2521jo extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f5281a;
    public final /* synthetic */ com.inmobi.media.AbstractC2547ko b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2521jo(com.inmobi.media.AbstractC2547ko abstractC2547ko, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = abstractC2547ko;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.C2521jo(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.C2521jo(this.b, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5281a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long c = this.b.c();
            this.f5281a = 1;
            if (kotlinx.coroutines.DelayKt.delay(c, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((java.lang.Runnable) this.b.j.getValue()).run();
        return kotlin.Unit.INSTANCE;
    }
}
