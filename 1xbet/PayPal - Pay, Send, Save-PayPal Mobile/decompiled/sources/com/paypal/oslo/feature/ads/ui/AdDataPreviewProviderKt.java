package com.paypal.oslo.feature.ads.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"createPreviewAdData", "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "title", "", "subtitle", "merchantName", "ctaText", "width", "", "height", "ads_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdDataPreviewProviderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.feature.ads.domain.model.AdData Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://via.placeholder.com/");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return new com.paypal.oslo.feature.ads.domain.model.AdData(str, str2, str4, str3, "https://via.placeholder.com/40x40", sb.toString(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), com.paypal.oslo.feature.home.domain.model.SectionTypes.ADS, "https://example.com/impression", "https://example.com/click", kotlin.collections.CollectionsKt.emptyList(), "ad_preview_".concat(java.lang.String.valueOf(str.hashCode())), "advertiser_1", "US", "home_feed", "home_feed", "creative_1", "VENMO", "campaign_1", "flight_1", "strategy_1", "standard", "https://example.com/click", null, null, null, null, null, 520093696, null);
    }
}
