package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect;", "", "NavigateToDestination", "NavigateToAccountSetupSheet", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToAccountSetupSheet;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToDestination;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PayAndGetPaidEffect {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToDestination;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDestination implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey destination;

        public NavigateToDestination(androidx.navigation3.runtime.NavKey navKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.destination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.destination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDestination(destination=");
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
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination) other).destination);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination copy(androidx.navigation3.runtime.NavKey destination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination(destination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDestination() {
            return this.destination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToDestination navigateToDestination, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = navigateToDestination.destination;
            }
            return navigateToDestination.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToAccountSetupSheet;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect;", "", "featureName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/PayAndGetPaidEffect$NavigateToAccountSetupSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFeatureName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAccountSetupSheet implements com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect {
        public static final int $stable = 0;
        private final java.lang.String featureName;

        public NavigateToAccountSetupSheet(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.featureName = str;
        }

        public final java.lang.String getFeatureName() {
            return this.featureName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.featureName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAccountSetupSheet(featureName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.featureName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.featureName, ((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet) other).featureName);
        }

        public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet copy(java.lang.String featureName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
            return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet(featureName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFeatureName() {
            return this.featureName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet copy$default(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.PayAndGetPaidEffect.NavigateToAccountSetupSheet navigateToAccountSetupSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAccountSetupSheet.featureName;
            }
            return navigateToAccountSetupSheet.copy(str);
        }
    }
}
