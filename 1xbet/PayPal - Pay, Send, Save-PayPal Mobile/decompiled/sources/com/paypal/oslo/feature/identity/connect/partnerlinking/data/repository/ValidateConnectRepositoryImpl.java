package com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository;

@dagger.Reusable
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/data/repository/ValidateConnectRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/repository/ValidateConnectRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectError;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectResult;", "validateConnect", "(Lcom/paypal/oslo/feature/identity/connect/partnerlinking/domain/model/ValidateConnectRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ValidateConnectRepositoryImpl implements com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ValidateConnectRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9 A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:11:0x0033, B:12:0x00ae, B:14:0x00c9, B:17:0x00e5, B:20:0x00fe, B:24:0x011b, B:26:0x011f, B:28:0x0144, B:29:0x0149, B:33:0x0043, B:36:0x005e, B:39:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011b A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:11:0x0033, B:12:0x00ae, B:14:0x00c9, B:17:0x00e5, B:20:0x00fe, B:24:0x011b, B:26:0x011f, B:28:0x0144, B:29:0x0149, B:33:0x0043, B:36:0x005e, B:39:0x0073), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.paypal.oslo.feature.identity.connect.partnerlinking.domain.repository.ValidateConnectRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object validateConnect(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectRequest validateConnectRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult>> continuation) {
        com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$validateConnect$1 validateConnectRepositoryImpl$validateConnect$1;
        int i;
        arrow.core.Either<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError, com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult> mapGraphQLResponse$identity_prodRelease;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$validateConnect$1) {
                validateConnectRepositoryImpl$validateConnect$1 = (com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$validateConnect$1) continuation;
                if ((validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.api.graphql.schema.type.ConnectType safeValueOf = com.paypal.oslo.api.graphql.schema.type.ConnectType.INSTANCE.safeValueOf(validateConnectRequest.getType());
                        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String partnerName = validateConnectRequest.getPartnerName();
                        if (partnerName.length() <= 0) {
                            partnerName = null;
                        }
                        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(partnerName);
                        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
                        java.lang.String flowContextId = validateConnectRequest.getFlowContextId();
                        if (flowContextId.length() <= 0) {
                            flowContextId = null;
                        }
                        com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput validateConnectInput = new com.paypal.oslo.api.graphql.schema.type.ValidateConnectInput(safeValueOf, null, null, null, null, null, presentIfNotNull, companion2.presentIfNotNull(flowContextId), 62, null);
                        com.apollographql.apollo.ApolloCall mutation = this.Camera2StreamConfigurationMap.get().mutation(new com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation(validateConnectInput));
                        validateConnectRepositoryImpl$validateConnect$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateConnectRequest);
                        validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(validateConnectInput);
                        validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoSizes = 1;
                        obj = mutation.execute(validateConnectRepositoryImpl$validateConnect$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.apollographql.apollo.api.ApolloResponse apolloResponse = (com.apollographql.apollo.api.ApolloResponse) obj;
                    mapGraphQLResponse$identity_prodRelease = com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.INSTANCE.mapGraphQLResponse$identity_prodRelease(new com.paypal.oslo.core.network.graphql.GraphQLData(apolloResponse.data, null, 2, null), apolloResponse.errors, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl.$r8$lambda$4Y6q4UaTsJPFSj3NsaVgNWfBgIs((com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data) obj2);
                        }
                    });
                    if (!(mapGraphQLResponse$identity_prodRelease instanceof arrow.core.Either.Right)) {
                        com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult validateConnectResult = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectResult) ((arrow.core.Either.Right) mapGraphQLResponse$identity_prodRelease).getValue();
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("hasConnectUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(validateConnectResult.getConnectUrl().length() > 0));
                        pairArr[1] = kotlin.TuplesKt.to("hasReturnUrl", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(validateConnectResult.getReturnUrl().length() > 0));
                        com.paypal.android.logger.Logger.d$default(logger, "ValidateConnect completed successfully", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        return arrow.core.EitherKt.right(validateConnectResult);
                    }
                    if (mapGraphQLResponse$identity_prodRelease instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError validateConnectError = (com.paypal.oslo.feature.identity.connect.partnerlinking.domain.model.ValidateConnectError) ((arrow.core.Either.Left) mapGraphQLResponse$identity_prodRelease).getValue();
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "ValidateConnect mapping failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", validateConnectError.toString())), null, 4, null);
                        return arrow.core.EitherKt.left(validateConnectError);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            com.apollographql.apollo.api.ApolloResponse apolloResponse2 = (com.apollographql.apollo.api.ApolloResponse) obj;
            mapGraphQLResponse$identity_prodRelease = com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.INSTANCE.mapGraphQLResponse$identity_prodRelease(new com.paypal.oslo.core.network.graphql.GraphQLData(apolloResponse2.data, null, 2, null), apolloResponse2.errors, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl.$r8$lambda$4Y6q4UaTsJPFSj3NsaVgNWfBgIs((com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data) obj2);
                }
            });
            if (!(mapGraphQLResponse$identity_prodRelease instanceof arrow.core.Either.Right)) {
            }
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "ValidateConnect mutation failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("exceptionType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName())), null, e, 4, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.INSTANCE.toDomain$identity_prodRelease(e));
        }
        validateConnectRepositoryImpl$validateConnect$1 = new com.paypal.oslo.feature.identity.connect.partnerlinking.data.repository.ValidateConnectRepositoryImpl$validateConnect$1(this, continuation);
        java.lang.Object obj2 = validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateConnectRepositoryImpl$validateConnect$1.getHighSpeedVideoSizes;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData $r8$lambda$4Y6q4UaTsJPFSj3NsaVgNWfBgIs(com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.identity.graphql.ValidateConnectMutation.ValidateConnect validateConnect = data.getValidateConnect();
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.data.mapper.ValidateConnectMapper.ValidateConnectResponseData(validateConnect.getConnectUrl().toString(), validateConnect.getReturnUrl().toString());
    }
}
