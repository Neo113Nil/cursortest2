package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$handleEvent$1", f = "BusinessInventoryItemsListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsListViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object value;
        java.lang.Object value2;
        java.lang.Object value3;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent = this.getHighResolutionOutputSizeshNQ4ISI;
        if (businessInventoryItemsListEvent instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked) {
            kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent2 = this.getHighResolutionOutputSizeshNQ4ISI;
            do {
                value3 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value3, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value3, null, ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked) businessInventoryItemsListEvent2).getInventoryLibraryItemTypeSegmentedControlItem(), null, null, null, null, 61, null)));
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsListEvent, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddItemClicked.INSTANCE) && !kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsListEvent, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddServiceClicked.INSTANCE) && !(businessInventoryItemsListEvent instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked) && !(businessInventoryItemsListEvent instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsListEvent, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissError.INSTANCE)) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                do {
                    value2 = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value2, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value2, null, null, null, null, null, null, 47, null)));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsListEvent, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissToast.INSTANCE)) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState.copy$default((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListState) value, null, null, null, null, null, null, 31, null)));
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$handleEvent$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsListViewModel$handleEvent$1(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent businessInventoryItemsListEvent, com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel businessInventoryItemsListViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryItemsListEvent;
        this.Camera2StreamConfigurationMap = businessInventoryItemsListViewModel;
    }
}
