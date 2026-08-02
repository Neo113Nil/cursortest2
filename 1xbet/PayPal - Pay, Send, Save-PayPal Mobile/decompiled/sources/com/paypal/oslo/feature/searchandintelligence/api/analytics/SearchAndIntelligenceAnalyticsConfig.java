package com.paypal.oslo.feature.searchandintelligence.api.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u000b\f\rR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;", "", "", "getName", "()Ljava/lang/String;", "name", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "getContexts", "()Ljava/util/List;", "contexts", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "Component", "Item", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Item;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SearchAndIntelligenceAnalyticsConfig {

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Component;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Component extends com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig {
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Item;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Item extends com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig {
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Module;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Module extends com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig {
    }

    java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts();

    java.lang.String getName();
}
