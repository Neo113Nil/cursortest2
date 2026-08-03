package com.ironsource.mediationsdk.adunit.adapter.utility;

/* loaded from: classes5.dex */
public final class AdInfo {
    private final com.ironsource.V8 impressionData;
    private final com.ironsource.C3402zb loadArmData;

    public AdInfo(com.ironsource.V8 v8, com.ironsource.C3402zb c3402zb) {
        this.impressionData = v8;
        this.loadArmData = c3402zb;
    }

    public final java.lang.String getAb() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.a() == null) ? "" : this.impressionData.a();
    }

    public final java.lang.String getAdNetwork() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.c() == null) ? "" : this.impressionData.c();
    }

    public final java.lang.String getAuctionId() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.e() == null) ? "" : this.impressionData.e();
    }

    public final java.lang.String getCountry() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.f() == null) ? "" : this.impressionData.f();
    }

    public final java.lang.String getEncryptedCPM() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.h() == null) ? "" : this.impressionData.h();
    }

    public final java.lang.String getInstanceId() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.i() == null) ? "" : this.impressionData.i();
    }

    public final java.lang.String getInstanceName() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.j() == null) ? "" : this.impressionData.j();
    }

    public final java.lang.String getPrecision() {
        com.ironsource.C3402zb c3402zb = this.loadArmData;
        if (c3402zb != null) {
            return c3402zb.c();
        }
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        com.ironsource.C3402zb c3402zb = this.loadArmData;
        if (c3402zb != null) {
            return c3402zb.d();
        }
        com.ironsource.V8 v8 = this.impressionData;
        if (v8 == null) {
            return 0.0d;
        }
        v8.o();
        return this.impressionData.o();
    }

    public final java.lang.String getSegmentName() {
        com.ironsource.V8 v8 = this.impressionData;
        return (v8 == null || v8.p() == null) ? "" : this.impressionData.p();
    }

    public java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "adInfoData.toString()");
        return jSONObject2;
    }
}
