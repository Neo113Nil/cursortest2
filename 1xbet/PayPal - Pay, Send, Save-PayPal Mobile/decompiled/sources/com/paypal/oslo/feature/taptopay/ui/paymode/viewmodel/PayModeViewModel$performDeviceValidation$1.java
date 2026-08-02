package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel", f = "PayModeViewModel.kt", i = {1, 2, 3, 4, 4, 5, 5, 5}, l = {193, 197, 204, 205, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, m = "performDeviceValidation", n = {"showSecondarySettings", "showSecondarySettings", "showSecondarySettings", "showSecondarySettings", "isDeviceScreenLockEnabled", "showSecondarySettings", "isDeviceScreenLockEnabled", "isNfcEnabled"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE, 205, 206, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE}, s = {"Z$0", "Z$0", "Z$0", "Z$0", "Z$1", "Z$0", "Z$1", "Z$2"}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$performDeviceValidation$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    boolean Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$performDeviceValidation(this.getHighSpeedVideoSizesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$performDeviceValidation$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$performDeviceValidation$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = payModeViewModel;
    }
}
