package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentOptionsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentOptionsRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/PaymentOptions;", "fetchPaymentOptions", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/PaymentOptionsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockPaymentOptionsRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository.Companion Companion = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository.Companion(null);

    @javax.inject.Inject
    public MockPaymentOptionsRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchPaymentOptions(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository$fetchPaymentOptions$1 mockPaymentOptionsRepository$fetchPaymentOptions$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository$fetchPaymentOptions$1) {
            mockPaymentOptionsRepository$fetchPaymentOptions$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository$fetchPaymentOptions$1) continuation;
            if ((mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    java.lang.String creditAccountId = paymentOptionsRequest.getCreditAccountId();
                    if (creditAccountId == null) {
                        creditAccountId = "";
                    }
                    com.paypal.android.logger.Logger.d$default(logger, "MockPaymentOptionsRepository: Using MOCK data", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("creditAccountId", creditAccountId)), 2, null);
                    paymentOptionsRequest2 = paymentOptionsRequest;
                    mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoFpsRanges = paymentOptionsRequest2;
                    mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockPaymentOptionsRepository$fetchPaymentOptions$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest paymentOptionsRequest3 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.PaymentOptionsRequest) mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    paymentOptionsRequest2 = paymentOptionsRequest3;
                }
                return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("bank-001", null, "Bank of America", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance("balance-001", null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"))}), null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(true, java.lang.Boolean.TRUE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank("bank-001", "Bank of America", "Checking", "1234", null)), java.time.Instant.parse("2026-02-28T00:00:00Z"), null, null, null, null, null, paymentOptionsRequest2.getCreditAccountId()), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing(java.lang.Boolean.TRUE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "5000.00"), null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2000.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2000.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "212.50"), java.time.LocalDate.of(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository.MOCK_PAYMENT_DUE_YEAR, 2, 28).atStartOfDay(java.time.ZoneOffset.systemDefault()).toInstant(), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "6000.00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.MINIMUM_PAYMENT_DUE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction.SHOW_MIRANDA), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00")), null, 30, paymentOptionsRequest2.getCreditAccountId()));
            }
        }
        mockPaymentOptionsRepository$fetchPaymentOptions$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentOptionsRepository$fetchPaymentOptions$1(this, continuation);
        java.lang.Object obj2 = mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPaymentOptionsRepository$fetchPaymentOptions$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentOptions(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56"), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("bank-001", null, "Bank of America", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance("balance-001", null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"))}), null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview(true, java.lang.Boolean.TRUE, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.MINIMUM_PAYMENT_DUE, null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.EligiblePaymentInstrument.Bank("bank-001", "Bank of America", "Checking", "1234", null)), java.time.Instant.parse("2026-02-28T00:00:00Z"), null, null, null, null, null, paymentOptionsRequest2.getCreditAccountId()), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.Billing(java.lang.Boolean.TRUE, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "5000.00"), null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1234.56"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2000.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "2000.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "25.00"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "212.50"), java.time.LocalDate.of(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository.MOCK_PAYMENT_DUE_YEAR, 2, 28).atStartOfDay(java.time.ZoneOffset.systemDefault()).toInstant(), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "6000.00"), com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.MINIMUM_PAYMENT_DUE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.PaymentStatusAction.SHOW_MIRANDA), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "500.00")), null, 30, paymentOptionsRequest2.getCreditAccountId()));
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentOptionsRepository$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
