package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateStepUpIdentityChallengeInput;)Lcom/paypal/oslo/api/graphql/schema/type/ValidateStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;", "toLoginRequest", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateChallengeInput;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/ValidateStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "challengeResult", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "toValidateDomain", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/ValidateStepUpIdentityChallengeMutation$Data;", "response", "mapValidateResponseToDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/ValidateChallengeResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValidateChallengeMappersKt {
    public static final com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput toGraphQLInput(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput validateStepUpIdentityChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateStepUpIdentityChallengeInput, "");
        java.lang.String id = validateStepUpIdentityChallengeInput.getId();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.OneTimePasscodeValidationInput oneTimePasscodeValidationInput = validateStepUpIdentityChallengeInput.getOneTimePasscodeValidationInput();
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(oneTimePasscodeValidationInput != null ? new com.paypal.oslo.api.graphql.schema.type.OneTimePasscodeIdentityChallengeValidationInput(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toGraphQL(oneTimePasscodeValidationInput.getType()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(oneTimePasscodeValidationInput.getOneTimePassword())) : null);
        com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        com.apollographql.apollo.api.Optional.Absent absent2 = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput = validateStepUpIdentityChallengeInput.getSilentAuthValidationInput();
        return new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput(id, presentIfNotNull, absent, absent2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(silentAuthValidationInput != null ? new com.paypal.oslo.api.graphql.schema.type.SilentAuthenticationIdentityChallengeValidationInput(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeMappersKt.toStepUpIdentityChallengeMethod(silentAuthValidationInput.getType()), silentAuthValidationInput.getChallengeId(), silentAuthValidationInput.getVerifyId()) : null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(validateStepUpIdentityChallengeInput.getRememberDeviceUserConsent()), null, null, 192, null);
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput toLoginRequest(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateChallengeInput validateChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateChallengeInput, "");
        java.lang.String id = validateChallengeInput.getId();
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidationInput oneTimePasscodeValidationInput = validateChallengeInput.getOneTimePasscodeValidationInput();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput(id, oneTimePasscodeValidationInput != null ? new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.OneTimePasscodeValidationInput(oneTimePasscodeValidationInput.getType(), oneTimePasscodeValidationInput.getOneTimePassword()) : null, validateChallengeInput.getSecurityQuestionValidationInput(), null, validateChallengeInput.getRememberDeviceUserConsent(), validateChallengeInput.getNonce(), validateChallengeInput.getPartialToken(), validateChallengeInput.getSilentAuthValidationInput(), null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, null);
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult toValidateDomain(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnValidateStepUpIdentityChallengeResult onValidateStepUpIdentityChallengeResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticationChallengeResult, "");
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = onAuthenticationChallengeResult.getStatus();
        if (status == null || (onValidateStepUpIdentityChallengeResult = status.getOnValidateStepUpIdentityChallengeResult()) == null) {
            return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(null, false, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, null, null, 59, null);
        }
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> domainChallenges = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenges(onAuthenticationChallengeResult.getChallenges());
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus = onValidateStepUpIdentityChallengeResult.getValidationChallengeResultStatus();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(validationChallengeResultStatus != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(validationChallengeResultStatus) : null, onValidateStepUpIdentityChallengeResult.getCanRetry(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onValidateStepUpIdentityChallengeResult.getStepUpStatus()), domainChallenges, null, null, 48, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult mapValidateResponseToDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data> graphQLData) {
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.ValidateStepUpIdentityChallenge validateStepUpIdentityChallenge;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.Data data = graphQLData.getData();
        if (data == null || (validateStepUpIdentityChallenge = data.getValidateStepUpIdentityChallenge()) == null) {
            return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(null, false, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, null, null, 59, null);
        }
        java.util.List<com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges = validateStepUpIdentityChallenge.getAvailableChallenges();
        if (availableChallenges != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.identity.graphql.ValidateStepUpIdentityChallengeMutation.AvailableChallenge availableChallenge : availableChallenges) {
                java.lang.String str = availableChallenge.get__typename();
                switch (str.hashCode()) {
                    case -260078142:
                        if (str.equals(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.PHONE_OTP) && (onPhoneOneTimePasscodeIdentityChallenge = availableChallenge.getOnPhoneOneTimePasscodeIdentityChallenge()) != null && (phoneOtpChallengeFragment = onPhoneOneTimePasscodeIdentityChallenge.getPhoneOtpChallengeFragment()) != null) {
                            challenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(phoneOtpChallengeFragment);
                            break;
                        }
                        challenge = null;
                        break;
                    case -102858985:
                        if (str.equals(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.AUTHENTICATOR_APP) && (onAuthenticatorAppIdentityChallenge = availableChallenge.getOnAuthenticatorAppIdentityChallenge()) != null && (authenticatorAppChallengeFragment = onAuthenticatorAppIdentityChallenge.getAuthenticatorAppChallengeFragment()) != null) {
                            challenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(authenticatorAppChallengeFragment);
                            break;
                        }
                        challenge = null;
                        break;
                    case -51225616:
                        if (str.equals(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.EMAIL_OTP) && (onEmailOneTimePasscodeIdentityChallenge = availableChallenge.getOnEmailOneTimePasscodeIdentityChallenge()) != null && (emailOtpChallengeFragment = onEmailOneTimePasscodeIdentityChallenge.getEmailOtpChallengeFragment()) != null) {
                            challenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(emailOtpChallengeFragment);
                            break;
                        }
                        challenge = null;
                        break;
                    case 425293350:
                        if (str.equals(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.WHATSAPP_OTP) && (onWhatsappOneTimePasscodeIdentityChallenge = availableChallenge.getOnWhatsappOneTimePasscodeIdentityChallenge()) != null && (whatsappOtpChallengeFragment = onWhatsappOneTimePasscodeIdentityChallenge.getWhatsappOtpChallengeFragment()) != null) {
                            challenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(whatsappOtpChallengeFragment);
                            break;
                        }
                        challenge = null;
                        break;
                    case 1971795393:
                        if (str.equals(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeNames.TEXT_OTP) && (onTextOneTimePasscodeIdentityChallenge = availableChallenge.getOnTextOneTimePasscodeIdentityChallenge()) != null && (textOtpChallengeFragment = onTextOneTimePasscodeIdentityChallenge.getTextOtpChallengeFragment()) != null) {
                            challenge = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenge(textOtpChallengeFragment);
                            break;
                        }
                        challenge = null;
                        break;
                    default:
                        challenge = null;
                        break;
                }
                if (challenge != null) {
                    arrayList2.add(challenge);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeResultStatus validationChallengeResultStatus = validateStepUpIdentityChallenge.getValidationChallengeResultStatus();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.ValidateChallengeResult(validationChallengeResultStatus != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(validationChallengeResultStatus) : null, validateStepUpIdentityChallenge.getCanRetry(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(validateStepUpIdentityChallenge.getStepUpStatus()), arrayList, null, null, 48, null);
    }
}
