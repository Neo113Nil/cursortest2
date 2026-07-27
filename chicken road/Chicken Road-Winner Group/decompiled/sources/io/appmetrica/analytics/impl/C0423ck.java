package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423ck {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f7117a;

    /* renamed from: b, reason: collision with root package name */
    public C0469ef f7118b;

    /* renamed from: c, reason: collision with root package name */
    public TimeProvider f7119c;

    public static C0423ck c() {
        return AbstractC0397bk.f7063a;
    }

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f7117a;
    }

    public final synchronized void b() {
        this.f7118b.d(false);
        this.f7118b.b();
    }

    public final synchronized long d() {
        return this.f7117a;
    }

    public final synchronized void e() {
        a(C0878ua.f8414H.z(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f7118b.b(true);
    }

    public final synchronized void a(long j3, Long l3) {
        try {
            this.f7117a = (j3 - this.f7119c.currentTimeMillis()) / 1000;
            boolean z3 = true;
            if (this.f7118b.b(true)) {
                if (l3 != null) {
                    long abs = Math.abs(j3 - this.f7119c.currentTimeMillis());
                    C0469ef c0469ef = this.f7118b;
                    if (abs <= TimeUnit.SECONDS.toMillis(l3.longValue())) {
                        z3 = false;
                    }
                    c0469ef.d(z3);
                } else {
                    this.f7118b.d(false);
                }
            }
            this.f7118b.d(this.f7117a);
            this.f7118b.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(C0469ef c0469ef, TimeProvider timeProvider) {
        this.f7118b = c0469ef;
        this.f7117a = c0469ef.a(0);
        this.f7119c = timeProvider;
    }
}
