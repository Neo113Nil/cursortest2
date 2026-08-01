package com.inmobi.unification.sdk.model.initialization;

import com.inmobi.media.AbstractC4275zj;
import com.inmobi.media.Dm;
import com.inmobi.media.Em;
import com.ironsource.C4561o2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TimeoutConfigurations implements Serializable {
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_AB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final String APPLOVIN_CUSTOM_KEY = "c_applovincustom";
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_AUDIO_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_LOAD_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_MUTT_TIMEOUT = 9500;
    private static final int APPLOVIN_NONAB_DEFAULT_BANNER_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_INTERSTITIAL_RETRY_INTERVAL = 1000;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_LOAD_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MAX_RETRIES = 3;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_MUTT_TIMEOUT = 14500;
    private static final int APPLOVIN_NONAB_DEFAULT_NATIVE_RETRY_INTERVAL = 1000;
    private static final int DEFAULT_AB_AUDIO_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_BANNER_LOAD_TIMEOUT = 14500;
    private static final int DEFAULT_AB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_AB_NATIVE_LOAD_TIMEOUT = 14500;
    private static final String DEFAULT_KEY = "default";
    private static final int DEFAULT_MAX_RETRIES = 3;
    private static final int DEFAULT_NONAB_AUDIO_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_AUDIO_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_BANNER_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_INTERSTITIAL_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_LOAD_TIMEOUT = 29500;
    private static final int DEFAULT_NONAB_NATIVE_MUTT_TIMEOUT = 29500;
    private static final int DEFAULT_RETRY_INTERVAL = 1000;
    public static final int DEFAULT_TIMEOUT = 15000;
    private static final Function1<JSONObject, Boolean> adaptiveBannerControlValidator;
    private static final JSONObject defaultABAudioMaxRetries;
    private static final JSONObject defaultABAudioRetryInterval;
    private static final JSONObject defaultABAudioloadTimeout;
    private static final JSONObject defaultABBannerAdaptiveBannerControl;
    private static final JSONObject defaultABBannerMaxRetries;
    private static final JSONObject defaultABBannerRetryInterval;
    private static final JSONObject defaultABBannerloadTimeout;
    private static final JSONObject defaultABIntMaxRetries;
    private static final JSONObject defaultABIntRetryInterval;
    private static final JSONObject defaultABIntloadTimeout;
    private static final JSONObject defaultABNativeMaxRetries;
    private static final JSONObject defaultABNativeRetryInterval;
    private static final JSONObject defaultABNativeloadTimeout;
    private static final JSONObject defaultNonABAudioMaxRetries;
    private static final JSONObject defaultNonABAudioMuttTimeout;
    private static final JSONObject defaultNonABAudioRetryInterval;
    private static final JSONObject defaultNonABAudioloadTimeout;
    private static final JSONObject defaultNonABBannerAdaptiveBannerControl;
    private static final JSONObject defaultNonABBannerMaxRetries;
    private static final JSONObject defaultNonABBannerMuttTimeout;
    private static final JSONObject defaultNonABBannerRetryInterval;
    private static final JSONObject defaultNonABIntMaxRetries;
    private static final JSONObject defaultNonABIntMuttTimeout;
    private static final JSONObject defaultNonABIntRetryInterval;
    private static final JSONObject defaultNonABIntloadTimeout;
    private static final JSONObject defaultNonABNativeMaxRetries;
    private static final JSONObject defaultNonABNativeMuttTimeout;
    private static final JSONObject defaultNonABNativeRetryInterval;
    private static final JSONObject defaultNonABNativeloadTimeout;
    private static final JSONObject defaultPreloadAudioMaxRetries;
    private static final JSONObject defaultPreloadAudioMuttTimeout;
    private static final JSONObject defaultPreloadAudioPreloadTimeout;
    private static final JSONObject defaultPreloadAudioRetryInterval;
    private static final JSONObject defaultPreloadAudioloadTimeout;
    private static final JSONObject defaultPreloadBannerLoadTimeout;
    private static final JSONObject defaultPreloadBannerMaxRetries;
    private static final JSONObject defaultPreloadBannerMuttTimeout;
    private static final JSONObject defaultPreloadBannerPreloadTimeout;
    private static final JSONObject defaultPreloadBannerRetryInterval;
    private static final JSONObject defaultPreloadIntMaxRetries;
    private static final JSONObject defaultPreloadIntMuttTimeout;
    private static final JSONObject defaultPreloadIntPreloadTimeout;
    private static final JSONObject defaultPreloadIntRetryInterval;
    private static final JSONObject defaultPreloadIntloadTimeout;
    private static final JSONObject defaultPreloadNativeMaxRetries;
    private static final JSONObject defaultPreloadNativeMuttTimeout;
    private static final JSONObject defaultPreloadNativePreloadTimeout;
    private static final JSONObject defaultPreloadNativeRetryInterval;
    private static final JSONObject defaultPreloadNativeloadTimeout;
    private static final Function2<JSONObject, Integer, Boolean> validator;
    public static final Em Companion = new Em();
    private static final String APPLOVIN_KEY = "c_applovin";
    private static final JSONObject defaultNonABBannerloadTimeout = Dm.a(29500, 9500, "default", APPLOVIN_KEY);
    private int step4s = 15000;
    private MediationConfig mediationConfig = new MediationConfig();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ABConfig {
        private AdABConfig audio;
        private AdABConfig banner;
        private AdABConfig int;
        private AdABConfig native;

        public ABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdABConfig(TimeoutConfigurations.defaultABBannerloadTimeout, TimeoutConfigurations.defaultABBannerRetryInterval, TimeoutConfigurations.defaultABBannerMaxRetries, TimeoutConfigurations.defaultABBannerAdaptiveBannerControl);
            this.int = new AdABConfig(TimeoutConfigurations.defaultABIntloadTimeout, TimeoutConfigurations.defaultABIntRetryInterval, TimeoutConfigurations.defaultABIntMaxRetries, null, 8, null);
            this.native = new AdABConfig(TimeoutConfigurations.defaultABNativeloadTimeout, TimeoutConfigurations.defaultABNativeRetryInterval, TimeoutConfigurations.defaultABNativeMaxRetries, null, 8, null);
            this.audio = new AdABConfig(TimeoutConfigurations.defaultABAudioloadTimeout, TimeoutConfigurations.defaultABAudioRetryInterval, TimeoutConfigurations.defaultABAudioMaxRetries, null, 8, null);
        }

        public final AdABConfig getAudio() {
            return this.audio;
        }

        public final AdABConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final AdABConfig getInt() {
            return this.int;
        }

        public final AdABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$MediationConfig;", "", "<init>", "()V", "ab", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "nonAb", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "preload", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "getABConfig", "getNonABConfig", "getPreloadConfig", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MediationConfig {
        private ABConfig ab = new ABConfig();
        private NonABConfig nonAb = new NonABConfig();
        private PreloadConfig preload = new PreloadConfig();

        /* renamed from: getABConfig, reason: from getter */
        public final ABConfig getAb() {
            return this.ab;
        }

        /* renamed from: getNonABConfig, reason: from getter */
        public final NonABConfig getNonAb() {
            return this.nonAb;
        }

        /* renamed from: getPreloadConfig, reason: from getter */
        public final PreloadConfig getPreload() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonABConfig {
        private AdNonABConfig audio;
        private AdNonABConfig banner;
        private AdNonABConfig int;
        private AdNonABConfig native;

        public NonABConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdNonABConfig(TimeoutConfigurations.defaultNonABBannerloadTimeout, TimeoutConfigurations.defaultNonABBannerMuttTimeout, TimeoutConfigurations.defaultNonABBannerRetryInterval, TimeoutConfigurations.defaultNonABBannerMaxRetries, TimeoutConfigurations.defaultNonABBannerAdaptiveBannerControl);
            this.int = new AdNonABConfig(TimeoutConfigurations.defaultNonABIntloadTimeout, TimeoutConfigurations.defaultNonABIntMuttTimeout, TimeoutConfigurations.defaultNonABIntRetryInterval, TimeoutConfigurations.defaultNonABIntMaxRetries, null, 16, null);
            this.native = new AdNonABConfig(TimeoutConfigurations.defaultNonABNativeloadTimeout, TimeoutConfigurations.defaultNonABNativeMuttTimeout, TimeoutConfigurations.defaultNonABNativeRetryInterval, TimeoutConfigurations.defaultNonABNativeMaxRetries, null, 16, null);
            this.audio = new AdNonABConfig(TimeoutConfigurations.defaultNonABAudioloadTimeout, TimeoutConfigurations.defaultNonABAudioMuttTimeout, TimeoutConfigurations.defaultNonABAudioRetryInterval, TimeoutConfigurations.defaultNonABAudioMaxRetries, null, 16, null);
        }

        public final AdNonABConfig getAudio() {
            return this.audio;
        }

        public final AdNonABConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final AdNonABConfig getInt() {
            return this.int;
        }

        public final AdNonABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreloadConfig {
        private AdPreloadConfig audio;
        private AdPreloadConfig banner;
        private AdPreloadConfig int;
        private AdPreloadConfig native;

        public PreloadConfig() {
            TimeoutConfigurations.Companion.getClass();
            this.banner = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, TimeoutConfigurations.defaultPreloadBannerMuttTimeout, TimeoutConfigurations.defaultPreloadBannerLoadTimeout, TimeoutConfigurations.defaultPreloadBannerRetryInterval, TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.int = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadIntPreloadTimeout, TimeoutConfigurations.defaultPreloadIntMuttTimeout, TimeoutConfigurations.defaultPreloadIntloadTimeout, TimeoutConfigurations.defaultPreloadIntRetryInterval, TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.native = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadNativePreloadTimeout, TimeoutConfigurations.defaultPreloadNativeMuttTimeout, TimeoutConfigurations.defaultPreloadNativeloadTimeout, TimeoutConfigurations.defaultPreloadNativeRetryInterval, TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new AdPreloadConfig(TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, TimeoutConfigurations.defaultPreloadAudioMuttTimeout, TimeoutConfigurations.defaultPreloadAudioloadTimeout, TimeoutConfigurations.defaultPreloadAudioRetryInterval, TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        public final AdPreloadConfig getAudio() {
            return this.audio;
        }

        public final AdPreloadConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final AdPreloadConfig getInt() {
            return this.int;
        }

        public final AdPreloadConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$RenderTimeoutByType;", "", "<init>", "()V", "", "adType", "", "defValue", "getTimeoutByType$media_release", "(Ljava/lang/String;I)I", "getTimeoutByType", "timeout", "", "setTimeoutByType", "(Ljava/lang/String;I)V", "banner", "I", "getBanner$media_release", "()I", "setBanner$media_release", "(I)V", "audio", "getAudio$media_release", "setAudio$media_release", "int", "getInt$media_release", "setInt$media_release", "native", "getNative$media_release", "setNative$media_release", k.M, "com/inmobi/unification/sdk/model/initialization/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderTimeoutByType {
        public static final a Companion = new a();
        private int audio;
        private int banner;
        private int int;
        private int native;

        public /* synthetic */ RenderTimeoutByType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getAudio$media_release, reason: from getter */
        public final int getAudio() {
            return this.audio;
        }

        /* renamed from: getBanner$media_release, reason: from getter */
        public final int getBanner() {
            return this.banner;
        }

        /* renamed from: getInt$media_release, reason: from getter */
        public final int getInt() {
            return this.int;
        }

        /* renamed from: getNative$media_release, reason: from getter */
        public final int getNative() {
            return this.native;
        }

        public final int getTimeoutByType$media_release(String adType, int defValue) {
            int i;
            int i2;
            int i3;
            int i4;
            Intrinsics.checkNotNullParameter(adType, "adType");
            int hashCode = adType.hashCode();
            if (hashCode != -1396342996) {
                if (hashCode != -1052618729) {
                    if (hashCode != 104431) {
                        if (hashCode == 93166550 && adType.equals("audio") && (i4 = this.audio) > 0) {
                            return i4;
                        }
                    } else if (adType.equals("int") && (i3 = this.int) > 0) {
                        return i3;
                    }
                } else if (adType.equals("native") && (i2 = this.native) > 0) {
                    return i2;
                }
            } else if (adType.equals("banner") && (i = this.banner) > 0) {
                return i;
            }
            return defValue;
        }

        public final void setAudio$media_release(int i) {
            this.audio = i;
        }

        public final void setBanner$media_release(int i) {
            this.banner = i;
        }

        public final void setInt$media_release(int i) {
            this.int = i;
        }

        public final void setNative$media_release(int i) {
            this.native = i;
        }

        public final void setTimeoutByType(String adType, int timeout) {
            Intrinsics.checkNotNullParameter(adType, "adType");
            int hashCode = adType.hashCode();
            if (hashCode == -1396342996) {
                if (adType.equals("banner")) {
                    this.banner = timeout;
                }
            } else if (hashCode == -1052618729) {
                if (adType.equals("native")) {
                    this.native = timeout;
                }
            } else if (hashCode == 104431) {
                if (adType.equals("int")) {
                    this.int = timeout;
                }
            } else if (hashCode == 93166550 && adType.equals("audio")) {
                this.audio = timeout;
            }
        }

        private RenderTimeoutByType() {
        }
    }

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", true);
        jSONObject.put(APPLOVIN_KEY, true);
        jSONObject.put(APPLOVIN_CUSTOM_KEY, true);
        defaultNonABBannerAdaptiveBannerControl = jSONObject;
        defaultNonABBannerMuttTimeout = Dm.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABBannerMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABBannerRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABIntloadTimeout = Dm.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABIntMuttTimeout = Dm.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABIntMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABIntRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABNativeloadTimeout = Dm.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABNativeMuttTimeout = Dm.a(29500, 14500, "default", APPLOVIN_KEY);
        defaultNonABNativeMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABNativeRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultNonABAudioloadTimeout = Dm.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABAudioMuttTimeout = Dm.a(29500, 9500, "default", APPLOVIN_KEY);
        defaultNonABAudioMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultNonABAudioRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABBannerloadTimeout = Dm.a(14500, 9500, "default", APPLOVIN_KEY);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("default", true);
        jSONObject2.put(APPLOVIN_KEY, true);
        jSONObject2.put(APPLOVIN_CUSTOM_KEY, true);
        defaultABBannerAdaptiveBannerControl = jSONObject2;
        defaultABBannerMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultABBannerRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABIntloadTimeout = Dm.a(29500, 29500, "default", APPLOVIN_KEY);
        defaultABIntMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultABIntRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABNativeloadTimeout = Dm.a(14500, 14500, "default", APPLOVIN_KEY);
        defaultABNativeMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultABNativeRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultABAudioloadTimeout = Dm.a(14500, 9500, "default", APPLOVIN_KEY);
        defaultABAudioMaxRetries = Dm.a(3, 3, "default", APPLOVIN_KEY);
        defaultABAudioRetryInterval = Dm.a(1000, 1000, "default", APPLOVIN_KEY);
        defaultPreloadBannerPreloadTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadBannerMuttTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadBannerLoadTimeout = AbstractC4275zj.a("default", 14500);
        defaultPreloadBannerMaxRetries = AbstractC4275zj.a("default", 3);
        defaultPreloadBannerRetryInterval = AbstractC4275zj.a("default", 1000);
        defaultPreloadIntPreloadTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadIntMuttTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadIntloadTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadIntMaxRetries = AbstractC4275zj.a("default", 3);
        defaultPreloadIntRetryInterval = AbstractC4275zj.a("default", 1000);
        defaultPreloadNativePreloadTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadNativeMuttTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadNativeloadTimeout = AbstractC4275zj.a("default", 14500);
        defaultPreloadNativeMaxRetries = AbstractC4275zj.a("default", 3);
        defaultPreloadNativeRetryInterval = AbstractC4275zj.a("default", 1000);
        defaultPreloadAudioPreloadTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadAudioMuttTimeout = AbstractC4275zj.a("default", 29500);
        defaultPreloadAudioloadTimeout = AbstractC4275zj.a("default", 14500);
        defaultPreloadAudioMaxRetries = AbstractC4275zj.a("default", 3);
        defaultPreloadAudioRetryInterval = AbstractC4275zj.a("default", 1000);
        validator = new Function2() { // from class: com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj, ((Integer) obj2).intValue()));
            }
        };
        adaptiveBannerControlValidator = new Function1() { // from class: com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TimeoutConfigurations.a((JSONObject) obj));
            }
        };
    }

    public final MediationConfig a0() {
        return this.mediationConfig;
    }

    public final int b0() {
        return this.step4s;
    }

    public final boolean c0() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void d0() {
        int i = this.step4s;
        if (i <= 0) {
            i = 15000;
        }
        this.step4s = i;
    }

    public static final boolean a(JSONObject param, int i) {
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> keys = param.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (param.getInt(keys.next()) < i) {
                z = false;
            }
        }
        return z;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "", "<init>", "()V", C4561o2.t, "Lorg/json/JSONObject;", "retryInterval", "maxRetries", "adaptiveBannerControl", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "getAdaptiveBannerControl", "isAdaptiveBannerEnabled", "", "tp", "", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdABConfig {
        private JSONObject adaptiveBannerControl;
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
            this.adaptiveBannerControl = new JSONObject();
        }

        public final JSONObject getAdaptiveBannerControl() {
            return this.adaptiveBannerControl;
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isAdaptiveBannerEnabled(String tp) {
            JSONObject jSONObject = this.adaptiveBannerControl;
            return jSONObject.optBoolean(tp, jSONObject.optBoolean("default", true));
        }

        public final boolean isValid() {
            Em em = TimeoutConfigurations.Companion;
            em.getClass();
            if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                em.getClass();
                if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    em.getClass();
                    if (((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        if (this.adaptiveBannerControl.length() != 0) {
                            em.getClass();
                            if (((Boolean) TimeoutConfigurations.adaptiveBannerControlValidator.invoke(this.adaptiveBannerControl)).booleanValue()) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ AdABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, jSONObject2, jSONObject3, (i & 8) != 0 ? new JSONObject() : jSONObject4);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries, JSONObject adaptiveBannerControl) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            Intrinsics.checkNotNullParameter(adaptiveBannerControl, "adaptiveBannerControl");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
            this.adaptiveBannerControl = adaptiveBannerControl;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B3\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "", "<init>", "()V", C4561o2.t, "Lorg/json/JSONObject;", "muttTimeout", "retryInterval", "maxRetries", "adaptiveBannerControl", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getMuttTimeout", "getRetryInterval", "getMaxRetries", "getAdaptiveBannerControl", "isAdaptiveBannerEnabled", "", "tp", "", "isValid", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNonABConfig {
        private JSONObject adaptiveBannerControl;
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
            this.adaptiveBannerControl = new JSONObject();
        }

        public final JSONObject getAdaptiveBannerControl() {
            return this.adaptiveBannerControl;
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isAdaptiveBannerEnabled(String tp) {
            JSONObject jSONObject = this.adaptiveBannerControl;
            return jSONObject.optBoolean(tp, jSONObject.optBoolean("default", true));
        }

        public final boolean isValid() {
            Em em = TimeoutConfigurations.Companion;
            em.getClass();
            if (((Boolean) TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue()) {
                em.getClass();
                if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                    em.getClass();
                    if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                        em.getClass();
                        if (((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                            if (this.adaptiveBannerControl.length() != 0) {
                                em.getClass();
                                if (((Boolean) TimeoutConfigurations.adaptiveBannerControlValidator.invoke(this.adaptiveBannerControl)).booleanValue()) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        public /* synthetic */ AdNonABConfig(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(jSONObject, jSONObject2, jSONObject3, jSONObject4, (i & 16) != 0 ? new JSONObject() : jSONObject5);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(JSONObject loadTimeout, JSONObject muttTimeout, JSONObject retryInterval, JSONObject maxRetries, JSONObject adaptiveBannerControl) {
            this();
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            Intrinsics.checkNotNullParameter(adaptiveBannerControl, "adaptiveBannerControl");
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
            this.adaptiveBannerControl = adaptiveBannerControl;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "", "<init>", "()V", "preloadTimeout", "Lorg/json/JSONObject;", "muttTimeout", C4561o2.t, "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getPreloadTimeout", "getMuttTimeout", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdPreloadConfig {
        private JSONObject loadRetryInterval;
        private JSONObject loadTimeout;
        private JSONObject maxLoadRetries;
        private JSONObject muttTimeout;
        private JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new JSONObject();
            this.muttTimeout = new JSONObject();
            this.loadTimeout = new JSONObject();
            this.loadRetryInterval = new JSONObject();
            this.maxLoadRetries = new JSONObject();
        }

        public final JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        public final JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            Em em = TimeoutConfigurations.Companion;
            em.getClass();
            if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                em.getClass();
                if (((Boolean) TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    em.getClass();
                    if (((Boolean) TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(JSONObject preloadTimeout, JSONObject muttTimeout, JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries) {
            this();
            Intrinsics.checkNotNullParameter(preloadTimeout, "preloadTimeout");
            Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    public static final boolean a(JSONObject param) {
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> keys = param.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (!(param.opt(keys.next()) instanceof Boolean)) {
                z = false;
            }
        }
        return z;
    }
}
