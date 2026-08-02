package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903dp implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13171a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f13172b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f13173c;

    public /* synthetic */ C0903dp(ID id, ID id2, int i) {
        this.f13171a = i;
        this.f13172b = id;
        this.f13173c = id2;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Object obj;
        int i = 0;
        int i5 = 1;
        int i6 = 4;
        int i7 = 3;
        ID id = this.f13173c;
        ID id2 = this.f13172b;
        switch (this.f13171a) {
            case 0:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new Vo(c0606Hd, ((Hh) id2).a(), ((C1790xf) id).d(), i5);
            case 1:
                C1478qh c1478qh = (C1478qh) id2;
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                Wq a5 = c1478qh.f15154c.a();
                return new C1890zp(new So(c0606Hd2, a5, i), ((Integer) Q2.r.f5053d.f5056c.a(F7.Vb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 2:
                return new C1890zp(((C1124im) id2).a(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Ub)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 3:
                return new C1890zp(((C1302ml) id2).a(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Wb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 4:
                C1520rf c1520rf = (C1520rf) id2;
                c1520rf.getClass();
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new C1890zp(new C0770ap(c0606Hd3, c1520rf.f15326b.a(), i), ((Integer) Q2.r.f5053d.f5056c.a(F7.ec)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 5:
                return new C1890zp(new Mo(i7, (C1217kq) ((C1700vf) id2).f16017b.f8474a), ((Integer) Q2.r.f5053d.f5056c.a(F7.Qb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 6:
                return new C1890zp(((C0936ed) id2).c(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Xb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 7:
                Context a6 = ((C1520rf) id2).f15326b.a();
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new C1890zp(new C0770ap(a6, c0606Hd4, i7), ((Integer) Q2.r.f5053d.f5056c.a(F7.Pb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 8:
                C1520rf c1520rf2 = (C1520rf) id2;
                c1520rf2.getClass();
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                C0770ap c0770ap = new C0770ap(c0606Hd5, c1520rf2.f15326b.a(), i6);
                Context a7 = ((C1565sf) id).a();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Va)).booleanValue()) {
                    T2.L l5 = P2.o.f4767B.f4771c;
                    if (T2.L.c(a7)) {
                        int i8 = AbstractC1177jv.f14189m;
                        obj = new Jv(c0770ap);
                        AbstractC1400ot.D(obj);
                        return obj;
                    }
                }
                int i9 = AbstractC1177jv.f14189m;
                obj = Dv.f8414t;
                AbstractC1400ot.D(obj);
                return obj;
            case 9:
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                return new C1890zp(new So(c0606Hd6, ((C0651Ng) id2).f10801b.a(), i5), ((Integer) Q2.r.f5053d.f5056c.a(F7.bc)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 10:
                C0606Hd c0606Hd7 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd7);
                return new C1890zp(new Qo(i6, c0606Hd7, (Ul) ((C1796xl) id2).f16324b.d()), ((Integer) Q2.r.f5053d.f5056c.a(F7.Nb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 11:
                return new C1890zp(new Mo(i6, (Kq) ((C1796xl) id2).f16324b.d()), ((Integer) Q2.r.f5053d.f5056c.a(F7.cc)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 12:
                C0903dp c0903dp = (C0903dp) id2;
                C0606Hd c0606Hd8 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd8);
                return new C1890zp(new Qo(c0606Hd8, ((C1565sf) c0903dp.f13172b).a(), (Set) c0903dp.f13173c.d()), ((Integer) Q2.r.f5053d.f5056c.a(F7.Lb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 13:
                return new C1890zp(((C1755wp) id2).b(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Jb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 14:
                C1655uf c1655uf = (C1655uf) id2;
                C1204kd c1204kd = (C1204kd) c1655uf.f15876c.d();
                C0606Hd c0606Hd9 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd9);
                return new C1890zp(new Vo(c1204kd, c0606Hd9, c1655uf.f15875b.a(), i7), ((Integer) Q2.r.f5053d.f5056c.a(F7.Ib)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 15:
                C0606Hd c0606Hd10 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd10);
                return new C1890zp(new C0770ap(c0606Hd10, ((C1520rf) id2).f15326b.a(), 5), ((Integer) Q2.r.f5053d.f5056c.a(F7.Gb)).intValue(), (ScheduledExecutorService) ((CD) id).d());
            case 16:
                C0606Hd c0606Hd11 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd11);
                return new Qo(c0606Hd11, ((C1565sf) id2).a(), (Set) id.d());
            case 17:
                return new C1040gr(((C1565sf) id2).a(), ((C1790xf) id).d());
            default:
                C0606Hd c0606Hd12 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd12);
                return new Gr(c0606Hd12, (ScheduledExecutorService) ((CD) id2).d(), new Fr(((Lh) id).f10455b.d()));
        }
    }
}
