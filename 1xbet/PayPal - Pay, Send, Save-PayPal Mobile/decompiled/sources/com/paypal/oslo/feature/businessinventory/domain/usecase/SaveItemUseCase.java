package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveItemUseCase;", "", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "businessInventoryItemsRepository", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "businessInventoryUpdatesEventBus", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;)V", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "item", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "invoke", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SaveItemUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SaveItemUseCase(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryItemsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryUpdatesEventBus, "");
        this.getHighSpeedVideoSizes = businessInventoryItemsRepository;
        this.getHighSpeedVideoFpsRangesFor = businessInventoryUpdatesEventBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase$invoke$1 saveItemUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase$invoke$1) {
            saveItemUseCase$invoke$1 = (com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase$invoke$1) continuation;
            if ((saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = saveItemUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository businessInventoryItemsRepository = this.getHighSpeedVideoSizes;
                    saveItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = libraryItem;
                    saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                    obj = businessInventoryItemsRepository.saveItem(libraryItem, saveItemUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = saveItemUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = saveItemUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i4 = saveItemUseCase$invoke$1.getHighSpeedVideoSizes;
                        arrow.core.Either either2 = (arrow.core.Either) saveItemUseCase$invoke$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either2;
                    }
                    libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) saveItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus = this.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated inventoryItemUpdated = new com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated(libraryItem);
                    saveItemUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    saveItemUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    saveItemUseCase$invoke$1.getOutputFormats = either;
                    saveItemUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    saveItemUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    saveItemUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    saveItemUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    saveItemUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                    if (businessInventoryUpdatesEventBus.publish(inventoryItemUpdated, saveItemUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return either;
            }
        }
        saveItemUseCase$invoke$1 = new com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = saveItemUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveItemUseCase$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
