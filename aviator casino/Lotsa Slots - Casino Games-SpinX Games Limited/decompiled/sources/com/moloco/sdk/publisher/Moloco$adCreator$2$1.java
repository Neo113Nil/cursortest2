package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/moloco/sdk/internal/a;", "<anonymous>", "()Lcom/moloco/sdk/internal/a;"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$adCreator$2$1", f = "Moloco.kt", i = {}, l = {androidx.core.view.InputDeviceCompat.SOURCE_DPAD}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class Moloco$adCreator$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a>, java.lang.Object> {
    int label;

    public Moloco$adCreator$2$1(kotlin.coroutines.Continuation<? super com.moloco.sdk.publisher.Moloco$adCreator$2$1> continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.moloco.sdk.publisher.Moloco$adCreator$2$1(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.moloco.sdk.internal.publisher.w initializationHandler;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            initializationHandler = com.moloco.sdk.publisher.Moloco.INSTANCE.getInitializationHandler();
            this.label = 1;
            obj = initializationHandler.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a> continuation) {
        return ((com.moloco.sdk.publisher.Moloco$adCreator$2$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }
}
