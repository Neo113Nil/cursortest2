package com.paypal.oslo.feature.subscriptions.details.ui.model;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt", f = "SubscriptionDetailsUiModel.kt", i = {0, 0}, l = {43}, m = "toUiModel", n = {"$this$toUiModel", "formatHelper"}, nl = {50}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionDetailsUiModelKt$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt.toUiModel(null, null, this);
    }

    SubscriptionDetailsUiModelKt$toUiModel$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.ui.model.SubscriptionDetailsUiModelKt$toUiModel$1> continuation) {
        super(continuation);
    }
}
