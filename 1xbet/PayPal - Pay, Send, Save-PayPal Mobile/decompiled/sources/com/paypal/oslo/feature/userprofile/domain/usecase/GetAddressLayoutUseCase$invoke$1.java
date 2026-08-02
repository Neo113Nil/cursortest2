package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase", f = "GetAddressLayoutUseCase.kt", i = {0, 0, 0, 0}, l = {47}, m = "invoke", n = {"countryCode", "locale", "address", "config"}, nl = {52}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class GetAddressLayoutUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetAddressLayoutUseCase$invoke$1(com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = getAddressLayoutUseCase;
    }
}
