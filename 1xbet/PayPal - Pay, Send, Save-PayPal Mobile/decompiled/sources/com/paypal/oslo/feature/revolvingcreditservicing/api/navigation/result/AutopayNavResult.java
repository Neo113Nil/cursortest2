package com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "action", "", "effectiveInCurrentBillingCycle", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayNavResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_api_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayAction;", "getAction", "Ljava/lang/Boolean;", "getEffectiveInCurrentBillingCycle", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AutopayNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction action;
    private final java.lang.Boolean effectiveInCurrentBillingCycle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/navigation/result/AutopayNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AutopayNavResult(int i, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.action = autopayAction;
        if ((i & 2) == 0) {
            this.effectiveInCurrentBillingCycle = null;
        } else {
            this.effectiveInCurrentBillingCycle = bool;
        }
    }

    public AutopayNavResult(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autopayAction, "");
        this.action = autopayAction;
        this.effectiveInCurrentBillingCycle = bool;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_api_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.action);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.effectiveInCurrentBillingCycle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.effectiveInCurrentBillingCycle);
        }
    }

    public /* synthetic */ AutopayNavResult(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(autopayAction, (i & 2) != 0 ? null : bool);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction getAction() {
        return this.action;
    }

    public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
        return this.effectiveInCurrentBillingCycle;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction = this.action;
        java.lang.Boolean bool = this.effectiveInCurrentBillingCycle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutopayNavResult(action=");
        sb.append(autopayAction);
        sb.append(", effectiveInCurrentBillingCycle=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        java.lang.Boolean bool = this.effectiveInCurrentBillingCycle;
        return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult autopayNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult) other;
        return this.action == autopayNavResult.action && kotlin.jvm.internal.Intrinsics.areEqual(this.effectiveInCurrentBillingCycle, autopayNavResult.effectiveInCurrentBillingCycle);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult copy(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction action, java.lang.Boolean effectiveInCurrentBillingCycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult(action, effectiveInCurrentBillingCycle);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getEffectiveInCurrentBillingCycle() {
        return this.effectiveInCurrentBillingCycle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction getAction() {
        return this.action;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult copy$default(com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayNavResult autopayNavResult, com.paypal.oslo.feature.revolvingcreditservicing.api.navigation.result.AutopayAction autopayAction, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            autopayAction = autopayNavResult.action;
        }
        if ((i & 2) != 0) {
            bool = autopayNavResult.effectiveInCurrentBillingCycle;
        }
        return autopayNavResult.copy(autopayAction, bool);
    }
}
