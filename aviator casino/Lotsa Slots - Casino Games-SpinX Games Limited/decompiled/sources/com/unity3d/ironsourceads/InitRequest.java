package com.unity3d.ironsourceads;

/* loaded from: classes5.dex */
public final class InitRequest {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8007a;
    private final java.util.List<com.unity3d.ironsourceads.IronSourceAds.AdFormat> b;
    private final com.unity3d.ironsourceads.LogLevel c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f8008a;
        private java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> b;
        private com.unity3d.ironsourceads.LogLevel c;

        public Builder(java.lang.String appKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f8008a = appKey;
        }

        public final com.unity3d.ironsourceads.InitRequest build() {
            java.lang.String str = this.f8008a;
            java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> list = this.b;
            if (list == null) {
                list = kotlin.collections.CollectionsKt.emptyList();
            }
            com.unity3d.ironsourceads.LogLevel logLevel = this.c;
            if (logLevel == null) {
                logLevel = com.unity3d.ironsourceads.LogLevel.NONE;
            }
            return new com.unity3d.ironsourceads.InitRequest(str, list, logLevel, null);
        }

        public final java.lang.String getAppKey() {
            return this.f8008a;
        }

        public final com.unity3d.ironsourceads.InitRequest.Builder withLegacyAdFormats(java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> legacyAdFormats) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.b = legacyAdFormats;
            return this;
        }

        public final com.unity3d.ironsourceads.InitRequest.Builder withLogLevel(com.unity3d.ironsourceads.LogLevel logLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.c = logLevel;
            return this;
        }
    }

    public /* synthetic */ InitRequest(java.lang.String str, java.util.List list, com.unity3d.ironsourceads.LogLevel logLevel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }

    public final java.lang.String getAppKey() {
        return this.f8007a;
    }

    public final java.util.List<com.unity3d.ironsourceads.IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.b;
    }

    public final com.unity3d.ironsourceads.LogLevel getLogLevel() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(java.lang.String str, java.util.List<? extends com.unity3d.ironsourceads.IronSourceAds.AdFormat> list, com.unity3d.ironsourceads.LogLevel logLevel) {
        this.f8007a = str;
        this.b = list;
        this.c = logLevel;
    }
}
