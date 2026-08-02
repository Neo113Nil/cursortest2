package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002'&B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "creditCapabilities", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductValueProposition;", "valuePropositions", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "productCapability", "", "checkCapability", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;)Z", "valueProposition", "hasValueProposition", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductValueProposition;)Z", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "Ljava/util/List;", "getCreditCapabilities", "()Ljava/util/List;", "getValuePropositions", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class ProductConfigurations {
    private final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> creditCapabilities;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> valuePropositions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations.$r8$lambda$GAghhVZuwFaC4csuahqAck8SDAU();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations.m18127$r8$lambda$WHjf6c4t7s64bxaaaKQRIre3g();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductConfigurations;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductConfigurations(int i, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        this.creditProductIdentifier = (i & 1) == 0 ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : creditProductIdentifier;
        if ((i & 2) == 0) {
            this.creditCapabilities = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.creditCapabilities = list;
        }
        if ((i & 4) == 0) {
            this.valuePropositions = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.valuePropositions = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductConfigurations(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> list, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.creditProductIdentifier = creditProductIdentifier;
        this.creditCapabilities = list;
        this.valuePropositions = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.creditProductIdentifier != com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.creditProductIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.creditCapabilities, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.creditCapabilities);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.valuePropositions, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.valuePropositions);
        }
    }

    public /* synthetic */ ProductConfigurations(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : creditProductIdentifier, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability> getCreditCapabilities() {
        return this.creditCapabilities;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition> getValuePropositions() {
        return this.valuePropositions;
    }

    public final boolean hasValueProposition(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition valueProposition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueProposition, "");
        return this.valuePropositions.contains(valueProposition);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$GAghhVZuwFaC4csuahqAck8SDAU() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.values()));
    }

    /* renamed from: $r8$lambda$WHjf6c4t7s64-bxaaaKQRI-re3g, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m18127$r8$lambda$WHjf6c4t7s64bxaaaKQRIre3g() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition", com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductValueProposition.values()));
    }

    public final boolean checkCapability(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability productCapability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCapability, "");
        return this.creditCapabilities.contains(productCapability);
    }

    public ProductConfigurations() {
        this((com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, (java.util.List) null, (java.util.List) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
