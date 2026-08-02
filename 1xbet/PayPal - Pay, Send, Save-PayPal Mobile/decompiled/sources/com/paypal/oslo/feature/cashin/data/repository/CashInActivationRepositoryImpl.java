package com.paypal.oslo.feature.cashin.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cashin/data/repository/CashInActivationRepositoryImpl;", "Lcom/paypal/oslo/feature/cashin/domain/repository/ActivationRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInActivationMapper;", "mapper", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/cashin/data/mapper/CashInActivationMapper;)V", "", "partnerId", "retailerId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cashin/domain/error/CashInError;", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;", "getActivationDetails", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Data;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/cashin/graphql/GetCashInActivationDetailsQuery$Data;)Larrow/core/Either;", "Camera2StreamConfigurationMap", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/cashin/data/mapper/CashInActivationMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashInActivationRepositoryImpl implements com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CashInActivationRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.cashin.data.mapper.CashInActivationMapper cashInActivationMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInActivationMapper, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighSpeedVideoSizes = cashInActivationMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.cashin.domain.repository.ActivationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getActivationDetails(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cashin.domain.error.CashInError, com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails>> continuation) {
        com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1 cashInActivationRepositoryImpl$getActivationDetails$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1) {
            cashInActivationRepositoryImpl$getActivationDetails$1 = (com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1) continuation;
            if ((cashInActivationRepositoryImpl$getActivationDetails$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                cashInActivationRepositoryImpl$getActivationDetails$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1 cashInActivationRepositoryImpl$getActivationDetails$12 = cashInActivationRepositoryImpl$getActivationDetails$1;
                java.lang.Object obj = cashInActivationRepositoryImpl$getActivationDetails$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cashInActivationRepositoryImpl$getActivationDetails$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery getCashInActivationDetailsQuery = new com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery(new com.paypal.oslo.api.graphql.schema.type.CashInActivationInput(str, str2, null, 4, null));
                    cashInActivationRepositoryImpl$getActivationDetails$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    cashInActivationRepositoryImpl$getActivationDetails$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    cashInActivationRepositoryImpl$getActivationDetails$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getCashInActivationDetailsQuery);
                    cashInActivationRepositoryImpl$getActivationDetails$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(this.getHighSpeedVideoFpsRanges, getCashInActivationDetailsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, cashInActivationRepositoryImpl$getActivationDetails$12, 2, (java.lang.Object) null);
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
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        cashInActivationRepositoryImpl$getActivationDetails$1 = new com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1(this, continuation);
        com.paypal.oslo.feature.cashin.data.repository.CashInActivationRepositoryImpl$getActivationDetails$1 cashInActivationRepositoryImpl$getActivationDetails$122 = cashInActivationRepositoryImpl$getActivationDetails$1;
        java.lang.Object obj2 = cashInActivationRepositoryImpl$getActivationDetails$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cashInActivationRepositoryImpl$getActivationDetails$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private final arrow.core.Either<com.paypal.oslo.feature.cashin.domain.error.CashInError, com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.Data p0) {
        com.paypal.oslo.feature.cashin.graphql.GetCashInActivationDetailsQuery.CashInActivation cashInActivation = p0 != null ? p0.getCashInActivation() : null;
        if (cashInActivation != null) {
            return arrow.core.EitherKt.right(this.getHighSpeedVideoSizes.map(cashInActivation));
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.cashin.domain.error.CashInError.NoData.INSTANCE);
    }
}
