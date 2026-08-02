package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository", f = "MockPrequalificationSummaryRepository.kt", i = {0}, l = {34}, m = "getPrequalificationSummary", n = {"creditProductIdentifiers"}, nl = {35}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockPrequalificationSummaryRepository$getPrequalificationSummary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getPrequalificationSummary(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPrequalificationSummaryRepository$getPrequalificationSummary$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository mockPrequalificationSummaryRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository$getPrequalificationSummary$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockPrequalificationSummaryRepository;
    }
}
