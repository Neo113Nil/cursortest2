package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "", "OnCloseClicked", "OnUpdatePaymentMethodClicked", "OnAgreementSelected", "OnRetry", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnAgreementSelected;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnRetry;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnUpdatePaymentMethodClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BulkUpdateFiUiEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnCloseClicked;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseClicked implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnCloseClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnCloseClicked();

        public final int hashCode() {
            return -1104778178;
        }

        private OnCloseClicked() {
        }

        public final java.lang.String toString() {
            return "OnCloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnCloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnUpdatePaymentMethodClicked;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdatePaymentMethodClicked implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnUpdatePaymentMethodClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnUpdatePaymentMethodClicked();

        public final int hashCode() {
            return -1706952456;
        }

        private OnUpdatePaymentMethodClicked() {
        }

        public final java.lang.String toString() {
            return "OnUpdatePaymentMethodClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnUpdatePaymentMethodClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnAgreementSelected;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "", "agreementId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnAgreementSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAgreementId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAgreementSelected implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent {
        public static final int $stable = 0;
        private final java.lang.String agreementId;

        public OnAgreementSelected(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.agreementId = str;
        }

        public final java.lang.String getAgreementId() {
            return this.agreementId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.agreementId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAgreementSelected(agreementId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.agreementId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementId, ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected) other).agreementId);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected copy(java.lang.String agreementId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementId, "");
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected(agreementId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAgreementId() {
            return this.agreementId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnAgreementSelected onAgreementSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAgreementSelected.agreementId;
            }
            return onAgreementSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent$OnRetry;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetry implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnRetry INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnRetry();

        public final int hashCode() {
            return -1248640935;
        }

        private OnRetry() {
        }

        public final java.lang.String toString() {
            return "OnRetry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiUiEvent.OnRetry)) {
                return false;
            }
            return true;
        }
    }
}
