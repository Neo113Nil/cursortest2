package com.facebook.internal;

/* compiled from: FetchedAppSettings.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b/\u0018\u0000 D2\u00020\u0001:\u0002DEB\u008b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010$J\u0006\u0010\u0002\u001a\u00020\u0003R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010!\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R)\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u001f\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b:\u00104R\u0013\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(¨\u0006F"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings;", "", "supportsImplicitLogging", "", "nuxContent", "", "nuxEnabled", "sessionTimeoutInSeconds", "", "smartLoginOptions", "Ljava/util/EnumSet;", "Lcom/facebook/internal/SmartLoginOption;", "dialogConfigurations", "", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "automaticLoggingEnabled", "errorClassification", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "smartLoginBookmarkIconURL", "smartLoginMenuIconURL", "iAPAutomaticLoggingEnabled", "codelessEventsEnabled", "eventBindings", "Lorg/json/JSONArray;", "sdkUpdateMessage", "trackUninstallEnabled", "monitorViaDialogEnabled", "rawAamRules", "suggestedEventsSetting", "restrictiveDataSetting", "protectedModeStandardParamsSetting", "MACARuleMatchingSetting", "migratedAutoLogValues", "blocklistEvents", "redactedEvents", "sensitiveParams", "(ZLjava/lang/String;ZILjava/util/EnumSet;Ljava/util/Map;ZLcom/facebook/internal/FacebookRequestErrorClassification;Ljava/lang/String;Ljava/lang/String;ZZLorg/json/JSONArray;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;Lorg/json/JSONArray;Ljava/util/Map;Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;)V", "getMACARuleMatchingSetting", "()Lorg/json/JSONArray;", "getAutomaticLoggingEnabled", "()Z", "getBlocklistEvents", "getCodelessEventsEnabled", "getDialogConfigurations", "()Ljava/util/Map;", "getErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "getEventBindings", "getIAPAutomaticLoggingEnabled", "getMigratedAutoLogValues", "getMonitorViaDialogEnabled", "getNuxContent", "()Ljava/lang/String;", "getNuxEnabled", "getProtectedModeStandardParamsSetting", "getRawAamRules", "getRedactedEvents", "getRestrictiveDataSetting", "getSdkUpdateMessage", "getSensitiveParams", "getSessionTimeoutInSeconds", "()I", "getSmartLoginBookmarkIconURL", "getSmartLoginMenuIconURL", "getSmartLoginOptions", "()Ljava/util/EnumSet;", "getSuggestedEventsSetting", "getTrackUninstallEnabled", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "DialogFeatureConfig", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FetchedAppSettings {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.FetchedAppSettings.Companion INSTANCE = new com.facebook.internal.FetchedAppSettings.Companion(null);
    private final org.json.JSONArray MACARuleMatchingSetting;
    private final boolean automaticLoggingEnabled;
    private final org.json.JSONArray blocklistEvents;
    private final boolean codelessEventsEnabled;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig>> dialogConfigurations;
    private final com.facebook.internal.FacebookRequestErrorClassification errorClassification;
    private final org.json.JSONArray eventBindings;
    private final boolean iAPAutomaticLoggingEnabled;
    private final java.util.Map<java.lang.String, java.lang.Boolean> migratedAutoLogValues;
    private final boolean monitorViaDialogEnabled;
    private final java.lang.String nuxContent;
    private final boolean nuxEnabled;
    private final org.json.JSONArray protectedModeStandardParamsSetting;
    private final java.lang.String rawAamRules;
    private final org.json.JSONArray redactedEvents;
    private final java.lang.String restrictiveDataSetting;
    private final java.lang.String sdkUpdateMessage;
    private final org.json.JSONArray sensitiveParams;
    private final int sessionTimeoutInSeconds;
    private final java.lang.String smartLoginBookmarkIconURL;
    private final java.lang.String smartLoginMenuIconURL;
    private final java.util.EnumSet<com.facebook.internal.SmartLoginOption> smartLoginOptions;
    private final java.lang.String suggestedEventsSetting;
    private final boolean supportsImplicitLogging;
    private final boolean trackUninstallEnabled;

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FetchedAppSettings.DialogFeatureConfig getDialogFeatureConfig(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return INSTANCE.getDialogFeatureConfig(str, str2, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchedAppSettings(boolean z, java.lang.String nuxContent, boolean z2, int i, java.util.EnumSet<com.facebook.internal.SmartLoginOption> smartLoginOptions, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig>> dialogConfigurations, boolean z3, com.facebook.internal.FacebookRequestErrorClassification errorClassification, java.lang.String smartLoginBookmarkIconURL, java.lang.String smartLoginMenuIconURL, boolean z4, boolean z5, org.json.JSONArray jSONArray, java.lang.String sdkUpdateMessage, boolean z6, boolean z7, java.lang.String str, java.lang.String str2, java.lang.String str3, org.json.JSONArray jSONArray2, org.json.JSONArray jSONArray3, java.util.Map<java.lang.String, java.lang.Boolean> map, org.json.JSONArray jSONArray4, org.json.JSONArray jSONArray5, org.json.JSONArray jSONArray6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.supportsImplicitLogging = z;
        this.nuxContent = nuxContent;
        this.nuxEnabled = z2;
        this.sessionTimeoutInSeconds = i;
        this.smartLoginOptions = smartLoginOptions;
        this.dialogConfigurations = dialogConfigurations;
        this.automaticLoggingEnabled = z3;
        this.errorClassification = errorClassification;
        this.smartLoginBookmarkIconURL = smartLoginBookmarkIconURL;
        this.smartLoginMenuIconURL = smartLoginMenuIconURL;
        this.iAPAutomaticLoggingEnabled = z4;
        this.codelessEventsEnabled = z5;
        this.eventBindings = jSONArray;
        this.sdkUpdateMessage = sdkUpdateMessage;
        this.trackUninstallEnabled = z6;
        this.monitorViaDialogEnabled = z7;
        this.rawAamRules = str;
        this.suggestedEventsSetting = str2;
        this.restrictiveDataSetting = str3;
        this.protectedModeStandardParamsSetting = jSONArray2;
        this.MACARuleMatchingSetting = jSONArray3;
        this.migratedAutoLogValues = map;
        this.blocklistEvents = jSONArray4;
        this.redactedEvents = jSONArray5;
        this.sensitiveParams = jSONArray6;
    }

    public final java.lang.String getNuxContent() {
        return this.nuxContent;
    }

    public final boolean getNuxEnabled() {
        return this.nuxEnabled;
    }

    public final int getSessionTimeoutInSeconds() {
        return this.sessionTimeoutInSeconds;
    }

    public final java.util.EnumSet<com.facebook.internal.SmartLoginOption> getSmartLoginOptions() {
        return this.smartLoginOptions;
    }

    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig>> getDialogConfigurations() {
        return this.dialogConfigurations;
    }

    public final boolean getAutomaticLoggingEnabled() {
        return this.automaticLoggingEnabled;
    }

    public final com.facebook.internal.FacebookRequestErrorClassification getErrorClassification() {
        return this.errorClassification;
    }

    public final java.lang.String getSmartLoginBookmarkIconURL() {
        return this.smartLoginBookmarkIconURL;
    }

    public final java.lang.String getSmartLoginMenuIconURL() {
        return this.smartLoginMenuIconURL;
    }

    public final boolean getIAPAutomaticLoggingEnabled() {
        return this.iAPAutomaticLoggingEnabled;
    }

    public final boolean getCodelessEventsEnabled() {
        return this.codelessEventsEnabled;
    }

    public final org.json.JSONArray getEventBindings() {
        return this.eventBindings;
    }

    public final java.lang.String getSdkUpdateMessage() {
        return this.sdkUpdateMessage;
    }

    public final boolean getTrackUninstallEnabled() {
        return this.trackUninstallEnabled;
    }

    public final boolean getMonitorViaDialogEnabled() {
        return this.monitorViaDialogEnabled;
    }

    public final java.lang.String getRawAamRules() {
        return this.rawAamRules;
    }

    public final java.lang.String getSuggestedEventsSetting() {
        return this.suggestedEventsSetting;
    }

    public final java.lang.String getRestrictiveDataSetting() {
        return this.restrictiveDataSetting;
    }

    public final org.json.JSONArray getProtectedModeStandardParamsSetting() {
        return this.protectedModeStandardParamsSetting;
    }

    public final org.json.JSONArray getMACARuleMatchingSetting() {
        return this.MACARuleMatchingSetting;
    }

    public final java.util.Map<java.lang.String, java.lang.Boolean> getMigratedAutoLogValues() {
        return this.migratedAutoLogValues;
    }

    public final org.json.JSONArray getBlocklistEvents() {
        return this.blocklistEvents;
    }

    public final org.json.JSONArray getRedactedEvents() {
        return this.redactedEvents;
    }

    public final org.json.JSONArray getSensitiveParams() {
        return this.sensitiveParams;
    }

    /* renamed from: supportsImplicitLogging, reason: from getter */
    public final boolean getSupportsImplicitLogging() {
        return this.supportsImplicitLogging;
    }

    /* compiled from: FetchedAppSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "", "dialogName", "", "featureName", "fallbackUrl", "Landroid/net/Uri;", "versionSpec", "", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;[I)V", "getDialogName", "()Ljava/lang/String;", "getFallbackUrl", "()Landroid/net/Uri;", "getFeatureName", "getVersionSpec", "()[I", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DialogFeatureConfig {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.Companion INSTANCE = new com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.Companion(null);
        private static final java.lang.String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "|";
        private static final java.lang.String DIALOG_CONFIG_NAME_KEY = "name";
        private static final java.lang.String DIALOG_CONFIG_URL_KEY = "url";
        private static final java.lang.String DIALOG_CONFIG_VERSIONS_KEY = "versions";
        private final java.lang.String dialogName;
        private final android.net.Uri fallbackUrl;
        private final java.lang.String featureName;
        private final int[] versionSpec;

        public /* synthetic */ DialogFeatureConfig(java.lang.String str, java.lang.String str2, android.net.Uri uri, int[] iArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        private DialogFeatureConfig(java.lang.String str, java.lang.String str2, android.net.Uri uri, int[] iArr) {
            this.dialogName = str;
            this.featureName = str2;
            this.fallbackUrl = uri;
            this.versionSpec = iArr;
        }

        public final java.lang.String getDialogName() {
            return this.dialogName;
        }

        public final java.lang.String getFeatureName() {
            return this.featureName;
        }

        public final android.net.Uri getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final int[] getVersionSpec() {
            return this.versionSpec;
        }

        /* compiled from: FetchedAppSettings.kt */
        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig$Companion;", "", "()V", "DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR", "", "DIALOG_CONFIG_NAME_KEY", "DIALOG_CONFIG_URL_KEY", "DIALOG_CONFIG_VERSIONS_KEY", "parseDialogConfig", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "dialogConfigJSON", "Lorg/json/JSONObject;", "parseVersionSpec", "", "versionsJSON", "Lorg/json/JSONArray;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.internal.FetchedAppSettings.DialogFeatureConfig parseDialogConfig(org.json.JSONObject dialogConfigJSON) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                java.lang.String dialogNameWithFeature = dialogConfigJSON.optString("name");
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(dialogNameWithFeature)) {
                    return null;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) dialogNameWithFeature, new java.lang.String[]{com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
                if (split$default.size() != 2) {
                    return null;
                }
                java.lang.String str = (java.lang.String) kotlin.collections.CollectionsKt.first(split$default);
                java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.last(split$default);
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.isNullOrEmpty(str)) {
                    com.facebook.internal.Utility utility3 = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(str2)) {
                        java.lang.String optString = dialogConfigJSON.optString("url");
                        com.facebook.internal.Utility utility4 = com.facebook.internal.Utility.INSTANCE;
                        return new com.facebook.internal.FetchedAppSettings.DialogFeatureConfig(str, str2, com.facebook.internal.Utility.isNullOrEmpty(optString) ? null : android.net.Uri.parse(optString), parseVersionSpec(dialogConfigJSON.optJSONArray(com.facebook.internal.FetchedAppSettings.DialogFeatureConfig.DIALOG_CONFIG_VERSIONS_KEY)), null);
                    }
                }
                return null;
            }

            private final int[] parseVersionSpec(org.json.JSONArray versionsJSON) {
                if (versionsJSON == null) {
                    return null;
                }
                int length = versionsJSON.length();
                int[] iArr = new int[length];
                if (length <= 0) {
                    return iArr;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    int i3 = -1;
                    int optInt = versionsJSON.optInt(i, -1);
                    if (optInt == -1) {
                        java.lang.String versionString = versionsJSON.optString(i);
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        if (!com.facebook.internal.Utility.isNullOrEmpty(versionString)) {
                            try {
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                i3 = java.lang.Integer.parseInt(versionString);
                            } catch (java.lang.NumberFormatException e) {
                                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                                com.facebook.internal.Utility.logd(com.facebook.internal.Utility.LOG_TAG, e);
                            }
                            optInt = i3;
                        }
                    }
                    iArr[i] = optInt;
                    if (i2 >= length) {
                        return iArr;
                    }
                    i = i2;
                }
            }
        }
    }

    /* compiled from: FetchedAppSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/facebook/internal/FetchedAppSettings$Companion;", "", "()V", "getDialogFeatureConfig", "Lcom/facebook/internal/FetchedAppSettings$DialogFeatureConfig;", "applicationId", "", com.ironsource.X3.i.v0, "featureName", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.FetchedAppSettings.DialogFeatureConfig getDialogFeatureConfig(java.lang.String applicationId, java.lang.String actionName, java.lang.String featureName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionName, "actionName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.internal.FetchedAppSettings appSettingsWithoutQuery = com.facebook.internal.FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
            java.util.Map<java.lang.String, com.facebook.internal.FetchedAppSettings.DialogFeatureConfig> map = appSettingsWithoutQuery == null ? null : appSettingsWithoutQuery.getDialogConfigurations().get(actionName);
            if (map != null) {
                return map.get(featureName);
            }
            return null;
        }
    }
}
