package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt", f = "FundingInstrumentMapper.kt", i = {0, 0, 0}, l = {45}, m = "toUiModel", n = {"$this$toUiModel", "balanceFormatter", "uiType"}, nl = {39}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class FundingInstrumentMapperKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModel(null, null, this);
    }

    FundingInstrumentMapperKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
