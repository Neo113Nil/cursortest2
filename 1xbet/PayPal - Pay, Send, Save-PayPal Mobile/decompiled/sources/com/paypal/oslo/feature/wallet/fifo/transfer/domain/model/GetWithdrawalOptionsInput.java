package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSource;", "source", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalAmount;", "amount", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSource;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalAmount;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSource;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalAmount;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSource;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalAmount;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalSource;", "getSource", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalAmount;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetWithdrawalOptionsInput {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount amount;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource source;

    public GetWithdrawalOptionsInput(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource withdrawalSource, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount withdrawalAmount) {
        this.source = withdrawalSource;
        this.amount = withdrawalAmount;
    }

    public /* synthetic */ GetWithdrawalOptionsInput(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource withdrawalSource, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount withdrawalAmount, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : withdrawalSource, (i & 2) != 0 ? null : withdrawalAmount);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource getSource() {
        return this.source;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource withdrawalSource = this.source;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount withdrawalAmount = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetWithdrawalOptionsInput(source=");
        sb.append(withdrawalSource);
        sb.append(", amount=");
        sb.append(withdrawalAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource withdrawalSource = this.source;
        int hashCode = withdrawalSource == null ? 0 : withdrawalSource.hashCode();
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount withdrawalAmount = this.amount;
        return (hashCode * 31) + (withdrawalAmount != null ? withdrawalAmount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput getWithdrawalOptionsInput = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, getWithdrawalOptionsInput.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, getWithdrawalOptionsInput.amount);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput copy(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource source, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount amount) {
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput(source, amount);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsInput getWithdrawalOptionsInput, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalSource withdrawalSource, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalAmount withdrawalAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            withdrawalSource = getWithdrawalOptionsInput.source;
        }
        if ((i & 2) != 0) {
            withdrawalAmount = getWithdrawalOptionsInput.amount;
        }
        return getWithdrawalOptionsInput.copy(withdrawalSource, withdrawalAmount);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetWithdrawalOptionsInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
