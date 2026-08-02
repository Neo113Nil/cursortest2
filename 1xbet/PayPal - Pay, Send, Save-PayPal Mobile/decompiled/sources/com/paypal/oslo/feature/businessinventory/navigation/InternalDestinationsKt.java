package com.paypal.oslo.feature.businessinventory.navigation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "", "toBusinessFlow", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalDestinationsKt {
    public static final java.lang.String toBusinessFlow(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxesPresentationMode, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(taxesPresentationMode, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.View.INSTANCE)) {
            return "view_taxes";
        }
        if (taxesPresentationMode instanceof com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.Select) {
            return "select_tax";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
