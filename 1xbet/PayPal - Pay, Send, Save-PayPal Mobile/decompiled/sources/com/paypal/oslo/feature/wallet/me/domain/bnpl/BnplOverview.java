package com.paypal.oslo.feature.wallet.me.domain.bnpl;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplOverview;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "totalRemainingBalance", "", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplPlan;", "plans", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "status", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "nextBestAction", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "component4", "()Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/util/List;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;)Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getTotalRemainingBalance", "Ljava/util/List;", "getPlans", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplStatus;", "getStatus", "Lcom/paypal/oslo/feature/wallet/me/domain/bnpl/BnplNextBestAction;", "getNextBestAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BnplOverview {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction nextBestAction;
    private final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> plans;
    private final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus status;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money totalRemainingBalance;

    /* JADX WARN: Multi-variable type inference failed */
    public BnplOverview(com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> list, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus bnplStatus, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction bnplNextBestAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.totalRemainingBalance = money;
        this.plans = list;
        this.status = bnplStatus;
        this.nextBestAction = bnplNextBestAction;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalRemainingBalance() {
        return this.totalRemainingBalance;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> getPlans() {
        return this.plans;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction getNextBestAction() {
        return this.nextBestAction;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.totalRemainingBalance;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> list = this.plans;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus bnplStatus = this.status;
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction bnplNextBestAction = this.nextBestAction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplOverview(totalRemainingBalance=");
        sb.append(money);
        sb.append(", plans=");
        sb.append(list);
        sb.append(", status=");
        sb.append(bnplStatus);
        sb.append(", nextBestAction=");
        sb.append(bnplNextBestAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.totalRemainingBalance.hashCode();
        int hashCode2 = this.plans.hashCode();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus bnplStatus = this.status;
        int hashCode3 = bnplStatus == null ? 0 : bnplStatus.hashCode();
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction bnplNextBestAction = this.nextBestAction;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bnplNextBestAction != null ? bnplNextBestAction.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview = (com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.totalRemainingBalance, bnplOverview.totalRemainingBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.plans, bnplOverview.plans) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, bnplOverview.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextBestAction, bnplOverview.nextBestAction);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview copy(com.paypal.oslo.feature.wallet.common.domain.model.Money totalRemainingBalance, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> plans, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus status, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction nextBestAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalRemainingBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plans, "");
        return new com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview(totalRemainingBalance, plans, status, nextBestAction);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction getNextBestAction() {
        return this.nextBestAction;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplPlan> component2() {
        return this.plans;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getTotalRemainingBalance() {
        return this.totalRemainingBalance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview copy$default(com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplOverview bnplOverview, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.util.List list, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplStatus bnplStatus, com.paypal.oslo.feature.wallet.me.domain.bnpl.BnplNextBestAction bnplNextBestAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = bnplOverview.totalRemainingBalance;
        }
        if ((i & 2) != 0) {
            list = bnplOverview.plans;
        }
        if ((i & 4) != 0) {
            bnplStatus = bnplOverview.status;
        }
        if ((i & 8) != 0) {
            bnplNextBestAction = bnplOverview.nextBestAction;
        }
        return bnplOverview.copy(money, list, bnplStatus, bnplNextBestAction);
    }
}
