package com.paypal.oslo.feature.onboarding.signup.swg.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/swg/data/repository/SwgCredentialRepositoryImpl;", "Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/repository/SwgCredentialRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/SwgCredentialMapper;", "swgCredentialMapper", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/SwgCredentialMapper;)V", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;", "checkToken-_dMVy3A", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkToken", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/SwgCredentialMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwgCredentialRepositoryImpl implements com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SwgCredentialRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.SwgCredentialMapper swgCredentialMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swgCredentialMapper, "");
        this.Camera2StreamConfigurationMap = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = swgCredentialMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135 A[Catch: all -> 0x014c, RaiseCancellationException -> 0x0155, TryCatch #2 {RaiseCancellationException -> 0x0155, all -> 0x014c, blocks: (B:11:0x0043, B:12:0x00a9, B:17:0x00b3, B:19:0x00c3, B:21:0x00c9, B:22:0x0115, B:25:0x00d6, B:26:0x00e5, B:29:0x00ea, B:31:0x0103, B:33:0x0109, B:34:0x0120, B:35:0x012e, B:36:0x012f, B:37:0x0134, B:38:0x0135, B:39:0x014b, B:43:0x0058), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r4v0, types: [arrow.core.raise.DefaultRaise, int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.paypal.oslo.feature.onboarding.signup.swg.domain.repository.SwgCredentialRepository
    /* renamed from: checkToken-_dMVy3A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo16427checkToken_dMVy3A(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError, com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult>> continuation) {
        com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl$checkToken$1 swgCredentialRepositoryImpl$checkToken$1;
        ?? r4;
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.Raise raise;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult swgCheckResult;
        try {
            if (continuation instanceof com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl$checkToken$1) {
                swgCredentialRepositoryImpl$checkToken$1 = (com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl$checkToken$1) continuation;
                if ((swgCredentialRepositoryImpl$checkToken$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    swgCredentialRepositoryImpl$checkToken$1.getInputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = swgCredentialRepositoryImpl$checkToken$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r4 = swgCredentialRepositoryImpl$checkToken$1.getInputSizeshNQ4ISI;
                    if (r4 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        defaultRaise = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery checkGoogleTokenQuery = new com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery(str);
                        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                        com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("onboarding_google_token_verification", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), r6, 2, r6);
                        swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        swgCredentialRepositoryImpl$checkToken$1.getInputFormats = defaultRaise;
                        swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoSizesFor = defaultRaise2;
                        swgCredentialRepositoryImpl$checkToken$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checkGoogleTokenQuery);
                        swgCredentialRepositoryImpl$checkToken$1.Camera2StreamConfigurationMap = 0;
                        swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoSizes = 0;
                        swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoFpsRangesFor = 0;
                        swgCredentialRepositoryImpl$checkToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        swgCredentialRepositoryImpl$checkToken$1.getInputSizeshNQ4ISI = 1;
                        obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, checkGoogleTokenQuery, callConfig, swgCredentialRepositoryImpl$checkToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        raise = defaultRaise2;
                    } else {
                        if (r4 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i = swgCredentialRepositoryImpl$checkToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i2 = swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoFpsRangesFor;
                        int i3 = swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoSizes;
                        int i4 = swgCredentialRepositoryImpl$checkToken$1.Camera2StreamConfigurationMap;
                        raise = (arrow.core.raise.Raise) swgCredentialRepositoryImpl$checkToken$1.getHighSpeedVideoSizesFor;
                        defaultRaise = (arrow.core.raise.DefaultRaise) swgCredentialRepositoryImpl$checkToken$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    ior = (arrow.core.Ior) obj;
                    if (!(ior instanceof arrow.core.Ior.Left)) {
                        raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                        throw new kotlin.KotlinNothingValueException();
                    }
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data data = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.PublicCredentialMetadataByToken publicCredentialMetadataByToken = data != null ? data.getPublicCredentialMetadataByToken() : null;
                        if (publicCredentialMetadataByToken != null) {
                            swgCheckResult = (com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse(publicCredentialMetadataByToken));
                        } else {
                            raise.raise(new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound("checkToken: No public credential metadata returned"));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else if (ior instanceof arrow.core.Ior.Both) {
                        com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Both) ior).getLeftValue();
                        com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data data2 = (com.paypal.oslo.feature.onboarding.graphql.CheckGoogleTokenQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue()).getData();
                        r6 = data2 != null ? data2.getPublicCredentialMetadataByToken() : 0;
                        if (r6 != 0) {
                            swgCheckResult = (com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult) raise.bind(this.getHighResolutionOutputSizeshNQ4ISI.mapResponse(r6));
                        } else {
                            raise.raise(this.getHighResolutionOutputSizeshNQ4ISI.mapToApiCallError(callError));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    defaultRaise.complete();
                    return new arrow.core.Either.Right(swgCheckResult);
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
        swgCredentialRepositoryImpl$checkToken$1 = new com.paypal.oslo.feature.onboarding.signup.swg.data.repository.SwgCredentialRepositoryImpl$checkToken$1(this, continuation);
        java.lang.Object obj2 = swgCredentialRepositoryImpl$checkToken$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = swgCredentialRepositoryImpl$checkToken$1.getInputSizeshNQ4ISI;
    }
}
