package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Le extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4818a;
    public /* synthetic */ java.lang.Object b;
    public final /* synthetic */ kotlinx.coroutines.flow.StateFlow c;
    public final /* synthetic */ kotlin.jvm.functions.Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Le(kotlinx.coroutines.flow.StateFlow stateFlow, kotlin.coroutines.Continuation continuation, kotlin.jvm.functions.Function1 function1) {
        super(2, continuation);
        this.c = stateFlow;
        this.d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Le le = new com.inmobi.media.Le(this.c, continuation, this.d);
        le.b = obj;
        return le;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.inmobi.media.Le) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4818a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.b;
            kotlinx.coroutines.flow.StateFlow stateFlow = this.c;
            com.inmobi.media.Ke ke = new com.inmobi.media.Ke(coroutineScope, this.d);
            this.f4818a = 1;
            if (stateFlow.collect(ke, this) == coroutine_suspended) {
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
