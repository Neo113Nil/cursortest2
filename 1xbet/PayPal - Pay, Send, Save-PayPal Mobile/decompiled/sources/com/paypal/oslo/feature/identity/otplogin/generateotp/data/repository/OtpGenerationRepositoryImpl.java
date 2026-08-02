package com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/generateotp/data/repository/OtpGenerationRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/repository/OtpGenerationRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "authenticationConfig", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;)V", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationError;", "Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationResult$Success;", "generateOTP", "(Lcom/paypal/oslo/feature/identity/otplogin/generateotp/domain/model/OtpGenerationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Ljavax/inject/Provider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpGenerationRepositoryImpl implements com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public OtpGenerationRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoFpsRanges = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7 A[Catch: all -> 0x0242, RaiseCancellationException -> 0x024b, TryCatch #2 {RaiseCancellationException -> 0x024b, all -> 0x0242, blocks: (B:11:0x0049, B:12:0x0118, B:17:0x0122, B:18:0x0140, B:20:0x0148, B:22:0x014e, B:24:0x0154, B:26:0x015a, B:27:0x0160, B:29:0x0166, B:34:0x0175, B:39:0x018b, B:40:0x0195, B:41:0x0196, B:42:0x01a0, B:45:0x012f, B:46:0x01a1, B:47:0x01a6, B:48:0x01a7, B:50:0x01b3, B:52:0x01bd, B:54:0x01c1, B:57:0x01cf, B:58:0x0233, B:59:0x023b, B:61:0x01d7, B:63:0x01db, B:64:0x01ea, B:65:0x01ef, B:66:0x01f0, B:67:0x01f5, B:69:0x01f9, B:70:0x023c, B:71:0x0241, B:75:0x005f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError] */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError] */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    @Override // com.paypal.oslo.feature.identity.otplogin.generateotp.domain.repository.OtpGenerationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateOTP(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest otpGenerationRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success>> continuation) {
        com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$generateOTP$1 otpGenerationRepositoryImpl$generateOTP$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError unknownError;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Authenticate authenticate;
        java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> challenges;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$generateOTP$1) {
                otpGenerationRepositoryImpl$generateOTP$1 = (com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$generateOTP$1) continuation;
                if ((otpGenerationRepositoryImpl$generateOTP$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                    otpGenerationRepositoryImpl$generateOTP$1.getOutputFormats -= 2147483648;
                    java.lang.Object obj = otpGenerationRepositoryImpl$generateOTP$1.getOutputMinFrameDurationlomOqCM;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = otpGenerationRepositoryImpl$generateOTP$1.getOutputFormats;
                    java.lang.String str = "";
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = null;
                    boolean z = false;
                    boolean z2 = false;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.getHighSpeedVideoFpsRanges.get();
                        com.paypal.oslo.api.graphql.schema.type.AuthenticateInput authenticateInput = new com.paypal.oslo.api.graphql.schema.type.AuthenticateInput(com.paypal.oslo.feature.identity.login.data.mapper.AuthInputMapperKt.toAuthenticationIntent(otpGenerationRequest.getIntent()), authenticationConfig.getFirstPartyClientId(), null, new com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeInput(com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.ONE_TIME_PASSWORD_GENERATE_CODE, null, null, null, null, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.OneTimePasswordGenerateCodeAuthenticationInput(otpGenerationRequest.getChallengeId(), otpGenerationRequest.getNonce())), null, null, null, null, null, null, 32510, null), null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null);
                        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.feature.identity.graphql.LoginUserMutation loginUserMutation = new com.paypal.oslo.feature.identity.graphql.LoginUserMutation(authenticateInput);
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("generate_otp", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), z2 ? 1 : 0, 2, z ? 1 : 0);
                        otpGenerationRepositoryImpl$generateOTP$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(otpGenerationRequest);
                        otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoSizesFor = defaultRaise;
                        otpGenerationRepositoryImpl$generateOTP$1.getInputSizeshNQ4ISI = defaultRaise2;
                        otpGenerationRepositoryImpl$generateOTP$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationConfig);
                        otpGenerationRepositoryImpl$generateOTP$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticateInput);
                        otpGenerationRepositoryImpl$generateOTP$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoSizes = 0;
                        otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoFpsRanges = 0;
                        otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoFpsRangesFor = 0;
                        otpGenerationRepositoryImpl$generateOTP$1.getOutputFormats = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, loginUserMutation, callConfig, otpGenerationRepositoryImpl$generateOTP$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoFpsRangesFor;
                        int i2 = otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoFpsRanges;
                        int i3 = otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoSizes;
                        int i4 = otpGenerationRepositoryImpl$generateOTP$1.getHighResolutionOutputSizeshNQ4ISI;
                        raise = (arrow.core.raise.Raise) otpGenerationRepositoryImpl$generateOTP$1.getInputSizeshNQ4ISI;
                        defaultRaise = (arrow.core.raise.DefaultRaise) otpGenerationRepositoryImpl$generateOTP$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
                            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                                unknownError = com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.NoInternet.INSTANCE;
                            } else if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                                int code = httpError.getCode();
                                java.lang.String message = httpError.getMessage();
                                if (message != null) {
                                    str = message;
                                }
                                unknownError = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.HttpError(code, str);
                            } else {
                                if (!(error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                unknownError = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError(((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error).getCause());
                            }
                        } else {
                            if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            unknownError = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.UnknownError(new java.lang.Exception("GraphQL Error: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()), "; ", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl.$r8$lambda$MUoUraSbZZ6IjDTgXjuUcFpNZyw((com.paypal.oslo.core.network.graphql.error.GraphQLError) obj2);
                                }
                            }, 30, null)))));
                        }
                        raise.raise(unknownError);
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
                        raise.raise(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.AuthenticationResultMissing.INSTANCE);
                        throw new kotlin.KotlinNothingValueException();
                    }
                    com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnAuthenticationChallengeResult onAuthenticationChallengeResult = authenticate.getOnAuthenticationChallengeResult();
                    if (onAuthenticationChallengeResult != null && (challenges = onAuthenticationChallengeResult.getChallenges()) != null) {
                        java.util.Iterator it = challenges.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge2 = ((com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge) it.next()).getOnOneTimePasswordGenerateCodeAuthenticationChallenge();
                            if (onOneTimePasswordGenerateCodeAuthenticationChallenge2 != null) {
                                onOneTimePasswordGenerateCodeAuthenticationChallenge = onOneTimePasswordGenerateCodeAuthenticationChallenge2;
                                break;
                            }
                        }
                        if (onOneTimePasswordGenerateCodeAuthenticationChallenge != null) {
                            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success success = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success("OTP sent successfully", onOneTimePasswordGenerateCodeAuthenticationChallenge.getNonce());
                            defaultRaise.complete();
                            return new arrow.core.Either.Right(success);
                        }
                    }
                    raise.raise(com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError.DataNotFound.INSTANCE);
                    throw new kotlin.KotlinNothingValueException();
                }
            }
            if (r4 != 0) {
            }
            ior = (arrow.core.Ior) obj;
            if (!(ior instanceof arrow.core.Ior.Left)) {
            }
        } catch (arrow.core.raise.RaiseCancellationException e) {
            r4.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, r4));
        } catch (java.lang.Throwable th) {
            r4.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        otpGenerationRepositoryImpl$generateOTP$1 = new com.paypal.oslo.feature.identity.otplogin.generateotp.data.repository.OtpGenerationRepositoryImpl$generateOTP$1(this, continuation);
        java.lang.Object obj2 = otpGenerationRepositoryImpl$generateOTP$1.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = otpGenerationRepositoryImpl$generateOTP$1.getOutputFormats;
        java.lang.String str2 = "";
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge3 = null;
        boolean z3 = false;
        boolean z22 = false;
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$MUoUraSbZZ6IjDTgXjuUcFpNZyw(com.paypal.oslo.core.network.graphql.error.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        return graphQLError.getMessage();
    }
}
