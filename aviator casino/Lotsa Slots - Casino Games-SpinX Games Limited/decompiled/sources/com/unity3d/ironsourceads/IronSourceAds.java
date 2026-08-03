package com.unity3d.ironsourceads;

/* loaded from: classes5.dex */
public final class IronSourceAds {
    public static final com.unity3d.ironsourceads.IronSourceAds INSTANCE = new com.unity3d.ironsourceads.IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f8009a;

        AdFormat(java.lang.String str) {
            this.f8009a = str;
        }

        public final java.lang.String getValue() {
            return this.f8009a;
        }
    }

    private IronSourceAds() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enableDebugMode(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("enabled: " + z);
        com.ironsource.mediationsdk.p.h().a(z);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getSdkVersion() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        return "9.4.0";
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context, com.unity3d.ironsourceads.InitRequest initRequest, com.unity3d.ironsourceads.InitListener initializationListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        com.ironsource.N9.f5854a.a(context, initRequest, initializationListener);
    }

    @kotlin.jvm.JvmStatic
    public static final void setConsent(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("consent: " + z);
        com.ironsource.N9.f5854a.b(z);
    }

    @kotlin.jvm.JvmStatic
    public static final void setMetaData(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.ironsource.mediationsdk.logger.IronLog.API.info("key = " + key + ", value = " + value);
        com.ironsource.N9.f5854a.a(key, value);
    }

    @kotlin.jvm.JvmStatic
    public static final void setMetaData(java.lang.String key, java.util.List<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        com.ironsource.mediationsdk.logger.IronLog.API.info("key = " + key + ", values = " + values);
        com.ironsource.mediationsdk.p.h().a(key, values);
    }
}
