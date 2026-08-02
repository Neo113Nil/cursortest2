package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect;", "", "CreateTax", "SelectTax", "EditTax", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$CreateTax;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$EditTax;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$SelectTax;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface UiEffect {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$CreateTax;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreateTax implements com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.CreateTax INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.CreateTax();

        public final int hashCode() {
            return 641107810;
        }

        private CreateTax() {
        }

        public final java.lang.String toString() {
            return "CreateTax";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.CreateTax)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$SelectTax;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "tax", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$SelectTax;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getTax"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectTax implements com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax;

        public SelectTax(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
            this.tax = taxOption;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.tax;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectTax(tax=");
            sb.append(taxOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.tax;
            if (taxOption == null) {
                return 0;
            }
            return taxOption.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax) && kotlin.jvm.internal.Intrinsics.areEqual(this.tax, ((com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax) other).tax);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax copy(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax) {
            return new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax(tax);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax copy$default(com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.SelectTax selectTax, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taxOption = selectTax.tax;
            }
            return selectTax.copy(taxOption);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$EditTax;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "tax", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiEffect$EditTax;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getTax"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditTax implements com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax;

        public EditTax(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
            this.tax = taxOption;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.tax;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EditTax(tax=");
            sb.append(taxOption);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.tax.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax) && kotlin.jvm.internal.Intrinsics.areEqual(this.tax, ((com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax) other).tax);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax copy(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax(tax);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax copy$default(com.paypal.oslo.feature.businessinventory.ui.taxlist.UiEffect.EditTax editTax, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taxOption = editTax.tax;
            }
            return editTax.copy(taxOption);
        }
    }
}
