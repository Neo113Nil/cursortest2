package com.paypal.oslo.feature.inappcheckout.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl", f = "InitializeNativeRypCheckoutRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {105}, m = "fetchInitializeNativeRypCheckout", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "tokenType", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "raise$iv$iv$iv", "$this$fetchInitializeNativeRypCheckout_u24lambda_u240", "tokenTypeEnum", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$2"}, nl = {115}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1(com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl$fetchInitializeNativeRypCheckout$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = initializeNativeRypCheckoutRepositoryImpl;
    }
}
