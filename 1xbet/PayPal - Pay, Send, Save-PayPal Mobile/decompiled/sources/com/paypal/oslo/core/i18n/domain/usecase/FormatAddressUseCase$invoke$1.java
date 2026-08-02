package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase", f = "FormatAddressUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {102}, m = "invoke", n = {"address", "addressConfiguration", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "locale", "metadataResult", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FormatAddressUseCase$invoke$2"}, nl = {104}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class FormatAddressUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FormatAddressUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = formatAddressUseCase;
    }
}
