package com.paypal.oslo.feature.contacts.ui.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter", f = "PhoneNumberDisplayFormatter.kt", i = {0, 0, 0}, l = {571}, m = "formatNationalNumber", n = {"normalizedQuery", "initialPhoneDigits", "defaultCountryCode"}, nl = {576}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes12.dex */
final class PhoneNumberDisplayFormatter$formatNationalNumber$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberDisplayFormatter$formatNationalNumber$1(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter$formatNationalNumber$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = phoneNumberDisplayFormatter;
    }
}
