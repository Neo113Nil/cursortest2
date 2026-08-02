package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl", f = "DocumentRepositoryImpl.kt", i = {0, 0, 0}, l = {96}, m = "getCountryMetadata", n = {com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "countryCode", "endpoint"}, nl = {97}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class DocumentRepositoryImpl$getCountryMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRepositoryImpl$getCountryMetadata$1(com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl documentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getCountryMetadata$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = documentRepositoryImpl;
    }
}
