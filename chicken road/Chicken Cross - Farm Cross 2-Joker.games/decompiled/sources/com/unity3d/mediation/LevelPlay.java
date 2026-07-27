package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4604q9;
import com.ironsource.C4623rb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* renamed from: a, reason: collision with root package name */
        private final String f11676a;

        AdFormat(String str) {
            this.f11676a = str;
        }

        public final String getValue() {
            return this.f11676a;
        }
    }

    private LevelPlay() {
    }

    private final void a(String str) {
        if (StringsKt.equals(str, com.ironsource.mediationsdk.metadata.a.f8424a, true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> META_DATA_COPPA_FLAGS = com.ironsource.mediationsdk.metadata.a.g;
        Intrinsics.checkNotNullExpressionValue(META_DATA_COPPA_FLAGS, "META_DATA_COPPA_FLAGS");
        if ((META_DATA_COPPA_FLAGS instanceof Collection) && META_DATA_COPPA_FLAGS.isEmpty()) {
            return;
        }
        Iterator<T> it = META_DATA_COPPA_FLAGS.iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Publishers: use setImpressionDataListener() on each LevelPlayBannerAdView, LevelPlayInterstitialAd, or LevelPlayRewardedAd. Third-party SDKs: use addImpressionLevelRevenueListener(listener, subscriberId).")
    @JvmStatic
    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C4623rb.f8507a.a(listener);
    }

    @JvmStatic
    public static final void addImpressionLevelRevenueListener(LevelPlayImpressionDataListener listener, String subscriberId) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(subscriberId, "subscriberId");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C4623rb.f8507a.a(listener, subscriberId);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.5.0";
    }

    @JvmStatic
    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C4623rb.f8507a.a(context, initRequest, listener);
    }

    @JvmStatic
    public static final void launchTestSuite(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        p.g().c(context);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Publishers: use setImpressionDataListener(null) on each LevelPlayBannerAdView, LevelPlayInterstitialAd, or LevelPlayRewardedAd.Third-party SDKs: use removeImpressionLevelRevenueListener(listener).")
    @JvmStatic
    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C4623rb.f8507a.b(listener);
    }

    @JvmStatic
    public static final void removeImpressionLevelRevenueListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing subscriber listener: " + listener.getClass().getSimpleName());
        C4623rb.f8507a.c(listener);
    }

    @JvmStatic
    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "use LevelPlayPrivacySettings.setGDPRConsent() for GDPR consent management.", replaceWith = @ReplaceWith(expression = "LevelPlayPrivacySettings.setGDPRConsent(consent)", imports = {"com.unity3d.mediation.LevelPlayPrivacySettings"}))
    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.g().b(z);
    }

    @JvmStatic
    public static final boolean setDynamicUserId(String dynamicUserId) {
        Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return p.g().b(dynamicUserId);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        INSTANCE.a(key);
        C4623rb.f8507a.a(key, value);
    }

    @JvmStatic
    public static final void setNetworkData(String networkKey, JSONObject networkData) {
        Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        p.g().b(networkKey, networkData);
    }

    @JvmStatic
    public static final void setSegment(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C4623rb.f8507a.b(segment);
    }

    @JvmStatic
    public static final void validateIntegration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C4604q9.f8489a.a(context);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        INSTANCE.a(key);
        C4623rb.f8507a.a(key, values);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning("Setting '" + str + "' via setMetaData is deprecated. Use " + str2 + " instead.");
    }
}
