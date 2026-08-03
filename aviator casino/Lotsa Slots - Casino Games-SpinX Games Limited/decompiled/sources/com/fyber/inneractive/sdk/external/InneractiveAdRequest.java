package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveAdRequest extends com.fyber.inneractive.sdk.flow.v0 {
    public static final double FLOOR_PRICE_MAX_VALUE = 400000.0d;
    public static final double FLOOR_PRICE_MIN_VALUE = 0.0d;
    public final java.lang.String c;
    public com.fyber.inneractive.sdk.config.s0 d;
    public java.lang.Double e;

    public InneractiveAdRequest(java.lang.String str) {
        this.c = str;
    }

    public java.lang.Double getFloorPrice() {
        return this.e;
    }

    @java.lang.Deprecated
    public boolean getMuteVideo() {
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.getMuteVideo();
    }

    public com.fyber.inneractive.sdk.config.s0 getSelectedUnitConfig() {
        return this.d;
    }

    public java.lang.String getSpotId() {
        return this.c;
    }

    @java.lang.Deprecated
    public com.fyber.inneractive.sdk.external.InneractiveUserConfig getUserParams() {
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.getUserParams();
    }

    public void setFloorPrice(double d) {
        double max = java.lang.Double.isNaN(d) ? 0.0d : java.lang.Math.max(0.0d, java.lang.Math.min(d, 400000.0d));
        if (max != d) {
            com.fyber.inneractive.sdk.util.IAlog.f("Invalid floor price: %.2f — adjusted to %.2f.", java.lang.Double.valueOf(d), java.lang.Double.valueOf(max));
        }
        this.e = java.lang.Double.valueOf(max);
    }

    @java.lang.Deprecated
    public void setMuteVideo(boolean z) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setMuteVideo(z);
    }

    public void setSelectedUnitConfig(com.fyber.inneractive.sdk.config.s0 s0Var) {
        this.d = s0Var;
    }

    @java.lang.Deprecated
    public void setUserParams(com.fyber.inneractive.sdk.external.InneractiveUserConfig inneractiveUserConfig) {
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setUserParams(inneractiveUserConfig);
    }
}
