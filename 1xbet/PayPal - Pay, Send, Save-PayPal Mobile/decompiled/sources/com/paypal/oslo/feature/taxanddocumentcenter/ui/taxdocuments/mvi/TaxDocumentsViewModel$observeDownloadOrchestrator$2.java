package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2", f = "TaxDocumentsViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class TaxDocumentsViewModel$observeDownloadOrchestrator$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.download.DownloadOrchestrator downloadOrchestrator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadOrchestrator = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile> effect = downloadOrchestrator.getEffect();
            final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (effect.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
                    com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile openDownloadedFile = (com.paypal.oslo.feature.taxanddocumentcenter.ui.download.model.OpenDownloadedFile) obj2;
                    mviStateStore = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel.this.getHighSpeedVideoSizesFor;
                    mviStateStore.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsEvent.DownloadCompleted(openDownloadedFile.getFileUri(), openDownloadedFile.getFileName(), openDownloadedFile.getMimeType()));
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
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxDocumentsViewModel$observeDownloadOrchestrator$2(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel taxDocumentsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.mvi.TaxDocumentsViewModel$observeDownloadOrchestrator$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = taxDocumentsViewModel;
    }
}
