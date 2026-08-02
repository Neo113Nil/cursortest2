package com.paypal.oslo.feature.businessinventory.ui.itemslist;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "", "<init>", "()V", "ControlItemClicked", "AddItemClicked", "AddServiceClicked", "EditItemClicked", "EditServiceClicked", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "DismissToast", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$AddItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$AddServiceClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$ControlItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$DismissError;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$DismissToast;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditServiceClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BusinessInventoryItemsListEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$ControlItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;", "inventoryLibraryItemTypeSegmentedControlItem", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;)Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$ControlItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/InventoryLibraryItemTypeBusinessInventorySegmentedControlItem;", "getInventoryLibraryItemTypeSegmentedControlItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ControlItemClicked extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeSegmentedControlItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ControlItemClicked(com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inventoryLibraryItemTypeBusinessInventorySegmentedControlItem, "");
            this.inventoryLibraryItemTypeSegmentedControlItem = inventoryLibraryItemTypeBusinessInventorySegmentedControlItem;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem getInventoryLibraryItemTypeSegmentedControlItem() {
            return this.inventoryLibraryItemTypeSegmentedControlItem;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem = this.inventoryLibraryItemTypeSegmentedControlItem;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ControlItemClicked(inventoryLibraryItemTypeSegmentedControlItem=");
            sb.append(inventoryLibraryItemTypeBusinessInventorySegmentedControlItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.inventoryLibraryItemTypeSegmentedControlItem.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked) && this.inventoryLibraryItemTypeSegmentedControlItem == ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked) other).inventoryLibraryItemTypeSegmentedControlItem;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked copy(com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeSegmentedControlItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inventoryLibraryItemTypeSegmentedControlItem, "");
            return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked(inventoryLibraryItemTypeSegmentedControlItem);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem getInventoryLibraryItemTypeSegmentedControlItem() {
            return this.inventoryLibraryItemTypeSegmentedControlItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked copy$default(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.ControlItemClicked controlItemClicked, com.paypal.oslo.feature.businessinventory.ui.itemslist.InventoryLibraryItemTypeBusinessInventorySegmentedControlItem inventoryLibraryItemTypeBusinessInventorySegmentedControlItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                inventoryLibraryItemTypeBusinessInventorySegmentedControlItem = controlItemClicked.inventoryLibraryItemTypeSegmentedControlItem;
            }
            return controlItemClicked.copy(inventoryLibraryItemTypeBusinessInventorySegmentedControlItem);
        }
    }

    private BusinessInventoryItemsListEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$AddItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddItemClicked extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddItemClicked INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddItemClicked();

        public final int hashCode() {
            return -527340656;
        }

        private AddItemClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddItemClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddItemClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$AddServiceClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddServiceClicked extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddServiceClicked INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddServiceClicked();

        public final int hashCode() {
            return -2048819146;
        }

        private AddServiceClicked() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AddServiceClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.AddServiceClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditItemClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "", "itemId", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getItemId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditItemClicked extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        private final long itemId;

        public EditItemClicked(long j) {
            super(null);
            this.itemId = j;
        }

        public final long getItemId() {
            return this.itemId;
        }

        public final java.lang.String toString() {
            long j = this.itemId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EditItemClicked(itemId=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.itemId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked) && this.itemId == ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked) other).itemId;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked copy(long itemId) {
            return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked(itemId);
        }

        /* renamed from: component1, reason: from getter */
        public final long getItemId() {
            return this.itemId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked copy$default(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditItemClicked editItemClicked, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = editItemClicked.itemId;
            }
            return editItemClicked.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditServiceClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "", "serviceId", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$EditServiceClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getServiceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditServiceClicked extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        private final long serviceId;

        public EditServiceClicked(long j) {
            super(null);
            this.serviceId = j;
        }

        public final long getServiceId() {
            return this.serviceId;
        }

        public final java.lang.String toString() {
            long j = this.serviceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EditServiceClicked(serviceId=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.serviceId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked) && this.serviceId == ((com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked) other).serviceId;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked copy(long serviceId) {
            return new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked(serviceId);
        }

        /* renamed from: component1, reason: from getter */
        public final long getServiceId() {
            return this.serviceId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked copy$default(com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.EditServiceClicked editServiceClicked, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = editServiceClicked.serviceId;
            }
            return editServiceClicked.copy(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$DismissError;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissError INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissError();

        public final int hashCode() {
            return -330399173;
        }

        private DismissError() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent$DismissToast;", "Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/BusinessInventoryItemsListEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissToast extends com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissToast INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissToast();

        public final int hashCode() {
            return -316651942;
        }

        private DismissToast() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DismissToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.itemslist.BusinessInventoryItemsListEvent.DismissToast)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BusinessInventoryItemsListEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
