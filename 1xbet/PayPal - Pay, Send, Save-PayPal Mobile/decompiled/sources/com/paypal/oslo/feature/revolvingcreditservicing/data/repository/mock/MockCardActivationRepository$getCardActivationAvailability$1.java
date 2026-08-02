package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository", f = "MockCardActivationRepository.kt", i = {0, 1}, l = {33, 35}, m = "getCardActivationAvailability", n = {"creditProductIdentifier", "creditProductIdentifier"}, nl = {37, 36}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockCardActivationRepository$getCardActivationAvailability$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getCardActivationAvailability(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardActivationRepository$getCardActivationAvailability$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository mockCardActivationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCardActivationRepository$getCardActivationAvailability$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockCardActivationRepository;
    }
}
