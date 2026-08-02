package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$downloadDocumentAsync$1", f = "DocumentsHalfSheetViewModel.kt", i = {0, 0, 0}, l = {73}, m = "invokeSuspend", n = {"downloadLink", "staticUrl", "relativePath"}, nl = {79}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes11.dex */
final class DocumentsHalfSheetViewModel$downloadDocumentAsync$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage;
        com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage2;
        java.lang.String relativePath;
        java.lang.String staticUrl;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.bnplacquisition.domain.model.common.DocumentLink downloadLink = this.getHighSpeedVideoFpsRanges.getDownloadLink();
            java.lang.String str = (downloadLink == null || (staticUrl = downloadLink.getStaticUrl()) == null || staticUrl.length() <= 0) ? null : staticUrl;
            java.lang.String str2 = (downloadLink == null || (relativePath = downloadLink.getRelativePath()) == null || relativePath.length() <= 0) ? null : relativePath;
            downloadDocumentUseCase = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
            java.lang.String downloadFileName = this.getHighSpeedVideoFpsRanges.getDownloadFileName();
            sessionStorage = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
            java.lang.String getHighSpeedVideoFpsRangesFor = sessionStorage.getGetHighSpeedVideoFpsRangesFor();
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = "";
            }
            java.lang.String str3 = getHighSpeedVideoFpsRangesFor;
            sessionStorage2 = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadLink);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = downloadDocumentUseCase.invoke(str, str2, downloadFileName, str3, sessionStorage2.getGetHighResolutionOutputSizeshNQ4ISI(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel documentsHalfSheetViewModel = this.getOutputMinFrameDuration;
        if (either instanceof arrow.core.Either.Right) {
            documentsHalfSheetViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadSuccess((android.net.Uri) ((arrow.core.Either.Right) either).getValue()));
        } else if (either instanceof arrow.core.Either.Left) {
            documentsHalfSheetViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetEvent.DownloadError.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$downloadDocumentAsync$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$downloadDocumentAsync$1(this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentsHalfSheetViewModel$downloadDocumentAsync$1(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentItemUiModel documentItemUiModel, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel documentsHalfSheetViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsHalfSheetViewModel$downloadDocumentAsync$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = documentItemUiModel;
        this.getOutputMinFrameDuration = documentsHalfSheetViewModel;
    }
}
