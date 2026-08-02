package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthFlowState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2", f = "IdentityLoginFlowStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowStoreImpl$awaitIdle$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState = (com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(authFlowState.getPhase() instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthPhase.Idle);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.identity.login.domain.model.AuthFlowState authFlowState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2) create(authFlowState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2 identityLoginFlowStoreImpl$awaitIdle$2 = new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2(continuation);
        identityLoginFlowStoreImpl$awaitIdle$2.getHighSpeedVideoSizes = obj;
        return identityLoginFlowStoreImpl$awaitIdle$2;
    }

    IdentityLoginFlowStoreImpl$awaitIdle$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$awaitIdle$2> continuation) {
        super(2, continuation);
    }
}
