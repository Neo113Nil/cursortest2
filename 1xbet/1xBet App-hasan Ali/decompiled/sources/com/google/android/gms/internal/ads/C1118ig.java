package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ig, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118ig implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13958a;

    /* renamed from: b, reason: collision with root package name */
    public final DD f13959b;

    /* renamed from: c, reason: collision with root package name */
    public final DD f13960c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f13961d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f13962e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f13963g;

    public C1118ig(C1476qf c1476qf, C1565sf c1565sf, CD cd, C1520rf c1520rf, Hh hh, C1745wf c1745wf) {
        this.f13958a = 8;
        this.f13960c = c1476qf;
        this.f13959b = c1565sf;
        this.f13961d = cd;
        this.f13962e = c1520rf;
        this.f = hh;
        this.f13963g = c1745wf;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13958a) {
            case 0:
                Context a5 = ((C1565sf) this.f13959b).a();
                T2.I a6 = ((C1476qf) this.f13960c).a();
                C1214kn c1214kn = (C1214kn) this.f13961d.d();
                C0766al c0766al = (C0766al) ((CD) this.f13962e).d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1074hg(a5, a6, c1214kn, c0766al, c0606Hd, (Qw) ((CD) this.f).d(), (ScheduledExecutorService) ((CD) this.f13963g).d());
            case 1:
                return new C1747wh(((C1565sf) this.f13959b).a(), ((Hh) this.f).a(), ((C1745wf) this.f13963g).a(), ((C1476qf) this.f13960c).a(), (Kl) this.f13961d.d(), (Nr) ((CD) this.f13962e).d());
            case 2:
                Context a7 = ((C1565sf) this.f13959b).a();
                C1390oj c1390oj = ((C0942ej) this.f13960c).f13327b;
                return new C1210kj(a7, (InterfaceC0677Re) c1390oj.f14828m, ((C1119ih) this.f13962e).a(), ((C1745wf) this.f).a(), (EnumC1818y6) ((DD) this.f13963g).d(), (C1125in) this.f13961d.d());
            case 3:
                C0554Af c0554Af = (C0554Af) ((ED) this.f13959b).f8474a;
                Gh a8 = ((Hh) this.f13960c).f9452b.a();
                Hi hi = (Hi) this.f13962e;
                C1435pj c1435pj = (C1435pj) this.f;
                C1344ni a9 = ((C1701vg) this.f13963g).a();
                C0769ao c0769ao = (C0769ao) this.f13961d.d();
                C0554Af c0554Af2 = c0554Af.f7646b;
                Gh gh = new Gh(a8);
                Qt qt = null;
                C1529ro c1529ro = new C1529ro(0, qt);
                C0709Wb c0709Wb = new C0709Wb(15, a9, qt);
                Mt mt = new Mt(15, qt);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8663B3)).booleanValue()) {
                    qt = new Qt(23);
                    qt.f11282l = c0769ao;
                }
                Gi gi = hi.f9454b;
                AbstractC1400ot.L(Gi.class, gi);
                if (qt == null) {
                    qt = new Qt(23);
                }
                C1390oj c1390oj2 = c1435pj.f15020b;
                AbstractC1400ot.L(C1390oj.class, c1390oj2);
                InterfaceC0896dh interfaceC0896dh = (InterfaceC0896dh) new C0594Ff(c0554Af2, mt, c1390oj2, new Oi(13), gi, gh, qt, c1529ro, c0709Wb, null, null).f8965D0.d();
                AbstractC1400ot.D(interfaceC0896dh);
                return interfaceC0896dh;
            case 4:
                Context a10 = ((C1565sf) this.f13959b).a();
                Wq a11 = ((Hh) this.f13960c).a();
                C1071hd a12 = ((C0847cd) this.f13963g).a();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new C1213km(a10, a11, a12, c0606Hd2, (ScheduledExecutorService) this.f13961d.d(), (Qm) ((CD) this.f13962e).d(), (Mr) ((CD) this.f).d());
            case 5:
                C0554Af c0554Af3 = (C0554Af) ((ED) this.f13959b).f8474a;
                C1435pj c1435pj2 = (C1435pj) this.f13960c;
                Gh a13 = ((Hh) this.f).f9452b.a();
                Hi hi2 = (Hi) this.f13963g;
                return new Un(c0554Af3, c1435pj2.f15020b, a13, hi2.f9454b, (C0769ao) this.f13961d.d(), (C1528rn) ((CD) this.f13962e).d());
            case 6:
                C0554Af c0554Af4 = (C0554Af) ((ED) this.f13959b).f8474a;
                Gh a14 = ((Hh) this.f13960c).f9452b.a();
                C1574so c1574so = (C1574so) this.f;
                Hi hi3 = (Hi) this.f13963g;
                return new Un(c0554Af4, a14, c1574so.f15601b, hi3.f9454b, (C0769ao) this.f13961d.d(), (C1528rn) ((CD) this.f13962e).d());
            case 7:
                C0554Af c0554Af5 = (C0554Af) ((ED) this.f13959b).f8474a;
                Gh a15 = ((Hh) this.f13960c).f9452b.a();
                Hi hi4 = (Hi) this.f;
                return new Un(c0554Af5, a15, hi4.f9454b, ((Hh) this.f13963g).f9452b.f9209d, (C0769ao) this.f13961d.d(), (C1528rn) ((CD) this.f13962e).d());
            case 8:
                T2.I a16 = ((C1476qf) this.f13960c).a();
                Context a17 = ((C1565sf) this.f13959b).a();
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new Sp(a16, a17, c0606Hd3, (ScheduledExecutorService) this.f13961d.d(), new C1864z7(((C1520rf) this.f13962e).f15326b.a(), false), ((Hh) this.f).a(), ((C1745wf) this.f13963g).a());
            case 9:
                return new C0949eq((Context) ((ED) this.f13959b).f8474a, (Executor) this.f13961d.d(), (C0554Af) ((ED) this.f13960c).f8474a, ((Bn) this.f).a(), (C0904dq) ((CD) this.f13962e).d(), new Vq(), ((C1745wf) this.f13963g).a());
            case 10:
                return new Fq((Context) ((ED) this.f13959b).f8474a, (Executor) this.f13961d.d(), (C0554Af) ((ED) this.f13960c).f8474a, ((Bn) this.f13963g).a(), (Bq) ((CD) this.f13962e).d(), new Vq(), (Tq) ((CD) this.f).d());
            default:
                return new Zq((C1041gs) this.f13961d.d(), (C0906ds) ((CD) this.f13962e).d(), ((C1119ih) this.f13959b).a(), ((C1119ih) this.f13960c).f13965b.r(), (C1074hg) ((CD) this.f).d(), (Mr) ((CD) this.f13963g).d());
        }
    }

    public C1118ig(C1565sf c1565sf, C1476qf c1476qf, CD cd, CD cd2, CD cd3, CD cd4) {
        this.f13958a = 0;
        this.f13959b = c1565sf;
        this.f13960c = c1476qf;
        this.f13961d = cd;
        this.f13962e = cd2;
        this.f = cd3;
        this.f13963g = cd4;
    }

    public C1118ig(C1565sf c1565sf, Hh hh, C0847cd c0847cd, CD cd, CD cd2, CD cd3) {
        this.f13958a = 4;
        this.f13959b = c1565sf;
        this.f13960c = hh;
        this.f13963g = c0847cd;
        this.f13961d = cd;
        this.f13962e = cd2;
        this.f = cd3;
    }

    public C1118ig(C1565sf c1565sf, Hh hh, C1745wf c1745wf, C1476qf c1476qf, CD cd, CD cd2) {
        this.f13958a = 1;
        this.f13959b = c1565sf;
        this.f = hh;
        this.f13963g = c1745wf;
        this.f13960c = c1476qf;
        this.f13961d = cd;
        this.f13962e = cd2;
    }

    public C1118ig(CD cd, CD cd2, C1119ih c1119ih, C1119ih c1119ih2, CD cd3, CD cd4) {
        this.f13958a = 11;
        this.f13961d = cd;
        this.f13962e = cd2;
        this.f13959b = c1119ih;
        this.f13960c = c1119ih2;
        this.f = cd3;
        this.f13963g = cd4;
    }

    public /* synthetic */ C1118ig(DD dd, DD dd2, DD dd3, DD dd4, DD dd5, CD cd, int i) {
        this.f13958a = i;
        this.f13959b = dd;
        this.f13960c = dd2;
        this.f13962e = dd3;
        this.f = dd4;
        this.f13963g = dd5;
        this.f13961d = cd;
    }

    public C1118ig(ED ed, CD cd, ED ed2, Bn bn, CD cd2, C1745wf c1745wf) {
        this.f13958a = 9;
        this.f13959b = ed;
        this.f13961d = cd;
        this.f13960c = ed2;
        this.f = bn;
        this.f13962e = cd2;
        this.f13963g = c1745wf;
    }

    public C1118ig(ED ed, CD cd, ED ed2, Bn bn, CD cd2, CD cd3) {
        this.f13958a = 10;
        this.f13959b = ed;
        this.f13961d = cd;
        this.f13960c = ed2;
        this.f13963g = bn;
        this.f13962e = cd2;
        this.f = cd3;
    }

    public /* synthetic */ C1118ig(ED ed, DD dd, DD dd2, DD dd3, CD cd, CD cd2, int i) {
        this.f13958a = i;
        this.f13959b = ed;
        this.f13960c = dd;
        this.f = dd2;
        this.f13963g = dd3;
        this.f13961d = cd;
        this.f13962e = cd2;
    }
}
