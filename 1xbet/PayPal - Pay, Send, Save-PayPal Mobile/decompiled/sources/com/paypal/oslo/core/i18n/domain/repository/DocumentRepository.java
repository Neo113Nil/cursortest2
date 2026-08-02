package com.paypal.oslo.core.i18n.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/repository/DocumentRepository;", "", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/error/DocumentMetadataError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentMetadata;", "getDocumentMetadata", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface DocumentRepository {
    java.lang.Object getDocumentMetadata(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.error.DocumentMetadataError, com.paypal.oslo.core.i18n.domain.model.DocumentMetadata>> continuation);
}
