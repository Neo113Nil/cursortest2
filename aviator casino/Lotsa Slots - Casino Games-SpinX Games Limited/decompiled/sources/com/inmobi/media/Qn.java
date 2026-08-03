package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Qn extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4925a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableStateFlow c;
    public final /* synthetic */ com.inmobi.media.Sn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qn(kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow, kotlin.coroutines.Continuation continuation, com.inmobi.media.Sn sn) {
        super(2, continuation);
        this.c = mutableStateFlow;
        this.d = sn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Qn qn = new com.inmobi.media.Qn(this.c, continuation, this.d);
        qn.b = obj;
        return qn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Qn) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4925a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.c;
            com.inmobi.media.Pn pn = new com.inmobi.media.Pn(coroutineScope, this.d);
            this.f4925a = 1;
            if (mutableStateFlow.collect(pn, this) == coroutine_suspended) {
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
