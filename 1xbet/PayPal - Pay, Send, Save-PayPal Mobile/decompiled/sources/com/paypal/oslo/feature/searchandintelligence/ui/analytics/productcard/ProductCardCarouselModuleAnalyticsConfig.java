package com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/analytics/productcard/ProductCardCarouselModuleAnalyticsConfig;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Module;", "<init>", "()V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "Ljava/util/List;", "getContexts", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCardCarouselModuleAnalyticsConfig implements com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Module {
    public static final com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.ProductCardCarouselModuleAnalyticsConfig INSTANCE = new com.paypal.oslo.feature.searchandintelligence.ui.analytics.productcard.ProductCardCarouselModuleAnalyticsConfig();
    private static final java.lang.String name = "product_card_carousel";
    private static final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.SEARCH_AND_INTELLIGENCE, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConstants.UserIntent.FEATURE, "view_product_card_carousel"));
    public static final int $stable = 8;

    private ProductCardCarouselModuleAnalyticsConfig() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig
    public final java.lang.String getName() {
        return name;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig
    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return contexts;
    }
}
