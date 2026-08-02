package com.paypal.oslo.feature.directdeposit.ui.form.effect;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect;", "", "<init>", "()V", "NavigateToReview", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect$NavigateToReview;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DirectDepositFormUiEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect$NavigateToReview;", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect;", "", "companyName", "amount", "", "isPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/DirectDepositFormUiEffect$NavigateToReview;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCompanyName", "getAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReview extends com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final java.lang.String companyName;
        private final boolean isPercentage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReview(java.lang.String str, java.lang.String str2, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.companyName = str;
            this.amount = str2;
            this.isPercentage = z;
        }

        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final boolean isPercentage() {
            return this.isPercentage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.companyName;
            java.lang.String str2 = this.amount;
            boolean z = this.isPercentage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReview(companyName=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(str2);
            sb.append(", isPercentage=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.companyName.hashCode() * 31) + this.amount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isPercentage);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview)) {
                return false;
            }
            com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview navigateToReview = (com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.companyName, navigateToReview.companyName) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, navigateToReview.amount) && this.isPercentage == navigateToReview.isPercentage;
        }

        public final com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview copy(java.lang.String companyName, java.lang.String amount, boolean isPercentage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companyName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview(companyName, amount, isPercentage);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPercentage() {
            return this.isPercentage;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCompanyName() {
            return this.companyName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview copy$default(com.paypal.oslo.feature.directdeposit.ui.form.effect.DirectDepositFormUiEffect.NavigateToReview navigateToReview, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReview.companyName;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReview.amount;
            }
            if ((i & 4) != 0) {
                z = navigateToReview.isPercentage;
            }
            return navigateToReview.copy(str, str2, z);
        }
    }

    private DirectDepositFormUiEffect() {
    }

    public /* synthetic */ DirectDepositFormUiEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
