package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel", f = "AutomaticMobileVerificationViewModel.kt", i = {0}, l = {83}, m = "loadConsentStatus$identity_prodRelease", n = {"eventDispatcher"}, nl = {84}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class AutomaticMobileVerificationViewModel$loadConsentStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.loadConsentStatus$identity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticMobileVerificationViewModel$loadConsentStatus$1(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel automaticMobileVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$loadConsentStatus$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = automaticMobileVerificationViewModel;
    }
}
