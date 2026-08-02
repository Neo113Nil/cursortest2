package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository", f = "MockCardRepository.kt", i = {0, 0, 0, 0, 0, 0}, l = {42}, m = "getFIMetadata", n = {"raise$iv$iv$iv", "$this$getFIMetadata_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-MockCardRepository$getFIMetadata$2"}, nl = {43}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class MockCardRepository$getFIMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.getFIMetadata(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardRepository$getFIMetadata$1(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository mockCardRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository$getFIMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = mockCardRepository;
    }
}
