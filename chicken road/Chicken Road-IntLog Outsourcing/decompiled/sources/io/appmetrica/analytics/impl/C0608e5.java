package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0608e5 implements Wa, La, InterfaceC0879oh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8085a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f8086b;

    /* renamed from: c, reason: collision with root package name */
    public final C0541bf f8087c;

    /* renamed from: d, reason: collision with root package name */
    public final C0618ef f8088d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f8089e;

    /* renamed from: f, reason: collision with root package name */
    public final C1138yi f8090f;

    /* renamed from: g, reason: collision with root package name */
    public final C0612e9 f8091g;

    /* renamed from: h, reason: collision with root package name */
    public final C0732j0 f8092h;

    /* renamed from: i, reason: collision with root package name */
    public final C0758k0 f8093i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f8094j;

    /* renamed from: k, reason: collision with root package name */
    public final Vg f8095k;

    /* renamed from: l, reason: collision with root package name */
    public final R8 f8096l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f8097m;

    /* renamed from: n, reason: collision with root package name */
    public final C0948r9 f8098n;

    /* renamed from: o, reason: collision with root package name */
    public final Z4 f8099o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1104x9 f8100p;

    /* renamed from: q, reason: collision with root package name */
    public final C1020u3 f8101q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f8102r;

    /* renamed from: s, reason: collision with root package name */
    public final C1135yf f8103s;

    /* renamed from: t, reason: collision with root package name */
    public final zo f8104t;

    /* renamed from: u, reason: collision with root package name */
    public final Ok f8105u;

    /* renamed from: v, reason: collision with root package name */
    public final C1097x2 f8106v;

    public C0608e5(Context context, C0754jm c0754jm, X4 x42, C1047v4 c1047v4, InterfaceC0827mh interfaceC0827mh, AbstractC0557c5 abstractC0557c5) {
        this(context, x42, new C0758k0(), new TimePassedChecker(), new C0737j5(context, x42, c1047v4, abstractC0557c5, c0754jm, interfaceC0827mh, C1027ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C1027ua.k().l(), new W4()), c1047v4);
    }

    public final boolean A() {
        C0905ph c0905ph = (C0905ph) this.f8095k.a();
        return c0905ph.f9017n && this.f8102r.didTimePassSeconds(this.f8098n.f9159l, c0905ph.f9023t, "should force send permissions");
    }

    public final boolean B() {
        C0754jm c0754jm;
        C1135yf c1135yf = this.f8103s;
        c1135yf.f7623h.a(c1135yf.f7616a);
        boolean z = ((C1058vf) c1135yf.c()).f9472d;
        Vg vg = this.f8095k;
        synchronized (vg) {
            c0754jm = vg.f9443c.f7418a;
        }
        return !(z && c0754jm.f8575q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0754jm c0754jm) {
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f8086b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0732j0 c0732j0 = this.f8092h;
        synchronized (c0732j0) {
            c0732j0.f8469a = new Mc();
        }
        this.f8093i.a(this.f8092h.a(), this.f8087c);
    }

    public final synchronized void e() {
        ((C0944r5) this.f8100p).d();
    }

    public final C1097x2 f() {
        return this.f8106v;
    }

    public final C1020u3 g() {
        return this.f8101q;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f8085a;
    }

    public final C0541bf h() {
        return this.f8087c;
    }

    public final S6 i() {
        return this.f8089e;
    }

    public final R8 j() {
        return this.f8096l;
    }

    public final C0612e9 k() {
        return this.f8091g;
    }

    public final C0948r9 l() {
        return this.f8098n;
    }

    public final InterfaceC1104x9 m() {
        return this.f8100p;
    }

    public final C0905ph n() {
        return (C0905ph) this.f8095k.a();
    }

    public final String o() {
        return this.f8087c.j();
    }

    public final PublicLogger p() {
        return this.f8097m;
    }

    public final C0618ef q() {
        return this.f8088d;
    }

    public final Ok r() {
        return this.f8105u;
    }

    public final Wk s() {
        return this.f8094j;
    }

    public final C0754jm t() {
        C0754jm c0754jm;
        Vg vg = this.f8095k;
        synchronized (vg) {
            c0754jm = vg.f9443c.f7418a;
        }
        return c0754jm;
    }

    public final zo u() {
        return this.f8104t;
    }

    public final void v() {
        C0948r9 c0948r9 = this.f8098n;
        int i2 = c0948r9.f9158k;
        c0948r9.f9160m = i2;
        c0948r9.f9148a.a(i2).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        zo zoVar = this.f8104t;
        synchronized (zoVar) {
            optInt = zoVar.f9678a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f8099o.getClass();
            Iterator it = K1.b.W(new C0531b5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC0505a5) it.next()).a(optInt);
            }
            this.f8104t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0905ph c0905ph = (C0905ph) this.f8095k.a();
        return c0905ph.f9017n && c0905ph.isIdentifiersValid() && this.f8102r.didTimePassSeconds(this.f8098n.f9159l, c0905ph.f9022s, "need to check permissions");
    }

    public final boolean y() {
        C0948r9 c0948r9 = this.f8098n;
        return c0948r9.f9160m < c0948r9.f9158k && ((C0905ph) this.f8095k.a()).f9018o && ((C0905ph) this.f8095k.a()).isIdentifiersValid();
    }

    public final void z() {
        Vg vg = this.f8095k;
        synchronized (vg) {
            vg.f9441a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(W5 w5) {
        String a6 = Vf.a("Event received on service", EnumC0718ib.a(w5.f7651d), w5.getName(), w5.getValue());
        if (a6 != null) {
            this.f8097m.info(a6, new Object[0]);
        }
        String str = this.f8086b.f7698b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f8090f.a(w5, new C1113xi());
    }

    public final void b(W5 w5) {
        this.f8092h.a(w5.f7653f);
        C0707i0 a6 = this.f8092h.a();
        C0758k0 c0758k0 = this.f8093i;
        C0541bf c0541bf = this.f8087c;
        synchronized (c0758k0) {
            if (a6.f8374b > c0541bf.d().f8374b) {
                c0541bf.a(a6).b();
                this.f8097m.info("Save new app environment for %s. Value: %s", this.f8086b, a6.f8373a);
            }
        }
    }

    public C0608e5(Context context, X4 x42, C0758k0 c0758k0, TimePassedChecker timePassedChecker, C0737j5 c0737j5, C1047v4 c1047v4) {
        this.f8085a = context.getApplicationContext();
        this.f8086b = x42;
        this.f8093i = c0758k0;
        this.f8102r = timePassedChecker;
        zo f3 = c0737j5.f();
        this.f8104t = f3;
        this.f8103s = C1027ua.k().t();
        C0541bf a6 = c0737j5.e().a();
        this.f8087c = a6;
        this.f8106v = c0737j5.a(a6);
        Vg a7 = c0737j5.a(this);
        this.f8095k = a7;
        PublicLogger a8 = c0737j5.d().a();
        this.f8097m = a8;
        this.f8088d = C1027ua.k().z();
        C0732j0 a9 = c0758k0.a(x42, a8, a6);
        this.f8092h = a9;
        this.f8096l = c0737j5.a();
        S6 b6 = c0737j5.b(this);
        this.f8089e = b6;
        Ai d6 = c0737j5.d(this);
        this.f8099o = C0737j5.b();
        w();
        Wk a10 = C0737j5.a(this, f3, new C0583d5(this));
        this.f8094j = a10;
        a8.info("Read app environment for component %s. Value: %s", x42.toString(), a9.a().f8373a);
        Ok c2 = c0737j5.c();
        this.f8105u = c2;
        this.f8098n = c0737j5.a(a6, f3, a10, b6, a9, c2, d6);
        C0612e9 c6 = C0737j5.c(this);
        this.f8091g = c6;
        this.f8090f = C0737j5.a(this, c6);
        this.f8101q = c0737j5.b(a6);
        this.f8100p = c0737j5.a(d6, b6, a7, c1047v4, x42, a6);
        b6.e();
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public synchronized void a(C1047v4 c1047v4) {
        long j2;
        try {
            this.f8095k.a(c1047v4);
            boolean z = false;
            if (Boolean.TRUE.equals(c1047v4.f9433h)) {
                this.f8097m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c1047v4.f9433h)) {
                    this.f8097m.setEnabled(false);
                }
            }
            C1097x2 c1097x2 = this.f8106v;
            Set<String> set = c1047v4.f9440o;
            long currentTimeMillis = c1097x2.f9565d.currentTimeMillis();
            boolean z5 = false;
            for (String str : set) {
                Long l2 = (Long) c1097x2.f9566e.get(str);
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = -1;
                    z5 = true;
                }
                if (currentTimeMillis - j2 > c1097x2.f9563b) {
                    c1097x2.f9566e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c1097x2.a(c1097x2.f9566e);
                c1097x2.f9562a.a(c1097x2.f9566e);
            }
            if (z5) {
                this.f8095k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final synchronized void a(C0754jm c0754jm) {
        this.f8095k.a(c0754jm);
        ((C0944r5) this.f8100p).e();
    }

    public final void a(String str) {
        this.f8087c.j(str).b();
    }
}
