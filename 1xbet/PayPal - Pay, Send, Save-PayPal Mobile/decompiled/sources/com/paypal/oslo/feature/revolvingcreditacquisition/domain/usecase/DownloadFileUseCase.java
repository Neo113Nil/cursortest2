package com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/usecase/DownloadFileUseCase;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;)V", "", "url", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/downloads/api/model/DownloadState;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "Lcom/paypal/oslo/downloads/api/model/DownloadState$Completed;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/downloads/api/model/DownloadState$Completed;)Lcom/paypal/oslo/feature/revolvingcreditacquisition/domain/model/DownloadResult;", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DownloadFileUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.downloads.api.validation.UrlValidator Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DownloadFileUseCase(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        this.getHighSpeedVideoFpsRangesFor = downloadManager;
        this.Camera2StreamConfigurationMap = urlValidator;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return downloadFileUseCase.invoke(str, str2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r8 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult> continuation) {
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$1 downloadFileUseCase$awaitDownloadCompletion$1;
        int i;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$1) {
            downloadFileUseCase$awaitDownloadCompletion$1 = (com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$1) continuation;
            if ((downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj2 = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.downloads.api.DownloadManager downloadManager = this.getHighSpeedVideoFpsRangesFor;
                    downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 1;
                    obj = downloadManager.mo11709downloadxebedEM(downloadRequest, downloadFileUseCase$awaitDownloadCompletion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return Camera2StreamConfigurationMap((com.paypal.oslo.downloads.api.model.DownloadState) obj2);
                    }
                    downloadRequest = (com.paypal.oslo.downloads.api.model.DownloadRequest) downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = ((com.paypal.oslo.downloads.api.model.DownloadId) obj2).m11731unboximpl();
                }
                java.lang.String str = (java.lang.String) obj;
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow = this.getHighSpeedVideoFpsRangesFor.mo11714observeDownload3wgKXB0(str);
                com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1 downloadFileUseCase$awaitDownloadCompletion$finalState$1 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1(this, null);
                downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 2;
                obj2 = kotlinx.coroutines.flow.FlowKt.first(flow, downloadFileUseCase$awaitDownloadCompletion$finalState$1, downloadFileUseCase$awaitDownloadCompletion$1);
            }
        }
        downloadFileUseCase$awaitDownloadCompletion$1 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$1(this, continuation);
        java.lang.Object obj22 = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow2 = this.getHighSpeedVideoFpsRangesFor.mo11714observeDownload3wgKXB0(str2);
        com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1 downloadFileUseCase$awaitDownloadCompletion$finalState$12 = new com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase$awaitDownloadCompletion$finalState$1(this, null);
        downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
        downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 2;
        obj22 = kotlinx.coroutines.flow.FlowKt.first(flow2, downloadFileUseCase$awaitDownloadCompletion$finalState$12, downloadFileUseCase$awaitDownloadCompletion$1);
    }

    private static com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult Camera2StreamConfigurationMap(com.paypal.oslo.downloads.api.model.DownloadState p0) {
        if (p0 instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
            return getHighSpeedVideoFpsRanges((com.paypal.oslo.downloads.api.model.DownloadState.Completed) p0);
        }
        if (p0 instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(((com.paypal.oslo.downloads.api.model.DownloadState.Failed) p0).getError());
        }
        if (p0 instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Download was cancelled", null, 2, null));
        }
        if (p0 instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(((com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) p0).getMessage(), true, null, 4, null));
        }
        return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Unexpected download state", null, 2, null));
    }

    private static com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult getHighSpeedVideoFpsRanges(com.paypal.oslo.downloads.api.model.DownloadState.Completed p0) {
        android.net.Uri fileUri = p0.getFileUri();
        if (fileUri == null) {
            return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.StorageError("File URI is null after download completed", 0L, 0L, null, 14, null));
        }
        return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Success(fileUri, kotlin.text.StringsKt.substringAfterLast$default(p0.getFilePath(), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), p0.getMimeType());
    }

    public static final /* synthetic */ boolean access$isTerminalState(com.paypal.oslo.feature.revolvingcreditacquisition.domain.usecase.DownloadFileUseCase downloadFileUseCase, com.paypal.oslo.downloads.api.model.DownloadState downloadState) {
        return (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) || (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork);
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult> continuation) {
        com.paypal.oslo.downloads.api.model.DownloadRequest.Builder builder = new com.paypal.oslo.downloads.api.model.DownloadRequest.Builder(str);
        if (str2 == null) {
            str2 = "application/pdf";
        }
        com.paypal.oslo.downloads.api.model.DownloadRequestResult build = builder.setExpectedMimeType(str2).build(this.Camera2StreamConfigurationMap);
        if (build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) {
            return getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) build).getRequest(), continuation);
        }
        if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String errorMessage = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed) build).getValidationResult().getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "URL validation failed";
        }
        return new com.paypal.oslo.feature.revolvingcreditacquisition.domain.model.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(errorMessage, com.paypal.oslo.downloads.api.model.ValidationType.URL, null, 4, null));
    }
}
