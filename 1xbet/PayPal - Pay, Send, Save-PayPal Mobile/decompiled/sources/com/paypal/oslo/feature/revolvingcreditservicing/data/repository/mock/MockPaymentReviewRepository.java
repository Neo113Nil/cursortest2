package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockPaymentReviewRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/PaymentReviewRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/MakePaymentResponse;", "makePayment", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/makeapayment/MakePaymentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockPaymentReviewRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPaymentReviewRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object makePayment(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest makePaymentRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository$makePayment$1 mockPaymentReviewRepository$makePayment$1;
        int i;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse makePaymentResponse;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository$makePayment$1) {
            mockPaymentReviewRepository$makePayment$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository$makePayment$1) continuation;
            if ((mockPaymentReviewRepository$makePayment$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPaymentReviewRepository$makePayment$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPaymentReviewRepository$makePayment$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPaymentReviewRepository$makePayment$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPaymentReviewRepository$makePayment$1.getHighSpeedVideoFpsRangesFor = makePaymentRequest;
                    mockPaymentReviewRepository$makePayment$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(500L, mockPaymentReviewRepository$makePayment$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    makePaymentRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.request.makeapayment.MakePaymentRequest) mockPaymentReviewRepository$makePayment$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository.WhenMappings.$EnumSwitchMapping$0[makePaymentRequest.getCreditProductIdentifier().ordinal()];
                if (i2 != 1 || i2 == 2) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount = makePaymentRequest.getAmount();
                    java.time.LocalDate date = makePaymentRequest.getDate();
                    makePaymentResponse = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(amount, date != null ? date.toString() : null, makePaymentRequest.getPaymentType(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("bank-us-001", null, "Bank of America", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "8644")));
                } else if (i2 != 3) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount2 = makePaymentRequest.getAmount();
                    java.time.LocalDate date2 = makePaymentRequest.getDate();
                    makePaymentResponse = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(amount2, date2 != null ? date2.toString() : null, makePaymentRequest.getPaymentType(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance("balance-001", "https://www.paypalobjects.com/webstatic/mktg/logo/pp_cc_mark_74x46.jpg", new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1000.00"))));
                } else {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount3 = makePaymentRequest.getAmount();
                    java.time.LocalDate date3 = makePaymentRequest.getDate();
                    makePaymentResponse = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(amount3, date3 != null ? date3.toString() : null, makePaymentRequest.getPaymentType(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("bank-ppmc-001", null, "Chase Bank", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.SAVINGS, "4532")));
                }
                return arrow.core.IorKt.rightIor(makePaymentResponse);
            }
        }
        mockPaymentReviewRepository$makePayment$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository$makePayment$1(this, continuation);
        java.lang.Object obj2 = mockPaymentReviewRepository$makePayment$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPaymentReviewRepository$makePayment$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository.WhenMappings.$EnumSwitchMapping$0[makePaymentRequest.getCreditProductIdentifier().ordinal()];
        if (i2 != 1) {
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount amount4 = makePaymentRequest.getAmount();
        java.time.LocalDate date4 = makePaymentRequest.getDate();
        makePaymentResponse = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.MakePaymentResponse(amount4, date4 != null ? date4.toString() : null, makePaymentRequest.getPaymentType(), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBank("bank-us-001", null, "Bank of America", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "8644")));
        return arrow.core.IorKt.rightIor(makePaymentResponse);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
