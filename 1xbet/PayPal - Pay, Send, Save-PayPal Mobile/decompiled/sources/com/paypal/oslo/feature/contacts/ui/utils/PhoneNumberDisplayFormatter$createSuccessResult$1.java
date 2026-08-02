package com.paypal.oslo.feature.contacts.ui.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter", f = "PhoneNumberDisplayFormatter.kt", i = {0, 0}, l = {479}, m = "createSuccessResult", n = {"normalizedQuery", "isValidPhone"}, nl = {androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND}, s = {"L$0", "Z$0"}, v = 2)
/* loaded from: classes12.dex */
final class PhoneNumberDisplayFormatter$createSuccessResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(null, false, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberDisplayFormatter$createSuccessResult$1(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter$createSuccessResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = phoneNumberDisplayFormatter;
    }
}
