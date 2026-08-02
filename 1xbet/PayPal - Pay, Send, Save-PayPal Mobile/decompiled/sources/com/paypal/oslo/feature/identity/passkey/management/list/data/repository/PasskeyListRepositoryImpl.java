package com.paypal.oslo.feature.identity.passkey.management.list.data.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/data/repository/PasskeyListRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/repository/PasskeyListRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListError;", "Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyListSuccess;", "fetchPasskeys", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyListRepositoryImpl implements com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PasskeyListRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/data/repository/PasskeyListRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(2:18|(1:20)(2:21|(1:23)(2:24|25)))|15|16))|42|6|7|(0)(0)|12|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b9, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to fetch passkeys - security error", r14);
        r14 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to fetch passkeys - connection refused", r14);
        r14 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to fetch passkeys - timeout", r14);
        r14 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to fetch passkeys - cannot resolve host", r14);
        r14 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0110, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to fetch passkeys - serialization error", r14);
        r14 = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain(r14));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: SecurityException -> 0x00b8, SocketTimeoutException -> 0x00ce, ConnectException -> 0x00e4, UnknownHostException -> 0x00fa, SerializationException -> 0x0110, TryCatch #2 {SecurityException -> 0x00b8, ConnectException -> 0x00e4, SocketTimeoutException -> 0x00ce, UnknownHostException -> 0x00fa, SerializationException -> 0x0110, blocks: (B:11:0x002c, B:12:0x006e, B:14:0x0074, B:18:0x0086, B:20:0x008a, B:21:0x0098, B:23:0x009c, B:24:0x00b2, B:25:0x00b7, B:29:0x003b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: SecurityException -> 0x00b8, SocketTimeoutException -> 0x00ce, ConnectException -> 0x00e4, UnknownHostException -> 0x00fa, SerializationException -> 0x0110, TryCatch #2 {SecurityException -> 0x00b8, ConnectException -> 0x00e4, SocketTimeoutException -> 0x00ce, UnknownHostException -> 0x00fa, SerializationException -> 0x0110, blocks: (B:11:0x002c, B:12:0x006e, B:14:0x0074, B:18:0x0086, B:20:0x008a, B:21:0x0098, B:23:0x009c, B:24:0x00b2, B:25:0x00b7, B:29:0x003b), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.paypal.oslo.feature.identity.passkey.management.list.domain.repository.PasskeyListRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPasskeys(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError, com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess>> continuation) {
        com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl$fetchPasskeys$1 passkeyListRepositoryImpl$fetchPasskeys$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListError, com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyListSuccess> left;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl$fetchPasskeys$1) {
            passkeyListRepositoryImpl$fetchPasskeys$1 = (com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl$fetchPasskeys$1) continuation;
            if ((passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.graphql.PasskeyListQuery passkeyListQuery = new com.paypal.oslo.feature.identity.graphql.PasskeyListQuery();
                    com.paypal.oslo.core.network.graphql.CallConfig callConfig = new com.paypal.oslo.core.network.graphql.CallConfig(new com.paypal.oslo.core.network.graphql.AuthType.User(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("passkey_list", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), null, 2, 0 == true ? 1 : 0);
                    passkeyListRepositoryImpl$fetchPasskeys$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyListQuery);
                    passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute(this.getHighSpeedVideoFpsRangesFor, passkeyListQuery, callConfig, passkeyListRepositoryImpl$fetchPasskeys$1);
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
                    left = arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListErrorMapperKt.toDomain((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    left = com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
                } else if (ior instanceof arrow.core.Ior.Both) {
                    left = com.paypal.oslo.feature.identity.passkey.management.list.data.mapper.PasskeyListResponseMapperKt.toDomain((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Both) ior).getRightValue());
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult("passkey_list", "query", left);
                return left;
            }
        }
        passkeyListRepositoryImpl$fetchPasskeys$1 = new com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl$fetchPasskeys$1(this, continuation);
        java.lang.Object obj2 = passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = passkeyListRepositoryImpl$fetchPasskeys$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        com.paypal.oslo.feature.identity.passkey.analytics.PasskeyApiTrackerKt.logPasskeyCallResult("passkey_list", "query", left);
        return left;
    }
}
