package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl", f = "PackageRepositoryImpl.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "updatePackageNickname", n = {"carrierId", "trackingNumber", "nickname"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRepositoryImpl$updatePackageNickname$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.updatePackageNickname(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRepositoryImpl$updatePackageNickname$1(com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl packageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$updatePackageNickname$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = packageRepositoryImpl;
    }
}
