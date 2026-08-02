package com.paypal.oslo.feature.identity.sso.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/repository/CodeToTokenRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/CodeToTokenRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/sso/domain/model/CodeToTokenRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeError;", "Lcom/paypal/oslo/feature/identity/api/model/CodeToTokenExchangeData;", "exchangeCodeForToken", "(Lcom/paypal/oslo/feature/identity/sso/domain/model/CodeToTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/graphql/ExchangeAuthorizationCodeForAccessTokenMutation$ExchangeAuthorizationCodeForAccessToken;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Larrow/core/Either;", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CodeToTokenRepositoryImpl implements com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CodeToTokenRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.paypal.oslo.feature.identity.sso.domain.repository.CodeToTokenRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object exchangeCodeForToken(com.paypal.oslo.feature.identity.sso.domain.model.CodeToTokenRequest codeToTokenRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError, com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData>> continuation) {
        com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl$exchangeCodeForToken$1 codeToTokenRepositoryImpl$exchangeCodeForToken$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl$exchangeCodeForToken$1) {
            codeToTokenRepositoryImpl$exchangeCodeForToken$1 = (com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl$exchangeCodeForToken$1) continuation;
            if ((codeToTokenRepositoryImpl$exchangeCodeForToken$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                codeToTokenRepositoryImpl$exchangeCodeForToken$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = codeToTokenRepositoryImpl$exchangeCodeForToken$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = codeToTokenRepositoryImpl$exchangeCodeForToken$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput exchangeAuthorizationCodeForAccessTokenInput = new com.paypal.oslo.api.graphql.schema.type.ExchangeAuthorizationCodeForAccessTokenInput(codeToTokenRequest.getClientId(), codeToTokenRequest.getAuthorizationCode(), com.paypal.oslo.feature.identity.sso.data.ApolloOptionalExtensionKt.toOptional(codeToTokenRequest.getCodeVerifier()), codeToTokenRequest.getNonce());
                    com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation exchangeAuthorizationCodeForAccessTokenMutation = new com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation(exchangeAuthorizationCodeForAccessTokenInput);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(codeToTokenRequest.getAuthenticationContext()), r4, 2, r4);
                    codeToTokenRepositoryImpl$exchangeCodeForToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(codeToTokenRequest);
                    codeToTokenRepositoryImpl$exchangeCodeForToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exchangeAuthorizationCodeForAccessTokenInput);
                    codeToTokenRepositoryImpl$exchangeCodeForToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exchangeAuthorizationCodeForAccessTokenMutation);
                    codeToTokenRepositoryImpl$exchangeCodeForToken$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, exchangeAuthorizationCodeForAccessTokenMutation, callConfig, codeToTokenRepositoryImpl$exchangeCodeForToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data data = (com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return Camera2StreamConfigurationMap(data != null ? data.getExchangeAuthorizationCodeForAccessToken() : null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data data2 = (com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    r4 = data2 != null ? data2.getExchangeAuthorizationCodeForAccessToken() : 0;
                    if (r4 != 0) {
                        return Camera2StreamConfigurationMap(r4);
                    }
                    return getHighResolutionOutputSizeshNQ4ISI(callError);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        codeToTokenRepositoryImpl$exchangeCodeForToken$1 = new com.paypal.oslo.feature.identity.sso.data.repository.CodeToTokenRepositoryImpl$exchangeCodeForToken$1(this, continuation);
        java.lang.Object obj2 = codeToTokenRepositoryImpl$exchangeCodeForToken$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = codeToTokenRepositoryImpl$exchangeCodeForToken$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError, com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData> Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.graphql.ExchangeAuthorizationCodeForAccessTokenMutation.ExchangeAuthorizationCodeForAccessToken p0) {
        if (p0 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Unknown("No response data"));
        }
        if (kotlin.text.StringsKt.isBlank(p0.getToken())) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Unknown("Empty token in response"));
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData(p0.getToken(), p0.getExpiresInSec(), p0.getExpiresAtTime().toString()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static arrow.core.Either<com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError, com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeData> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Unknown unknown;
        if (p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.NetworkError.INSTANCE);
        }
        if (!(p0 instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError = (com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) p0).m11659getErrors1X0FAY()));
        java.lang.String errorCode = graphQLError.getErrorCode();
        if (errorCode != null) {
            switch (errorCode.hashCode()) {
                case -1846053335:
                    if (errorCode.equals("CODE_TO_TOKEN_TIMEOUT")) {
                        unknown = com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Timeout.INSTANCE;
                        break;
                    }
                    break;
                case -1763306356:
                    if (errorCode.equals("CODE_TO_TOKEN_CLIENT_ERROR")) {
                        unknown = com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.ClientError.INSTANCE;
                        break;
                    }
                    break;
                case -1644373318:
                    if (errorCode.equals("CODE_TO_TOKEN_VALIDATION_ERROR")) {
                        unknown = com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.ValidationError.INSTANCE;
                        break;
                    }
                    break;
                case 306286800:
                    if (errorCode.equals("CODE_TO_TOKEN_ERROR")) {
                        unknown = com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.ServiceError.INSTANCE;
                        break;
                    }
                    break;
                case 1846991526:
                    if (errorCode.equals("CODE_TO_TOKEN_SERVICE_ERROR")) {
                        unknown = com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.ServiceError.INSTANCE;
                        break;
                    }
                    break;
            }
            return arrow.core.EitherKt.left(unknown);
        }
        unknown = new com.paypal.oslo.feature.identity.api.model.CodeToTokenExchangeError.Unknown(graphQLError.getMessage());
        return arrow.core.EitherKt.left(unknown);
    }
}
