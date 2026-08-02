package com.paypal.oslo.feature.xoom.data.repository;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1", f = "XoomLocalRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class XoomLocalRepositoryImpl$userId$state$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.core.userstore.model.UserState, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean((userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) || (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError) || (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.core.userstore.model.UserState userState, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1) create(userState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1 xoomLocalRepositoryImpl$userId$state$1 = new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1(continuation);
        xoomLocalRepositoryImpl$userId$state$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return xoomLocalRepositoryImpl$userId$state$1;
    }

    XoomLocalRepositoryImpl$userId$state$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl$userId$state$1> continuation) {
        super(2, continuation);
    }
}
