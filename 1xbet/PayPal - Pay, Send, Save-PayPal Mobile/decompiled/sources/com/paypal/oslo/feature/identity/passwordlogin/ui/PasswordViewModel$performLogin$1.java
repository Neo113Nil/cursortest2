package com.paypal.oslo.feature.identity.passwordlogin.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel", f = "PasswordViewModel.kt", i = {0, 0, 0, 0, 0}, l = {166}, m = "performLogin$identity_prodRelease", n = {"email", "password", "requestId", "authIntent", "request"}, nl = {167}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class PasswordViewModel$performLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.performLogin$identity_prodRelease(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasswordViewModel$performLogin$1(com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel passwordViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passwordlogin.ui.PasswordViewModel$performLogin$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = passwordViewModel;
    }
}
