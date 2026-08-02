package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorResult;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "operationMode", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component2", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorOperationMode;", "getOperationMode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OpenBankingAggregatorResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode operationMode;

    public OpenBankingAggregatorResult(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openBankingAggregatorOperationMode, "");
        this.aggregator = bankAggregator;
        this.operationMode = openBankingAggregatorOperationMode;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode getOperationMode() {
        return this.operationMode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = this.aggregator;
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode = this.operationMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingAggregatorResult(aggregator=");
        sb.append(bankAggregator);
        sb.append(", operationMode=");
        sb.append(openBankingAggregatorOperationMode);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.aggregator.hashCode() * 31) + this.operationMode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult openBankingAggregatorResult = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult) other;
        return this.aggregator == openBankingAggregatorResult.aggregator && this.operationMode == openBankingAggregatorResult.operationMode;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult copy(com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode operationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationMode, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult(aggregator, operationMode);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode getOperationMode() {
        return this.operationMode;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorResult openBankingAggregatorResult, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorOperationMode openBankingAggregatorOperationMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bankAggregator = openBankingAggregatorResult.aggregator;
        }
        if ((i & 2) != 0) {
            openBankingAggregatorOperationMode = openBankingAggregatorResult.operationMode;
        }
        return openBankingAggregatorResult.copy(bankAggregator, openBankingAggregatorOperationMode);
    }
}
