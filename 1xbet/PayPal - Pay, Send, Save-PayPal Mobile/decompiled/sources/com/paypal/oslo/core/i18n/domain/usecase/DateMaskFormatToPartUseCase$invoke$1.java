package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase", f = "DateMaskFormatToPartUseCase.kt", i = {0, 0, 0, 0, 0}, l = {63}, m = "invoke", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "$this$flatMap$iv", "parts", "$i$f$flatMap", "$i$a$-flatMap-DateMaskFormatToPartUseCase$invoke$2"}, nl = {72}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class DateMaskFormatToPartUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateMaskFormatToPartUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase dateMaskFormatToPartUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = dateMaskFormatToPartUseCase;
    }
}
