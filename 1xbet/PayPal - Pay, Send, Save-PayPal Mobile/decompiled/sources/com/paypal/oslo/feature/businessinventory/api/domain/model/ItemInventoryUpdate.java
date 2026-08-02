package com.paypal.oslo.feature.businessinventory.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/InventoryUpdate;", "InventoryItemUpdated", "InventoryItemDeleted", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemDeleted;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemUpdated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ItemInventoryUpdate extends com.paypal.oslo.feature.businessinventory.api.domain.model.InventoryUpdate {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemUpdated;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InventoryItemUpdated implements com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate {
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem item;

        public InventoryItemUpdated(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            this.item = libraryItem;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InventoryItemUpdated(item=");
            sb.append(libraryItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated) other).item);
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated copy(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated copy$default(com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemUpdated inventoryItemUpdated, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                libraryItem = inventoryItemUpdated.item;
            }
            return inventoryItemUpdated.copy(libraryItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemDeleted;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)Lcom/paypal/oslo/feature/businessinventory/api/domain/model/ItemInventoryUpdate$InventoryItemDeleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InventoryItemDeleted implements com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate {
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem item;

        public InventoryItemDeleted(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            this.item = libraryItem;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InventoryItemDeleted(item=");
            sb.append(libraryItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted) other).item);
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted copy(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted copy$default(com.paypal.oslo.feature.businessinventory.api.domain.model.ItemInventoryUpdate.InventoryItemDeleted inventoryItemDeleted, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                libraryItem = inventoryItemDeleted.item;
            }
            return inventoryItemDeleted.copy(libraryItem);
        }
    }
}
