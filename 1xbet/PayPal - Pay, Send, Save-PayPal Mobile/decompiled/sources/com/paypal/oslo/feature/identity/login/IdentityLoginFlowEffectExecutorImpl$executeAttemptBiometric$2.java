package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2", f = "IdentityLoginFlowEffectExecutor.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {113}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            biometricLoginUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState> invoke = biometricLoginUseCase.invoke(this.getHighSpeedVideoSizes);
            final kotlin.jvm.internal.Ref.ObjectRef<com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult> objectRef = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (invoke.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    T t;
                    com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState biometricLoginState = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState) obj2;
                    if (biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) {
                        kotlin.jvm.internal.Ref.ObjectRef<com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult> objectRef2 = objectRef;
                        com.paypal.oslo.feature.identity.login.domain.model.LoginResult result = ((com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Completed) biometricLoginState).getResult();
                        if (result instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                            t = (T) ((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult) new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.Success(new com.paypal.oslo.core.identity.domain.model.Token.UserAccessToken(((com.paypal.oslo.feature.identity.login.domain.model.Success) result).getFirstPartyUserAccessToken().getTokenValue())));
                        } else {
                            if (!(result instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            t = (T) ((com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult) new com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) result).getChallengeResult()));
                        }
                        objectRef2.element = t;
                    } else if (biometricLoginState instanceof com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed) {
                        objectRef.element = (T) com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult.NotEligible.INSTANCE;
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
        return ((com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2(com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl identityLoginFlowEffectExecutorImpl, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.jvm.internal.Ref.ObjectRef<com.paypal.oslo.feature.identity.login.domain.model.SilentAuthResult> objectRef, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowEffectExecutorImpl$executeAttemptBiometric$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = identityLoginFlowEffectExecutorImpl;
        this.getHighSpeedVideoSizes = fragmentActivity;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef;
    }
}
