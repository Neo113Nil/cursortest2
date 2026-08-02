package com.paypal.oslo.feature.cashin.ui.barcode.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel", f = "BarcodeViewModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {161, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "handleActivationSuccess", n = {"details", "eligibilityDeferred", "cardArtDeferred", "capabilities", "hasSwipe", "details", "eligibilityDeferred", "cardArtDeferred", "capabilities", "hasSwipe", "details", "eligibilityDeferred", "cardArtDeferred", "capabilities", "eligibility", "hasSwipe", "details", "eligibilityDeferred", "cardArtDeferred", "capabilities", "eligibility", "debitCardImageUrl", "hasSwipe", "isDebitCardEligible", "showDebitCardWidget"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, -1}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class BarcodeViewModel$handleActivationSuccess$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    boolean getInputSizeshNQ4ISI;
    int getOutputFormats;
    boolean getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel.access$handleActivationSuccess(this.getOutputStallDurationlomOqCM, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BarcodeViewModel$handleActivationSuccess$1(com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel barcodeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.barcode.viewmodel.BarcodeViewModel$handleActivationSuccess$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = barcodeViewModel;
    }
}
