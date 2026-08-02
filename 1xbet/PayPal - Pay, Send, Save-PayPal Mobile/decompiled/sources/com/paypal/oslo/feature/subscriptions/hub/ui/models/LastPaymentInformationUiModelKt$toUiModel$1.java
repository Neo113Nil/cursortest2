package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt", f = "LastPaymentInformationUiModel.kt", i = {0, 0, 0, 0, 0, 0}, l = {48}, m = "toUiModel", n = {"$this$toUiModel", "formatHelper", "offSetDateTime", "parsedYear", "currentYear", "isCurrentYear"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class LastPaymentInformationUiModelKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt.toUiModel(null, null, this);
    }

    LastPaymentInformationUiModelKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.ui.models.LastPaymentInformationUiModelKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
