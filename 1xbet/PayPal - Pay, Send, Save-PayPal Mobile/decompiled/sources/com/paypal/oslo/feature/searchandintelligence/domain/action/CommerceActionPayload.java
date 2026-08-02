package com.paypal.oslo.feature.searchandintelligence.domain.action;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionPayload;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;", "productVariant", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;)Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionPayload;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$search_and_intelligence_prodRelease", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/action/ProductVariant;", "getProductVariant", "getProductVariant$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CommerceActionPayload {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload.Companion(null);
    private final com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant;

    @kotlinx.serialization.SerialName("product_variant")
    public static /* synthetic */ void getProductVariant$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionPayload$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/action/CommerceActionPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CommerceActionPayload(int i, com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.productVariant = null;
        } else {
            this.productVariant = productVariant;
        }
    }

    public CommerceActionPayload(com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant) {
        this.productVariant = productVariant;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$search_and_intelligence_prodRelease(com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.productVariant != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant$$serializer.INSTANCE, self.productVariant);
        }
    }

    public /* synthetic */ CommerceActionPayload(com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productVariant);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant getProductVariant() {
        return this.productVariant;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant = this.productVariant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CommerceActionPayload(productVariant=");
        sb.append(productVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant = this.productVariant;
        if (productVariant == null) {
            return 0;
        }
        return productVariant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.productVariant, ((com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload) other).productVariant);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload copy(com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant) {
        return new com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload(productVariant);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant getProductVariant() {
        return this.productVariant;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload copy$default(com.paypal.oslo.feature.searchandintelligence.domain.action.CommerceActionPayload commerceActionPayload, com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant productVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            productVariant = commerceActionPayload.productVariant;
        }
        return commerceActionPayload.copy(productVariant);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommerceActionPayload() {
        this((com.paypal.oslo.feature.searchandintelligence.domain.action.ProductVariant) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
