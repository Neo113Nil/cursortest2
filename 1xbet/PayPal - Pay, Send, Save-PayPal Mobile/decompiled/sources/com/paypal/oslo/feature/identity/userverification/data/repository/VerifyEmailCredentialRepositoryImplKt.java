package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyEmailCredentialRepositoryImplKt {
    public static final /* synthetic */ java.lang.String access$toEmail(com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest) {
        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = verifyCredentialRequest.getPublicCredential();
        if (publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(((com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) publicCredential).getEmail());
        }
        throw new java.lang.IllegalArgumentException("Unsupported credential type for email verification");
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError access$toVerifyCredentialError(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError emailCheckError) {
        if (emailCheckError instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.NetworkError) {
            return com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.NetworkError.INSTANCE;
        }
        if (emailCheckError instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired) {
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.EmailConfirmationRequired(new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential(((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired) emailCheckError).m15866getEmailBvNjjI(), null, 2, null));
        }
        return com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.UnknownError.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult access$toVerifyCredentialResult(com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess emailCheckSuccess) {
        if (emailCheckSuccess instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.ExistingAccount) {
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess(kotlin.collections.CollectionsKt.emptyList());
        }
        if (emailCheckSuccess instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.AvailableForSignup) {
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp(new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential(((com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.AvailableForSignup) emailCheckSuccess).m15870getEmailBvNjjI(), null, 2, null));
        }
        if (!(emailCheckSuccess instanceof com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.SuggestedCorrection)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.SuggestedCorrection suggestedCorrection = (com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.SuggestedCorrection) emailCheckSuccess;
        return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection(suggestedCorrection.m15879getEmailBvNjjI(), suggestedCorrection.m15880getSuggestedEmailBvNjjI());
    }
}
