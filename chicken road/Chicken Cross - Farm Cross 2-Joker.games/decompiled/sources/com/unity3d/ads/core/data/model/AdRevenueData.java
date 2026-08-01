package com.unity3d.ads.core.data.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdRevenueData.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/unity3d/ads/core/data/model/AdRevenueData;", "", "eventId", "Ljava/util/UUID;", "revenue", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "networkName", "adUnitId", "thirdPartyAdPlacementId", "adFormat", "Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "<init>", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)V", "getEventId", "()Ljava/util/UUID;", "getRevenue", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCountryCode", "()Ljava/lang/String;", "getNetworkName", "getAdUnitId", "getThirdPartyAdPlacementId", "getAdFormat", "()Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/UUID;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdRevenueAdFormat;)Lcom/unity3d/ads/core/data/model/AdRevenueData;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AdRevenueData {
    private final AdRevenueAdFormat adFormat;
    private final String adUnitId;
    private final String countryCode;
    private final UUID eventId;
    private final String networkName;
    private final Double revenue;
    private final String thirdPartyAdPlacementId;

    public static /* synthetic */ AdRevenueData copy$default(AdRevenueData adRevenueData, UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = adRevenueData.eventId;
        }
        if ((i & 2) != 0) {
            d = adRevenueData.revenue;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str = adRevenueData.countryCode;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = adRevenueData.networkName;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = adRevenueData.adUnitId;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = adRevenueData.thirdPartyAdPlacementId;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            adRevenueAdFormat = adRevenueData.adFormat;
        }
        return adRevenueData.copy(uuid, d2, str5, str6, str7, str8, adRevenueAdFormat);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getEventId() {
        return this.eventId;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getRevenue() {
        return this.revenue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    /* renamed from: component7, reason: from getter */
    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }

    public final AdRevenueData copy(UUID eventId, Double revenue, String countryCode, String networkName, String adUnitId, String thirdPartyAdPlacementId, AdRevenueAdFormat adFormat) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        return new AdRevenueData(eventId, revenue, countryCode, networkName, adUnitId, thirdPartyAdPlacementId, adFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdRevenueData)) {
            return false;
        }
        AdRevenueData adRevenueData = (AdRevenueData) other;
        return Intrinsics.areEqual(this.eventId, adRevenueData.eventId) && Intrinsics.areEqual((Object) this.revenue, (Object) adRevenueData.revenue) && Intrinsics.areEqual(this.countryCode, adRevenueData.countryCode) && Intrinsics.areEqual(this.networkName, adRevenueData.networkName) && Intrinsics.areEqual(this.adUnitId, adRevenueData.adUnitId) && Intrinsics.areEqual(this.thirdPartyAdPlacementId, adRevenueData.thirdPartyAdPlacementId) && this.adFormat == adRevenueData.adFormat;
    }

    public int hashCode() {
        int hashCode = this.eventId.hashCode() * 31;
        Double d = this.revenue;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.countryCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.networkName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.adUnitId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.thirdPartyAdPlacementId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AdRevenueAdFormat adRevenueAdFormat = this.adFormat;
        return hashCode6 + (adRevenueAdFormat != null ? adRevenueAdFormat.hashCode() : 0);
    }

    public String toString() {
        return "AdRevenueData(eventId=" + this.eventId + ", revenue=" + this.revenue + ", countryCode=" + this.countryCode + ", networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", thirdPartyAdPlacementId=" + this.thirdPartyAdPlacementId + ", adFormat=" + this.adFormat + ')';
    }

    public AdRevenueData(UUID eventId, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventId = eventId;
        this.revenue = d;
        this.countryCode = str;
        this.networkName = str2;
        this.adUnitId = str3;
        this.thirdPartyAdPlacementId = str4;
        this.adFormat = adRevenueAdFormat;
    }

    public /* synthetic */ AdRevenueData(UUID uuid, Double d, String str, String str2, String str3, String str4, AdRevenueAdFormat adRevenueAdFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID() : uuid, d, str, str2, str3, str4, adRevenueAdFormat);
    }

    public final UUID getEventId() {
        return this.eventId;
    }

    public final Double getRevenue() {
        return this.revenue;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getNetworkName() {
        return this.networkName;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getThirdPartyAdPlacementId() {
        return this.thirdPartyAdPlacementId;
    }

    public final AdRevenueAdFormat getAdFormat() {
        return this.adFormat;
    }
}
