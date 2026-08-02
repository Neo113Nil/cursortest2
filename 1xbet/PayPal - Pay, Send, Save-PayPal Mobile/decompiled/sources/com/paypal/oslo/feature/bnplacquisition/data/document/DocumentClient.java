package com.paypal.oslo.feature.bnplacquisition.data.document;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b \u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH$¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/document/DocumentClient;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentError;", "Landroid/net/Uri;", "downloadDocument", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/document/DocumentDownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "buildFullUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DocumentClient {
    public static final java.lang.String DOCUMENT_MIME_TYPE = "application/pdf";
    public static final java.lang.String DOCUMENT_TAG = "bnpl_acquisition_pdf_download";
    private final com.paypal.oslo.downloads.api.DownloadManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.validation.UrlValidator getHighSpeedVideoSizes;
    public static final int $stable = 8;

    protected abstract java.lang.String buildFullUrl(java.lang.String url);

    public DocumentClient(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        this.Camera2StreamConfigurationMap = downloadManager;
        this.getHighSpeedVideoSizes = urlValidator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019a A[Catch: Exception -> 0x0232, TryCatch #4 {Exception -> 0x0232, blocks: (B:14:0x0190, B:16:0x019a, B:18:0x01a2, B:23:0x01aa, B:25:0x01b7, B:27:0x01bb, B:29:0x01f6, B:31:0x01fa, B:33:0x0216, B:54:0x0163), top: B:53:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b7 A[Catch: Exception -> 0x0232, TryCatch #4 {Exception -> 0x0232, blocks: (B:14:0x0190, B:16:0x019a, B:18:0x01a2, B:23:0x01aa, B:25:0x01b7, B:27:0x01bb, B:29:0x01f6, B:31:0x01fa, B:33:0x0216, B:54:0x0163), top: B:53:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadDocument(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError, ? extends android.net.Uri>> continuation) {
        com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$downloadDocument$1 documentClient$downloadDocument$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        ?? r8;
        java.lang.String buildFullUrl;
        com.paypal.oslo.downloads.api.model.DownloadRequestResult build;
        com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest;
        java.lang.Object obj2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest2;
        java.lang.String simpleName;
        java.lang.String message;
        com.paypal.oslo.downloads.api.model.DownloadState downloadState;
        arrow.core.Either right;
        try {
            if (continuation instanceof com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$downloadDocument$1) {
                documentClient$downloadDocument$1 = (com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$downloadDocument$1) continuation;
                if ((documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    obj = documentClient$downloadDocument$1.getInputSizeshNQ4ISI;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        try {
                            buildFullUrl = buildFullUrl(documentDownloadRequest.getUrl());
                            java.lang.String fileName = documentDownloadRequest.getFileName();
                            java.lang.String creditAccountId = documentDownloadRequest.getCreditAccountId();
                            com.paypal.oslo.feature.bnplacquisition.domain.model.productselection.CreditProductIdentifier cpi = documentDownloadRequest.getCpi();
                            com.paypal.oslo.downloads.api.model.DownloadRequest.Builder authType = new com.paypal.oslo.downloads.api.model.DownloadRequest.Builder(buildFullUrl).setFileName(fileName).setConfig(new com.paypal.oslo.downloads.api.model.DownloadConfig(false, false, false, false, 0, 0L, 0L, false, null, null, 1023, null)).setAuthType(new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(null, null, 3, null));
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("credit_product_identifier", cpi.name());
                            jSONObject.put("credit_account_id", creditAccountId);
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("id", "CREDIT_SCHEMA");
                            jSONObject2.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
                            java.lang.String jSONObject3 = jSONObject2.toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                            createMapBuilder.put("Accept", "application/pdf");
                            java.lang.String property = java.lang.System.getProperty(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.SYSTEM_UA);
                            if (property != null) {
                            }
                            createMapBuilder.put("PayPal-Client-Context", jSONObject3);
                            com.paypal.oslo.downloads.api.model.DownloadRequest.Builder priority = authType.setHeaders(kotlin.collections.MapsKt.build(createMapBuilder)).setPriority(com.paypal.oslo.downloads.api.model.DownloadPriority.NORMAL);
                            r8 = DOCUMENT_TAG;
                            build = priority.setTag(DOCUMENT_TAG).setExpectedMimeType("application/pdf").build(this.getHighSpeedVideoSizes);
                        } catch (java.lang.Exception e) {
                            e = e;
                            r8 = documentDownloadRequest;
                        }
                        try {
                            if (build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) {
                                downloadRequest = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) build).getRequest();
                            } else {
                                if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                downloadRequest = null;
                            }
                            if (downloadRequest == null) {
                                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.ValidationFailed("Invalid download request"));
                            }
                            com.paypal.oslo.downloads.api.DownloadManager downloadManager = this.Camera2StreamConfigurationMap;
                            documentClient$downloadDocument$1.getHighSpeedVideoSizes = documentDownloadRequest;
                            documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
                            documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                            documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = 1;
                            obj2 = downloadManager.mo11709downloadxebedEM(downloadRequest, documentClient$downloadDocument$1);
                            if (obj2 != coroutine_suspended) {
                                documentDownloadRequest2 = documentDownloadRequest;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            documentDownloadRequest2 = r8;
                            java.lang.String fileName2 = documentDownloadRequest2.getFileName();
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[3];
                            simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
                            if (simpleName == null) {
                            }
                            pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
                            message = e.getMessage();
                            if (message == null) {
                            }
                            pairArr[1] = kotlin.TuplesKt.to("error_message", message);
                            pairArr[2] = kotlin.TuplesKt.to("file_name", fileName2);
                            java.lang.Exception exc = e;
                            com.paypal.android.logger.Logger.e$default(logger, "Document download exception", kotlin.collections.MapsKt.mapOf(pairArr), null, exc, 4, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.Unknown(exc));
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest documentDownloadRequest3 = (com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest) documentClient$downloadDocument$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            documentDownloadRequest2 = documentDownloadRequest3;
                            downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                            java.lang.String fileName3 = documentDownloadRequest2.getFileName();
                            if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
                                android.net.Uri fileUri = ((com.paypal.oslo.downloads.api.model.DownloadState.Completed) downloadState).getFileUri();
                                return (fileUri == null || (right = arrow.core.EitherKt.right(fileUri)) == null) ? arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.DownloadFailed("File URI is null after download")) : right;
                            }
                            if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Failed) {
                                com.paypal.oslo.downloads.api.model.DownloadState.Failed failed = (com.paypal.oslo.downloads.api.model.DownloadState.Failed) downloadState;
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Document download failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", failed.getError().getMessage()), kotlin.TuplesKt.to("file_name", fileName3)), null, 4, null);
                                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.DownloadFailed(failed.getError().getMessage()));
                            }
                            if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.NoNetwork) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Document download failed - no network", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file_name", fileName3)), null, 4, null);
                                return arrow.core.EitherKt.left(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.NoNetwork.INSTANCE);
                            }
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.bnplacquisition.LoggerKt.log, "Document download cancelled", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file_name", fileName3)), null, 4, null);
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.Cancelled.INSTANCE);
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            r8 = documentDownloadRequest3;
                            documentDownloadRequest2 = r8;
                            java.lang.String fileName22 = documentDownloadRequest2.getFileName();
                            com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
                            kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                            simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
                            if (simpleName == null) {
                            }
                            pairArr2[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
                            message = e.getMessage();
                            if (message == null) {
                            }
                            pairArr2[1] = kotlin.TuplesKt.to("error_message", message);
                            pairArr2[2] = kotlin.TuplesKt.to("file_name", fileName22);
                            java.lang.Exception exc2 = e;
                            com.paypal.android.logger.Logger.e$default(logger2, "Document download exception", kotlin.collections.MapsKt.mapOf(pairArr2), null, exc2, 4, null);
                            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.Unknown(exc2));
                        }
                    }
                    downloadRequest = (com.paypal.oslo.downloads.api.model.DownloadRequest) documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI;
                    buildFullUrl = (java.lang.String) documentClient$downloadDocument$1.Camera2StreamConfigurationMap;
                    documentDownloadRequest2 = (com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentDownloadRequest) documentClient$downloadDocument$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        obj2 = ((com.paypal.oslo.downloads.api.model.DownloadId) obj).m11731unboximpl();
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        java.lang.String fileName222 = documentDownloadRequest2.getFileName();
                        com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
                        kotlin.Pair[] pairArr22 = new kotlin.Pair[3];
                        simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "Unknown";
                        }
                        pairArr22[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
                        message = e.getMessage();
                        if (message == null) {
                            message = "No message";
                        }
                        pairArr22[1] = kotlin.TuplesKt.to("error_message", message);
                        pairArr22[2] = kotlin.TuplesKt.to("file_name", fileName222);
                        java.lang.Exception exc22 = e;
                        com.paypal.android.logger.Logger.e$default(logger22, "Document download exception", kotlin.collections.MapsKt.mapOf(pairArr22), null, exc22, 4, null);
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.Unknown(exc22));
                    }
                    java.lang.String str = (java.lang.String) obj2;
                    documentClient$downloadDocument$1.getHighSpeedVideoSizes = documentDownloadRequest2;
                    documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
                    documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = 2;
                    obj = kotlinx.coroutines.flow.FlowKt.first(this.Camera2StreamConfigurationMap.mo11714observeDownload3wgKXB0(str), new com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2(null), documentClient$downloadDocument$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                    java.lang.String fileName32 = documentDownloadRequest2.getFileName();
                    if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
                    }
                }
            }
            java.lang.String str2 = (java.lang.String) obj2;
            documentClient$downloadDocument$1.getHighSpeedVideoSizes = documentDownloadRequest2;
            documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
            documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
            documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = 2;
            obj = kotlinx.coroutines.flow.FlowKt.first(this.Camera2StreamConfigurationMap.mo11714observeDownload3wgKXB0(str2), new com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$awaitFinalDownloadState$2(null), documentClient$downloadDocument$1);
            if (obj == coroutine_suspended) {
            }
            downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
            java.lang.String fileName322 = documentDownloadRequest2.getFileName();
            if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
            }
        } catch (java.lang.Exception e5) {
            e = e5;
            r8 = documentDownloadRequest2;
            documentDownloadRequest2 = r8;
            java.lang.String fileName2222 = documentDownloadRequest2.getFileName();
            com.paypal.android.logger.Logger logger222 = com.paypal.oslo.feature.bnplacquisition.LoggerKt.log;
            kotlin.Pair[] pairArr222 = new kotlin.Pair[3];
            simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName();
            if (simpleName == null) {
            }
            pairArr222[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
            message = e.getMessage();
            if (message == null) {
            }
            pairArr222[1] = kotlin.TuplesKt.to("error_message", message);
            pairArr222[2] = kotlin.TuplesKt.to("file_name", fileName2222);
            java.lang.Exception exc222 = e;
            com.paypal.android.logger.Logger.e$default(logger222, "Document download exception", kotlin.collections.MapsKt.mapOf(pairArr222), null, exc222, 4, null);
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.bnplacquisition.domain.model.document.DocumentError.Unknown(exc222));
        }
        documentClient$downloadDocument$1 = new com.paypal.oslo.feature.bnplacquisition.data.document.DocumentClient$downloadDocument$1(this, continuation);
        obj = documentClient$downloadDocument$1.getInputSizeshNQ4ISI;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }
}
