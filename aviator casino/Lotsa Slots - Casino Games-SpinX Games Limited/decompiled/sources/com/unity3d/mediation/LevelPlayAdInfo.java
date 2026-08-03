package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8035a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final com.ironsource.C3232q2 d;
    private final com.unity3d.mediation.LevelPlayAdSize e;
    private final java.lang.String f;
    private final java.util.Map<java.lang.String, java.lang.Object> g;

    public LevelPlayAdInfo(java.lang.String adId, java.lang.String adUnitId, java.lang.String adFormat, com.ironsource.C3232q2 c3232q2, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> adapterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.f8035a = adId;
        this.b = adUnitId;
        this.c = adFormat;
        this.d = c3232q2;
        this.e = levelPlayAdSize;
        this.f = str;
        this.g = adapterData;
    }

    private final java.lang.String a() {
        return this.f8035a;
    }

    private final java.lang.String b() {
        return this.b;
    }

    private final java.lang.String c() {
        return this.c;
    }

    public static /* synthetic */ com.unity3d.mediation.LevelPlayAdInfo copy$default(com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, com.ironsource.C3232q2 c3232q2, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.f8035a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.b;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.c;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            c3232q2 = levelPlayAdInfo.d;
        }
        com.ironsource.C3232q2 c3232q22 = c3232q2;
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.e;
        }
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        if ((i & 32) != 0) {
            str4 = levelPlayAdInfo.f;
        }
        java.lang.String str7 = str4;
        if ((i & 64) != 0) {
            map = levelPlayAdInfo.g;
        }
        return levelPlayAdInfo.copy(str, str5, str6, c3232q22, levelPlayAdSize2, str7, map);
    }

    private final com.ironsource.C3232q2 d() {
        return this.d;
    }

    private final com.unity3d.mediation.LevelPlayAdSize e() {
        return this.e;
    }

    private final java.lang.String f() {
        return this.f;
    }

    private final java.util.Map<java.lang.String, java.lang.Object> g() {
        return this.g;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo copy(java.lang.String adId, java.lang.String adUnitId, java.lang.String adFormat, com.ironsource.C3232q2 c3232q2, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> adapterData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        return new com.unity3d.mediation.LevelPlayAdInfo(adId, adUnitId, adFormat, c3232q2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.unity3d.mediation.LevelPlayAdInfo)) {
            return false;
        }
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = (com.unity3d.mediation.LevelPlayAdInfo) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f8035a, levelPlayAdInfo.f8035a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, levelPlayAdInfo.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, levelPlayAdInfo.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, levelPlayAdInfo.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, levelPlayAdInfo.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, levelPlayAdInfo.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, levelPlayAdInfo.g);
    }

    public final java.lang.String getAdId() {
        return this.f8035a;
    }

    public final com.unity3d.mediation.LevelPlayAdSize getAdSize() {
        return this.e;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Double valueOf = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : java.lang.Double.valueOf(m.optDouble("revenue"));
        if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, Double.NaN) || valueOf == null) {
            return 0.0d;
        }
        return valueOf.doubleValue();
    }

    public final java.lang.String getPlacementName() {
        java.lang.String str = this.f;
        return str == null ? "" : str;
    }

    public final java.lang.String getPrecision() {
        com.ironsource.C3402zb d;
        java.lang.String c;
        com.ironsource.C3232q2 c3232q2 = this.d;
        return (c3232q2 == null || (d = c3232q2.d()) == null || (c = d.c()) == null) ? getImpressionPrecision$mediationsdk_release() : c;
    }

    public final double getRevenue() {
        com.ironsource.C3402zb d;
        com.ironsource.C3232q2 c3232q2 = this.d;
        return (c3232q2 == null || (d = c3232q2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : d.d();
    }

    public int hashCode() {
        int hashCode = ((((this.f8035a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        com.ironsource.C3232q2 c3232q2 = this.d;
        int hashCode2 = (hashCode + (c3232q2 == null ? 0 : c3232q2.hashCode())) * 31;
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = this.e;
        int hashCode3 = (hashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        java.lang.String str = this.f;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0033 -> B:8:0x0046). Please report as a decompilation issue!!! */
    public final org.json.JSONObject impressionData$mediationsdk_release() {
        org.json.JSONObject jSONObject;
        java.lang.String str;
        org.json.JSONObject m;
        try {
            com.ironsource.C3232q2 c3232q2 = this.d;
            if (c3232q2 == null || (m = c3232q2.m()) == null) {
                jSONObject = new org.json.JSONObject();
            } else {
                java.util.Iterator<java.lang.String> keys = m.keys();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "it.keys()");
                jSONObject = new org.json.JSONObject(m, (java.lang.String[]) kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.asSequence(keys)).toArray(new java.lang.String[0]));
            }
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("failed to copy impression JSON", e);
            com.ironsource.C3180n4.d().a(e);
            jSONObject = new org.json.JSONObject();
        }
        try {
            java.lang.String placement = jSONObject.optString("placement");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(placement, "placement");
            if (placement.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", kotlin.text.StringsKt.replace$default(placement, com.ironsource.mediationsdk.d.r, str, false, 4, (java.lang.Object) null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("failed to put impression values", e2);
            com.ironsource.C3180n4.d().a(e2);
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    private final /* synthetic */ <T> T a(java.lang.String str) {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        T t = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : (T) m.opt(str);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public /* synthetic */ LevelPlayAdInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, com.ironsource.C3232q2 c3232q2, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, java.lang.String str4, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : c3232q2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(com.unity3d.mediation.LevelPlayAdInfo adInfo, java.lang.String str) {
        this(adInfo.f8035a, adInfo.b, adInfo.c, adInfo.d, adInfo.e, str, adInfo.g);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public final java.lang.String getImpressionPrecision$mediationsdk_release() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("precision");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getCreativeId() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("creativeId");
        if (!(opt instanceof java.lang.String)) {
            opt = null;
        }
        java.lang.String str = (java.lang.String) opt;
        if (str != null) {
            return str;
        }
        java.lang.Object obj = this.g.get("creativeId");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        return str2 == null ? "" : str2;
    }

    public final java.lang.String getEncryptedCPM() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("encryptedCPM");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getInstanceId() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("instanceId");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getInstanceName() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("instanceName");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getAdNetwork() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("adNetwork");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getSegmentName() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("segmentName");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getAb() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("ab");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getCountry() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("country");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getAuctionId() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("auctionId");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getAdFormat() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("adFormat");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? this.c : str;
    }

    public final java.lang.String getAdUnitName() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("mediationAdUnitName");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? "" : str;
    }

    public final java.lang.String getAdUnitId() {
        org.json.JSONObject m;
        com.ironsource.C3232q2 c3232q2 = this.d;
        java.lang.Object opt = (c3232q2 == null || (m = c3232q2.m()) == null) ? null : m.opt("mediationAdUnitId");
        java.lang.String str = (java.lang.String) (opt instanceof java.lang.String ? opt : null);
        return str == null ? this.b : str;
    }
}
