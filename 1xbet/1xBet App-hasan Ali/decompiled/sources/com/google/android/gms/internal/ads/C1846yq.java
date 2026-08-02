package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1846yq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16483a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f16484b;

    /* renamed from: c, reason: collision with root package name */
    public final C0554Af f16485c;

    /* renamed from: d, reason: collision with root package name */
    public final Eo f16486d;

    /* renamed from: e, reason: collision with root package name */
    public final Bq f16487e;
    public N7 f;

    /* renamed from: g, reason: collision with root package name */
    public final Nr f16488g;

    /* renamed from: h, reason: collision with root package name */
    public final Vq f16489h;
    public Cr i;

    public C1846yq(Context context, Executor executor, C0554Af c0554Af, Eo eo, Bq bq, Vq vq) {
        this.f16483a = context;
        this.f16484b = executor;
        this.f16485c = c0554Af;
        this.f16486d = eo;
        this.f16489h = vq;
        this.f16487e = bq;
        this.f16488g = c0554Af.C();
    }

    public final boolean a() {
        Cr cr = this.i;
        return (cr == null || cr.f8093m.isDone()) ? false : true;
    }

    public final boolean b(Q2.X0 x02, String str, AbstractC1668us abstractC1668us, Jo jo) {
        boolean z3;
        C0622Jf c0622Jf;
        Mr mr;
        int i = 0;
        Executor executor = this.f16484b;
        if (str == null) {
            U2.j.f("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC1303mm(9, this));
            return false;
        }
        if (a()) {
            return false;
        }
        A7 a7 = F7.z8;
        Q2.r rVar = Q2.r.f5053d;
        boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
        C0554Af c0554Af = this.f16485c;
        if (booleanValue && x02.f4962p) {
            ((Ul) c0554Af.f7684v.d()).e(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(x02.J));
        P2.o.f4767B.f4776j.getClass();
        Bundle i5 = AbstractC1668us.i(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        Vq vq = this.f16489h;
        vq.f11945c = str;
        vq.f11944b = ((C1711vq) abstractC1668us).f16052g;
        vq.f11943a = x02;
        vq.f11960t = i5;
        Wq a5 = vq.a();
        int W4 = AbstractC1803xs.W(a5);
        Context context = this.f16483a;
        Jr C5 = AbstractC1668us.C(context, W4, 4, x02);
        boolean booleanValue2 = ((Boolean) rVar.f5056c.a(F7.N7)).booleanValue();
        Eo eo = this.f16486d;
        if (booleanValue2) {
            C0554Af c0554Af2 = c0554Af.f7646b;
            Gh gh = new Gh();
            gh.f9206a = context;
            gh.f9207b = a5;
            Gh gh2 = new Gh(gh);
            Fi fi = new Fi();
            fi.b(eo, executor);
            fi.c(eo, executor);
            c0622Jf = new C0622Jf(c0554Af2, new Oi(13), new Gi(fi), gh2, new Qt(23), new C1529ro(0, this.f), null, null);
            z3 = true;
        } else {
            Fi fi2 = new Fi();
            HashSet hashSet = fi2.f9093h;
            HashSet hashSet2 = fi2.f9091e;
            z3 = true;
            Bq bq = this.f16487e;
            if (bq != null) {
                hashSet2.add(new Si(bq, executor));
                hashSet.add(new Si(bq, executor));
                fi2.a(bq, executor);
            }
            C0554Af c0554Af3 = c0554Af.f7646b;
            Gh gh3 = new Gh();
            gh3.f9206a = context;
            gh3.f9207b = a5;
            Gh gh4 = new Gh(gh3);
            fi2.b(eo, executor);
            hashSet2.add(new Si(eo, executor));
            hashSet.add(new Si(eo, executor));
            fi2.a(eo, executor);
            fi2.f9089c.add(new Si(eo, executor));
            fi2.d(eo, executor);
            fi2.c(eo, executor);
            fi2.f9097m.add(new Si(eo, executor));
            fi2.f9096l.add(new Si(eo, executor));
            c0622Jf = new C0622Jf(c0554Af3, new Oi(13), new Gi(fi2), gh4, new Qt(23), new C1529ro(0, this.f), null, null);
        }
        if (((Boolean) AbstractC0834c8.f12977c.s()).booleanValue()) {
            mr = (Mr) c0622Jf.f10009l0.d();
            mr.i(4);
            mr.b(x02.f4972z);
            mr.f(x02.f4969w);
        } else {
            mr = null;
        }
        Mr mr2 = mr;
        C1253lh c1253lh = (C1253lh) c0622Jf.f9936C0.d();
        Cr a6 = c1253lh.a(c1253lh.b());
        this.i = a6;
        a6.a(new Kw(i, a6, new C0375o(this, jo, mr2, C5, c0622Jf, 13, false)), executor);
        return z3;
    }
}
