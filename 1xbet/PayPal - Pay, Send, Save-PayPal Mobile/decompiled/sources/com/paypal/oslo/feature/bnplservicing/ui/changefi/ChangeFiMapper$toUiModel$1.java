package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper", f = "ChangeFiMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {120}, m = "toUiModel", n = {"args", "it", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "fi", "amount", "$i$a$-let-ChangeFiMapper$toUiModel$2", "$i$f$map", "$i$f$mapTo", "$i$a$-map-ChangeFiMapper$toUiModel$2$1", "$i$a$-let-ChangeFiMapper$toUiModel$2$1$formattedBalance$1"}, nl = {119}, s = {"L$0", "L$1", "L$4", "L$5", "L$6", "L$8", "L$9", "L$11", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    int isOutputSupportedFor;
    /* synthetic */ java.lang.Object isOutputSupportedForhNQ4ISI;
    java.lang.Object toString;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.isOutputSupportedForhNQ4ISI = obj;
        this.isOutputSupportedFor |= Integer.MIN_VALUE;
        return this.unwrapAs.toUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiMapper$toUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper$toUiModel$1> continuation) {
        super(continuation);
        this.unwrapAs = changeFiMapper;
    }
}
