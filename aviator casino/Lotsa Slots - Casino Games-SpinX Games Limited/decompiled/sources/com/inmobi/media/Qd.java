package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qd extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4917a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ com.inmobi.media.Rd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(com.inmobi.media.Rd rd, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.c = rd;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Qd qd = new com.inmobi.media.Qd(this.c, continuation);
        qd.b = obj;
        return qd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.inmobi.media.Qd qd = new com.inmobi.media.Qd(this.c, (kotlin.coroutines.Continuation) obj2);
        qd.b = (kotlinx.coroutines.channels.ProducerScope) obj;
        return qd.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4917a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.b;
            com.inmobi.media.Rd rd = this.c;
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = rd.f4938a.f5187a;
            com.inmobi.media.Pd pd = new com.inmobi.media.Pd(rd, producerScope);
            this.f4917a = 1;
            if (mutableSharedFlow.collect(pd, this) == coroutine_suspended) {
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
