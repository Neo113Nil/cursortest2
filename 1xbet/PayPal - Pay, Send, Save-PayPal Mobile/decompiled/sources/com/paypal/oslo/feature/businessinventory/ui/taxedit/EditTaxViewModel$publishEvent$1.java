package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$publishEvent$1", f = "EditTaxViewModel.kt", i = {}, l = {111, 113}, m = "invokeSuspend", n = {}, nl = {113, 115}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class EditTaxViewModel$publishEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.access$save(r17.getHighResolutionOutputSizeshNQ4ISI, r17) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.access$delete(r17.getHighResolutionOutputSizeshNQ4ISI, r17) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel tax3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent createTaxEvent = this.Camera2StreamConfigurationMap;
            if (kotlin.jvm.internal.Intrinsics.areEqual(createTaxEvent, com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.SaveClicked.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges = 1;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(createTaxEvent, com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.DeleteTaxConfirmed.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges = 2;
            } else if (createTaxEvent instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged) {
                mutableStateFlow2 = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.businessinventory.ui.taxedit.State value = this.getHighResolutionOutputSizeshNQ4ISI.getState().getValue();
                tax3 = this.getHighResolutionOutputSizeshNQ4ISI.state.getValue().getTax();
                com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel copy$default = com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel.copy$default(tax3, null, ((com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged) this.Camera2StreamConfigurationMap).getLabel(), null, 5, null);
                com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None none = com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE;
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> validationErrors = this.getHighResolutionOutputSizeshNQ4ISI.getState().getValue().getValidationErrors();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : validationErrors) {
                    if (!(((com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError) obj2) instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.NameError)) {
                        arrayList.add(obj2);
                    }
                }
                mutableStateFlow2.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(value, null, copy$default, null, false, kotlin.collections.CollectionsKt.toSet(arrayList), none, null, 77, null));
            } else {
                if (!(createTaxEvent instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                tax = this.getHighResolutionOutputSizeshNQ4ISI.state.getValue().getTax();
                java.lang.String access$transformEnteredTaxValue = com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModelKt.access$transformEnteredTaxValue(tax.getPercentage(), ((com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged) this.Camera2StreamConfigurationMap).getPercent());
                mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
                com.paypal.oslo.feature.businessinventory.ui.taxedit.State value2 = this.getHighResolutionOutputSizeshNQ4ISI.getState().getValue();
                tax2 = this.getHighResolutionOutputSizeshNQ4ISI.state.getValue().getTax();
                com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel copy$default2 = com.paypal.oslo.feature.businessinventory.ui.taxedit.TaxUiModel.copy$default(tax2, null, null, access$transformEnteredTaxValue, 3, null);
                com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None none2 = com.paypal.oslo.feature.businessinventory.ui.taxedit.ErrorBanner.None.INSTANCE;
                java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError> validationErrors2 = this.getHighResolutionOutputSizeshNQ4ISI.getState().getValue().getValidationErrors();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : validationErrors2) {
                    if (!(((com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError) obj3) instanceof com.paypal.oslo.feature.businessinventory.domain.validator.TaxFieldValidationError.TaxError)) {
                        arrayList2.add(obj3);
                    }
                }
                mutableStateFlow.setValue(com.paypal.oslo.feature.businessinventory.ui.taxedit.State.copy$default(value2, null, copy$default2, null, false, kotlin.collections.CollectionsKt.toSet(arrayList2), none2, null, 77, null));
            }
        } else {
            if (i != 1 && i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$publishEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$publishEvent$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditTaxViewModel$publishEvent$1(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent createTaxEvent, com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel editTaxViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel$publishEvent$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = createTaxEvent;
        this.getHighResolutionOutputSizeshNQ4ISI = editTaxViewModel;
    }
}
