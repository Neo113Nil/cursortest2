package com.ingo.sdk.kotlin.common.features.legal_documents;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/legal_documents/LegalDocumentsViewModel;", "", "Lcom/ingo/sdk/kotlin/common/core/http/response/LegalDocument;", "legalDocument", "", "accept", "(Lcom/ingo/sdk/kotlin/common/core/http/response/LegalDocument;)V", "decline"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface LegalDocumentsViewModel {
    void accept(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument);

    void decline(com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument);
}
