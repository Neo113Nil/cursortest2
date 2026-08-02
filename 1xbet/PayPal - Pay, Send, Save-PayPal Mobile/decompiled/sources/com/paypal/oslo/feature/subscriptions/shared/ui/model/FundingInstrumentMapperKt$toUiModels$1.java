package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt", f = "FundingInstrumentMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {188}, m = "toUiModels", n = {"$this$toUiModels", "balanceFormatter", "$this$map$iv", "$this$mapTo$iv$iv", "destination$iv$iv", "item$iv$iv", "fi", "$i$f$map", "$i$f$mapTo", "$i$a$-map-FundingInstrumentMapperKt$toUiModels$2"}, nl = {192}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes15.dex */
final class FundingInstrumentMapperKt$toUiModels$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt.toUiModels(null, null, this);
    }

    FundingInstrumentMapperKt$toUiModels$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMapperKt$toUiModels$1> continuation) {
        super(continuation);
    }
}
