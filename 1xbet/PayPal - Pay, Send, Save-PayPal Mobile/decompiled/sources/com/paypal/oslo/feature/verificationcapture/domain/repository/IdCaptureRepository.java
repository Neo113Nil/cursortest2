package com.paypal.oslo.feature.verificationcapture.domain.repository;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J9\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0012\u0010\u0010J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0001H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\bH¦@¢\u0006\u0004\b \u0010!À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "config", "", "waitForCameraHalInit", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "startCapture", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;Z)Lkotlinx/coroutines/flow/Flow;", "", "stopCapture", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "getCaptureResult", "Landroid/graphics/Bitmap;", "bitmap", "", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "compressImage", "(Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateImageQuality", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scanView", "setScanView", "(Ljava/lang/Object;)V", "enabled", "setFlashEnabled", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface IdCaptureRepository {
    java.lang.Object compressImage(android.graphics.Bitmap bitmap, int i, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getCaptureResult(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation);

    java.lang.Object setFlashEnabled(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void setScanView(java.lang.Object scanView);

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> startCapture(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig config, boolean waitForCameraHalInit);

    java.lang.Object stopCapture(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object validateImageQuality(android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ kotlinx.coroutines.flow.Flow startCapture$default(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig, boolean z, int i, java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2;
        boolean z2;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCapture");
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig2 = (i & 4) != 0 ? new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig(0, 0, false, 0, 0.0f, 0, false, null, 0, false, false, 2047, null) : captureConfig;
        if ((i & 8) != 0) {
            z2 = false;
            documentType2 = documentType;
            documentSide2 = documentSide;
        } else {
            documentType2 = documentType;
            documentSide2 = documentSide;
            z2 = z;
        }
        return idCaptureRepository.startCapture(documentType2, documentSide2, captureConfig2, z2);
    }

    static /* synthetic */ java.lang.Object compressImage$default(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository, android.graphics.Bitmap bitmap, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: compressImage");
        }
        if ((i2 & 2) != 0) {
            i = 85;
        }
        return idCaptureRepository.compressImage(bitmap, i, continuation);
    }
}
