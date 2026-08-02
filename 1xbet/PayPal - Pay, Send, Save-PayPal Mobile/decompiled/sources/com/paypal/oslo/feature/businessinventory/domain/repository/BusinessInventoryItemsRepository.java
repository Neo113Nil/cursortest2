package com.paypal.oslo.feature.businessinventory.domain.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\rJ(\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0010\u0010\rJ&\u0010\u0011\u001a\u0018\u0012\b\u0012\u00060\tj\u0002`\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getInventoryItems", "()Lkotlinx/coroutines/flow/Flow;", "item", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "addItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "saveItem", "deleteItem", "refreshItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BusinessInventoryItemsRepository {
    java.lang.Object addItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.String>> continuation);

    java.lang.Object deleteItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> getInventoryItems();

    java.lang.Object refreshItems(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation);

    java.lang.Object saveItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation);
}
