package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "", "", "primaryCurrencyCode", "", "cryptoCurrencyEnabled", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SUPPORTED_INTENTS, "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferFlowConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrimaryCurrencyCode", "Z", "getCryptoCurrencyEnabled", "Ljava/util/List;", "getSupportedIntents"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaymentTransferFlowConfiguration {
    public static final int $stable = 8;
    private final boolean cryptoCurrencyEnabled;
    private final java.lang.String primaryCurrencyCode;
    private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> supportedIntents;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentTransferFlowConfiguration(java.lang.String str, boolean z, java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.primaryCurrencyCode = str;
        this.cryptoCurrencyEnabled = z;
        this.supportedIntents = list;
    }

    public final java.lang.String getPrimaryCurrencyCode() {
        return this.primaryCurrencyCode;
    }

    public final boolean getCryptoCurrencyEnabled() {
        return this.cryptoCurrencyEnabled;
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> getSupportedIntents() {
        return this.supportedIntents;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.primaryCurrencyCode;
        boolean z = this.cryptoCurrencyEnabled;
        java.util.List<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> list = this.supportedIntents;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentTransferFlowConfiguration(primaryCurrencyCode=");
        sb.append(str);
        sb.append(", cryptoCurrencyEnabled=");
        sb.append(z);
        sb.append(", supportedIntents=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.primaryCurrencyCode.hashCode() * 31) + java.lang.Boolean.hashCode(this.cryptoCurrencyEnabled)) * 31) + this.supportedIntents.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration = (com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCurrencyCode, paymentTransferFlowConfiguration.primaryCurrencyCode) && this.cryptoCurrencyEnabled == paymentTransferFlowConfiguration.cryptoCurrencyEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.supportedIntents, paymentTransferFlowConfiguration.supportedIntents);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration copy(java.lang.String primaryCurrencyCode, boolean cryptoCurrencyEnabled, java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> supportedIntents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedIntents, "");
        return new com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration(primaryCurrencyCode, cryptoCurrencyEnabled, supportedIntents);
    }

    public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent> component3() {
        return this.supportedIntents;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getCryptoCurrencyEnabled() {
        return this.cryptoCurrencyEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPrimaryCurrencyCode() {
        return this.primaryCurrencyCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferFlowConfiguration paymentTransferFlowConfiguration, java.lang.String str, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = paymentTransferFlowConfiguration.primaryCurrencyCode;
        }
        if ((i & 2) != 0) {
            z = paymentTransferFlowConfiguration.cryptoCurrencyEnabled;
        }
        if ((i & 4) != 0) {
            list = paymentTransferFlowConfiguration.supportedIntents;
        }
        return paymentTransferFlowConfiguration.copy(str, z, list);
    }
}
