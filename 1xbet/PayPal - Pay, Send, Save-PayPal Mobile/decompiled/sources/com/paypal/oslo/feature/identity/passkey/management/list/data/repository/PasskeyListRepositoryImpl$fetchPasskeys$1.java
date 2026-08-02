package com.paypal.oslo.feature.identity.passkey.management.list.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl", f = "PasskeyListRepositoryImpl.kt", i = {0}, l = {82}, m = "fetchPasskeys", n = {"passkeyListQuery"}, nl = {92}, s = {"L$0"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyListRepositoryImpl$fetchPasskeys$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchPasskeys(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyListRepositoryImpl$fetchPasskeys$1(com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl passkeyListRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.list.data.repository.PasskeyListRepositoryImpl$fetchPasskeys$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = passkeyListRepositoryImpl;
    }
}
