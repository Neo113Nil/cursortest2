package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel", f = "BusinessInventoryEditViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 270}, m = "validateAndSave", n = {"formData", "formData", "items", "uniquenessValidationSubject", "uniquenessErrors", "nameErrors", "priceErrors", "descriptionErrors", "validationErrors", "libraryItem", "formData", "items", "uniquenessValidationSubject", "uniquenessErrors", "nameErrors", "priceErrors", "descriptionErrors", "validationErrors", "libraryItem"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, 282, 282}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryEditViewModel$validateAndSave$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.access$validateAndSave(this.getOutputSizeshNQ4ISI, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryEditViewModel$validateAndSave$1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$validateAndSave$1> continuation) {
        super(continuation);
        this.getOutputSizeshNQ4ISI = businessInventoryEditViewModel;
    }
}
