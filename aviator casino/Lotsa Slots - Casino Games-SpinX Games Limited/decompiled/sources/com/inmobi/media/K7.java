package com.inmobi.media;

/* loaded from: classes5.dex */
public final class K7 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4795a;
    public final /* synthetic */ com.inmobi.media.R7 b;
    public final /* synthetic */ com.inmobi.media.AbstractC2493im c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(com.inmobi.media.R7 r7, com.inmobi.media.AbstractC2493im abstractC2493im, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = r7;
        this.c = abstractC2493im;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.K7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.K7(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4795a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.b.m;
            com.inmobi.media.AbstractC2493im abstractC2493im = this.c;
            this.f4795a = 1;
            if (mutableSharedFlow.emit(abstractC2493im, this) == coroutine_suspended) {
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
