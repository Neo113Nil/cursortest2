package com.paypal.oslo.feature.cashin.domain.geocoding;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder", f = "CashInPlacesGeocoder.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {48, 60}, m = "searchLocation", n = {"query", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "request", "query", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "request", "response", "predictions", "placeId", "placeFields", "placeRequest"}, nl = {49, 61}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes5.dex */
final class CashInPlacesGeocoder$searchLocation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.searchLocation(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInPlacesGeocoder$searchLocation$1(com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder cashInPlacesGeocoder, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.geocoding.CashInPlacesGeocoder$searchLocation$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = cashInPlacesGeocoder;
    }
}
