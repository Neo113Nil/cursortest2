package com.inmobi.media;

/* loaded from: classes5.dex */
public final class S4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f4949a;
    public final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow b;
    public final /* synthetic */ com.inmobi.media.AbstractC2509jc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, com.inmobi.media.AbstractC2509jc abstractC2509jc, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.b = mutableSharedFlow;
        this.c = abstractC2509jc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.inmobi.media.S4(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return new com.inmobi.media.S4(this.b, this.c, (kotlin.coroutines.Continuation) obj2).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f4949a;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow = this.b;
            com.inmobi.media.AbstractC2509jc abstractC2509jc = this.c;
            this.f4949a = 1;
            if (mutableSharedFlow.emit(abstractC2509jc, this) == coroutine_suspended) {
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
