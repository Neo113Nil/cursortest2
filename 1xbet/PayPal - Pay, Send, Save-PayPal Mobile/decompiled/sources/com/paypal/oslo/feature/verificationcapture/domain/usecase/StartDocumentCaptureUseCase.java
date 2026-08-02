package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/StartDocumentCaptureUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "idCaptureRepository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;)V", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;", "config", "", "waitForCameraHalInit", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "invoke", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureConfig;Z)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StartDocumentCaptureUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public StartDocumentCaptureUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idCaptureRepository, "");
        this.getHighSpeedVideoFpsRanges = idCaptureRepository;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartDocumentCaptureUseCase startDocumentCaptureUseCase, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig captureConfig, boolean z, int i, java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2;
        boolean z2;
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
        return startDocumentCaptureUseCase.invoke(documentType2, documentSide2, captureConfig2, z2);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> invoke(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureConfig config, boolean waitForCameraHalInit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return this.getHighSpeedVideoFpsRanges.startCapture(documentType, documentSide, config, waitForCameraHalInit);
    }
}
