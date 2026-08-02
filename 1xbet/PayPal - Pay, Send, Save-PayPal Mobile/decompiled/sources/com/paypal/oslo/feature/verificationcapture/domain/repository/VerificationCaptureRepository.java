package com.paypal.oslo.feature.verificationcapture.domain.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\tH¦@¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u0014H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H¦@¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H¦@¢\u0006\u0004\b\u001e\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "", "", "metadata", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "uploadDocument", "([BLcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "files", "uploadMultipleFiles", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "Lkotlin/Result;", "", "removeDocument-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDocument", "getSessionInfo-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionInfo", "initializeSession-IoAF18A", "initializeSession", "completeSession-IoAF18A", "completeSession"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VerificationCaptureRepository {
    /* renamed from: completeSession-IoAF18A */
    java.lang.Object mo20600completeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation);

    /* renamed from: getSessionInfo-IoAF18A */
    java.lang.Object mo20601getSessionInfoIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.Map<java.lang.String, java.lang.String>>> continuation);

    /* renamed from: initializeSession-IoAF18A */
    java.lang.Object mo20602initializeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation);

    /* renamed from: removeDocument-gIAlu-s */
    java.lang.Object mo20603removeDocumentgIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation);

    java.lang.Object uploadDocument(byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation);

    java.lang.Object uploadMultipleFiles(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object uploadDocument$default(com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository verificationCaptureRepository, byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map map, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadDocument");
        }
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return verificationCaptureRepository.uploadDocument(bArr, documentType, documentSide, map, continuation);
    }
}
