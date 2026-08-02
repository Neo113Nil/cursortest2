package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/DocumentValidationRepositoryImpl;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/DocumentValidationRepository;", "<init>", "()V", "Ljava/io/File;", "file", "Lkotlin/Result;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentQualityIssue;", "validateDocumentQuality-gIAlu-s", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateDocumentQuality", "", "isFileSizeValid", "(Ljava/io/File;)Z", "isFileFormatSupported", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentValidationRepositoryImpl implements com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository {
    public static final int $stable = 0;
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"jpg", "jpeg", "png", "pdf"});

    @javax.inject.Inject
    public DocumentValidationRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository
    /* renamed from: validateDocumentQuality-gIAlu-s, reason: not valid java name */
    public final java.lang.Object mo20597validateDocumentQualitygIAlus(java.io.File file, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentQualityIssue>>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository
    public final boolean isFileSizeValid(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (!file.exists()) {
            return false;
        }
        long length = file.length();
        return okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE <= length && length < 10485761;
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.DocumentValidationRepository
    public final boolean isFileFormatSupported(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String lowerCase = kotlin.io.FilesKt.getExtension(file).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return getHighSpeedVideoFpsRanges.contains(lowerCase);
    }
}
