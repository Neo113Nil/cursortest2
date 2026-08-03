package com.unity3d.mediation.impression;

/* loaded from: classes5.dex */
public final class LevelPlayImpressionData {
    public static final com.unity3d.mediation.impression.LevelPlayImpressionData.a Companion = new com.unity3d.mediation.impression.LevelPlayImpressionData.a(null);
    public static final java.lang.String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final java.lang.String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final java.lang.String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final java.lang.String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final java.lang.String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final java.lang.String IMPRESSION_DATA_KEY_CREATIVE_ID = "creativeId";
    public static final java.lang.String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final java.lang.String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final java.lang.String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final java.lang.String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final java.lang.String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final java.lang.String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final java.lang.String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final java.lang.String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final java.lang.String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f8046a;
    private final java.text.DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LevelPlayImpressionData(org.json.JSONObject allData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allData, "allData");
        this.f8046a = allData;
        this.b = new java.text.DecimalFormat("#.#####");
    }

    public final java.lang.String getAb() {
        java.lang.String it = this.f8046a.optString("ab", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getAdFormat() {
        java.lang.String it = this.f8046a.optString("adFormat", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getAdNetwork() {
        java.lang.String it = this.f8046a.optString("adNetwork", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final org.json.JSONObject getAllData() {
        return this.f8046a;
    }

    public final java.lang.String getAuctionId() {
        java.lang.String it = this.f8046a.optString("auctionId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getCountry() {
        java.lang.String it = this.f8046a.optString("country", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getCreativeId() {
        java.lang.String it = this.f8046a.optString("creativeId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getEncryptedCPM() {
        java.lang.String it = this.f8046a.optString("encryptedCPM", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getInstanceId() {
        java.lang.String it = this.f8046a.optString("instanceId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getInstanceName() {
        java.lang.String it = this.f8046a.optString("instanceName", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getMediationAdUnitId() {
        java.lang.String it = this.f8046a.optString("mediationAdUnitId", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getMediationAdUnitName() {
        java.lang.String it = this.f8046a.optString("mediationAdUnitName", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getPlacement() {
        java.lang.String it = this.f8046a.optString("placement", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.String getPrecision() {
        java.lang.String it = this.f8046a.optString("precision", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public final java.lang.Double getRevenue() {
        java.lang.Double valueOf = java.lang.Double.valueOf(this.f8046a.optDouble("revenue"));
        if (java.lang.Double.isNaN(valueOf.doubleValue())) {
            return null;
        }
        return valueOf;
    }

    public final java.lang.String getSegmentName() {
        java.lang.String it = this.f8046a.optString("segmentName", "");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.length() > 0) {
            return it;
        }
        return null;
    }

    public java.lang.String toString() {
        return "auctionId: '" + getAuctionId() + "', mediationAdUnitName: '" + getMediationAdUnitName() + "', mediationAdUnitId: '" + getMediationAdUnitId() + "', adFormat: '" + getAdFormat() + "', country: '" + getCountry() + "', ab: '" + getAb() + "', segmentName: '" + getSegmentName() + "', placement: '" + getPlacement() + "', adNetwork: '" + getAdNetwork() + "', instanceName: '" + getInstanceName() + "', instanceId: '" + getInstanceId() + "', revenue: " + (getRevenue() == null ? null : this.b.format(getRevenue())) + ", precision: '" + getPrecision() + "', encryptedCPM: '" + getEncryptedCPM() + "', creativeId: '" + getCreativeId() + "'";
    }
}
