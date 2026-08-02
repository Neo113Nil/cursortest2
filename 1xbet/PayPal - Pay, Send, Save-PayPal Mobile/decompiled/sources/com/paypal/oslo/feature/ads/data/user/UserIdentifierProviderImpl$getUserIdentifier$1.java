package com.paypal.oslo.feature.ads.data.user;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl", f = "UserIdentifierProviderImpl.kt", i = {}, l = {46}, m = "getUserIdentifier", n = {}, nl = {47}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class UserIdentifierProviderImpl$getUserIdentifier$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getUserIdentifier(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserIdentifierProviderImpl$getUserIdentifier$1(com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl userIdentifierProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.user.UserIdentifierProviderImpl$getUserIdentifier$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = userIdentifierProviderImpl;
    }
}
