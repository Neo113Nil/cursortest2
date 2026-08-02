package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0011\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentSummaryRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentSummaryRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentSummaryRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/PaymentSummaryOverview;", "fetchPaymentSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentSummaryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/paymentsummary/CancelRepaymentResponse;", "cancelScheduledPayment", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/CancelRepaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges", "", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockPaymentSummaryRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public MockPaymentSummaryRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPaymentSummary(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentSummaryRequest paymentSummaryRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryOverview>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1 mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1) {
            mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1) continuation;
            if ((mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(paymentSummaryRequest);
                    mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
                this.getHighResolutionOutputSizeshNQ4ISI = i2;
                if (i2 != 1) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.mockdata.PaymentSummaryMockData.INSTANCE.errorNetworkFailure();
                }
                if (i2 == 2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.mockdata.PaymentSummaryMockData.INSTANCE.successMixedPayments();
                }
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mockdata.PaymentSummaryMockData.INSTANCE.successEmptyState();
            }
        }
        mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1(this, continuation);
        java.lang.Object obj2 = mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        i2 = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i2 != 1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelScheduledPayment(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest cancelRepaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.PaymentSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.paymentsummary.CancelRepaymentResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1 mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1;
        int i;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1) {
            mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1) continuation;
            if ((mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.getHighSpeedVideoFpsRanges = cancelRepaymentRequest;
                    mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1000L, mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cancelRepaymentRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.CancelRepaymentRequest) mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = this.Camera2StreamConfigurationMap + 1;
                this.Camera2StreamConfigurationMap = i2;
                if (i2 != 1) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.mockdata.PaymentSummaryMockData.INSTANCE.cancelPaymentNetworkError();
                }
                return com.paypal.oslo.feature.revolvingcreditservicing.data.mockdata.PaymentSummaryMockData.INSTANCE.cancelPaymentSuccess(cancelRepaymentRequest.getPaymentId());
            }
        }
        mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1(this, continuation);
        java.lang.Object obj2 = mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPaymentSummaryRepositoryImpl$cancelScheduledPayment$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        i2 = this.Camera2StreamConfigurationMap + 1;
        this.Camera2StreamConfigurationMap = i2;
        if (i2 != 1) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentSummaryRepositoryImpl$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
