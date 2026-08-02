package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EligibilityAndBalancesResult;", "", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;", "eligibilityResult", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "accountBalancesResult", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EligibilityAndBalancesResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/GetEligibilityResult;", "getEligibilityResult", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/AccountBalancesResult;", "getAccountBalancesResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EligibilityAndBalancesResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult;
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult eligibilityResult;

    public EligibilityAndBalancesResult(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult, com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getEligibilityResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountBalancesResult, "");
        this.eligibilityResult = getEligibilityResult;
        this.accountBalancesResult = accountBalancesResult;
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult() {
        return this.eligibilityResult;
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult getAccountBalancesResult() {
        return this.accountBalancesResult;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult = this.eligibilityResult;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult = this.accountBalancesResult;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityAndBalancesResult(eligibilityResult=");
        sb.append(getEligibilityResult);
        sb.append(", accountBalancesResult=");
        sb.append(accountBalancesResult);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.eligibilityResult.hashCode() * 31) + this.accountBalancesResult.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult eligibilityAndBalancesResult = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.eligibilityResult, eligibilityAndBalancesResult.eligibilityResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountBalancesResult, eligibilityAndBalancesResult.accountBalancesResult);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult copy(com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult eligibilityResult, com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountBalancesResult, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult(eligibilityResult, accountBalancesResult);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult getAccountBalancesResult() {
        return this.accountBalancesResult;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult() {
        return this.eligibilityResult;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult eligibilityAndBalancesResult, com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult, com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            getEligibilityResult = eligibilityAndBalancesResult.eligibilityResult;
        }
        if ((i & 2) != 0) {
            accountBalancesResult = eligibilityAndBalancesResult.accountBalancesResult;
        }
        return eligibilityAndBalancesResult.copy(getEligibilityResult, accountBalancesResult);
    }
}
