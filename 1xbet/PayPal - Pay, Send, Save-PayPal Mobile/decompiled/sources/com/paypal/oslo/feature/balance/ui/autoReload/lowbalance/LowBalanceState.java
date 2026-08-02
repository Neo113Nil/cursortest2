package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "", "<init>", "()V", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Loading", "Error", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class LowBalanceState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial();

        public final int hashCode() {
            return 452219240;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private LowBalanceState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Ready;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready();

        public final int hashCode() {
            return 357108935;
        }

        private Ready() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Ready)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "step", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceRequestStep, "");
            this.step = lowBalanceRequestStep;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(step=");
            sb.append(lowBalanceRequestStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading) && this.step == ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading) other).step;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading copy(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading copy$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Loading loading, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                lowBalanceRequestStep = loading.step;
            }
            return loading.copy(lowBalanceRequestStep);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "step", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceRequestStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowBalanceRequestStep, "");
            this.step = lowBalanceRequestStep;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(step=");
            sb.append(lowBalanceRequestStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error) && this.step == ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error) other).step;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error copy(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error copy$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceState.Error error, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceRequestStep lowBalanceRequestStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                lowBalanceRequestStep = error.step;
            }
            return error.copy(lowBalanceRequestStep);
        }
    }

    public /* synthetic */ LowBalanceState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
