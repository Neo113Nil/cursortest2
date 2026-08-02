package com.paypal.oslo.feature.subscriptions.businesseshub.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt", f = "LinkedBusinessAgreementItemUiModel.kt", i = {0, 0, 1, 1}, l = {37, 39}, m = "toUiModel", n = {"$this$toUiModel", "formatHelper", "$this$toUiModel", "formatHelper"}, nl = {38, 40}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class LinkedBusinessAgreementItemUiModelKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt.toUiModel(null, null, this);
    }

    LinkedBusinessAgreementItemUiModelKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.ui.LinkedBusinessAgreementItemUiModelKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
