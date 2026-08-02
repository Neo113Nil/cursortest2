package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$uploadDocument$1", f = "DocumentReviewViewModel.kt", i = {0, 0, 0}, l = {107}, m = "invokeSuspend", n = {"currentState", "imageFile", "imageBytes"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class DocumentReviewViewModel$uploadDocument$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase uploadDocumentUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mviStateStore = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState) mviStateStore.getCurrentState();
            if (!(documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready)) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Cannot upload document - not in Ready state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("current_state", documentReviewUiState.getName())), null, 4, null);
                return kotlin.Unit.INSTANCE;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready) documentReviewUiState;
            java.io.File file = new java.io.File(ready.getImageUri());
            if (!file.exists()) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "Image file not found", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("uri", ready.getImageUri())), null, null, 12, null);
                this.getHighSpeedVideoFpsRanges.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError("Image file not found"));
                return kotlin.Unit.INSTANCE;
            }
            byte[] readBytes = kotlin.io.FilesKt.readBytes(file);
            uploadDocumentUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentReviewUiState);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(readBytes);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase.invoke$default(uploadDocumentUseCase, readBytes, null, null, null, this, 14, null);
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
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel = this.getHighSpeedVideoFpsRanges;
        if (either instanceof arrow.core.Either.Right) {
            documentReviewViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadSuccess((java.lang.String) ((arrow.core.Either.Right) either).getValue()));
        } else if (either instanceof arrow.core.Either.Left) {
            java.lang.String message = ((com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError) ((arrow.core.Either.Left) either).getValue()).getMessage();
            if (message == null) {
                message = "Upload failed";
            }
            documentReviewViewModel.processEvent(new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.UploadError(message));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$uploadDocument$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$uploadDocument$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentReviewViewModel$uploadDocument$1(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel$uploadDocument$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = documentReviewViewModel;
    }
}
