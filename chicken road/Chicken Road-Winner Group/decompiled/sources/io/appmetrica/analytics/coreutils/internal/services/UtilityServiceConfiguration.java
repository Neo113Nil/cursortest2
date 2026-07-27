package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final long f5455a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5456b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j3, long j4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = utilityServiceConfiguration.f5455a;
        }
        if ((i3 & 2) != 0) {
            j4 = utilityServiceConfiguration.f5456b;
        }
        return utilityServiceConfiguration.copy(j3, j4);
    }

    public final long component1() {
        return this.f5455a;
    }

    public final long component2() {
        return this.f5456b;
    }

    public final UtilityServiceConfiguration copy(long j3, long j4) {
        return new UtilityServiceConfiguration(j3, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        return this.f5455a == utilityServiceConfiguration.f5455a && this.f5456b == utilityServiceConfiguration.f5456b;
    }

    public final long getInitialConfigTime() {
        return this.f5455a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f5456b;
    }

    public int hashCode() {
        return Long.hashCode(this.f5456b) + (Long.hashCode(this.f5455a) * 31);
    }

    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f5455a + ", lastUpdateConfigTime=" + this.f5456b + ')';
    }

    public UtilityServiceConfiguration(long j3, long j4) {
        this.f5455a = j3;
        this.f5456b = j4;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j3, long j4, int i3, f fVar) {
        this((i3 & 1) != 0 ? 0L : j3, (i3 & 2) != 0 ? 0L : j4);
    }
}
