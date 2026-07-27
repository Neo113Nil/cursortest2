package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vk {

    /* renamed from: a, reason: collision with root package name */
    public final zo f6763a;

    public Vk(zo zoVar) {
        this.f6763a = zoVar;
    }

    public final long a() {
        long optLong;
        zo zoVar = this.f6763a;
        synchronized (zoVar) {
            optLong = zoVar.f8715a.a().optLong("session_id", -1L);
        }
        long j3 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f6763a.c(j3);
        return j3;
    }
}
