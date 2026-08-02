package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel", f = "ChangeFiViewModel.kt", i = {0, 0, 1, 1, 1, 1, 1}, l = {130, 147}, m = "fetchAutopayFundingInstruments", n = {"creditAccountId", "creditProductIdentifier", "creditAccountId", "creditProductIdentifier", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "walletFiIds"}, nl = {129, 153}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiViewModel$fetchAutopayFundingInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchAutopayFundingInstruments(this.getOutputFormats, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiViewModel$fetchAutopayFundingInstruments$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchAutopayFundingInstruments$1> continuation) {
        super(continuation);
        this.getOutputFormats = changeFiViewModel;
    }
}
