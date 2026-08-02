package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AvailableBalance;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AvailableBalance;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AvailableBalance;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AvailableBalance;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/AvailableBalance;", "getAvailable"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class WithdrawalFundingInstrument {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance available;
    private final java.lang.String id;

    public WithdrawalFundingInstrument(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance availableBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.available = availableBalance;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance getAvailable() {
        return this.available;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance availableBalance = this.available;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawalFundingInstrument(id=");
        sb.append(str);
        sb.append(", available=");
        sb.append(availableBalance);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance availableBalance = this.available;
        return (hashCode * 31) + (availableBalance == null ? 0 : availableBalance.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument withdrawalFundingInstrument = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, withdrawalFundingInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.available, withdrawalFundingInstrument.available);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument copy(java.lang.String id, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance available) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument(id, available);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance getAvailable() {
        return this.available;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument withdrawalFundingInstrument, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.AvailableBalance availableBalance, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = withdrawalFundingInstrument.id;
        }
        if ((i & 2) != 0) {
            availableBalance = withdrawalFundingInstrument.available;
        }
        return withdrawalFundingInstrument.copy(str, availableBalance);
    }
}
