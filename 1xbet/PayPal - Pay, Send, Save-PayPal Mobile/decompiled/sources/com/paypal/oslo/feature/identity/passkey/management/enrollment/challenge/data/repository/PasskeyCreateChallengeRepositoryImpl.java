package com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/data/repository/PasskeyCreateChallengeRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/repository/PasskeyCreateChallengeRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;", "passkeyCreateChallengeRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyEnrollmentOptionResult;", "getPasskeyEnrollmentOption", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/challenge/domain/model/PasskeyCreateChallengeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyCreateChallengeRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public PasskeyCreateChallengeRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(2:18|(1:20)(2:21|(1:23)(2:24|25)))|15|16))|40|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey enrollment option - security error", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey enrollment option - connection refused", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey enrollment option - timeout", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get passkey enrollment option - cannot resolve host", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, blocks: (B:11:0x0036, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0045), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, blocks: (B:11:0x0036, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0045), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.repository.PasskeyCreateChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPasskeyEnrollmentOption(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeRequest passkeyCreateChallengeRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError, ? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1 passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyCreateChallengeError, com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.domain.model.PasskeyEnrollmentOptionResult> left;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1) {
            passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1) continuation;
            if ((passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput data = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.PasskeyCreateChallengeInputBuilderKt.toData(passkeyCreateChallengeRequest);
                    com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation passkeyCreateChallengeContextMutation = new com.paypal.oslo.feature.identity.graphql.PasskeyCreateChallengeContextMutation(data);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("passkey_registration_option", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                    passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeRequest);
                    passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                    passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateChallengeContextMutation);
                    passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.Camera2StreamConfigurationMap, passkeyCreateChallengeContextMutation, callConfig, passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1);
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
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeErrorMapperKt.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    left = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    left = com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.mapper.PasskeyCreateChallengeResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.CREATE_CHALLENGE, "mutation", left);
                return left;
            }
        }
        passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.challenge.data.repository.PasskeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateChallengeRepositoryImpl$getPasskeyEnrollmentOption$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.CREATE_CHALLENGE, "mutation", left);
        return left;
    }
}
