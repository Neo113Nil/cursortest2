package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockBnplPlansRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/BnplPlansRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/plans/BnplPlansResponse;", "getBnplPlans", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/BnplPlansRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockBnplPlansRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockBnplPlansRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.BnplPlansRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getBnplPlans(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.BnplPlansRequest bnplPlansRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository$getBnplPlans$1 mockBnplPlansRepository$getBnplPlans$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository$getBnplPlans$1) {
            mockBnplPlansRepository$getBnplPlans$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository$getBnplPlans$1) continuation;
            if ((mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = mockBnplPlansRepository$getBnplPlans$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bnplPlansRequest);
                    mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockBnplPlansRepository$getBnplPlans$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem("mock-account-123")))));
            }
        }
        mockBnplPlansRepository$getBnplPlans$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockBnplPlansRepository$getBnplPlans$1(this, continuation);
        java.lang.Object obj2 = mockBnplPlansRepository$getBnplPlans$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockBnplPlansRepository$getBnplPlans$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansResponse(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlansPage(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplacquisition.domain.model.plans.BnplPlanItem("mock-account-123")))));
    }
}
