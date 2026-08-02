package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "", "OnChangeClick", "OnDoneClick", "OnCloseClick", "OnBackClick", "OnSystemBackPressed", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnBackClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnChangeClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnCloseClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnDoneClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnSystemBackPressed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BulkUpdateFiPostUpdateUiEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnChangeClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "", "", "agreementIds", "agreementType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnChangeClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAgreementIds", "Ljava/lang/String;", "getAgreementType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeClick implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> agreementIds;
        private final java.lang.String agreementType;

        public OnChangeClick(java.util.List<java.lang.String> list, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.agreementIds = list;
            this.agreementType = str;
        }

        public final java.util.List<java.lang.String> getAgreementIds() {
            return this.agreementIds;
        }

        public final java.lang.String getAgreementType() {
            return this.agreementType;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.agreementIds;
            java.lang.String str = this.agreementType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnChangeClick(agreementIds=");
            sb.append(list);
            sb.append(", agreementType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.agreementIds.hashCode() * 31) + this.agreementType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick onChangeClick = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.agreementIds, onChangeClick.agreementIds) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementType, onChangeClick.agreementType);
        }

        public final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick copy(java.util.List<java.lang.String> agreementIds, java.lang.String agreementType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementIds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
            return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick(agreementIds, agreementType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAgreementType() {
            return this.agreementType;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.agreementIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick copy$default(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnChangeClick onChangeClick, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onChangeClick.agreementIds;
            }
            if ((i & 2) != 0) {
                str = onChangeClick.agreementType;
            }
            return onChangeClick.copy(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnDoneClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDoneClick implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnDoneClick INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnDoneClick();

        public final int hashCode() {
            return 759232014;
        }

        private OnDoneClick() {
        }

        public final java.lang.String toString() {
            return "OnDoneClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnDoneClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnCloseClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCloseClick implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnCloseClick INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnCloseClick();

        public final int hashCode() {
            return 1308880008;
        }

        private OnCloseClick() {
        }

        public final java.lang.String toString() {
            return "OnCloseClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnCloseClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnBackClick;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClick implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnBackClick INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnBackClick();

        public final int hashCode() {
            return 448801737;
        }

        private OnBackClick() {
        }

        public final java.lang.String toString() {
            return "OnBackClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnBackClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent$OnSystemBackPressed;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/BulkUpdateFiPostUpdateUiEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSystemBackPressed implements com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnSystemBackPressed INSTANCE = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnSystemBackPressed();

        public final int hashCode() {
            return -1988064652;
        }

        private OnSystemBackPressed() {
        }

        public final java.lang.String toString() {
            return "OnSystemBackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateUiEvent.OnSystemBackPressed)) {
                return false;
            }
            return true;
        }
    }
}
