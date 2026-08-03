package com.inmobi.unification.sdk.model.initialization;

/* loaded from: classes5.dex */
public final class TimeoutConfigurations implements java.io.Serializable {
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
    private static final java.lang.String DEFAULT_KEY = "default";
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
    public static final com.inmobi.media.Ik Companion = new com.inmobi.media.Ik();
    private static final java.lang.String APPLOVIN_KEY = "c_applovin";
    private static final org.json.JSONObject defaultNonABBannerloadTimeout = com.inmobi.media.Hk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABBannerMuttTimeout = com.inmobi.media.Hk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABBannerMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABBannerRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABIntloadTimeout = com.inmobi.media.Hk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABIntMuttTimeout = com.inmobi.media.Hk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABIntMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABIntRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABNativeloadTimeout = com.inmobi.media.Hk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABNativeMuttTimeout = com.inmobi.media.Hk.a(29500, 14500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABNativeMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABNativeRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABAudioloadTimeout = com.inmobi.media.Hk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABAudioMuttTimeout = com.inmobi.media.Hk.a(29500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABAudioMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultNonABAudioRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABBannerloadTimeout = com.inmobi.media.Hk.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABBannerMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABBannerRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABIntloadTimeout = com.inmobi.media.Hk.a(29500, 29500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABIntMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABIntRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABNativeloadTimeout = com.inmobi.media.Hk.a(14500, 14500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABNativeMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABNativeRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABAudioloadTimeout = com.inmobi.media.Hk.a(14500, 9500, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABAudioMaxRetries = com.inmobi.media.Hk.a(3, 3, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultABAudioRetryInterval = com.inmobi.media.Hk.a(1000, 1000, "default", APPLOVIN_KEY);
    private static final org.json.JSONObject defaultPreloadBannerPreloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadBannerMuttTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadBannerLoadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 14500);
    private static final org.json.JSONObject defaultPreloadBannerMaxRetries = com.inmobi.media.AbstractC2541ki.a("default", 3);
    private static final org.json.JSONObject defaultPreloadBannerRetryInterval = com.inmobi.media.AbstractC2541ki.a("default", 1000);
    private static final org.json.JSONObject defaultPreloadIntPreloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadIntMuttTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadIntloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadIntMaxRetries = com.inmobi.media.AbstractC2541ki.a("default", 3);
    private static final org.json.JSONObject defaultPreloadIntRetryInterval = com.inmobi.media.AbstractC2541ki.a("default", 1000);
    private static final org.json.JSONObject defaultPreloadNativePreloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadNativeMuttTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadNativeloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 14500);
    private static final org.json.JSONObject defaultPreloadNativeMaxRetries = com.inmobi.media.AbstractC2541ki.a("default", 3);
    private static final org.json.JSONObject defaultPreloadNativeRetryInterval = com.inmobi.media.AbstractC2541ki.a("default", 1000);
    private static final org.json.JSONObject defaultPreloadAudioPreloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadAudioMuttTimeout = com.inmobi.media.AbstractC2541ki.a("default", 29500);
    private static final org.json.JSONObject defaultPreloadAudioloadTimeout = com.inmobi.media.AbstractC2541ki.a("default", 14500);
    private static final org.json.JSONObject defaultPreloadAudioMaxRetries = com.inmobi.media.AbstractC2541ki.a("default", 3);
    private static final org.json.JSONObject defaultPreloadAudioRetryInterval = com.inmobi.media.AbstractC2541ki.a("default", 1000);
    private static final kotlin.jvm.functions.Function2<org.json.JSONObject, java.lang.Integer, java.lang.Boolean> validator = new kotlin.jvm.functions.Function2() { // from class: com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Boolean.valueOf(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.a((org.json.JSONObject) obj, ((java.lang.Integer) obj2).intValue()));
        }
    };
    private int step4s = 15000;
    private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig mediationConfig = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig();

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ABConfig {
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig audio;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig banner;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig int;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig native;

        public ABConfig() {
            com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion.getClass();
            this.banner = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABBannerloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABBannerRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABBannerMaxRetries);
            this.int = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABIntloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABIntRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABIntMaxRetries);
            this.native = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABNativeloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABNativeRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABNativeMaxRetries);
            this.audio = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABAudioloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABAudioRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultABAudioMaxRetries);
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig getAudio() {
            return this.audio;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig getInt() {
            return this.int;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$MediationConfig;", "", "<init>", "()V", "ab", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$ABConfig;", "nonAb", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "preload", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "getABConfig", "getNonABConfig", "getPreloadConfig", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MediationConfig {
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.ABConfig ab = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.ABConfig();
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.NonABConfig nonAb = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.NonABConfig();
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.PreloadConfig preload = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.PreloadConfig();

        /* renamed from: getABConfig, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.ABConfig getAb() {
            return this.ab;
        }

        /* renamed from: getNonABConfig, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.NonABConfig getNonAb() {
            return this.nonAb;
        }

        /* renamed from: getPreloadConfig, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.PreloadConfig getPreload() {
            return this.preload;
        }

        public final boolean isValid() {
            return this.ab.isValid() && this.nonAb.isValid() && this.preload.isValid();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$NonABConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NonABConfig {
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig audio;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig banner;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig int;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig native;

        public NonABConfig() {
            com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion.getClass();
            this.banner = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABBannerloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABBannerMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABBannerRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABBannerMaxRetries);
            this.int = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABIntloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABIntMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABIntRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABIntMaxRetries);
            this.native = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABNativeloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABNativeMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABNativeRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABNativeMaxRetries);
            this.audio = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABAudioloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABAudioMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABAudioRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultNonABAudioMaxRetries);
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig getAudio() {
            return this.audio;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig getInt() {
            return this.int;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdNonABConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$PreloadConfig;", "", "<init>", "()V", "banner", "Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "int", "native", "audio", "getBanner", "getInterstitial", "getNative", "getAudio", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreloadConfig {
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig audio;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig banner;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig int;
        private com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig native;

        public PreloadConfig() {
            com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion.getClass();
            this.banner = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadBannerPreloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadBannerMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadBannerLoadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadBannerRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadBannerMaxRetries);
            this.int = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadIntPreloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadIntMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadIntloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadIntRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadIntMaxRetries);
            this.native = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadNativePreloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadNativeMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadNativeloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadNativeRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadNativeMaxRetries);
            this.audio = new com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig(com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadAudioPreloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadAudioMuttTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadAudioloadTimeout, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadAudioRetryInterval, com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.defaultPreloadAudioMaxRetries);
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig getAudio() {
            return this.audio;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig getBanner() {
            return this.banner;
        }

        /* renamed from: getInterstitial, reason: from getter */
        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig getInt() {
            return this.int;
        }

        public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.AdPreloadConfig getNative() {
            return this.native;
        }

        public final boolean isValid() {
            return this.banner.isValid() && this.int.isValid() && this.native.isValid() && this.audio.isValid();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0018\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001b\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014¨\u0006 "}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$RenderTimeoutByType;", "", "<init>", "()V", "", "adType", "", "defValue", "getTimeoutByType$media_release", "(Ljava/lang/String;I)I", "getTimeoutByType", "timeout", "", "setTimeoutByType", "(Ljava/lang/String;I)V", "banner", "I", "getBanner$media_release", "()I", "setBanner$media_release", "(I)V", "audio", "getAudio$media_release", "setAudio$media_release", "int", "getInt$media_release", "setInt$media_release", "native", "getNative$media_release", "setNative$media_release", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "com/inmobi/unification/sdk/model/initialization/a", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RenderTimeoutByType {
        public static final com.inmobi.unification.sdk.model.initialization.a Companion = new com.inmobi.unification.sdk.model.initialization.a();
        private int audio;
        private int banner;
        private int int;
        private int native;

        public /* synthetic */ RenderTimeoutByType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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

        public final int getTimeoutByType$media_release(java.lang.String adType, int defValue) {
            int i;
            int i2;
            int i3;
            int i4;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
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

        public final void setTimeoutByType(java.lang.String adType, int timeout) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
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

    public final com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.MediationConfig X() {
        return this.mediationConfig;
    }

    public final int Y() {
        return this.step4s;
    }

    public final boolean Z() {
        return this.step4s >= 0 && this.mediationConfig.isValid();
    }

    public final void a0() {
        int i = this.step4s;
        if (i <= 0) {
            i = 15000;
        }
        this.step4s = i;
    }

    public static final boolean a(org.json.JSONObject param, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(param, "param");
        java.util.Iterator<java.lang.String> keys = param.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (param.getInt(keys.next()) < i) {
                z = false;
            }
        }
        return z;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdABConfig;", "", "<init>", "()V", com.ironsource.C3232q2.t, "Lorg/json/JSONObject;", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdABConfig {
        private org.json.JSONObject loadRetryInterval;
        private org.json.JSONObject loadTimeout;
        private org.json.JSONObject maxLoadRetries;

        public AdABConfig() {
            this.loadTimeout = new org.json.JSONObject();
            this.loadRetryInterval = new org.json.JSONObject();
            this.maxLoadRetries = new org.json.JSONObject();
        }

        public final org.json.JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final org.json.JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final org.json.JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            com.inmobi.media.Ik ik = com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion;
            ik.getClass();
            if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                ik.getClass();
                if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    ik.getClass();
                    if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdABConfig(org.json.JSONObject loadTimeout, org.json.JSONObject retryInterval, org.json.JSONObject maxRetries) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\tJ\u0006\u0010\f\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdNonABConfig;", "", "<init>", "()V", com.ironsource.C3232q2.t, "Lorg/json/JSONObject;", "muttTimeout", "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getLoadTimeout", "getMuttTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdNonABConfig {
        private org.json.JSONObject loadRetryInterval;
        private org.json.JSONObject loadTimeout;
        private org.json.JSONObject maxLoadRetries;
        private org.json.JSONObject muttTimeout;

        public AdNonABConfig() {
            this.loadTimeout = new org.json.JSONObject();
            this.muttTimeout = new org.json.JSONObject();
            this.loadRetryInterval = new org.json.JSONObject();
            this.maxLoadRetries = new org.json.JSONObject();
        }

        public final org.json.JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final org.json.JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final org.json.JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final org.json.JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            com.inmobi.media.Ik ik = com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion;
            ik.getClass();
            if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.muttTimeout, 0)).booleanValue()) {
                ik.getClass();
                if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                    ik.getClass();
                    if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                        ik.getClass();
                        if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdNonABConfig(org.json.JSONObject loadTimeout, org.json.JSONObject muttTimeout, org.json.JSONObject retryInterval, org.json.JSONObject maxRetries) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.loadTimeout = loadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B1\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unification/sdk/model/initialization/TimeoutConfigurations$AdPreloadConfig;", "", "<init>", "()V", "preloadTimeout", "Lorg/json/JSONObject;", "muttTimeout", com.ironsource.C3232q2.t, "retryInterval", "maxRetries", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "loadRetryInterval", "maxLoadRetries", "getPreloadTimeout", "getMuttTimeout", "getLoadTimeout", "getRetryInterval", "getMaxRetries", "isValid", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AdPreloadConfig {
        private org.json.JSONObject loadRetryInterval;
        private org.json.JSONObject loadTimeout;
        private org.json.JSONObject maxLoadRetries;
        private org.json.JSONObject muttTimeout;
        private org.json.JSONObject preloadTimeout;

        public AdPreloadConfig() {
            this.preloadTimeout = new org.json.JSONObject();
            this.muttTimeout = new org.json.JSONObject();
            this.loadTimeout = new org.json.JSONObject();
            this.loadRetryInterval = new org.json.JSONObject();
            this.maxLoadRetries = new org.json.JSONObject();
        }

        public final org.json.JSONObject getLoadTimeout() {
            return this.loadTimeout;
        }

        /* renamed from: getMaxRetries, reason: from getter */
        public final org.json.JSONObject getMaxLoadRetries() {
            return this.maxLoadRetries;
        }

        public final org.json.JSONObject getMuttTimeout() {
            return this.muttTimeout;
        }

        public final org.json.JSONObject getPreloadTimeout() {
            return this.preloadTimeout;
        }

        /* renamed from: getRetryInterval, reason: from getter */
        public final org.json.JSONObject getLoadRetryInterval() {
            return this.loadRetryInterval;
        }

        public final boolean isValid() {
            com.inmobi.media.Ik ik = com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.Companion;
            ik.getClass();
            if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadTimeout, 0)).booleanValue()) {
                ik.getClass();
                if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    ik.getClass();
                    if (((java.lang.Boolean) com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations.validator.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AdPreloadConfig(org.json.JSONObject preloadTimeout, org.json.JSONObject muttTimeout, org.json.JSONObject loadTimeout, org.json.JSONObject retryInterval, org.json.JSONObject maxRetries) {
            this();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preloadTimeout, "preloadTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muttTimeout, "muttTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTimeout, "loadTimeout");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retryInterval, "retryInterval");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxRetries, "maxRetries");
            this.preloadTimeout = preloadTimeout;
            this.muttTimeout = muttTimeout;
            this.loadTimeout = loadTimeout;
            this.loadRetryInterval = retryInterval;
            this.maxLoadRetries = maxRetries;
        }
    }
}
