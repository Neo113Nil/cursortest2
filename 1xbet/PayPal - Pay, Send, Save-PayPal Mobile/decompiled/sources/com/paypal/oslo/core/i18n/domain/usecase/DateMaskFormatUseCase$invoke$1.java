package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase", f = "DateMaskFormatUseCase.kt", i = {0, 0, 0, 0, 0}, l = {61}, m = "invoke", n = {com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "$this$flatMap$iv", "parts", "$i$f$flatMap", "$i$a$-flatMap-DateMaskFormatUseCase$invoke$2"}, nl = {79}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class DateMaskFormatUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateMaskFormatUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase dateMaskFormatUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = dateMaskFormatUseCase;
    }
}
