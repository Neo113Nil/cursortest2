package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiState;", "", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "taxes", "", "displayError", "isLoading", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Ljava/util/List;ZZ)V", "component1", "()Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "copy", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Ljava/util/List;ZZ)Lcom/paypal/oslo/feature/businessinventory/ui/taxlist/UiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "getPresentationMode", "Ljava/util/List;", "getTaxes", "Z", "getDisplayError"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiState {
    public static final int $stable = 0;
    private final boolean displayError;
    private final boolean isLoading;
    private final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode;
    private final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> taxes;

    public UiState(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> list, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxesPresentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.presentationMode = taxesPresentationMode;
        this.taxes = list;
        this.displayError = z;
        this.isLoading = z2;
    }

    public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    public final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> getTaxes() {
        return this.taxes;
    }

    public final boolean getDisplayError() {
        return this.displayError;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode = this.presentationMode;
        java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> list = this.taxes;
        boolean z = this.displayError;
        boolean z2 = this.isLoading;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UiState(presentationMode=");
        sb.append(taxesPresentationMode);
        sb.append(", taxes=");
        sb.append(list);
        sb.append(", displayError=");
        sb.append(z);
        sb.append(", isLoading=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.presentationMode.hashCode() * 31) + this.taxes.hashCode()) * 31) + java.lang.Boolean.hashCode(this.displayError)) * 31) + java.lang.Boolean.hashCode(this.isLoading);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState)) {
            return false;
        }
        com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState uiState = (com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.presentationMode, uiState.presentationMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxes, uiState.taxes) && this.displayError == uiState.displayError && this.isLoading == uiState.isLoading;
    }

    public final com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState copy(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode, java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> taxes, boolean displayError, boolean isLoading) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(presentationMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxes, "");
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState(presentationMode, taxes, displayError, isLoading);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDisplayError() {
        return this.displayError;
    }

    public final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> component2() {
        return this.taxes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState copy$default(com.paypal.oslo.feature.businessinventory.ui.taxlist.UiState uiState, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            taxesPresentationMode = uiState.presentationMode;
        }
        if ((i & 2) != 0) {
            list = uiState.taxes;
        }
        if ((i & 4) != 0) {
            z = uiState.displayError;
        }
        if ((i & 8) != 0) {
            z2 = uiState.isLoading;
        }
        return uiState.copy(taxesPresentationMode, list, z, z2);
    }
}
