package com.paypal.oslo.feature.wallet.api.ui.addmoney;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b3\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "", "Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "flowContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;", "topBarConfig", "", "showPostAddMoneyFlow", "showIACHBanks", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "addFIFlowType", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;ZZLcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;ZZLcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;", "component3", "()Z", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;ZZLcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;)Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/analytics/fifo/TransferFlow;", "getFlowContext", "Lcom/paypal/oslo/feature/wallet/api/ui/banks/config/TopBarConfig;", "getTopBarConfig", "Z", "getShowPostAddMoneyFlow", "getShowIACHBanks", "Lcom/paypal/oslo/feature/wallet/api/domain/model/AddFIFlowType;", "getAddFIFlowType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddMoneyConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType;
    private final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow flowContext;
    private final boolean showIACHBanks;
    private final boolean showPostAddMoneyFlow;
    private final com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/ui/addmoney/AddMoneyConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig> serializer() {
            return com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddMoneyConfig(int i, com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.flowContext = transferFlow;
        this.topBarConfig = (i & 2) == 0 ? new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig(null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, null) : topBarConfig;
        if ((i & 4) == 0) {
            this.showPostAddMoneyFlow = true;
        } else {
            this.showPostAddMoneyFlow = z;
        }
        if ((i & 8) == 0) {
            this.showIACHBanks = true;
        } else {
            this.showIACHBanks = z2;
        }
        if ((i & 16) == 0) {
            this.addFIFlowType = com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI;
        } else {
            this.addFIFlowType = addFIFlowType;
        }
    }

    public AddMoneyConfig(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
        this.flowContext = transferFlow;
        this.topBarConfig = topBarConfig;
        this.showPostAddMoneyFlow = z;
        this.showIACHBanks = z2;
        this.addFIFlowType = addFIFlowType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.flowContext);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.topBarConfig, new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig(null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, null))) {
            output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig$$serializer.INSTANCE, self.topBarConfig);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.showPostAddMoneyFlow) {
            output.encodeBooleanElement(serialDesc, 2, self.showPostAddMoneyFlow);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !self.showIACHBanks) {
            output.encodeBooleanElement(serialDesc, 3, self.showIACHBanks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.addFIFlowType != com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI) {
            output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.addFIFlowType);
        }
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow getFlowContext() {
        return this.flowContext;
    }

    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig getTopBarConfig() {
        return this.topBarConfig;
    }

    public /* synthetic */ AddMoneyConfig(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transferFlow, (i & 2) != 0 ? new com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig(null, com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction.BACK, null) : topBarConfig, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType.ADD_FI : addFIFlowType);
    }

    public final boolean getShowPostAddMoneyFlow() {
        return this.showPostAddMoneyFlow;
    }

    public final boolean getShowIACHBanks() {
        return this.showIACHBanks;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType getAddFIFlowType() {
        return this.addFIFlowType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow = this.flowContext;
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig = this.topBarConfig;
        boolean z = this.showPostAddMoneyFlow;
        boolean z2 = this.showIACHBanks;
        com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType = this.addFIFlowType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddMoneyConfig(flowContext=");
        sb.append(transferFlow);
        sb.append(", topBarConfig=");
        sb.append(topBarConfig);
        sb.append(", showPostAddMoneyFlow=");
        sb.append(z);
        sb.append(", showIACHBanks=");
        sb.append(z2);
        sb.append(", addFIFlowType=");
        sb.append(addFIFlowType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.flowContext.hashCode() * 31) + this.topBarConfig.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showPostAddMoneyFlow)) * 31) + java.lang.Boolean.hashCode(this.showIACHBanks)) * 31) + this.addFIFlowType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = (com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig) other;
        return this.flowContext == addMoneyConfig.flowContext && kotlin.jvm.internal.Intrinsics.areEqual(this.topBarConfig, addMoneyConfig.topBarConfig) && this.showPostAddMoneyFlow == addMoneyConfig.showPostAddMoneyFlow && this.showIACHBanks == addMoneyConfig.showIACHBanks && this.addFIFlowType == addMoneyConfig.addFIFlowType;
    }

    public final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig copy(com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow flowContext, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig, boolean showPostAddMoneyFlow, boolean showIACHBanks, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlowType, "");
        return new com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig(flowContext, topBarConfig, showPostAddMoneyFlow, showIACHBanks, addFIFlowType);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType getAddFIFlowType() {
        return this.addFIFlowType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowIACHBanks() {
        return this.showIACHBanks;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowPostAddMoneyFlow() {
        return this.showPostAddMoneyFlow;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig getTopBarConfig() {
        return this.topBarConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow getFlowContext() {
        return this.flowContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig copy$default(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.api.analytics.fifo.TransferFlow transferFlow, com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig, boolean z, boolean z2, com.paypal.oslo.feature.wallet.api.domain.model.AddFIFlowType addFIFlowType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transferFlow = addMoneyConfig.flowContext;
        }
        if ((i & 2) != 0) {
            topBarConfig = addMoneyConfig.topBarConfig;
        }
        com.paypal.oslo.feature.wallet.api.ui.banks.config.TopBarConfig topBarConfig2 = topBarConfig;
        if ((i & 4) != 0) {
            z = addMoneyConfig.showPostAddMoneyFlow;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = addMoneyConfig.showIACHBanks;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            addFIFlowType = addMoneyConfig.addFIFlowType;
        }
        return addMoneyConfig.copy(transferFlow, topBarConfig2, z3, z4, addFIFlowType);
    }
}
