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
public class C0459e5 implements Wa, La, InterfaceC0730oh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7193a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f7194b;

    /* renamed from: c, reason: collision with root package name */
    public final C0392bf f7195c;

    /* renamed from: d, reason: collision with root package name */
    public final C0469ef f7196d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f7197e;
    public final C0989yi f;

    /* renamed from: g, reason: collision with root package name */
    public final C0463e9 f7198g;

    /* renamed from: h, reason: collision with root package name */
    public final C0583j0 f7199h;

    /* renamed from: i, reason: collision with root package name */
    public final C0609k0 f7200i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f7201j;

    /* renamed from: k, reason: collision with root package name */
    public final Vg f7202k;

    /* renamed from: l, reason: collision with root package name */
    public final R8 f7203l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f7204m;

    /* renamed from: n, reason: collision with root package name */
    public final C0799r9 f7205n;

    /* renamed from: o, reason: collision with root package name */
    public final Z4 f7206o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0955x9 f7207p;

    /* renamed from: q, reason: collision with root package name */
    public final C0871u3 f7208q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f7209r;

    /* renamed from: s, reason: collision with root package name */
    public final C0986yf f7210s;

    /* renamed from: t, reason: collision with root package name */
    public final zo f7211t;

    /* renamed from: u, reason: collision with root package name */
    public final Ok f7212u;

    /* renamed from: v, reason: collision with root package name */
    public final C0948x2 f7213v;

    public C0459e5(Context context, C0605jm c0605jm, X4 x4, C0898v4 c0898v4, InterfaceC0678mh interfaceC0678mh, AbstractC0408c5 abstractC0408c5) {
        this(context, x4, new C0609k0(), new TimePassedChecker(), new C0588j5(context, x4, c0898v4, abstractC0408c5, c0605jm, interfaceC0678mh, C0878ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0878ua.k().l(), new W4()), c0898v4);
    }

    public final boolean A() {
        C0756ph c0756ph = (C0756ph) this.f7202k.a();
        return c0756ph.f8080n && this.f7209r.didTimePassSeconds(this.f7205n.f8215l, c0756ph.f8086t, "should force send permissions");
    }

    public final boolean B() {
        C0605jm c0605jm;
        C0986yf c0986yf = this.f7210s;
        c0986yf.f6749h.a(c0986yf.f6743a);
        boolean z3 = ((C0909vf) c0986yf.c()).f8517d;
        Vg vg = this.f7202k;
        synchronized (vg) {
            c0605jm = vg.f8489c.f6552a;
        }
        return !(z3 && c0605jm.f7657q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0605jm c0605jm) {
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f7194b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0583j0 c0583j0 = this.f7199h;
        synchronized (c0583j0) {
            c0583j0.f7558a = new Mc();
        }
        this.f7200i.a(this.f7199h.a(), this.f7195c);
    }

    public final synchronized void e() {
        ((C0795r5) this.f7207p).d();
    }

    public final C0948x2 f() {
        return this.f7213v;
    }

    public final C0871u3 g() {
        return this.f7208q;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f7193a;
    }

    public final C0392bf h() {
        return this.f7195c;
    }

    public final S6 i() {
        return this.f7197e;
    }

    public final R8 j() {
        return this.f7203l;
    }

    public final C0463e9 k() {
        return this.f7198g;
    }

    public final C0799r9 l() {
        return this.f7205n;
    }

    public final InterfaceC0955x9 m() {
        return this.f7207p;
    }

    public final C0756ph n() {
        return (C0756ph) this.f7202k.a();
    }

    public final String o() {
        return this.f7195c.j();
    }

    public final PublicLogger p() {
        return this.f7204m;
    }

    public final C0469ef q() {
        return this.f7196d;
    }

    public final Ok r() {
        return this.f7212u;
    }

    public final Wk s() {
        return this.f7201j;
    }

    public final C0605jm t() {
        C0605jm c0605jm;
        Vg vg = this.f7202k;
        synchronized (vg) {
            c0605jm = vg.f8489c.f6552a;
        }
        return c0605jm;
    }

    public final zo u() {
        return this.f7211t;
    }

    public final void v() {
        C0799r9 c0799r9 = this.f7205n;
        int i3 = c0799r9.f8214k;
        c0799r9.f8216m = i3;
        c0799r9.f8205a.a(i3).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        zo zoVar = this.f7211t;
        synchronized (zoVar) {
            optInt = zoVar.f8715a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f7206o.getClass();
            Iterator it = X0.a.z(new C0382b5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC0356a5) it.next()).a(optInt);
            }
            this.f7211t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0756ph c0756ph = (C0756ph) this.f7202k.a();
        return c0756ph.f8080n && c0756ph.isIdentifiersValid() && this.f7209r.didTimePassSeconds(this.f7205n.f8215l, c0756ph.f8085s, "need to check permissions");
    }

    public final boolean y() {
        C0799r9 c0799r9 = this.f7205n;
        return c0799r9.f8216m < c0799r9.f8214k && ((C0756ph) this.f7202k.a()).f8081o && ((C0756ph) this.f7202k.a()).isIdentifiersValid();
    }

    public final void z() {
        Vg vg = this.f7202k;
        synchronized (vg) {
            vg.f8487a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(W5 w5) {
        String a3 = Vf.a("Event received on service", EnumC0569ib.a(w5.f6778d), w5.getName(), w5.getValue());
        if (a3 != null) {
            this.f7204m.info(a3, new Object[0]);
        }
        String str = this.f7194b.f6823b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f.a(w5, new C0964xi());
    }

    public final void b(W5 w5) {
        this.f7199h.a(w5.f);
        C0558i0 a3 = this.f7199h.a();
        C0609k0 c0609k0 = this.f7200i;
        C0392bf c0392bf = this.f7195c;
        synchronized (c0609k0) {
            if (a3.f7468b > c0392bf.d().f7468b) {
                c0392bf.a(a3).b();
                this.f7204m.info("Save new app environment for %s. Value: %s", this.f7194b, a3.f7467a);
            }
        }
    }

    public C0459e5(Context context, X4 x4, C0609k0 c0609k0, TimePassedChecker timePassedChecker, C0588j5 c0588j5, C0898v4 c0898v4) {
        this.f7193a = context.getApplicationContext();
        this.f7194b = x4;
        this.f7200i = c0609k0;
        this.f7209r = timePassedChecker;
        zo f = c0588j5.f();
        this.f7211t = f;
        this.f7210s = C0878ua.k().t();
        C0392bf a3 = c0588j5.e().a();
        this.f7195c = a3;
        this.f7213v = c0588j5.a(a3);
        Vg a4 = c0588j5.a(this);
        this.f7202k = a4;
        PublicLogger a5 = c0588j5.d().a();
        this.f7204m = a5;
        this.f7196d = C0878ua.k().z();
        C0583j0 a6 = c0609k0.a(x4, a5, a3);
        this.f7199h = a6;
        this.f7203l = c0588j5.a();
        S6 b3 = c0588j5.b(this);
        this.f7197e = b3;
        Ai d3 = c0588j5.d(this);
        this.f7206o = C0588j5.b();
        w();
        Wk a7 = C0588j5.a(this, f, new C0434d5(this));
        this.f7201j = a7;
        a5.info("Read app environment for component %s. Value: %s", x4.toString(), a6.a().f7467a);
        Ok c3 = c0588j5.c();
        this.f7212u = c3;
        this.f7205n = c0588j5.a(a3, f, a7, b3, a6, c3, d3);
        C0463e9 c4 = C0588j5.c(this);
        this.f7198g = c4;
        this.f = C0588j5.a(this, c4);
        this.f7208q = c0588j5.b(a3);
        this.f7207p = c0588j5.a(d3, b3, a4, c0898v4, x4, a3);
        b3.e();
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public synchronized void a(C0898v4 c0898v4) {
        long j3;
        try {
            this.f7202k.a(c0898v4);
            boolean z3 = false;
            if (Boolean.TRUE.equals(c0898v4.f8479h)) {
                this.f7204m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0898v4.f8479h)) {
                    this.f7204m.setEnabled(false);
                }
            }
            C0948x2 c0948x2 = this.f7213v;
            Set<String> set = c0898v4.f8486o;
            long currentTimeMillis = c0948x2.f8606d.currentTimeMillis();
            boolean z4 = false;
            for (String str : set) {
                Long l3 = (Long) c0948x2.f8607e.get(str);
                if (l3 != null) {
                    j3 = l3.longValue();
                } else {
                    j3 = -1;
                    z4 = true;
                }
                if (currentTimeMillis - j3 > c0948x2.f8604b) {
                    c0948x2.f8607e.put(str, Long.valueOf(currentTimeMillis));
                    z3 = true;
                }
            }
            if (z3) {
                c0948x2.a(c0948x2.f8607e);
                c0948x2.f8603a.a(c0948x2.f8607e);
            }
            if (z4) {
                this.f7202k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final synchronized void a(C0605jm c0605jm) {
        this.f7202k.a(c0605jm);
        ((C0795r5) this.f7207p).e();
    }

    public final void a(String str) {
        this.f7195c.j(str).b();
    }
}
