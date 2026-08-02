package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Fq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9127a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f9128b;

    /* renamed from: c, reason: collision with root package name */
    public final C0554Af f9129c;

    /* renamed from: d, reason: collision with root package name */
    public final Bq f9130d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1621tq f9131e;
    public final Tq f;

    /* renamed from: g, reason: collision with root package name */
    public final Nr f9132g;

    /* renamed from: h, reason: collision with root package name */
    public final Vq f9133h;
    public E3.a i;

    public Fq(Context context, Executor executor, C0554Af c0554Af, InterfaceC1621tq interfaceC1621tq, Bq bq, Vq vq, Tq tq) {
        this.f9127a = context;
        this.f9128b = executor;
        this.f9129c = c0554Af;
        this.f9131e = interfaceC1621tq;
        this.f9130d = bq;
        this.f9133h = vq;
        this.f = tq;
        this.f9132g = c0554Af.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(Q2.X0 x02, String str, AbstractC1668us abstractC1668us, Jo jo) {
        Mr mr;
        boolean z3 = false;
        Object[] objArr = 0;
        Executor executor = this.f9128b;
        if (str == null) {
            U2.j.f("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC1303mm(10, this));
            return false;
        }
        E3.a aVar = this.i;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        boolean booleanValue = ((Boolean) AbstractC0834c8.f12977c.s()).booleanValue();
        InterfaceC1621tq interfaceC1621tq = this.f9131e;
        Object obj = null;
        if (!booleanValue || interfaceC1621tq.j() == null) {
            mr = null;
        } else {
            mr = (Mr) ((C0636Lf) interfaceC1621tq.j()).f10401g.d();
            mr.i(5);
            mr.b(x02.f4972z);
            mr.f(x02.f4969w);
        }
        boolean z5 = x02.f4962p;
        Context context = this.f9127a;
        AbstractC1668us.o(context, z5);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue() && x02.f4962p) {
            ((Ul) this.f9129c.f7684v.d()).e(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(x02.J));
        P2.o.f4767B.f4776j.getClass();
        Bundle i = AbstractC1668us.i(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        Vq vq = this.f9133h;
        vq.f11945c = str;
        vq.f11944b = new Q2.a1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
        vq.f11943a = x02;
        vq.f11960t = i;
        Wq a5 = vq.a();
        Jr C5 = AbstractC1668us.C(context, AbstractC1803xs.W(a5), 5, x02);
        Dq dq = new Dq();
        dq.f8378a = a5;
        E3.a e3 = interfaceC1621tq.e(new C1390oj(29, dq, obj, z3), new U4(26, this));
        this.i = e3;
        e3.a(new Kw(objArr == true ? 1 : 0, e3, new C0375o(this, jo, mr, C5, dq, 14, false)), executor);
        return true;
    }

    public final C0570Cf b(InterfaceC1531rq interfaceC1531rq) {
        C0570Cf c0570Cf = new C0570Cf(this.f9129c.f7646b, 1);
        Gh gh = new Gh();
        gh.f9206a = this.f9127a;
        gh.f9207b = ((Dq) interfaceC1531rq).f8378a;
        gh.f9209d = this.f;
        c0570Cf.f = new Gh(gh);
        c0570Cf.f8043e = new Gi(new Fi());
        return c0570Cf;
    }
}
