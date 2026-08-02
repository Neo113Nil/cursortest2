package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FundingSource;", "", "", "type", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amount", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;", "instrument", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component3", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmount", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalFundingInstrument;", "getInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingSource {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money amount;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument instrument;
    private final java.lang.String type;

    public FundingSource(java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument withdrawalFundingInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalFundingInstrument, "");
        this.type = str;
        this.amount = money;
        this.instrument = withdrawalFundingInstrument;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument getInstrument() {
        return this.instrument;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amount;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument withdrawalFundingInstrument = this.instrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(type=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", instrument=");
        sb.append(withdrawalFundingInstrument);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.amount.hashCode()) * 31) + this.instrument.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource fundingSource = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, fundingSource.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fundingSource.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, fundingSource.instrument);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource copy(java.lang.String type, com.paypal.oslo.feature.wallet.common.domain.model.Money amount, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument instrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource(type, amount, instrument);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.FundingSource fundingSource, java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalFundingInstrument withdrawalFundingInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingSource.type;
        }
        if ((i & 2) != 0) {
            money = fundingSource.amount;
        }
        if ((i & 4) != 0) {
            withdrawalFundingInstrument = fundingSource.instrument;
        }
        return fundingSource.copy(str, money, withdrawalFundingInstrument);
    }
}
