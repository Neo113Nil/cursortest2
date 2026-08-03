package com.google.ads.mediation.fyber;

/* loaded from: classes3.dex */
class FyberAdapterUtils {
    private FyberAdapterUtils() {
    }

    public static java.lang.String getSdkVersion() {
        return com.fyber.inneractive.sdk.external.InneractiveAdManager.getVersion();
    }

    public static java.lang.String getAdapterVersion() {
        return com.google.ads.mediation.fyber.BuildConfig.ADAPTER_VERSION;
    }

    static void updateFyberExtraParams(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        com.fyber.inneractive.sdk.external.InneractiveUserConfig inneractiveUserConfig = new com.fyber.inneractive.sdk.external.InneractiveUserConfig();
        if (bundle.containsKey("age")) {
            inneractiveUserConfig.setAge(bundle.getInt("age", 0));
        }
        com.fyber.inneractive.sdk.external.InneractiveAdManager.setUserParams(inneractiveUserConfig);
        if (bundle.containsKey(com.google.ads.mediation.fyber.FyberMediationAdapter.KEY_MUTE_VIDEO)) {
            com.fyber.inneractive.sdk.external.InneractiveAdManager.setMuteVideo(bundle.getBoolean(com.google.ads.mediation.fyber.FyberMediationAdapter.KEY_MUTE_VIDEO, false));
        }
    }
}
