package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.Ag, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555Ag implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7694a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f7695b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f7696c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f7697d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f7698e;

    public C0555Ag(C1565sf c1565sf, CD cd, ID id, CD cd2) {
        this.f7694a = 10;
        this.f7698e = c1565sf;
        this.f7695b = cd;
        this.f7697d = id;
        this.f7696c = cd2;
    }

    public C1395oo a() {
        return new C1395oo((Gr) ((CD) this.f7695b).d(), (Qw) ((CD) this.f7696c).d(), (InterfaceC1349nn) this.f7698e.d(), (InterfaceC1573sn) ((DD) this.f7697d).d(), 0);
    }

    public Op b() {
        Context a5 = ((C1565sf) this.f7698e).a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Op(a5, c0606Hd, ((KD) this.f7697d).d(), (Mr) ((CD) this.f7695b).d(), (C1482ql) ((CD) this.f7696c).d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f7694a) {
            case 0:
                Gr gr = (Gr) ((CD) this.f7695b).d();
                Qw qw = (Qw) ((CD) this.f7696c).d();
                C1026gd c1026gd = (C1026gd) this.f7698e;
                return new C1395oo(gr, qw, ((C1701vg) this.f7697d).b(), new C1888zn((Context) c1026gd.f13591b.d(), (C0578Df) c1026gd.f13592c.f8474a, 0), 0);
            case 1:
                Gr gr2 = (Gr) ((CD) this.f7695b).d();
                Qw qw2 = (Qw) ((CD) this.f7696c).d();
                C1026gd c1026gd2 = (C1026gd) this.f7698e;
                return new C1395oo(gr2, qw2, ((C1701vg) this.f7697d).b(), new Dn((Context) c1026gd2.f13591b.d(), (C0594Ff) c1026gd2.f13592c.f8474a), 0);
            case 2:
                G7 a5 = ((a3.r) this.f7696c).a();
                InterfaceC1059h9 interfaceC1059h9 = (InterfaceC1059h9) ((C0686Sg) this.f7698e).f11573b.f14827l;
                AbstractC1400ot.D(interfaceC1059h9);
                return new C0679Rg(a5, interfaceC1059h9, (RunnableC1362o) ((C0686Sg) this.f7697d).f11573b.f14828m, (Executor) ((CD) this.f7695b).d());
            case 3:
                return new C1522rh((C2308a) ((CD) this.f7695b).d(), (C1567sh) ((CD) this.f7696c).d(), ((Hh) this.f7698e).a(), (String) ((CD) this.f7697d).d());
            case 4:
                Uh uh = (Uh) ((CD) this.f7695b).d();
                Lq a6 = ((C1119ih) this.f7698e).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((CD) this.f7696c).d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1837yh(uh, a6, scheduledExecutorService, c0606Hd, (String) ((C1119ih) this.f7697d).f13965b.f13188n);
            case 5:
                Gr gr3 = (Gr) ((CD) this.f7695b).d();
                Qw qw3 = (Qw) ((CD) this.f7696c).d();
                C1026gd c1026gd3 = (C1026gd) this.f7698e;
                return new C1395oo(gr3, qw3, ((C1701vg) this.f7697d).b(), new C1888zn((Context) c1026gd3.f13591b.d(), (C0622Jf) c1026gd3.f13592c.f8474a, 1), 0);
            case 6:
                Wk wk = (Wk) ((CD) this.f7695b).d();
                Kk kk = (Kk) ((C1614tj) this.f7698e).f15711b.f12041m;
                AbstractC1400ot.D(kk);
                C1746wg c1746wg = (C1746wg) ((CD) this.f7696c).d();
                C1524rj c1524rj = (C1524rj) ((C1032gj) this.f7697d).f13638b.d();
                AbstractC1400ot.D(c1524rj);
                return new Wj(wk, kk, c1746wg, c1524rj);
            case 7:
                return new Ck(((C1565sf) this.f7695b).a(), ((C0650Nf) this.f7696c).a(), ((Qj) this.f7698e).a(), (Cj) ((C1168jm) this.f7697d).d());
            case 8:
                return new Dk((String) ((C1119ih) this.f7696c).f13965b.f13188n, (Cj) ((C1168jm) this.f7698e).d(), ((C0650Nf) this.f7697d).a(), (C1482ql) ((CD) this.f7695b).d());
            case 9:
                Gr gr4 = (Gr) ((CD) this.f7695b).d();
                Qw qw4 = (Qw) ((CD) this.f7696c).d();
                C1026gd c1026gd4 = (C1026gd) this.f7698e;
                return new C1395oo(gr4, qw4, ((C1701vg) this.f7697d).b(), new C1888zn((Context) c1026gd4.f13591b.d(), (C0636Lf) c1026gd4.f13592c.f8474a, 2), 0);
            case 10:
                return new BinderC0857cn(((C1565sf) this.f7698e).a(), (Xm) ((CD) this.f7695b).d(), (U2.m) this.f7697d.d(), (C1482ql) ((CD) this.f7696c).d());
            case 11:
                return a();
            case 12:
                return new C1395oo((Gr) ((CD) this.f7695b).d(), (Qw) ((CD) this.f7696c).d(), (N7) ((C1574so) this.f7698e).f15601b.f15382l, new Mt(29, (C0622Jf) ((C1700vf) this.f7697d).f16017b.f8474a), 1);
            case 13:
                Qo a7 = ((C1796xl) this.f7698e).a();
                C1396op c1396op = (C1396op) ((CD) this.f7695b).d();
                List list = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list.contains("10")) {
                    return new C1890zp(c1396op, ((Integer) Q2.r.f5053d.f5056c.a(F7.Kb)).intValue(), scheduledExecutorService2);
                }
                return new C1890zp(a7, ((Integer) Q2.r.f5053d.f5056c.a(F7.Kb)).intValue(), scheduledExecutorService2);
            case 14:
                Qo a8 = ((C1659uj) this.f7698e).a();
                C1396op c1396op2 = (C1396op) ((CD) this.f7695b).d();
                List list2 = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list2.contains("54")) {
                    return new C1890zp(c1396op2, ((Integer) Q2.r.f5053d.f5056c.a(F7.Tb)).intValue(), scheduledExecutorService3);
                }
                return new C1890zp(a8, ((Integer) Q2.r.f5053d.f5056c.a(F7.Tb)).intValue(), scheduledExecutorService3);
            case 15:
                C0770ap b3 = ((C1520rf) this.f7698e).b();
                C1396op c1396op3 = (C1396op) ((CD) this.f7695b).d();
                List list3 = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list3.contains("13")) {
                    return new C1890zp(c1396op3, ((Integer) Q2.r.f5053d.f5056c.a(F7.Sb)).intValue(), scheduledExecutorService4);
                }
                return new C1890zp(b3, ((Integer) Q2.r.f5053d.f5056c.a(F7.Sb)).intValue(), scheduledExecutorService4);
            case 16:
                Qo b5 = ((C1655uf) this.f7698e).b();
                C1396op c1396op4 = (C1396op) ((CD) this.f7695b).d();
                List list4 = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list4.contains("60")) {
                    return new C1890zp(c1396op4, ((Integer) Q2.r.f5053d.f5056c.a(F7.sc)).intValue(), scheduledExecutorService5);
                }
                return new C1890zp(b5, ((Integer) Q2.r.f5053d.f5056c.a(F7.sc)).intValue(), scheduledExecutorService5);
            case 17:
                Oo c5 = ((C1755wp) this.f7698e).c();
                C1396op c1396op5 = (C1396op) ((CD) this.f7695b).d();
                List list5 = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list5.contains("35")) {
                    return new C1890zp(c1396op5, ((Integer) Q2.r.f5053d.f5056c.a(F7.Hb)).intValue(), scheduledExecutorService6);
                }
                return new C1890zp(c5, ((Integer) Q2.r.f5053d.f5056c.a(F7.Hb)).intValue(), scheduledExecutorService6);
            case 18:
                C0770ap e3 = ((C1520rf) this.f7698e).e();
                C1396op c1396op6 = (C1396op) ((CD) this.f7695b).d();
                List list6 = (List) ((CD) this.f7696c).d();
                ScheduledExecutorService scheduledExecutorService7 = (ScheduledExecutorService) ((CD) this.f7697d).d();
                if (list6.contains("39")) {
                    return new C1890zp(c1396op6, ((Integer) Q2.r.f5053d.f5056c.a(F7.Eb)).intValue(), scheduledExecutorService7);
                }
                return new C1890zp(e3, ((Integer) Q2.r.f5053d.f5056c.a(F7.Eb)).intValue(), scheduledExecutorService7);
            case 19:
                return b();
            case 20:
                return new C1489qs((C1713vs) ((CD) this.f7695b).d(), new U4(29, (C1482ql) ((C1796xl) this.f7698e).f16324b.d()), ((C1565sf) this.f7697d).a(), (C2308a) ((CD) this.f7696c).d());
            default:
                return new C1713vs(((C1565sf) this.f7698e).a(), ((C1745wf) this.f7697d).a(), (ScheduledExecutorService) ((CD) this.f7695b).d(), (C2308a) ((CD) this.f7696c).d());
        }
    }

    public /* synthetic */ C0555Ag(C1565sf c1565sf, DD dd, CD cd, CD cd2, int i) {
        this.f7694a = i;
        this.f7698e = c1565sf;
        this.f7697d = dd;
        this.f7695b = cd;
        this.f7696c = cd2;
    }

    public C0555Ag(CD cd, C1796xl c1796xl, C1565sf c1565sf, CD cd2) {
        this.f7694a = 20;
        this.f7695b = cd;
        this.f7698e = c1796xl;
        this.f7697d = c1565sf;
        this.f7696c = cd2;
    }

    public /* synthetic */ C0555Ag(CD cd, DD dd, CD cd2, DD dd2, int i) {
        this.f7694a = i;
        this.f7695b = cd;
        this.f7698e = dd;
        this.f7696c = cd2;
        this.f7697d = dd2;
    }

    public /* synthetic */ C0555Ag(DD dd, CD cd, CD cd2, CD cd3, int i) {
        this.f7694a = i;
        this.f7698e = dd;
        this.f7695b = cd;
        this.f7696c = cd2;
        this.f7697d = cd3;
    }

    public /* synthetic */ C0555Ag(DD dd, DD dd2, DD dd3, CD cd, int i) {
        this.f7694a = i;
        this.f7696c = dd;
        this.f7698e = dd2;
        this.f7697d = dd3;
        this.f7695b = cd;
    }

    public /* synthetic */ C0555Ag(ID id, ID id2, ID id3, ID id4, int i) {
        this.f7694a = i;
        this.f7695b = id;
        this.f7696c = id2;
        this.f7698e = id3;
        this.f7697d = id4;
    }
}
