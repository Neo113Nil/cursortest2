package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/RemoveDocumentUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;)V", "", "documentId", "Lkotlin/Result;", "", "invoke-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RemoveDocumentUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RemoveDocumentUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationCaptureRepository, "");
        this.getHighSpeedVideoSizes = verificationCaptureRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m20618invokegIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase$invoke$1 removeDocumentUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase$invoke$1) {
            removeDocumentUseCase$invoke$1 = (com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase$invoke$1) continuation;
            if ((removeDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                removeDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = removeDocumentUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = removeDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository = this.getHighSpeedVideoSizes;
                removeDocumentUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                removeDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                java.lang.Object mo20603removeDocumentgIAlus = verificationCaptureRepository.mo20603removeDocumentgIAlus(str, removeDocumentUseCase$invoke$1);
                return mo20603removeDocumentgIAlus == coroutine_suspended ? coroutine_suspended : mo20603removeDocumentgIAlus;
            }
        }
        removeDocumentUseCase$invoke$1 = new com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = removeDocumentUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = removeDocumentUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
        }
    }
}
