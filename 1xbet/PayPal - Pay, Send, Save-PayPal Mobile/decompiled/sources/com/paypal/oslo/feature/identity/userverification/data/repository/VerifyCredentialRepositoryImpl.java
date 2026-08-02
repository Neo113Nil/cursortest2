package com.paypal.oslo.feature.identity.userverification.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B-\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/data/repository/VerifyCredentialRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/userverification/domain/repository/VerifyCredentialRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "authenticationConfig", "Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;", "authOptionCache", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;)V", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;", "verifyCredentialRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialError;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "verify", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/VerifyCredentialRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "Ljavax/inject/Provider;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerifyCredentialRepositoryImpl implements com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoSizes;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public VerifyCredentialRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider, com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache authOptionCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptionCache, "");
        this.getHighSpeedVideoFpsRanges = lazy;
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = authOptionCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020c A[Catch: all -> 0x0256, RaiseCancellationException -> 0x025f, TryCatch #2 {RaiseCancellationException -> 0x025f, all -> 0x0256, blocks: (B:11:0x004e, B:13:0x0164, B:18:0x016e, B:19:0x018c, B:21:0x0194, B:23:0x019a, B:25:0x01a0, B:27:0x01a6, B:29:0x01ac, B:31:0x01b2, B:34:0x01ba, B:35:0x01e5, B:40:0x01c6, B:41:0x01d3, B:42:0x01d8, B:43:0x01d9, B:44:0x01f0, B:45:0x01fa, B:46:0x01fb, B:47:0x0205, B:50:0x017b, B:51:0x0206, B:52:0x020b, B:53:0x020c, B:55:0x0218, B:57:0x0222, B:59:0x0226, B:61:0x022a, B:62:0x0247, B:63:0x024f, B:64:0x022f, B:65:0x0234, B:66:0x0235, B:67:0x023a, B:68:0x023f, B:70:0x0243, B:71:0x0250, B:72:0x0255, B:76:0x0069), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError] */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.identity.userverification.domain.repository.VerifyCredentialRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object verify(com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError, ? extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult>> continuation) {
        com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl$verify$1 verifyCredentialRepositoryImpl$verify$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest2;
        java.lang.Object execute;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError authenticationError;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> challenges;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions;
        com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess verifyCredentialSuccess;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl$verify$1) {
                verifyCredentialRepositoryImpl$verify$1 = (com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl$verify$1) continuation;
                if ((verifyCredentialRepositoryImpl$verify$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    verifyCredentialRepositoryImpl$verify$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = verifyCredentialRepositoryImpl$verify$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = verifyCredentialRepositoryImpl$verify$1.getOutputStallDurationlomOqCM;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.api.graphql.schema.type.AuthenticationCredentialChallengeInput graphQLInput = com.paypal.oslo.feature.identity.userverification.data.mapper.PublicCredentialMapperKt.toGraphQLInput(verifyCredentialRequest.getPublicCredential());
                        com.paypal.oslo.feature.identity.login.domain.model.GrantType grantType = com.paypal.oslo.feature.identity.userverification.data.mapper.PublicCredentialMapperKt.toGrantType(verifyCredentialRequest.getPublicCredential());
                        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.getHighSpeedVideoSizes.get();
                        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(verifyCredentialRequest.getAuthIntent()), authenticationConfig.getFirstPartyClientId(), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationGrantType(grantType)), new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.VERIFY_CREDENTIAL, null, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(graphQLInput), null, null, null, null, null, 32254, null), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
                        com.apollographql.apollo.ApolloCall addExecutionContext = this.getHighSpeedVideoFpsRanges.get().mutation(new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(authenticateInput)).addExecutionContext((com.apollographql.apollo.api.ExecutionContext) new com.paypal.oslo.core.network.graphql.IncludeRiskData(com.paypal.oslo.core.network.graphql.RiskSourceId.Identity.INSTANCE.getCredentialVerification(), null, null, 6, null));
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("verify_credential", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, false ? 1 : 0);
                        verifyCredentialRequest2 = verifyCredentialRequest;
                        verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoFpsRanges = verifyCredentialRequest2;
                        verifyCredentialRepositoryImpl$verify$1.getInputSizeshNQ4ISI = defaultRaise;
                        verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        verifyCredentialRepositoryImpl$verify$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLInput);
                        verifyCredentialRepositoryImpl$verify$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(grantType);
                        verifyCredentialRepositoryImpl$verify$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationConfig);
                        verifyCredentialRepositoryImpl$verify$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput);
                        verifyCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoSizes = 0;
                        verifyCredentialRepositoryImpl$verify$1.Camera2StreamConfigurationMap = 0;
                        verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoFpsRangesFor = 0;
                        verifyCredentialRepositoryImpl$verify$1.getOutputStallDurationlomOqCM = 1;
                        execute = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(addExecutionContext, callConfig, verifyCredentialRepositoryImpl$verify$1);
                        if (execute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = verifyCredentialRepositoryImpl$verify$1.Camera2StreamConfigurationMap;
                        int i3 = verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoSizes;
                        int i4 = verifyCredentialRepositoryImpl$verify$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) verifyCredentialRepositoryImpl$verify$1.getInputSizeshNQ4ISI;
                        com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest verifyCredentialRequest3 = (com.paypal.oslo.feature.identity.userverification.domain.model.request.VerifyCredentialRequest) verifyCredentialRepositoryImpl$verify$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        execute = obj;
                        verifyCredentialRequest2 = verifyCredentialRequest3;
                    }
                    ior = (arrow.core.Ior) execute;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                                authenticationError = com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.NetworkError.INSTANCE;
                            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                                authenticationError = com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError.INSTANCE;
                            } else {
                                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                authenticationError = com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.UnknownError.INSTANCE;
                            }
                        } else {
                            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            authenticationError = com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError.INSTANCE;
                        }
                        raise.raise(authenticationError);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue();
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.Object leftValue = ((arrow.core.Ior.Both) ior).getLeftValue();
                        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue();
                    }
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data data = (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Data) graphQLData.getData();
                    if (data == null || (authenticate = data.getAuthenticate()) == null) {
                        raise.raise(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = authenticate.getOnAuthenticationChallengeResult();
                    if (onAuthenticationChallengeResult == null || (challenges = onAuthenticationChallengeResult.getChallenges()) == null || (authOptions = com.paypal.oslo.feature.identity.userverification.data.mapper.AuthChallengeMapperKt.toAuthOptions(challenges)) == null) {
                        raise.raise(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialError.AuthenticationError.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (authOptions.isEmpty()) {
                        com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = verifyCredentialRequest2.getPublicCredential();
                        if (publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) {
                            verifyCredentialSuccess = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess(authOptions);
                        } else {
                            if (!(publicCredential instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            verifyCredentialSuccess = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired(verifyCredentialRequest2.getPublicCredential());
                        }
                    } else {
                        this.Camera2StreamConfigurationMap.syncOptions(authOptions);
                        verifyCredentialSuccess = new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess(authOptions);
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(verifyCredentialSuccess);
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) execute;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        verifyCredentialRepositoryImpl$verify$1 = new com.paypal.oslo.feature.identity.userverification.data.repository.VerifyCredentialRepositoryImpl$verify$1(this, continuation);
        java.lang.Object obj2 = verifyCredentialRepositoryImpl$verify$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = verifyCredentialRepositoryImpl$verify$1.getOutputStallDurationlomOqCM;
    }
}
