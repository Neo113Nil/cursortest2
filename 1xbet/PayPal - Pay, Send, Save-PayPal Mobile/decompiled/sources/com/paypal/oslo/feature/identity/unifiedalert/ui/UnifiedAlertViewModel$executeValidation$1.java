package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel", f = "UnifiedAlertViewModel.kt", i = {0, 0, 0, 0}, l = {256}, m = "executeValidation", n = {"state", "action", "eventDispatcher", "successEvent"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class UnifiedAlertViewModel$executeValidation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.access$executeValidation(this.getHighSpeedVideoSizesFor, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertViewModel$executeValidation$1(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$executeValidation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = unifiedAlertViewModel;
    }
}
