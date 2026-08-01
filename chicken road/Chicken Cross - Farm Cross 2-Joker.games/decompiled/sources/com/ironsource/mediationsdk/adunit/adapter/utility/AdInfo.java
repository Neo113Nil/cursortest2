package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4491k4;
import com.ironsource.C4749yb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class AdInfo {
    private final V8 impressionData;
    private final C4749yb loadArmData;

    public AdInfo(V8 v8, C4749yb c4749yb) {
        this.impressionData = v8;
        this.loadArmData = c4749yb;
    }

    public final String getAb() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.a() == null) ? "" : this.impressionData.a();
    }

    public final String getAdNetwork() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.c() == null) ? "" : this.impressionData.c();
    }

    public final String getAuctionId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.e() == null) ? "" : this.impressionData.e();
    }

    public final String getCountry() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.f() == null) ? "" : this.impressionData.f();
    }

    public final String getEncryptedCPM() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.h() == null) ? "" : this.impressionData.h();
    }

    public final String getInstanceId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.i() == null) ? "" : this.impressionData.i();
    }

    public final String getInstanceName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.j() == null) ? "" : this.impressionData.j();
    }

    public final String getPrecision() {
        C4749yb c4749yb = this.loadArmData;
        if (c4749yb != null) {
            return c4749yb.c();
        }
        V8 v8 = this.impressionData;
        return (v8 == null || v8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        C4749yb c4749yb = this.loadArmData;
        if (c4749yb != null) {
            return c4749yb.d();
        }
        V8 v8 = this.impressionData;
        if (v8 == null) {
            return 0.0d;
        }
        v8.o();
        return this.impressionData.o();
    }

    public final String getSegmentName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.p() == null) ? "" : this.impressionData.p();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
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
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "adInfoData.toString()");
        return jSONObject2;
    }
}
