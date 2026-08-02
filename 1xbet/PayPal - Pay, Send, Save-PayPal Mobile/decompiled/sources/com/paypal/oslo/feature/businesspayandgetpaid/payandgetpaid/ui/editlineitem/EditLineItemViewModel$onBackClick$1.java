package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel$onBackClick$1", f = "EditLineItemViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, nl = {100}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EditLineItemViewModel$onBackClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState copy;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel.access$hasChanges(this.getHighSpeedVideoFpsRangesFor)) {
                mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r3.copy((r32 & 1) != 0 ? r3.showDiscardChangesDialog : true, (r32 & 2) != 0 ? r3.catalogItemId : null, (r32 & 4) != 0 ? r3.itemName : null, (r32 & 8) != 0 ? r3.quantity : null, (r32 & 16) != 0 ? r3.price : null, (r32 & 32) != 0 ? r3.tax : null, (r32 & 64) != 0 ? r3.currencyCode : null, (r32 & 128) != 0 ? r3.description : null, (r32 & 256) != 0 ? r3.itemType : null, (r32 & 512) != 0 ? r3.discountType : null, (r32 & 1024) != 0 ? r3.discountAmount : null, (r32 & 2048) != 0 ? r3.discountPercentage : null, (r32 & 4096) != 0 ? r3.quantityError : null, (r32 & 8192) != 0 ? r3.descriptionError : null, (r32 & 16384) != 0 ? ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiState) value).discountError : null);
                } while (!mutableStateFlow.compareAndSet(value, copy));
            } else {
                mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (mutableSharedFlow.emit(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemUiEffect.NavigateBack.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel$onBackClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel$onBackClick$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditLineItemViewModel$onBackClick$1(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel editLineItemViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.editlineitem.EditLineItemViewModel$onBackClick$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = editLineItemViewModel;
    }
}
