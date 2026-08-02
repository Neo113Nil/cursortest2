package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Ik implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final G.v f9600a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f9601b;

    /* renamed from: c, reason: collision with root package name */
    public final C1482ql f9602c;

    /* renamed from: d, reason: collision with root package name */
    public final Xm f9603d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f9604e;
    public final Q4 f;

    /* renamed from: g, reason: collision with root package name */
    public final U2.a f9605g;

    /* renamed from: h, reason: collision with root package name */
    public final C1041gs f9606h;
    public final BinderC0857cn i;

    /* renamed from: j, reason: collision with root package name */
    public final Xq f9607j;

    public Ik(Context context, Executor executor, Q4 q42, U2.a aVar, G.v vVar, Xm xm, C1041gs c1041gs, C1482ql c1482ql, BinderC0857cn binderC0857cn, Xq xq) {
        this.f9601b = context;
        this.f9604e = executor;
        this.f = q42;
        this.f9605g = aVar;
        this.f9600a = vVar;
        this.f9603d = xm;
        this.f9606h = c1041gs;
        this.f9602c = c1482ql;
        this.i = binderC0857cn;
        this.f9607j = xq;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Kk kk = new Kk(this);
        synchronized (kk) {
            C1582sw h02 = AbstractC1400ot.h0(AbstractC1400ot.f0(new Z1(kk.f10219c, kk.f, kk.f10222g, kk.f10218b, kk.f10225k, kk.f10226l, (String) Q2.r.f5053d.f5056c.a(F7.f8698H3)), AbstractC0613Id.f), new C1383oc(1, kk), kk.f10221e);
            kk.f10227m = h02;
            AbstractC1803xs.k(h02, "NativeJavascriptExecutor.initializeEngine");
        }
        return kk;
    }
}
