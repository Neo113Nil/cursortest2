package com.paypal.oslo.feature.bnplservicing.ui.changefi;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel", f = "ChangeFiViewModel.kt", i = {0, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 188}, m = "fetchMakeAPaymentFundingInstruments", n = {"creditAccountId", "creditAccountId", "result", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "walletFiIds"}, nl = {171, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel.access$fetchMakeAPaymentFundingInstruments(this.getOutputMinFrameDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1(com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel changeFiViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.changefi.ChangeFiViewModel$fetchMakeAPaymentFundingInstruments$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = changeFiViewModel;
    }
}
