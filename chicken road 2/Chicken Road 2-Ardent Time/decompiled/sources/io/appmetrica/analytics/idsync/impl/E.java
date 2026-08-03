package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3891a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3893c;

    public E(java.lang.String str, long j2, int i2) {
        this.f3891a = str;
        this.f3892b = j2;
        this.f3893c = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.idsync.impl.E)) {
            return false;
        }
        io.appmetrica.analytics.idsync.impl.E e2 = (io.appmetrica.analytics.idsync.impl.E) obj;
        return kotlin.jvm.internal.i.a(this.f3891a, e2.f3891a) && this.f3892b == e2.f3892b && this.f3893c == e2.f3893c;
    }

    public final int hashCode() {
        return io.appmetrica.analytics.idsync.impl.A.a(this.f3893c) + ((java.lang.Long.hashCode(this.f3892b) + (this.f3891a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "RequestState(type=" + this.f3891a + ", lastAttempt=" + this.f3892b + ", lastAttemptResult=" + io.appmetrica.analytics.idsync.impl.z.b(this.f3893c) + ')';
    }
}
