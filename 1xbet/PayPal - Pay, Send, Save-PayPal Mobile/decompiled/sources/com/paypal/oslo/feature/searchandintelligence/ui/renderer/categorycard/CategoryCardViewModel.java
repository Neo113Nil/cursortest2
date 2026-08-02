package com.paypal.oslo.feature.searchandintelligence.ui.renderer.categorycard;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/categorycard/CategoryCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", "searchAndIntelligence", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;", "categoryCard", "", "onCategoryCardClick", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/categorycard/CategoryCard;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CategoryCardViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CategoryCardViewModel(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligence, "");
        this.getHighSpeedVideoFpsRangesFor = searchAndIntelligence;
    }

    public final void onCategoryCardClick(com.paypal.oslo.feature.searchandintelligence.domain.model.categorycard.CategoryCard categoryCard) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categoryCard, "");
        com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence.sendMessage$default(this.getHighSpeedVideoFpsRangesFor, categoryCard.getName(), com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.INSTANCE.user(false, false), 0, 4, null);
        java.lang.String reasoningText = categoryCard.getReasoningText();
        if (reasoningText != null) {
            com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence.sendMessage$default(this.getHighSpeedVideoFpsRangesFor, reasoningText, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.INSTANCE.agent(), 0, 4, null);
        }
        com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCardCarousel productCardCarousel = categoryCard.getProductCardCarousel();
        if (productCardCarousel != null) {
            this.getHighSpeedVideoFpsRangesFor.displayComponents(kotlin.collections.CollectionsKt.listOf(productCardCarousel));
        }
    }
}
