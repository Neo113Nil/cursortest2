package com.paypal.oslo.feature.identity.login.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl", f = "InContextLoginProviderImpl.kt", i = {}, l = {42}, m = "isInContextLoginEnabled", n = {}, nl = {43}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class InContextLoginProviderImpl$isInContextLoginEnabled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.isInContextLoginEnabled(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InContextLoginProviderImpl$isInContextLoginEnabled$1(com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl inContextLoginProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.data.repository.InContextLoginProviderImpl$isInContextLoginEnabled$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = inContextLoginProviderImpl;
    }
}
