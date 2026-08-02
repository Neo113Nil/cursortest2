package com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/DownloadFileMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/SideEffectMiddleware;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadFileUseCase;", "downloadFileUseCase", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadFileUseCase;)V", "state", "Lkotlin/Function1;", "", "eventDispatcher", "onState", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState$DownloadingFile;", "p0", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/webview/viewmodel/RevolvingCreditWebViewState$DownloadingFile;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/usecase/common/DownloadFileUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DownloadFileMiddleware extends com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware<com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState, com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DownloadFileMiddleware(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadFileUseCase, "");
        this.getHighSpeedVideoFpsRanges = downloadFileUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.SideEffectMiddleware
    public final /* bridge */ /* synthetic */ java.lang.Object onState(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState revolvingCreditWebViewState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation continuation) {
        return onState2(revolvingCreditWebViewState, function1, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: onState, reason: avoid collision after fix types in other method */
    public final java.lang.Object onState2(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState revolvingCreditWebViewState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!(revolvingCreditWebViewState instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState.DownloadingFile)) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState.DownloadingFile) revolvingCreditWebViewState, function1, continuation);
        return Camera2StreamConfigurationMap == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? Camera2StreamConfigurationMap : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object Camera2StreamConfigurationMap(com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewState.DownloadingFile downloadingFile, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1 downloadFileMiddleware$downloadFile$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1) {
            downloadFileMiddleware$downloadFile$1 = (com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1) continuation;
            if ((downloadFileMiddleware$downloadFile$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                downloadFileMiddleware$downloadFile$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1 downloadFileMiddleware$downloadFile$12 = downloadFileMiddleware$downloadFile$1;
                java.lang.Object obj = downloadFileMiddleware$downloadFile$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileMiddleware$downloadFile$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    java.lang.String userAgent = downloadingFile.getUserAgent();
                    if (userAgent == null && (userAgent = java.lang.System.getProperty(com.datadog.android.core.internal.data.upload.DataOkHttpUploader.SYSTEM_UA)) == null) {
                        userAgent = "";
                    }
                    createMapBuilder.put("User-Agent", userAgent);
                    java.lang.String cookie = android.webkit.CookieManager.getInstance().getCookie(downloadingFile.getUrl());
                    if (cookie != null) {
                        createMapBuilder.put("Cookie", cookie);
                    }
                    java.util.Map<java.lang.String, java.lang.String> build = kotlin.collections.MapsKt.build(createMapBuilder);
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase = this.getHighSpeedVideoFpsRanges;
                    java.lang.String url = downloadingFile.getUrl();
                    boolean isAuthRequired = downloadingFile.isAuthRequired();
                    java.lang.String downloadSource = downloadingFile.getDownloadSource();
                    java.lang.String mimeType = downloadingFile.getMimeType();
                    java.lang.String str = mimeType == null ? "" : mimeType;
                    downloadFileMiddleware$downloadFile$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadingFile);
                    downloadFileMiddleware$downloadFile$12.getHighSpeedVideoFpsRangesFor = function1;
                    downloadFileMiddleware$downloadFile$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(build);
                    downloadFileMiddleware$downloadFile$12.getHighSpeedVideoSizes = 1;
                    obj = downloadFileUseCase.invoke(url, isAuthRequired, downloadSource, str, build, downloadFileMiddleware$downloadFile$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function1) downloadFileMiddleware$downloadFile$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile downloadedFile = (com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadedFile) ((arrow.core.Either.Right) either).getValue();
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadCompleted(downloadedFile.getUri(), downloadedFile.getMimeType()));
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.downloads.api.model.DownloadError downloadError = (com.paypal.oslo.downloads.api.model.DownloadError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.revolvingcreditservicing.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(downloadError.getClass()).getSimpleName();
                    pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName != null ? simpleName : "");
                    pairArr[1] = kotlin.TuplesKt.to("errorMessage", downloadError.getMessage());
                    com.paypal.android.logger.Logger.w$default(logger, "File download failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.RevolvingCreditWebViewEvent.OnDownloadFailed(downloadError.getMessage()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        downloadFileMiddleware$downloadFile$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.webview.viewmodel.DownloadFileMiddleware$downloadFile$1 downloadFileMiddleware$downloadFile$122 = downloadFileMiddleware$downloadFile$1;
        java.lang.Object obj2 = downloadFileMiddleware$downloadFile$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileMiddleware$downloadFile$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
