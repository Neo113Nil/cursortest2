package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f1903a;

    /* renamed from: b, reason: collision with root package name */
    private final long f1904b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = utilityServiceConfiguration.f1903a;
        }
        if ((i2 & 2) != 0) {
            j3 = utilityServiceConfiguration.f1904b;
        }
        return utilityServiceConfiguration.copy(j2, j3);
    }

    public final long component1() {
        return this.f1903a;
    }

    public final long component2() {
        return this.f1904b;
    }

    public final UtilityServiceConfiguration copy(long j2, long j3) {
        return new UtilityServiceConfiguration(j2, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f1903a == utilityServiceConfiguration.f1903a && this.f1904b == utilityServiceConfiguration.f1904b;
    }

    public final long getInitialConfigTime() {
        return this.f1903a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f1904b;
    }

    public int hashCode() {
        return Long.hashCode(this.f1904b) + (Long.hashCode(this.f1903a) * 31);
    }

    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f1903a + ", lastUpdateConfigTime=" + this.f1904b + ')';
    }

    public UtilityServiceConfiguration(long j2, long j3) {
        this.f1903a = j2;
        this.f1904b = j3;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j2, long j3, int i2, f fVar) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? 0L : j3);
    }
}
