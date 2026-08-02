package com.paypal.oslo.feature.identity.challenges.shared.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateStepUpIdentityChallengeInput;", "toLoginRequest", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;", "userAccessToken", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "createTokenValidateResult", "(Lcom/paypal/oslo/feature/identity/foundation/model/UserAccessToken;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChallengeUseCaseMappersKt {
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput toLoginRequest(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeInput, "");
        java.lang.String id = validateChallengeInput.getId();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput oneTimePasscodeValidationInput = validateChallengeInput.getOneTimePasscodeValidationInput();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput(id, oneTimePasscodeValidationInput != null ? new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.OneTimePasscodeValidationInput(oneTimePasscodeValidationInput.getType(), oneTimePasscodeValidationInput.getOneTimePassword()) : null, validateChallengeInput.getSecurityQuestionValidationInput(), validateChallengeInput.getCreditCardValidationInput(), validateChallengeInput.getRememberDeviceUserConsent(), validateChallengeInput.getNonce(), validateChallengeInput.getPartialToken(), validateChallengeInput.getSilentAuthValidationInput(), validateChallengeInput.getAuthIntent());
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult createTokenValidateResult$default(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return createTokenValidateResult(userAccessToken, list);
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult createTokenValidateResult(com.paypal.oslo.feature.identity.foundation.model.UserAccessToken userAccessToken, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResultStatus.SUCCESS, false, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.COMPLETED, null, userAccessToken, list, 10, null);
    }
}
