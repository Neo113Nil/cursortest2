package com.paypal.oslo.feature.identity.logincontroller.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel", f = "AuthenticateViewModel.kt", i = {}, l = {100}, m = "getRememberedUserData", n = {}, nl = {101}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AuthenticateViewModel$getRememberedUserData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getRememberedUserData(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthenticateViewModel$getRememberedUserData$1(com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel authenticateViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logincontroller.ui.AuthenticateViewModel$getRememberedUserData$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = authenticateViewModel;
    }
}
