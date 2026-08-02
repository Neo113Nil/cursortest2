package com.paypal.oslo.feature.wallet.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002%$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddMoneyDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/AddMoneyFlow;", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "addMoneyConfig", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;)Lcom/paypal/oslo/feature/wallet/api/navigation/AddMoneyDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddMoneyDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "getAddMoneyConfig", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddMoneyDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyFlow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination.Companion(null);
    private final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddMoneyDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddMoneyDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddMoneyDestination(int i, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.addMoneyConfig = addMoneyConfig;
    }

    public AddMoneyDestination(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
        this.addMoneyConfig = addMoneyConfig;
    }

    public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
        return this.addMoneyConfig;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = this.addMoneyConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneyDestination(addMoneyConfig=");
        sb.append(addMoneyConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.addMoneyConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.addMoneyConfig, ((com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination) other).addMoneyConfig);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination copy(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addMoneyConfig, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination(addMoneyConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getAddMoneyConfig() {
        return this.addMoneyConfig;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination copy$default(com.paypal.oslo.feature.wallet.api.navigation.AddMoneyDestination addMoneyDestination, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addMoneyConfig = addMoneyDestination.addMoneyConfig;
        }
        return addMoneyDestination.copy(addMoneyConfig);
    }
}
