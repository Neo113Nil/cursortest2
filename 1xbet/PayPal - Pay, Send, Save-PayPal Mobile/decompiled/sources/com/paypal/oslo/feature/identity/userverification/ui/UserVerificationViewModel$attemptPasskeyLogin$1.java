package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$attemptPasskeyLogin$1", f = "UserVerificationViewModel.kt", i = {1, 1, 1, 1, 1, 1}, l = {640, 649}, m = "invokeSuspend", n = {"this_$iv", "it$iv", "result", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UserVerificationViewModel$attemptPasskeyLogin$1$2"}, nl = {644, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, s = {"L$0", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$attemptPasskeyLogin$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r8 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.PasskeyLoginUseCase passkeyLoginUseCase;
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel;
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.usecase.SavePasskeyCredentialsUseCase savePasskeyCredentialsUseCase;
        com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess;
        com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDurationlomOqCM;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            passkeyLoginUseCase = this.getOutputStallDurationlomOqCM.getOutputFormats;
            this.getOutputMinFrameDurationlomOqCM = 1;
            obj = passkeyLoginUseCase.invoke(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                passkeyLoginSuccess = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) this.getOutputFormats;
                userVerificationViewModel = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel) this.getInputFormats;
                kotlin.ResultKt.throwOnFailure(obj);
                loginResult = passkeyLoginSuccess.getLoginResult();
                if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success)) {
                    mutableStateFlow2 = userVerificationViewModel.coroutineCreation;
                    com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult;
                    mutableStateFlow2.setValue(new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.Success(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations()));
                } else if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) {
                    mutableStateFlow = userVerificationViewModel.coroutineCreation;
                    mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.passkey.login.auth.ui.PasskeyLoginState.ChallengeRequired(((com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult).getChallengeResult()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel2 = this.getOutputStallDurationlomOqCM;
        if (either.isLeft()) {
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$handlePasskeyError(userVerificationViewModel2, (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginError) ((arrow.core.Either.Left) either).getValue());
        }
        userVerificationViewModel = this.getOutputStallDurationlomOqCM;
        if (either.isRight()) {
            com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess passkeyLoginSuccess2 = (com.paypal.oslo.feature.identity.passkey.login.auth.domain.model.PasskeyLoginSuccess) ((arrow.core.Either.Right) either).getValue();
            savePasskeyCredentialsUseCase = userVerificationViewModel.getInputFormats;
            com.paypal.oslo.feature.identity.passkey.login.assertion.domain.model.PasskeyAssertionSuccess assertion = passkeyLoginSuccess2.getAssertion();
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = userVerificationViewModel;
            this.getOutputMinFrameDuration = either;
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputFormats = passkeyLoginSuccess2;
            this.getHighSpeedVideoSizes = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getOutputMinFrameDurationlomOqCM = 2;
            if (savePasskeyCredentialsUseCase.invoke(assertion, this) != coroutine_suspended) {
                passkeyLoginSuccess = passkeyLoginSuccess2;
                loginResult = passkeyLoginSuccess.getLoginResult();
                if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success)) {
                }
            }
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$attemptPasskeyLogin$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$attemptPasskeyLogin$1(this.getOutputStallDurationlomOqCM, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$attemptPasskeyLogin$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, android.content.Context context, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$attemptPasskeyLogin$1> continuation) {
        super(2, continuation);
        this.getOutputStallDurationlomOqCM = userVerificationViewModel;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = authIntent;
    }
}
