package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949eq {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13355a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f13356b;

    /* renamed from: c, reason: collision with root package name */
    public final C0554Af f13357c;

    /* renamed from: d, reason: collision with root package name */
    public final C0904dq f13358d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1621tq f13359e;
    public final U2.a f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f13360g;

    /* renamed from: h, reason: collision with root package name */
    public final Nr f13361h;
    public final Vq i;

    /* renamed from: j, reason: collision with root package name */
    public E3.a f13362j;

    public C0949eq(Context context, Executor executor, C0554Af c0554Af, InterfaceC1621tq interfaceC1621tq, C0904dq c0904dq, Vq vq, U2.a aVar) {
        this.f13355a = context;
        this.f13356b = executor;
        this.f13357c = c0554Af;
        this.f13359e = interfaceC1621tq;
        this.f13358d = c0904dq;
        this.i = vq;
        this.f = aVar;
        this.f13360g = new FrameLayout(context);
        this.f13361h = c0554Af.C();
    }

    public final synchronized boolean a(Q2.X0 x02, String str, AbstractC1668us abstractC1668us, Jo jo) {
        Throwable th;
        boolean z3;
        Mr mr;
        C0578Df c0578Df;
        try {
            try {
                if (!x02.f4959m.getBoolean("is_sdk_preload", false)) {
                    if (((Boolean) AbstractC0968f8.f13457d.s()).booleanValue()) {
                        try {
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.La)).booleanValue()) {
                                z3 = true;
                                if (this.f.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue() || !z3) {
                                    m3.v.c("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z3 = false;
                    if (this.f.f5854m >= ((Integer) Q2.r.f5053d.f5056c.a(F7.Ma)).intValue()) {
                    }
                    m3.v.c("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    U2.j.f("Ad unit ID should not be null for app open ad.");
                    this.f13356b.execute(new RunnableC1303mm(6, this));
                    return false;
                }
                if (this.f13362j != null) {
                    return false;
                }
                if (!((Boolean) AbstractC0834c8.f12977c.s()).booleanValue() || (c0578Df = (C0578Df) this.f13359e.j()) == null) {
                    mr = null;
                } else {
                    Mr mr2 = (Mr) c0578Df.f.d();
                    mr2.i(7);
                    mr2.b(x02.f4972z);
                    mr2.f(x02.f4969w);
                    mr = mr2;
                }
                AbstractC1668us.o(this.f13355a, x02.f4962p);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.z8)).booleanValue() && x02.f4962p) {
                    ((Ul) this.f13357c.f7684v.d()).e(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(x02.J));
                P2.o.f4767B.f4776j.getClass();
                Bundle i = AbstractC1668us.i(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                Vq vq = this.i;
                vq.f11945c = str;
                vq.f11944b = Q2.a1.a();
                vq.f11943a = x02;
                vq.f11960t = i;
                Context context = this.f13355a;
                Wq a5 = vq.a();
                Jr C5 = AbstractC1668us.C(context, AbstractC1803xs.W(a5), 7, x02);
                C0816bq c0816bq = new C0816bq();
                c0816bq.f12914a = a5;
                E3.a e3 = this.f13359e.e(new C1390oj(29, c0816bq, null, false), new Qt(26, this));
                this.f13362j = e3;
                e3.a(new Kw(0, e3, new C0375o(this, jo, mr, C5, c0816bq, 12, false)), this.f13356b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized C0570Cf b(InterfaceC1531rq interfaceC1531rq) {
        C0816bq c0816bq = (C0816bq) interfaceC1531rq;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.M7)).booleanValue()) {
            Gh gh = new Gh();
            gh.f9206a = this.f13355a;
            gh.f9207b = c0816bq.f12914a;
            Gh gh2 = new Gh(gh);
            Fi fi = new Fi();
            fi.f9096l.add(new Si(this.f13358d, this.f13356b));
            fi.d(this.f13358d, this.f13356b);
            Gi gi = new Gi(fi);
            C0570Cf c0570Cf = new C0570Cf(this.f13357c.f7646b, 0);
            c0570Cf.f = gh2;
            c0570Cf.f8043e = gi;
            return c0570Cf;
        }
        C0904dq c0904dq = this.f13358d;
        C0904dq c0904dq2 = new C0904dq(c0904dq.f13174k);
        c0904dq2.f13181r = c0904dq;
        Fi fi2 = new Fi();
        fi2.a(c0904dq2, this.f13356b);
        fi2.f9092g.add(new Si(c0904dq2, this.f13356b));
        fi2.f9098n.add(new Si(c0904dq2, this.f13356b));
        fi2.f9097m.add(new Si(c0904dq2, this.f13356b));
        fi2.f9096l.add(new Si(c0904dq2, this.f13356b));
        fi2.d(c0904dq2, this.f13356b);
        fi2.f9099o = c0904dq2;
        Gh gh3 = new Gh();
        gh3.f9206a = this.f13355a;
        gh3.f9207b = c0816bq.f12914a;
        Gh gh4 = new Gh(gh3);
        Gi gi2 = new Gi(fi2);
        C0570Cf c0570Cf2 = new C0570Cf(this.f13357c.f7646b, 0);
        c0570Cf2.f = gh4;
        c0570Cf2.f8043e = gi2;
        return c0570Cf2;
    }
}
