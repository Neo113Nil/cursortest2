package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase", f = "PhoneNumberParseUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {93}, m = "invoke", n = {"phoneNumber", "request", "$this$invoke_u24lambda_u240", "parsedPhoneNumber", "regionCode", "$i$a$-runCatching-PhoneNumberParseUseCase$invoke$2", "isValidNumber"}, nl = {97}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0"}, v = 2)
/* loaded from: classes10.dex */
final class PhoneNumberParseUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberParseUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = phoneNumberParseUseCase;
    }
}
