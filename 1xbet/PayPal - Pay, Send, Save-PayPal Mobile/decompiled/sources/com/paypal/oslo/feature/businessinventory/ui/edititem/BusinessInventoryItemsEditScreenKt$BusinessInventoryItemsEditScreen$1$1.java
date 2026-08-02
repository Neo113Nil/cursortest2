package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1", f = "BusinessInventoryItemsEditScreen.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect> uiEffects = this.getHighSpeedVideoFpsRangesFor.getUiEffects();
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType> mutableState = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (uiEffects.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect businessInventoryItemsUiEffect = (com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect) obj2;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(businessInventoryItemsUiEffect, com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack.INSTANCE)) {
                        function1.invoke(null);
                    } else if (businessInventoryItemsUiEffect instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult) {
                        function1.invoke(((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult) businessInventoryItemsUiEffect).getLibraryItem());
                    } else {
                        if (!(businessInventoryItemsUiEffect instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        mutableState.setValue(((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal) businessInventoryItemsUiEffect).getModalType());
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel businessInventoryEditViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem, kotlin.Unit> function1, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditScreenKt$BusinessInventoryItemsEditScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = businessInventoryEditViewModel;
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
