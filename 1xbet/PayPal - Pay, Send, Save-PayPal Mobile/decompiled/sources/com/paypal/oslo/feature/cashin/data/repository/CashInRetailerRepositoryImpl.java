package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/repository/CashInRetailerRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/RetailerRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInRetailerMapper;", "mapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/cashin/data/mapper/CashInRetailerMapper;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInRetailer;", "getRetailers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Data;", "p0", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInRetailersQuery$Data;)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInRetailerMapper;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInRetailerRepositoryImpl implements com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CashInRetailerRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInRetailerMapper cashInRetailerMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInRetailerMapper, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.Camera2StreamConfigurationMap = cashInRetailerMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.cashin.domain.repository.RetailerRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRetailers(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInRetailer>>> continuation) {
        com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1 cashInRetailerRepositoryImpl$getRetailers$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1) {
            cashInRetailerRepositoryImpl$getRetailers$1 = (com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1) continuation;
            if ((cashInRetailerRepositoryImpl$getRetailers$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                cashInRetailerRepositoryImpl$getRetailers$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1 cashInRetailerRepositoryImpl$getRetailers$12 = cashInRetailerRepositoryImpl$getRetailers$1;
                java.lang.Object obj = cashInRetailerRepositoryImpl$getRetailers$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashInRetailerRepositoryImpl$getRetailers$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery getCashInRetailersQuery = new com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery(new com.paypal.oslo.api.graphql.schema.type.CashInRetailersInput(null, null, 3, null));
                    cashInRetailerRepositoryImpl$getRetailers$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCashInRetailersQuery);
                    cashInRetailerRepositoryImpl$getRetailers$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, getCashInRetailersQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cashInRetailerRepositoryImpl$getRetailers$12, 2, (java.lang.Object) null);
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
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.cashin.domain.error.CashInError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return Camera2StreamConfigurationMap((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return Camera2StreamConfigurationMap((com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cashInRetailerRepositoryImpl$getRetailers$1 = new com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1(this, continuation);
        com.paypal.oslo.feature.cashin.data.repository.CashInRetailerRepositoryImpl$getRetailers$1 cashInRetailerRepositoryImpl$getRetailers$122 = cashInRetailerRepositoryImpl$getRetailers$1;
        java.lang.Object obj2 = cashInRetailerRepositoryImpl$getRetailers$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashInRetailerRepositoryImpl$getRetailers$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.cashin.domain.error.CashInError, java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInRetailer>> Camera2StreamConfigurationMap(com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Data p0) {
        com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.CashInRetailers cashInRetailers;
        com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Page page;
        java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInRetailersQuery.Item> items = (p0 == null || (cashInRetailers = p0.getCashInRetailers()) == null || (page = cashInRetailers.getPage()) == null) ? null : page.getItems();
        if (items != null) {
            return arrow.core.EitherKt.right(this.Camera2StreamConfigurationMap.map(items));
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.cashin.domain.error.CashInError.NoData.INSTANCE);
    }
}
