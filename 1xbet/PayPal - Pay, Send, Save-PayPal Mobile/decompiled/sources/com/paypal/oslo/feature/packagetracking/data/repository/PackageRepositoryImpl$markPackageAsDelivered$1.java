package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl", f = "PackageRepositoryImpl.kt", i = {0, 0}, l = {258}, m = "markPackageAsDelivered", n = {"carrierId", "trackingNumber"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRepositoryImpl$markPackageAsDelivered$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.markPackageAsDelivered(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRepositoryImpl$markPackageAsDelivered$1(com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl packageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$markPackageAsDelivered$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = packageRepositoryImpl;
    }
}
