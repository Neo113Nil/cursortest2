package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.xl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1796xl implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16323a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f16324b;

    public /* synthetic */ C1796xl(CD cd, int i) {
        this.f16323a = i;
        this.f16324b = cd;
    }

    public Qo a() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Qo(1, c0606Hd, (C0568Cd) this.f16324b.d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Object obj;
        int i = 4;
        CD cd = this.f16324b;
        switch (this.f16323a) {
            case 0:
                C1841yl c1841yl = (C1841yl) cd.d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                Set g5 = Oi.g(c1841yl, c0606Hd);
                AbstractC1400ot.D(g5);
                return g5;
            case 1:
                C1841yl c1841yl2 = (C1841yl) cd.d();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                Set g6 = Oi.g(c1841yl2, c0606Hd2);
                AbstractC1400ot.D(g6);
                return g6;
            case 2:
                Ol ol = (Ol) cd.d();
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new Si(ol, c0606Hd3);
            case 3:
                Ol ol2 = (Ol) cd.d();
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new Si(ol2, c0606Hd4);
            case 4:
                Ol ol3 = (Ol) cd.d();
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                return new Si(ol3, c0606Hd5);
            case 5:
                return new Si((C0945em) cd.d(), AbstractC0613Id.f9544g);
            case 6:
                return new Si((C0945em) cd.d(), AbstractC0613Id.f9544g);
            case 7:
                Context context = (Context) cd.d();
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                return new C1348nm(context, c0606Hd6, 0);
            case 8:
                Pm pm = (Pm) cd.d();
                C0606Hd c0606Hd7 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd7);
                return new Si(pm, c0606Hd7);
            case 9:
                Pm pm2 = (Pm) cd.d();
                C0606Hd c0606Hd8 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd8);
                return new Si(pm2, c0606Hd8);
            case 10:
                return new C1664uo((C0900dl) cd.d());
            case 11:
                return new Eo((C1482ql) cd.d());
            case 12:
                return a();
            case 13:
                C0606Hd c0606Hd9 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd9);
                C1441pp c1441pp = new C1441pp(c0606Hd9, 0);
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cd.d();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8785X3)).booleanValue()) {
                    C1890zp c1890zp = new C1890zp(c1441pp, ((Integer) r3.f5056c.a(F7.f8790Y3)).intValue(), scheduledExecutorService);
                    int i5 = AbstractC1177jv.f14189m;
                    obj = new Jv(c1890zp);
                } else {
                    int i6 = AbstractC1177jv.f14189m;
                    obj = Dv.f8414t;
                }
                AbstractC1400ot.D(obj);
                return obj;
            case 14:
                C0606Hd c0606Hd10 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd10);
                return new C1890zp(new C1441pp(c0606Hd10, 1), ((Integer) Q2.r.f5053d.f5056c.a(F7.Ob)).intValue(), (ScheduledExecutorService) cd.d());
            case 15:
                C0606Hd c0606Hd11 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd11);
                return new Qo(i, c0606Hd11, (Ul) cd.d());
            case 16:
                return new Mo(i, (Kq) cd.d());
            case 17:
                return new C0904dq((C1085hr) cd.d());
            case 18:
                return new Bq((C1085hr) cd.d());
            case 19:
                return new Xq((Q4) cd.d());
            case 20:
                return new Si((C1040gr) cd.d(), AbstractC0613Id.f9544g);
            case C1639u7.zzm /* 21 */:
                ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) cd.d()));
                AbstractC1400ot.D(unconfigurableScheduledExecutorService);
                return unconfigurableScheduledExecutorService;
            case 22:
                return new Mr((Nr) cd.d());
            case 23:
                return new Mr((Nr) cd.d());
            case 24:
                return new C0906ds((Xm) cd.d());
            case 25:
                return new BinderC1309ms((C1489qs) cd.d());
            default:
                return new U4(29, (C1482ql) cd.d());
        }
    }
}
