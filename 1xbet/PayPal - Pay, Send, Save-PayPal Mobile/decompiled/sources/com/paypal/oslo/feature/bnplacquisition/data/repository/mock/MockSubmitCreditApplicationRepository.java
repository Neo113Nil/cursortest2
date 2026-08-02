package com.paypal.oslo.feature.bnplacquisition.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/mock/MockSubmitCreditApplicationRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/SubmitCreditApplicationRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetails;", "submitCreditApplication", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/SubmitCreditApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MockSubmitCreditApplicationRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MockSubmitCreditApplicationRepository() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object submitCreditApplication(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.SubmitCreditApplicationRequest submitCreditApplicationRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository$submitCreditApplication$1 mockSubmitCreditApplicationRepository$submitCreditApplication$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository$submitCreditApplication$1) {
            mockSubmitCreditApplicationRepository$submitCreditApplication$1 = (com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository$submitCreditApplication$1) continuation;
            if ((mockSubmitCreditApplicationRepository$submitCreditApplication$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                mockSubmitCreditApplicationRepository$submitCreditApplication$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = mockSubmitCreditApplicationRepository$submitCreditApplication$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockSubmitCreditApplicationRepository$submitCreditApplication$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    mockSubmitCreditApplicationRepository$submitCreditApplication$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(submitCreditApplicationRequest);
                    mockSubmitCreditApplicationRepository$submitCreditApplication$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(2000L, mockSubmitCreditApplicationRepository$submitCreditApplication$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication("mock-credit-account-id", null, null, null, null, null, 62, null)), null, 2, null));
            }
        }
        mockSubmitCreditApplicationRepository$submitCreditApplication$1 = new com.paypal.oslo.feature.bnplacquisition.data.repository.mock.MockSubmitCreditApplicationRepository$submitCreditApplication$1(this, continuation);
        java.lang.Object obj2 = mockSubmitCreditApplicationRepository$submitCreditApplication$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockSubmitCreditApplicationRepository$submitCreditApplication$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return new arrow.core.Ior.Right(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetails(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess(new com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccessCreditApplication("mock-credit-account-id", null, null, null, null, null, 62, null)), null, 2, null));
    }
}
