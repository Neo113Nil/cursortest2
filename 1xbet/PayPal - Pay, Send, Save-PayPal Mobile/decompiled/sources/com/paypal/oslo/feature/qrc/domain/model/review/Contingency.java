package com.paypal.oslo.feature.qrc.domain.model.review;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;", "type", "", "Lcom/paypal/oslo/feature/qrc/domain/model/review/ContingencyLink;", "links", "<init>", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$qrc_prodRelease", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/qrc/domain/model/review/FundingOptionContingency;", "getType", "Ljava/util/List;", "getLinks", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Contingency {
    private final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> links;
    private final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.domain.model.review.Contingency.Companion INSTANCE = new com.paypal.oslo.feature.qrc.domain.model.review.Contingency.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.qrc.domain.model.review.Contingency.$r8$lambda$WCayWuaUcBYng9Br2owlv5qsTPQ();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/Contingency;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.qrc.domain.model.review.Contingency> serializer() {
            return com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Contingency(int i, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.qrc.domain.model.review.Contingency$$serializer.INSTANCE.getDescriptor());
        }
        this.type = fundingOptionContingency;
        if ((i & 2) == 0) {
            this.links = null;
        } else {
            this.links = list;
        }
    }

    public Contingency(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency, java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionContingency, "");
        this.type = fundingOptionContingency;
        this.links = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$qrc_prodRelease(com.paypal.oslo.feature.qrc.domain.model.review.Contingency self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.links != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.links);
        }
    }

    public /* synthetic */ Contingency(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fundingOptionContingency, (i & 2) != 0 ? null : list);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> getLinks() {
        return this.links;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$WCayWuaUcBYng9Br2owlv5qsTPQ() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency = this.type;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> list = this.links;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Contingency(type=");
        sb.append(fundingOptionContingency);
        sb.append(", links=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> list = this.links;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.review.Contingency)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency = (com.paypal.oslo.feature.qrc.domain.model.review.Contingency) other;
        return this.type == contingency.type && kotlin.jvm.internal.Intrinsics.areEqual(this.links, contingency.links);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.review.Contingency copy(com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency type, java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> links) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.qrc.domain.model.review.Contingency(type, links);
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.domain.model.review.ContingencyLink> component2() {
        return this.links;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.review.Contingency copy$default(com.paypal.oslo.feature.qrc.domain.model.review.Contingency contingency, com.paypal.oslo.feature.qrc.domain.model.review.FundingOptionContingency fundingOptionContingency, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingOptionContingency = contingency.type;
        }
        if ((i & 2) != 0) {
            list = contingency.links;
        }
        return contingency.copy(fundingOptionContingency, list);
    }
}
