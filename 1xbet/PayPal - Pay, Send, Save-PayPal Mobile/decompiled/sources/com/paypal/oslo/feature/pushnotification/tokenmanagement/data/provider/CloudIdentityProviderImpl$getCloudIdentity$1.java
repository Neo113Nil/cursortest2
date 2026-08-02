package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl", f = "CloudIdentityProviderImpl.kt", i = {}, l = {26}, m = "getCloudIdentity", n = {}, nl = {27}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class CloudIdentityProviderImpl$getCloudIdentity$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getCloudIdentity(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudIdentityProviderImpl$getCloudIdentity$1(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl cloudIdentityProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pushnotification.tokenmanagement.data.provider.CloudIdentityProviderImpl$getCloudIdentity$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cloudIdentityProviderImpl;
    }
}
