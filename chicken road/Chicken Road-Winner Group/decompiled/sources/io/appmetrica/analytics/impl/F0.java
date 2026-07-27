package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5921b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f5922c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5923d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5924e;
    public final String f;

    public F0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i3, String str3, String str4) {
        this.f5920a = str;
        this.f5921b = str2;
        this.f5922c = counterConfigurationReporterType;
        this.f5923d = i3;
        this.f5924e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f0 = (F0) obj;
        return kotlin.jvm.internal.j.a(this.f5920a, f0.f5920a) && kotlin.jvm.internal.j.a(this.f5921b, f0.f5921b) && this.f5922c == f0.f5922c && this.f5923d == f0.f5923d && kotlin.jvm.internal.j.a(this.f5924e, f0.f5924e) && kotlin.jvm.internal.j.a(this.f, f0.f);
    }

    public final int hashCode() {
        int hashCode = (this.f5924e.hashCode() + ((Integer.hashCode(this.f5923d) + ((this.f5922c.hashCode() + ((this.f5921b.hashCode() + (this.f5920a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AppMetricaNativeCrashMetadata(apiKey=" + this.f5920a + ", packageName=" + this.f5921b + ", reporterType=" + this.f5922c + ", processID=" + this.f5923d + ", processSessionID=" + this.f5924e + ", errorEnvironment=" + this.f + ')';
    }
}
