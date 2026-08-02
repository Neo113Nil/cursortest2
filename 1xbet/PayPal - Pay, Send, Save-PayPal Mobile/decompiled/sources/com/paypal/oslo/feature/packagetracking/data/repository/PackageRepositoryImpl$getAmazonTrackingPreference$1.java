package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl", f = "PackageRepositoryImpl.kt", i = {}, l = {269}, m = "getAmazonTrackingPreference", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PackageRepositoryImpl$getAmazonTrackingPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getAmazonTrackingPreference(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRepositoryImpl$getAmazonTrackingPreference$1(com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl packageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getAmazonTrackingPreference$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = packageRepositoryImpl;
    }
}
