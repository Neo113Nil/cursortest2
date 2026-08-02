package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase", f = "PollQrcSessionUseCase.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {113, 120}, m = "pollOnce", n = {"sessionInfo", "isLastPollCall", "sessionInfo", "this_$iv", "qrcSession", "isLastPollCall", "$i$f$fold", "$i$a$-fold-PollQrcSessionUseCase$pollOnce$3"}, nl = {114, 159}, s = {"L$0", "Z$0", "L$0", "L$1", "L$2", "Z$0", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class PollQrcSessionUseCase$pollOnce$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase getInputSizeshNQ4ISI;
    boolean getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase.access$pollOnce(this.getInputSizeshNQ4ISI, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PollQrcSessionUseCase$pollOnce$1(com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase pollQrcSessionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.usecase.PollQrcSessionUseCase$pollOnce$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = pollQrcSessionUseCase;
    }
}
