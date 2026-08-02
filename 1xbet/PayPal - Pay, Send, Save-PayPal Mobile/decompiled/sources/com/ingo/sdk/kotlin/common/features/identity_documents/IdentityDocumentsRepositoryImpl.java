package com.ingo.sdk.kotlin.common.features.identity_documents;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsRepository;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsApi;", "identityDocumentsApi", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsApi;)V", "", "frontIdentificationDocumentImage", "backIdentificationDocumentImage", "customerSelfieImage", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/model/IdentityDocumentsResponse;", "uploadIdentityDocuments", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsApi;", "getIdentityDocumentsApi", "()Lcom/ingo/sdk/kotlin/common/features/identity_documents/IdentityDocumentsApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IdentityDocumentsRepositoryImpl implements com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsRepository {
    private final com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi identityDocumentsApi;

    public IdentityDocumentsRepositoryImpl(com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi identityDocumentsApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityDocumentsApi, "");
        this.identityDocumentsApi = identityDocumentsApi;
    }

    public final com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi getIdentityDocumentsApi() {
        return this.identityDocumentsApi;
    }

    @Override // com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsRepository
    public final java.lang.Object uploadIdentityDocuments(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.identity_documents.model.IdentityDocumentsResponse>> continuation) {
        return this.identityDocumentsApi.uploadIdentityDocuments(str, str2, str3, continuation);
    }
}
