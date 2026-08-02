package com.paypal.oslo.feature.searchandintelligence.api.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceDestinationAnalytics;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SearchAndIntelligenceDestinationAnalytics implements com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalytics INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalytics();

    private SearchAndIntelligenceDestinationAnalytics() {
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("sni_agentic_chat", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.SEARCH_AND_INTELLIGENCE, "sni_agentic_chat", com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceDestinationAnalyticsKt.SniScreenAction), null, 4, null);
    }
}
