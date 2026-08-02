package com.paypal.oslo.feature.identity.login.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthenticationChallengeResult;", "toDomain", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$OnAuthenticationChallengeResult;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthenticationChallengeResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthenticationChallengeResultMapperKt {
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthenticationChallengeResult toDomain(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAuthenticationChallengeResult, "");
        return new com.paypal.oslo.feature.identity.login.domain.model.AuthenticationChallengeResult(com.paypal.oslo.feature.identity.challenges.shared.data.mapper.AuthenticationChallengeMappersKt.toDomainChallenges(onAuthenticationChallengeResult.getChallenges()), onAuthenticationChallengeResult.getCorrelationId());
    }
}
