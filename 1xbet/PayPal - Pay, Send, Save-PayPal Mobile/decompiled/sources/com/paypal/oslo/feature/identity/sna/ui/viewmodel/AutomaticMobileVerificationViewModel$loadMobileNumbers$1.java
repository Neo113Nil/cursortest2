package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel", f = "AutomaticMobileVerificationViewModel.kt", i = {0}, l = {105}, m = "loadMobileNumbers$identity_prodRelease", n = {"eventDispatcher"}, nl = {106}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AutomaticMobileVerificationViewModel$loadMobileNumbers$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.loadMobileNumbers$identity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticMobileVerificationViewModel$loadMobileNumbers$1(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel automaticMobileVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadMobileNumbers$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = automaticMobileVerificationViewModel;
    }
}
