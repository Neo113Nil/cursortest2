package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl", f = "IdentityLoginFlowStoreImpl.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "processAction", n = {"action", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class IdentityLoginFlowStoreImpl$processAction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityLoginFlowStoreImpl$processAction$1(com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl identityLoginFlowStoreImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityLoginFlowStoreImpl$processAction$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = identityLoginFlowStoreImpl;
    }
}
