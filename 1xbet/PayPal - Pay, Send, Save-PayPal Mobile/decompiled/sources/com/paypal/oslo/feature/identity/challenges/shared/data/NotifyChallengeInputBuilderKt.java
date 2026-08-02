package com.paypal.oslo.feature.identity.challenges.shared.data;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/identity/login/domain/model/LoginRequest;", "Lcom/paypal/oslo/feature/identity/login/data/BuilderResult;", "Lcom/paypal/oslo/feature/identity/login/data/InputBuilder;", "notifyChallengeInputBuilder", "()Lkotlin/jvm/functions/Function1;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotifyChallengeInputBuilderKt {
    public static /* synthetic */ com.paypal.oslo.feature.identity.login.data.BuilderResult $r8$lambda$xaCkT2zvDifQce2kC02RrEQ9_8o(com.paypal.oslo.feature.identity.login.domain.model.LoginRequest loginRequest) {
        com.apollographql.apollo.api.Optional.Present present;
        com.apollographql.apollo.api.Optional.Present present2;
        com.apollographql.apollo.api.Optional.Present present3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loginRequest, "");
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput = loginRequest instanceof com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput ? (com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput) loginRequest : null;
        if (notifyStepUpIdentityChallengeInput == null) {
            return null;
        }
        java.lang.String id = notifyStepUpIdentityChallengeInput.getId();
        java.lang.String challengeId = notifyStepUpIdentityChallengeInput.getChallengeId();
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod stepUpIdentityChallengeMethod = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeTypeMappersKt.toStepUpIdentityChallengeMethod(notifyStepUpIdentityChallengeInput.getType());
        java.lang.String deliveryTarget = notifyStepUpIdentityChallengeInput.getDeliveryTarget();
        com.apollographql.apollo.api.Optional optional = (deliveryTarget == null || (present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(deliveryTarget)) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present3;
        java.lang.String nonce = notifyStepUpIdentityChallengeInput.getNonce();
        com.apollographql.apollo.api.Optional optional2 = (nonce == null || (present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(nonce)) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present2;
        java.lang.String partialToken = notifyStepUpIdentityChallengeInput.getPartialToken();
        return new com.paypal.oslo.feature.identity.login.data.BuilderResult(null, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.NOTIFY_STEP_UP, null, null, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput(id, challengeId, stepUpIdentityChallengeMethod, optional, null, optional2, (partialToken == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(partialToken)) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present, 16, null)), null, null, null, 30718, null));
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.identity.login.domain.model.LoginRequest, com.paypal.oslo.feature.identity.login.data.BuilderResult> notifyChallengeInputBuilder() {
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.shared.data.NotifyChallengeInputBuilderKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.challenges.shared.data.NotifyChallengeInputBuilderKt.$r8$lambda$xaCkT2zvDifQce2kC02RrEQ9_8o((com.paypal.oslo.feature.identity.login.domain.model.LoginRequest) obj);
            }
        };
    }
}
