package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "", "SaveClicked", "DeleteTaxConfirmed", "LabelChanged", "PercentageChanged", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$DeleteTaxConfirmed;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$LabelChanged;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$PercentageChanged;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$SaveClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CreateTaxEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$SaveClicked;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SaveClicked implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.SaveClicked INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.SaveClicked();

        private SaveClicked() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$DeleteTaxConfirmed;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DeleteTaxConfirmed implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.DeleteTaxConfirmed INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.DeleteTaxConfirmed();

        private DeleteTaxConfirmed() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$LabelChanged;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "", "label", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$LabelChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LabelChanged implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent {
        public static final int $stable = 0;
        private final java.lang.String label;

        public LabelChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.label = str;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.label;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LabelChanged(label=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.label.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, ((com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged) other).label);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged copy(java.lang.String label) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged(label);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.LabelChanged labelChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = labelChanged.label;
            }
            return labelChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$PercentageChanged;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent;", "", "percent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxEvent$PercentageChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPercent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PercentageChanged implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent {
        public static final int $stable = 0;
        private final java.lang.String percent;

        public PercentageChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.percent = str;
        }

        public final java.lang.String getPercent() {
            return this.percent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.percent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PercentageChanged(percent=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.percent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.percent, ((com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged) other).percent);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged copy(java.lang.String percent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(percent, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged(percent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPercent() {
            return this.percent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxEvent.PercentageChanged percentageChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = percentageChanged.percent;
            }
            return percentageChanged.copy(str);
        }
    }
}
