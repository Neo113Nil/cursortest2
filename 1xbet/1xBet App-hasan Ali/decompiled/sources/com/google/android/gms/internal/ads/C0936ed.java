package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936ed implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13313a;

    /* renamed from: b, reason: collision with root package name */
    public final ID f13314b;

    /* renamed from: c, reason: collision with root package name */
    public final ID f13315c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f13316d;

    public /* synthetic */ C0936ed(ID id, ID id2, ID id3, int i) {
        this.f13313a = i;
        this.f13314b = id;
        this.f13315c = id2;
        this.f13316d = id3;
    }

    private final Object e() {
        Set set;
        String str = ((C1428pc) ((Zp) this.f13314b).f12528b.f834m).f15002r;
        AbstractC1400ot.D(str);
        Context a5 = ((C1565sf) this.f13315c).a();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        Map d5 = ((FD) this.f13316d).d();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8714K4)).booleanValue()) {
            C1773x6 c1773x6 = new C1773x6(new D3.l(a5, 5));
            synchronized (c1773x6) {
                if (c1773x6.f16228c) {
                    try {
                        C1594t7 c1594t7 = c1773x6.f16227b;
                        c1594t7.e();
                        C1639u7.D((C1639u7) c1594t7.f10141l, str);
                    } catch (NullPointerException e3) {
                        P2.o.f4767B.f4774g.i("AdMobClearcutLogger.modify", e3);
                    }
                }
            }
            set = Collections.singleton(new Si(new C1123il(c1773x6, d5), c0606Hd));
        } else {
            set = Collections.EMPTY_SET;
        }
        AbstractC1400ot.D(set);
        return set;
    }

    public C0375o a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((CD) this.f13314b).d();
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        C0606Hd c0606Hd2 = AbstractC0613Id.f9540b;
        AbstractC1400ot.D(c0606Hd2);
        Context a5 = ((C1520rf) this.f13315c).f15326b.a();
        AbstractC1400ot.D(c0606Hd);
        return new C0375o(scheduledExecutorService, c0606Hd, c0606Hd2, new C1348nm(a5, c0606Hd, 1), CD.a(new JD((a3.y) this.f13316d)), 9);
    }

    public Oo b() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo(c0606Hd, (Object) ((C1565sf) this.f13314b).a(), (Object) ((Hh) this.f13315c).a(), ((Mt) ((C0650Nf) this.f13316d).f10799b).f10741l, 0);
    }

    public Oo c() {
        C0606Hd c0606Hd = AbstractC0613Id.f9539a;
        AbstractC1400ot.D(c0606Hd);
        return new Oo(c0606Hd, ((CD) this.f13314b).d(), (Object) ((Hh) this.f13315c).a(), this.f13316d.d(), 3);
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        String bigInteger;
        switch (this.f13313a) {
            case 0:
                T2.I i = (T2.I) ((ED) this.f13315c).f8474a;
                return new C0892dd(i);
            case 1:
                U2.a a5 = ((C1745wf) this.f13314b).a();
                JSONObject jSONObject = (JSONObject) ((CD) this.f13315c).d();
                String str = (String) ((DD) this.f13316d).d();
                boolean equals = "native".equals(str);
                T2.L l5 = P2.o.f4767B.f4771c;
                return new J5(UUID.randomUUID().toString(), a5, str, jSONObject, equals);
            case 2:
                return new C0644Mg((InterfaceC0677Re) ((C0616Ig) this.f13314b).f9589b.f17997o, (C1482ql) ((CD) this.f13315c).d(), ((C1119ih) this.f13316d).a());
            case 3:
                return ((Hh) this.f13314b).a().a() != null ? ((a3.y) this.f13315c).c() : ((C1212kl) this.f13316d).a();
            case 4:
                return true == ((C0651Ng) this.f13314b).a().booleanValue() ? ((C0595Fg) this.f13315c).b() : ((C0555Ag) this.f13316d).a();
            case 5:
                return new C0707Vg(((C1119ih) this.f13314b).a(), (Uh) ((CD) this.f13315c).d(), (C0986fi) ((CD) this.f13316d).d());
            case 6:
                C2308a c2308a = (C2308a) ((CD) this.f13314b).d();
                C0584Ed d5 = ((C1790xf) this.f13315c).d();
                String str2 = ((Hh) this.f13316d).a().f;
                C1390oj c1390oj = d5.f8515c;
                synchronized (c1390oj) {
                    bigInteger = ((BigInteger) c1390oj.f14827l).toString();
                    c1390oj.f14827l = ((BigInteger) c1390oj.f14827l).add(BigInteger.ONE);
                    c1390oj.f14828m = bigInteger;
                }
                return new C1878zd(c2308a, d5, bigInteger, str2);
            case 7:
                return new C1792xh((Context) ((CD) this.f13314b).d(), ((C1745wf) this.f13315c).a(), ((Hh) this.f13316d).a(), 0);
            case 8:
                Context context = (Context) ((CD) this.f13314b).d();
                U2.a a6 = ((C1745wf) this.f13315c).a();
                Lq a7 = ((C1119ih) this.f13316d).a();
                C0731Zc c0731Zc = a7.f10465A;
                if (c0731Zc == null) {
                    return null;
                }
                Pq pq = a7.f10523s;
                return new C0724Yc(context, a6, c0731Zc, pq != null ? pq.f11127b : null);
            case 9:
                Rh rh = new Rh(((Lh) this.f13314b).f10455b.d());
                Set d6 = ((KD) this.f13315c).d();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new Sh(rh, d6, c0606Hd, (ScheduledExecutorService) ((CD) this.f13316d).d());
            case 10:
                return new Ti((Context) ((CD) this.f13314b).d(), ((KD) this.f13315c).d(), ((C1119ih) this.f13316d).a());
            case 11:
                Gj a8 = ((C0650Nf) this.f13314b).a();
                Hj hj = (Hj) ((C1032gj) this.f13315c).f13638b.d();
                AbstractC1400ot.D(hj);
                Executor executor = (Executor) ((CD) this.f13316d).d();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new C0854ck(a8, hj, executor, c0606Hd2);
            case 12:
                int i5 = ((Hh) this.f13316d).a().f12107o.f17003l;
                if (i5 != 0) {
                    return i5 + (-1) != 0 ? ((C0555Ag) this.f13315c).a() : ((C0555Ag) this.f13314b).a();
                }
                throw null;
            case 13:
                return e();
            case 14:
                return new C1571sl((C1392ol) ((CD) this.f13314b).d(), ((KD) this.f13315c).d(), (C2308a) ((CD) this.f13316d).d());
            case 15:
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                U2.m mVar = (U2.m) this.f13314b.d();
                a3.B b3 = (a3.B) this.f13315c;
                return new C1616tl(c0606Hd3, mVar, new v3.e((Context) b3.f6471b.d(), (U2.a) ((C1745wf) b3.f6472c).d()), new H3.e(), ((C1565sf) this.f13316d).a());
            case 16:
                return new Ol((Ul) ((CD) this.f13314b).d(), ((Hh) this.f13315c).a(), (String) ((CD) this.f13316d).d());
            case 17:
                Context a9 = ((C1565sf) this.f13314b).a();
                WeakReference weakReference = (WeakReference) ((C1610tf) this.f13315c).f15696b.f14812d;
                AbstractC1400ot.D(weakReference);
                Vl vl = (Vl) ((CD) this.f13316d).d();
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new BinderC0767am(a9, weakReference, vl, c0606Hd4);
            case 18:
                return a();
            case 19:
                return b();
            case 20:
                return c();
            case C1639u7.zzm /* 21 */:
                C1520rf c1520rf = (C1520rf) this.f13314b;
                C0606Hd c0606Hd5 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd5);
                C0770ap c0770ap = new C0770ap(c0606Hd5, c1520rf.f15326b.a(), 2);
                C2308a c2308a2 = (C2308a) ((CD) this.f13315c).d();
                AbstractC1400ot.D(c0606Hd5);
                return new C1396op(c0770ap, ((Long) Z7.f12453c.s()).longValue(), c2308a2, c0606Hd5, (C1482ql) ((CD) this.f13316d).d());
            case 22:
                Context a10 = ((C1520rf) this.f13314b).f15326b.a();
                C0606Hd c0606Hd6 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd6);
                C0770ap c0770ap2 = new C0770ap(a10, c0606Hd6, 6);
                C2308a c2308a3 = (C2308a) ((CD) this.f13315c).d();
                AbstractC1400ot.D(c0606Hd6);
                return new C1396op(c0770ap2, 2147483647L, c2308a3, c0606Hd6, (C1482ql) ((CD) this.f13316d).d());
            case 23:
                C1520rf c1520rf2 = (C1520rf) this.f13314b;
                C0606Hd c0606Hd7 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd7);
                C0770ap c0770ap3 = new C0770ap(c0606Hd7, c1520rf2.f15326b.a(), 7);
                C2308a c2308a4 = (C2308a) ((CD) this.f13315c).d();
                AbstractC1400ot.D(c0606Hd7);
                return new C1396op(c0770ap3, ((Long) Z7.f12454d.s()).longValue(), c2308a4, c0606Hd7, (C1482ql) ((CD) this.f13316d).d());
            case 24:
                Qo a11 = ((C1796xl) this.f13314b).a();
                C2308a c2308a5 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd8 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd8);
                return new C1396op(a11, ((Long) Z7.f12451a.s()).longValue(), c2308a5, c0606Hd8, (C1482ql) ((CD) this.f13316d).d());
            case 25:
                Qo a12 = ((C1659uj) this.f13314b).a();
                C2308a c2308a6 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd9 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd9);
                return new C1396op(a12, 2147483647L, c2308a6, c0606Hd9, (C1482ql) ((CD) this.f13316d).d());
            case 26:
                C0770ap b5 = ((C1520rf) this.f13314b).b();
                C2308a c2308a7 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd10 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd10);
                return new C1396op(b5, ((Long) Z7.f12452b.s()).longValue(), c2308a7, c0606Hd10, (C1482ql) ((CD) this.f13316d).d());
            case 27:
                Qo b6 = ((C1655uf) this.f13314b).b();
                C2308a c2308a8 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd11 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd11);
                return new C1396op(b6, ((Long) Z7.f12455e.s()).longValue(), c2308a8, c0606Hd11, (C1482ql) ((CD) this.f13316d).d());
            case 28:
                Oo c5 = ((C1755wp) this.f13314b).c();
                C2308a c2308a9 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd12 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd12);
                return new C1396op(c5, ((Long) Z7.f12456g.s()).longValue(), c2308a9, c0606Hd12, (C1482ql) ((CD) this.f13316d).d());
            default:
                C0770ap e3 = ((C1520rf) this.f13314b).e();
                C2308a c2308a10 = (C2308a) ((CD) this.f13315c).d();
                C0606Hd c0606Hd13 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd13);
                return new C1396op(e3, ((Long) Z7.f12457h.s()).longValue(), c2308a10, c0606Hd13, (C1482ql) ((CD) this.f13316d).d());
        }
    }
}
