package com.inmobi.media;

/* loaded from: classes5.dex */
public final class R4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4931a;
    public final /* synthetic */ kotlinx.coroutines.flow.StateFlow b;
    public final /* synthetic */ com.inmobi.media.M1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(kotlinx.coroutines.flow.StateFlow stateFlow, com.inmobi.media.M1 m1, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = stateFlow;
        this.c = m1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.R4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.R4(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4931a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.StateFlow stateFlow = this.b;
            com.inmobi.media.M1 m1 = this.c;
            this.f4931a = 1;
            if (stateFlow.collect(m1, this) == coroutine_suspended) {
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
