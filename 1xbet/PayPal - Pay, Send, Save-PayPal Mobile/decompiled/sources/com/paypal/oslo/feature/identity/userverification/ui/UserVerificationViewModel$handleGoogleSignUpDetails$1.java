package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel", f = "UserVerificationViewModel.kt", i = {0, 0}, l = {314}, m = "handleGoogleSignUpDetails", n = {"success", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {803}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$handleGoogleSignUpDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$handleGoogleSignUpDetails(this.getHighSpeedVideoSizes, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$handleGoogleSignUpDetails$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$handleGoogleSignUpDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = userVerificationViewModel;
    }
}
