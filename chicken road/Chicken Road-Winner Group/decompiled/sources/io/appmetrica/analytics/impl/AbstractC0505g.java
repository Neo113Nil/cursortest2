package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0505g {

    /* renamed from: a, reason: collision with root package name */
    public final C0459e5 f7315a;

    /* renamed from: b, reason: collision with root package name */
    public final Vk f7316b;

    /* renamed from: c, reason: collision with root package name */
    public final Zk f7317c;

    /* renamed from: d, reason: collision with root package name */
    public final Uk f7318d;

    /* renamed from: e, reason: collision with root package name */
    public final Ya f7319e;
    public final SystemTimeProvider f;

    public AbstractC0505g(C0459e5 c0459e5, Vk vk, Zk zk, Uk uk, Ya ya, SystemTimeProvider systemTimeProvider) {
        this.f7315a = c0459e5;
        this.f7316b = vk;
        this.f7317c = zk;
        this.f7318d = uk;
        this.f7319e = ya;
        this.f = systemTimeProvider;
    }

    public final /* bridge */ Ik a(Object obj) {
        return a((Jk) obj);
    }

    public final Ik b() {
        if (this.f7317c.h()) {
            return new Ik(this.f7315a, this.f7317c, a(), this.f);
        }
        return null;
    }

    public final Ik a(Jk jk) {
        if (this.f7317c.h()) {
            this.f7319e.reportEvent("create session with non-empty storage");
        }
        C0459e5 c0459e5 = this.f7315a;
        Zk zk = this.f7317c;
        long a3 = this.f7316b.a();
        Zk zk2 = this.f7317c;
        zk2.a(Zk.f, Long.valueOf(a3));
        zk2.a(Zk.f6918d, Long.valueOf(jk.f6166a));
        zk2.a(Zk.f6921h, Long.valueOf(jk.f6166a));
        zk2.a(Zk.f6920g, 0L);
        zk2.a(Zk.f6922i, Boolean.TRUE);
        zk2.b();
        this.f7315a.f7197e.a(a3, this.f7318d.f6729a, TimeUnit.MILLISECONDS.toSeconds(jk.f6167b));
        return new Ik(c0459e5, zk, a(), new SystemTimeProvider());
    }

    public final Lk a() {
        Kk kk = new Kk(this.f7318d);
        kk.f6193g = this.f7317c.i();
        kk.f = this.f7317c.f6925c.a(Zk.f6920g);
        kk.f6191d = this.f7317c.f6925c.a(Zk.f6921h);
        kk.f6190c = this.f7317c.f6925c.a(Zk.f);
        kk.f6194h = this.f7317c.f6925c.a(Zk.f6918d);
        kk.f6188a = this.f7317c.f6925c.a(Zk.f6919e);
        return new Lk(kk);
    }
}
