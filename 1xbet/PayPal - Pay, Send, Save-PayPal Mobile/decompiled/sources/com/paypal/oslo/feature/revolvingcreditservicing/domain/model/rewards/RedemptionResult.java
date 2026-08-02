package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "redeemedAmount", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionStatus;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getRedeemedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RedemptionResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount redeemedAmount;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus status;

    public RedemptionResult(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus redemptionStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        this.status = redemptionStatus;
        this.redeemedAmount = currencyAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getRedeemedAmount() {
        return this.redeemedAmount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus redemptionStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.redeemedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedemptionResult(status=");
        sb.append(redemptionStatus);
        sb.append(", redeemedAmount=");
        sb.append(currencyAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.status.hashCode() * 31) + this.redeemedAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult redemptionResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult) other;
        return this.status == redemptionResult.status && kotlin.jvm.internal.Intrinsics.areEqual(this.redeemedAmount, redemptionResult.redeemedAmount);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus status, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount redeemedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemedAmount, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult(status, redeemedAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getRedeemedAmount() {
        return this.redeemedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult redemptionResult, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus redemptionStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            redemptionStatus = redemptionResult.status;
        }
        if ((i & 2) != 0) {
            currencyAmount = redemptionResult.redeemedAmount;
        }
        return redemptionResult.copy(redemptionStatus, currencyAmount);
    }
}
