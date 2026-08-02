package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/mock/MockPlanListRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanListRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;", "plansListInput", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlansOverview;", "getOverview", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/input/PlansListInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "getHighResolutionOutputSizeshNQ4ISI", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/planlist/PlanCommonFields;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockPlanListRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockPlanListRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getOverview(com.paypal.oslo.feature.bnplservicing.domain.model.planlist.input.PlansListInput plansListInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository$getOverview$1 mockPlanListRepository$getOverview$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository$getOverview$1) {
            mockPlanListRepository$getOverview$1 = (com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository$getOverview$1) continuation;
            if ((mockPlanListRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockPlanListRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockPlanListRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockPlanListRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockPlanListRepository$getOverview$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(plansListInput);
                    mockPlanListRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockPlanListRepository$getOverview$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan(2, 2, 4, false, "2025-12-24", getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan(1, 2, 1, 4, getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan(0, 1, 3, 4, getHighResolutionOutputSizeshNQ4ISI())}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan("2025-11-15T10:30:00Z", 4, 0, 4, false, getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan("2025-10-20T14:00:00Z", false, getHighResolutionOutputSizeshNQ4ISI())})), false, 2, null));
            }
        }
        mockPlanListRepository$getOverview$1 = new com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository$getOverview$1(this, continuation);
        java.lang.Object obj2 = mockPlanListRepository$getOverview$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockPlanListRepository$getOverview$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlansOverview(new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanList(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.OnTrackPlan(2, 2, 4, false, "2025-12-24", getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.PastDuePlan(1, 2, 1, 4, getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.DelinquentPlan(0, 1, 3, 4, getHighResolutionOutputSizeshNQ4ISI())}), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CommonFieldsPlan[]{new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.CompletedPlan("2025-11-15T10:30:00Z", 4, 0, 4, false, getHighResolutionOutputSizeshNQ4ISI()), new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanListSnapshot.MaturedPlan("2025-10-20T14:00:00Z", false, getHighResolutionOutputSizeshNQ4ISI())})), false, 2, null));
    }

    private static com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields getHighResolutionOutputSizeshNQ4ISI() {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.planlist.PlanCommonFields("account-matured-222", com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.PAY_LATER_US, new com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy(com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.InstrumentFormat.CREDIT_FINANCIAL_INSTRUMENT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.UsageChannel.CHECKOUT, com.paypal.oslo.feature.bnplservicing.domain.model.common.VariantPolicy.AutopayRequirement.AUTOPAY_OPTIONAL), null, "Nike", "Running Shoes", com.paypal.oslo.feature.bnplservicing.domain.model.common.PlanStatus.MATURED, new com.paypal.oslo.feature.bnplservicing.domain.model.common.Money("USD", "75.00"), com.paypal.oslo.feature.bnplservicing.domain.model.common.ContextualLabel.UNKNOWN);
    }
}
