package com.paypal.oslo.feature.identity.challenges.shared.data;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "validateChallengeInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ValidateChallengeInputBuilderKt {
    /* renamed from: $r8$lambda$StR8TG4stodk4CSetJj95q-LRak, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult m15040$r8$lambda$StR8TG4stodk4CSetJj95qLRak(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest) {
        com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput securityQuestionIdentityChallengeValidationInput;
        com.apollographql.apollo.api.Optional.Present present;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput validateStepUpIdentityChallengeInput = loginRequest instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput ? (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.ValidateStepUpIdentityChallengeInput) loginRequest : null;
        if (validateStepUpIdentityChallengeInput == null) {
            return null;
        }
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.OneTimePasscodeValidationInput oneTimePasscodeValidationInput = validateStepUpIdentityChallengeInput.getOneTimePasscodeValidationInput();
        com.paypal.oslo.api.graphql.schema.type.OneTimePasscodeIdentityChallengeValidationInput oneTimePasscodeIdentityChallengeValidationInput = oneTimePasscodeValidationInput != null ? new com.paypal.oslo.api.graphql.schema.type.OneTimePasscodeIdentityChallengeValidationInput(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeMappersKt.toStepUpIdentityChallengeMethod(oneTimePasscodeValidationInput.getType()), com.apollographql.apollo.api.Optional.INSTANCE.present(oneTimePasscodeValidationInput.getOneTimePassword())) : null;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionValidationInput securityQuestionValidationInput = validateStepUpIdentityChallengeInput.getSecurityQuestionValidationInput();
        if (securityQuestionValidationInput != null) {
            com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.SECURITY_QUESTIONS;
            java.util.List<com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionAnswer> answers = securityQuestionValidationInput.getAnswers();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(answers, 10));
            for (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SecurityQuestionAnswer securityQuestionAnswer : answers) {
                arrayList.add(new com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeAnswerInput(securityQuestionAnswer.getQuestionId(), securityQuestionAnswer.getAnswer()));
            }
            securityQuestionIdentityChallengeValidationInput = new com.paypal.oslo.api.graphql.schema.type.SecurityQuestionIdentityChallengeValidationInput(stepUpIdentityChallengeMethod, arrayList);
        } else {
            securityQuestionIdentityChallengeValidationInput = null;
        }
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.CreditCardValidationInput creditCardValidationInput = validateStepUpIdentityChallengeInput.getCreditCardValidationInput();
        com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput creditCardIdentityChallengeValidationInput = creditCardValidationInput != null ? new com.paypal.oslo.api.graphql.schema.type.CreditCardIdentityChallengeValidationInput(com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod.CREDIT_CARD, creditCardValidationInput.getChallengeId(), creditCardValidationInput.getCardNumber(), null, 8, null) : null;
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.SilentAuthValidationInput silentAuthValidationInput = validateStepUpIdentityChallengeInput.getSilentAuthValidationInput();
        com.paypal.oslo.api.graphql.schema.type.SilentAuthenticationIdentityChallengeValidationInput silentAuthenticationIdentityChallengeValidationInput = silentAuthValidationInput != null ? new com.paypal.oslo.api.graphql.schema.type.SilentAuthenticationIdentityChallengeValidationInput(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeMappersKt.toStepUpIdentityChallengeMethod(silentAuthValidationInput.getType()), silentAuthValidationInput.getChallengeId(), silentAuthValidationInput.getVerifyId()) : null;
        java.lang.String id = validateStepUpIdentityChallengeInput.getId();
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(oneTimePasscodeIdentityChallengeValidationInput);
        com.apollographql.apollo.api.Optional.Present present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(securityQuestionIdentityChallengeValidationInput);
        com.apollographql.apollo.api.Optional.Present present4 = com.apollographql.apollo.api.Optional.INSTANCE.present(creditCardIdentityChallengeValidationInput);
        com.apollographql.apollo.api.Optional.Present present5 = com.apollographql.apollo.api.Optional.INSTANCE.present(silentAuthenticationIdentityChallengeValidationInput);
        com.apollographql.apollo.api.Optional.Absent absent = com.apollographql.apollo.api.Optional.Absent.INSTANCE;
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String nonce = validateStepUpIdentityChallengeInput.getNonce();
        if (nonce == null) {
            throw new java.lang.IllegalArgumentException("Nonce is required for step-up validation".toString());
        }
        com.apollographql.apollo.api.Optional.Present present6 = companion.present(nonce);
        java.lang.String partialToken = validateStepUpIdentityChallengeInput.getPartialToken();
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(null, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VALIDATE_STEP_UP, null, null, null, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.ValidateStepUpIdentityChallengeInput(id, present2, present3, present4, present5, absent, present6, (partialToken == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(partialToken)) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present)), null, null, 28670, null));
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> validateChallengeInputBuilder() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.shared.data.ValidateChallengeInputBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.challenges.shared.data.ValidateChallengeInputBuilderKt.m15040$r8$lambda$StR8TG4stodk4CSetJj95qLRak((com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) obj);
            }
        };
    }
}
