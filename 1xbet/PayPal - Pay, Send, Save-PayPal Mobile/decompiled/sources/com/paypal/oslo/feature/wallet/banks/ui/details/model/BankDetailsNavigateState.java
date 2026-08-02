package com.paypal.oslo.feature.wallet.banks.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState;", "", "NavigateTo", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState$NavigateTo;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BankDetailsNavigateState {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState$NavigateTo;", "Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailsNavigateState$NavigateTo;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateTo implements com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        public NavigateTo(androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateTo(destination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destination.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo) other).destination);
        }

        public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo copy$default(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailsNavigateState.NavigateTo navigateTo, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigateTo.destination;
            }
            return navigateTo.copy(navKey);
        }
    }
}
