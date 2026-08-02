package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanDetailsOverviewRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanDetailsOverviewRepository;", "<init>", "()V", "", "creditAccountId", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetailsOverview;", "getPlanDetailsOverview", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockPlanDetailsOverviewRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPlanDetailsOverviewRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getPlanDetailsOverview(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository$getPlanDetailsOverview$1 mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository$getPlanDetailsOverview$1) {
            mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository$getPlanDetailsOverview$1) continuation;
            if ((mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = null;
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.OnTrackPlan(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore("Premium Headphones", "Electronics Store", "mock-account-123", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK, "USD", "TXN-987654321", "2025-11-01", new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "200.00"), null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "200.00"), money, money, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "0.00"), "0%", null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), null, null, false, null, 1837056, null), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "150.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay(false, new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-mock-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Chase Checking"), null, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType.MANAGE_AUTOPAY, null, 16, null), 1, 4, 3, kotlin.collections.CollectionsKt.emptyList(), null, false, null, 1536, null)));
            }
        }
        mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository$getPlanDetailsOverview$1(this, continuation);
        java.lang.Object obj2 = mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPlanDetailsOverviewRepository$getPlanDetailsOverview$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money2 = null;
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.OnTrackPlan(new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanCore("Premium Headphones", "Electronics Store", "mock-account-123", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.ON_TRACK, "USD", "TXN-987654321", "2025-11-01", new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "200.00"), null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "200.00"), money2, money2, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "0.00"), "0%", null, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), null, null, false, null, 1837056, null), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "50.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "150.00"), new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay(false, new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccount("bank-mock-123", null, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType.BANK, com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.CHECKING, "1234", "Chase Checking"), null, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.Autopay.ActionType.MANAGE_AUTOPAY, null, 16, null), 1, 4, 3, kotlin.collections.CollectionsKt.emptyList(), null, false, null, 1536, null)));
    }
}
