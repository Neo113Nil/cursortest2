package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl", f = "GeoCoderUseCaseImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {30}, m = "invoke", n = {"address", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GeoCoderUseCaseImpl$invoke$2"}, nl = {34}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class GeoCoderUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GeoCoderUseCaseImpl$invoke$1(com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl geoCoderUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.domain.usecase.GeoCoderUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getInputFormats = geoCoderUseCaseImpl;
    }
}
