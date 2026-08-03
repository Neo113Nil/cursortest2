package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qk {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0833xo f4872a;

    public Qk(io.appmetrica.analytics.impl.C0833xo c0833xo) {
        this.f4872a = c0833xo;
    }

    public final long a() {
        long optLong;
        io.appmetrica.analytics.impl.C0833xo c0833xo = this.f4872a;
        synchronized (c0833xo) {
            optLong = c0833xo.f7123a.a().optLong("session_id", -1L);
        }
        long j2 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f4872a.b(j2);
        return j2;
    }
}
