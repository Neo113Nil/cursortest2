package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JT\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eH\u0086B¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadFileUseCase;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;)V", "", "url", "", "isAuthRequired", "source", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "headers", "Larrow/core/Either;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadedFile;", "invoke", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "p0", "Lcom/paypal/oslo/downloads/api/model/DownloadState;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DownloadFileUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.validation.UrlValidator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public DownloadFileUseCase(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        this.getHighSpeedVideoFpsRangesFor = downloadManager;
        this.getHighSpeedVideoSizes = urlValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.model.DownloadError, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$invoke$1 downloadFileUseCase$invoke$1;
        int i;
        com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth noAuth;
        com.paypal.oslo.downloads.api.model.DownloadState downloadState;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$invoke$1) {
            downloadFileUseCase$invoke$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$invoke$1) continuation;
            if ((downloadFileUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                downloadFileUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = downloadFileUseCase$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (z) {
                        noAuth = new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, str2);
                    } else {
                        noAuth = com.paypal.oslo.downloads.api.model.DownloadAuthType.NoAuth.INSTANCE;
                    }
                    com.paypal.oslo.downloads.api.model.DownloadRequest.Builder headers = new com.paypal.oslo.downloads.api.model.DownloadRequest.Builder(str).setAuthType(noAuth).setHeaders(map);
                    if (str3.length() > 0) {
                        headers.setExpectedMimeType(str3);
                    }
                    com.paypal.oslo.downloads.api.model.DownloadRequestResult build = headers.build(this.getHighSpeedVideoSizes);
                    if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success)) {
                        if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        java.lang.String errorMessage = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed) build).getValidationResult().getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "URL validation failed";
                        }
                        return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(errorMessage, com.paypal.oslo.downloads.api.model.ValidationType.URL, null, 4, null));
                    }
                    com.paypal.oslo.downloads.api.model.DownloadRequest request = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) build).getRequest();
                    downloadFileUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    downloadFileUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    downloadFileUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str3);
                    downloadFileUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                    downloadFileUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                    downloadFileUseCase$invoke$1.getOutputMinFrameDuration = z;
                    downloadFileUseCase$invoke$1.getInputFormats = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(request, downloadFileUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = downloadFileUseCase$invoke$1.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                if (!(downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed)) {
                    com.paypal.oslo.downloads.api.model.DownloadState.Completed completed = (com.paypal.oslo.downloads.api.model.DownloadState.Completed) downloadState;
                    android.net.Uri fileUri = completed.getFileUri();
                    return (fileUri == null || (right = arrow.core.EitherKt.right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile(fileUri, completed.getMimeType()))) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.StorageError("File URI is null after download completed", 0L, 0L, null, 14, null)) : right;
                }
                if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) {
                    return arrow.core.EitherKt.left(((com.paypal.oslo.downloads.api.model.DownloadState.Failed) downloadState).getError());
                }
                if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Cancelled) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Download was cancelled", null, 2, null));
                }
                if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(((com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) downloadState).getMessage(), true, null, 4, null));
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.UnknownError("Download ended in unexpected state: ".concat(java.lang.String.valueOf(downloadState)), null, 2, null));
            }
        }
        downloadFileUseCase$invoke$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = downloadFileUseCase$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj2;
        if (!(downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed)) {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.util.Map map, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.RevolvingCreditWebViewArgs.DEFAULT_DOWNLOAD_SOURCE;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return downloadFileUseCase.invoke(str, z, str4, str3, map, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadState> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$1 downloadFileUseCase$awaitDownloadCompletion$1;
        int i;
        java.lang.Object obj;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$1) {
            downloadFileUseCase$awaitDownloadCompletion$1 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$1) continuation;
            if ((downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj2 = downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.downloads.api.DownloadManager downloadManager = this.getHighSpeedVideoFpsRangesFor;
                    downloadFileUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 1;
                    obj = downloadManager.mo11709downloadxebedEM(downloadRequest, downloadFileUseCase$awaitDownloadCompletion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj2);
                        return obj2;
                    }
                    downloadRequest = (com.paypal.oslo.downloads.api.model.DownloadRequest) downloadFileUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    obj = ((com.paypal.oslo.downloads.api.model.DownloadId) obj2).m11731unboximpl();
                }
                java.lang.String str = (java.lang.String) obj;
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow = this.getHighSpeedVideoFpsRangesFor.mo11714observeDownload3wgKXB0(str);
                com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$2 downloadFileUseCase$awaitDownloadCompletion$2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$2(null);
                downloadFileUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object first = kotlinx.coroutines.flow.FlowKt.first(flow, downloadFileUseCase$awaitDownloadCompletion$2, downloadFileUseCase$awaitDownloadCompletion$1);
                return first != coroutine_suspended ? coroutine_suspended : first;
            }
        }
        downloadFileUseCase$awaitDownloadCompletion$1 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$1(this, continuation);
        java.lang.Object obj22 = downloadFileUseCase$awaitDownloadCompletion$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow2 = this.getHighSpeedVideoFpsRangesFor.mo11714observeDownload3wgKXB0(str2);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$2 downloadFileUseCase$awaitDownloadCompletion$22 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$awaitDownloadCompletion$2(null);
        downloadFileUseCase$awaitDownloadCompletion$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
        downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        downloadFileUseCase$awaitDownloadCompletion$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object first2 = kotlinx.coroutines.flow.FlowKt.first(flow2, downloadFileUseCase$awaitDownloadCompletion$22, downloadFileUseCase$awaitDownloadCompletion$1);
        if (first2 != coroutine_suspended2) {
        }
    }
}
