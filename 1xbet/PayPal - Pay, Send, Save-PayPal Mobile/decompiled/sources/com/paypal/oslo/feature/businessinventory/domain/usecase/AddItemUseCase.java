package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddItemUseCase;", "", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "businessInventoryItemsRepository", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "businessInventoryUpdatesEventBus", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;)V", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "item", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "invoke", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddItemUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AddItemUseCase(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryUpdatesEventBus, "");
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryItemsRepository;
        this.Camera2StreamConfigurationMap = businessInventoryUpdatesEventBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0064, code lost:
    
        if (r15 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase$invoke$1 addItemUseCase$invoke$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase$invoke$1) {
            addItemUseCase$invoke$1 = (com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase$invoke$1) continuation;
            if ((addItemUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                addItemUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = addItemUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addItemUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    addItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = libraryItem;
                    addItemUseCase$invoke$1.getOutputFormats = 1;
                    obj = businessInventoryItemsRepository.addItem(libraryItem, addItemUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = addItemUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i3 = addItemUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = addItemUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        arrow.core.Either either = (arrow.core.Either) addItemUseCase$invoke$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either;
                    }
                    libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) addItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    right = new arrow.core.Either.Right(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem.copy$default(libraryItem, (java.lang.String) ((arrow.core.Either.Right) right).getValue(), null, null, null, null, null, 62, null));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (right.isRight()) {
                    com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem2 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) ((arrow.core.Either.Right) right).getValue();
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated inventoryItemUpdated = new com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated(libraryItem2);
                    addItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    addItemUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    addItemUseCase$invoke$1.getInputSizeshNQ4ISI = right;
                    addItemUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    addItemUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem2);
                    addItemUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    addItemUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    addItemUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    addItemUseCase$invoke$1.getOutputFormats = 2;
                    if (businessInventoryUpdatesEventBus.publish(inventoryItemUpdated, addItemUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return right;
            }
        }
        addItemUseCase$invoke$1 = new com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = addItemUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addItemUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (right.isRight()) {
        }
        return right;
    }
}
