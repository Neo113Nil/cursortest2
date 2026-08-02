package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/repository/CashInStoresRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/StoresRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInStoresMapper;", "mapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/cashin/data/mapper/CashInStoresMapper;)V", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;", "geoLocation", "", "limit", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getNearbyStores", "(Lcom/paypal/oslo/feature/cashin/domain/model/CashInGeoLocation;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Data;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInStoresQuery$Data;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInStoresMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInStoresRepositoryImpl implements com.paypal.oslo.feature.cashin.domain.repository.StoresRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CashInStoresRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInStoresMapper cashInStoresMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoresMapper, "");
        this.getHighSpeedVideoFpsRangesFor = apolloClient;
        this.getHighSpeedVideoSizes = cashInStoresMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.cashin.domain.repository.StoresRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getNearbyStores(com.paypal.oslo.feature.cashin.domain.model.CashInGeoLocation cashInGeoLocation, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, ? extends java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>>> continuation) {
        com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1 cashInStoresRepositoryImpl$getNearbyStores$1;
        int i2;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1) {
            cashInStoresRepositoryImpl$getNearbyStores$1 = (com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1) continuation;
            if ((cashInStoresRepositoryImpl$getNearbyStores$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cashInStoresRepositoryImpl$getNearbyStores$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1 cashInStoresRepositoryImpl$getNearbyStores$12 = cashInStoresRepositoryImpl$getNearbyStores$1;
                java.lang.Object obj = cashInStoresRepositoryImpl$getNearbyStores$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = cashInStoresRepositoryImpl$getNearbyStores$12.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery getCashInStoresQuery = new com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery(new com.paypal.oslo.api.graphql.schema.type.CashInStoresInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(i)), com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.GeoCoordinatesInput(java.lang.String.valueOf(cashInGeoLocation.getLatitude()), java.lang.String.valueOf(cashInGeoLocation.getLongitude()))), null, null, 25, null));
                    cashInStoresRepositoryImpl$getNearbyStores$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cashInGeoLocation);
                    cashInStoresRepositoryImpl$getNearbyStores$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCashInStoresQuery);
                    cashInStoresRepositoryImpl$getNearbyStores$12.getHighSpeedVideoFpsRanges = i;
                    cashInStoresRepositoryImpl$getNearbyStores$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRangesFor, getCashInStoresQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cashInStoresRepositoryImpl$getNearbyStores$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = cashInStoresRepositoryImpl$getNearbyStores$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.cashin.domain.error.CashInError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()).toString()));
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighSpeedVideoFpsRanges((com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cashInStoresRepositoryImpl$getNearbyStores$1 = new com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1(this, continuation);
        com.paypal.oslo.feature.cashin.data.repository.CashInStoresRepositoryImpl$getNearbyStores$1 cashInStoresRepositoryImpl$getNearbyStores$122 = cashInStoresRepositoryImpl$getNearbyStores$1;
        java.lang.Object obj2 = cashInStoresRepositoryImpl$getNearbyStores$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = cashInStoresRepositoryImpl$getNearbyStores$122.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.cashin.domain.error.CashInError, java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Data p0) {
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.CashInStores cashInStores;
        com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Page page;
        java.util.List<com.paypal.oslo.feature.cashin.graphql.GetCashInStoresQuery.Item> items = (p0 == null || (cashInStores = p0.getCashInStores()) == null || (page = cashInStores.getPage()) == null) ? null : page.getItems();
        if (items != null) {
            return arrow.core.EitherKt.right(this.getHighSpeedVideoSizes.map(items));
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.cashin.domain.error.CashInError.NoData.INSTANCE);
    }
}
