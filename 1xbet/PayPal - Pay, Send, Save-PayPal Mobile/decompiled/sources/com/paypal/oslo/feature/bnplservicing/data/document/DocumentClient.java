package com.paypal.oslo.feature.bnplservicing.data.document;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b \u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/document/DocumentClient;", "", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "downloadManager", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "urlValidator", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadManager;Lcom/paypal/oslo/downloads/api/validation/UrlValidator;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;", "request", "Landroid/net/Uri;", "downloadDocument", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/document/DocumentDownloadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "buildFullUrl", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/downloads/api/DownloadManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/downloads/api/validation/UrlValidator;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class DocumentClient {
    public static final java.lang.String DOCUMENT_MIME_TYPE = "application/pdf";
    public static final java.lang.String DOCUMENT_TAG = "pdf_download_file";
    private final com.paypal.oslo.downloads.api.validation.UrlValidator getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.downloads.api.DownloadManager getHighSpeedVideoSizes;
    public static final int $stable = 8;

    protected abstract java.lang.String buildFullUrl(java.lang.String url);

    public DocumentClient(com.paypal.oslo.downloads.api.DownloadManager downloadManager, com.paypal.oslo.downloads.api.validation.UrlValidator urlValidator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlValidator, "");
        this.getHighSpeedVideoSizes = downloadManager;
        this.getHighResolutionOutputSizeshNQ4ISI = urlValidator;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(1:(8:11|12|13|(4:15|16|17|(1:22)(2:19|20))|23|16|17|(0)(0))(2:24|25))(2:26|27))(5:32|33|(1:35)|36|(3:38|(1:40)|31)(6:41|(2:43|44)|23|16|17|(0)(0)))|28|(2:30|31)|13|(0)|23|16|17|(0)(0)))|47|6|7|(0)(0)|28|(0)|13|(0)|23|16|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b5, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019c A[Catch: all -> 0x01b4, TRY_LEAVE, TryCatch #0 {all -> 0x01b4, blocks: (B:12:0x004a, B:13:0x0196, B:15:0x019c, B:16:0x01a9, B:27:0x006d, B:28:0x0158, B:33:0x007b, B:35:0x00f5, B:36:0x00fd, B:38:0x0124, B:43:0x01ae, B:44:0x01b3), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadDocument(com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest, kotlin.coroutines.Continuation<? super android.net.Uri> continuation) {
        com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$1 documentClient$downloadDocument$1;
        java.lang.Object obj;
        java.lang.Object coroutine_suspended;
        int i;
        java.lang.Object m23436constructorimpl;
        java.lang.String buildFullUrl;
        com.paypal.oslo.downloads.api.model.DownloadRequest request;
        com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest documentDownloadRequest2;
        com.paypal.oslo.downloads.api.model.DownloadRequestResult downloadRequestResult;
        java.lang.Object obj2;
        int i2;
        com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient documentClient;
        android.net.Uri uri;
        com.paypal.oslo.downloads.api.model.DownloadState downloadState;
        if (continuation instanceof com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$1) {
            documentClient$downloadDocument$1 = (com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$1) continuation;
            if ((documentClient$downloadDocument$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                documentClient$downloadDocument$1.getHighSpeedVideoSizesFor -= 2147483648;
                obj = documentClient$downloadDocument$1.getInputFormats;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = documentClient$downloadDocument$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient documentClient2 = this;
                    buildFullUrl = buildFullUrl(documentDownloadRequest.getUrl());
                    com.paypal.oslo.downloads.api.model.DownloadRequest.Builder authType = new com.paypal.oslo.downloads.api.model.DownloadRequest.Builder(buildFullUrl).setFileName(documentDownloadRequest.getFileName()).setConfig(new com.paypal.oslo.downloads.api.model.DownloadConfig(false, false, false, false, 0, 0L, 0L, false, null, null, 1023, null)).setAuthType(new com.paypal.oslo.downloads.api.model.DownloadAuthType.UserAuth(null, null, 3, null));
                    final java.lang.String creditAccountId = documentDownloadRequest.getCreditAccountId();
                    final com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier cpi = documentDownloadRequest.getCpi();
                    kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder = new kotlinx.serialization.json.JsonObjectBuilder();
                    kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "id", "CREDIT_SCHEMA");
                    kotlinx.serialization.json.JsonElementBuildersKt.putJsonObject(jsonObjectBuilder, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient.$r8$lambda$TG4z14pQTwe3V6hcMEcEx12XlCg(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier.this, creditAccountId, (kotlinx.serialization.json.JsonObjectBuilder) obj3);
                        }
                    });
                    java.lang.String obj3 = jsonObjectBuilder.build().toString();
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    createMapBuilder.put("Accept", "application/pdf");
                    java.lang.String property = java.lang.System.getProperty(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.SYSTEM_UA);
                    if (property != null) {
                    }
                    createMapBuilder.put("PayPal-Client-Context", obj3);
                    com.paypal.oslo.downloads.api.model.DownloadRequestResult build = authType.setHeaders(kotlin.collections.MapsKt.build(createMapBuilder)).setPriority(com.paypal.oslo.downloads.api.model.DownloadPriority.NORMAL).setTag(DOCUMENT_TAG).setExpectedMimeType("application/pdf").build(this.getHighResolutionOutputSizeshNQ4ISI);
                    if (build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) {
                        request = ((com.paypal.oslo.downloads.api.model.DownloadRequestResult.Success) build).getRequest();
                        com.paypal.oslo.downloads.api.DownloadManager downloadManager = this.getHighSpeedVideoSizes;
                        documentClient$downloadDocument$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentDownloadRequest);
                        documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor = this;
                        documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
                        documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                        documentClient$downloadDocument$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                        documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        documentClient$downloadDocument$1.getHighSpeedVideoSizesFor = 1;
                        java.lang.Object obj4 = downloadManager.mo11709downloadxebedEM(request, documentClient$downloadDocument$1);
                        if (obj4 != coroutine_suspended) {
                            documentDownloadRequest2 = documentDownloadRequest;
                            downloadRequestResult = build;
                            obj2 = obj4;
                            i2 = 0;
                            documentClient = this;
                        }
                        return coroutine_suspended;
                    }
                    if (!(build instanceof com.paypal.oslo.downloads.api.model.DownloadRequestResult.ValidationFailed)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    uri = null;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(uri);
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    }
                } else if (i == 1) {
                    i2 = documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI;
                    request = (com.paypal.oslo.downloads.api.model.DownloadRequest) documentClient$downloadDocument$1.getInputSizeshNQ4ISI;
                    downloadRequestResult = (com.paypal.oslo.downloads.api.model.DownloadRequestResult) documentClient$downloadDocument$1.Camera2StreamConfigurationMap;
                    buildFullUrl = (java.lang.String) documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges;
                    documentClient = (com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient) documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor;
                    documentDownloadRequest2 = (com.paypal.oslo.feature.bnplservicing.domain.model.document.DocumentDownloadRequest) documentClient$downloadDocument$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj2 = ((com.paypal.oslo.downloads.api.model.DownloadId) obj).m11731unboximpl();
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                    if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
                        uri = ((com.paypal.oslo.downloads.api.model.DownloadState.Completed) downloadState).getFileUri();
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(uri);
                        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            return null;
                        }
                        return m23436constructorimpl;
                    }
                    uri = null;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(uri);
                    if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                    }
                }
                java.lang.String str = (java.lang.String) obj2;
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow = documentClient.getHighSpeedVideoSizes.mo11714observeDownload3wgKXB0(str);
                com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1 documentClient$downloadDocument$2$finalState$1 = new com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1(null);
                documentClient$downloadDocument$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentDownloadRequest2);
                documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentClient);
                documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
                documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequestResult);
                documentClient$downloadDocument$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                documentClient$downloadDocument$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
                documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                documentClient$downloadDocument$1.getHighSpeedVideoSizesFor = 2;
                obj = kotlinx.coroutines.flow.FlowKt.first(flow, documentClient$downloadDocument$2$finalState$1, documentClient$downloadDocument$1);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
                if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
                }
                uri = null;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(uri);
                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                }
            }
        }
        documentClient$downloadDocument$1 = new com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$1(this, continuation);
        obj = documentClient$downloadDocument$1.getInputFormats;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = documentClient$downloadDocument$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        kotlinx.coroutines.flow.Flow<com.paypal.oslo.downloads.api.model.DownloadState> flow2 = documentClient.getHighSpeedVideoSizes.mo11714observeDownload3wgKXB0(str2);
        com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1 documentClient$downloadDocument$2$finalState$12 = new com.paypal.oslo.feature.bnplservicing.data.document.DocumentClient$downloadDocument$2$finalState$1(null);
        documentClient$downloadDocument$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentDownloadRequest2);
        documentClient$downloadDocument$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentClient);
        documentClient$downloadDocument$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(buildFullUrl);
        documentClient$downloadDocument$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequestResult);
        documentClient$downloadDocument$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
        documentClient$downloadDocument$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(request);
        documentClient$downloadDocument$1.getHighResolutionOutputSizeshNQ4ISI = i2;
        documentClient$downloadDocument$1.getHighSpeedVideoSizesFor = 2;
        obj = kotlinx.coroutines.flow.FlowKt.first(flow2, documentClient$downloadDocument$2$finalState$12, documentClient$downloadDocument$1);
        if (obj == coroutine_suspended) {
        }
        downloadState = (com.paypal.oslo.downloads.api.model.DownloadState) obj;
        if (downloadState instanceof com.paypal.oslo.downloads.api.model.DownloadState.Completed) {
        }
        uri = null;
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(uri);
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TG4z14pQTwe3V6hcMEcEx12XlCg(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier, java.lang.String str, kotlinx.serialization.json.JsonObjectBuilder jsonObjectBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObjectBuilder, "");
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "credit_product_identifier", creditProductIdentifier.name());
        kotlinx.serialization.json.JsonElementBuildersKt.put(jsonObjectBuilder, "credit_account_id", str);
        return kotlin.Unit.INSTANCE;
    }
}
