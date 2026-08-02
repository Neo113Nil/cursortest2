package com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/data/repository/PasskeyLoginChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/repository/PasskeyLoginChallengeRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/AuthenticationConfig;", "config", "<init>", "(Ldagger/Lazy;Ljavax/inject/Provider;)V", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;", "challengeRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeError;", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeResult;", "generateChallenge", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyLoginChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljavax/inject/Provider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyLoginChallengeRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PasskeyLoginChallengeRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, javax.inject.Provider<com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoSizes = provider;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(2:18|(1:20)(2:21|(1:23)(2:24|25)))|15|16))|40|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to generate passkey login challenge - security error", r13);
        r13 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt.toDomain(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to generate passkey login challenge - connection refused", r13);
        r13 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt.toDomain(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f9, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fa, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to generate passkey login challenge - timeout", r13);
        r13 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt.toDomain(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to generate passkey login challenge - cannot resolve host", r13);
        r13 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt.toDomain(r13));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: SecurityException -> 0x00e3, SocketTimeoutException -> 0x00f9, ConnectException -> 0x010f, UnknownHostException -> 0x0125, TryCatch #2 {SecurityException -> 0x00e3, ConnectException -> 0x010f, SocketTimeoutException -> 0x00f9, UnknownHostException -> 0x0125, blocks: (B:11:0x0034, B:12:0x0091, B:14:0x0097, B:18:0x00a9, B:20:0x00ad, B:21:0x00bf, B:23:0x00c3, B:24:0x00dd, B:25:0x00e2, B:29:0x0043), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9 A[Catch: SecurityException -> 0x00e3, SocketTimeoutException -> 0x00f9, ConnectException -> 0x010f, UnknownHostException -> 0x0125, TryCatch #2 {SecurityException -> 0x00e3, ConnectException -> 0x010f, SocketTimeoutException -> 0x00f9, UnknownHostException -> 0x0125, blocks: (B:11:0x0034, B:12:0x0091, B:14:0x0097, B:18:0x00a9, B:20:0x00ad, B:21:0x00bf, B:23:0x00c3, B:24:0x00dd, B:25:0x00e2, B:29:0x0043), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.paypal.oslo.feature.identity.passkey.login.challenge.domain.repository.PasskeyLoginChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object generateChallenge(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest passkeyLoginChallengeRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError, ? extends com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult>> continuation) {
        com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl$generateChallenge$1 passkeyLoginChallengeRepositoryImpl$generateChallenge$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeError, com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeResult> left;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl$generateChallenge$1) {
            passkeyLoginChallengeRepositoryImpl$generateChallenge$1 = (com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl$generateChallenge$1) continuation;
            if ((passkeyLoginChallengeRepositoryImpl$generateChallenge$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                passkeyLoginChallengeRepositoryImpl$generateChallenge$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyLoginChallengeRepositoryImpl$generateChallenge$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.shared.domain.model.AuthenticationConfig authenticationConfig = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(authenticationConfig, "");
                    com.paypal.oslo.api.graphql.schema.type.AuthenticateInput buildPasskeyLoginChallengeInput = com.paypal.oslo.feature.identity.passkey.login.challenge.data.PasskeyLoginChallengeInputBuilderKt.buildPasskeyLoginChallengeInput(passkeyLoginChallengeRequest, authenticationConfig);
                    com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation passkeyLoginChallengeContextMutation = new com.paypal.oslo.feature.identity.graphql.PasskeyLoginChallengeContextMutation(buildPasskeyLoginChallengeInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.Client(new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("login", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null, 2, 0 == true ? 1 : 0);
                    passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighSpeedVideoFpsRangesFor = passkeyLoginChallengeRequest;
                    passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildPasskeyLoginChallengeInput);
                    passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyLoginChallengeContextMutation);
                    passkeyLoginChallengeRepositoryImpl$generateChallenge$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(apolloClient, passkeyLoginChallengeContextMutation, callConfig, passkeyLoginChallengeRepositoryImpl$generateChallenge$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    passkeyLoginChallengeRequest = (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyLoginChallengeRequest) passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeErrorMapperKt.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    left = com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue(), passkeyLoginChallengeRequest.getChallenge());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    left = com.paypal.oslo.feature.identity.passkey.login.challenge.data.mapper.PasskeyLoginChallengeResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue(), passkeyLoginChallengeRequest.getChallenge());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.LOGIN_CHALLENGE, "mutation", left);
                return left;
            }
        }
        passkeyLoginChallengeRepositoryImpl$generateChallenge$1 = new com.paypal.oslo.feature.identity.passkey.login.challenge.data.repository.PasskeyLoginChallengeRepositoryImpl$generateChallenge$1(this, continuation);
        java.lang.Object obj2 = passkeyLoginChallengeRepositoryImpl$generateChallenge$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyLoginChallengeRepositoryImpl$generateChallenge$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.LOGIN_CHALLENGE, "mutation", left);
        return left;
    }
}
