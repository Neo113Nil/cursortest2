package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$requestToken$1", f = "IdentityLoginFlowStoreImpl.kt", i = {1}, l = {113, 114}, m = "invokeSuspend", n = {"isInContext"}, nl = {114, 116}, s = {"Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowStoreImpl$requestToken$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        if (r5 != r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider inContextLoginProvider;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase;
        boolean z;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Error determining auth flow parameters", e);
            this.getHighSpeedVideoFpsRanges.dispatch(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth(this.Camera2StreamConfigurationMap, false, null));
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            inContextLoginProvider = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = inContextLoginProvider.isInContextLoginEnabled(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.dispatch(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth(this.Camera2StreamConfigurationMap, z, (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        getRememberedUserUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
        this.getHighSpeedVideoFpsRangesFor = 2;
        java.lang.Object invoke = getRememberedUserUseCase.invoke(this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = booleanValue;
        obj = invoke;
        this.getHighSpeedVideoFpsRanges.dispatch(new com.paypal.oslo.feature.identity.login.domain.model.AuthFlowAction.StartInteractiveAuth(this.Camera2StreamConfigurationMap, z, (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either) obj).getOrNull()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$requestToken$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$requestToken$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowStoreImpl$requestToken$1(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl identityLoginFlowStoreImpl, com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$requestToken$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = identityLoginFlowStoreImpl;
        this.Camera2StreamConfigurationMap = userAccessTokenType;
    }
}
