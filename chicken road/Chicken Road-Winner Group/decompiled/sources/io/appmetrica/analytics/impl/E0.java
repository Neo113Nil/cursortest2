package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;

/* loaded from: classes.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f5864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5866c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5867d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5868e;
    public final F0 f;

    public E0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j3, F0 f0) {
        this.f5864a = nativeCrashSource;
        this.f5865b = str;
        this.f5866c = str2;
        this.f5867d = str3;
        this.f5868e = j3;
        this.f = f0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        return this.f5864a == e02.f5864a && kotlin.jvm.internal.j.a(this.f5865b, e02.f5865b) && kotlin.jvm.internal.j.a(this.f5866c, e02.f5866c) && kotlin.jvm.internal.j.a(this.f5867d, e02.f5867d) && this.f5868e == e02.f5868e && kotlin.jvm.internal.j.a(this.f, e02.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((Long.hashCode(this.f5868e) + ((this.f5867d.hashCode() + ((this.f5866c.hashCode() + ((this.f5865b.hashCode() + (this.f5864a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f5864a + ", handlerVersion=" + this.f5865b + ", uuid=" + this.f5866c + ", dumpFile=" + this.f5867d + ", creationTime=" + this.f5868e + ", metadata=" + this.f + ')';
    }
}
