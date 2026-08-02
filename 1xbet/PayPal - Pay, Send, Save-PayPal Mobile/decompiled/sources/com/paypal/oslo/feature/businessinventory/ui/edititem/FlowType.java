package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", "", "Create", "Edit", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Create;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Edit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FlowType {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Create;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "itemType", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Create;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "getItemType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Create implements com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType itemType;

        public Create(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItemType, "");
            this.itemType = libraryItemType;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType getItemType() {
            return this.itemType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType = this.itemType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Create(itemType=");
            sb.append(libraryItemType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.itemType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) && this.itemType == ((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create) other).itemType;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create copy(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType itemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(itemType, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create(itemType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType getItemType() {
            return this.itemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Create create, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                libraryItemType = create.itemType;
            }
            return create.copy(libraryItemType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Edit;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "libraryItem", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FlowType$Edit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getLibraryItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Edit implements com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem;

        public Edit(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            this.libraryItem = libraryItem;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getLibraryItem() {
            return this.libraryItem;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = this.libraryItem;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Edit(libraryItem=");
            sb.append(libraryItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.libraryItem.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) && kotlin.jvm.internal.Intrinsics.areEqual(this.libraryItem, ((com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit) other).libraryItem);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit copy(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit(libraryItem);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getLibraryItem() {
            return this.libraryItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType.Edit edit, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                libraryItem = edit.libraryItem;
            }
            return edit.copy(libraryItem);
        }
    }
}
