package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$2$1$1 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent businessInventoryItemsEditEvent) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent businessInventoryItemsEditEvent2 = businessInventoryItemsEditEvent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsEditEvent2, "");
        ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel) this.receiver).handleEvent$business_inventory_prodRelease(businessInventoryItemsEditEvent2);
        return kotlin.Unit.INSTANCE;
    }

    BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$2$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.class, "handleEvent", "handleEvent$business_inventory_prodRelease(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;)Lkotlinx/coroutines/Job;", 8);
    }
}
