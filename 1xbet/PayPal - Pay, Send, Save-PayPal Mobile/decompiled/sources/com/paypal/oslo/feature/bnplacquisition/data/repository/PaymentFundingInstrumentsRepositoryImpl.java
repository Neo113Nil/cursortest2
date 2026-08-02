package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/PaymentFundingInstrumentsRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/PaymentFundingInstrumentsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "applicationSessionId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "getPaymentFundingInstruments", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentFundingInstrumentsRepositoryImpl extends com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PaymentFundingInstrumentsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPaymentFundingInstruments(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, ? extends java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument>>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1 paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1) {
            paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1) continuation;
            if ((paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1 paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12 = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1;
                java.lang.Object obj = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery getBnplAcquisitionPaymentFundingInstrumentsQuery = new com.paypal.oslo.feature.bnplacquisition.graphql.GetBnplAcquisitionPaymentFundingInstrumentsQuery(new com.paypal.oslo.api.graphql.schema.type.BNPLApplicationPaymentFundingInstrumentsInput(str));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2 paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2 = com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2.getHighSpeedVideoFpsRanges;
                    paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBnplAcquisitionPaymentFundingInstrumentsQuery);
                    paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository.fetchData$default(this, apolloClient, getBnplAcquisitionPaymentFundingInstrumentsQuery, paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$2, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, (com.paypal.oslo.core.network.graphql.CallConfig) null, paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$12, 12, (java.lang.Object) null);
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
                    return ior;
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    java.util.List list = (java.util.List) ((arrow.core.Ior.Right) ior).getValue();
                    if (list == null) {
                        list = kotlin.collections.CollectionsKt.emptyList();
                    }
                    return new arrow.core.Ior.Right(list);
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                java.util.List list2 = (java.util.List) both.getRightValue();
                if (list2 == null) {
                    list2 = kotlin.collections.CollectionsKt.emptyList();
                }
                return new arrow.core.Ior.Both(leftValue, list2);
            }
        }
        paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1(this, continuation);
        com.paypal.oslo.feature.bnplacquisition.data.repository.PaymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1 paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$122 = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$1;
        java.lang.Object obj2 = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentFundingInstrumentsRepositoryImpl$getPaymentFundingInstruments$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
