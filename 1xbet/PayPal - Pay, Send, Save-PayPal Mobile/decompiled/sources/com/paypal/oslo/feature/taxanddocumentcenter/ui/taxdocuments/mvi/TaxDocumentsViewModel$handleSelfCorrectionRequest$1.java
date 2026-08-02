package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleSelfCorrectionRequest$1", f = "TaxDocumentsViewModel.kt", i = {}, l = {498}, m = "invokeSuspend", n = {}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$handleSelfCorrectionRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.usecase.TaxDocumentsUseCaseProvider taxDocumentsUseCaseProvider;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore4;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mviStateStore = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizesFor;
            mviStateStore.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestInProgress.INSTANCE);
            taxDocumentsUseCaseProvider = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = taxDocumentsUseCaseProvider.getRequestTaxReportSelfCorrection().invoke(this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (!(ior instanceof arrow.core.Ior.Left)) {
            if (ior instanceof arrow.core.Ior.Right) {
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult requestTaxReportSelfCorrectionResult = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult) ((arrow.core.Ior.Right) ior).getValue();
                if (requestTaxReportSelfCorrectionResult.getSuccess()) {
                    mviStateStore4 = taxDocumentsViewModel.getHighSpeedVideoSizesFor;
                    mviStateStore4.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess(requestTaxReportSelfCorrectionResult.getDeepLink()));
                } else {
                    mviStateStore3 = taxDocumentsViewModel.getHighSpeedVideoSizesFor;
                    mviStateStore3.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed.INSTANCE);
                }
            } else if (ior instanceof arrow.core.Ior.Both) {
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult requestTaxReportSelfCorrectionResult2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.selfcorrection.RequestTaxReportSelfCorrectionResult) both.getRightValue();
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Self-correction request partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) leftValue), kotlin.TuplesKt.to("result", requestTaxReportSelfCorrectionResult2)), null, 4, null);
                if (requestTaxReportSelfCorrectionResult2.getSuccess()) {
                    mviStateStore2 = taxDocumentsViewModel.getHighSpeedVideoSizesFor;
                    mviStateStore2.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestSuccess(requestTaxReportSelfCorrectionResult2.getDeepLink()));
                }
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }
        mviStateStore5 = taxDocumentsViewModel.getHighSpeedVideoSizesFor;
        mviStateStore5.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.SelfCorrectionRequestFailed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleSelfCorrectionRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleSelfCorrectionRequest$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsViewModel$handleSelfCorrectionRequest$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$handleSelfCorrectionRequest$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = taxDocumentsViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
