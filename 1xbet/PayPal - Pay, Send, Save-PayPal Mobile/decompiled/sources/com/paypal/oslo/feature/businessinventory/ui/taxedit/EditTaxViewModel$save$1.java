package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel", f = "EditTaxViewModel.kt", i = {2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5}, l = {148, 148, 153, 159, 163, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m = "save", n = {"validationErrors", "editedTax", "validationErrors", "editedTax", "taxEntity", "validationErrors", "editedTax", "this_$iv", "it$iv", "newTax", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-EditTaxViewModel$save$3", "validationErrors", "editedTax", "this_$iv", "it$iv", "newTax", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-EditTaxViewModel$save$3"}, nl = {148, 150, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, com.visa.cbp.getCertUsage.setODAData, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class EditTaxViewModel$save$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.access$save(this.getOutputSizes, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditTaxViewModel$save$1(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$save$1> continuation) {
        super(continuation);
        this.getOutputSizes = editTaxViewModel;
    }
}
