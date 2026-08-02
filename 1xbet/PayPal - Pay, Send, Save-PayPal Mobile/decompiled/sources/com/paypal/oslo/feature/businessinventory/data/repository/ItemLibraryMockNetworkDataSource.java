package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/repository/ItemLibraryMockNetworkDataSource;", "", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getInventoryItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "", "updateItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ItemLibraryMockNetworkDataSource {
    java.lang.Object deleteItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.Boolean>> continuation);

    java.lang.Object getInventoryItems(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation);

    java.lang.Object updateItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.Boolean>> continuation);
}
