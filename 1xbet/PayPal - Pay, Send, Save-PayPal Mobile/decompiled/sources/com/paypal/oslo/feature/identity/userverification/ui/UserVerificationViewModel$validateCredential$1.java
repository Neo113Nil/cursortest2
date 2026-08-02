package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel", f = "UserVerificationViewModel.kt", i = {0}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET}, m = "validateCredential", n = {"credential"}, nl = {427}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$validateCredential$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$validateCredential(this.getHighSpeedVideoSizes, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$validateCredential$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$validateCredential$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = userVerificationViewModel;
    }
}
