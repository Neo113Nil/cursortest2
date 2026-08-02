package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleReconciliationRequest$1", f = "TaxDocumentsViewModel.kt", i = {0}, l = {457}, m = "invokeSuspend", n = {"fiscalYear"}, nl = {460}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$handleReconciliationRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider;
        java.lang.String str;
        boolean success;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String selectedYear = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsUiStateKt.getSelectedYear(this.getHighResolutionOutputSizeshNQ4ISI.getUiState().getValue());
            mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            mviStateStore.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestInProgress.INSTANCE);
            taxDocumentsUseCaseProvider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = selectedYear;
            this.getHighSpeedVideoSizes = 1;
            java.lang.Object invoke = taxDocumentsUseCaseProvider.getCreateTaxReconciliationReport().invoke(selectedYear, this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = selectedYear;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        if (ior instanceof arrow.core.Ior.Left) {
        } else {
            if (ior instanceof arrow.core.Ior.Right) {
                success = ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.reconciliation.CreateTaxReconciliationReportResult) ((arrow.core.Ior.Right) ior).getValue()).getSuccess();
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.reconciliation.CreateTaxReconciliationReportResult createTaxReconciliationReportResult = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.reconciliation.CreateTaxReconciliationReportResult) both.getRightValue();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Reconciliation request partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) leftValue), kotlin.TuplesKt.to("result", createTaxReconciliationReportResult)), null, 4, null);
                success = createTaxReconciliationReportResult.getSuccess();
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (success) {
                mviStateStore2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
                mviStateStore2.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestSuccess.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r10), null, null, new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$loadTaxReportsForYear$1(this.getHighResolutionOutputSizeshNQ4ISI, str, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        mviStateStore3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
        mviStateStore3.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.ReconciliationRequestFailed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleReconciliationRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleReconciliationRequest$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsViewModel$handleReconciliationRequest$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleReconciliationRequest$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = taxDocumentsViewModel;
    }
}
