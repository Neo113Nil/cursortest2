package com.paypal.oslo.feature.subscriptions.hub.ui.models;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt", f = "SubscriptionItemUiModel.kt", i = {0, 0, 1, 1, 2, 2}, l = {50, 51, 53}, m = "toUiModel", n = {"$this$toUiModel", "formatHelper", "$this$toUiModel", "formatHelper", "$this$toUiModel", "formatHelper"}, nl = {51, 52, 46}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionItemUiModelKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt.toUiModel(null, null, this);
    }

    SubscriptionItemUiModelKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModelKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
