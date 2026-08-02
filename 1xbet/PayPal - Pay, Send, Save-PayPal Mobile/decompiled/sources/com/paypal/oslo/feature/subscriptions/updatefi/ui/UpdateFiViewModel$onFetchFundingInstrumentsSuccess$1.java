package com.paypal.oslo.feature.subscriptions.updatefi.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel", f = "UpdateFiViewModel.kt", i = {0, 0, 0, 1, 1, 2, 2, 2, 2}, l = {201, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "onFetchFundingInstrumentsSuccess", n = {"result", "it", "$i$a$-let-UpdateFiViewModel$onFetchFundingInstrumentsSuccess$firstFundingInstrument$1", "result", "firstFundingInstrument", "result", "firstFundingInstrument", "fundingInstrumentsUiModels", "preferredFundingInstrument"}, nl = {202, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class UpdateFiViewModel$onFetchFundingInstrumentsSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateFiViewModel$onFetchFundingInstrumentsSuccess$1(com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel updateFiViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel$onFetchFundingInstrumentsSuccess$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = updateFiViewModel;
    }
}
