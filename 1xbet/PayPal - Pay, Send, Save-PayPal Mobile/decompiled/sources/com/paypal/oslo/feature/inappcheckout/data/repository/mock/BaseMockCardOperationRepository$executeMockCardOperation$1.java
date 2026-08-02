package com.paypal.oslo.feature.inappcheckout.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository", f = "BaseMockCardOperationRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {51}, m = "executeMockCardOperation", n = {"mockFileName", "operationKey", "errorResponseType", "raise$iv$iv$iv", "$this$executeMockCardOperation_u24lambda_u240", "unknownErrorResId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-BaseMockCardOperationRepository$executeMockCardOperation$2"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes13.dex */
final class BaseMockCardOperationRepository$executeMockCardOperation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputMinFrameDurationlomOqCM |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.executeMockCardOperation(null, null, null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseMockCardOperationRepository$executeMockCardOperation$1(com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository baseMockCardOperationRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.mock.BaseMockCardOperationRepository$executeMockCardOperation$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = baseMockCardOperationRepository;
    }
}
