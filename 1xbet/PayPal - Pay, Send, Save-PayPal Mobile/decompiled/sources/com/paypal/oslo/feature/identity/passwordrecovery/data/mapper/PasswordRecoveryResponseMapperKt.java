package com.paypal.oslo.feature.identity.passwordrecovery.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/PasswordRecoveryError;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/InitiatePasswordRecoveryOutput;", "toInitiatePasswordRecoveryOutput", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/domain/model/CreatePasswordOutput;", "toCreatePasswordOutput"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasswordRecoveryResponseMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryOutput> toInitiatePasswordRecoveryOutput(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> graphQLData) {
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data = graphQLData.getData();
        if (data == null || (authenticate = data.getAuthenticate()) == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE);
        }
        if (authenticate.getOnAuthenticationChallengeResult() != null) {
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = authenticate.getOnAuthenticationChallengeResult();
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.InitiatePasswordRecoveryOutput(com.paypal.oslo.feature.identity.login.data.mapper.AuthOutputMapperKt.toChallengeResult(onAuthenticationChallengeResult, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.PASSWORD_RECOVERY), onAuthenticationChallengeResult.getCorrelationId()));
        }
        if (authenticate.getOnAuthenticationTokenResult() != null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.ServerError("Expected authentication challenges but received token"));
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE);
    }

    public static final arrow.core.Either<com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError, com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput> toCreatePasswordOutput(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data> graphQLData) {
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data = graphQLData.getData();
        if (data == null || (authenticate = data.getAuthenticate()) == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE);
        }
        if (authenticate.getOnAuthenticationTokenResult() != null) {
            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationTokenResult onAuthenticationTokenResult = authenticate.getOnAuthenticationTokenResult();
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput(new com.paypal.oslo.feature.identity.foundation.model.UserAccessToken(io.ktor.http.auth.AuthScheme.Bearer, onAuthenticationTokenResult.getToken(), onAuthenticationTokenResult.getExpiresAtTime().toString(), onAuthenticationTokenResult.getExpiresInSec(), com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE, null, null, 96, null), onAuthenticationTokenResult.getCorrelationId()));
        }
        if (authenticate.getOnAuthenticationChallengeResult() != null) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.passwordrecovery.domain.model.CreatePasswordOutput(null, authenticate.getOnAuthenticationChallengeResult().getCorrelationId()));
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passwordrecovery.domain.model.PasswordRecoveryError.UnknownError.INSTANCE);
    }
}
