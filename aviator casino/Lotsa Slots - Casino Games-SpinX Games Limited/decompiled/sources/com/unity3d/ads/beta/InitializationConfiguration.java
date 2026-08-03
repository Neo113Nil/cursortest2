package com.unity3d.ads.beta;

/* compiled from: InitializationConfiguration.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aBI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/beta/InitializationConfiguration;", "", "context", "Landroid/content/Context;", "gameID", "", "isTestModeEnabled", "", "logLevel", "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "extras", "", "mediationInfo", "Lcom/unity3d/ads/beta/MediationInfo;", "(Landroid/content/Context;Ljava/lang/String;ZLcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;Ljava/util/Map;Lcom/unity3d/ads/beta/MediationInfo;)V", "getContext", "()Landroid/content/Context;", "getExtras", "()Ljava/util/Map;", "getGameID", "()Ljava/lang/String;", "()Z", "getLogLevel", "()Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "getMediationInfo", "()Lcom/unity3d/ads/beta/MediationInfo;", "Builder", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InitializationConfiguration {
    private final android.content.Context context;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final java.lang.String gameID;
    private final boolean isTestModeEnabled;
    private final com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel logLevel;
    private final com.unity3d.ads.beta.MediationInfo mediationInfo;

    public InitializationConfiguration(android.content.Context context, java.lang.String gameID, boolean z, com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel logLevel, java.util.Map<java.lang.String, java.lang.String> extras, com.unity3d.ads.beta.MediationInfo mediationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gameID, "gameID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        this.context = context;
        this.gameID = gameID;
        this.isTestModeEnabled = z;
        this.logLevel = logLevel;
        this.extras = extras;
        this.mediationInfo = mediationInfo;
    }

    public final android.content.Context getContext() {
        return this.context;
    }

    public final java.lang.String getGameID() {
        return this.gameID;
    }

    /* renamed from: isTestModeEnabled, reason: from getter */
    public final boolean getIsTestModeEnabled() {
        return this.isTestModeEnabled;
    }

    public /* synthetic */ InitializationConfiguration(android.content.Context context, java.lang.String str, boolean z, com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel unityAdsLogLevel, java.util.Map map, com.unity3d.ads.beta.MediationInfo mediationInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, z, (i & 8) != 0 ? com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO : unityAdsLogLevel, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 32) != 0 ? null : mediationInfo);
    }

    public final com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public final com.unity3d.ads.beta.MediationInfo getMediationInfo() {
        return this.mediationInfo;
    }

    /* compiled from: InitializationConfiguration.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/beta/InitializationConfiguration$Builder;", "", "context", "Landroid/content/Context;", "gameID", "", "isTestModeEnabled", "", "(Landroid/content/Context;Ljava/lang/String;Z)V", "extras", "", "logLevel", "Lcom/unity3d/services/core/log/DeviceLog$UnityAdsLogLevel;", "mediationInfo", "Lcom/unity3d/ads/beta/MediationInfo;", "build", "Lcom/unity3d/ads/beta/InitializationConfiguration;", "withExtras", "withLogLevel", "withMediationInfo", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final android.content.Context context;
        private java.util.Map<java.lang.String, java.lang.String> extras;
        private final java.lang.String gameID;
        private final boolean isTestModeEnabled;
        private com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel logLevel;
        private com.unity3d.ads.beta.MediationInfo mediationInfo;

        public Builder(android.content.Context context, java.lang.String gameID, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gameID, "gameID");
            this.context = context;
            this.gameID = gameID;
            this.isTestModeEnabled = z;
            this.logLevel = com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel.INFO;
            this.extras = kotlin.collections.MapsKt.emptyMap();
        }

        public final com.unity3d.ads.beta.InitializationConfiguration.Builder withLogLevel(com.unity3d.services.core.log.DeviceLog.UnityAdsLogLevel logLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.logLevel = logLevel;
            return this;
        }

        public final com.unity3d.ads.beta.InitializationConfiguration.Builder withMediationInfo(com.unity3d.ads.beta.MediationInfo mediationInfo) {
            this.mediationInfo = mediationInfo;
            return this;
        }

        public final com.unity3d.ads.beta.InitializationConfiguration.Builder withExtras(java.util.Map<java.lang.String, java.lang.String> extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            this.extras = extras;
            return this;
        }

        public final com.unity3d.ads.beta.InitializationConfiguration build() {
            return new com.unity3d.ads.beta.InitializationConfiguration(this.context, this.gameID, this.isTestModeEnabled, this.logLevel, this.extras, this.mediationInfo);
        }
    }
}
