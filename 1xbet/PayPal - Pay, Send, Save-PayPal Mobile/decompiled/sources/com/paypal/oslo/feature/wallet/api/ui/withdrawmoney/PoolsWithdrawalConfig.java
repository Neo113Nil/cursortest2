package com.paypal.oslo.feature.wallet.api.ui.withdrawmoney;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/withdrawmoney/PoolsWithdrawalConfig;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "flowContext", "", "metadataId", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/withdrawmoney/PoolsWithdrawalConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/withdrawmoney/PoolsWithdrawalConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "getFlowContext", "Ljava/lang/String;", "getMetadataId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PoolsWithdrawalConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow flowContext;
    private final java.lang.String metadataId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/withdrawmoney/PoolsWithdrawalConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/withdrawmoney/PoolsWithdrawalConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig> serializer() {
            return com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PoolsWithdrawalConfig(int i, com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.flowContext = transferFlow;
        this.metadataId = str;
    }

    public PoolsWithdrawalConfig(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.flowContext = transferFlow;
        this.metadataId = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.flowContext);
        output.encodeStringElement(serialDesc, 1, self.metadataId);
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow getFlowContext() {
        return this.flowContext;
    }

    public final java.lang.String getMetadataId() {
        return this.metadataId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow = this.flowContext;
        java.lang.String str = this.metadataId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PoolsWithdrawalConfig(flowContext=");
        sb.append(transferFlow);
        sb.append(", metadataId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowContext.hashCode() * 31) + this.metadataId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig poolsWithdrawalConfig = (com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig) other;
        return this.flowContext == poolsWithdrawalConfig.flowContext && kotlin.jvm.internal.Intrinsics.areEqual(this.metadataId, poolsWithdrawalConfig.metadataId);
    }

    public final com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig copy(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow flowContext, java.lang.String metadataId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataId, "");
        return new com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig(flowContext, metadataId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMetadataId() {
        return this.metadataId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow getFlowContext() {
        return this.flowContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig copy$default(com.paypal.oslo.feature.wallet.api.ui.withdrawmoney.PoolsWithdrawalConfig poolsWithdrawalConfig, com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferFlow = poolsWithdrawalConfig.flowContext;
        }
        if ((i & 2) != 0) {
            str = poolsWithdrawalConfig.metadataId;
        }
        return poolsWithdrawalConfig.copy(transferFlow, str);
    }
}
