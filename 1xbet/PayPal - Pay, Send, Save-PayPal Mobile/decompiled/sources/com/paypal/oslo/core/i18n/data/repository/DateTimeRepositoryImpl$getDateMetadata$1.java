package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl", f = "DateTimeRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {65}, m = "getDateMetadata", n = {"locale", "userLocale", "languageCode", "languageTag"}, nl = {66}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes10.dex */
final class DateTimeRepositoryImpl$getDateMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getDateMetadata(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DateTimeRepositoryImpl$getDateMetadata$1(com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl dateTimeRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.DateTimeRepositoryImpl$getDateMetadata$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = dateTimeRepositoryImpl;
    }
}
