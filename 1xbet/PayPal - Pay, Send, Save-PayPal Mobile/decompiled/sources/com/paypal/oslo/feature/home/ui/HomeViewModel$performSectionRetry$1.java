package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.HomeViewModel", f = "HomeViewModel.kt", i = {0, 0, 0, 0}, l = {382}, m = "performSectionRetry", n = {"sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "currentSections", "eventDispatcher"}, nl = {473}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes12.dex */
final class HomeViewModel$performSectionRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.home.ui.HomeViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.home.ui.HomeViewModel.access$performSectionRetry(this.getInputFormats, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeViewModel$performSectionRetry$1(com.paypal.oslo.feature.home.ui.HomeViewModel homeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.HomeViewModel$performSectionRetry$1> continuation) {
        super(continuation);
        this.getInputFormats = homeViewModel;
    }
}
