package com.paypal.oslo.feature.identity.challenges.shared.data.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0000*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;", "toGraphQLInput", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyStepUpIdentityChallengeInput;)Lcom/paypal/oslo/api/graphql/schema/type/NotifyStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;", "toLoginRequest", "(Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyChallengeInput;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/request/NotifyStepUpIdentityChallengeInput;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "challengeResult", "Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "toDomain", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/DeliverStepUpIdentityChallengeMutation$Data;", "response", "mapDeliverResponseToDomain", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Lcom/paypal/oslo/feature/identity/challenges/shared/domain/model/response/NotifyChallengeResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotifyChallengeMappersKt {
    public static final com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput toGraphQLInput(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput notifyStepUpIdentityChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyStepUpIdentityChallengeInput, "");
        return new com.paypal.oslo.api.graphql.schema.type.NotifyStepUpIdentityChallengeInput(notifyStepUpIdentityChallengeInput.getId(), notifyStepUpIdentityChallengeInput.getChallengeId(), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toGraphQL(notifyStepUpIdentityChallengeInput.getType()), com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.Absent.INSTANCE, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(notifyStepUpIdentityChallengeInput.getNonce()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(notifyStepUpIdentityChallengeInput.getPartialToken()));
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput toLoginRequest(com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyChallengeInput notifyChallengeInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notifyChallengeInput, "");
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.request.NotifyStepUpIdentityChallengeInput(notifyChallengeInput.getId(), notifyChallengeInput.getChallengeId(), notifyChallengeInput.getType(), null, notifyChallengeInput.getNonce(), notifyChallengeInput.getPartialToken(), notifyChallengeInput.getAuthIntent());
    }

    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult toDomain(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnNotifyStepUpIdentityChallengeResult onNotifyStepUpIdentityChallengeResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticationChallengeResult, "");
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Status status = onAuthenticationChallengeResult.getStatus();
        if (status == null || (onNotifyStepUpIdentityChallengeResult = status.getOnNotifyStepUpIdentityChallengeResult()) == null) {
            return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(null, null, null, null, null, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, 95, null);
        }
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> domainChallenges = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenges(onAuthenticationChallengeResult.getChallenges());
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onNotifyStepUpIdentityChallengeResult.getNotifyChallengeResultStatus());
        java.lang.String challengeId = onNotifyStepUpIdentityChallengeResult.getChallengeId();
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod = onNotifyStepUpIdentityChallengeResult.getDeliveryMethod();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(domain, challengeId, deliveryMethod != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(deliveryMethod) : null, onNotifyStepUpIdentityChallengeResult.getDeliveryTarget(), java.lang.Boolean.valueOf(onNotifyStepUpIdentityChallengeResult.getCanRetry()), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(onNotifyStepUpIdentityChallengeResult.getStepUpStatus()), domainChallenges);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult mapDeliverResponseToDomain(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data> graphQLData) {
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.DeliverStepUpIdentityChallenge deliverStepUpIdentityChallenge;
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnPhoneOneTimePasscodeIdentityChallenge onPhoneOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.PhoneOtpChallengeFragment phoneOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnAuthenticatorAppIdentityChallenge onAuthenticatorAppIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.AuthenticatorAppChallengeFragment authenticatorAppChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnEmailOneTimePasscodeIdentityChallenge onEmailOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.EmailOtpChallengeFragment emailOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnWhatsappOneTimePasscodeIdentityChallenge onWhatsappOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.WhatsappOtpChallengeFragment whatsappOtpChallengeFragment;
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.OnTextOneTimePasscodeIdentityChallenge onTextOneTimePasscodeIdentityChallenge;
        com.paypal.oslo.feature.identity.graphql.fragment.TextOtpChallengeFragment textOtpChallengeFragment;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.Data data = graphQLData.getData();
        if (data == null || (deliverStepUpIdentityChallenge = data.getDeliverStepUpIdentityChallenge()) == null) {
            return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(null, null, null, null, null, com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.StepUpStatus.DEFAULT, null, 95, null);
        }
        java.util.List<com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge> availableChallenges = deliverStepUpIdentityChallenge.getAvailableChallenges();
        if (availableChallenges != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.identity.graphql.DeliverStepUpIdentityChallengeMutation.AvailableChallenge availableChallenge : availableChallenges) {
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
        com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResultStatus domain = com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(deliverStepUpIdentityChallenge.getNotifyChallengeResultStatus());
        java.lang.String challengeId = deliverStepUpIdentityChallenge.getChallengeId();
        com.paypal.oslo.api.graphql.schema.type.StepUpIdentityChallengeMethod deliveryMethod = deliverStepUpIdentityChallenge.getDeliveryMethod();
        return new com.paypal.oslo.feature.identity.challenges.shared.domain.model.response.NotifyChallengeResult(domain, challengeId, deliveryMethod != null ? com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(deliveryMethod) : null, deliverStepUpIdentityChallenge.getDeliveryTarget(), java.lang.Boolean.valueOf(deliverStepUpIdentityChallenge.getCanRetry()), com.paypal.oslo.feature.identity.challenges.shared.data.mapper.ChallengeStatusMappersKt.toDomain(deliverStepUpIdentityChallenge.getStepUpStatus()), arrayList);
    }
}
