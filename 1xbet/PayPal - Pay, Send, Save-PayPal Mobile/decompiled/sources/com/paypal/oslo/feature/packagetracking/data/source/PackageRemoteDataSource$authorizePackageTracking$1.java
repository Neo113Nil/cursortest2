package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource", f = "PackageRemoteDataSource.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "authorizePackageTracking", n = {"provider", "authorizationCode", "state", "input", "mutation"}, nl = {630}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRemoteDataSource$authorizePackageTracking$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getInputFormats.authorizePackageTracking(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRemoteDataSource$authorizePackageTracking$1(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$authorizePackageTracking$1> continuation) {
        super(continuation);
        this.getInputFormats = packageRemoteDataSource;
    }
}
