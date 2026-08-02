package com.paypal.oslo.feature.ads.data.tracking;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdEntity;", "", "sourcePageName", "Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;", "toTrackingAd", "(Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdEntity;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;", "Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "toAdData", "(Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;)Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "(Lcom/paypal/oslo/feature/ads/domain/model/AdData;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;", "getEmptyTrackingAd", "()Lcom/paypal/oslo/feature/ads/data/tracking/TrackedAd;", "", "width", "height", "buildAdSize", "(II)Ljava/lang/String;", "Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdType;", "Lcom/paypal/oslo/feature/ads/domain/model/AdType;", "toAdType", "(Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdType;)Lcom/paypal/oslo/feature/ads/domain/model/AdType;", "toOLAdType", "(Lcom/paypal/oslo/feature/ads/domain/model/AdType;)Lcom/paypal/oslo/feature/ads/data/models/ol/OLAdType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdTrackingMapperKt {
    public static /* synthetic */ com.paypal.oslo.feature.ads.data.tracking.TrackedAd toTrackingAd$default(com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity oLAdEntity, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return toTrackingAd(oLAdEntity, str);
    }

    public static final com.paypal.oslo.feature.ads.data.tracking.TrackedAd toTrackingAd(com.paypal.oslo.feature.ads.data.models.ol.OLAdEntity oLAdEntity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oLAdEntity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String impressionUrl = oLAdEntity.getImpressionUrl();
        java.lang.String clickUrl = oLAdEntity.getClickUrl();
        java.util.List<java.lang.String> trackingUrls = oLAdEntity.getTrackingUrls();
        java.lang.String id = oLAdEntity.getId();
        java.lang.String primaryImageUrl = oLAdEntity.getAsset().getPrimaryImageUrl();
        int width = oLAdEntity.getAsset().getWidth();
        int height = oLAdEntity.getAsset().getHeight();
        java.lang.String title = oLAdEntity.getAsset().getTitle();
        java.lang.String rawClickUrl = oLAdEntity.getRawClickUrl();
        java.lang.String countryCode = oLAdEntity.getCountryCode();
        java.lang.String str2 = countryCode == null ? "" : countryCode;
        java.lang.String page = oLAdEntity.getPage();
        java.lang.String str3 = page == null ? "" : page;
        java.lang.String placement = oLAdEntity.getPlacement();
        java.lang.String str4 = placement == null ? "" : placement;
        java.lang.String publisher = oLAdEntity.getPublisher();
        java.lang.String str5 = publisher != null ? publisher : "";
        java.lang.String templateName = oLAdEntity.getAsset().getTemplateName();
        com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata metadata = oLAdEntity.getMetadata();
        java.lang.String advertiserId = metadata != null ? metadata.getAdvertiserId() : null;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata metadata2 = oLAdEntity.getMetadata();
        java.lang.String creativeId = metadata2 != null ? metadata2.getCreativeId() : null;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata metadata3 = oLAdEntity.getMetadata();
        java.lang.String campaignId = metadata3 != null ? metadata3.getCampaignId() : null;
        com.paypal.oslo.feature.ads.data.models.ol.OLAdMetadata metadata4 = oLAdEntity.getMetadata();
        return new com.paypal.oslo.feature.ads.data.tracking.TrackedAd(impressionUrl, clickUrl, trackingUrls, id, primaryImageUrl, width, height, title, rawClickUrl, new com.paypal.oslo.feature.ads.data.tracking.TrackedAdMetadata(str2, str3, str4, str5, templateName, advertiserId, creativeId, campaignId, metadata4 != null ? metadata4.getFlightId() : null, oLAdEntity.getImpressionStrategy(), str, buildAdSize(oLAdEntity.getAsset().getWidth(), oLAdEntity.getAsset().getHeight())), oLAdEntity.getAsset().getSubtitle(), oLAdEntity.getAsset().getCtaText(), oLAdEntity.getAsset().getMerchantName(), oLAdEntity.getAsset().getLogoUrl(), oLAdEntity.getAsset().getType(), oLAdEntity.getAsset().getDisclaimerText(), oLAdEntity.getAsset().getDisclaimerLinkText(), oLAdEntity.getAsset().getDisclaimerUrl(), oLAdEntity.getAsset().getBgPrimaryColor());
    }

    public static final com.paypal.oslo.feature.ads.domain.model.AdData toAdData(com.paypal.oslo.feature.ads.data.tracking.TrackedAd trackedAd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackedAd, "");
        java.lang.String title = trackedAd.getTitle();
        java.lang.String imageUrl = trackedAd.getImageUrl();
        int width = trackedAd.getWidth();
        int height = trackedAd.getHeight();
        java.lang.String title2 = trackedAd.getTitle();
        java.lang.String str = title2 == null ? "" : title2;
        java.lang.String impressionUrl = trackedAd.getImpressionUrl();
        java.lang.String clickUrl = trackedAd.getClickUrl();
        java.util.List<java.lang.String> trackingUrls = trackedAd.getTrackingUrls();
        java.lang.String adId = trackedAd.getAdId();
        java.lang.String country = trackedAd.getMetadata().getCountry();
        java.lang.String page = trackedAd.getMetadata().getPage();
        java.lang.String placement = trackedAd.getMetadata().getPlacement();
        java.lang.String publisher = trackedAd.getMetadata().getPublisher();
        java.lang.String templateName = trackedAd.getMetadata().getTemplateName();
        java.lang.String advertiserId = trackedAd.getMetadata().getAdvertiserId();
        java.lang.String str2 = advertiserId == null ? "" : advertiserId;
        java.lang.String creativeId = trackedAd.getMetadata().getCreativeId();
        java.lang.String str3 = creativeId == null ? "" : creativeId;
        java.lang.String campaignId = trackedAd.getMetadata().getCampaignId();
        java.lang.String str4 = campaignId == null ? "" : campaignId;
        java.lang.String flightId = trackedAd.getMetadata().getFlightId();
        java.lang.String str5 = flightId == null ? "" : flightId;
        java.lang.String strategy = trackedAd.getMetadata().getStrategy();
        java.lang.String str6 = strategy == null ? "" : strategy;
        java.lang.String rawClickUrl = trackedAd.getRawClickUrl();
        return new com.paypal.oslo.feature.ads.domain.model.AdData(title, trackedAd.getSubtitle(), trackedAd.getCtaText(), trackedAd.getMerchantName(), trackedAd.getLogoUrl(), imageUrl, java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height), str, impressionUrl, clickUrl, trackingUrls, adId, str2, country, page, placement, str3, publisher, str4, str5, str6, templateName, rawClickUrl == null ? "" : rawClickUrl, toAdType(trackedAd.getAdType()), trackedAd.getDisclaimerText(), trackedAd.getDisclaimerLinkText(), trackedAd.getDisclaimerUrl(), trackedAd.getBgPrimaryColor());
    }

    public static /* synthetic */ com.paypal.oslo.feature.ads.data.tracking.TrackedAd toTrackingAd$default(com.paypal.oslo.feature.ads.domain.model.AdData adData, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return toTrackingAd(adData, str);
    }

    public static final com.paypal.oslo.feature.ads.data.tracking.TrackedAd toTrackingAd(com.paypal.oslo.feature.ads.domain.model.AdData adData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String impressionUrl = adData.getImpressionUrl();
        java.lang.String clickUrl = adData.getClickUrl();
        java.util.List<java.lang.String> trackingUrls = adData.getTrackingUrls();
        java.lang.String adId = adData.getAdId();
        java.lang.String imageUrl = adData.getImageUrl();
        java.lang.Integer width = adData.getWidth();
        int intValue = width != null ? width.intValue() : 0;
        java.lang.Integer height = adData.getHeight();
        int intValue2 = height != null ? height.intValue() : 0;
        java.lang.String title = adData.getTitle();
        java.lang.String rawClickUrl = adData.getRawClickUrl();
        java.lang.String country = adData.getCountry();
        java.lang.String page = adData.getPage();
        java.lang.String placement = adData.getPlacement();
        java.lang.String publisher = adData.getPublisher();
        java.lang.String templateName = adData.getTemplateName();
        java.lang.String advertiserId = adData.getAdvertiserId();
        java.lang.String str2 = advertiserId.length() <= 0 ? null : advertiserId;
        java.lang.String creativeId = adData.getCreativeId();
        if (creativeId.length() <= 0) {
            creativeId = null;
        }
        java.lang.String campaignId = adData.getCampaignId();
        if (campaignId.length() <= 0) {
            campaignId = null;
        }
        java.lang.String flightId = adData.getFlightId();
        if (flightId.length() <= 0) {
            flightId = null;
        }
        java.lang.String strategy = adData.getStrategy();
        if (strategy.length() <= 0) {
            strategy = null;
        }
        java.lang.Integer width2 = adData.getWidth();
        int intValue3 = width2 != null ? width2.intValue() : 0;
        java.lang.Integer height2 = adData.getHeight();
        return new com.paypal.oslo.feature.ads.data.tracking.TrackedAd(impressionUrl, clickUrl, trackingUrls, adId, imageUrl, intValue, intValue2, title, rawClickUrl, new com.paypal.oslo.feature.ads.data.tracking.TrackedAdMetadata(country, page, placement, publisher, templateName, str2, creativeId, campaignId, flightId, strategy, str, buildAdSize(intValue3, height2 != null ? height2.intValue() : 0)), adData.getSubtitle(), adData.getCtaText(), adData.getMerchantName(), adData.getLogoUrl(), toOLAdType(adData.getAdType()), adData.getDisclaimerText(), adData.getDisclaimerLinkText(), adData.getDisclaimerUrl(), adData.getBgPrimaryColor());
    }

    public static final com.paypal.oslo.feature.ads.data.tracking.TrackedAd getEmptyTrackingAd() {
        return new com.paypal.oslo.feature.ads.data.tracking.TrackedAd("", "", kotlin.collections.CollectionsKt.emptyList(), "", "", 0, 0, null, "", new com.paypal.oslo.feature.ads.data.tracking.TrackedAdMetadata(null, null, null, null, "", null, null, null, null, null, "", "", 15, null), null, null, null, null, null, null, null, null, null, 523264, null);
    }

    public static final java.lang.String buildAdSize(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    public static final com.paypal.oslo.feature.ads.domain.model.AdType toAdType(com.paypal.oslo.feature.ads.data.models.ol.OLAdType oLAdType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oLAdType, "");
        int i = com.paypal.oslo.feature.ads.data.tracking.AdTrackingMapperKt.WhenMappings.$EnumSwitchMapping$0[oLAdType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return com.paypal.oslo.feature.ads.domain.model.AdType.IMAGE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.ads.domain.model.AdType.PAYPAL_SHOP;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.ads.domain.model.AdType.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.ads.data.models.ol.OLAdType toOLAdType(com.paypal.oslo.feature.ads.domain.model.AdType adType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "");
        int i = com.paypal.oslo.feature.ads.data.tracking.AdTrackingMapperKt.WhenMappings.$EnumSwitchMapping$1[adType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.ads.data.models.ol.OLAdType.IMAGE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.ads.data.models.ol.OLAdType.PAYPAL_SHOP;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.ads.data.models.ol.OLAdType.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.values().length];
            try {
                iArr[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.IMAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.NATIVE_IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.NATIVE_TEXT_AND_IMAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.PAYPAL_SHOP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.ads.data.models.ol.OLAdType.UNKNOWN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.ads.domain.model.AdType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.ads.domain.model.AdType.IMAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.ads.domain.model.AdType.PAYPAL_SHOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.ads.domain.model.AdType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
