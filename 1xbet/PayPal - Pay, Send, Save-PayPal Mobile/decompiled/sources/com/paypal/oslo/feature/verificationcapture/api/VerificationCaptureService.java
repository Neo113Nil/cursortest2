package com.paypal.oslo.feature.verificationcapture.api;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H¦@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u000e\u001a\u00020\bH¦@¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bH¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\u0016\u0010\rJ\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0006H¦@¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u001a\u0010\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/VerificationCaptureService;", "", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/api/models/DocumentMetadata;", "metadata", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "", "uploadDocument", "([BLcom/paypal/oslo/feature/verificationcapture/api/models/DocumentMetadata;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/verificationcapture/api/models/CaptureSessionInfo;", "getSessionInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationResult;", "getVerificationStatus", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reason", "", "removeDocument", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSession", "completeSession", "imagePath", "", "cleanupTempFile", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VerificationCaptureService {
    boolean cleanupTempFile(java.lang.String imagePath);

    java.lang.Object completeSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, kotlin.Unit>> continuation);

    java.lang.Object getSessionInfo(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, com.paypal.oslo.feature.verificationcapture.api.models.CaptureSessionInfo>> continuation);

    java.lang.Object getVerificationStatus(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, com.paypal.oslo.feature.verificationcapture.api.models.VerificationResult>> continuation);

    java.lang.Object initializeSession(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, java.lang.String>> continuation);

    java.lang.Object removeDocument(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, kotlin.Unit>> continuation);

    java.lang.Object uploadDocument(byte[] bArr, com.paypal.oslo.feature.verificationcapture.api.models.DocumentMetadata documentMetadata, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError, java.lang.String>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object removeDocument$default(com.paypal.oslo.feature.verificationcapture.api.VerificationCaptureService verificationCaptureService, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeDocument");
        }
        if ((i & 2) != 0) {
            str2 = "User requested removal";
        }
        return verificationCaptureService.removeDocument(str, str2, continuation);
    }
}
