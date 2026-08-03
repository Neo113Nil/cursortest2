package com.ironsource.mediationsdk.adunit.adapter.utility;

/* loaded from: classes5.dex */
public final class NativeAdProperties {
    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition adOptionsPosition;
    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition defaultAdOptionPosition;

    public NativeAdProperties(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.defaultAdOptionPosition = com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.BOTTOM_LEFT;
        this.adOptionsPosition = getAdOptionsPosition(config);
    }

    public final com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    private final com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition getAdOptionsPosition(org.json.JSONObject jSONObject) {
        java.lang.String position = jSONObject.optString(com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.AD_OPTIONS_POSITION_KEY, this.defaultAdOptionPosition.toString());
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(position, "position");
            return com.ironsource.mediationsdk.adunit.adapter.utility.AdOptionsPosition.valueOf(position);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return this.defaultAdOptionPosition;
        }
    }
}
