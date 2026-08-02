package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class Qj implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11226a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f11227b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f11228c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f11229d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f11230e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f11231g;

    /* renamed from: h, reason: collision with root package name */
    public final ID f11232h;
    public final ID i;

    public Qj(C1476qf c1476qf, Hh hh, ID id, C0650Nf c0650Nf, DD dd, DD dd2, CD cd, CD cd2) {
        this.f11226a = 0;
        this.f11230e = c1476qf;
        this.f11227b = hh;
        this.f = id;
        this.f11231g = c0650Nf;
        this.f11232h = dd;
        this.i = dd2;
        this.f11228c = cd;
        this.f11229d = cd2;
    }

    public Pj a() {
        T2.I a5 = ((C1476qf) this.f11230e).a();
        Wq a6 = ((Hh) this.f11227b).a();
        Ij ij = (Ij) this.f.d();
        Gj a7 = ((C0650Nf) this.f11231g).a();
        Wj wj = (Wj) ((DD) this.f11232h).d();
        C0765ak c0765ak = (C0765ak) ((DD) this.i).d();
        Executor executor = (Executor) this.f11228c.d();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Pj(a5, a6, ij, a7, wj, c0765ak, executor, c0606Hd, (Ej) this.f11229d.d());
    }

    public C1258lm b() {
        C0554Af c0554Af = (C0554Af) ((ED) this.f11230e).f8474a;
        Context a5 = ((C1565sf) this.f).a();
        U2.a a6 = ((C1745wf) this.f11231g).a();
        Wq a7 = ((Hh) this.f11227b).a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new C1258lm(c0554Af, a5, a6, a7, c0606Hd, (String) ((DD) this.f11232h).d(), (Mr) this.f11228c.d(), (C1392ol) this.f11229d.d(), new V9(14), (ScheduledExecutorService) ((CD) this.i).d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f11226a) {
            case 0:
                return a();
            case 1:
                return new C1750wk(((Hh) this.f11227b).a(), (Executor) this.f11228c.d(), (Wk) this.f11229d.d(), (Context) ((CD) this.f11230e).d(), (C1482ql) ((CD) this.f).d(), (C1041gs) ((CD) this.f11231g).d(), (Xm) ((CD) this.f11232h).d(), (Nk) ((CD) this.i).d());
            case 2:
                return new Hk((Kh) this.f11228c.d(), (Yh) this.f11229d.d(), (C0941ei) ((CD) this.f11230e).d(), (C1076hi) ((CD) this.f11227b).d(), (C1793xi) ((CD) this.f).d(), ((C1119ih) this.f11231g).a(), ((C1119ih) this.f11232h).f13965b.r(), (C1074hg) ((CD) this.i).d());
            case 3:
                return new Ul((Vl) this.f11228c.d(), (C0812bm) this.f11229d.d(), (Ml) ((CD) this.f11230e).d(), ((C1565sf) this.f11227b).a(), ((C1745wf) this.f).a(), (Ql) ((CD) this.f11231g).d(), (BinderC0767am) ((CD) this.f11232h).d(), new SharedPreferencesOnSharedPreferenceChangeListenerC1294md(), new SharedPreferencesOnSharedPreferenceChangeListenerC1294md(), ((C1520rf) this.i).c());
            case 4:
                return b();
            default:
                return new Iq((String) ((ED) this.f11230e).f8474a, (Fq) this.f11228c.d(), (Context) ((ED) this.f11227b).f8474a, (Bq) this.f11229d.d(), (Tq) ((CD) this.f).d(), ((C1745wf) this.f11231g).a(), (Q4) ((CD) this.f11232h).d(), (C1482ql) ((CD) this.i).d());
        }
    }

    public Qj(Hh hh, CD cd, CD cd2, CD cd3, CD cd4, CD cd5, CD cd6, CD cd7) {
        this.f11226a = 1;
        this.f11227b = hh;
        this.f11228c = cd;
        this.f11229d = cd2;
        this.f11230e = cd3;
        this.f = cd4;
        this.f11231g = cd5;
        this.f11232h = cd6;
        this.i = cd7;
    }

    public /* synthetic */ Qj(CD cd, CD cd2, CD cd3, ID id, ID id2, ID id3, ID id4, ID id5, int i) {
        this.f11226a = i;
        this.f11228c = cd;
        this.f11229d = cd2;
        this.f11230e = cd3;
        this.f11227b = id;
        this.f = id2;
        this.f11231g = id3;
        this.f11232h = id4;
        this.i = id5;
    }

    public Qj(ED ed, C1565sf c1565sf, C1745wf c1745wf, Hh hh, DD dd, CD cd, CD cd2, CD cd3) {
        this.f11226a = 4;
        this.f11230e = ed;
        this.f = c1565sf;
        this.f11231g = c1745wf;
        this.f11227b = hh;
        this.f11232h = dd;
        this.f11228c = cd;
        this.f11229d = cd2;
        this.i = cd3;
    }

    public Qj(ED ed, CD cd, ED ed2, CD cd2, CD cd3, C1745wf c1745wf, CD cd4, CD cd5) {
        this.f11226a = 5;
        this.f11230e = ed;
        this.f11228c = cd;
        this.f11227b = ed2;
        this.f11229d = cd2;
        this.f = cd3;
        this.f11231g = c1745wf;
        this.f11232h = cd4;
        this.i = cd5;
    }
}
