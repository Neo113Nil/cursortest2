package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.ISAdQualityAdType f60;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork f61;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final java.lang.String f62;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final double f63;

    /* synthetic */ ISAdQualityCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork iSAdQualityMediationNetwork, com.ironsource.adqualitysdk.sdk.ISAdQualityAdType iSAdQualityAdType, double d, java.lang.String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    private ISAdQualityCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork iSAdQualityMediationNetwork, com.ironsource.adqualitysdk.sdk.ISAdQualityAdType iSAdQualityAdType, double d, java.lang.String str) {
        this.f61 = iSAdQualityMediationNetwork;
        this.f60 = iSAdQualityAdType;
        this.f63 = d;
        this.f62 = str;
    }

    public com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f61;
    }

    public com.ironsource.adqualitysdk.sdk.ISAdQualityAdType getAdType() {
        return this.f60;
    }

    public double getRevenue() {
        return this.f63;
    }

    public java.lang.String getPlacement() {
        return this.f62;
    }

    public static class Builder {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private java.lang.String f64;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private double f66;

        /* renamed from: ｋ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork f65 = com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private com.ironsource.adqualitysdk.sdk.ISAdQualityAdType f67 = com.ironsource.adqualitysdk.sdk.ISAdQualityAdType.UNKNOWN;

        public com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue.Builder setMediationNetwork(com.ironsource.adqualitysdk.sdk.ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f65 = iSAdQualityMediationNetwork;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue.Builder setAdType(com.ironsource.adqualitysdk.sdk.ISAdQualityAdType iSAdQualityAdType) {
            this.f67 = iSAdQualityAdType;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue.Builder setRevenue(double d) {
            this.f66 = d;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue.Builder setPlacement(java.lang.String str) {
            this.f64 = str;
            return this;
        }

        public com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue build() {
            return new com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue(this.f65, this.f67, this.f66, this.f64, (byte) 0);
        }
    }
}
