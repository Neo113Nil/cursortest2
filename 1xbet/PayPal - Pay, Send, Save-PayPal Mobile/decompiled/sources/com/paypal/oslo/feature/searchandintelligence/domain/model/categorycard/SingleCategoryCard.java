package com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/SingleCategoryCard;", "Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/SingleCategoryCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "getCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SingleCategoryCard implements com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard card;

    public SingleCategoryCard(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        this.card = categoryCard;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction> getAgenticActions() {
        return super.getAgenticActions();
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard getCard() {
        return this.card;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard = this.card;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleCategoryCard(card=");
        sb.append(categoryCard);
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
        return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard) other).card);
    }

    public final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard copy(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        return new com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard(card);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard getCard() {
        return this.card;
    }

    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.SingleCategoryCard singleCategoryCard, com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            categoryCard = singleCategoryCard.card;
        }
        return singleCategoryCard.copy(categoryCard);
    }
}
