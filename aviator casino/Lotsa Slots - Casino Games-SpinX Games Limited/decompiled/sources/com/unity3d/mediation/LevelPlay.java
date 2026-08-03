package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlay {
    public static final com.unity3d.mediation.LevelPlay INSTANCE = new com.unity3d.mediation.LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f8033a;

        AdFormat(java.lang.String str) {
            this.f8033a = str;
        }

        public final java.lang.String getValue() {
            return this.f8033a;
        }
    }

    private LevelPlay() {
    }

    private final void a(java.lang.String str) {
        if (kotlin.text.StringsKt.equals(str, "do_not_sell", true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        java.util.List<java.lang.String> a2 = com.ironsource.C3169mb.c.a();
        if ((a2 instanceof java.util.Collection) && a2.isEmpty()) {
            return;
        }
        java.util.Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            if (kotlin.text.StringsKt.equals((java.lang.String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void addImpressionDataListener(com.unity3d.mediation.impression.LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.logger.IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        com.ironsource.C3294tb.f6736a.a(listener);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getSdkVersion() {
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        return "9.4.0";
    }

    @kotlin.jvm.JvmStatic
    public static final void init(android.content.Context context, com.unity3d.mediation.LevelPlayInitRequest initRequest, com.unity3d.mediation.LevelPlayInitListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.C3294tb.f6736a.a(context, initRequest, listener);
    }

    @kotlin.jvm.JvmStatic
    public static final void launchTestSuite(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        com.ironsource.mediationsdk.p.h().c(context);
    }

    @kotlin.jvm.JvmStatic
    public static final void removeImpressionDataListener(com.unity3d.mediation.impression.LevelPlayImpressionDataListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.logger.IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        com.ironsource.C3294tb.f6736a.b(listener);
    }

    @kotlin.jvm.JvmStatic
    public static final void setAdaptersDebug(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("enabled: " + z);
        com.ironsource.mediationsdk.p.h().a(z);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "use LevelPlayPrivacySettings.setGDPRConsents() for GDPR consent management.", replaceWith = @kotlin.ReplaceWith(expression = "LevelPlayPrivacySettings.setGDPRConsents(networkConsents)", imports = {"com.unity3d.mediation.LevelPlayPrivacySettings"}))
    @kotlin.jvm.JvmStatic
    public static final void setConsent(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("consent: " + z);
        com.ironsource.mediationsdk.p.h().b(z);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean setDynamicUserId(java.lang.String dynamicUserId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        com.ironsource.mediationsdk.logger.IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return com.ironsource.mediationsdk.p.h().b(dynamicUserId);
    }

    @kotlin.jvm.JvmStatic
    public static final void setMetaData(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        com.ironsource.mediationsdk.logger.IronLog.API.info("key = " + key + ", value = " + value);
        INSTANCE.a(key);
        com.ironsource.C3294tb.f6736a.a(key, value);
    }

    @kotlin.jvm.JvmStatic
    public static final void setNetworkData(java.lang.String networkKey, org.json.JSONObject networkData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkData, "networkData");
        com.ironsource.mediationsdk.logger.IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        com.ironsource.mediationsdk.p.h().b(networkKey, networkData);
    }

    @kotlin.jvm.JvmStatic
    public static final void setSegment(com.unity3d.mediation.segment.LevelPlaySegment segment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segment, "segment");
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        com.ironsource.C3294tb.f6736a.b(segment);
    }

    @kotlin.jvm.JvmStatic
    public static final void validateIntegration(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        com.ironsource.mediationsdk.logger.IronLog.API.info("");
        com.ironsource.C3221p9.f6553a.a(context);
    }

    @kotlin.jvm.JvmStatic
    public static final void setMetaData(java.lang.String key, java.util.List<java.lang.String> values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
        com.ironsource.mediationsdk.logger.IronLog.API.info("key = " + key + ", values = " + values);
        INSTANCE.a(key);
        com.ironsource.C3294tb.f6736a.a(key, values);
    }

    private final void a(java.lang.String str, java.lang.String str2) {
        com.ironsource.mediationsdk.logger.IronLog.API.warning("Setting '" + str + "' via setMetaData is deprecated. Use " + str2 + " instead.");
    }
}
