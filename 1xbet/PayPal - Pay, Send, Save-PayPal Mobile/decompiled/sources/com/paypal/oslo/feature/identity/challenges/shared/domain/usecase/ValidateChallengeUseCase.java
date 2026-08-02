package com.paypal.oslo.feature.identity.challenges.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeUseCase;", "", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "loginUseCase", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeBaseUseCase;", "validateChallengeBaseUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeBaseUseCase;)V", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "input", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/error/ChallengeError;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeFlowType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/login/domain/usecase/LoginUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/usecase/ValidateChallengeBaseUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateChallengeUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ValidateChallengeUseCase(com.paypal.oslo.feature.identity.login.domain.usecase.LoginUseCase loginUseCase, com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeBaseUseCase validateChallengeBaseUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeBaseUseCase, "");
        this.getHighSpeedVideoFpsRanges = loginUseCase;
        this.getHighSpeedVideoFpsRangesFor = validateChallengeBaseUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase$processLoginFlow$1 validateChallengeUseCase$processLoginFlow$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult result;
        if (continuation instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase$processLoginFlow$1) {
            validateChallengeUseCase$processLoginFlow$1 = (com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase$processLoginFlow$1) continuation;
            if ((validateChallengeUseCase$processLoginFlow$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                validateChallengeUseCase$processLoginFlow$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = validateChallengeUseCase$processLoginFlow$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateChallengeUseCase$processLoginFlow$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput loginRequest = com.paypal.oslo.feature.identity.challenges.shared.domain.mapper.ChallengeUseCaseMappersKt.toLoginRequest(validateChallengeInput);
                    validateChallengeUseCase$processLoginFlow$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateChallengeInput);
                    validateChallengeUseCase$processLoginFlow$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginRequest);
                    validateChallengeUseCase$processLoginFlow$1.Camera2StreamConfigurationMap = 1;
                    obj = this.getHighSpeedVideoFpsRanges.invoke(loginRequest, validateChallengeUseCase$processLoginFlow$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left(new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.AuthenticationError(((com.paypal.oslo.feature.identity.login.domain.model.LoginError) ((arrow.core.Either.Left) either).getValue()).toString()));
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.login.domain.model.LoginResult loginResult = (com.paypal.oslo.feature.identity.login.domain.model.LoginResult) ((arrow.core.Either.Right) right).getValue();
                    if (loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.Success) {
                        com.paypal.oslo.feature.identity.login.domain.model.Success success = (com.paypal.oslo.feature.identity.login.domain.model.Success) loginResult;
                        result = com.paypal.oslo.feature.identity.challenges.shared.domain.mapper.ChallengeUseCaseMappersKt.createTokenValidateResult(success.getFirstPartyUserAccessToken(), success.getPostAuthOperations());
                    } else {
                        if (!(loginResult instanceof com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired challengeRequired = (com.paypal.oslo.feature.identity.login.domain.model.ChallengeRequired) loginResult;
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus status = challengeRequired.getChallengeResult().getStatus();
                        com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate validate = status instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate ? (com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate) status : null;
                        if (validate == null) {
                            throw new java.lang.IllegalArgumentException("Expected AuthenticationChallengeStatus.Validate but got ".concat(java.lang.String.valueOf(challengeRequired.getChallengeResult().getStatus())).toString());
                        }
                        result = validate.getResult();
                    }
                    return new arrow.core.Either.Right(result);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        validateChallengeUseCase$processLoginFlow$1 = new com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase$processLoginFlow$1(this, continuation);
        java.lang.Object obj2 = validateChallengeUseCase$processLoginFlow$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateChallengeUseCase$processLoginFlow$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType challengeFlowType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ChallengeError, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ValidationError validationError = kotlin.text.StringsKt.isBlank(validateChallengeInput.getId()) ? new com.paypal.oslo.feature.identity.challenges.shared.domain.model.error.ValidationError("Challenge id cannot be blank") : null;
        if (validationError != null) {
            return arrow.core.EitherKt.left(validationError);
        }
        int i = com.paypal.oslo.feature.identity.challenges.shared.domain.usecase.ValidateChallengeUseCase.WhenMappings.$EnumSwitchMapping$0[challengeFlowType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return getHighSpeedVideoFpsRangesFor(validateChallengeInput, continuation);
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return this.getHighSpeedVideoFpsRangesFor.invoke(validateChallengeInput, continuation);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.SWITCH_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.PASSWORD_RESET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.TRANSACTION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
