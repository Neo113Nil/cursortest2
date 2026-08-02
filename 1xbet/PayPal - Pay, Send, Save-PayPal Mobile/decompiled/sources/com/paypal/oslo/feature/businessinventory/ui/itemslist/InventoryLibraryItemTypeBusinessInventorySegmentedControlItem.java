package com.paypal.oslo.feature.businessinventory.ui.itemslist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0080\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventorySegmentedControlItemTransformer;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "p0", "", "p1", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;I)V", "product", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "getProduct$business_inventory_prodRelease", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "labelResourceId", com.visa.cbp.getEncExpo.warmup, "getLabelResourceId$business_inventory_prodRelease", "()I", "PRODUCTS", "SERVICES"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class InventoryLibraryItemTypeBusinessInventorySegmentedControlItem implements com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer {
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem PRODUCTS;
    public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem SERVICES;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
    private final int labelResourceId;
    private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType product;

    private InventoryLibraryItemTypeBusinessInventorySegmentedControlItem(java.lang.String str, int i, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType, int i2) {
        this.product = libraryItemType;
        this.labelResourceId = i2;
    }

    /* renamed from: getProduct$business_inventory_prodRelease, reason: from getter */
    public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType getProduct() {
        return this.product;
    }

    /* renamed from: getLabelResourceId$business_inventory_prodRelease, reason: from getter */
    public final int getLabelResourceId() {
        return this.labelResourceId;
    }

    static {
        com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem = new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem("PRODUCTS") { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.PRODUCTS
            {
                com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.PRODUCT;
                int i = com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_products;
                int i2 = 0;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer
            public final com.paypal.pds.components.SegmentedControlItem toSegmentedControlItem(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                return new com.paypal.pds.components.SegmentedControlItem(p0.invoke(java.lang.Integer.valueOf(getLabelResourceId())), null, null, null, null, 30, null);
            }
        };
        PRODUCTS = inventoryLibraryItemTypeBusinessInventorySegmentedControlItem;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem2 = new com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem("SERVICES") { // from class: com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.SERVICES
            {
                com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType = com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.SERVICE;
                int i = com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_services;
                int i2 = 1;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventorySegmentedControlItemTransformer
            public final com.paypal.pds.components.SegmentedControlItem toSegmentedControlItem(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.String> p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                return new com.paypal.pds.components.SegmentedControlItem(p0.invoke(java.lang.Integer.valueOf(getLabelResourceId())), null, null, null, null, 30, null);
            }
        };
        SERVICES = inventoryLibraryItemTypeBusinessInventorySegmentedControlItem2;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[] inventoryLibraryItemTypeBusinessInventorySegmentedControlItemArr = {inventoryLibraryItemTypeBusinessInventorySegmentedControlItem, inventoryLibraryItemTypeBusinessInventorySegmentedControlItem2};
        Camera2StreamConfigurationMap = inventoryLibraryItemTypeBusinessInventorySegmentedControlItemArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(inventoryLibraryItemTypeBusinessInventorySegmentedControlItemArr);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[] values() {
        return (com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem> getEntries() {
        return getHighSpeedVideoSizes;
    }

    public /* synthetic */ InventoryLibraryItemTypeBusinessInventorySegmentedControlItem(java.lang.String str, int i, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, libraryItemType, i2);
    }
}
