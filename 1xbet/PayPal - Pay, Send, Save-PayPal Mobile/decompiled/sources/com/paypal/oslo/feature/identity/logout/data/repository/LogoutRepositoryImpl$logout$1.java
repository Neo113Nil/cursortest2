package com.paypal.oslo.feature.identity.logout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl", f = "LogoutRepositoryImpl.kt", i = {0}, l = {49}, m = "logout", n = {"unbindDevice"}, nl = {39}, s = {"Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class LogoutRepositoryImpl$logout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.logout(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutRepositoryImpl$logout$1(com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl logoutRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.logout.data.repository.LogoutRepositoryImpl$logout$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = logoutRepositoryImpl;
    }
}
