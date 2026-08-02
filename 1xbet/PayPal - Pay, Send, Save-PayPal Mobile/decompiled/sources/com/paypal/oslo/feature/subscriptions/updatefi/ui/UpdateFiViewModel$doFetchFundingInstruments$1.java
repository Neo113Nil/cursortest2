package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel", f = "UpdateFiViewModel.kt", i = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 186, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m = "doFetchFundingInstruments", n = {"this_$iv", "it$iv", "error", "$i$f$onLeft", "$i$a$-also-Either$onLeft$1$iv", "$i$a$-onLeft-UpdateFiViewModel$doFetchFundingInstruments$2", "this_$iv", "it$iv", "result", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UpdateFiViewModel$doFetchFundingInstruments$3"}, nl = {185, 187, 192}, s = {"L$0", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiViewModel$doFetchFundingInstruments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.access$doFetchFundingInstruments(this.getInputSizeshNQ4ISI, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiViewModel$doFetchFundingInstruments$1(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$doFetchFundingInstruments$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = updateFiViewModel;
    }
}
