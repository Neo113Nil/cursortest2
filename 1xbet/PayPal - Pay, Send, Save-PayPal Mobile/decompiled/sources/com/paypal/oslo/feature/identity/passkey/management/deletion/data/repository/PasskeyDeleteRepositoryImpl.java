package com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/deletion/data/repository/PasskeyDeleteRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/repository/PasskeyDeleteRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteRequest;", "passkeyDeleteRequest", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteError;", "Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteSuccess;", "deletePasskey", "(Lcom/paypal/oslo/feature/identity/passkey/management/deletion/domain/model/PasskeyDeleteRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyDeleteRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository {
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PasskeyDeleteRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/deletion/data/repository/PasskeyDeleteRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
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
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to delete passkey - security error", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to delete passkey - connection refused", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to delete passkey - timeout", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to delete passkey - cannot resolve host", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to delete passkey - serialization error", r0);
        r0 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, SerializationException -> 0x012c, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, SerializationException -> 0x012c, blocks: (B:11:0x0038, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0047), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2 A[Catch: SecurityException -> 0x00d4, SocketTimeoutException -> 0x00ea, ConnectException -> 0x0100, UnknownHostException -> 0x0116, SerializationException -> 0x012c, TryCatch #2 {SecurityException -> 0x00d4, ConnectException -> 0x0100, SocketTimeoutException -> 0x00ea, UnknownHostException -> 0x0116, SerializationException -> 0x012c, blocks: (B:11:0x0038, B:12:0x008a, B:14:0x0090, B:18:0x00a2, B:20:0x00a6, B:21:0x00b4, B:23:0x00b8, B:24:0x00ce, B:25:0x00d3, B:29:0x0047), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.paypal.oslo.feature.identity.passkey.management.deletion.domain.repository.PasskeyDeleteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deletePasskey(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteRequest passkeyDeleteRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError, com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl$deletePasskey$1 passkeyDeleteRepositoryImpl$deletePasskey$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteError, com.paypal.oslo.feature.identity.passkey.management.deletion.domain.model.PasskeyDeleteSuccess> left;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl$deletePasskey$1) {
            passkeyDeleteRepositoryImpl$deletePasskey$1 = (com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl$deletePasskey$1) continuation;
            if ((passkeyDeleteRepositoryImpl$deletePasskey$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                passkeyDeleteRepositoryImpl$deletePasskey$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = passkeyDeleteRepositoryImpl$deletePasskey$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyDeleteRepositoryImpl$deletePasskey$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput data = com.paypal.oslo.feature.identity.passkey.management.deletion.data.PasskeyDeleteInputBuilderKt.toData(passkeyDeleteRequest);
                    com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation passkeyDeleteMutation = new com.paypal.oslo.feature.identity.graphql.PasskeyDeleteMutation(data);
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.DELETE, (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                    passkeyDeleteRepositoryImpl$deletePasskey$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyDeleteRequest);
                    passkeyDeleteRepositoryImpl$deletePasskey$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                    passkeyDeleteRepositoryImpl$deletePasskey$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyDeleteMutation);
                    passkeyDeleteRepositoryImpl$deletePasskey$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRanges, passkeyDeleteMutation, callConfig, passkeyDeleteRepositoryImpl$deletePasskey$1);
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
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteErrorMapperKt.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    left = com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    left = com.paypal.oslo.feature.identity.passkey.management.deletion.data.mapper.PasskeyDeleteResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.DELETE, "mutation", left);
                return left;
            }
        }
        passkeyDeleteRepositoryImpl$deletePasskey$1 = new com.paypal.oslo.feature.identity.passkey.management.deletion.data.repository.PasskeyDeleteRepositoryImpl$deletePasskey$1(this, continuation);
        java.lang.Object obj2 = passkeyDeleteRepositoryImpl$deletePasskey$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyDeleteRepositoryImpl$deletePasskey$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiName.DELETE, "mutation", left);
        return left;
    }
}
