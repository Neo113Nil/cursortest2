package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl", f = "IdentityTokenProviderImpl.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE}, m = "fetchUserTokenViaLLSLogin", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl.access$fetchUserTokenViaLLSLogin(this.Camera2StreamConfigurationMap, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchUserTokenViaLLSLogin$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = identityTokenProviderImpl;
    }
}
