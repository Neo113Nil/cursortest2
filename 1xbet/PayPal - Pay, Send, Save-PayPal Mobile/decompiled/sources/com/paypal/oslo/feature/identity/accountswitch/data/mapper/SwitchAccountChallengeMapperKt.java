package com.paypal.oslo.feature.identity.accountswitch.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "toChallengeResult", "(Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "", "Lcom/paypal/oslo/feature/identity/graphql/SwitchAccountMutation$Challenge;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/identity/graphql/fragment/AuthenticatorAppChallengeFragment;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwitchAccountChallengeMapperKt {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult toChallengeResult(com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus authenticationChallengeStatus;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult validateChallengeResult;
        com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult notifyChallengeResult;
        com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticationChallengeResult, "");
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(onAuthenticationChallengeResult.getChallenges());
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeFlowType.SWITCH_ACCOUNT, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengePriorityStrategy.Default, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.SWITCH_ACCOUNT);
        com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status = onAuthenticationChallengeResult.getStatus();
        if ((status != null ? status.getOnNotifyStepUpIdentityChallengeResult() : null) == null) {
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status2 = onAuthenticationChallengeResult.getStatus();
            if ((status2 != null ? status2.getOnValidateStepUpIdentityChallengeResult() : null) != null) {
                com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status3 = onAuthenticationChallengeResult.getStatus();
                if (status3 == null || (onValidateStepUpIdentityChallengeResult = status3.getOnValidateStepUpIdentityChallengeResult()) == null) {
                    validateChallengeResult = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(null, false, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, null, null, 59, null);
                } else {
                    com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus = onValidateStepUpIdentityChallengeResult.getValidationChallengeResultStatus();
                    validateChallengeResult = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(validationChallengeResultStatus != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(validationChallengeResultStatus) : null, onValidateStepUpIdentityChallengeResult.getCanRetry(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onValidateStepUpIdentityChallengeResult.getStepUpStatus()), getHighResolutionOutputSizeshNQ4ISI(onAuthenticationChallengeResult.getChallenges()), null, null, 48, null);
                }
                authenticationChallengeStatus = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Validate(validateChallengeResult);
            } else {
                authenticationChallengeStatus = null;
            }
        } else {
            com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Status status4 = onAuthenticationChallengeResult.getStatus();
            if (status4 == null || (onNotifyStepUpIdentityChallengeResult = status4.getOnNotifyStepUpIdentityChallengeResult()) == null) {
                notifyChallengeResult = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(null, null, null, null, null, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, 95, null);
            } else {
                com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onNotifyStepUpIdentityChallengeResult.getNotifyChallengeResultStatus());
                java.lang.String challengeId = onNotifyStepUpIdentityChallengeResult.getChallengeId();
                com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod = onNotifyStepUpIdentityChallengeResult.getDeliveryMethod();
                notifyChallengeResult = new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(domain, challengeId, deliveryMethod != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(deliveryMethod) : null, onNotifyStepUpIdentityChallengeResult.getDeliveryTarget(), java.lang.Boolean.valueOf(onNotifyStepUpIdentityChallengeResult.getCanRetry()), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onNotifyStepUpIdentityChallengeResult.getStepUpStatus()), getHighResolutionOutputSizeshNQ4ISI(onAuthenticationChallengeResult.getChallenges()));
            }
            authenticationChallengeStatus = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticationChallengeStatus.Notify(notifyChallengeResult);
        }
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(highResolutionOutputSizeshNQ4ISI, challengeContext, authenticationChallengeStatus, null, 8, null);
    }

    private static final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> getHighResolutionOutputSizeshNQ4ISI(java.util.List<com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge> list) {
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge domainChallenge;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.identity.graphql.SwitchAccountMutation.Challenge challenge : list) {
            if (challenge.getOnTextOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(challenge.getOnTextOneTimePasscodeIdentityChallenge().getTextOtpChallengeFragment());
            } else if (challenge.getOnEmailOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(challenge.getOnEmailOneTimePasscodeIdentityChallenge().getEmailOtpChallengeFragment());
            } else if (challenge.getOnWhatsappOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(challenge.getOnWhatsappOneTimePasscodeIdentityChallenge().getWhatsappOtpChallengeFragment());
            } else if (challenge.getOnPhoneOneTimePasscodeIdentityChallenge() != null) {
                domainChallenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(challenge.getOnPhoneOneTimePasscodeIdentityChallenge().getPhoneOtpChallengeFragment());
            } else if (challenge.getOnAuthenticatorAppIdentityChallenge() != null) {
                domainChallenge = getHighSpeedVideoFpsRanges(challenge.getOnAuthenticatorAppIdentityChallenge().getAuthenticatorAppChallengeFragment());
            } else {
                domainChallenge = challenge.getOnSecurityQuestionIdentityChallenge() != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(challenge.getOnSecurityQuestionIdentityChallenge().getSecurityQuestionChallengeFragment()) : null;
            }
            if (domainChallenge != null) {
                arrayList.add(domainChallenge);
            }
        }
        return arrayList;
    }

    private static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment) {
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.AuthenticatorAppChallenge(authenticatorAppChallengeFragment.getId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(authenticatorAppChallengeFragment.getChallengeMethod()), true, authenticatorAppChallengeFragment.getStepUpNonce(), authenticatorAppChallengeFragment.getStepUpPartialToken());
    }
}
