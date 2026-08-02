package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel", f = "DeleteEmailViewModel.kt", i = {0, 0, 0}, l = {103}, m = "handleError", n = {"error", "strategies", "strategy"}, nl = {105}, s = {"L$0", "L$1", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class DeleteEmailViewModel$handleError$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel.access$handleError(this.getOutputFormats, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteEmailViewModel$handleError$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$handleError$1> continuation) {
        super(continuation);
        this.getOutputFormats = deleteEmailViewModel;
    }
}
