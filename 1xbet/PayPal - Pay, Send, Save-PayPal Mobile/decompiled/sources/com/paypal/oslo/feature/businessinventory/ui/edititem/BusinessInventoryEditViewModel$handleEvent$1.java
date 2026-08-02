package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1", f = "BusinessInventoryEditViewModel.kt", i = {3}, l = {128, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 138, 165}, m = "invokeSuspend", n = {"uiEffect"}, nl = {126, 136, 140, 115}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryEditViewModel$handleEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.access$deleteItem(r2, ((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) r3).getLibraryItem(), r20) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0191, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00dc, code lost:
    
        if (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel.access$validateAndSave(r20.getHighResolutionOutputSizeshNQ4ISI, ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem) r20.Camera2StreamConfigurationMap).getFormData(), r20) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
    
        if (r2.emit(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack.INSTANCE, r20) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018f, code lost:
    
        if (r2.emit(r4, r20) == r1) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType3;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal showConfirmationModal;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType4;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType5;
        com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType6;
        java.lang.Object value;
        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent businessInventoryItemsEditEvent = this.Camera2StreamConfigurationMap;
            if (businessInventoryItemsEditEvent instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats;
                com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent businessInventoryItemsEditEvent2 = this.Camera2StreamConfigurationMap;
                do {
                    value = mutableStateFlow.getValue();
                    com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState businessInventoryItemsEditState = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditState) value;
                    java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> validationErrors = businessInventoryItemsEditState.getValidationErrors();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : validationErrors) {
                        if (!((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors) businessInventoryItemsEditEvent2).getErrors().contains((com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    copy = businessInventoryItemsEditState.copy((r18 & 1) != 0 ? businessInventoryItemsEditState.flowType : null, (r18 & 2) != 0 ? businessInventoryItemsEditState.taxOptions : null, (r18 & 4) != 0 ? businessInventoryItemsEditState.bannerError : null, (r18 & 8) != 0 ? businessInventoryItemsEditState.validationErrors : kotlin.collections.CollectionsKt.toSet(arrayList), (r18 & 16) != 0 ? businessInventoryItemsEditState.loading : false, (r18 & 32) != 0 ? businessInventoryItemsEditState.saving : false, (r18 & 64) != 0 ? businessInventoryItemsEditState.deleting : false, (r18 & 128) != 0 ? businessInventoryItemsEditState.currency : null);
                } while (!mutableStateFlow.compareAndSet(value, copy));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsEditEvent, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DeleteItem.INSTANCE)) {
                flowType5 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                if (!(flowType5 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create)) {
                    if (flowType5 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) {
                        com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
                        flowType6 = businessInventoryEditViewModel.getHighSpeedVideoFpsRanges;
                        this.getHighSpeedVideoFpsRanges = 1;
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            } else if (businessInventoryItemsEditEvent instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem) {
                this.getHighSpeedVideoFpsRanges = 2;
            } else {
                if (!(businessInventoryItemsEditEvent instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.RequestBackNavigation)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData = ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.RequestBackNavigation) this.Camera2StreamConfigurationMap).getFormData();
                flowType = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                if (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModelKt.isUnchanged(formData, flowType)) {
                    mutableSharedFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRanges = 3;
                } else {
                    flowType2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                    if (flowType2 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) {
                        flowType4 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                        int i2 = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) flowType4).getItemType().ordinal()];
                        if (i2 == 1) {
                            showConfirmationModal = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType.DiscardAddProduct);
                        } else {
                            if (i2 != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            showConfirmationModal = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType.DiscardAddService);
                        }
                    } else if (flowType2 instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) {
                        flowType3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                        int i3 = com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) flowType3).getLibraryItem().getType().ordinal()];
                        if (i3 == 1) {
                            showConfirmationModal = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType.DiscardEditProduct);
                        } else {
                            if (i3 != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            showConfirmationModal = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType.DiscardEditService);
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    mutableSharedFlow = this.getHighResolutionOutputSizeshNQ4ISI.getOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(showConfirmationModal);
                    this.getHighSpeedVideoFpsRanges = 4;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryEditViewModel$handleEvent$1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent businessInventoryItemsEditEvent, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel$handleEvent$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = businessInventoryItemsEditEvent;
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryEditViewModel;
    }
}
