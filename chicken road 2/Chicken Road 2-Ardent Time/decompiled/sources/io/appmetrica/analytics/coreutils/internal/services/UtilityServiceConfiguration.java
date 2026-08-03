package io.appmetrica.analytics.coreutils.internal.services;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f3772a;

    /* renamed from: b, reason: collision with root package name */
    private final long f3773b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration copy$default(io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration, long j2, long j3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j2 = utilityServiceConfiguration.f3772a;
        }
        if ((i2 & 2) != 0) {
            j3 = utilityServiceConfiguration.f3773b;
        }
        return utilityServiceConfiguration.copy(j2, j3);
    }

    public final long component1() {
        return this.f3772a;
    }

    public final long component2() {
        return this.f3773b;
    }

    public final io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration copy(long j2, long j3) {
        return new io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration(j2, j3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration)) {
            return false;
        }
        io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration utilityServiceConfiguration = (io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration) obj;
        return this.f3772a == utilityServiceConfiguration.f3772a && this.f3773b == utilityServiceConfiguration.f3773b;
    }

    public final long getInitialConfigTime() {
        return this.f3772a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f3773b;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f3773b) + (java.lang.Long.hashCode(this.f3772a) * 31);
    }

    public java.lang.String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f3772a + ", lastUpdateConfigTime=" + this.f3773b + ')';
    }

    public UtilityServiceConfiguration(long j2, long j3) {
        this.f3772a = j2;
        this.f3773b = j3;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j2, long j3, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3);
    }
}
