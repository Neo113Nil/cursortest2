package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource", f = "PackageRemoteDataSource.kt", i = {0, 0}, l = {404}, m = "getEmailLinkStatus", n = {"fetchPolicy", "query"}, nl = {630}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRemoteDataSource$getEmailLinkStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getEmailLinkStatus(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRemoteDataSource$getEmailLinkStatus$1(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getEmailLinkStatus$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = packageRemoteDataSource;
    }
}
