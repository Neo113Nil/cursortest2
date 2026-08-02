package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0086B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/UploadDocumentUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;)V", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "", "", "metadata", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "invoke", "([BLcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UploadDocumentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UploadDocumentUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureRepository, "");
        this.getHighSpeedVideoFpsRangesFor = verificationCaptureRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1 uploadDocumentUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult captureResult;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1) {
            uploadDocumentUseCase$invoke$1 = (com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1) continuation;
            if ((uploadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                uploadDocumentUseCase$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1 uploadDocumentUseCase$invoke$12 = uploadDocumentUseCase$invoke$1;
                java.lang.Object obj = uploadDocumentUseCase$invoke$12.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uploadDocumentUseCase$invoke$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (bArr.length == 0) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("UPLOAD_FAILED", "Image bytes are empty", false, null, 8, null));
                    }
                    com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoFpsRangesFor;
                    uploadDocumentUseCase$invoke$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bArr);
                    uploadDocumentUseCase$invoke$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentType);
                    uploadDocumentUseCase$invoke$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(documentSide);
                    uploadDocumentUseCase$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(map);
                    uploadDocumentUseCase$invoke$12.Camera2StreamConfigurationMap = 1;
                    obj = verificationCaptureRepository.uploadDocument(bArr, documentType, documentSide, map, uploadDocumentUseCase$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj;
                if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success)) {
                    java.lang.String obj2 = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                    return arrow.core.EitherKt.right(obj2);
                }
                if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) {
                    return arrow.core.EitherKt.right(((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) captureResult).getDocumentId());
                }
                if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) {
                    com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) captureResult;
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError(failure.getErrorCode(), failure.getErrorMessage(), false, failure.getThrowable(), 4, null));
                }
                if (captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("UPLOAD_FAILED", "Upload cancelled", false, null, 12, null));
                }
                if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                long durationMs = ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) captureResult).getDurationMs();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Upload timed out after ");
                sb.append(durationMs);
                sb.append("ms");
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError("TIMEOUT", sb.toString(), false, null, 12, null));
            }
        }
        uploadDocumentUseCase$invoke$1 = new com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1(this, continuation);
        com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase$invoke$1 uploadDocumentUseCase$invoke$122 = uploadDocumentUseCase$invoke$1;
        java.lang.Object obj3 = uploadDocumentUseCase$invoke$122.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uploadDocumentUseCase$invoke$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        captureResult = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult) obj3;
        if (!(captureResult instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success)) {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadDocumentUseCase uploadDocumentUseCase, byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map map, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            documentType = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType.DRIVERS_LICENSE;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType2 = documentType;
        if ((i & 4) != 0) {
            documentSide = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide.FRONT;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide2 = documentSide;
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return uploadDocumentUseCase.invoke(bArr, documentType2, documentSide2, map, continuation);
    }
}
