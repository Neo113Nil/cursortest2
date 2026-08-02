package com.paypal.oslo.feature.identity.login;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl", f = "IdentityTokenProviderImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {329, 199, 340, 206}, m = "fetchWithQueue", n = {"mutex", "ongoingFetch", "setOngoingFetch", "fetchOperation", "$this$withLock_u24default$iv", "$i$f$withLock", "mutex", "ongoingFetch", "setOngoingFetch", "fetchOperation", "deferred", "isOwner", "mutex", "ongoingFetch", "setOngoingFetch", "fetchOperation", "deferred", "result", "$this$withLock_u24default$iv", "isOwner", "$i$f$withLock", "mutex", "ongoingFetch", "setOngoingFetch", "fetchOperation", "deferred", "isOwner"}, nl = {com.visa.cbp.getCertUsage.setAucAID, 200, 341, -1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class IdentityTokenProviderImpl$fetchWithQueue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputSizes.getHighSpeedVideoFpsRanges(null, null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityTokenProviderImpl$fetchWithQueue$1(com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl identityTokenProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.IdentityTokenProviderImpl$fetchWithQueue$1> continuation) {
        super(continuation);
        this.getOutputSizes = identityTokenProviderImpl;
    }
}
