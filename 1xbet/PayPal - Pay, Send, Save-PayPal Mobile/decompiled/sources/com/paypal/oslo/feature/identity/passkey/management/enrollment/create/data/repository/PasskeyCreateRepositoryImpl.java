package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/data/repository/PasskeyCreateRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/repository/PasskeyCreateRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;", "passkeyCreateRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateSuccess;", "createPasskey", "(Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyCreateRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PasskeyCreateRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoSizes = apolloClient;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/data/repository/PasskeyCreateRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(2:18|(1:20)(2:21|(1:23)(2:24|25)))|15|16))|42|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey - security error", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey - connection refused", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey - timeout", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey - cannot resolve host", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to create passkey - serialization error", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, SerializationException -> 0x012c, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, SerializationException -> 0x012c, blocks: (B:11:0x0038, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0047), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, SerializationException -> 0x012c, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, SerializationException -> 0x012c, blocks: (B:11:0x0038, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0047), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.repository.PasskeyCreateRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createPasskey(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateRequest passkeyCreateRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl$createPasskey$1 passkeyCreateRepositoryImpl$createPasskey$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess> left;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl$createPasskey$1) {
            passkeyCreateRepositoryImpl$createPasskey$1 = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl$createPasskey$1) continuation;
            if ((passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.CreatePasskeyInput data = com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.PasskeyCreateInputBuilderKt.toData(passkeyCreateRequest);
                    com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation passkeyCreateMutation = new com.paypal.oslo.feature.identity.graphql.PasskeyCreateMutation(data);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.CREATE, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                    passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateRequest);
                    passkeyCreateRepositoryImpl$createPasskey$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                    passkeyCreateRepositoryImpl$createPasskey$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateMutation);
                    passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoSizes, passkeyCreateMutation, callConfig, passkeyCreateRepositoryImpl$createPasskey$1);
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
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateErrorMapperKt.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    left = com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    left = com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.mapper.PasskeyCreateResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.CREATE, "mutation", left);
                return left;
            }
        }
        passkeyCreateRepositoryImpl$createPasskey$1 = new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl$createPasskey$1(this, continuation);
        java.lang.Object obj2 = passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyCreateRepositoryImpl$createPasskey$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.CREATE, "mutation", left);
        return left;
    }
}
