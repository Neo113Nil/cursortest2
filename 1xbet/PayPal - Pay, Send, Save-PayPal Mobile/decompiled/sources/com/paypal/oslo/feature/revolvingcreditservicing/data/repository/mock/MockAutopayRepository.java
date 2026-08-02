package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAutopayRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AutopayRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "fetchAutopayOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayResult;", "updateAutopay", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/EligiblePaymentInstrument;", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockAutopayRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository.Companion(null);

    @javax.inject.Inject
    public MockAutopayRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchAutopayOverview(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest autopayOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$fetchAutopayOverview$1 mockAutopayRepository$fetchAutopayOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$fetchAutopayOverview$1) {
            mockAutopayRepository$fetchAutopayOverview$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$fetchAutopayOverview$1) continuation;
            if ((mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockAutopayRepository$fetchAutopayOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverviewRequest);
                    mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1500L, mockAutopayRepository$fetchAutopayOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(true, null, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, null, getHighSpeedVideoFpsRanges(), java.time.Instant.parse("2025-02-28T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "66.18")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null)}), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00")), java.lang.Boolean.TRUE, getHighSpeedVideoFpsRanges(), "https://www.paypal.com/us/webapps/mpp/ua/autopay-tnc", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "5000.00"), null));
            }
        }
        mockAutopayRepository$fetchAutopayOverview$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$fetchAutopayOverview$1(this, continuation);
        java.lang.Object obj2 = mockAutopayRepository$fetchAutopayOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockAutopayRepository$fetchAutopayOverview$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(true, null, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, null, getHighSpeedVideoFpsRanges(), java.time.Instant.parse("2025-02-28T00:00:00Z"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentConstraints(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "66.18")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.STATEMENT_BALANCE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentAmountOption(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.CUSTOM_AMOUNT, null)}), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00")), java.lang.Boolean.TRUE, getHighSpeedVideoFpsRanges(), "https://www.paypal.com/us/webapps/mpp/ua/autopay-tnc", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "5000.00"), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAutopay(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1 mockAutopayRepository$updateAutopay$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1) {
            mockAutopayRepository$updateAutopay$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1) continuation;
            if ((mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockAutopayRepository$updateAutopay$1.getHighSpeedVideoFpsRanges = updateAutopayRequest;
                    mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1500L, mockAutopayRepository$updateAutopay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    updateAutopayRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest) mockAutopayRepository$updateAutopay$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult(updateAutopayRequest.getEnrolled(), kotlin.random.Random.INSTANCE.nextBoolean()));
            }
        }
        mockAutopayRepository$updateAutopay$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1(this, continuation);
        java.lang.Object obj2 = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult(updateAutopayRequest.getEnrolled(), kotlin.random.Random.INSTANCE.nextBoolean()));
    }

    private static java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument> getHighSpeedVideoFpsRanges() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Balance("balance-001", "https://www.paypalobjects.com/images/shared/paypal-logo.png", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00")), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank("bank-001", "Bank of America", "Checking", "8644", "https://www.paypalobjects.com/images/banks/boa.png"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank("bank-002", "Wells Fargo", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_SAVINGS, "1234", "https://www.paypalobjects.com/images/banks/wellsfargo.png"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Card("card-001", "Visa Debit", "9876", "https://www.paypalobjects.com/images/cards/visa.png")});
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockAutopayRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
