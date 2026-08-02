package com.paypal.oslo.feature.contacts.ui.utils;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter", f = "PhoneNumberDisplayFormatter.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {116, 126, 130, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 137}, m = "processInput", n = {"query", "shouldShowCountryPicker", "query", "shouldShowCountryPicker", "query", "normalizedQuery", "shouldShowCountryPicker", "query", "normalizedQuery", "shouldShowCountryPicker", "isValidPhone", "query", "normalizedQuery", "denormalizedQuery", "shouldShowCountryPicker", "isValidPhone"}, nl = {121, 121, 131, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "Z$0", "L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "Z$1"}, v = 2)
/* loaded from: classes12.dex */
final class PhoneNumberDisplayFormatter$processInput$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter getInputFormats;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.processInput(null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneNumberDisplayFormatter$processInput$1(com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter phoneNumberDisplayFormatter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter$processInput$1> continuation) {
        super(continuation);
        this.getInputFormats = phoneNumberDisplayFormatter;
    }
}
