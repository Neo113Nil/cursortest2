package com.paypal.oslo.feature.identity.foundation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl", f = "IdentitySessionImpl.kt", i = {0, 1, 2}, l = {50, 53, 56}, m = "logout", n = {"unbindDevice", "unbindDevice", "unbindDevice"}, nl = {53, 56, 57}, s = {"Z$0", "Z$0", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class IdentitySessionImpl$logout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.logout(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentitySessionImpl$logout$1(com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl identitySessionImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.foundation.IdentitySessionImpl$logout$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = identitySessionImpl;
    }
}
