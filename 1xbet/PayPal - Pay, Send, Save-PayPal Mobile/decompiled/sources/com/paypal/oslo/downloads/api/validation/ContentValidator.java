package com.paypal.oslo.downloads.api.validation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/api/validation/ContentValidator;", "", "Ljava/io/File;", "file", "", "expectedMimeType", "expectedChecksum", "Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;", "checksumAlgorithm", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationResult;", "validate", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/downloads/api/model/ChecksumAlgorithm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ContentValidator {
    java.lang.Object validate(java.io.File file, java.lang.String str, java.lang.String str2, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.validation.ContentValidationResult> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object validate$default(com.paypal.oslo.downloads.api.validation.ContentValidator contentValidator, java.io.File file, java.lang.String str, java.lang.String str2, com.paypal.oslo.downloads.api.model.ChecksumAlgorithm checksumAlgorithm, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return contentValidator.validate(file, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : checksumAlgorithm, continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: validate");
    }
}
