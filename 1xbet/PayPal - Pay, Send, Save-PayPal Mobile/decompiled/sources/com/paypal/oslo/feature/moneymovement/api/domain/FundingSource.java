package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;", "type", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "amount", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "instrument", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component3", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;)Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;", "getType", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getAmount", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "getInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FundingSource {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount;
    private final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument;
    private final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType type;

    public FundingSource(com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrument, "");
        this.type = fundingSourceType;
        this.amount = moneyAmount;
        this.instrument = financialInstrument;
    }

    public /* synthetic */ FundingSource(com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fundingSourceType, (i & 2) != 0 ? null : moneyAmount, financialInstrument);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument getInstrument() {
        return this.instrument;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType = this.type;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.amount;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument = this.instrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(type=");
        sb.append(fundingSourceType);
        sb.append(", amount=");
        sb.append(moneyAmount);
        sb.append(", instrument=");
        sb.append(financialInstrument);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.amount;
        return (((hashCode * 31) + (moneyAmount == null ? 0 : moneyAmount.hashCode())) * 31) + this.instrument.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.FundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource = (com.paypal.oslo.feature.moneymovement.api.domain.FundingSource) other;
        return this.type == fundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fundingSource.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, fundingSource.instrument);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FundingSource copy(com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType type, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount amount, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.FundingSource(type, amount, instrument);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.FundingSource copy$default(com.paypal.oslo.feature.moneymovement.api.domain.FundingSource fundingSource, com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingSourceType = fundingSource.type;
        }
        if ((i & 2) != 0) {
            moneyAmount = fundingSource.amount;
        }
        if ((i & 4) != 0) {
            financialInstrument = fundingSource.instrument;
        }
        return fundingSource.copy(fundingSourceType, moneyAmount, financialInstrument);
    }
}
