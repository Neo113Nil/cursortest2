package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionUsability;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;", "status", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingDisallowedReason;", "disallowedReasons", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionUsability;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionUsability;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;", "getStatus", "Ljava/util/List;", "getDisallowedReasons", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingSelectionUsability {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> disallowedReasons;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus", com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.values());
            return createSimpleEnumSerializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability.$r8$lambda$uSzWRQlbq7nEeM_7ld0WQzMEoMg();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionUsability$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingSelectionUsability;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingSelectionUsability(int i, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability$$serializer.INSTANCE.getDescriptor());
        }
        this.status = fundingInstrumentStatus;
        this.disallowedReasons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FundingSelectionUsability(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentStatus, "");
        this.status = fundingInstrumentStatus;
        this.disallowedReasons = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.status);
        output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.disallowedReasons);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus getStatus() {
        return this.status;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> getDisallowedReasons() {
        return this.disallowedReasons;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$uSzWRQlbq7nEeM_7ld0WQzMEoMg() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason", com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason.values()));
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus = this.status;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> list = this.disallowedReasons;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSelectionUsability(status=");
        sb.append(fundingInstrumentStatus);
        sb.append(", disallowedReasons=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.status.hashCode();
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> list = this.disallowedReasons;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability) other;
        return this.status == fundingSelectionUsability.status && kotlin.jvm.internal.Intrinsics.areEqual(this.disallowedReasons, fundingSelectionUsability.disallowedReasons);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability copy(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus status, java.util.List<? extends com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> disallowedReasons) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability(status, disallowedReasons);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingDisallowedReason> component2() {
        return this.disallowedReasons;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingSelectionUsability fundingSelectionUsability, com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingInstrumentStatus = fundingSelectionUsability.status;
        }
        if ((i & 2) != 0) {
            list = fundingSelectionUsability.disallowedReasons;
        }
        return fundingSelectionUsability.copy(fundingInstrumentStatus, list);
    }
}
