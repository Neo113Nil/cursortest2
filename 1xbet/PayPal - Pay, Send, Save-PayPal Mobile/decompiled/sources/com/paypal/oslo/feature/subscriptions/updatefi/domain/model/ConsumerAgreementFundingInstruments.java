package com.paypal.oslo.feature.subscriptions.updatefi.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "", "", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "fundingInstruments", "preferredFundingInstrument", "balanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "component3", "component4", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;)Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingInstruments", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrument;", "getPreferredFundingInstrument", "getBalanceFundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "getBalancePreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConsumerAgreementFundingInstruments {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> fundingInstruments;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument;

    public ConsumerAgreementFundingInstruments(java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        this.fundingInstruments = list;
        this.preferredFundingInstrument = fundingInstrument;
        this.balanceFundingInstrument = fundingInstrument2;
        this.balancePreference = balancePreference;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> getFundingInstruments() {
        return this.fundingInstruments;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> list = this.fundingInstruments;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference = this.balancePreference;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConsumerAgreementFundingInstruments(fundingInstruments=");
        sb.append(list);
        sb.append(", preferredFundingInstrument=");
        sb.append(fundingInstrument);
        sb.append(", balanceFundingInstrument=");
        sb.append(fundingInstrument2);
        sb.append(", balancePreference=");
        sb.append(balancePreference);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fundingInstruments.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument = this.preferredFundingInstrument;
        int hashCode2 = fundingInstrument == null ? 0 : fundingInstrument.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2 = this.balanceFundingInstrument;
        return (((((hashCode * 31) + hashCode2) * 31) + (fundingInstrument2 != null ? fundingInstrument2.hashCode() : 0)) * 31) + this.balancePreference.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstruments, consumerAgreementFundingInstruments.fundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredFundingInstrument, consumerAgreementFundingInstruments.preferredFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceFundingInstrument, consumerAgreementFundingInstruments.balanceFundingInstrument) && this.balancePreference == consumerAgreementFundingInstruments.balancePreference;
    }

    public final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments copy(java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> fundingInstruments, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument preferredFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument balanceFundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balancePreference, "");
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments(fundingInstruments, preferredFundingInstrument, balanceFundingInstrument, balancePreference);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference getBalancePreference() {
        return this.balancePreference;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getBalanceFundingInstrument() {
        return this.balanceFundingInstrument;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument getPreferredFundingInstrument() {
        return this.preferredFundingInstrument;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument> component1() {
        return this.fundingInstruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments copy$default(com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments, java.util.List list, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrument fundingInstrument2, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = consumerAgreementFundingInstruments.fundingInstruments;
        }
        if ((i & 2) != 0) {
            fundingInstrument = consumerAgreementFundingInstruments.preferredFundingInstrument;
        }
        if ((i & 4) != 0) {
            fundingInstrument2 = consumerAgreementFundingInstruments.balanceFundingInstrument;
        }
        if ((i & 8) != 0) {
            balancePreference = consumerAgreementFundingInstruments.balancePreference;
        }
        return consumerAgreementFundingInstruments.copy(list, fundingInstrument, fundingInstrument2, balancePreference);
    }
}
