package com.paypal.oslo.feature.inappcheckout.ui.profile.screen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt", f = "ProfileScreen.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "handleProfileEffects", n = {"viewModel", "inAppCheckoutCoordinator", "navigatingBackMsg", "onToastMessageChange"}, nl = {-1}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes13.dex */
final class ProfileScreenKt$handleProfileEffects$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt.access$handleProfileEffects(null, null, null, null, this);
    }

    ProfileScreenKt$handleProfileEffects$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.profile.screen.ProfileScreenKt$handleProfileEffects$1> continuation) {
        super(continuation);
    }
}
