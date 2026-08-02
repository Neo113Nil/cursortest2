package com.paypal.oslo.feature.businessinventory.api.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H¦B¢\u0006\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface RefreshBusinessInventoryItemsUseCase {
    java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation);
}
