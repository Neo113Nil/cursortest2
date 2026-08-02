package com.paypal.oslo.feature.ads.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010&J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010&J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010&J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010&J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010&J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u0010&J\u0010\u00108\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b8\u0010&J\u0010\u00109\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b:\u0010&J\u0010\u0010;\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b;\u0010&J\u0010\u0010<\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b<\u0010&J\u0010\u0010=\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b=\u0010&J\u0010\u0010>\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b>\u0010&J\u0010\u0010?\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b?\u0010&J\u0010\u0010@\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u0010&J\u0012\u0010C\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bC\u0010&J\u0012\u0010D\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bD\u0010&J\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010&JÐ\u0002\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020I2\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bR\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bS\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bT\u0010&R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010O\u001a\u0004\bU\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\bW\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010V\u001a\u0004\bX\u0010-R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bY\u0010&R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010O\u001a\u0004\bZ\u0010&R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\b[\u0010&R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\\\u001a\u0004\b]\u00103R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\b^\u0010&R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\b_\u0010&R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010O\u001a\u0004\b`\u0010&R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\ba\u0010&R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bb\u0010&R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bc\u0010&R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010O\u001a\u0004\bd\u0010&R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\be\u0010&R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bf\u0010&R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010O\u001a\u0004\bg\u0010&R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010O\u001a\u0004\bh\u0010&R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010O\u001a\u0004\bi\u0010&R\u001a\u0010\u001e\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010j\u001a\u0004\bk\u0010AR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010O\u001a\u0004\bl\u0010&R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010O\u001a\u0004\bm\u0010&R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010O\u001a\u0004\bn\u0010&R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010O\u001a\u0004\bo\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "", "", "title", "subtitle", "ctaText", "merchantName", "logoUrl", "imageUrl", "", "width", "height", "contentDescription", "impressionUrl", "clickUrl", "", "trackingUrls", "adId", "advertiserId", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "page", "placement", "creativeId", "publisher", "campaignId", "flightId", "strategy", "templateName", "rawClickUrl", "Lcom/paypal/oslo/feature/ads/domain/model/AdType;", "adType", "disclaimerText", "disclaimerLinkText", "disclaimerUrl", "bgPrimaryColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/ads/domain/model/AdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "()Ljava/util/List;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "()Lcom/paypal/oslo/feature/ads/domain/model/AdType;", "component26", "component27", "component28", "component29", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/ads/domain/model/AdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/ads/domain/model/AdData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSubtitle", "getCtaText", "getMerchantName", "getLogoUrl", "getImageUrl", "Ljava/lang/Integer;", "getWidth", "getHeight", "getContentDescription", "getImpressionUrl", "getClickUrl", "Ljava/util/List;", "getTrackingUrls", "getAdId", "getAdvertiserId", "getCountry", "getPage", "getPlacement", "getCreativeId", "getPublisher", "getCampaignId", "getFlightId", "getStrategy", "getTemplateName", "getRawClickUrl", "Lcom/paypal/oslo/feature/ads/domain/model/AdType;", "getAdType", "getDisclaimerText", "getDisclaimerLinkText", "getDisclaimerUrl", "getBgPrimaryColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AdData {
    public static final int $stable = 8;
    private final java.lang.String adId;
    private final com.paypal.oslo.feature.ads.domain.model.AdType adType;
    private final java.lang.String advertiserId;
    private final java.lang.String bgPrimaryColor;
    private final java.lang.String campaignId;
    private final java.lang.String clickUrl;
    private final java.lang.String contentDescription;
    private final java.lang.String country;
    private final java.lang.String creativeId;
    private final java.lang.String ctaText;
    private final java.lang.String disclaimerLinkText;
    private final java.lang.String disclaimerText;
    private final java.lang.String disclaimerUrl;
    private final java.lang.String flightId;
    private final java.lang.Integer height;
    private final java.lang.String imageUrl;
    private final java.lang.String impressionUrl;
    private final java.lang.String logoUrl;
    private final java.lang.String merchantName;
    private final java.lang.String page;
    private final java.lang.String placement;
    private final java.lang.String publisher;
    private final java.lang.String rawClickUrl;
    private final java.lang.String strategy;
    private final java.lang.String subtitle;
    private final java.lang.String templateName;
    private final java.lang.String title;
    private final java.util.List<java.lang.String> trackingUrls;
    private final java.lang.Integer width;

    public AdData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List<java.lang.String> list, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, com.paypal.oslo.feature.ads.domain.model.AdType adType, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str19, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str21, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "");
        this.title = str;
        this.subtitle = str2;
        this.ctaText = str3;
        this.merchantName = str4;
        this.logoUrl = str5;
        this.imageUrl = str6;
        this.width = num;
        this.height = num2;
        this.contentDescription = str7;
        this.impressionUrl = str8;
        this.clickUrl = str9;
        this.trackingUrls = list;
        this.adId = str10;
        this.advertiserId = str11;
        this.country = str12;
        this.page = str13;
        this.placement = str14;
        this.creativeId = str15;
        this.publisher = str16;
        this.campaignId = str17;
        this.flightId = str18;
        this.strategy = str19;
        this.templateName = str20;
        this.rawClickUrl = str21;
        this.adType = adType;
        this.disclaimerText = str22;
        this.disclaimerLinkText = str23;
        this.disclaimerUrl = str24;
        this.bgPrimaryColor = str25;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String getImpressionUrl() {
        return this.impressionUrl;
    }

    public final java.lang.String getClickUrl() {
        return this.clickUrl;
    }

    public final java.util.List<java.lang.String> getTrackingUrls() {
        return this.trackingUrls;
    }

    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final java.lang.String getAdvertiserId() {
        return this.advertiserId;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final java.lang.String getPage() {
        return this.page;
    }

    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    public final java.lang.String getPublisher() {
        return this.publisher;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String getFlightId() {
        return this.flightId;
    }

    public final java.lang.String getStrategy() {
        return this.strategy;
    }

    public final java.lang.String getTemplateName() {
        return this.templateName;
    }

    public final java.lang.String getRawClickUrl() {
        return this.rawClickUrl;
    }

    public /* synthetic */ AdData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List list, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, java.lang.String str15, java.lang.String str16, java.lang.String str17, java.lang.String str18, java.lang.String str19, java.lang.String str20, java.lang.String str21, com.paypal.oslo.feature.ads.domain.model.AdType adType, java.lang.String str22, java.lang.String str23, java.lang.String str24, java.lang.String str25, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, num, num2, str7, str8, str9, list, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, (i & 16777216) != 0 ? com.paypal.oslo.feature.ads.domain.model.AdType.UNKNOWN : adType, (i & 33554432) != 0 ? null : str22, (i & 67108864) != 0 ? null : str23, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str24, (i & 268435456) != 0 ? null : str25);
    }

    public final com.paypal.oslo.feature.ads.domain.model.AdType getAdType() {
        return this.adType;
    }

    public final java.lang.String getDisclaimerText() {
        return this.disclaimerText;
    }

    public final java.lang.String getDisclaimerLinkText() {
        return this.disclaimerLinkText;
    }

    public final java.lang.String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    public final java.lang.String getBgPrimaryColor() {
        return this.bgPrimaryColor;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        java.lang.String str3 = this.ctaText;
        java.lang.String str4 = this.merchantName;
        java.lang.String str5 = this.logoUrl;
        java.lang.String str6 = this.imageUrl;
        java.lang.Integer num = this.width;
        java.lang.Integer num2 = this.height;
        java.lang.String str7 = this.contentDescription;
        java.lang.String str8 = this.impressionUrl;
        java.lang.String str9 = this.clickUrl;
        java.util.List<java.lang.String> list = this.trackingUrls;
        java.lang.String str10 = this.adId;
        java.lang.String str11 = this.advertiserId;
        java.lang.String str12 = this.country;
        java.lang.String str13 = this.page;
        java.lang.String str14 = this.placement;
        java.lang.String str15 = this.creativeId;
        java.lang.String str16 = this.publisher;
        java.lang.String str17 = this.campaignId;
        java.lang.String str18 = this.flightId;
        java.lang.String str19 = this.strategy;
        java.lang.String str20 = this.templateName;
        java.lang.String str21 = this.rawClickUrl;
        com.paypal.oslo.feature.ads.domain.model.AdType adType = this.adType;
        java.lang.String str22 = this.disclaimerText;
        java.lang.String str23 = this.disclaimerLinkText;
        java.lang.String str24 = this.disclaimerUrl;
        java.lang.String str25 = this.bgPrimaryColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdData(title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", ctaText=");
        sb.append(str3);
        sb.append(", merchantName=");
        sb.append(str4);
        sb.append(", logoUrl=");
        sb.append(str5);
        sb.append(", imageUrl=");
        sb.append(str6);
        sb.append(", width=");
        sb.append(num);
        sb.append(", height=");
        sb.append(num2);
        sb.append(", contentDescription=");
        sb.append(str7);
        sb.append(", impressionUrl=");
        sb.append(str8);
        sb.append(", clickUrl=");
        sb.append(str9);
        sb.append(", trackingUrls=");
        sb.append(list);
        sb.append(", adId=");
        sb.append(str10);
        sb.append(", advertiserId=");
        sb.append(str11);
        sb.append(", country=");
        sb.append(str12);
        sb.append(", page=");
        sb.append(str13);
        sb.append(", placement=");
        sb.append(str14);
        sb.append(", creativeId=");
        sb.append(str15);
        sb.append(", publisher=");
        sb.append(str16);
        sb.append(", campaignId=");
        sb.append(str17);
        sb.append(", flightId=");
        sb.append(str18);
        sb.append(", strategy=");
        sb.append(str19);
        sb.append(", templateName=");
        sb.append(str20);
        sb.append(", rawClickUrl=");
        sb.append(str21);
        sb.append(", adType=");
        sb.append(adType);
        sb.append(", disclaimerText=");
        sb.append(str22);
        sb.append(", disclaimerLinkText=");
        sb.append(str23);
        sb.append(", disclaimerUrl=");
        sb.append(str24);
        sb.append(", bgPrimaryColor=");
        sb.append(str25);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.subtitle;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.ctaText;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.merchantName;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.logoUrl;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        int hashCode6 = this.imageUrl.hashCode();
        java.lang.Integer num = this.width;
        int hashCode7 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.height;
        int hashCode8 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str6 = this.contentDescription;
        int hashCode9 = str6 == null ? 0 : str6.hashCode();
        int hashCode10 = this.impressionUrl.hashCode();
        int hashCode11 = this.clickUrl.hashCode();
        int hashCode12 = this.trackingUrls.hashCode();
        int hashCode13 = this.adId.hashCode();
        int hashCode14 = this.advertiserId.hashCode();
        int hashCode15 = this.country.hashCode();
        int hashCode16 = this.page.hashCode();
        int hashCode17 = this.placement.hashCode();
        int hashCode18 = this.creativeId.hashCode();
        int hashCode19 = this.publisher.hashCode();
        int hashCode20 = this.campaignId.hashCode();
        int hashCode21 = this.flightId.hashCode();
        int hashCode22 = this.strategy.hashCode();
        int hashCode23 = this.templateName.hashCode();
        int hashCode24 = this.rawClickUrl.hashCode();
        int hashCode25 = this.adType.hashCode();
        java.lang.String str7 = this.disclaimerText;
        int hashCode26 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.disclaimerLinkText;
        int hashCode27 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.disclaimerUrl;
        int hashCode28 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.bgPrimaryColor;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.ads.domain.model.AdData)) {
            return false;
        }
        com.paypal.oslo.feature.ads.domain.model.AdData adData = (com.paypal.oslo.feature.ads.domain.model.AdData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, adData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, adData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaText, adData.ctaText) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, adData.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, adData.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, adData.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, adData.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, adData.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, adData.contentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.impressionUrl, adData.impressionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.clickUrl, adData.clickUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.trackingUrls, adData.trackingUrls) && kotlin.jvm.internal.Intrinsics.areEqual(this.adId, adData.adId) && kotlin.jvm.internal.Intrinsics.areEqual(this.advertiserId, adData.advertiserId) && kotlin.jvm.internal.Intrinsics.areEqual(this.country, adData.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.page, adData.page) && kotlin.jvm.internal.Intrinsics.areEqual(this.placement, adData.placement) && kotlin.jvm.internal.Intrinsics.areEqual(this.creativeId, adData.creativeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.publisher, adData.publisher) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, adData.campaignId) && kotlin.jvm.internal.Intrinsics.areEqual(this.flightId, adData.flightId) && kotlin.jvm.internal.Intrinsics.areEqual(this.strategy, adData.strategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.templateName, adData.templateName) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawClickUrl, adData.rawClickUrl) && this.adType == adData.adType && kotlin.jvm.internal.Intrinsics.areEqual(this.disclaimerText, adData.disclaimerText) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclaimerLinkText, adData.disclaimerLinkText) && kotlin.jvm.internal.Intrinsics.areEqual(this.disclaimerUrl, adData.disclaimerUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.bgPrimaryColor, adData.bgPrimaryColor);
    }

    public final com.paypal.oslo.feature.ads.domain.model.AdData copy(java.lang.String title, java.lang.String subtitle, java.lang.String ctaText, java.lang.String merchantName, java.lang.String logoUrl, java.lang.String imageUrl, java.lang.Integer width, java.lang.Integer height, java.lang.String contentDescription, java.lang.String impressionUrl, java.lang.String clickUrl, java.util.List<java.lang.String> trackingUrls, java.lang.String adId, java.lang.String advertiserId, java.lang.String country, java.lang.String page, java.lang.String placement, java.lang.String creativeId, java.lang.String publisher, java.lang.String campaignId, java.lang.String flightId, java.lang.String strategy, java.lang.String templateName, java.lang.String rawClickUrl, com.paypal.oslo.feature.ads.domain.model.AdType adType, java.lang.String disclaimerText, java.lang.String disclaimerLinkText, java.lang.String disclaimerUrl, java.lang.String bgPrimaryColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(impressionUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackingUrls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(advertiserId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creativeId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flightId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawClickUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "");
        return new com.paypal.oslo.feature.ads.domain.model.AdData(title, subtitle, ctaText, merchantName, logoUrl, imageUrl, width, height, contentDescription, impressionUrl, clickUrl, trackingUrls, adId, advertiserId, country, page, placement, creativeId, publisher, campaignId, flightId, strategy, templateName, rawClickUrl, adType, disclaimerText, disclaimerLinkText, disclaimerUrl, bgPrimaryColor);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component29, reason: from getter */
    public final java.lang.String getBgPrimaryColor() {
        return this.bgPrimaryColor;
    }

    /* renamed from: component28, reason: from getter */
    public final java.lang.String getDisclaimerUrl() {
        return this.disclaimerUrl;
    }

    /* renamed from: component27, reason: from getter */
    public final java.lang.String getDisclaimerLinkText() {
        return this.disclaimerLinkText;
    }

    /* renamed from: component26, reason: from getter */
    public final java.lang.String getDisclaimerText() {
        return this.disclaimerText;
    }

    /* renamed from: component25, reason: from getter */
    public final com.paypal.oslo.feature.ads.domain.model.AdType getAdType() {
        return this.adType;
    }

    /* renamed from: component24, reason: from getter */
    public final java.lang.String getRawClickUrl() {
        return this.rawClickUrl;
    }

    /* renamed from: component23, reason: from getter */
    public final java.lang.String getTemplateName() {
        return this.templateName;
    }

    /* renamed from: component22, reason: from getter */
    public final java.lang.String getStrategy() {
        return this.strategy;
    }

    /* renamed from: component21, reason: from getter */
    public final java.lang.String getFlightId() {
        return this.flightId;
    }

    /* renamed from: component20, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component19, reason: from getter */
    public final java.lang.String getPublisher() {
        return this.publisher;
    }

    /* renamed from: component18, reason: from getter */
    public final java.lang.String getCreativeId() {
        return this.creativeId;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    /* renamed from: component16, reason: from getter */
    public final java.lang.String getPage() {
        return this.page;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getCountry() {
        return this.country;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.String getAdvertiserId() {
        return this.advertiserId;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getAdId() {
        return this.adId;
    }

    public final java.util.List<java.lang.String> component12() {
        return this.trackingUrls;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getClickUrl() {
        return this.clickUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getImpressionUrl() {
        return this.impressionUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }
}
