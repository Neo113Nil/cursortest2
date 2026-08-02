package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadMultipleFilesUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;)V", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "files", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "", "", "metadata", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "invoke", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UploadMultipleFilesUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UploadMultipleFilesUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = verificationCaptureRepository;
    }

    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.uploadMultipleFiles(list, documentType, map, continuation);
    }
}
