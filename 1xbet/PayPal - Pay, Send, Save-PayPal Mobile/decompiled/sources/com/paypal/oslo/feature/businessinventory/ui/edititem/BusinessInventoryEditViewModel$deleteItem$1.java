package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel", f = "BusinessInventoryEditViewModel.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {176, 179}, m = "deleteItem", n = {"libraryItem", "libraryItem", "deleteItem", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-BusinessInventoryEditViewModel$deleteItem$3"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryEditViewModel$deleteItem$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.access$deleteItem(this.getOutputStallDuration, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryEditViewModel$deleteItem$1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$deleteItem$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = businessInventoryEditViewModel;
    }
}
