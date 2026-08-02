package com.paypal.oslo.feature.taptopay.domain.usecase.card;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase", f = "SetAsDefaultIfNeededUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {125}, m = "shouldSetAsDefault", n = {"setAsDefault", "raise$iv$iv$iv", "$this$shouldSetAsDefault_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-SetAsDefaultIfNeededUseCase$shouldSetAsDefault$2"}, nl = {145}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes15.dex */
final class SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1(com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase$shouldSetAsDefault$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = setAsDefaultIfNeededUseCase;
    }
}
