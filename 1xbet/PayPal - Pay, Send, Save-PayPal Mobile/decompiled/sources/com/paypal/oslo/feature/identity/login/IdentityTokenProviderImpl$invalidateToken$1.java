package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl", f = "IdentityTokenProviderImpl.kt", i = {0, 1, 1, 1}, l = {306, 329}, m = "invalidateToken", n = {"tokenType", "tokenType", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {307, com.visa.cbp.getCertUsage.setAucAID}, s = {"L$0", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class IdentityTokenProviderImpl$invalidateToken$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invalidateToken(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityTokenProviderImpl$invalidateToken$1(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$invalidateToken$1> continuation) {
        super(continuation);
        this.getOutputFormats = identityTokenProviderImpl;
    }
}
