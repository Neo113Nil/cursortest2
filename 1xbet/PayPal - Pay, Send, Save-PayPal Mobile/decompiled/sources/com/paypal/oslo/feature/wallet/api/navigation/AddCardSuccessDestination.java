package com.paypal.oslo.feature.wallet.api.navigation;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardSuccessDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "flowOptions", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "addCardResult", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "component2", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;)Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardSuccessDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardSuccessDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/ui/cards/add/config/AddCardFlow$Options;", "getFlowOptions", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "getAddCardResult", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddCardSuccessDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardResult;
    private final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options flowOptions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination.Companion(null);
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardSuccessDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/AddCardSuccessDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddCardSuccessDestination(int i, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.flowOptions = (i & 1) == 0 ? new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : options;
        this.addCardResult = addCardFlowNavResult;
    }

    public AddCardSuccessDestination(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardFlowNavResult, "");
        this.flowOptions = options;
        this.addCardResult = addCardFlowNavResult;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.flowOptions, new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow$Options$$serializer.INSTANCE, self.flowOptions);
        }
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$$serializer.INSTANCE, self.addCardResult);
    }

    public /* synthetic */ AddCardSuccessDestination(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options(false, false, (com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.InitScreen) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : options, addCardFlowNavResult);
    }

    public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getFlowOptions() {
        return this.flowOptions;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getAddCardResult() {
        return this.addCardResult;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options = this.flowOptions;
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = this.addCardResult;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardSuccessDestination(flowOptions=");
        sb.append(options);
        sb.append(", addCardResult=");
        sb.append(addCardFlowNavResult);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flowOptions.hashCode() * 31) + this.addCardResult.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination addCardSuccessDestination = (com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowOptions, addCardSuccessDestination.flowOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.addCardResult, addCardSuccessDestination.addCardResult);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination copy(com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options flowOptions, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addCardResult, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination(flowOptions, addCardResult);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult getAddCardResult() {
        return this.addCardResult;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options getFlowOptions() {
        return this.flowOptions;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination copy$default(com.paypal.oslo.feature.wallet.api.navigation.AddCardSuccessDestination addCardSuccessDestination, com.paypal.oslo.feature.wallet.api.ui.cards.add.config.AddCardFlow.Options options, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            options = addCardSuccessDestination.flowOptions;
        }
        if ((i & 2) != 0) {
            addCardFlowNavResult = addCardSuccessDestination.addCardResult;
        }
        return addCardSuccessDestination.copy(options, addCardFlowNavResult);
    }
}
