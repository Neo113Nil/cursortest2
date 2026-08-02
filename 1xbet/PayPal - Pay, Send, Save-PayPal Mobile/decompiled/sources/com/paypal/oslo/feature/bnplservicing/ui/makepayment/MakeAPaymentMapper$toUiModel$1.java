package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper", f = "MakeAPaymentMapper.kt", i = {0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {54, 55, 73, 76, 89}, m = "toUiModel", n = {"$this$toUiModel", "$this$toUiModel", "$this$toUiModel", "defaultFundingInstrument", "$this$toUiModel", "defaultFundingInstrument", "$this$toUiModel", "defaultFundingInstrument", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "it", "$i$f$map", "$i$f$mapTo", "$i$a$-map-MakeAPaymentMapper$toUiModel$3"}, nl = {55, 54, 72, 75, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object ArtificialStackFrames;
    int Camera2StreamConfigurationMap;
    java.lang.Object CoroutineDebuggingKt;
    int coroutineBoundary;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper coroutineCreation;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
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
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    java.lang.Object isOutputSupportedFor;
    java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.ArtificialStackFrames = obj;
        this.coroutineBoundary |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.coroutineCreation.getHighSpeedVideoFpsRanges(null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakeAPaymentMapper$toUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toUiModel$1> continuation) {
        super(continuation);
        this.coroutineCreation = makeAPaymentMapper;
    }
}
