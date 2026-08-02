package com.paypal.oslo.app.identity;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.identity.LogoutCoordinatorImpl", f = "LogoutCoordinatorImpl.kt", i = {}, l = {35}, m = "logout", n = {}, nl = {36}, s = {}, v = 2)
/* loaded from: classes4.dex */
final class LogoutCoordinatorImpl$logout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.app.identity.LogoutCoordinatorImpl getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.logout(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutCoordinatorImpl$logout$1(com.paypal.oslo.app.identity.LogoutCoordinatorImpl logoutCoordinatorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.identity.LogoutCoordinatorImpl$logout$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = logoutCoordinatorImpl;
    }
}
