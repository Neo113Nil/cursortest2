package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/CommerceItemRepositoryImpl;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/CommerceItemRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "", "commerceItemId", "sessionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/error/GetCommerceItemVariantsError;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "getVariants", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/searchandintelligence/graphql/GetCommerceItemVariantsQuery$AgenticCommerceItemVariant;", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/util/List;)Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CommerceItemRepositoryImpl implements com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository {

    @java.lang.Deprecated
    public static final java.lang.String OPERATION_NAME = "getCommerceItemVariants";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;
    private static final com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CommerceItemRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.CommerceItemRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getVariants(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard>>> continuation) {
        com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1 commerceItemRepositoryImpl$getVariants$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1) {
            commerceItemRepositoryImpl$getVariants$1 = (com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1) continuation;
            if ((commerceItemRepositoryImpl$getVariants$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                commerceItemRepositoryImpl$getVariants$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1 commerceItemRepositoryImpl$getVariants$12 = commerceItemRepositoryImpl$getVariants$1;
                java.lang.Object obj = commerceItemRepositoryImpl$getVariants$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commerceItemRepositoryImpl$getVariants$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery getCommerceItemVariantsQuery = new com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery(new com.paypal.oslo.api.graphql.schema.type.AgenticCommerceItemVariantsInput(str, str2, str3));
                    commerceItemRepositoryImpl$getVariants$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    commerceItemRepositoryImpl$getVariants$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    commerceItemRepositoryImpl$getVariants$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    commerceItemRepositoryImpl$getVariants$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getCommerceItemVariantsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, commerceItemRepositoryImpl$getVariants$12, 2, (java.lang.Object) null);
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
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    Camera2StreamConfigurationMap(callError);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError.NetworkError(callError.toString()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data data = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return getHighSpeedVideoFpsRanges(data != null ? data.getAgenticCommerceItemVariants() : null);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue();
                    Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) leftValue);
                    com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data data2 = (com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.Data) graphQLData.getData();
                    return getHighSpeedVideoFpsRanges(data2 != null ? data2.getAgenticCommerceItemVariants() : null);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        commerceItemRepositoryImpl$getVariants$1 = new com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1(this, continuation);
        com.paypal.oslo.feature.searchandintelligence.data.repository.CommerceItemRepositoryImpl$getVariants$1 commerceItemRepositoryImpl$getVariants$122 = commerceItemRepositoryImpl$getVariants$1;
        java.lang.Object obj2 = commerceItemRepositoryImpl$getVariants$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commerceItemRepositoryImpl$getVariants$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard>> getHighSpeedVideoFpsRanges(java.util.List<com.paypal.oslo.feature.searchandintelligence.graphql.GetCommerceItemVariantsQuery.AgenticCommerceItemVariant> p0) {
        arrow.core.Either<com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError, java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard>> right;
        if (p0 != null && (right = arrow.core.EitherKt.right(com.paypal.oslo.feature.searchandintelligence.data.mapper.CommerceItemVariantMapper.INSTANCE.mapToProductCards(p0))) != null) {
            return right;
        }
        com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "No data received from GraphQL operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, OPERATION_NAME)), null, null, 24, null);
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.searchandintelligence.domain.error.GetCommerceItemVariantsError.NoData.INSTANCE);
    }

    private static void Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError p0) {
        com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "Failed to execute GraphQL operation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, OPERATION_NAME), kotlin.TuplesKt.to("error", p0)), null, null, 24, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/CommerceItemRepositoryImpl$Companion;", "", "<init>", "()V", "", "OPERATION_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
