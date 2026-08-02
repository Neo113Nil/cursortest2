package com.datadog.android.profiling;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/datadog/android/profiling/ProfilingConfiguration;", "", "", "customEndpointUrl", "", "sampleRate", "<init>", "(Ljava/lang/String;F)V", "component1$dd_sdk_android_profiling_release", "()Ljava/lang/String;", "component2$dd_sdk_android_profiling_release", "()F", "copy", "(Ljava/lang/String;F)Lcom/datadog/android/profiling/ProfilingConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_profiling_release", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getSampleRate$dd_sdk_android_profiling_release", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProfilingConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.profiling.ProfilingConfiguration.Companion INSTANCE = new com.datadog.android.profiling.ProfilingConfiguration.Companion(null);
    private static final com.datadog.android.profiling.ProfilingConfiguration DEFAULT = new com.datadog.android.profiling.ProfilingConfiguration.Builder().build();
    private final java.lang.String customEndpointUrl;
    private final float sampleRate;

    public ProfilingConfiguration(java.lang.String str, float f) {
        this.customEndpointUrl = str;
        this.sampleRate = f;
    }

    public final java.lang.String getCustomEndpointUrl$dd_sdk_android_profiling_release() {
        return this.customEndpointUrl;
    }

    public final float getSampleRate$dd_sdk_android_profiling_release() {
        return this.sampleRate;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/profiling/ProfilingConfiguration$Builder;", "", "<init>", "()V", "Lcom/datadog/android/profiling/ProfilingConfiguration;", "build", "()Lcom/datadog/android/profiling/ProfilingConfiguration;", "", "sampleRate", "setApplicationLaunchSampleRate", "(F)Lcom/datadog/android/profiling/ProfilingConfiguration$Builder;", "", "endpoint", "useCustomEndpoint", "(Ljava/lang/String;)Lcom/datadog/android/profiling/ProfilingConfiguration$Builder;", "getHighSpeedVideoFpsRanges", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private float getHighSpeedVideoSizes = 15.0f;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        public final com.datadog.android.profiling.ProfilingConfiguration.Builder setApplicationLaunchSampleRate(float sampleRate) {
            this.getHighSpeedVideoSizes = sampleRate;
            return this;
        }

        public final com.datadog.android.profiling.ProfilingConfiguration.Builder useCustomEndpoint(java.lang.String endpoint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
            this.getHighSpeedVideoFpsRanges = endpoint;
            return this;
        }

        public final com.datadog.android.profiling.ProfilingConfiguration build() {
            return new com.datadog.android.profiling.ProfilingConfiguration(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/profiling/ProfilingConfiguration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/profiling/ProfilingConfiguration;", "DEFAULT", "Lcom/datadog/android/profiling/ProfilingConfiguration;", "getDEFAULT", "()Lcom/datadog/android/profiling/ProfilingConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.profiling.ProfilingConfiguration getDEFAULT() {
            return com.datadog.android.profiling.ProfilingConfiguration.DEFAULT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.customEndpointUrl;
        float f = this.sampleRate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProfilingConfiguration(customEndpointUrl=");
        sb.append(str);
        sb.append(", sampleRate=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.customEndpointUrl;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Float.hashCode(this.sampleRate);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.profiling.ProfilingConfiguration)) {
            return false;
        }
        com.datadog.android.profiling.ProfilingConfiguration profilingConfiguration = (com.datadog.android.profiling.ProfilingConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customEndpointUrl, profilingConfiguration.customEndpointUrl) && java.lang.Float.compare(this.sampleRate, profilingConfiguration.sampleRate) == 0;
    }

    public final com.datadog.android.profiling.ProfilingConfiguration copy(java.lang.String customEndpointUrl, float sampleRate) {
        return new com.datadog.android.profiling.ProfilingConfiguration(customEndpointUrl, sampleRate);
    }

    /* renamed from: component2$dd_sdk_android_profiling_release, reason: from getter */
    public final float getSampleRate() {
        return this.sampleRate;
    }

    /* renamed from: component1$dd_sdk_android_profiling_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    public static /* synthetic */ com.datadog.android.profiling.ProfilingConfiguration copy$default(com.datadog.android.profiling.ProfilingConfiguration profilingConfiguration, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = profilingConfiguration.customEndpointUrl;
        }
        if ((i & 2) != 0) {
            f = profilingConfiguration.sampleRate;
        }
        return profilingConfiguration.copy(str, f);
    }
}
