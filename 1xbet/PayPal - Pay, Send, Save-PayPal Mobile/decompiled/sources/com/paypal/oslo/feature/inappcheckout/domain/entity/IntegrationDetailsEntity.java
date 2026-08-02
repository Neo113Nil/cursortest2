package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u0002;:B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJT\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J'\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "", "", "returnUrl", "cancelUrl", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;", "editStickyFiScenario", "", "hideShipping", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;", "billingType", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;Ljava/lang/Boolean;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getReturnUrl", "getCancelUrl", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;", "getEditStickyFiScenario", "Ljava/lang/Boolean;", "getHideShipping", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BillingType;", "getBillingType", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FlowEnum;", "getFlow", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class IntegrationDetailsEntity {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType;
    private final java.lang.String cancelUrl;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenario;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flow;
    private final java.lang.Boolean hideShipping;
    private final java.lang.String returnUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum", com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.values());
            return createSimpleEnumSerializer;
        }
    }), null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType", com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum", com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/IntegrationDetailsEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IntegrationDetailsEntity(int i, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum, java.lang.Boolean bool, com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType, com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity$$serializer.INSTANCE.getDescriptor());
        }
        this.returnUrl = str;
        this.cancelUrl = str2;
        this.editStickyFiScenario = editStickyFiScenarioEnum;
        this.hideShipping = bool;
        this.billingType = billingType;
        this.flow = flowEnum;
    }

    public IntegrationDetailsEntity(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum, java.lang.Boolean bool, com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType, com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editStickyFiScenarioEnum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowEnum, "");
        this.returnUrl = str;
        this.cancelUrl = str2;
        this.editStickyFiScenario = editStickyFiScenarioEnum;
        this.hideShipping = bool;
        this.billingType = billingType;
        this.flow = flowEnum;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.returnUrl);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.cancelUrl);
        output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.editStickyFiScenario);
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.hideShipping);
        output.encodeNullableSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.billingType);
        output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.flow);
    }

    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    public final java.lang.String getCancelUrl() {
        return this.cancelUrl;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum getEditStickyFiScenario() {
        return this.editStickyFiScenario;
    }

    public final java.lang.Boolean getHideShipping() {
        return this.hideShipping;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType getBillingType() {
        return this.billingType;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum getFlow() {
        return this.flow;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.returnUrl;
        java.lang.String str2 = this.cancelUrl;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum = this.editStickyFiScenario;
        java.lang.Boolean bool = this.hideShipping;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType = this.billingType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum = this.flow;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntegrationDetailsEntity(returnUrl=");
        sb.append(str);
        sb.append(", cancelUrl=");
        sb.append(str2);
        sb.append(", editStickyFiScenario=");
        sb.append(editStickyFiScenarioEnum);
        sb.append(", hideShipping=");
        sb.append(bool);
        sb.append(", billingType=");
        sb.append(billingType);
        sb.append(", flow=");
        sb.append(flowEnum);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.returnUrl;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cancelUrl;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int hashCode3 = this.editStickyFiScenario.hashCode();
        java.lang.Boolean bool = this.hideShipping;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType = this.billingType;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (billingType != null ? billingType.hashCode() : 0)) * 31) + this.flow.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, integrationDetailsEntity.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelUrl, integrationDetailsEntity.cancelUrl) && this.editStickyFiScenario == integrationDetailsEntity.editStickyFiScenario && kotlin.jvm.internal.Intrinsics.areEqual(this.hideShipping, integrationDetailsEntity.hideShipping) && this.billingType == integrationDetailsEntity.billingType && this.flow == integrationDetailsEntity.flow;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity copy(java.lang.String returnUrl, java.lang.String cancelUrl, com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenario, java.lang.Boolean hideShipping, com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType, com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editStickyFiScenario, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity(returnUrl, cancelUrl, editStickyFiScenario, hideShipping, billingType, flow);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum getFlow() {
        return this.flow;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType getBillingType() {
        return this.billingType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Boolean getHideShipping() {
        return this.hideShipping;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum getEditStickyFiScenario() {
        return this.editStickyFiScenario;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCancelUrl() {
        return this.cancelUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReturnUrl() {
        return this.returnUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.IntegrationDetailsEntity integrationDetailsEntity, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum, java.lang.Boolean bool, com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType, com.paypal.oslo.feature.inappcheckout.domain.entity.FlowEnum flowEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = integrationDetailsEntity.returnUrl;
        }
        if ((i & 2) != 0) {
            str2 = integrationDetailsEntity.cancelUrl;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            editStickyFiScenarioEnum = integrationDetailsEntity.editStickyFiScenario;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum2 = editStickyFiScenarioEnum;
        if ((i & 8) != 0) {
            bool = integrationDetailsEntity.hideShipping;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 16) != 0) {
            billingType = integrationDetailsEntity.billingType;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.BillingType billingType2 = billingType;
        if ((i & 32) != 0) {
            flowEnum = integrationDetailsEntity.flow;
        }
        return integrationDetailsEntity.copy(str, str3, editStickyFiScenarioEnum2, bool2, billingType2, flowEnum);
    }
}
