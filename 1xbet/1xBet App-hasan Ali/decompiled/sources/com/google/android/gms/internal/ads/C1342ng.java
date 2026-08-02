package com.google.android.gms.internal.ads;

import Q2.C0387u0;
import Q2.InterfaceC0347a;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1342ng implements Mh, InterfaceC0808bi, Vh, InterfaceC0347a, Th, Ri {

    /* renamed from: k, reason: collision with root package name */
    public final Context f14665k;

    /* renamed from: l, reason: collision with root package name */
    public final Qw f14666l;

    /* renamed from: m, reason: collision with root package name */
    public final Executor f14667m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f14668n;

    /* renamed from: o, reason: collision with root package name */
    public final Sq f14669o;

    /* renamed from: p, reason: collision with root package name */
    public final Lq f14670p;

    /* renamed from: q, reason: collision with root package name */
    public final C0951es f14671q;

    /* renamed from: r, reason: collision with root package name */
    public final Zq f14672r;

    /* renamed from: s, reason: collision with root package name */
    public final Q4 f14673s;

    /* renamed from: t, reason: collision with root package name */
    public final T7 f14674t;

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f14675u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f14676v;

    /* renamed from: w, reason: collision with root package name */
    public final C0905dr f14677w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14678x;

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f14679y = new AtomicBoolean();

    public C1342ng(Context context, Qw qw, Executor executor, ScheduledExecutorService scheduledExecutorService, Sq sq, Lq lq, C0951es c0951es, Zq zq, View view, InterfaceC0677Re interfaceC0677Re, Q4 q42, T7 t7, C0905dr c0905dr) {
        this.f14665k = context;
        this.f14666l = qw;
        this.f14667m = executor;
        this.f14668n = scheduledExecutorService;
        this.f14669o = sq;
        this.f14670p = lq;
        this.f14671q = c0951es;
        this.f14672r = zq;
        this.f14673s = q42;
        this.f14675u = new WeakReference(view);
        this.f14676v = new WeakReference(interfaceC0677Re);
        this.f14674t = t7;
        this.f14677w = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
        Tq tq;
        Lq lq = this.f14670p;
        List list = lq.f10502h;
        C0951es c0951es = this.f14671q;
        c0951es.getClass();
        ArrayList arrayList = new ArrayList();
        c0951es.f13370h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC1652uc.f15866k;
            String num = Integer.toString(binderC1652uc.f15867l);
            boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8920w3)).booleanValue();
            AbstractC1401ou abstractC1401ou = C1176ju.f14188k;
            if (booleanValue) {
                Uq uq = c0951es.f13369g;
                if (uq != null && (tq = uq.f11827a) != null) {
                    abstractC1401ou = new C1535ru(tq);
                }
            } else {
                Tq tq2 = c0951es.f;
                if (tq2 != null) {
                    abstractC1401ou = new C1535ru(tq2);
                }
            }
            String str4 = (String) abstractC1401ou.a(new C1364o1(17)).b();
            String str5 = (String) abstractC1401ou.a(new C1364o1(18)).b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC1668us.M(C0951es.c(C0951es.c(C0951es.c(C0951es.c(C0951es.c(C0951es.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", num), "@gw_sdkver@", c0951es.f13365b), c0951es.f13368e, lq.f10485W, lq.f10532w0));
            }
        } catch (RemoteException e3) {
            U2.j.g("Unable to determine award type and amount.", e3);
        }
        this.f14672r.a(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
        Lq lq = this.f14670p;
        this.f14672r.a(this.f14671q.a(this.f14669o, lq, lq.i));
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
        Lq lq = this.f14670p;
        this.f14672r.a(this.f14671q.a(this.f14669o, lq, lq.f10500g));
    }

    public final List d() {
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.Wa)).booleanValue();
        Lq lq = this.f14670p;
        if (booleanValue) {
            T2.L l5 = P2.o.f4767B.f4771c;
            Context context = this.f14665k;
            if (T2.L.c(context)) {
                Object systemService = context.getSystemService("display");
                Integer valueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (valueOf != null) {
                    int min = Math.min(valueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = lq.f10495d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return lq.f10495d;
    }

    public final void j() {
        int i;
        Lq lq = this.f14670p;
        List list = lq.f10495d;
        if (list == null || list.isEmpty()) {
            return;
        }
        A7 a7 = F7.f8915v3;
        Q2.r rVar = Q2.r.f5053d;
        String str = null;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            str = this.f14673s.f11167b.e(this.f14665k, (View) this.f14675u.get(), null);
        }
        String str2 = str;
        A7 a72 = F7.f8895s0;
        D7 d7 = rVar.f5056c;
        if ((((Boolean) d7.a(a72)).booleanValue() && ((Nq) this.f14669o.f11596b.f13762m).f10828h) || !((Boolean) AbstractC1013g8.f13569h.s()).booleanValue()) {
            this.f14672r.a(this.f14671q.b(this.f14669o, this.f14670p, false, str2, null, d()));
            return;
        }
        if (((Boolean) AbstractC1013g8.f13568g.s()).booleanValue() && ((i = lq.f10491b) == 1 || i == 2 || i == 5)) {
        }
        Hw hw = (Hw) AbstractC1400ot.l0(Hw.r(Mw.f10750l), ((Long) d7.a(F7.f8772V0)).longValue(), TimeUnit.MILLISECONDS, this.f14668n);
        hw.a(new Kw(0, hw, new C1390oj(14, this, str2, false)), this.f14666l);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0808bi
    public final synchronized void j0() {
        C0905dr c0905dr;
        try {
            if (this.f14678x) {
                ArrayList arrayList = new ArrayList(d());
                arrayList.addAll(this.f14670p.f);
                this.f14672r.a(this.f14671q.b(this.f14669o, this.f14670p, true, null, null, arrayList));
            } else {
                Zq zq = this.f14672r;
                C0951es c0951es = this.f14671q;
                Sq sq = this.f14669o;
                Lq lq = this.f14670p;
                zq.a(c0951es.a(sq, lq, lq.f10511m));
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.A3)).booleanValue() && (c0905dr = this.f14677w) != null) {
                    List list = ((Lq) c0905dr.f13187m).f10511m;
                    String c5 = ((C0769ao) c0905dr.f13188n).c();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C0951es.c((String) it.next(), "@gw_adnetstatus@", c5));
                    }
                    long a5 = ((C0769ao) this.f14677w.f13188n).a();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(C0951es.c((String) obj, "@gw_ttr@", Long.toString(a5, 10)));
                    }
                    Zq zq2 = this.f14672r;
                    C0951es c0951es2 = this.f14671q;
                    C0905dr c0905dr2 = this.f14677w;
                    zq2.a(c0951es2.a((Sq) c0905dr2.f13186l, (Lq) c0905dr2.f13187m, arrayList3));
                }
                Zq zq3 = this.f14672r;
                C0951es c0951es3 = this.f14671q;
                Sq sq2 = this.f14669o;
                Lq lq2 = this.f14670p;
                zq3.a(c0951es3.a(sq2, lq2, lq2.f));
            }
            this.f14678x = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k(int i, int i5) {
        View view;
        if (i <= 0 || !((view = (View) this.f14675u.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            j();
        } else {
            this.f14668n.schedule(new RunnableC1297mg(this, i, i5, 0), i5, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.Th
    public final void q(C0387u0 c0387u0) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8907u1)).booleanValue()) {
            int i = c0387u0.f5058k;
            Lq lq = this.f14670p;
            List list = lq.f10515o;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C0951es.c((String) it.next(), "@gw_mpe@", "2." + i));
            }
            this.f14672r.a(this.f14671q.a(this.f14669o, lq, arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.Vh
    public final void t() {
        if (this.f14679y.compareAndSet(false, true)) {
            A7 a7 = F7.f8680E3;
            Q2.r rVar = Q2.r.f5053d;
            int intValue = ((Integer) rVar.f5056c.a(a7)).intValue();
            D7 d7 = rVar.f5056c;
            if (intValue > 0) {
                k(intValue, ((Integer) d7.a(F7.f8686F3)).intValue());
            } else if (!((Boolean) d7.a(F7.f8675D3)).booleanValue()) {
                j();
            } else {
                this.f14667m.execute(new RunnableC1252lg(this, 0));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.Ri
    public final void w() {
        Lq lq = this.f14670p;
        this.f14672r.a(this.f14671q.a(this.f14669o, lq, lq.f10528u0));
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8895s0)).booleanValue();
        Sq sq = this.f14669o;
        if ((booleanValue && ((Nq) sq.f11596b.f13762m).f10828h) || !((Boolean) AbstractC1013g8.f13566d.s()).booleanValue()) {
            Lq lq = this.f14670p;
            this.f14672r.b(true == P2.o.f4767B.f4774g.a(this.f14665k) ? 2 : 1, this.f14671q.a(sq, lq, lq.f10493c));
        } else {
            T7 t7 = this.f14674t;
            t7.getClass();
            C0822bw U4 = AbstractC1400ot.U(Hw.r((Hw) AbstractC1400ot.l0(Hw.r(Mw.f10750l), ((Long) AbstractC1013g8.f13565c.s()).longValue(), TimeUnit.MILLISECONDS, t7.f11630c)), Throwable.class, new C1364o1(4), AbstractC0613Id.f9544g);
            U4.a(new Kw(0, U4, new C1529ro(13, this)), this.f14666l);
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
    }
}
