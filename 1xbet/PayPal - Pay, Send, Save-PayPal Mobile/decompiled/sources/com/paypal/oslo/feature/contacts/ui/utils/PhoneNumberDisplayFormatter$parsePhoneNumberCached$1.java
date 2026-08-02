package com.paypal.oslo.feature.contacts.ui.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter", f = "PhoneNumberDisplayFormatter.kt", i = {0, 0}, l = {393}, m = "parsePhoneNumberCached", n = {"phoneNumber", "defaultCountryCode"}, nl = {396}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class PhoneNumberDisplayFormatter$parsePhoneNumberCached$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(null, null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberDisplayFormatter$parsePhoneNumberCached$1(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter$parsePhoneNumberCached$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = phoneNumberDisplayFormatter;
    }
}
