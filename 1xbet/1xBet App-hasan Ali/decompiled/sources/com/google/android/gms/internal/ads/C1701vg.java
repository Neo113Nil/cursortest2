package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.vg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701vg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16018a;

    /* renamed from: b, reason: collision with root package name */
    public final CD f16019b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f16020c;

    public /* synthetic */ C1701vg(CD cd, CD cd2, int i) {
        this.f16018a = i;
        this.f16019b = cd;
        this.f16020c = cd2;
    }

    public C1344ni a() {
        return new C1344ni((ScheduledExecutorService) this.f16019b.d(), (C2308a) this.f16020c.d());
    }

    public C1126io b() {
        return new C1126io((C1664uo) this.f16019b.d(), (C0900dl) this.f16020c.d());
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        C0606Hd c0606Hd;
        switch (this.f16018a) {
            case 0:
                J5 j5 = (J5) this.f16019b.d();
                C0573Da c0573Da = (C0573Da) this.f16020c.d();
                A7 a7 = F7.t5;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    c0606Hd = AbstractC0613Id.f9541c;
                } else {
                    c0606Hd = ((Boolean) rVar.f5056c.a(F7.s5)).booleanValue() ? AbstractC0613Id.f9539a : AbstractC0613Id.f;
                }
                AbstractC1400ot.D(c0606Hd);
                return new C1477qg(j5.f9861c, c0573Da, c0606Hd);
            case 1:
                C1656ug c1656ug = (C1656ug) this.f16019b.d();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                Set singleton = ((JSONObject) this.f16020c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new Si(c1656ug, c0606Hd2));
                AbstractC1400ot.D(singleton);
                return singleton;
            case 2:
                C1656ug c1656ug2 = (C1656ug) this.f16019b.d();
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                Set singleton2 = ((JSONObject) this.f16020c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new Si(c1656ug2, c0606Hd3));
                AbstractC1400ot.D(singleton2);
                return singleton2;
            case 3:
                C1656ug c1656ug3 = (C1656ug) this.f16019b.d();
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                Set singleton3 = ((JSONObject) this.f16020c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new Si(c1656ug3, c0606Hd4));
                AbstractC1400ot.D(singleton3);
                return singleton3;
            case 4:
                C1656ug c1656ug4 = (C1656ug) this.f16019b.d();
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                Set singleton4 = ((JSONObject) this.f16020c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new Si(c1656ug4, c0606Hd5));
                AbstractC1400ot.D(singleton4);
                return singleton4;
            case 5:
                return a();
            case 6:
                return new C1343nh((C2308a) this.f16019b.d(), (C1878zd) this.f16020c.d());
            case 7:
                return new P2.a((Context) this.f16019b.d(), (InterfaceC0758ad) this.f16020c.d());
            case 8:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 9:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 10:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 11:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 12:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 13:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 14:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 15:
                return new Si((C1523ri) this.f16019b.d(), (Executor) this.f16020c.d());
            case 16:
                return new C1077hj((C1076hi) this.f16019b.d(), (Pi) this.f16020c.d());
            case 17:
                return new C1706vl((String) this.f16019b.d(), (C1616tl) this.f16020c.d());
            case 18:
                return new Ql((Kl) this.f16019b.d(), (C0855cl) this.f16020c.d());
            case 19:
                Gr gr = (Gr) this.f16019b.d();
                P2.o.f4767B.f4773e.getClass();
                CookieManager f = Q1.j.f();
                Dr dr = Dr.f8381C;
                S4 s42 = new S4(4, f);
                C0606Hd c0606Hd6 = gr.f9279a;
                Mw mw = Gr.f9278d;
                List list = Collections.EMPTY_LIST;
                E3.a d5 = c0606Hd6.d(s42);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C1324n6 c1324n6 = new C1324n6(gr, dr, null, mw, list, AbstractC1400ot.l0(d5, 1L, TimeUnit.SECONDS, gr.f9280b));
                return new C1324n6((Gr) c1324n6.f14583p, c1324n6.f14580m, (String) c1324n6.f14578k, (E3.a) c1324n6.f14579l, (List) c1324n6.f14581n, AbstractC1400ot.X((E3.a) c1324n6.f14582o, Exception.class, new C0727Yf(15), ((Gr) c1324n6.f14583p).f9279a)).a();
            case 20:
                return b();
            case C1639u7.zzm /* 21 */:
                E3.a aVar = (E3.a) this.f16019b.d();
                C0606Hd c0606Hd7 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd7);
                return new Vo(aVar, c0606Hd7, (ScheduledExecutorService) this.f16020c.d(), 0);
            case 22:
                C0606Hd c0606Hd8 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd8);
                C1441pp c1441pp = new C1441pp(c0606Hd8, 2);
                C2308a c2308a = (C2308a) this.f16019b.d();
                AbstractC1400ot.D(c0606Hd8);
                return new C1396op(c1441pp, ((Long) Z7.f.s()).longValue(), c2308a, c0606Hd8, (C1482ql) this.f16020c.d());
            case 23:
                return new Kq((C2308a) this.f16019b.d(), (C1482ql) this.f16020c.d());
            case 24:
                return new C1890zp((C1396op) this.f16019b.d(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Rb)).intValue(), (ScheduledExecutorService) this.f16020c.d());
            case 25:
                return new C1890zp((C1396op) this.f16019b.d(), ((Integer) Q2.r.f5053d.f5056c.a(F7.Fb)).intValue(), (ScheduledExecutorService) this.f16020c.d());
            default:
                return new Cp((String) this.f16019b.d(), ((Integer) this.f16020c.d()).intValue());
        }
    }
}
