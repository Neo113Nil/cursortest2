package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/ValidateDocumentQualityUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;", "validationRepository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;)V", "Ljava/io/File;", "file", "Lkotlin/Result;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "invoke-gIAlu-s", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ValidateDocumentQualityUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ValidateDocumentQualityUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository documentValidationRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentValidationRepository, "");
        this.Camera2StreamConfigurationMap = documentValidationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m20621invokegIAlus(java.io.File file, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue>>> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase$invoke$1 validateDocumentQualityUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooLarge tooLarge;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase$invoke$1) {
            validateDocumentQualityUseCase$invoke$1 = (com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase$invoke$1) continuation;
            if ((validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.Camera2StreamConfigurationMap.isFileFormatSupported(file)) {
                    tooLarge = !this.Camera2StreamConfigurationMap.isFileSizeValid(file) ? com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.TooLarge.INSTANCE : null;
                } else {
                    tooLarge = com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue.UnsupportedFormat.INSTANCE;
                }
                if (tooLarge != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    return kotlin.Result.m23436constructorimpl(kotlin.collections.CollectionsKt.listOf(tooLarge));
                }
                com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository documentValidationRepository = this.Camera2StreamConfigurationMap;
                validateDocumentQualityUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(file);
                validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tooLarge);
                validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                java.lang.Object mo20597validateDocumentQualitygIAlus = documentValidationRepository.mo20597validateDocumentQualitygIAlus(file, validateDocumentQualityUseCase$invoke$1);
                return mo20597validateDocumentQualitygIAlus == coroutine_suspended ? coroutine_suspended : mo20597validateDocumentQualitygIAlus;
            }
        }
        validateDocumentQualityUseCase$invoke$1 = new com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = validateDocumentQualityUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
        }
    }
}
