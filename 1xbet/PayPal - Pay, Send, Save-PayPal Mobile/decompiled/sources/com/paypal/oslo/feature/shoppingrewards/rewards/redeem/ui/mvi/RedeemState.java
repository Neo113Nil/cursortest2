package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\t\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "Initial", "Loading", "ReadyCapture", "LoadingCharities", "ReadyCharitySelection", "ReadySummary", "Redeeming", "ReadyConfirmation", "Error", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$LoadingCharities;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCapture;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCharitySelection;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyConfirmation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadySummary;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RedeemState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    public abstract com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType();

    private RedeemState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Initial;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            super("Initial", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initial(redeemType=");
            sb.append(redeemType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.redeemType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial) && this.redeemType == ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial) other).redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial(redeemType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Initial initial, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemType = initial.redeemType;
            }
            return initial.copy(redeemType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "availablePoints", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;I)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final int availablePoints;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
            this.availablePoints = i;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            int i = this.availablePoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(redeemType=");
            sb.append(redeemType);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemType.hashCode() * 31) + java.lang.Integer.hashCode(this.availablePoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading loading = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading) other;
            return this.redeemType == loading.redeemType && this.availablePoints == loading.availablePoints;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int availablePoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading(redeemType, availablePoints);
        }

        /* renamed from: component2, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Loading loading, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                redeemType = loading.redeemType;
            }
            if ((i2 & 2) != 0) {
                i = loading.availablePoints;
            }
            return loading.copy(redeemType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u008e\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b6\u0010\u0017R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b7\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b8\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b:\u0010\u0017R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b;\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b<\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCapture;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "amount", "convertedAmount", "", "availablePoints", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "exchangeRateDisplayText", "selectedCharityId", "selectedCharityName", "selectedCharityLogoUrl", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "()I", "component5", "()D", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCapture;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Ljava/lang/String;", "getAmount", "getConvertedAmount", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "D", "getConversionRate", "getExchangeRatePoints", "getExchangeRateAmount", "getCurrencyCode", "getExchangeRateDisplayText", "getSelectedCharityId", "getSelectedCharityName", "getSelectedCharityLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyCapture extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final int availablePoints;
        private final double conversionRate;
        private final java.lang.String convertedAmount;
        private final java.lang.String currencyCode;
        private final java.lang.String exchangeRateAmount;
        private final java.lang.String exchangeRateDisplayText;
        private final java.lang.String exchangeRatePoints;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final java.lang.String selectedCharityId;
        private final java.lang.String selectedCharityLogoUrl;
        private final java.lang.String selectedCharityName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyCapture(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, int i, double d, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            super("ReadyCapture", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.redeemType = redeemType;
            this.amount = str;
            this.convertedAmount = str2;
            this.availablePoints = i;
            this.conversionRate = d;
            this.exchangeRatePoints = str3;
            this.exchangeRateAmount = str4;
            this.currencyCode = str5;
            this.exchangeRateDisplayText = str6;
            this.selectedCharityId = str7;
            this.selectedCharityName = str8;
            this.selectedCharityLogoUrl = str9;
        }

        public /* synthetic */ ReadyCapture(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, int i, double d, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemType, str, str2, i, d, str3, str4, str5, str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.amount;
            java.lang.String str2 = this.convertedAmount;
            int i = this.availablePoints;
            double d = this.conversionRate;
            java.lang.String str3 = this.exchangeRatePoints;
            java.lang.String str4 = this.exchangeRateAmount;
            java.lang.String str5 = this.currencyCode;
            java.lang.String str6 = this.exchangeRateDisplayText;
            java.lang.String str7 = this.selectedCharityId;
            java.lang.String str8 = this.selectedCharityName;
            java.lang.String str9 = this.selectedCharityLogoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyCapture(redeemType=");
            sb.append(redeemType);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", convertedAmount=");
            sb.append(str2);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", conversionRate=");
            sb.append(d);
            sb.append(", exchangeRatePoints=");
            sb.append(str3);
            sb.append(", exchangeRateAmount=");
            sb.append(str4);
            sb.append(", currencyCode=");
            sb.append(str5);
            sb.append(", exchangeRateDisplayText=");
            sb.append(str6);
            sb.append(", selectedCharityId=");
            sb.append(str7);
            sb.append(", selectedCharityName=");
            sb.append(str8);
            sb.append(", selectedCharityLogoUrl=");
            sb.append(str9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.convertedAmount.hashCode();
            int hashCode4 = java.lang.Integer.hashCode(this.availablePoints);
            int hashCode5 = java.lang.Double.hashCode(this.conversionRate);
            int hashCode6 = this.exchangeRatePoints.hashCode();
            int hashCode7 = this.exchangeRateAmount.hashCode();
            int hashCode8 = this.currencyCode.hashCode();
            int hashCode9 = this.exchangeRateDisplayText.hashCode();
            java.lang.String str = this.selectedCharityId;
            int hashCode10 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.selectedCharityName;
            int hashCode11 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.selectedCharityLogoUrl;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture readyCapture = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture) other;
            return this.redeemType == readyCapture.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, readyCapture.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.convertedAmount, readyCapture.convertedAmount) && this.availablePoints == readyCapture.availablePoints && java.lang.Double.compare(this.conversionRate, readyCapture.conversionRate) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRatePoints, readyCapture.exchangeRatePoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateAmount, readyCapture.exchangeRateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, readyCapture.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateDisplayText, readyCapture.exchangeRateDisplayText) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityId, readyCapture.selectedCharityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityName, readyCapture.selectedCharityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityLogoUrl, readyCapture.selectedCharityLogoUrl);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String amount, java.lang.String convertedAmount, int availablePoints, double conversionRate, java.lang.String exchangeRatePoints, java.lang.String exchangeRateAmount, java.lang.String currencyCode, java.lang.String exchangeRateDisplayText, java.lang.String selectedCharityId, java.lang.String selectedCharityName, java.lang.String selectedCharityLogoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRatePoints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateDisplayText, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCapture(redeemType, amount, convertedAmount, availablePoints, conversionRate, exchangeRatePoints, exchangeRateAmount, currencyCode, exchangeRateDisplayText, selectedCharityId, selectedCharityName, selectedCharityLogoUrl);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        /* renamed from: component5, reason: from getter */
        public final double getConversionRate() {
            return this.conversionRate;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016JV\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b,\u0010\u0016R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b-\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$LoadingCharities;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "availablePoints", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "", "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "exchangeRateDisplayText", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()I", "component3", "()D", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$LoadingCharities;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "D", "getConversionRate", "Ljava/lang/String;", "getExchangeRatePoints", "getExchangeRateAmount", "getCurrencyCode", "getExchangeRateDisplayText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingCharities extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final int availablePoints;
        private final double conversionRate;
        private final java.lang.String currencyCode;
        private final java.lang.String exchangeRateAmount;
        private final java.lang.String exchangeRateDisplayText;
        private final java.lang.String exchangeRatePoints;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingCharities(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("LoadingCharities", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.redeemType = redeemType;
            this.availablePoints = i;
            this.conversionRate = d;
            this.exchangeRatePoints = str;
            this.exchangeRateAmount = str2;
            this.currencyCode = str3;
            this.exchangeRateDisplayText = str4;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            int i = this.availablePoints;
            double d = this.conversionRate;
            java.lang.String str = this.exchangeRatePoints;
            java.lang.String str2 = this.exchangeRateAmount;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.exchangeRateDisplayText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingCharities(redeemType=");
            sb.append(redeemType);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", conversionRate=");
            sb.append(d);
            sb.append(", exchangeRatePoints=");
            sb.append(str);
            sb.append(", exchangeRateAmount=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", exchangeRateDisplayText=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((this.redeemType.hashCode() * 31) + java.lang.Integer.hashCode(this.availablePoints)) * 31) + java.lang.Double.hashCode(this.conversionRate)) * 31) + this.exchangeRatePoints.hashCode()) * 31) + this.exchangeRateAmount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.exchangeRateDisplayText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities loadingCharities = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities) other;
            return this.redeemType == loadingCharities.redeemType && this.availablePoints == loadingCharities.availablePoints && java.lang.Double.compare(this.conversionRate, loadingCharities.conversionRate) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRatePoints, loadingCharities.exchangeRatePoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateAmount, loadingCharities.exchangeRateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, loadingCharities.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateDisplayText, loadingCharities.exchangeRateDisplayText);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int availablePoints, double conversionRate, java.lang.String exchangeRatePoints, java.lang.String exchangeRateAmount, java.lang.String currencyCode, java.lang.String exchangeRateDisplayText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRatePoints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateDisplayText, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.LoadingCharities(redeemType, availablePoints, conversionRate, exchangeRatePoints, exchangeRateAmount, currencyCode, exchangeRateDisplayText);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        /* renamed from: component3, reason: from getter */
        public final double getConversionRate() {
            return this.conversionRate;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u0018Jr\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010\u001aJ\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b7\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCharitySelection;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/CharityModel;", "charities", "", "selectedCharityId", "", "availablePoints", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "exchangeRatePoints", "exchangeRateAmount", "currencyCode", "exchangeRateDisplayText", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/util/List;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()I", "component5", "()D", "component6", "component7", "component8", "component9", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/util/List;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyCharitySelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Ljava/util/List;", "getCharities", "Ljava/lang/String;", "getSelectedCharityId", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "D", "getConversionRate", "getExchangeRatePoints", "getExchangeRateAmount", "getCurrencyCode", "getExchangeRateDisplayText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyCharitySelection extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 8;
        private final int availablePoints;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities;
        private final double conversionRate;
        private final java.lang.String currencyCode;
        private final java.lang.String exchangeRateAmount;
        private final java.lang.String exchangeRateDisplayText;
        private final java.lang.String exchangeRatePoints;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final java.lang.String selectedCharityId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyCharitySelection(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> list, java.lang.String str, int i, double d, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super("ReadyCharitySelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.redeemType = redeemType;
            this.charities = list;
            this.selectedCharityId = str;
            this.availablePoints = i;
            this.conversionRate = d;
            this.exchangeRatePoints = str2;
            this.exchangeRateAmount = str3;
            this.currencyCode = str4;
            this.exchangeRateDisplayText = str5;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> getCharities() {
            return this.charities;
        }

        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final double getConversionRate() {
            return this.conversionRate;
        }

        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> list = this.charities;
            java.lang.String str = this.selectedCharityId;
            int i = this.availablePoints;
            double d = this.conversionRate;
            java.lang.String str2 = this.exchangeRatePoints;
            java.lang.String str3 = this.exchangeRateAmount;
            java.lang.String str4 = this.currencyCode;
            java.lang.String str5 = this.exchangeRateDisplayText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyCharitySelection(redeemType=");
            sb.append(redeemType);
            sb.append(", charities=");
            sb.append(list);
            sb.append(", selectedCharityId=");
            sb.append(str);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", conversionRate=");
            sb.append(d);
            sb.append(", exchangeRatePoints=");
            sb.append(str2);
            sb.append(", exchangeRateAmount=");
            sb.append(str3);
            sb.append(", currencyCode=");
            sb.append(str4);
            sb.append(", exchangeRateDisplayText=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.charities.hashCode();
            java.lang.String str = this.selectedCharityId;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.availablePoints)) * 31) + java.lang.Double.hashCode(this.conversionRate)) * 31) + this.exchangeRatePoints.hashCode()) * 31) + this.exchangeRateAmount.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.exchangeRateDisplayText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection readyCharitySelection = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection) other;
            return this.redeemType == readyCharitySelection.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.charities, readyCharitySelection.charities) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityId, readyCharitySelection.selectedCharityId) && this.availablePoints == readyCharitySelection.availablePoints && java.lang.Double.compare(this.conversionRate, readyCharitySelection.conversionRate) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRatePoints, readyCharitySelection.exchangeRatePoints) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateAmount, readyCharitySelection.exchangeRateAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, readyCharitySelection.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateDisplayText, readyCharitySelection.exchangeRateDisplayText);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities, java.lang.String selectedCharityId, int availablePoints, double conversionRate, java.lang.String exchangeRatePoints, java.lang.String exchangeRateAmount, java.lang.String currencyCode, java.lang.String exchangeRateDisplayText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charities, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRatePoints, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateDisplayText, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyCharitySelection(redeemType, charities, selectedCharityId, availablePoints, conversionRate, exchangeRatePoints, exchangeRateAmount, currencyCode, exchangeRateDisplayText);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExchangeRateAmount() {
            return this.exchangeRateAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getExchangeRatePoints() {
            return this.exchangeRatePoints;
        }

        /* renamed from: component5, reason: from getter */
        public final double getConversionRate() {
            return this.conversionRate;
        }

        /* renamed from: component4, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> component2() {
            return this.charities;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJv\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0015R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0015R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadySummary;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "amount", "convertedAmount", "currencyCode", "formattedAmount", "selectedCharityId", "selectedCharityName", "selectedCharityLogoUrl", "", "availablePoints", "", "shareInfoEnabled", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "()Z", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadySummary;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Ljava/lang/String;", "getAmount", "getConvertedAmount", "getCurrencyCode", "getFormattedAmount", "getSelectedCharityId", "getSelectedCharityName", "getSelectedCharityLogoUrl", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "Z", "getShareInfoEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadySummary extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final int availablePoints;
        private final java.lang.String convertedAmount;
        private final java.lang.String currencyCode;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final java.lang.String selectedCharityId;
        private final java.lang.String selectedCharityLogoUrl;
        private final java.lang.String selectedCharityName;
        private final boolean shareInfoEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadySummary(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, boolean z) {
            super("ReadySummary", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.redeemType = redeemType;
            this.amount = str;
            this.convertedAmount = str2;
            this.currencyCode = str3;
            this.formattedAmount = str4;
            this.selectedCharityId = str5;
            this.selectedCharityName = str6;
            this.selectedCharityLogoUrl = str7;
            this.availablePoints = i;
            this.shareInfoEnabled = z;
        }

        public /* synthetic */ ReadySummary(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemType, str, str2, str3, str4, str5, str6, str7, i, (i2 & 512) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final boolean getShareInfoEnabled() {
            return this.shareInfoEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.amount;
            java.lang.String str2 = this.convertedAmount;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.formattedAmount;
            java.lang.String str5 = this.selectedCharityId;
            java.lang.String str6 = this.selectedCharityName;
            java.lang.String str7 = this.selectedCharityLogoUrl;
            int i = this.availablePoints;
            boolean z = this.shareInfoEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadySummary(redeemType=");
            sb.append(redeemType);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", convertedAmount=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", formattedAmount=");
            sb.append(str4);
            sb.append(", selectedCharityId=");
            sb.append(str5);
            sb.append(", selectedCharityName=");
            sb.append(str6);
            sb.append(", selectedCharityLogoUrl=");
            sb.append(str7);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", shareInfoEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.convertedAmount.hashCode();
            int hashCode4 = this.currencyCode.hashCode();
            int hashCode5 = this.formattedAmount.hashCode();
            int hashCode6 = this.selectedCharityId.hashCode();
            int hashCode7 = this.selectedCharityName.hashCode();
            java.lang.String str = this.selectedCharityLogoUrl;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.availablePoints)) * 31) + java.lang.Boolean.hashCode(this.shareInfoEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary readySummary = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary) other;
            return this.redeemType == readySummary.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, readySummary.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.convertedAmount, readySummary.convertedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, readySummary.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, readySummary.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityId, readySummary.selectedCharityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityName, readySummary.selectedCharityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityLogoUrl, readySummary.selectedCharityLogoUrl) && this.availablePoints == readySummary.availablePoints && this.shareInfoEnabled == readySummary.shareInfoEnabled;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String amount, java.lang.String convertedAmount, java.lang.String currencyCode, java.lang.String formattedAmount, java.lang.String selectedCharityId, java.lang.String selectedCharityName, java.lang.String selectedCharityLogoUrl, int availablePoints, boolean shareInfoEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCharityId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedCharityName, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadySummary(redeemType, amount, convertedAmount, currencyCode, formattedAmount, selectedCharityId, selectedCharityName, selectedCharityLogoUrl, availablePoints, shareInfoEnabled);
        }

        /* renamed from: component9, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShareInfoEnabled() {
            return this.shareInfoEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJz\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0015R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "amount", "convertedAmount", "currencyCode", "formattedAmount", "selectedCharityId", "selectedCharityName", "selectedCharityLogoUrl", "", "availablePoints", "", "shareInfoEnabled", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()I", "component10", "()Z", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Ljava/lang/String;", "getAmount", "getConvertedAmount", "getCurrencyCode", "getFormattedAmount", "getSelectedCharityId", "getSelectedCharityName", "getSelectedCharityLogoUrl", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "Z", "getShareInfoEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Redeeming extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final int availablePoints;
        private final java.lang.String convertedAmount;
        private final java.lang.String currencyCode;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final java.lang.String selectedCharityId;
        private final java.lang.String selectedCharityLogoUrl;
        private final java.lang.String selectedCharityName;
        private final boolean shareInfoEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redeeming(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, boolean z) {
            super("Redeeming", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.redeemType = redeemType;
            this.amount = str;
            this.convertedAmount = str2;
            this.currencyCode = str3;
            this.formattedAmount = str4;
            this.selectedCharityId = str5;
            this.selectedCharityName = str6;
            this.selectedCharityLogoUrl = str7;
            this.availablePoints = i;
            this.shareInfoEnabled = z;
        }

        public /* synthetic */ Redeeming(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemType, str, str2, str3, str4, str5, str6, str7, i, (i2 & 512) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final boolean getShareInfoEnabled() {
            return this.shareInfoEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.amount;
            java.lang.String str2 = this.convertedAmount;
            java.lang.String str3 = this.currencyCode;
            java.lang.String str4 = this.formattedAmount;
            java.lang.String str5 = this.selectedCharityId;
            java.lang.String str6 = this.selectedCharityName;
            java.lang.String str7 = this.selectedCharityLogoUrl;
            int i = this.availablePoints;
            boolean z = this.shareInfoEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Redeeming(redeemType=");
            sb.append(redeemType);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", convertedAmount=");
            sb.append(str2);
            sb.append(", currencyCode=");
            sb.append(str3);
            sb.append(", formattedAmount=");
            sb.append(str4);
            sb.append(", selectedCharityId=");
            sb.append(str5);
            sb.append(", selectedCharityName=");
            sb.append(str6);
            sb.append(", selectedCharityLogoUrl=");
            sb.append(str7);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", shareInfoEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.convertedAmount.hashCode();
            int hashCode4 = this.currencyCode.hashCode();
            int hashCode5 = this.formattedAmount.hashCode();
            java.lang.String str = this.selectedCharityId;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.selectedCharityName;
            int hashCode7 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.selectedCharityLogoUrl;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.availablePoints)) * 31) + java.lang.Boolean.hashCode(this.shareInfoEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) other;
            return this.redeemType == redeeming.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, redeeming.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.convertedAmount, redeeming.convertedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, redeeming.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, redeeming.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityId, redeeming.selectedCharityId) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityName, redeeming.selectedCharityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityLogoUrl, redeeming.selectedCharityLogoUrl) && this.availablePoints == redeeming.availablePoints && this.shareInfoEnabled == redeeming.shareInfoEnabled;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String amount, java.lang.String convertedAmount, java.lang.String currencyCode, java.lang.String formattedAmount, java.lang.String selectedCharityId, java.lang.String selectedCharityName, java.lang.String selectedCharityLogoUrl, int availablePoints, boolean shareInfoEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming(redeemType, amount, convertedAmount, currencyCode, formattedAmount, selectedCharityId, selectedCharityName, selectedCharityLogoUrl, availablePoints, shareInfoEnabled);
        }

        /* renamed from: component9, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSelectedCharityId() {
            return this.selectedCharityId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShareInfoEnabled() {
            return this.shareInfoEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JZ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b&\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b'\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyConfirmation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "amount", "convertedAmount", "formattedAmount", "selectedCharityName", "selectedCharityLogoUrl", "", "availablePoints", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()I", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$ReadyConfirmation;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Ljava/lang/String;", "getAmount", "getConvertedAmount", "getFormattedAmount", "getSelectedCharityName", "getSelectedCharityLogoUrl", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyConfirmation extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final int availablePoints;
        private final java.lang.String convertedAmount;
        private final java.lang.String formattedAmount;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final java.lang.String selectedCharityLogoUrl;
        private final java.lang.String selectedCharityName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReadyConfirmation(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i) {
            super("ReadyConfirmation", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.redeemType = redeemType;
            this.amount = str;
            this.convertedAmount = str2;
            this.formattedAmount = str3;
            this.selectedCharityName = str4;
            this.selectedCharityLogoUrl = str5;
            this.availablePoints = i;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            java.lang.String str = this.amount;
            java.lang.String str2 = this.convertedAmount;
            java.lang.String str3 = this.formattedAmount;
            java.lang.String str4 = this.selectedCharityName;
            java.lang.String str5 = this.selectedCharityLogoUrl;
            int i = this.availablePoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyConfirmation(redeemType=");
            sb.append(redeemType);
            sb.append(", amount=");
            sb.append(str);
            sb.append(", convertedAmount=");
            sb.append(str2);
            sb.append(", formattedAmount=");
            sb.append(str3);
            sb.append(", selectedCharityName=");
            sb.append(str4);
            sb.append(", selectedCharityLogoUrl=");
            sb.append(str5);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.amount.hashCode();
            int hashCode3 = this.convertedAmount.hashCode();
            int hashCode4 = this.formattedAmount.hashCode();
            java.lang.String str = this.selectedCharityName;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.selectedCharityLogoUrl;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.availablePoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation readyConfirmation = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation) other;
            return this.redeemType == readyConfirmation.redeemType && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, readyConfirmation.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.convertedAmount, readyConfirmation.convertedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, readyConfirmation.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityName, readyConfirmation.selectedCharityName) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedCharityLogoUrl, readyConfirmation.selectedCharityLogoUrl) && this.availablePoints == readyConfirmation.availablePoints;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String amount, java.lang.String convertedAmount, java.lang.String formattedAmount, java.lang.String selectedCharityName, java.lang.String selectedCharityLogoUrl, int availablePoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(convertedAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation(redeemType, amount, convertedAmount, formattedAmount, selectedCharityName, selectedCharityLogoUrl, availablePoints);
        }

        /* renamed from: component7, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSelectedCharityLogoUrl() {
            return this.selectedCharityLogoUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSelectedCharityName() {
            return this.selectedCharityName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getConvertedAmount() {
            return this.convertedAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.ReadyConfirmation readyConfirmation, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                redeemType = readyConfirmation.redeemType;
            }
            if ((i2 & 2) != 0) {
                str = readyConfirmation.amount;
            }
            java.lang.String str6 = str;
            if ((i2 & 4) != 0) {
                str2 = readyConfirmation.convertedAmount;
            }
            java.lang.String str7 = str2;
            if ((i2 & 8) != 0) {
                str3 = readyConfirmation.formattedAmount;
            }
            java.lang.String str8 = str3;
            if ((i2 & 16) != 0) {
                str4 = readyConfirmation.selectedCharityName;
            }
            java.lang.String str9 = str4;
            if ((i2 & 32) != 0) {
                str5 = readyConfirmation.selectedCharityLogoUrl;
            }
            java.lang.String str10 = str5;
            if ((i2 & 64) != 0) {
                i = readyConfirmation.availablePoints;
            }
            return readyConfirmation.copy(redeemType, str6, str7, str8, str9, str10, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "", "availablePoints", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;", "redeemingState", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;ILcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "component3", "()I", "component4", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;ILcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemState$Redeeming;", "getRedeemingState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState {
        public static final int $stable = 0;
        private final int availablePoints;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeemingState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.redeemType = redeemType;
            this.errorType = errorStateType;
            this.availablePoints = i;
            this.redeemingState = redeeming;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemType, errorStateType, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : redeeming);
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming getRedeemingState() {
            return this.redeemingState;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            int i = this.availablePoints;
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming = this.redeemingState;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(redeemType=");
            sb.append(redeemType);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(", redeemingState=");
            sb.append(redeeming);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.redeemType.hashCode();
            int hashCode2 = this.errorType.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.availablePoints);
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming = this.redeemingState;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (redeeming == null ? 0 : redeeming.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error) other;
            return this.redeemType == error.redeemType && this.errorType == error.errorType && this.availablePoints == error.availablePoints && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemingState, error.redeemingState);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType, int availablePoints, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeemingState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error(redeemType, errorType, availablePoints, redeemingState);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming getRedeemingState() {
            return this.redeemingState;
        }

        /* renamed from: component3, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Error error, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                redeemType = error.redeemType;
            }
            if ((i2 & 2) != 0) {
                errorStateType = error.errorType;
            }
            if ((i2 & 4) != 0) {
                i = error.availablePoints;
            }
            if ((i2 & 8) != 0) {
                redeeming = error.redeemingState;
            }
            return error.copy(redeemType, errorStateType, i, redeeming);
        }
    }

    public /* synthetic */ RedeemState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
