package com.ingo.sdk.kotlin.common.features.legal_documents;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsRepository;", "Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsApi;", "legalDocumentsApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsApi;)V", "", "documentId", "documentType", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "", "acceptDocument", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "declineDocument", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsApi;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LegalDocumentRepositoryImpl implements com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsRepository {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi getHighSpeedVideoFpsRangesFor;

    public LegalDocumentRepositoryImpl(com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi legalDocumentsApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legalDocumentsApi, "");
        this.getHighSpeedVideoFpsRangesFor = legalDocumentsApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsRepository
    public final java.lang.Object acceptDocument(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends java.lang.Object>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.acceptDocument(str, str2, continuation);
    }

    @Override // com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsRepository
    public final java.lang.Object declineDocument(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, ? extends java.lang.Object>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.declineDocument(str, str2, continuation);
    }
}
