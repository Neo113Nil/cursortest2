package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper", f = "ChangeFiMapper.kt", i = {0, 0, 0}, l = {142}, m = "toFundingInstrumentUiModel", n = {"fundingInstrument", "it", "$i$a$-let-ChangeFiMapper$toFundingInstrumentUiModel$formattedBalance$1"}, nl = {141}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiMapper$toFundingInstrumentUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.toFundingInstrumentUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiMapper$toFundingInstrumentUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper changeFiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiMapper$toFundingInstrumentUiModel$1> continuation) {
        super(continuation);
        this.getOutputFormats = changeFiMapper;
    }
}
