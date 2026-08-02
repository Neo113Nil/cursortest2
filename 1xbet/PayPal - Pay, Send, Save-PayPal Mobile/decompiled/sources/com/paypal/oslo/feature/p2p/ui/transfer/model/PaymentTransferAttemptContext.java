package com.paypal.oslo.feature.p2p.ui.transfer.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/model/PaymentTransferAttemptContext;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;", "transferAttempt", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "transferFlowConfig", "", "cryptoPickerEnabled", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;Z)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "component3", "()Z", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;Z)Lcom/paypal/oslo/feature/p2p/ui/transfer/model/PaymentTransferAttemptContext;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/StartPaymentTransferAttempt;", "getTransferAttempt", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "getTransferFlowConfig", "Z", "getCryptoPickerEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentTransferAttemptContext {
    public static final int $stable = 8;
    private final boolean cryptoPickerEnabled;
    private final com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt transferAttempt;
    private final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration transferFlowConfig;

    public PaymentTransferAttemptContext(com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt startPaymentTransferAttempt, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startPaymentTransferAttempt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferFlowConfiguration, "");
        this.transferAttempt = startPaymentTransferAttempt;
        this.transferFlowConfig = paymentTransferFlowConfiguration;
        this.cryptoPickerEnabled = z;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt getTransferAttempt() {
        return this.transferAttempt;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration getTransferFlowConfig() {
        return this.transferFlowConfig;
    }

    public final boolean getCryptoPickerEnabled() {
        return this.cryptoPickerEnabled;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt startPaymentTransferAttempt = this.transferAttempt;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = this.transferFlowConfig;
        boolean z = this.cryptoPickerEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferAttemptContext(transferAttempt=");
        sb.append(startPaymentTransferAttempt);
        sb.append(", transferFlowConfig=");
        sb.append(paymentTransferFlowConfiguration);
        sb.append(", cryptoPickerEnabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transferAttempt.hashCode() * 31) + this.transferFlowConfig.hashCode()) * 31) + java.lang.Boolean.hashCode(this.cryptoPickerEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext paymentTransferAttemptContext = (com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transferAttempt, paymentTransferAttemptContext.transferAttempt) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferFlowConfig, paymentTransferAttemptContext.transferFlowConfig) && this.cryptoPickerEnabled == paymentTransferAttemptContext.cryptoPickerEnabled;
    }

    public final com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext copy(com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt transferAttempt, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration transferFlowConfig, boolean cryptoPickerEnabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferAttempt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowConfig, "");
        return new com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext(transferAttempt, transferFlowConfig, cryptoPickerEnabled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCryptoPickerEnabled() {
        return this.cryptoPickerEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration getTransferFlowConfig() {
        return this.transferFlowConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt getTransferAttempt() {
        return this.transferAttempt;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext copy$default(com.paypal.oslo.feature.p2p.ui.transfer.model.PaymentTransferAttemptContext paymentTransferAttemptContext, com.paypal.oslo.feature.p2p.domain.model.StartPaymentTransferAttempt startPaymentTransferAttempt, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            startPaymentTransferAttempt = paymentTransferAttemptContext.transferAttempt;
        }
        if ((i & 2) != 0) {
            paymentTransferFlowConfiguration = paymentTransferAttemptContext.transferFlowConfig;
        }
        if ((i & 4) != 0) {
            z = paymentTransferAttemptContext.cryptoPickerEnabled;
        }
        return paymentTransferAttemptContext.copy(startPaymentTransferAttempt, paymentTransferFlowConfiguration, z);
    }
}
