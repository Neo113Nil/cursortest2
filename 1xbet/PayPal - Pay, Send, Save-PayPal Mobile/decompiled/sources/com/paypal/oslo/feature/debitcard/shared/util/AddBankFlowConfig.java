package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowConfig;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "analyticsFlow", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "addBankConfig", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;)Lcom/paypal/oslo/feature/debitcard/shared/util/AddBankFlowConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getAnalyticsFlow", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "getAddBankConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddBankFlowConfig {
    public static final int $stable = com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig.$stable;
    private final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow analyticsFlow;

    public AddBankFlowConfig(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
        this.analyticsFlow = addFIFlow;
        this.addBankConfig = addBankConfig;
    }

    public /* synthetic */ AddBankFlowConfig(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.DEBIT_CARD : addFIFlow, (i & 2) != 0 ? new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(false, false, (com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : addBankConfig);
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAnalyticsFlow() {
        return this.analyticsFlow;
    }

    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getAddBankConfig() {
        return this.addBankConfig;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.analyticsFlow;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig = this.addBankConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankFlowConfig(analyticsFlow=");
        sb.append(addFIFlow);
        sb.append(", addBankConfig=");
        sb.append(addBankConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.analyticsFlow.hashCode() * 31) + this.addBankConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig addBankFlowConfig = (com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig) other;
        return this.analyticsFlow == addBankFlowConfig.analyticsFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.addBankConfig, addBankFlowConfig.addBankConfig);
    }

    public final com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow analyticsFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
        return new com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig(analyticsFlow, addBankConfig);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getAddBankConfig() {
        return this.addBankConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAnalyticsFlow() {
        return this.analyticsFlow;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig copy$default(com.paypal.oslo.feature.debitcard.shared.util.AddBankFlowConfig addBankFlowConfig, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIFlow = addBankFlowConfig.analyticsFlow;
        }
        if ((i & 2) != 0) {
            addBankConfig = addBankFlowConfig.addBankConfig;
        }
        return addBankFlowConfig.copy(addFIFlow, addBankConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddBankFlowConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
