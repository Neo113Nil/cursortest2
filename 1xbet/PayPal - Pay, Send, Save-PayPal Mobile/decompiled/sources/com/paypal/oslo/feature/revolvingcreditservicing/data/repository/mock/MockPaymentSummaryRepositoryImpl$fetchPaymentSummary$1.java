package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl", f = "MockPaymentSummaryRepositoryImpl.kt", i = {0}, l = {55}, m = "fetchPaymentSummary", n = {"request"}, nl = {57}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.fetchPaymentSummary(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl mockPaymentSummaryRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentSummaryRepositoryImpl$fetchPaymentSummary$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockPaymentSummaryRepositoryImpl;
    }
}
