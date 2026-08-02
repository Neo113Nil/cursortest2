package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CategoryCardCarouselRenderer$Render$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        ((com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel) this.receiver).onCategoryCardClick(categoryCard);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        getHighSpeedVideoFpsRanges(categoryCard);
        return kotlin.Unit.INSTANCE;
    }

    CategoryCardCarouselRenderer$Render$1$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard.CategoryCardViewModel.class, "onCategoryCardClick", "onCategoryCardClick(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;)V", 0);
    }
}
