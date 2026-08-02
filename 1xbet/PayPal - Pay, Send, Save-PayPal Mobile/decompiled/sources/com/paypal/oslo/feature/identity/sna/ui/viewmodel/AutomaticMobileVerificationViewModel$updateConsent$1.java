package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel", f = "AutomaticMobileVerificationViewModel.kt", i = {0, 0}, l = {121}, m = "updateConsent$identity_prodRelease", n = {"eventDispatcher", "enabled"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class AutomaticMobileVerificationViewModel$updateConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.updateConsent$identity_prodRelease(false, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutomaticMobileVerificationViewModel$updateConsent$1(com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel automaticMobileVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel$updateConsent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = automaticMobileVerificationViewModel;
    }
}
