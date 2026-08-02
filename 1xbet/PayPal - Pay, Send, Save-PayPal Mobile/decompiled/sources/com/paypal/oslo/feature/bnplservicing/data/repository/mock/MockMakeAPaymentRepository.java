package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockMakeAPaymentRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/MakeAPaymentRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentOverviewInput;", "input", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentOverview;", "getOverview", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentOverviewInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentEligibleFi;", "getEligibleFi", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentEligibleFiInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/MakeAPaymentSuccess;", "postMakeAPayment", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/makeapayment/input/MakeAPaymentInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockMakeAPaymentRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockMakeAPaymentRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOverview(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentOverviewInput makeAPaymentOverviewInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getOverview$1 mockMakeAPaymentRepository$getOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getOverview$1) {
            mockMakeAPaymentRepository$getOverview$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getOverview$1) continuation;
            if ((mockMakeAPaymentRepository$getOverview$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockMakeAPaymentRepository$getOverview$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockMakeAPaymentRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockMakeAPaymentRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockMakeAPaymentRepository$getOverview$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentOverviewInput);
                    mockMakeAPaymentRepository$getOverview$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockMakeAPaymentRepository$getOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US;
                com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK;
                com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType = com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.DUE_TODAY;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview(planStatus, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption(paymentOptionType, bool, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"))), creditProductIdentifier, "US", "USD", "America/Los_Angeles", "account-123", false, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay(false, new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account"), bool), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account")), kotlin.collections.CollectionsKt.emptyList(), null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "100.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "25.00")));
            }
        }
        mockMakeAPaymentRepository$getOverview$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getOverview$1(this, continuation);
        java.lang.Object obj2 = mockMakeAPaymentRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockMakeAPaymentRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US;
        com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus planStatus2 = com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK;
        com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType paymentOptionType2 = com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOptionType.DUE_TODAY;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentOverview(planStatus2, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.PaymentOption(paymentOptionType2, bool2, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"))), creditProductIdentifier2, "US", "USD", "America/Los_Angeles", "account-123", false, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.Autopay(false, new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account"), bool2), kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account")), kotlin.collections.CollectionsKt.emptyList(), null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "100.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "25.00")));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getEligibleFi(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentEligibleFiInput makeAPaymentEligibleFiInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getEligibleFi$1 mockMakeAPaymentRepository$getEligibleFi$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getEligibleFi$1) {
            mockMakeAPaymentRepository$getEligibleFi$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getEligibleFi$1) continuation;
            if ((mockMakeAPaymentRepository$getEligibleFi$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockMakeAPaymentRepository$getEligibleFi$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockMakeAPaymentRepository$getEligibleFi$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockMakeAPaymentRepository$getEligibleFi$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockMakeAPaymentRepository$getEligibleFi$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(makeAPaymentEligibleFiInput);
                    mockMakeAPaymentRepository$getEligibleFi$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockMakeAPaymentRepository$getEligibleFi$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("card-456", "https://example.com/visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Test Card", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.CREDIT, "12/25", "Chase Bank", "5678", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account"), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount("balance-123", "https://example.com/paypal.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BALANCE, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "100"))})));
            }
        }
        mockMakeAPaymentRepository$getEligibleFi$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$getEligibleFi$1(this, continuation);
        java.lang.Object obj2 = mockMakeAPaymentRepository$getEligibleFi$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockMakeAPaymentRepository$getEligibleFi$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentEligibleFi(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("card-456", "https://example.com/visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Test Card", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.CREDIT, "12/25", "Chase Bank", "5678", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Test Bank Account"), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount("balance-123", "https://example.com/paypal.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BALANCE, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "100"))})));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.MakeAPaymentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object postMakeAPayment(com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput makeAPaymentInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$postMakeAPayment$1 mockMakeAPaymentRepository$postMakeAPayment$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$postMakeAPayment$1) {
            mockMakeAPaymentRepository$postMakeAPayment$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$postMakeAPayment$1) continuation;
            if ((mockMakeAPaymentRepository$postMakeAPayment$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockMakeAPaymentRepository$postMakeAPayment$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockMakeAPaymentRepository$postMakeAPayment$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockMakeAPaymentRepository$postMakeAPayment$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockMakeAPaymentRepository$postMakeAPayment$1.Camera2StreamConfigurationMap = makeAPaymentInput;
                    mockMakeAPaymentRepository$postMakeAPayment$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockMakeAPaymentRepository$postMakeAPayment$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    makeAPaymentInput = (com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.input.MakeAPaymentInput) mockMakeAPaymentRepository$postMakeAPayment$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(makeAPaymentInput.getAmount().getCurrencyCode(), makeAPaymentInput.getAmount().getValue())));
            }
        }
        mockMakeAPaymentRepository$postMakeAPayment$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$postMakeAPayment$1(this, continuation);
        java.lang.Object obj2 = mockMakeAPaymentRepository$postMakeAPayment$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockMakeAPaymentRepository$postMakeAPayment$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.makeapayment.MakeAPaymentSuccess(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money(makeAPaymentInput.getAmount().getCurrencyCode(), makeAPaymentInput.getAmount().getValue())));
    }
}
