package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;", "instrumentType", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataAction;", "financialInstrumentMetadataActionList", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$inappcheckout_prodRelease", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentType;", "getInstrumentType", "Ljava/util/List;", "getFinancialInstrumentMetadataActionList", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FinancialInstrumentMetadataType {
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> financialInstrumentMetadataActionList;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType.Companion INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType.$r8$lambda$EgS5ZcbPgLXuOmu7uKdFggFtWnc();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FinancialInstrumentMetadataType;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType> serializer() {
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FinancialInstrumentMetadataType(int i, com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType$$serializer.INSTANCE.getDescriptor());
        }
        this.instrumentType = instrumentType;
        this.financialInstrumentMetadataActionList = list;
    }

    public FinancialInstrumentMetadataType(com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.instrumentType = instrumentType;
        this.financialInstrumentMetadataActionList = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$inappcheckout_prodRelease(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType$$serializer.INSTANCE, self.instrumentType);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.financialInstrumentMetadataActionList);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> getFinancialInstrumentMetadataActionList() {
        return this.financialInstrumentMetadataActionList;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$EgS5ZcbPgLXuOmu7uKdFggFtWnc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType = this.instrumentType;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> list = this.financialInstrumentMetadataActionList;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FinancialInstrumentMetadataType(instrumentType=");
        sb.append(instrumentType);
        sb.append(", financialInstrumentMetadataActionList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.instrumentType.hashCode() * 31) + this.financialInstrumentMetadataActionList.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType financialInstrumentMetadataType = (com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentType, financialInstrumentMetadataType.instrumentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentMetadataActionList, financialInstrumentMetadataType.financialInstrumentMetadataActionList);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType copy(com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> financialInstrumentMetadataActionList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(financialInstrumentMetadataActionList, "");
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType(instrumentType, financialInstrumentMetadataActionList);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataAction> component2() {
        return this.financialInstrumentMetadataActionList;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataType financialInstrumentMetadataType, com.paypal.oslo.feature.inappcheckout.domain.entity.InstrumentType instrumentType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            instrumentType = financialInstrumentMetadataType.instrumentType;
        }
        if ((i & 2) != 0) {
            list = financialInstrumentMetadataType.financialInstrumentMetadataActionList;
        }
        return financialInstrumentMetadataType.copy(instrumentType, list);
    }
}
