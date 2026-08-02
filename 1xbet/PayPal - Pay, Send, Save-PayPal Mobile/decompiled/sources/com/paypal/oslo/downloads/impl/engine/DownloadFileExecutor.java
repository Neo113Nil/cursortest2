package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u001b\u0010\u0012J\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadFileExecutor;", "", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "downloadHttpClient", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "contentValidator", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "fileDeleter", "<init>", "(Lcom/paypal/oslo/downloads/api/DownloadHttpClient;Lcom/paypal/oslo/downloads/api/validation/ContentValidator;Lcom/paypal/oslo/downloads/impl/util/FileDeleter;)V", "Lcom/paypal/oslo/downloads/api/model/DownloadRequest;", "request", "Ljava/io/File;", "targetFile", "Larrow/core/Either;", "Lcom/paypal/oslo/downloads/api/model/DownloadError;", "Lcom/paypal/oslo/downloads/impl/engine/DownloadFileSuccess;", "execute", "(Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Response;", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "(Lokhttp3/Response;Lcom/paypal/oslo/downloads/api/model/DownloadRequest;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "(Lokhttp3/Response;Ljava/io/File;)Lcom/paypal/oslo/downloads/api/model/DownloadError;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;", "Lcom/paypal/oslo/downloads/api/model/ValidationType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;)Lcom/paypal/oslo/downloads/api/model/ValidationType;", "Lcom/paypal/oslo/downloads/api/DownloadHttpClient;", "Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/downloads/impl/util/FileDeleter;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DownloadFileExecutor {
    private static final com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor.Companion Companion = new com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor.Companion(null);
    private static final kotlin.ranges.IntRange getHighSpeedVideoSizes = new kotlin.ranges.IntRange(500, 599);
    private final com.paypal.oslo.downloads.impl.util.FileDeleter Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.DownloadHttpClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.downloads.api.validation.ContentValidator getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DownloadFileExecutor(com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient, com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator, com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadHttpClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValidator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileDeleter, "");
        this.getHighSpeedVideoFpsRanges = downloadHttpClient;
        this.getHighSpeedVideoSizes = contentValidator;
        this.Camera2StreamConfigurationMap = fileDeleter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r9 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
    
        if (r9 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.model.DownloadError, com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess>> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$execute$1 downloadFileExecutor$execute$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.downloads.api.model.DownloadError.ValidationError validationError;
        if (continuation instanceof com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$execute$1) {
            downloadFileExecutor$execute$1 = (com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$execute$1) continuation;
            if ((downloadFileExecutor$execute$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                downloadFileExecutor$execute$1.getInputFormats -= 2147483648;
                java.lang.Object obj = downloadFileExecutor$execute$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileExecutor$execute$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.downloads.api.DownloadHttpClient downloadHttpClient = this.getHighSpeedVideoFpsRanges;
                    downloadFileExecutor$execute$1.Camera2StreamConfigurationMap = downloadRequest;
                    downloadFileExecutor$execute$1.getHighSpeedVideoFpsRanges = file;
                    downloadFileExecutor$execute$1.getInputFormats = 1;
                    obj = downloadHttpClient.downloadAsync(downloadRequest, downloadFileExecutor$execute$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = downloadFileExecutor$execute$1.getHighSpeedVideoSizes;
                        int i3 = downloadFileExecutor$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    file = (java.io.File) downloadFileExecutor$execute$1.getHighSpeedVideoFpsRanges;
                    downloadRequest = (com.paypal.oslo.downloads.api.model.DownloadRequest) downloadFileExecutor$execute$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    okhttp3.Response response = (okhttp3.Response) ((arrow.core.Either.Right) either).getValue();
                    downloadFileExecutor$execute$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    downloadFileExecutor$execute$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                    downloadFileExecutor$execute$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    downloadFileExecutor$execute$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
                    downloadFileExecutor$execute$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    downloadFileExecutor$execute$1.getHighSpeedVideoSizes = 0;
                    downloadFileExecutor$execute$1.getInputFormats = 2;
                    obj = getHighSpeedVideoFpsRangesFor(response, downloadRequest, file, downloadFileExecutor$execute$1);
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.downloads.api.HttpDownloadError httpDownloadError = (com.paypal.oslo.downloads.api.HttpDownloadError) ((arrow.core.Either.Left) either).getValue();
                    if (httpDownloadError instanceof com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated) {
                        com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated networkRelated = (com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated) httpDownloadError;
                        validationError = new com.paypal.oslo.downloads.api.model.DownloadError.NetworkError(networkRelated.getMessage(), false, networkRelated.getCause(), 2, null);
                    } else {
                        if (!(httpDownloadError instanceof com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch mimeTypeMismatch = (com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch) httpDownloadError;
                        java.lang.String expectedMimeType = mimeTypeMismatch.getExpectedMimeType();
                        java.lang.String actualMimeType = mimeTypeMismatch.getActualMimeType();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("MIME type mismatch: expected '");
                        sb.append(expectedMimeType);
                        sb.append("' but received '");
                        sb.append(actualMimeType);
                        sb.append("'");
                        validationError = new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(sb.toString(), com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE, null, 4, null);
                    }
                    return arrow.core.EitherKt.left(validationError);
                }
            }
        }
        downloadFileExecutor$execute$1 = new com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$execute$1(this, continuation);
        java.lang.Object obj2 = downloadFileExecutor$execute$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileExecutor$execute$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(okhttp3.Response response, com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.model.DownloadError, com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess>> continuation) {
        if (!response.getIsSuccessful()) {
            response.close();
            int code = response.code();
            java.lang.String message = response.message();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HTTP ");
            sb.append(code);
            sb.append(": ");
            sb.append(message);
            java.lang.String obj = sb.toString();
            int code2 = response.code();
            kotlin.ranges.IntRange intRange = getHighSpeedVideoSizes;
            int first = intRange.getFirst();
            int last = intRange.getLast();
            int code3 = response.code();
            return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.ServerError(obj, code2, first <= code3 && code3 <= last, null, 8, null));
        }
        com.paypal.oslo.downloads.api.model.DownloadError Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(response, file);
        if (Camera2StreamConfigurationMap != null) {
            return arrow.core.EitherKt.left(Camera2StreamConfigurationMap);
        }
        return getHighSpeedVideoFpsRanges(downloadRequest, file, continuation);
    }

    private static com.paypal.oslo.downloads.api.model.DownloadError Camera2StreamConfigurationMap(okhttp3.Response p0, java.io.File p1) {
        try {
            java.io.FileOutputStream fileOutputStream = p0;
            try {
                fileOutputStream = fileOutputStream.body().byteStream();
                try {
                    java.io.InputStream inputStream = fileOutputStream;
                    fileOutputStream = new java.io.FileOutputStream(p1);
                    try {
                        kotlin.io.ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                        return null;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e) {
            return new com.paypal.oslo.downloads.api.model.DownloadError.StorageError("Failed to write file: ".concat(java.lang.String.valueOf(e.getMessage())), 0L, 0L, e, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.downloads.api.model.DownloadError, com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess>> continuation) {
        com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1 downloadFileExecutor$validateDownloadedContent$1;
        int i;
        com.paypal.oslo.downloads.api.validation.ContentValidationResult contentValidationResult;
        if (continuation instanceof com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1) {
            downloadFileExecutor$validateDownloadedContent$1 = (com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1) continuation;
            if ((downloadFileExecutor$validateDownloadedContent$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                downloadFileExecutor$validateDownloadedContent$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1 downloadFileExecutor$validateDownloadedContent$12 = downloadFileExecutor$validateDownloadedContent$1;
                java.lang.Object obj = downloadFileExecutor$validateDownloadedContent$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = downloadFileExecutor$validateDownloadedContent$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.downloads.api.model.ChecksumConfig checksumConfig = downloadRequest.getConfig().getChecksumConfig();
                    com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator = this.getHighSpeedVideoSizes;
                    java.lang.String expectedMimeType = downloadRequest.getExpectedMimeType();
                    java.lang.String expectedChecksum = checksumConfig != null ? checksumConfig.getExpectedChecksum() : null;
                    com.paypal.oslo.downloads.api.model.ChecksumAlgorithm algorithm = checksumConfig != null ? checksumConfig.getAlgorithm() : null;
                    downloadFileExecutor$validateDownloadedContent$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadRequest);
                    downloadFileExecutor$validateDownloadedContent$12.getHighSpeedVideoSizes = file;
                    downloadFileExecutor$validateDownloadedContent$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(checksumConfig);
                    downloadFileExecutor$validateDownloadedContent$12.Camera2StreamConfigurationMap = 1;
                    obj = contentValidator.validate(file, expectedMimeType, expectedChecksum, algorithm, downloadFileExecutor$validateDownloadedContent$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    file = (java.io.File) downloadFileExecutor$validateDownloadedContent$12.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                contentValidationResult = (com.paypal.oslo.downloads.api.validation.ContentValidationResult) obj;
                if (!contentValidationResult.isValid()) {
                    return arrow.core.EitherKt.right(new com.paypal.oslo.downloads.impl.engine.DownloadFileSuccess(file, contentValidationResult.getDetectedMimeType(), contentValidationResult.getCalculatedChecksum()));
                }
                com.paypal.oslo.downloads.impl.util.FileDeleter fileDeleter = this.Camera2StreamConfigurationMap;
                java.lang.String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                fileDeleter.deleteIfExists(absolutePath);
                java.lang.String errorMessage = contentValidationResult.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = "Content validation failed";
                }
                return arrow.core.EitherKt.left(new com.paypal.oslo.downloads.api.model.DownloadError.ValidationError(errorMessage, getHighResolutionOutputSizeshNQ4ISI(contentValidationResult.getFailedValidationType()), null, 4, null));
            }
        }
        downloadFileExecutor$validateDownloadedContent$1 = new com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1(this, continuation);
        com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor$validateDownloadedContent$1 downloadFileExecutor$validateDownloadedContent$122 = downloadFileExecutor$validateDownloadedContent$1;
        java.lang.Object obj2 = downloadFileExecutor$validateDownloadedContent$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = downloadFileExecutor$validateDownloadedContent$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        contentValidationResult = (com.paypal.oslo.downloads.api.validation.ContentValidationResult) obj2;
        if (!contentValidationResult.isValid()) {
        }
    }

    private static com.paypal.oslo.downloads.api.model.ValidationType getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.downloads.api.validation.ContentValidationType p0) {
        int i = p0 == null ? -1 : com.paypal.oslo.downloads.impl.engine.DownloadFileExecutor.WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == -1) {
            return com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE;
        }
        if (i == 1) {
            return com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE;
        }
        if (i == 2) {
            return com.paypal.oslo.downloads.api.model.ValidationType.CHECKSUM;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.downloads.api.model.ValidationType.CONTENT_TYPE;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/DownloadFileExecutor$Companion;", "", "<init>", "()V", "Lkotlin/ranges/IntRange;", "getHighSpeedVideoSizes", "Lkotlin/ranges/IntRange;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.downloads.api.validation.ContentValidationType.values().length];
            try {
                iArr[com.paypal.oslo.downloads.api.validation.ContentValidationType.MIME_TYPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.downloads.api.validation.ContentValidationType.CHECKSUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.downloads.api.validation.ContentValidationType.FILE_ACCESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
