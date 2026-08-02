package com.paypal.oslo.feature.searchandintelligence.ui.renderer.productcard;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/renderer/productcard/ProductCardCarouselViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", com.sun.jna.Callback.METHOD_NAME, "Landroid/content/Context;", "context", "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;", "card", "", "onProductCardClick", "(Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/ProductCard;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/SearchAndIntelligence;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCardCarouselViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ProductCardCarouselViewModel(com.paypal.oslo.feature.searchandintelligence.api.domain.SearchAndIntelligence searchAndIntelligence, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchAndIntelligence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = searchAndIntelligence;
        this.getHighSpeedVideoSizes = context;
    }

    public final void onProductCardClick(com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.ProductCard card) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
        java.lang.String string = this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_pdp_detail, card.getItemName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        this.getHighResolutionOutputSizeshNQ4ISI.sendMessage(string, com.paypal.oslo.feature.searchandintelligence.api.domain.RequestedMessageType.INSTANCE.user(false, false), 2);
        this.getHighResolutionOutputSizeshNQ4ISI.displayComponents(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.domain.model.commerceitem.CommerceItemProductDetails(card)));
    }
}
