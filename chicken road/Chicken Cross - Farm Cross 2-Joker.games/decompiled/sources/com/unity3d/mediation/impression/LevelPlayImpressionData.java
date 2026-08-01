package com.unity3d.mediation.impression;

import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LevelPlayImpressionData {
    public static final a Companion = new a(null);
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f11689a;
    private final DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(JSONObject allData) {
        Intrinsics.checkNotNullParameter(allData, "allData");
        this.f11689a = allData;
        this.b = new DecimalFormat("#.#####");
    }

    public final String getAb() {
        String it = this.f11689a.optString("ab", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdFormat() {
        String it = this.f11689a.optString("adFormat", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getAdNetwork() {
        String it = this.f11689a.optString("adNetwork", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final JSONObject getAllData() {
        return this.f11689a;
    }

    public final String getAuctionId() {
        String it = this.f11689a.optString("auctionId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCountry() {
        String it = this.f11689a.optString("country", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getCreativeId() {
        String it = this.f11689a.optString("creativeId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getEncryptedCPM() {
        String it = this.f11689a.optString("encryptedCPM", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceId() {
        String it = this.f11689a.optString("instanceId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getInstanceName() {
        String it = this.f11689a.optString("instanceName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitId() {
        String it = this.f11689a.optString("mediationAdUnitId", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getMediationAdUnitName() {
        String it = this.f11689a.optString("mediationAdUnitName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPlacement() {
        String it = this.f11689a.optString("placement", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final String getPrecision() {
        String it = this.f11689a.optString("precision", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final Double getRevenue() {
        Double valueOf = Double.valueOf(this.f11689a.optDouble("revenue"));
        if (Double.isNaN(valueOf.doubleValue())) {
            return null;
        }
        return valueOf;
    }

    public final String getSegmentName() {
        String it = this.f11689a.optString("segmentName", "");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public String toString() {
        return "auctionId: '" + getAuctionId() + "', mediationAdUnitName: '" + getMediationAdUnitName() + "', mediationAdUnitId: '" + getMediationAdUnitId() + "', adFormat: '" + getAdFormat() + "', country: '" + getCountry() + "', ab: '" + getAb() + "', segmentName: '" + getSegmentName() + "', placement: '" + getPlacement() + "', adNetwork: '" + getAdNetwork() + "', instanceName: '" + getInstanceName() + "', instanceId: '" + getInstanceId() + "', revenue: " + (getRevenue() == null ? null : this.b.format(getRevenue())) + ", precision: '" + getPrecision() + "', encryptedCPM: '" + getEncryptedCPM() + "', creativeId: '" + getCreativeId() + "'";
    }
}
