package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/usecase/DownloadDocumentUseCase;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "restConfig", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/core/network/rest/config/RestConfig;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;)V", "", "url", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/download/DownloadResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "p0", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/rest/config/RestConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DownloadDocumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.rest.config.RestConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.validation.UrlValidator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DownloadDocumentUseCase(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.core.network.rest.config.RestConfig restConfig, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(restConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        this.Camera2StreamConfigurationMap = downloadManager;
        this.getHighSpeedVideoFpsRangesFor = restConfig;
        this.getHighSpeedVideoSizes = urlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$invoke$1 downloadDocumentUseCase$invoke$1;
        int i;
        java.lang.String str2;
        com.paypal.oslo.downloads.api.model.DownloadState downloadState;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$invoke$1) {
            downloadDocumentUseCase$invoke$1 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$invoke$1) continuation;
            if ((downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = downloadDocumentUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                        java.lang.String trimEnd = kotlin.text.StringsKt.trimEnd(this.getHighSpeedVideoFpsRangesFor.getBaseUrl(), kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(trimEnd);
                        sb.append(str);
                        str2 = sb.toString();
                    } else {
                        str2 = str;
                    }
                    com.paypal.oslo.downloads.api.model.DownloadRequestResult build = new com.paypal.oslo.downloads.api.model.DownloadRequest.Builder(str2).setAuthType(new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, "tax_documents")).build(this.getHighSpeedVideoSizes);
                    if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success)) {
                        if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed validationFailed = (com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed) build;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
                        kotlin.Pair[] pairArr = new kotlin.Pair[2];
                        pairArr[0] = kotlin.TuplesKt.to("validationType", com.paypal.oslo.downloads.api.model.ValidationType.URL);
                        java.lang.String errorMessage = validationFailed.getValidationResult().getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "unknown";
                        }
                        pairArr[1] = kotlin.TuplesKt.to("errorMessage", errorMessage);
                        com.paypal.android.logger.Logger.w$default(logger, "Download URL validation failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                        java.lang.String errorMessage2 = validationFailed.getValidationResult().getErrorMessage();
                        if (errorMessage2 == null) {
                            errorMessage2 = "URL validation failed";
                        }
                        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(errorMessage2, com.paypal.oslo.downloads.api.model.ValidationType.URL, null, 4, null));
                    }
                    com.paypal.oslo.downloads.api.model.DownloadRequest request = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) build).getRequest();
                    downloadDocumentUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    downloadDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    downloadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges = this;
                    downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getHighSpeedVideoSizes(request, downloadDocumentUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
                    if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) {
                        com.paypal.oslo.downloads.api.model.DownloadState.Failed failed = (com.paypal.oslo.downloads.api.model.DownloadState.Failed) downloadState;
                        com.paypal.oslo.downloads.api.model.DownloadError error = failed.getError();
                        if ((error instanceof com.paypal.oslo.downloads.api.model.DownloadError.NetworkError) || (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.AuthenticationError) || (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.StorageError) || (error instanceof com.paypal.oslo.downloads.api.model.DownloadError.ServerError)) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Document download failed - expected error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", failed.getError().getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", failed.getError().getMessage())), null, 4, null);
                        } else {
                            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Document download failed - unexpected error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", failed.getError().getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", failed.getError().getMessage())), null, null, 12, null);
                        }
                        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(failed.getError());
                    }
                    if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Document download was cancelled", null, null, 6, null);
                        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Download was cancelled", null, 2, null));
                    }
                    if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) {
                        com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork noNetwork = (com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) downloadState;
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Document download failed - no network", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("message", noNetwork.getMessage())), null, 4, null);
                        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(noNetwork.getMessage(), true, null, 4, null));
                    }
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Document download ended in unexpected state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("stateType", downloadState.getClass().getSimpleName())), null, null, 12, null);
                    return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Download ended in unexpected state: ".concat(java.lang.String.valueOf(downloadState)), null, 2, null));
                }
                com.paypal.oslo.downloads.api.model.DownloadState.Completed completed = (com.paypal.oslo.downloads.api.model.DownloadState.Completed) downloadState;
                android.net.Uri fileUri = completed.getFileUri();
                if (fileUri != null) {
                    return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Success(fileUri, kotlin.text.StringsKt.substringAfterLast$default(completed.getFilePath(), kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null), completed.getMimeType());
                }
                return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.download.DownloadResult.Error(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Failed to generate file URI", null, 2, null));
            }
        }
        downloadDocumentUseCase$invoke$1 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = downloadDocumentUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadDocumentUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj2;
        if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadState> continuation) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$1 downloadDocumentUseCase$awaitDownloadCompletion$1;
        int i;
        com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest2;
        com.paypal.oslo.downloads.api.DownloadManager downloadManager;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$1) {
            downloadDocumentUseCase$awaitDownloadCompletion$1 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$1) continuation;
            if ((downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj2 = downloadDocumentUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.downloads.api.DownloadManager downloadManager2 = this.Camera2StreamConfigurationMap;
                    downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes = downloadManager2;
                    downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object obj3 = downloadManager2.mo11709downloadxebedEM(downloadRequest, downloadDocumentUseCase$awaitDownloadCompletion$1);
                    if (obj3 != coroutine_suspended) {
                        downloadRequest2 = downloadRequest;
                        downloadManager = downloadManager2;
                        obj = obj3;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                    return obj2;
                }
                downloadManager = (com.paypal.oslo.downloads.api.DownloadManager) downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes;
                downloadRequest2 = (com.paypal.oslo.downloads.api.model.DownloadRequest) downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj2);
                obj = ((com.paypal.oslo.downloads.api.model.DownloadId) obj2).m11731unboximpl();
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow = downloadManager.mo11714observeDownload3wgKXB0((java.lang.String) obj);
                com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$2 downloadDocumentUseCase$awaitDownloadCompletion$2 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$2(null);
                downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest2);
                downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes = null;
                downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = 2;
                java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(flow, downloadDocumentUseCase$awaitDownloadCompletion$2, downloadDocumentUseCase$awaitDownloadCompletion$1);
                return first != coroutine_suspended ? coroutine_suspended : first;
            }
        }
        downloadDocumentUseCase$awaitDownloadCompletion$1 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$1(this, continuation);
        java.lang.Object obj22 = downloadDocumentUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow2 = downloadManager.mo11714observeDownload3wgKXB0((java.lang.String) obj);
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$2 downloadDocumentUseCase$awaitDownloadCompletion$22 = new com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$awaitDownloadCompletion$2(null);
        downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest2);
        downloadDocumentUseCase$awaitDownloadCompletion$1.getHighSpeedVideoSizes = null;
        downloadDocumentUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = 2;
        java.lang.Object first2 = kotlinx.coroutines.flow.FlowKt.first(flow2, downloadDocumentUseCase$awaitDownloadCompletion$22, downloadDocumentUseCase$awaitDownloadCompletion$1);
        if (first2 != coroutine_suspended2) {
        }
    }
}
