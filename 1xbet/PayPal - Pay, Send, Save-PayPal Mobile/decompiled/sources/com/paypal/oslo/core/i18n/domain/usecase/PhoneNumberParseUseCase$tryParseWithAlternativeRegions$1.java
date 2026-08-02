package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase", f = "PhoneNumberParseUseCase.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE}, m = "tryParseWithAlternativeRegions", n = {"phoneNumber", "regionCode"}, nl = {197}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase$tryParseWithAlternativeRegions$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = phoneNumberParseUseCase;
    }
}
