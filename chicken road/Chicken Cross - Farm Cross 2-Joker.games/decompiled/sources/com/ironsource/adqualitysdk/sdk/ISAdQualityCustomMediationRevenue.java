package com.ironsource.adqualitysdk.sdk;

import com.ironsource.adqualitysdk.sdk.i.AbstractC0647;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes6.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject f61;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f62;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final double f63;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f64;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ISAdQualityMediationNetwork f65;

    @Deprecated
    public static class Builder {

        /* renamed from: ﻐ, reason: contains not printable characters */
        public JSONObject f66;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public String f67;

        /* renamed from: ｋ, reason: contains not printable characters */
        public double f68;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public ISAdQualityMediationNetwork f70 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public ISAdQualityAdType f69 = ISAdQualityAdType.UNKNOWN;

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f70, this.f69, this.f68, this.f67, this.f66);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f69 = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setCustomData(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f66 = AbstractC0647.m5606(jSONObject, false);
            }
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f70 = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f67 = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d) {
            this.f68 = d;
            return this;
        }
    }

    public ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, JSONObject jSONObject) {
        this.f65 = iSAdQualityMediationNetwork;
        this.f64 = iSAdQualityAdType;
        this.f63 = d;
        this.f62 = str;
        this.f61 = jSONObject;
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f64;
    }

    @Deprecated
    public JSONObject getCustomData() {
        return this.f61;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f65;
    }

    @Deprecated
    public String getPlacement() {
        return this.f62;
    }

    @Deprecated
    public double getRevenue() {
        return this.f63;
    }
}
