package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel", f = "EditTaxViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, n = {"taxOption", "taxOption", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-EditTaxViewModel$delete$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, s = {"L$0", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class EditTaxViewModel$delete$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.access$delete(this.getOutputSizes, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditTaxViewModel$delete$1(com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$delete$1> continuation) {
        super(continuation);
        this.getOutputSizes = editTaxViewModel;
    }
}
