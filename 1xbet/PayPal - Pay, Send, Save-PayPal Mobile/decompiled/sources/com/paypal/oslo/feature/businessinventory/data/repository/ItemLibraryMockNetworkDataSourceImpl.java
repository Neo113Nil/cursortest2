package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u0018\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ(\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/repository/ItemLibraryMockNetworkDataSourceImpl;", "Lcom/paypal/oslo/feature/businessinventory/data/repository/ItemLibraryMockNetworkDataSource;", "<init>", "()V", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getInventoryItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "", "updateItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteItem", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemLibraryMockNetworkDataSourceImpl implements com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource {
    public static final int $stable;
    public static final com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl INSTANCE = new com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> getHighSpeedVideoFpsRangesFor;

    private ItemLibraryMockNetworkDataSourceImpl() {
    }

    static {
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (int i = 0; i < 10; i++) {
            createListBuilder.add(com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceKt.access$newLibraryItem(i));
        }
        getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) kotlin.collections.CollectionsKt.build(createListBuilder));
        $stable = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInventoryItems(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1 itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1) {
            itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1 = (com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1) continuation;
            if ((itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.Camera2StreamConfigurationMap = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1L, itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(kotlin.collections.CollectionsKt.toList(getHighSpeedVideoFpsRangesFor));
            }
        }
        itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1 = new com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$getInventoryItems$1(this, continuation);
        java.lang.Object obj2 = itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = itemLibraryMockNetworkDataSourceImpl$getInventoryItems$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(kotlin.collections.CollectionsKt.toList(getHighSpeedVideoFpsRangesFor));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$updateItem$1 itemLibraryMockNetworkDataSourceImpl$updateItem$1;
        int i;
        java.util.Iterator<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> it;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$updateItem$1) {
            itemLibraryMockNetworkDataSourceImpl$updateItem$1 = (com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$updateItem$1) continuation;
            if ((itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoSizes = libraryItem;
                    itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1L, itemLibraryMockNetworkDataSourceImpl$updateItem$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                it = getHighSpeedVideoFpsRangesFor.iterator();
                i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getId(), libraryItem.getId())) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0) {
                    getHighSpeedVideoFpsRangesFor.set(i2, libraryItem);
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                }
                getHighSpeedVideoFpsRangesFor.add(libraryItem);
                return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
        }
        itemLibraryMockNetworkDataSourceImpl$updateItem$1 = new com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$updateItem$1(this, continuation);
        java.lang.Object obj2 = itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = itemLibraryMockNetworkDataSourceImpl$updateItem$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        it = getHighSpeedVideoFpsRangesFor.iterator();
        i2 = 0;
        while (true) {
            if (!it.hasNext()) {
            }
            i2++;
        }
        if (i2 < 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$deleteItem$1 itemLibraryMockNetworkDataSourceImpl$deleteItem$1;
        int i;
        java.util.Iterator<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> it;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$deleteItem$1) {
            itemLibraryMockNetworkDataSourceImpl$deleteItem$1 = (com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$deleteItem$1) continuation;
            if ((itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = itemLibraryMockNetworkDataSourceImpl$deleteItem$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI = libraryItem;
                    itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighSpeedVideoFpsRanges = 1;
                    if (kotlinx.coroutines.DelayKt.delay(1L, itemLibraryMockNetworkDataSourceImpl$deleteItem$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    libraryItem = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                it = getHighSpeedVideoFpsRangesFor.iterator();
                i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(it.next().getId(), libraryItem.getId())) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0) {
                    getHighSpeedVideoFpsRangesFor.remove(i2);
                    return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
                }
                return arrow.core.EitherKt.right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            }
        }
        itemLibraryMockNetworkDataSourceImpl$deleteItem$1 = new com.paypal.oslo.feature.businessinventory.data.repository.ItemLibraryMockNetworkDataSourceImpl$deleteItem$1(this, continuation);
        java.lang.Object obj2 = itemLibraryMockNetworkDataSourceImpl$deleteItem$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = itemLibraryMockNetworkDataSourceImpl$deleteItem$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        it = getHighSpeedVideoFpsRangesFor.iterator();
        i2 = 0;
        while (true) {
            if (!it.hasNext()) {
            }
            i2++;
        }
        if (i2 < 0) {
        }
    }
}
