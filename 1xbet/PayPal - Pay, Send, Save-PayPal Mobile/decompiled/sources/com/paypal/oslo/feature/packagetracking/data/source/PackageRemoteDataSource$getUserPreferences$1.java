package com.paypal.oslo.feature.packagetracking.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource", f = "PackageRemoteDataSource.kt", i = {0, 0, 0, 0}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED}, m = "getUserPreferences", n = {"preferenceType", "preferenceKey", "input", "query"}, nl = {630}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class PackageRemoteDataSource$getUserPreferences$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getUserPreferences(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PackageRemoteDataSource$getUserPreferences$1(com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource packageRemoteDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.data.source.PackageRemoteDataSource$getUserPreferences$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = packageRemoteDataSource;
    }
}
