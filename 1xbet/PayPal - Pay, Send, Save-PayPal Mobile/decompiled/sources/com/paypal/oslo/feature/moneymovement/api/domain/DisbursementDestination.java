package com.paypal.oslo.feature.moneymovement.api.domain;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;", "type", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "instrument", "<init>", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;)V", "component1", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;", "component2", "()Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "copy", "(Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;)Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestination;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;", "getType", "Lcom/paypal/oslo/feature/moneymovement/api/domain/FinancialInstrument;", "getInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DisbursementDestination {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument;
    private final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType type;

    public DisbursementDestination(com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disbursementDestinationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrument, "");
        this.type = disbursementDestinationType;
        this.instrument = financialInstrument;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument getInstrument() {
        return this.instrument;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType = this.type;
        com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument = this.instrument;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DisbursementDestination(type=");
        sb.append(disbursementDestinationType);
        sb.append(", instrument=");
        sb.append(financialInstrument);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.instrument.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination = (com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination) other;
        return this.type == disbursementDestination.type && kotlin.jvm.internal.Intrinsics.areEqual(this.instrument, disbursementDestination.instrument);
    }

    public final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination copy(com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType type, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument instrument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrument, "");
        return new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination(type, instrument);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument getInstrument() {
        return this.instrument;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination copy$default(com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestination disbursementDestination, com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType, com.paypal.oslo.feature.moneymovement.api.domain.FinancialInstrument financialInstrument, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            disbursementDestinationType = disbursementDestination.type;
        }
        if ((i & 2) != 0) {
            financialInstrument = disbursementDestination.instrument;
        }
        return disbursementDestination.copy(disbursementDestinationType, financialInstrument);
    }
}
