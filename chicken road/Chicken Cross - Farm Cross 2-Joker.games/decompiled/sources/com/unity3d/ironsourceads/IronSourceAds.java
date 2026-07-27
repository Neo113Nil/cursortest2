package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.N9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* renamed from: a, reason: collision with root package name */
        private final String f11652a;

        AdFormat(String str) {
            this.f11652a = str;
        }

        public final String getValue() {
            return this.f11652a;
        }
    }

    private IronSourceAds() {
    }

    @JvmStatic
    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.5.0";
    }

    @JvmStatic
    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        N9.f7807a.a(context, initRequest, initializationListener);
    }

    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        N9.f7807a.b(z);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        N9.f7807a.a(key, value);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        p.g().a(key, values);
    }
}
