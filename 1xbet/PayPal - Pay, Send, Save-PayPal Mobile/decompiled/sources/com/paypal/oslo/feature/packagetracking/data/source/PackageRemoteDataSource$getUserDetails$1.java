package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource", f = "PackageRemoteDataSource.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, m = "getUserDetails", n = {"query"}, nl = {630}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRemoteDataSource$getUserDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getUserDetails(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRemoteDataSource$getUserDetails$1(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserDetails$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = packageRemoteDataSource;
    }
}
