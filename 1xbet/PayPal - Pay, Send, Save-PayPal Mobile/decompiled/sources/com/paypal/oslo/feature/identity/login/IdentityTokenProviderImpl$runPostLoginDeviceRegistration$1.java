package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl", f = "IdentityTokenProviderImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m = "runPostLoginDeviceRegistration", n = {}, nl = {263}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$runPostLoginDeviceRegistration$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = identityTokenProviderImpl;
    }
}
