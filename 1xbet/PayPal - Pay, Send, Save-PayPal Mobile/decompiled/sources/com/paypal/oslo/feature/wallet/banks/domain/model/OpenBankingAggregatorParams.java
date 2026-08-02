package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "productFlow", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "excludeAggregators", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/OpenBankingAggregatorParams;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getProductFlow", "Ljava/util/List;", "getExcludeAggregators"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OpenBankingAggregatorParams {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBankingAggregatorParams(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.productFlow = addFIFlow;
        this.excludeAggregators = list;
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
        return this.productFlow;
    }

    public /* synthetic */ OpenBankingAggregatorParams(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : addFIFlow, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> getExcludeAggregators() {
        return this.excludeAggregators;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> list = this.excludeAggregators;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenBankingAggregatorParams(productFlow=");
        sb.append(addFIFlow);
        sb.append(", excludeAggregators=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.productFlow;
        return ((addFIFlow == null ? 0 : addFIFlow.hashCode()) * 31) + this.excludeAggregators.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams openBankingAggregatorParams = (com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams) other;
        return this.productFlow == openBankingAggregatorParams.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.excludeAggregators, openBankingAggregatorParams.excludeAggregators);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow productFlow, java.util.List<? extends com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> excludeAggregators) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(excludeAggregators, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams(productFlow, excludeAggregators);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator> component2() {
        return this.excludeAggregators;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getProductFlow() {
        return this.productFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.OpenBankingAggregatorParams openBankingAggregatorParams, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlow = openBankingAggregatorParams.productFlow;
        }
        if ((i & 2) != 0) {
            list = openBankingAggregatorParams.excludeAggregators;
        }
        return openBankingAggregatorParams.copy(addFIFlow, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenBankingAggregatorParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
