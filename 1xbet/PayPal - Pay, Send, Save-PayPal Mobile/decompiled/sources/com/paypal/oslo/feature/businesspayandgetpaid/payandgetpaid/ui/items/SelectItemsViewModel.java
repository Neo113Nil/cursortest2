package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "refreshBusinessInventoryItemsUseCase", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "lineItem", "", "increaseItemQuantity", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;)V", "decreaseItemQuantity", "", "items", "setCurrentItems", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "item", "addCreatedItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)V", "p0", "", "p1", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;Z)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/api/domain/usecase/RefreshBusinessInventoryItemsUseCase;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsUiState;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectItemsViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> uiState;

    @javax.inject.Inject
    public SelectItemsViewModel(com.paypal.oslo.feature.businessinventory.api.domain.usecase.RefreshBusinessInventoryItemsUseCase refreshBusinessInventoryItemsUseCase, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshBusinessInventoryItemsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.Camera2StreamConfigurationMap = refreshBusinessInventoryItemsUseCase;
        this.getHighSpeedVideoFpsRangesFor = userStore;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState(false, null, null, null, 15, null));
        this.getHighSpeedVideoSizes = MutableStateFlow;
        this.uiState = MutableStateFlow;
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$loadItems$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> getUiState() {
        return this.uiState;
    }

    public final void increaseItemQuantity(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        Camera2StreamConfigurationMap(lineItem, true);
    }

    public final void decreaseItemQuantity(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        Camera2StreamConfigurationMap(lineItem, false);
    }

    public final void setCurrentItems(java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            selectItemsUiState = value;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> list = items;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (java.lang.Object obj : list) {
                linkedHashMap.put(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj).getCatalogItemId(), obj);
            }
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items2 = selectItemsUiState.getItems();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items2, 10));
            for (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem : items2) {
                com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem2 = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) linkedHashMap.get(lineItem.getCatalogItemId());
                if (lineItem2 != null) {
                    lineItem = lineItem2;
                }
                arrayList.add(lineItem);
            }
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default(selectItemsUiState, false, arrayList, null, null, 13, null)));
    }

    public final void addCreatedItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem item) {
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem copy;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItemKt.toLineItem(item);
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ONE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        copy = lineItem.copy((r18 & 1) != 0 ? lineItem.catalogItemId : null, (r18 & 2) != 0 ? lineItem.name : null, (r18 & 4) != 0 ? lineItem.unitPrice : null, (r18 & 8) != 0 ? lineItem.quantity : bigDecimal, (r18 & 16) != 0 ? lineItem.type : null, (r18 & 32) != 0 ? lineItem.description : null, (r18 & 64) != 0 ? lineItem.discount : null, (r18 & 128) != 0 ? lineItem.tax : null);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            selectItemsUiState = value;
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default(selectItemsUiState, false, kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf(copy), (java.lang.Iterable) selectItemsUiState.getItems()), new java.util.Comparator() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel$addCreatedItem$lambda$0$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) t).getName(), ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) t2).getName());
            }
        }), null, null, 13, null)));
    }

    private final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem p0, boolean p1) {
        java.math.BigDecimal product_quantity_step;
        java.math.BigDecimal subtract;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem copy;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState value;
        com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState;
        java.util.ArrayList arrayList;
        if (p0.getType() == com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.ItemType.SERVICE) {
            product_quantity_step = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.INSTANCE.getSERVICE_QUANTITY_STEP();
        } else {
            product_quantity_step = com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem.INSTANCE.getPRODUCT_QUANTITY_STEP();
        }
        if (p1) {
            subtract = p0.getQuantity().add(product_quantity_step);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "");
        } else {
            subtract = p0.getQuantity().subtract(product_quantity_step);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(subtract, "");
        }
        java.math.BigDecimal bigDecimal = (java.math.BigDecimal) kotlin.ranges.RangesKt.coerceIn(subtract, (kotlin.ranges.ClosedRange<java.math.BigDecimal>) kotlin.ranges.RangesKt.rangeTo(java.math.BigDecimal.ZERO, new java.math.BigDecimal(1000000)));
        kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
        copy = p0.copy((r18 & 1) != 0 ? p0.catalogItemId : null, (r18 & 2) != 0 ? p0.name : null, (r18 & 4) != 0 ? p0.unitPrice : null, (r18 & 8) != 0 ? p0.quantity : bigDecimal, (r18 & 16) != 0 ? p0.type : null, (r18 & 32) != 0 ? p0.description : null, (r18 & 64) != 0 ? p0.discount : null, (r18 & 128) != 0 ? p0.tax : null);
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState> mutableStateFlow = this.getHighSpeedVideoSizes;
        do {
            value = mutableStateFlow.getValue();
            selectItemsUiState = value;
            java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem> items = selectItemsUiState.getItems();
            arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
            for (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem : items) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(lineItem.getCatalogItemId(), copy.getCatalogItemId())) {
                    lineItem = copy;
                }
                arrayList.add(lineItem);
            }
        } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState.copy$default(selectItemsUiState, false, arrayList, null, null, 13, null)));
    }
}
