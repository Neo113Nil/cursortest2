package com.paypal.oslo.feature.identity.biometriclogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2", f = "BiometricLoginHandler.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {101}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class BiometricLoginHandler$attempt$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            biometricLoginUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState> invoke = biometricLoginUseCase.invoke(this.getHighSpeedVideoSizes);
            final com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler = this.Camera2StreamConfigurationMap;
            final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
                    com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState biometricLoginState = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState) obj2;
                    if (biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.AuthenticatingBiometric) {
                        mutableStateFlow5 = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow5.setValue(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.AuthenticatingBiometric.INSTANCE);
                    } else if (biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.VerifyingWithServer) {
                        mutableStateFlow4 = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow4.setValue(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Loading.INSTANCE);
                    } else if (biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) {
                        com.paypal.oslo.feature.identity.login.domain.model.LoginResult result = ((com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) biometricLoginState).getResult();
                        if (result instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                            mutableStateFlow3 = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this.getHighSpeedVideoFpsRangesFor;
                            com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) result;
                            mutableStateFlow3.setValue(new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.Success(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations()));
                        } else if (result instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) {
                            mutableStateFlow2 = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this.getHighSpeedVideoFpsRangesFor;
                            mutableStateFlow2.setValue(new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.BiometricLoginUiState.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) result).getChallengeResult()));
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        if (!(biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed failed = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed) biometricLoginState;
                        function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(failed.getError() instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError.UserCancelled));
                        mutableStateFlow = com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this.getHighSpeedVideoFpsRangesFor;
                        mutableStateFlow.setValue(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.access$mapError(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler.this, failed.getError()));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BiometricLoginHandler$attempt$2(com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler biometricLoginHandler, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.ui.BiometricLoginHandler$attempt$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = biometricLoginHandler;
        this.getHighSpeedVideoSizes = fragmentActivity;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
