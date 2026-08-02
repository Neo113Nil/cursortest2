package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockAutopayRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/AutopayRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;", "input", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/AutoPaySetupOverview;", "getAutopaySetupOverview", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/AutoPaySetupOverviewInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/UpdateAutoPayInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/UpdateAutoPayResult;", "updateAutopay", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/UpdateAutoPayInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/CancelAutoPayResult;", "cancelAutopay", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/autopay/input/CancelAutoPayInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockAutopayRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockAutopayRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAutopaySetupOverview(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.AutoPaySetupOverviewInput autoPaySetupOverviewInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$getAutopaySetupOverview$1 mockAutopayRepository$getAutopaySetupOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$getAutopaySetupOverview$1) {
            mockAutopayRepository$getAutopaySetupOverview$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$getAutopaySetupOverview$1) continuation;
            if ((mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockAutopayRepository$getAutopaySetupOverview$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoPaySetupOverviewInput);
                    mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockAutopayRepository$getAutopaySetupOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview("https://www.paypalobjects.com/paylater/Pay%20in%204%20Payment%20Authorization.pdf", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition[]{com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.CREDIT_CARD, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.DEBIT_CARD, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.BANK}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("CARD_AUTOPAY_001", "https://www.paypalobjects.com/webstatic/wallet/cards/Visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Visa Debit", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.DEBIT, "03/27", "Bank of America", "4532", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("CARD_AUTOPAY_001", "https://www.paypalobjects.com/webstatic/wallet/cards/Visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Prepaid Visa Credit", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.PREPAID, "03/27", "Prepaid Card", "1234", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-mock-123", "https://www.paypalobjects.com/webstatic/wallet/cards/MasterCard.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "3456", "Primary Checking"), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount("BALANCE_AUTOPAY_001", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BALANCE, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "250.00"), 2, null)})));
            }
        }
        mockAutopayRepository$getAutopaySetupOverview$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$getAutopaySetupOverview$1(this, continuation);
        java.lang.Object obj2 = mockAutopayRepository$getAutopaySetupOverview$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockAutopayRepository$getAutopaySetupOverview$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.AutoPaySetupOverview("https://www.paypalobjects.com/paylater/Pay%20in%204%20Payment%20Authorization.pdf", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition[]{com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.CREDIT_CARD, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.DEBIT_CARD, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.SupportedFundingInstrumentTypeForAddition.BANK}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument[]{new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("CARD_AUTOPAY_001", "https://www.paypalobjects.com/webstatic/wallet/cards/Visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Visa Debit", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.DEBIT, "03/27", "Bank of America", "4532", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardAccount("CARD_AUTOPAY_001", "https://www.paypalobjects.com/webstatic/wallet/cards/Visa.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.CARD, "Prepaid Visa Credit", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.VISA, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardProductType.PREPAID, "03/27", "Prepaid Card", "1234", null, 512, null), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-mock-123", "https://www.paypalobjects.com/webstatic/wallet/cards/MasterCard.png", com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "3456", "Primary Checking"), new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.PaypalBalanceAccount("BALANCE_AUTOPAY_001", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BALANCE, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "250.00"), 2, null)})));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAutopay(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.UpdateAutoPayInput updateAutoPayInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1 mockAutopayRepository$updateAutopay$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1) {
            mockAutopayRepository$updateAutopay$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1) continuation;
            if ((mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI = updateAutoPayInput;
                    mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockAutopayRepository$updateAutopay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    updateAutoPayInput = (com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.UpdateAutoPayInput) mockAutopayRepository$updateAutopay$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult(updateAutoPayInput.getFundingInstrument()));
            }
        }
        mockAutopayRepository$updateAutopay$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$updateAutopay$1(this, continuation);
        java.lang.Object obj2 = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockAutopayRepository$updateAutopay$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.UpdateAutoPayResult(updateAutoPayInput.getFundingInstrument()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelAutopay(com.paypal.oslo.feature.bnplservicing.domain.model.autopay.input.CancelAutoPayInput cancelAutoPayInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$cancelAutopay$1 mockAutopayRepository$cancelAutopay$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$cancelAutopay$1) {
            mockAutopayRepository$cancelAutopay$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$cancelAutopay$1) continuation;
            if ((mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelAutoPayInput);
                    mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockAutopayRepository$cancelAutopay$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "25.00"), "2025-01-15"));
            }
        }
        mockAutopayRepository$cancelAutopay$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockAutopayRepository$cancelAutopay$1(this, continuation);
        java.lang.Object obj2 = mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockAutopayRepository$cancelAutopay$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.autopay.CancelAutoPayResult(new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "25.00"), "2025-01-15"));
    }
}
