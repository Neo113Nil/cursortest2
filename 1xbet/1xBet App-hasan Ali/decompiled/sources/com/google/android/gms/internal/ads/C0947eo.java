package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import n.AbstractC2107A;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947eo implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final Gr f13339a;

    /* renamed from: b, reason: collision with root package name */
    public final Oh f13340b;

    /* renamed from: c, reason: collision with root package name */
    public final C0951es f13341c;

    /* renamed from: d, reason: collision with root package name */
    public final C1041gs f13342d;

    /* renamed from: e, reason: collision with root package name */
    public final Qw f13343e;
    public final ScheduledExecutorService f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0896dh f13344g;

    /* renamed from: h, reason: collision with root package name */
    public final C0769ao f13345h;
    public final C1528rn i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f13346j;

    /* renamed from: k, reason: collision with root package name */
    public final Mr f13347k;

    /* renamed from: l, reason: collision with root package name */
    public final G7 f13348l;

    /* renamed from: m, reason: collision with root package name */
    public final C1392ol f13349m;

    public C0947eo(Context context, Gr gr, C0769ao c0769ao, Oh oh, C0951es c0951es, C1041gs c1041gs, InterfaceC0896dh interfaceC0896dh, Qw qw, ScheduledExecutorService scheduledExecutorService, C1528rn c1528rn, Mr mr, G7 g7, C1392ol c1392ol) {
        this.f13346j = context;
        this.f13339a = gr;
        this.f13345h = c0769ao;
        this.f13340b = oh;
        this.f13341c = c0951es;
        this.f13342d = c1041gs;
        this.f13344g = interfaceC0896dh;
        this.f13343e = qw;
        this.f = scheduledExecutorService;
        this.i = c1528rn;
        this.f13347k = mr;
        this.f13348l = g7;
        this.f13349m = c1392ol;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) r1.f5056c.a(com.google.android.gms.internal.ads.F7.j5)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(Sq sq) {
        A7 a7 = F7.k5;
        Q2.r rVar = Q2.r.f5053d;
        String str = "No fill.";
        String str2 = true != ((Boolean) rVar.f5056c.a(a7)).booleanValue() ? "No ad config." : "No fill.";
        int i = ((Nq) sq.f11596b.f13762m).f;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                str = (i < 300 || i >= 400) ? AbstractC2107A.q("Received error HTTP response code: ", i) : "No location header to follow redirect or too many redirects.";
            }
            Dx dx = ((Nq) sq.f11596b.f13762m).f10829j;
            return dx == null ? dx.f8430l : str;
        }
        str = str2;
        Dx dx2 = ((Nq) sq.f11596b.f13762m).f10829j;
        if (dx2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E3.a k(Object obj) {
        int i;
        C1428pc c1428pc;
        Bundle bundle;
        Sq sq = (Sq) obj;
        A7 a7 = F7.f8805b2;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && (c1428pc = (C1428pc) sq.f11596b.f13764o) != null && (bundle = c1428pc.f15007w) != null) {
            this.f13349m.f14846c.putAll(bundle);
        }
        if (((Boolean) rVar.f5056c.a(F7.f8810c2)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, this.f13349m.f14846c, "rendering-start");
        }
        String a5 = a(sq);
        this.i.f15378d = (Nq) sq.f11596b.f13762m;
        if (((Boolean) rVar.f5056c.a(F7.T7)).booleanValue() && (i = ((Nq) sq.f11596b.f13762m).f) != 0 && (i < 200 || i >= 300)) {
            return AbstractC1400ot.Z(new C0858co(a5, 3));
        }
        Nq nq = (Nq) sq.f11596b.f13762m;
        if (((Boolean) rVar.f5056c.a(F7.f8932y3)).booleanValue()) {
            String str = nq.f10836q;
            if (!TextUtils.isEmpty(str)) {
                C1528rn c1528rn = this.i;
                List list = (List) sq.f11596b.f13761l;
                synchronized (c1528rn) {
                    if (c1528rn.f15376b.containsKey(str)) {
                        int indexOf = c1528rn.f15375a.indexOf((Q2.c1) c1528rn.f15376b.get(str));
                        try {
                            c1528rn.f15375a.remove(indexOf);
                        } catch (IndexOutOfBoundsException e3) {
                            P2.o.f4767B.f4774g.i("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e3);
                        }
                        c1528rn.f15376b.remove(str);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            c1528rn.c((Lq) it.next(), indexOf);
                            indexOf++;
                        }
                    }
                }
                this.f13340b.m1(new C1207kg(sq, this.f13342d, this.f13341c), this.f13343e);
                if (((Nq) sq.f11596b.f13762m).f10837r <= 1) {
                    return this.f13348l.o(sq);
                }
                Cr a6 = new C1324n6(this.f13339a, Dr.f8398v, null, Gr.f9278d, Collections.EMPTY_LIST, AbstractC1400ot.Z(new C0858co(a(sq), 3))).a();
                this.f13345h.f();
                int i5 = 0;
                for (Lq lq : (List) sq.f11596b.f13761l) {
                    Iterator it2 = lq.f10489a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        InterfaceC1259ln a8 = this.f13344g.a(str2, lq.f10491b);
                        if (a8 != null && a8.a(sq, lq)) {
                            C1324n6 a9 = this.f13339a.a(a6, Dr.f8399w);
                            Gr gr = (Gr) a9.f14583p;
                            a6 = new C1324n6(gr, a9.f14580m, "render-config-" + i5 + "-" + str2, (E3.a) a9.f14579l, (List) a9.f14581n, AbstractC1400ot.X((E3.a) a9.f14582o, Throwable.class, new P2.c(this, lq, sq, a8, 4), gr.f9279a)).a();
                            break;
                        }
                    }
                    i5++;
                }
                C0769ao c0769ao = this.f13345h;
                Objects.requireNonNull(c0769ao);
                a6.a(new RunnableC1303mm(3, c0769ao), this.f13343e);
                return a6;
            }
        }
        for (Lq lq2 : (List) sq.f11596b.f13761l) {
            C1528rn c1528rn2 = this.i;
            c1528rn2.c(lq2, c1528rn2.f15375a.size());
            Iterator it3 = lq2.f10489a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    this.i.d(lq2, 0L, AbstractC1803xs.I(1, null, null), false);
                    break;
                }
                InterfaceC1259ln a10 = this.f13344g.a((String) it3.next(), lq2.f10491b);
                if (a10 == null || !a10.a(sq, lq2)) {
                }
            }
        }
        this.f13340b.m1(new C1207kg(sq, this.f13342d, this.f13341c), this.f13343e);
        if (((Nq) sq.f11596b.f13762m).f10837r <= 1) {
        }
    }
}
