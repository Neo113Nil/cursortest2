package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel", f = "BarcodeViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {226, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "mapToSuccessState", n = {"details", "bundleEligibilityStatus", "debitCardImageUrl", "retailer", "capabilities", "displayMode", "isDebitCardEligible", "showDebitCardWidget", "isBarcodeUnavailable", "details", "bundleEligibilityStatus", "debitCardImageUrl", "retailer", "capabilities", "displayMode", "barcodeBitmap", "isDebitCardEligible", "showDebitCardWidget", "isBarcodeUnavailable"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 241}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "Z$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$mapToSuccessState$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    boolean getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel getOutputSizeshNQ4ISI;
    boolean getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(null, false, false, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$mapToSuccessState$1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$mapToSuccessState$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = barcodeViewModel;
    }
}
