package com.paypal.oslo.feature.balance.ui.onholddetails.router;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "", "Idle", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Error;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface OnHoldDetailsRouterState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Idle;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Idle INSTANCE = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Idle();

        public final int hashCode() {
            return 989528666;
        }

        private Idle() {
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Loading INSTANCE = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Loading();

        public final int hashCode() {
            return 1360316662;
        }

        private Loading() {
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Success;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "holdType", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;)Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/HoldDisplayType;", "getHoldType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdType;

        public Success(com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdDisplayType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdDisplayType, "");
            this.holdType = holdDisplayType;
        }

        public final com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType getHoldType() {
            return this.holdType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdDisplayType = this.holdType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(holdType=");
            sb.append(holdDisplayType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.holdType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdType, ((com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success) other).holdType);
        }

        public final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success copy(com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(holdType, "");
            return new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success(holdType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType getHoldType() {
            return this.holdType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success copy$default(com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Success success, com.paypal.oslo.feature.balance.ui.onholddetails.router.HoldDisplayType holdDisplayType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                holdDisplayType = success.holdType;
            }
            return success.copy(holdDisplayType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState$Error;", "Lcom/paypal/oslo/feature/balance/ui/onholddetails/router/OnHoldDetailsRouterState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error INSTANCE = new com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error();

        public final int hashCode() {
            return 607346754;
        }

        private Error() {
        }

        public final java.lang.String toString() {
            return "Error";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.onholddetails.router.OnHoldDetailsRouterState.Error)) {
                return false;
            }
            return true;
        }
    }
}
