package com.paypal.oslo.feature.businessinventory.ui.taxedit;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect;", "", "NavigateBack", "NavigateBackWithResult", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect$NavigateBackWithResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CreateTaxUiEffect {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigateBack implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBack();

        private NavigateBack() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect$NavigateBackWithResult;", "Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "tax", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "copy", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businessinventory/ui/taxedit/CreateTaxUiEffect$NavigateBackWithResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getTax"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBackWithResult implements com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax;

        public NavigateBackWithResult(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
            this.tax = taxOption;
        }

        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.tax;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateBackWithResult(tax=");
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
            return (other instanceof com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.tax, ((com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult) other).tax);
        }

        public final com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult copy(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption tax) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
            return new com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult(tax);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTax() {
            return this.tax;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult copy$default(com.paypal.oslo.feature.businessinventory.ui.taxedit.CreateTaxUiEffect.NavigateBackWithResult navigateBackWithResult, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                taxOption = navigateBackWithResult.tax;
            }
            return navigateBackWithResult.copy(taxOption);
        }
    }
}
