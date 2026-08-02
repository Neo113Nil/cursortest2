package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 62\u00020\u0001:\u00016B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0017¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010+\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00104R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00105"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/IdCaptureRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonDocumentCaptureDataSource;", "daonDataSource", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonDocumentCaptureDataSource;)V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "config", "", "waitForCameraHalInit", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "startCapture", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;Z)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "getCaptureResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "stopCapture", "Landroid/graphics/Bitmap;", "bitmap", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "compressImage", "(Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateImageQuality", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "scanView", "setScanView", "(Ljava/lang/Object;)V", "clearScanView", "()V", "enabled", "setFlashEnabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonDocumentCaptureDataSource;", "Camera2StreamConfigurationMap", "Lcom/daon/dmds/views/DaonDocumentScanView;", "getHighSpeedVideoFpsRangesFor", "Lcom/daon/dmds/views/DaonDocumentScanView;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IdCaptureRepositoryImpl implements com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.daon.dmds.views.DaonDocumentScanView getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public IdCaptureRepositoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource daonDocumentCaptureDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daonDocumentCaptureDataSource, "");
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = daonDocumentCaptureDataSource;
        this.getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.UNKNOWN;
        this.getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> startCapture(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig config, boolean waitForCameraHalInit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighSpeedVideoFpsRangesFor = documentType;
        this.getHighSpeedVideoFpsRanges = documentSide;
        this.Camera2StreamConfigurationMap.clearResult();
        com.daon.dmds.views.DaonDocumentScanView daonDocumentScanView = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "Checking scan view", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("is_initialized", java.lang.Boolean.valueOf(daonDocumentScanView != null))), null, 4, null);
        if (daonDocumentScanView == null) {
            throw new java.lang.IllegalStateException("Scan view not initialized".toString());
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "✅ Scan view is valid - calling daonDataSource.startScan()", null, null, 6, null);
        return kotlinx.coroutines.flow.FlowKt.onCompletion(this.Camera2StreamConfigurationMap.startScan(documentType, documentSide, daonDocumentScanView, config, waitForCameraHalInit), new com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl$startCapture$2(this, null));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final java.lang.Object getCaptureResult(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success;
        com.daon.dmds.models.DMDSResult getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI != null) {
            com.daon.dmds.models.DMDSDocument document = getHighResolutionOutputSizeshNQ4ISI.getDocument();
            if (document == null) {
                success = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("NO_DOCUMENT", "SDK returned no document", null, 4, null);
            } else {
                android.graphics.Bitmap processedImage = document.getProcessedImage();
                if (processedImage == null) {
                    success = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure("NO_IMAGE", "SDK returned no processed image", null, 4, null);
                } else {
                    com.daon.dmds.models.DMDSDocumentResultQuality qualityData = document.getQualityData();
                    float summary = qualityData != null ? (float) qualityData.getSummary() : 0.0f;
                    com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData getOutputFormats = this.Camera2StreamConfigurationMap.getGetOutputFormats();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.verificationcapture.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.QUALITY_SCORE, java.lang.Float.valueOf(summary));
                    pairArr[1] = kotlin.TuplesKt.to("has_device_data", java.lang.Boolean.valueOf(getOutputFormats != null));
                    com.paypal.android.logger.Logger.d$default(logger, "Processed Daon result", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                    success = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success(processedImage, new com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData(0.0f, 0, 0, 0, null, null, null, null, 0.0f, 0, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureMode.AUTO, summary, null, null, null, false, 0, 127999, null), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null, null, null, getOutputFormats, null, 368, null);
                }
            }
        } else {
            success = null;
        }
        if (success != null) {
            this.Camera2StreamConfigurationMap.clearResult();
        }
        return success;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final java.lang.Object stopCapture(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap.stopScan();
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final java.lang.Object compressImage(android.graphics.Bitmap bitmap, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        java.io.File cacheDir = this.getHighSpeedVideoSizes.getCacheDir();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("captured_doc_");
        sb.append(currentTimeMillis);
        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
        java.io.File file = new java.io.File(cacheDir, sb.toString());
        java.io.ByteArrayOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            java.io.FileOutputStream fileOutputStream2 = fileOutputStream;
            fileOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = fileOutputStream;
                int i2 = 80;
                do {
                    byteArrayOutputStream.reset();
                    bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                    i2 -= 10;
                    if (byteArrayOutputStream.toByteArray().length <= 250880) {
                        break;
                    }
                } while (i2 > 0);
                fileOutputStream2.write(byteArrayOutputStream.toByteArray());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                java.lang.String absolutePath = file.getAbsolutePath();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
                return absolutePath;
            } finally {
            }
        } finally {
        }
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final java.lang.Object validateImageQuality(android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bitmap.getWidth() >= 800 && bitmap.getHeight() >= 600);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final void setScanView(java.lang.Object scanView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = (com.daon.dmds.views.DaonDocumentScanView) scanView;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "✅ currentScanView set", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("is_set", java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI != null))), null, 4, null);
    }

    public final void clearScanView() {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository
    public final java.lang.Object setFlashEnabled(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource.setFlashEnabled$default(this.Camera2StreamConfigurationMap, z, null, 2, null);
        return kotlin.Unit.INSTANCE;
    }
}
