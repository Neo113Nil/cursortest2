package com.paypal.oslo.feature.searchandintelligence.ui.analytics.productdetails;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/analytics/productdetails/AttributeItemAnalyticsConfig;", "Lcom/paypal/oslo/feature/searchandintelligence/api/analytics/SearchAndIntelligenceAnalyticsConfig$Item;", "", "attribute", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/searchandintelligence/domain/model/productcard/CommerceItemType;)V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "name", "getName", "()Ljava/lang/String;", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "Ljava/util/List;", "getContexts", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AttributeItemAnalyticsConfig implements com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig.Item {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
    private final java.lang.String name;

    public AttributeItemAnalyticsConfig(java.lang.String str, com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType commerceItemType) {
        java.lang.String str2;
        java.lang.String str3 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commerceItemType, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        this.getHighSpeedVideoFpsRangesFor = lowerCase;
        int i = com.paypal.oslo.feature.searchandintelligence.ui.analytics.productdetails.AttributeItemAnalyticsConfig.WhenMappings.$EnumSwitchMapping$0[commerceItemType.ordinal()];
        if (i == 1) {
            str2 = "product_";
        } else if (i == 2) {
            str2 = "gift_card_";
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(lowerCase);
        this.name = sb.toString();
        com.paypal.oslo.core.telemetry.analytics.schema.Product product = com.paypal.oslo.core.telemetry.analytics.schema.Product.SEARCH_AND_INTELLIGENCE;
        int i2 = com.paypal.oslo.feature.searchandintelligence.ui.analytics.productdetails.AttributeItemAnalyticsConfig.WhenMappings.$EnumSwitchMapping$0[commerceItemType.ordinal()];
        if (i2 == 1) {
            str3 = "select_product_variant_";
        } else if (i2 == 2) {
            str3 = "select_gift_card_variant_";
        } else if (i2 != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str3);
        sb2.append(lowerCase);
        this.contexts = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(product, com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConstants.UserIntent.FEATURE, sb2.toString()));
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.api.analytics.SearchAndIntelligenceAnalyticsConfig
    public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
        return this.contexts;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.values().length];
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.PRODUCT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.GIFT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.searchandintelligence.domain.model.productcard.CommerceItemType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
