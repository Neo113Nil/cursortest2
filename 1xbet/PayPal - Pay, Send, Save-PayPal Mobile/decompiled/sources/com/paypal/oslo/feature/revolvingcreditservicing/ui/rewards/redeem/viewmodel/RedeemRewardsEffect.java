package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToSuccess", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect$NavigateToSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RedeemRewardsEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack();

        public final int hashCode() {
            return -590527947;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private RedeemRewardsEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect$NavigateToSuccess;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect;", "", "redeemedAmount", "", "isPartialSuccess", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsEffect$NavigateToSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRedeemedAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSuccess extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect {
        public static final int $stable = 0;
        private final boolean isPartialSuccess;
        private final java.lang.String redeemedAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSuccess(java.lang.String str, boolean z) {
            super("NavigateToSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.redeemedAmount = str;
            this.isPartialSuccess = z;
        }

        public final java.lang.String getRedeemedAmount() {
            return this.redeemedAmount;
        }

        public final boolean isPartialSuccess() {
            return this.isPartialSuccess;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.redeemedAmount;
            boolean z = this.isPartialSuccess;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSuccess(redeemedAmount=");
            sb.append(str);
            sb.append(", isPartialSuccess=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemedAmount.hashCode() * 31) + java.lang.Boolean.hashCode(this.isPartialSuccess);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess navigateToSuccess = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.redeemedAmount, navigateToSuccess.redeemedAmount) && this.isPartialSuccess == navigateToSuccess.isPartialSuccess;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess copy(java.lang.String redeemedAmount, boolean isPartialSuccess) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemedAmount, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess(redeemedAmount, isPartialSuccess);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPartialSuccess() {
            return this.isPartialSuccess;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRedeemedAmount() {
            return this.redeemedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsEffect.NavigateToSuccess navigateToSuccess, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSuccess.redeemedAmount;
            }
            if ((i & 2) != 0) {
                z = navigateToSuccess.isPartialSuccess;
            }
            return navigateToSuccess.copy(str, z);
        }
    }

    public /* synthetic */ RedeemRewardsEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
