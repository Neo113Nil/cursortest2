package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel", f = "MakePrimaryEmailViewModel.kt", i = {0, 0, 0}, l = {103}, m = "handleError", n = {"error", "strategies", "strategy"}, nl = {105}, s = {"L$0", "L$1", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class MakePrimaryEmailViewModel$handleError$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel.access$handleError(this.getHighSpeedVideoSizesFor, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePrimaryEmailViewModel$handleError$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel$handleError$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = makePrimaryEmailViewModel;
    }
}
