package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl", f = "PackageRepositoryImpl.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m = "saveAmazonTrackingPreference", n = {"enabled"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE}, s = {"Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRepositoryImpl$saveAmazonTrackingPreference$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.saveAmazonTrackingPreference(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRepositoryImpl$saveAmazonTrackingPreference$1(com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl packageRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.repository.PackageRepositoryImpl$saveAmazonTrackingPreference$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = packageRepositoryImpl;
    }
}
