package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl", f = "PackageRepositoryImpl.kt", i = {0, 0, 0}, l = {49}, m = "getPackageDetail", n = {"carrierId", "trackingNumber", "transactionNumber"}, nl = {53}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRepositoryImpl$getPackageDetail$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getPackageDetail(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRepositoryImpl$getPackageDetail$1(com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl packageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$getPackageDetail$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = packageRepositoryImpl;
    }
}
