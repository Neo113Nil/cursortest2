package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase", f = "FormatCurrencyUseCase.kt", i = {0}, l = {204}, m = "fetchCurrencyMetadata", n = {"locale"}, nl = {205}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class FormatCurrencyUseCase$fetchCurrencyMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatCurrencyUseCase$fetchCurrencyMetadata$1(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase$fetchCurrencyMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = formatCurrencyUseCase;
    }
}
