package com.paypal.oslo.feature.identity.sso.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/repository/TokenToCodeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/sso/domain/repository/TokenToCodeRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/sso/domain/model/TokenToCodeRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "Lcom/paypal/oslo/core/identity/domain/model/SessionTransferData;", "getAuthorizationCode", "(Lcom/paypal/oslo/feature/identity/sso/domain/model/TokenToCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/graphql/ExchangeAccessTokenForAuthorizationCodeMutation$ExchangeAccessTokenForAuthorizationCode;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/identity/graphql/ExchangeAccessTokenForAuthorizationCodeMutation$ExchangeAccessTokenForAuthorizationCode;)Larrow/core/Either;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenToCodeRepositoryImpl implements com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public TokenToCodeRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.identity.sso.domain.repository.TokenToCodeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAuthorizationCode(com.paypal.oslo.feature.identity.sso.domain.model.TokenToCodeRequest tokenToCodeRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, ? extends com.paypal.oslo.core.identity.domain.model.SessionTransferData>> continuation) {
        com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl$getAuthorizationCode$1 tokenToCodeRepositoryImpl$getAuthorizationCode$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl$getAuthorizationCode$1) {
            tokenToCodeRepositoryImpl$getAuthorizationCode$1 = (com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl$getAuthorizationCode$1) continuation;
            if ((tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ExchangeAccessTokenForAuthorizationCodeInput exchangeAccessTokenForAuthorizationCodeInput = new com.paypal.oslo.api.graphql.schema.type.ExchangeAccessTokenForAuthorizationCodeInput(com.paypal.oslo.feature.identity.sso.data.ApolloOptionalExtensionKt.toOptional(tokenToCodeRequest.getRedirectUri()), null, null, null, null, null, null, null, null, tokenToCodeRequest.getIntent(), 510, null);
                    com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation exchangeAccessTokenForAuthorizationCodeMutation = new com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation(exchangeAccessTokenForAuthorizationCodeInput);
                    com.apollographql.apollo.ApolloCall addExecutionContext = this.Camera2StreamConfigurationMap.mutation(exchangeAccessTokenForAuthorizationCodeMutation).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getCodeToTokenExchange(), null, null, 6, null));
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(tokenToCodeRequest.getAuthenticationContext()), r6, 2, r6);
                    tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenToCodeRequest);
                    tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exchangeAccessTokenForAuthorizationCodeInput);
                    tokenToCodeRepositoryImpl$getAuthorizationCode$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exchangeAccessTokenForAuthorizationCodeMutation);
                    tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, tokenToCodeRepositoryImpl$getAuthorizationCode$1);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.NetworkError.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation.Data data = (com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return Camera2StreamConfigurationMap(data != null ? data.getExchangeAccessTokenForAuthorizationCode() : null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation.Data data2 = (com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return Camera2StreamConfigurationMap(data2 != null ? data2.getExchangeAccessTokenForAuthorizationCode() : 0);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        tokenToCodeRepositoryImpl$getAuthorizationCode$1 = new com.paypal.oslo.feature.identity.sso.data.repository.TokenToCodeRepositoryImpl$getAuthorizationCode$1(this, continuation);
        java.lang.Object obj2 = tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = tokenToCodeRepositoryImpl$getAuthorizationCode$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Either<com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, com.paypal.oslo.core.identity.domain.model.SessionTransferData> Camera2StreamConfigurationMap(com.paypal.oslo.feature.identity.graphql.ExchangeAccessTokenForAuthorizationCodeMutation.ExchangeAccessTokenForAuthorizationCode p0) {
        if (p0 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown("No response data"));
        }
        if (kotlin.text.StringsKt.isBlank(p0.getAuthorizationCode())) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.Unknown("No authorization code in response"));
        }
        return kotlin.text.StringsKt.isBlank(p0.getRedirectUrl().toString()) ? arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError.InvalidRedirectUri.INSTANCE) : arrow.core.EitherKt.right(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferData(p0.getRedirectUrl().toString(), p0.getAuthorizationCode()));
    }
}
