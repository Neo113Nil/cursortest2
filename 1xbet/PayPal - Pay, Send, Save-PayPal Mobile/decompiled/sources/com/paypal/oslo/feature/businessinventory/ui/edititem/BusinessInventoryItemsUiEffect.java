package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect;", "", "NavigateBack", "NavigateBackWithResult", "ShowConfirmationModal", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$ShowConfirmationModal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BusinessInventoryItemsUiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack();

        public final int hashCode() {
            return 982599715;
        }

        private NavigateBack() {
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "libraryItem", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$NavigateBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "getLibraryItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithResult implements com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem;

        public NavigateBackWithResult(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            this.libraryItem = libraryItem;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getLibraryItem() {
            return this.libraryItem;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem = this.libraryItem;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithResult(libraryItem=");
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
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.libraryItem, ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult) other).libraryItem);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult copy(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(libraryItem, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult(libraryItem);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem getLibraryItem() {
            return this.libraryItem;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.NavigateBackWithResult navigateBackWithResult, com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                libraryItem = navigateBackWithResult.libraryItem;
            }
            return navigateBackWithResult.copy(libraryItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$ShowConfirmationModal;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;", "modalType", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsUiEffect$ShowConfirmationModal;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/ConfirmationModalType;", "getModalType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationModal implements com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType modalType;

        public ShowConfirmationModal(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationModalType, "");
            this.modalType = confirmationModalType;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType getModalType() {
            return this.modalType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType = this.modalType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowConfirmationModal(modalType=");
            sb.append(confirmationModalType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.modalType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal) && this.modalType == ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal) other).modalType;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal copy(com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType modalType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modalType, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal(modalType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType getModalType() {
            return this.modalType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsUiEffect.ShowConfirmationModal showConfirmationModal, com.paypal.oslo.feature.businessinventory.ui.edititem.ConfirmationModalType confirmationModalType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                confirmationModalType = showConfirmationModal.modalType;
            }
            return showConfirmationModal.copy(confirmationModalType);
        }
    }
}
