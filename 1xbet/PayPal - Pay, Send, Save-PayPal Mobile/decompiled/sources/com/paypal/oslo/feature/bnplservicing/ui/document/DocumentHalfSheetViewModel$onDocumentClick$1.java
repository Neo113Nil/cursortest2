package com.paypal.oslo.feature.bnplservicing.ui.document;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel$onDocumentClick$1", f = "DocumentHalfSheetViewModel.kt", i = {1, 1}, l = {37, 52}, m = "invokeSuspend", n = {"uri", "result"}, nl = {45, 53}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class DocumentHalfSheetViewModel$onDocumentClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel getInputFormats;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        if (r3.send(r1, r11) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r12 != r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplservicing.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase;
        com.paypal.oslo.feature.bnplservicing.ui.document.PdfViewerIntent pdfViewerIntent;
        com.paypal.oslo.feature.bnplservicing.ui.document.DocumentResult.Success success;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDocumentUseCase = this.getInputFormats.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel link = this.getHighSpeedVideoFpsRanges.getLink();
            java.lang.String staticUrl = link != null ? link.getStaticUrl() : null;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.LinkUiModel link2 = this.getHighSpeedVideoFpsRanges.getLink();
            java.lang.String relativePath = link2 != null ? link2.getRelativePath() : null;
            this.getOutputFormats = 1;
            obj = downloadDocumentUseCase.invoke(staticUrl, relativePath, this.getHighSpeedVideoFpsRanges.getFileName(), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.net.Uri uri = (android.net.Uri) obj;
        if (uri != null) {
            pdfViewerIntent = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
            pdfViewerIntent.open(uri);
            success = com.paypal.oslo.feature.bnplservicing.ui.document.DocumentResult.Success.INSTANCE;
        } else {
            success = com.paypal.oslo.feature.bnplservicing.ui.document.DocumentResult.Error.INSTANCE;
        }
        channel = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(uri);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
        this.getOutputFormats = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel$onDocumentClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel$onDocumentClick$1(this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentHalfSheetViewModel$onDocumentClick$1(com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel documentHalfSheetViewModel, com.paypal.oslo.feature.bnplservicing.ui.plandetails.model.DocumentData documentData, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentHalfSheetViewModel$onDocumentClick$1> continuation) {
        super(2, continuation);
        this.getInputFormats = documentHalfSheetViewModel;
        this.getHighSpeedVideoFpsRanges = documentData;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = creditProductIdentifier;
    }
}
