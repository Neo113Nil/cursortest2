package com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel", f = "CrossBorderViewModel.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m = "fetchFxQuote", n = {com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, "senderAmount", "receiverAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TARGET_CURRENCY_CODE, "eventDispatcher"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class CrossBorderViewModel$fetchFxQuote$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrossBorderViewModel$fetchFxQuote$1(com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel crossBorderViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.p2p.ui.crossborder.viewmodels.CrossBorderViewModel$fetchFxQuote$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = crossBorderViewModel;
    }
}
