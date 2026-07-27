package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6761a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6762b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f6763c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6764d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6765e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6766f;

    public F0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i2, String str3, String str4) {
        this.f6761a = str;
        this.f6762b = str2;
        this.f6763c = counterConfigurationReporterType;
        this.f6764d = i2;
        this.f6765e = str3;
        this.f6766f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return kotlin.jvm.internal.i.a(this.f6761a, f02.f6761a) && kotlin.jvm.internal.i.a(this.f6762b, f02.f6762b) && this.f6763c == f02.f6763c && this.f6764d == f02.f6764d && kotlin.jvm.internal.i.a(this.f6765e, f02.f6765e) && kotlin.jvm.internal.i.a(this.f6766f, f02.f6766f);
    }

    public final int hashCode() {
        int f3 = B0.o.f(this.f6765e, (Integer.hashCode(this.f6764d) + ((this.f6763c.hashCode() + B0.o.f(this.f6762b, this.f6761a.hashCode() * 31, 31)) * 31)) * 31, 31);
        String str = this.f6766f;
        return f3 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb.append(this.f6761a);
        sb.append(", packageName=");
        sb.append(this.f6762b);
        sb.append(", reporterType=");
        sb.append(this.f6763c);
        sb.append(", processID=");
        sb.append(this.f6764d);
        sb.append(", processSessionID=");
        sb.append(this.f6765e);
        sb.append(", errorEnvironment=");
        return B0.o.l(sb, this.f6766f, ')');
    }
}
