package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource f4312a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4313b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4314c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4315d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4316e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H0 f4317f;

    public G0(io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource nativeCrashSource, java.lang.String str, java.lang.String str2, java.lang.String str3, long j2, io.appmetrica.analytics.impl.H0 h02) {
        this.f4312a = nativeCrashSource;
        this.f4313b = str;
        this.f4314c = str2;
        this.f4315d = str3;
        this.f4316e = j2;
        this.f4317f = h02;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.impl.G0)) {
            return false;
        }
        io.appmetrica.analytics.impl.G0 g02 = (io.appmetrica.analytics.impl.G0) obj;
        return this.f4312a == g02.f4312a && kotlin.jvm.internal.i.a(this.f4313b, g02.f4313b) && kotlin.jvm.internal.i.a(this.f4314c, g02.f4314c) && kotlin.jvm.internal.i.a(this.f4315d, g02.f4315d) && this.f4316e == g02.f4316e && kotlin.jvm.internal.i.a(this.f4317f, g02.f4317f);
    }

    public final int hashCode() {
        return this.f4317f.hashCode() + ((java.lang.Long.hashCode(this.f4316e) + B1.a.e(this.f4315d, B1.a.e(this.f4314c, B1.a.e(this.f4313b, this.f4312a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final java.lang.String toString() {
        return "AppMetricaNativeCrash(source=" + this.f4312a + ", handlerVersion=" + this.f4313b + ", uuid=" + this.f4314c + ", dumpFile=" + this.f4315d + ", creationTime=" + this.f4316e + ", metadata=" + this.f4317f + ')';
    }
}
