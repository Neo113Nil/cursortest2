package com.paypal.oslo.feature.wallet.api.navigation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "analyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;)Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIAnalyticsContext;", "getAnalyticsContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/AddBankConfig;", "getConfig", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddBankDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext;
    private final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig config;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddBankDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddBankDestination(int i, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.analyticsContext = addFIAnalyticsContext;
        if ((i & 2) == 0) {
            this.config = new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(true, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            this.config = addBankConfig;
        }
    }

    public AddBankDestination(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIAnalyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addBankConfig, "");
        this.analyticsContext = addFIAnalyticsContext;
        this.config = addBankConfig;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext$$serializer.INSTANCE, self.analyticsContext);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.config, new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(true, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig$$serializer.INSTANCE, self.config);
        }
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
        return this.analyticsContext;
    }

    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getConfig() {
        return this.config;
    }

    public /* synthetic */ AddBankDestination(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(addFIAnalyticsContext, (i & 2) != 0 ? new com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig(true, false, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig((com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.Progress) null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null), 2, (kotlin.jvm.internal.DefaultConstructorMarker) null) : addBankConfig);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext = this.analyticsContext;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig = this.config;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddBankDestination(analyticsContext=");
        sb.append(addFIAnalyticsContext);
        sb.append(", config=");
        sb.append(addBankConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.analyticsContext.hashCode() * 31) + this.config.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination = (com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsContext, addBankDestination.analyticsContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, addBankDestination.config);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination copy(com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext analyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination(analyticsContext, config);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig getConfig() {
        return this.config;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext getAnalyticsContext() {
        return this.analyticsContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination copy$default(com.paypal.oslo.feature.wallet.api.navigation.AddBankDestination addBankDestination, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIAnalyticsContext addFIAnalyticsContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.AddBankConfig addBankConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addFIAnalyticsContext = addBankDestination.analyticsContext;
        }
        if ((i & 2) != 0) {
            addBankConfig = addBankDestination.config;
        }
        return addBankDestination.copy(addFIAnalyticsContext, addBankConfig);
    }
}
