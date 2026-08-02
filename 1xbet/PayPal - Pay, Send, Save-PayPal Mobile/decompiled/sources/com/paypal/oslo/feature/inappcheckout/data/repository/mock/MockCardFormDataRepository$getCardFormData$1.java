package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository", f = "MockCardFormDataRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {49}, m = "getCardFormData", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "fiId", "raise$iv$iv$iv", "$this$getCardFormData_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-MockCardFormDataRepository$getCardFormData$2"}, nl = {50}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class MockCardFormDataRepository$getCardFormData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.getCardFormData(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockCardFormDataRepository$getCardFormData$1(com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository mockCardFormDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository$getCardFormData$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = mockCardFormDataRepository;
    }
}
