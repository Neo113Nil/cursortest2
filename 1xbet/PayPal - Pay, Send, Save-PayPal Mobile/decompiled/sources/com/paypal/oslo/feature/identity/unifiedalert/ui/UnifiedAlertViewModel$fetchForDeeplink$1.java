package com.paypal.oslo.feature.identity.unifiedalert.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel", f = "UnifiedAlertViewModel.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {115, 116, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 148}, m = "fetchForDeeplink", n = {"docId", "docId", "deviceToken", "docId", "deviceToken", "publicCredential", "input", "docId", "deviceToken", "publicCredential", "alert"}, nl = {116, 118, 314, 149}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class UnifiedAlertViewModel$fetchForDeeplink$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel.access$fetchForDeeplink(this.getOutputMinFrameDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertViewModel$fetchForDeeplink$1(com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel unifiedAlertViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.ui.UnifiedAlertViewModel$fetchForDeeplink$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = unifiedAlertViewModel;
    }
}
