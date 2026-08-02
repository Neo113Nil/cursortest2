package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "", "<init>", "()V", "DismissErrors", "DeleteItem", "SaveItem", "RequestBackNavigation", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$DeleteItem;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$DismissErrors;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$RequestBackNavigation;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$SaveItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BusinessInventoryItemsEditEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$DismissErrors;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$DismissErrors;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissErrors extends com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent {
        public static final int $stable = 8;
        private final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DismissErrors(java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> set) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            this.errors = set;
        }

        public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> set = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DismissErrors(errors=");
            sb.append(set);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors) other).errors);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors copy(java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors(errors);
        }

        public final java.util.Set<com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DismissErrors dismissErrors, java.util.Set set, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                set = dismissErrors.errors;
            }
            return dismissErrors.copy(set);
        }
    }

    private BusinessInventoryItemsEditEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$DeleteItem;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteItem extends com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DeleteItem INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DeleteItem();

        public final int hashCode() {
            return 622385466;
        }

        private DeleteItem() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DeleteItem";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.DeleteItem)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$SaveItem;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "formData", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$SaveItem;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "getFormData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveItem extends com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveItem(com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            this.formData = formData;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData getFormData() {
            return this.formData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData = this.formData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveItem(formData=");
            sb.append(formData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem) && kotlin.jvm.internal.Intrinsics.areEqual(this.formData, ((com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem) other).formData);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem copy(com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem(formData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData getFormData() {
            return this.formData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent.SaveItem saveItem, com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                formData = saveItem.formData;
            }
            return saveItem.copy(formData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent$RequestBackNavigation;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BusinessInventoryItemsEditEvent;", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "formData", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;)V", "Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "getFormData", "()Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RequestBackNavigation extends com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryItemsEditEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBackNavigation(com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            this.formData = formData;
        }

        public final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData getFormData() {
            return this.formData;
        }
    }

    public /* synthetic */ BusinessInventoryItemsEditEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
