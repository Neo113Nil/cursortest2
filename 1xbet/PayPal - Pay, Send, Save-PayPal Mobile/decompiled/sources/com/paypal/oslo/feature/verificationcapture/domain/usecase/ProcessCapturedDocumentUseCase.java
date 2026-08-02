package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ProcessCapturedDocumentUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "idCaptureRepository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "captureResult", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "invoke", "(Landroid/graphics/Bitmap;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProcessCapturedDocumentUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ProcessCapturedDocumentUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idCaptureRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = idCaptureRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: IllegalArgumentException -> 0x00af, OutOfMemoryError -> 0x00be, IOException -> 0x00df, TryCatch #2 {IOException -> 0x00df, IllegalArgumentException -> 0x00af, OutOfMemoryError -> 0x00be, blocks: (B:12:0x003a, B:14:0x0099, B:20:0x004f, B:22:0x0069, B:24:0x0071, B:26:0x007f, B:31:0x0057), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[Catch: IllegalArgumentException -> 0x00af, OutOfMemoryError -> 0x00be, IOException -> 0x00df, TryCatch #2 {IOException -> 0x00df, IllegalArgumentException -> 0x00af, OutOfMemoryError -> 0x00be, blocks: (B:12:0x003a, B:14:0x0099, B:20:0x004f, B:22:0x0069, B:24:0x0071, B:26:0x007f, B:31:0x0057), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1 processCapturedDocumentUseCase$invoke$1;
        int i;
        android.graphics.Bitmap bitmap2;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success2;
        boolean booleanValue;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success copy;
        try {
            if (continuation instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1) {
                processCapturedDocumentUseCase$invoke$1 = (com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1) continuation;
                if ((processCapturedDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    processCapturedDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1 processCapturedDocumentUseCase$invoke$12 = processCapturedDocumentUseCase$invoke$1;
                    java.lang.Object obj = processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                        processCapturedDocumentUseCase$invoke$12.Camera2StreamConfigurationMap = bitmap;
                        processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoSizes = success;
                        processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoFpsRanges = 1;
                        obj = idCaptureRepository.validateImageQuality(bitmap, processCapturedDocumentUseCase$invoke$12);
                        if (obj != coroutine_suspended) {
                            bitmap2 = bitmap;
                            success2 = success;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z = processCapturedDocumentUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI;
                        success2 = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        copy = r4.copy((r20 & 1) != 0 ? r4.image : null, (r20 & 2) != 0 ? r4.captureData : null, (r20 & 4) != 0 ? r4.documentSide : null, (r20 & 8) != 0 ? r4.documentType : null, (r20 & 16) != 0 ? r4.compressedImagePath : (java.lang.String) obj, (r20 & 32) != 0 ? r4.documentId : null, (r20 & 64) != 0 ? r4.verificationPlatformId : null, (r20 & 128) != 0 ? r4.deviceCaptureData : null, (r20 & 256) != 0 ? success2.metadata : null);
                        return copy;
                    }
                    success2 = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoSizes;
                    android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) processCapturedDocumentUseCase$invoke$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    bitmap2 = bitmap3;
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    if (booleanValue) {
                        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_QUALITY_TOO_LOW, "Quality validation failed", null, 4, null);
                    }
                    com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    processCapturedDocumentUseCase$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bitmap2);
                    processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoSizes = success2;
                    processCapturedDocumentUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = booleanValue;
                    processCapturedDocumentUseCase$invoke$12.getHighSpeedVideoFpsRanges = 2;
                    obj = com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository.compressImage$default(idCaptureRepository2, bitmap2, 0, processCapturedDocumentUseCase$invoke$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    copy = r4.copy((r20 & 1) != 0 ? r4.image : null, (r20 & 2) != 0 ? r4.captureData : null, (r20 & 4) != 0 ? r4.documentSide : null, (r20 & 8) != 0 ? r4.documentType : null, (r20 & 16) != 0 ? r4.compressedImagePath : (java.lang.String) obj, (r20 & 32) != 0 ? r4.documentId : null, (r20 & 64) != 0 ? r4.verificationPlatformId : null, (r20 & 128) != 0 ? r4.deviceCaptureData : null, (r20 & 256) != 0 ? success2.metadata : null);
                    return copy;
                }
            }
            if (i != 0) {
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            if (booleanValue) {
            }
        } catch (java.io.IOException e) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_PROCESSING_IO_ERROR, "IO error during processing", e);
        } catch (java.lang.IllegalArgumentException e2) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError.CODE_PROCESSING_INVALID_DATA, "Invalid image data", e2);
        } catch (java.lang.OutOfMemoryError e3) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
            java.lang.String message = e3.getMessage();
            if (message == null) {
                message = "unknown";
            }
            com.paypal.android.logger.Logger.e$default(logger, "[ProcessCapturedDocument] OutOfMemoryError during image processing - rethrowing", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, null, 12, null);
            throw e3;
        }
        processCapturedDocumentUseCase$invoke$1 = new com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.domain.usecase.ProcessCapturedDocumentUseCase$invoke$1 processCapturedDocumentUseCase$invoke$122 = processCapturedDocumentUseCase$invoke$1;
        java.lang.Object obj2 = processCapturedDocumentUseCase$invoke$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = processCapturedDocumentUseCase$invoke$122.getHighSpeedVideoFpsRanges;
    }
}
