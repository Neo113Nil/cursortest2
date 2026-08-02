package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase", f = "FormatSmartAuthAmountUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {35}, m = "invoke", n = {"entity", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "instrument", "amount", "rawAmount", "currencyCode", "config", "$i$f$map", "$i$f$mapTo", "$i$a$-map-FormatSmartAuthAmountUseCase$invoke$formattedInstruments$1"}, nl = {36}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class FormatSmartAuthAmountUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    int isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object toString;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.toString = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        return this.unwrapAs.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatSmartAuthAmountUseCase$invoke$1(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase formatSmartAuthAmountUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSmartAuthAmountUseCase$invoke$1> continuation) {
        super(continuation);
        this.unwrapAs = formatSmartAuthAmountUseCase;
    }
}
