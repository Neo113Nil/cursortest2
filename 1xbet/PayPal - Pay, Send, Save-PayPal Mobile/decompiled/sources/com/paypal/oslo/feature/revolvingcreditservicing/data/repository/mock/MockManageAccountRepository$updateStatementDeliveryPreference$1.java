package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository", f = "MockManageAccountRepository.kt", i = {0, 0, 0}, l = {53}, m = "updateStatementDeliveryPreference", n = {"creditProductIdentifier", "creditAccountId", "enrollInPaper"}, nl = {56}, s = {"L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockManageAccountRepository$updateStatementDeliveryPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.updateStatementDeliveryPreference(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockManageAccountRepository$updateStatementDeliveryPreference$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository mockManageAccountRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockManageAccountRepository$updateStatementDeliveryPreference$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = mockManageAccountRepository;
    }
}
