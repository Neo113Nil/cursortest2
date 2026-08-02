package com.paypal.oslo.feature.businesshome.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/data/repository/MerchantInsightsRepositoryImpl;", "Lcom/paypal/oslo/feature/businesshome/domain/repository/MerchantInsightsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsightsError;", "Lcom/paypal/oslo/feature/businesshome/domain/model/MerchantInsights;", "getMerchantInsights", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MerchantInsightsRepositoryImpl implements com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MerchantInsightsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getMerchantInsights(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError, com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights>> continuation) {
        com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl$getMerchantInsights$1 merchantInsightsRepositoryImpl$getMerchantInsights$1;
        int i;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights;
        com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights domain;
        arrow.core.Either right;
        com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.MerchantInsights merchantInsights2;
        com.paypal.oslo.feature.businesshome.domain.model.MerchantInsights domain2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl$getMerchantInsights$1) {
            merchantInsightsRepositoryImpl$getMerchantInsights$1 = (com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl$getMerchantInsights$1) continuation;
            if ((merchantInsightsRepositoryImpl$getMerchantInsights$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                merchantInsightsRepositoryImpl$getMerchantInsights$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = merchantInsightsRepositoryImpl$getMerchantInsights$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantInsightsRepositoryImpl$getMerchantInsights$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.Camera2StreamConfigurationMap.get().query(new com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery()), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    merchantInsightsRepositoryImpl$getMerchantInsights$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, merchantInsightsRepositoryImpl$getMerchantInsights$1, 2, null);
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
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImplKt.access$toMerchantInsightsError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data data = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    return (data == null || (merchantInsights2 = data.getMerchantInsights()) == null || (domain2 = com.paypal.oslo.feature.businesshome.data.mapper.MerchantInsightsMapperKt.toDomain(merchantInsights2)) == null || (right2 = arrow.core.EitherKt.right(domain2)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.UnexpectedResponseError.INSTANCE) : right2;
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data data2 = (com.paypal.oslo.feature.businesshome.graphql.GetMerchantInsightsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    return (data2 == null || (merchantInsights = data2.getMerchantInsights()) == null || (domain = com.paypal.oslo.feature.businesshome.data.mapper.MerchantInsightsMapperKt.toDomain(merchantInsights)) == null || (right = arrow.core.EitherKt.right(domain)) == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.businesshome.domain.model.MerchantInsightsError.UnexpectedResponseError.INSTANCE) : right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        merchantInsightsRepositoryImpl$getMerchantInsights$1 = new com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl$getMerchantInsights$1(this, continuation);
        java.lang.Object obj2 = merchantInsightsRepositoryImpl$getMerchantInsights$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantInsightsRepositoryImpl$getMerchantInsights$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
