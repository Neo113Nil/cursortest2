package com.paypal.oslo.feature.wallet.me.domain.savings;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;", "account", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;", "features", "", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;", "component2", "()Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;", "getAccount", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;", "getFeatures", "Ljava/util/List;", "getGoals"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SavingsOverview {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount account;
    private final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures features;
    private final java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> goals;

    public SavingsOverview(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount savingsAccount, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures savingsFeatures, java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsFeatures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.account = savingsAccount;
        this.features = savingsFeatures;
        this.goals = list;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount getAccount() {
        return this.account;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures getFeatures() {
        return this.features;
    }

    public /* synthetic */ SavingsOverview(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount savingsAccount, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures savingsFeatures, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(savingsAccount, savingsFeatures, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> getGoals() {
        return this.goals;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount savingsAccount = this.account;
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures savingsFeatures = this.features;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> list = this.goals;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsOverview(account=");
        sb.append(savingsAccount);
        sb.append(", features=");
        sb.append(savingsFeatures);
        sb.append(", goals=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.account.hashCode() * 31) + this.features.hashCode()) * 31) + this.goals.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview = (com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.account, savingsOverview.account) && kotlin.jvm.internal.Intrinsics.areEqual(this.features, savingsOverview.features) && kotlin.jvm.internal.Intrinsics.areEqual(this.goals, savingsOverview.goals);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview copy(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount account, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures features, java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> goals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(account, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goals, "");
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview(account, features, goals);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal> component3() {
        return this.goals;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures getFeatures() {
        return this.features;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount getAccount() {
        return this.account;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview copy$default(com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview savingsOverview, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount savingsAccount, com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures savingsFeatures, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savingsAccount = savingsOverview.account;
        }
        if ((i & 2) != 0) {
            savingsFeatures = savingsOverview.features;
        }
        if ((i & 4) != 0) {
            list = savingsOverview.goals;
        }
        return savingsOverview.copy(savingsAccount, savingsFeatures, list);
    }
}
