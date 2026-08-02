package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper", f = "VirtualCardOverviewUiMapper.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {62, 90}, m = "toUiModel", n = {"model", "details", "addToWalletState", "model", "details", "formattedMoney", "formattedDuration", "addToWalletState"}, nl = {64, 91}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewUiMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper coroutineCreation;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
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
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    boolean isOutputSupportedFor;
    int isOutputSupportedForhNQ4ISI;
    boolean toString;
    boolean unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.isOutputSupportedForhNQ4ISI |= Integer.MIN_VALUE;
        return this.coroutineCreation.toUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewUiMapper$toUiModel$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper virtualCardOverviewUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper$toUiModel$1> continuation) {
        super(continuation);
        this.coroutineCreation = virtualCardOverviewUiMapper;
    }
}
