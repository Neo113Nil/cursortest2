package com.paypal.oslo.feature.businesshome.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase", f = "EvaluateAccountSetupStatusUseCase.kt", i = {2, 2, 2, 2}, l = {38, 42, 46}, m = "invoke", n = {"this_$iv", "status", "$i$f$fold", "$i$a$-fold-EvaluateAccountSetupStatusUseCase$invoke$3"}, nl = {39, 63, 47}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class EvaluateAccountSetupStatusUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EvaluateAccountSetupStatusUseCase$invoke$1(com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase evaluateAccountSetupStatusUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = evaluateAccountSetupStatusUseCase;
    }
}
