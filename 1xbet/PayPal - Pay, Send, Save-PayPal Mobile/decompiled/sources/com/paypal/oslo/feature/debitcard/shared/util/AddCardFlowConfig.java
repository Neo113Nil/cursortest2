package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowConfig;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "analyticsFlow", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;)Lcom/paypal/oslo/feature/debitcard/shared/util/AddCardFlowConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getAnalyticsFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddCardFlowConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow analyticsFlow;

    public AddCardFlowConfig(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        this.analyticsFlow = addFIFlow;
    }

    public /* synthetic */ AddCardFlowConfig(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.DEBIT_CARD : addFIFlow);
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAnalyticsFlow() {
        return this.analyticsFlow;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.analyticsFlow;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardFlowConfig(analyticsFlow=");
        sb.append(addFIFlow);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.analyticsFlow.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig) && this.analyticsFlow == ((com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig) other).analyticsFlow;
    }

    public final com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow analyticsFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsFlow, "");
        return new com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig(analyticsFlow);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAnalyticsFlow() {
        return this.analyticsFlow;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig copy$default(com.paypal.oslo.feature.debitcard.shared.util.AddCardFlowConfig addCardFlowConfig, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlow = addCardFlowConfig.analyticsFlow;
        }
        return addCardFlowConfig.copy(addFIFlow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddCardFlowConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
