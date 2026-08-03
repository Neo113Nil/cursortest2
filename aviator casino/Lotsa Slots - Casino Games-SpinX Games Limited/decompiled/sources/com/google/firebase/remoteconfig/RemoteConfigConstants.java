package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public final class RemoteConfigConstants {
    public static final java.lang.String FETCH_REGEX_URL = "https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch";
    public static final java.lang.String REALTIME_REGEX_URL = "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations";

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ExperimentDescriptionFieldKey {
        public static final java.lang.String EXPERIMENT_ID = "experimentId";
        public static final java.lang.String VARIANT_ID = "variantId";
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RequestFieldKey {
        public static final java.lang.String ANALYTICS_USER_PROPERTIES = "analyticsUserProperties";
        public static final java.lang.String APP_BUILD = "appBuild";
        public static final java.lang.String APP_ID = "appId";
        public static final java.lang.String APP_VERSION = "appVersion";
        public static final java.lang.String COUNTRY_CODE = "countryCode";
        public static final java.lang.String CUSTOM_SIGNALS = "customSignals";
        public static final java.lang.String FIRST_OPEN_TIME = "firstOpenTime";
        public static final java.lang.String INSTANCE_ID = "appInstanceId";
        public static final java.lang.String INSTANCE_ID_TOKEN = "appInstanceIdToken";
        public static final java.lang.String LANGUAGE_CODE = "languageCode";
        public static final java.lang.String PACKAGE_NAME = "packageName";
        public static final java.lang.String PLATFORM_VERSION = "platformVersion";
        public static final java.lang.String SDK_VERSION = "sdkVersion";
        public static final java.lang.String TIME_ZONE = "timeZone";
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ResponseFieldKey {
        public static final java.lang.String ENTRIES = "entries";
        public static final java.lang.String EXPERIMENT_DESCRIPTIONS = "experimentDescriptions";
        public static final java.lang.String PERSONALIZATION_METADATA = "personalizationMetadata";
        public static final java.lang.String ROLLOUT_METADATA = "rolloutMetadata";
        public static final java.lang.String STATE = "state";
        public static final java.lang.String TEMPLATE_VERSION_NUMBER = "templateVersion";
    }

    private RemoteConfigConstants() {
    }
}
