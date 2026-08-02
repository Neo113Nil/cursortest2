package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockPaymentFundingInstrumentsRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/PaymentFundingInstrumentsRepository;", "<init>", "()V", "", "applicationSessionId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "getPaymentFundingInstruments", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockPaymentFundingInstrumentsRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPaymentFundingInstrumentsRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPaymentFundingInstruments(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, ? extends java.util.List<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrument>>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1 mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1) {
            mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1) continuation;
            if ((mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("mock-bank-existing", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "0001", null, "Old Bank")));
            }
        }
        mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1(this, continuation);
        java.lang.Object obj2 = mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPaymentFundingInstrumentsRepository$getPaymentFundingInstruments$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument.FundingInstrumentBank("mock-bank-existing", com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplacquisition.domain.model.enums.BankAccountType.CHECKING, "0001", null, "Old Bank")));
    }
}
