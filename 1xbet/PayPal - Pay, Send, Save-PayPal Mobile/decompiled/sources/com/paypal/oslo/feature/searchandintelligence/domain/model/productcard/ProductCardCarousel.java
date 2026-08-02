package com.paypal.oslo.feature.searchandintelligence.domain.model.productcard;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002$%B$\u0012\u001b\u0010\u0002\u001a\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00070\u0003¢\u0006\u0004\b\b\u0010\tB+\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u001e\u0010\u0013\u001a\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00070\u0003HÆ\u0003J(\u0010\u0014\u001a\u00020\u00002\u001d\b\u0002\u0010\u0002\u001a\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00070\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R1\u0010\u0002\u001a\u0017\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\t0\u00070\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "cards", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard$Serializer;", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCards$annotations", "()V", "getCards", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$search_and_intelligence_prodRelease", "$serializer", "Companion", "search-and-intelligence_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ProductCardCarousel implements com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent {
    private final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> cards;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel.$r8$lambda$Y9I2kLKRl1TQOIF56d3tidrFVn8();
        }
    })};

    @kotlinx.serialization.SerialName("agentic_commerce_item_components")
    public static /* synthetic */ void getCards$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCardCarousel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel> serializer() {
            return com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProductCardCarousel(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel$$serializer.INSTANCE.getDescriptor());
        }
        this.cards = list;
    }

    public ProductCardCarousel(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.cards = list;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction> getAgenticActions() {
        return super.getAgenticActions();
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> getCards() {
        return this.cards;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Y9I2kLKRl1TQOIF56d3tidrFVn8() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard.Serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> list = this.cards;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductCardCarousel(cards=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.cards.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel) && kotlin.jvm.internal.Intrinsics.areEqual(this.cards, ((com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel) other).cards);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel copy(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> cards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cards, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel(cards);
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard> component1() {
        return this.cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = productCardCarousel.cards;
        }
        return productCardCarousel.copy(list);
    }
}
