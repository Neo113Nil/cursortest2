package com.paypal.oslo.feature.subscriptions.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002)(B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/navigation/BulkUpdateFiDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/api/navigation/BulkUpdateFiDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$subscriptions_api_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/api/navigation/BulkUpdateFiDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getFlowType", "getSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BulkUpdateFiDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination.Companion INSTANCE = new com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination.Companion(null);
    private final java.lang.String flowType;
    private final java.lang.String source;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/api/navigation/BulkUpdateFiDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/subscriptions/api/navigation/BulkUpdateFiDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination> serializer() {
            return com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BulkUpdateFiDestination(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.flowType = str;
        if ((i & 2) == 0) {
            this.source = null;
        } else {
            this.source = str2;
        }
    }

    public BulkUpdateFiDestination(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.flowType = str;
        this.source = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$subscriptions_api_prodRelease(com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.flowType);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.source != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.source);
        }
    }

    public /* synthetic */ BulkUpdateFiDestination(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getFlowType() {
        return this.flowType;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementTypeFromRawFlowType = com.paypal.oslo.feature.subscriptions.api.navigation.FlowType.INSTANCE.agreementTypeFromRawFlowType(this.flowType);
        com.paypal.oslo.feature.subscriptions.api.analytics.ScreenNameAndAction bulkFiScreenNameWithAction = com.paypal.oslo.feature.subscriptions.api.analytics.AnalyticsScreenNames.INSTANCE.bulkFiScreenNameWithAction(agreementTypeFromRawFlowType);
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(bulkFiScreenNameWithAction.getScreenName(), new com.paypal.oslo.feature.subscriptions.api.analytics.SubscriptionsUserIntentContext.BulkFi(bulkFiScreenNameWithAction.getScreenName(), agreementTypeFromRawFlowType).withAction(bulkFiScreenNameWithAction.getInitialScreenAction()), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.flowType;
        java.lang.String str2 = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BulkUpdateFiDestination(flowType=");
        sb.append(str);
        sb.append(", source=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.flowType.hashCode();
        java.lang.String str = this.source;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination bulkUpdateFiDestination = (com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowType, bulkUpdateFiDestination.flowType) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, bulkUpdateFiDestination.source);
    }

    public final com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination copy(java.lang.String flowType, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
        return new com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination(flowType, source);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFlowType() {
        return this.flowType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination copy$default(com.paypal.oslo.feature.subscriptions.api.navigation.BulkUpdateFiDestination bulkUpdateFiDestination, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bulkUpdateFiDestination.flowType;
        }
        if ((i & 2) != 0) {
            str2 = bulkUpdateFiDestination.source;
        }
        return bulkUpdateFiDestination.copy(str, str2);
    }
}
