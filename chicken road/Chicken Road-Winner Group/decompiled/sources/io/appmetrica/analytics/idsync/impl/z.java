package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f5632a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5633b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5634c;

    public z(String str, long j3, int i3) {
        this.f5632a = str;
        this.f5633b = j3;
        this.f5634c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.j.a(this.f5632a, zVar.f5632a) && this.f5633b == zVar.f5633b && this.f5634c == zVar.f5634c;
    }

    public final int hashCode() {
        return v.a(this.f5634c) + ((Long.hashCode(this.f5633b) + (this.f5632a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RequestState(type=" + this.f5632a + ", lastAttempt=" + this.f5633b + ", lastAttemptResult=" + u.b(this.f5634c) + ')';
    }
}
