package com.datadog.android.rum.configuration;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "", "", "maxSlowFramesAmount", "", "maxSlowFrameThresholdNs", "continuousSlowFrameThresholdNs", "freezeDurationThresholdNs", "minViewLifetimeThresholdNs", "<init>", "(IJJJJ)V", "component1$dd_sdk_android_rum_release", "()I", "component2$dd_sdk_android_rum_release", "()J", "component3$dd_sdk_android_rum_release", "component4$dd_sdk_android_rum_release", "component5$dd_sdk_android_rum_release", "copy", "(IJJJJ)Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getContinuousSlowFrameThresholdNs$dd_sdk_android_rum_release", "getFreezeDurationThresholdNs$dd_sdk_android_rum_release", "getMaxSlowFrameThresholdNs$dd_sdk_android_rum_release", com.visa.cbp.getEncExpo.warmup, "getMaxSlowFramesAmount$dd_sdk_android_rum_release", "getMinViewLifetimeThresholdNs$dd_sdk_android_rum_release", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SlowFramesConfiguration {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.configuration.SlowFramesConfiguration.Companion INSTANCE = new com.datadog.android.rum.configuration.SlowFramesConfiguration.Companion(null);
    private static final com.datadog.android.rum.configuration.SlowFramesConfiguration DEFAULT = new com.datadog.android.rum.configuration.SlowFramesConfiguration(0, 0, 0, 0, 0, 31, null);
    private final long continuousSlowFrameThresholdNs;
    private final long freezeDurationThresholdNs;
    private final long maxSlowFrameThresholdNs;
    private final int maxSlowFramesAmount;
    private final long minViewLifetimeThresholdNs;

    public SlowFramesConfiguration(int i, long j, long j2, long j3, long j4) {
        this.maxSlowFramesAmount = i;
        this.maxSlowFrameThresholdNs = j;
        this.continuousSlowFrameThresholdNs = j2;
        this.freezeDurationThresholdNs = j3;
        this.minViewLifetimeThresholdNs = j4;
    }

    public /* synthetic */ SlowFramesConfiguration(int i, long j, long j2, long j3, long j4, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1000 : i, (i2 & 2) != 0 ? 700000000L : j, (i2 & 4) != 0 ? 16666666L : j2, (i2 & 8) != 0 ? 5000000000L : j3, (i2 & 16) != 0 ? 1000000000L : j4);
    }

    public final int getMaxSlowFramesAmount$dd_sdk_android_rum_release() {
        return this.maxSlowFramesAmount;
    }

    public final long getMaxSlowFrameThresholdNs$dd_sdk_android_rum_release() {
        return this.maxSlowFrameThresholdNs;
    }

    public final long getContinuousSlowFrameThresholdNs$dd_sdk_android_rum_release() {
        return this.continuousSlowFrameThresholdNs;
    }

    public final long getFreezeDurationThresholdNs$dd_sdk_android_rum_release() {
        return this.freezeDurationThresholdNs;
    }

    public final long getMinViewLifetimeThresholdNs$dd_sdk_android_rum_release() {
        return this.minViewLifetimeThresholdNs;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/rum/configuration/SlowFramesConfiguration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "DEFAULT", "Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;", "getDEFAULT", "()Lcom/datadog/android/rum/configuration/SlowFramesConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.rum.configuration.SlowFramesConfiguration getDEFAULT() {
            return com.datadog.android.rum.configuration.SlowFramesConfiguration.DEFAULT;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        int i = this.maxSlowFramesAmount;
        long j = this.maxSlowFrameThresholdNs;
        long j2 = this.continuousSlowFrameThresholdNs;
        long j3 = this.freezeDurationThresholdNs;
        long j4 = this.minViewLifetimeThresholdNs;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SlowFramesConfiguration(maxSlowFramesAmount=");
        sb.append(i);
        sb.append(", maxSlowFrameThresholdNs=");
        sb.append(j);
        sb.append(", continuousSlowFrameThresholdNs=");
        sb.append(j2);
        sb.append(", freezeDurationThresholdNs=");
        sb.append(j3);
        sb.append(", minViewLifetimeThresholdNs=");
        sb.append(j4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.maxSlowFramesAmount) * 31) + java.lang.Long.hashCode(this.maxSlowFrameThresholdNs)) * 31) + java.lang.Long.hashCode(this.continuousSlowFrameThresholdNs)) * 31) + java.lang.Long.hashCode(this.freezeDurationThresholdNs)) * 31) + java.lang.Long.hashCode(this.minViewLifetimeThresholdNs);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.configuration.SlowFramesConfiguration)) {
            return false;
        }
        com.datadog.android.rum.configuration.SlowFramesConfiguration slowFramesConfiguration = (com.datadog.android.rum.configuration.SlowFramesConfiguration) other;
        return this.maxSlowFramesAmount == slowFramesConfiguration.maxSlowFramesAmount && this.maxSlowFrameThresholdNs == slowFramesConfiguration.maxSlowFrameThresholdNs && this.continuousSlowFrameThresholdNs == slowFramesConfiguration.continuousSlowFrameThresholdNs && this.freezeDurationThresholdNs == slowFramesConfiguration.freezeDurationThresholdNs && this.minViewLifetimeThresholdNs == slowFramesConfiguration.minViewLifetimeThresholdNs;
    }

    public final com.datadog.android.rum.configuration.SlowFramesConfiguration copy(int maxSlowFramesAmount, long maxSlowFrameThresholdNs, long continuousSlowFrameThresholdNs, long freezeDurationThresholdNs, long minViewLifetimeThresholdNs) {
        return new com.datadog.android.rum.configuration.SlowFramesConfiguration(maxSlowFramesAmount, maxSlowFrameThresholdNs, continuousSlowFrameThresholdNs, freezeDurationThresholdNs, minViewLifetimeThresholdNs);
    }

    /* renamed from: component5$dd_sdk_android_rum_release, reason: from getter */
    public final long getMinViewLifetimeThresholdNs() {
        return this.minViewLifetimeThresholdNs;
    }

    /* renamed from: component4$dd_sdk_android_rum_release, reason: from getter */
    public final long getFreezeDurationThresholdNs() {
        return this.freezeDurationThresholdNs;
    }

    /* renamed from: component3$dd_sdk_android_rum_release, reason: from getter */
    public final long getContinuousSlowFrameThresholdNs() {
        return this.continuousSlowFrameThresholdNs;
    }

    /* renamed from: component2$dd_sdk_android_rum_release, reason: from getter */
    public final long getMaxSlowFrameThresholdNs() {
        return this.maxSlowFrameThresholdNs;
    }

    /* renamed from: component1$dd_sdk_android_rum_release, reason: from getter */
    public final int getMaxSlowFramesAmount() {
        return this.maxSlowFramesAmount;
    }

    public SlowFramesConfiguration() {
        this(0, 0L, 0L, 0L, 0L, 31, null);
    }
}
