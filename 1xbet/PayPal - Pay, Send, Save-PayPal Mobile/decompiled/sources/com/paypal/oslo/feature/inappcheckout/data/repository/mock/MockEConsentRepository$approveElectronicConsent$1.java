package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository", f = "MockEConsentRepository.kt", i = {0}, l = {28}, m = com.paypal.oslo.feature.inappcheckout.graphql.checkout.ApproveElectronicConsentMutation.OPERATION_NAME, n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {30}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class MockEConsentRepository$approveElectronicConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.approveElectronicConsent(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockEConsentRepository$approveElectronicConsent$1(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository mockEConsentRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockEConsentRepository$approveElectronicConsent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockEConsentRepository;
    }
}
