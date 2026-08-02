package com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/commerceitem/CommerceItemProductDetails;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/commerceitem/CommerceItemProductDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CommerceItemProductDetails implements com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard card;

    public CommerceItemProductDetails(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productCard, "");
        this.card = productCard;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction> getAgenticActions() {
        return super.getAgenticActions();
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard getCard() {
        return this.card;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard = this.card;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CommerceItemProductDetails(card=");
        sb.append(productCard);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.card.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails) other).card);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails copy(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails(card);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard getCard() {
        return this.card;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails commerceItemProductDetails, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard productCard, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            productCard = commerceItemProductDetails.card;
        }
        return commerceItemProductDetails.copy(productCard);
    }
}
