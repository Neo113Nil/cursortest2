package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$attemptPasskeyLogin$1", f = "RememberedLoginViewModel.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, nl = {120}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginViewModel$attemptPasskeyLogin$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            passkeyLoginUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase.invoke$default(passkeyLoginUseCase, this.getHighResolutionOutputSizeshNQ4ISI, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either.isLeft()) {
            com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel.access$handlePasskeyError(rememberedLoginViewModel, (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError) ((arrow.core.Either.Left) either).getValue());
        }
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel2 = this.getHighSpeedVideoFpsRangesFor;
        if (either.isRight()) {
            com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = ((com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) ((arrow.core.Either.Right) either).getValue()).getLoginResult();
            if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                mutableStateFlow2 = rememberedLoginViewModel2.getInputFormats;
                com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult;
                mutableStateFlow2.setValue(new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations()));
            } else if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) {
                mutableStateFlow = rememberedLoginViewModel2.getInputFormats;
                mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult()));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$attemptPasskeyLogin$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$attemptPasskeyLogin$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedLoginViewModel$attemptPasskeyLogin$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$attemptPasskeyLogin$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = rememberedLoginViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
