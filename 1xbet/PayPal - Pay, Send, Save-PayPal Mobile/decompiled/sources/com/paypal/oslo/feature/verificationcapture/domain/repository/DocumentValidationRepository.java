package com.paypal.oslo.feature.verificationcapture.domain.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;", "", "Ljava/io/File;", "file", "Lkotlin/Result;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "validateDocumentQuality-gIAlu-s", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateDocumentQuality", "", "isFileSizeValid", "(Ljava/io/File;)Z", "isFileFormatSupported"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DocumentValidationRepository {
    boolean isFileFormatSupported(java.io.File file);

    boolean isFileSizeValid(java.io.File file);

    /* renamed from: validateDocumentQuality-gIAlu-s */
    java.lang.Object mo20597validateDocumentQualitygIAlus(java.io.File file, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue>>> continuation);
}
