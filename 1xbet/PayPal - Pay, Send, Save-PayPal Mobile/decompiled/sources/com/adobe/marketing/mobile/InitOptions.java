package com.adobe.marketing.mobile;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nRF\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/adobe/marketing/mobile/InitOptions;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/ConfigType;", "config", "Lcom/adobe/marketing/mobile/ConfigType;", "getConfig$core_phoneRelease", "()Lcom/adobe/marketing/mobile/ConfigType;", "setConfig$core_phoneRelease", "(Lcom/adobe/marketing/mobile/ConfigType;)V", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "lifecycleAdditionalContextData", "Ljava/util/Map;", "getLifecycleAdditionalContextData", "()Ljava/util/Map;", "setLifecycleAdditionalContextData", "(Ljava/util/Map;)V", "", "lifecycleAutomaticTrackingEnabled", "Z", "getLifecycleAutomaticTrackingEnabled", "()Z", "setLifecycleAutomaticTrackingEnabled", "(Z)V", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class InitOptions {
    private java.util.Map<java.lang.String, java.lang.String> lifecycleAdditionalContextData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.adobe.marketing.mobile.InitOptions.Companion INSTANCE = new com.adobe.marketing.mobile.InitOptions.Companion(null);
    public static final int $stable = 8;
    private boolean lifecycleAutomaticTrackingEnabled = true;
    private /* synthetic */ com.adobe.marketing.mobile.ConfigType config = com.adobe.marketing.mobile.ConfigType.Bundled.INSTANCE;

    public final boolean getLifecycleAutomaticTrackingEnabled() {
        return this.lifecycleAutomaticTrackingEnabled;
    }

    public final void setLifecycleAutomaticTrackingEnabled(boolean z) {
        this.lifecycleAutomaticTrackingEnabled = z;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getLifecycleAdditionalContextData() {
        return this.lifecycleAdditionalContextData;
    }

    public final void setLifecycleAdditionalContextData(java.util.Map<java.lang.String, java.lang.String> map) {
        this.lifecycleAdditionalContextData = map != null ? kotlin.collections.MapsKt.toMap(map) : null;
    }

    /* renamed from: getConfig$core_phoneRelease, reason: from getter */
    public final com.adobe.marketing.mobile.ConfigType getConfig() {
        return this.config;
    }

    public final void setConfig$core_phoneRelease(com.adobe.marketing.mobile.ConfigType configType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "");
        this.config = configType;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/adobe/marketing/mobile/InitOptions$Companion;", "", "<init>", "()V", "", "appID", "Lcom/adobe/marketing/mobile/InitOptions;", "configureWithAppID", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/InitOptions;", "filePath", "configureWithFileInAssets", "configureWithFileInPath"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final com.adobe.marketing.mobile.InitOptions configureWithAppID(java.lang.String appID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appID, "");
            com.adobe.marketing.mobile.InitOptions initOptions = new com.adobe.marketing.mobile.InitOptions();
            initOptions.setConfig$core_phoneRelease(new com.adobe.marketing.mobile.ConfigType.AppID(appID));
            return initOptions;
        }

        @kotlin.jvm.JvmStatic
        public final com.adobe.marketing.mobile.InitOptions configureWithFileInPath(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            com.adobe.marketing.mobile.InitOptions initOptions = new com.adobe.marketing.mobile.InitOptions();
            initOptions.setConfig$core_phoneRelease(new com.adobe.marketing.mobile.ConfigType.FileInPath(filePath));
            return initOptions;
        }

        @kotlin.jvm.JvmStatic
        public final com.adobe.marketing.mobile.InitOptions configureWithFileInAssets(java.lang.String filePath) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
            com.adobe.marketing.mobile.InitOptions initOptions = new com.adobe.marketing.mobile.InitOptions();
            initOptions.setConfig$core_phoneRelease(new com.adobe.marketing.mobile.ConfigType.FileInAssets(filePath));
            return initOptions;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.adobe.marketing.mobile.InitOptions configureWithFileInPath(java.lang.String str) {
        return INSTANCE.configureWithFileInPath(str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.adobe.marketing.mobile.InitOptions configureWithFileInAssets(java.lang.String str) {
        return INSTANCE.configureWithFileInAssets(str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.adobe.marketing.mobile.InitOptions configureWithAppID(java.lang.String str) {
        return INSTANCE.configureWithAppID(str);
    }
}
