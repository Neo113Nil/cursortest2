package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class Wk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12068a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f12069b;

    /* renamed from: c, reason: collision with root package name */
    public final T7 f12070c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.a f12071d;

    /* renamed from: e, reason: collision with root package name */
    public final G.v f12072e;
    public final C1773x6 f;

    /* renamed from: g, reason: collision with root package name */
    public final C1344ni f12073g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0857cn f12074h;
    public final Xq i;

    public Wk(Context context, Q4 q42, T7 t7, U2.a aVar, G.v vVar, C1773x6 c1773x6, C1344ni c1344ni, BinderC0857cn binderC0857cn, Xq xq) {
        this.f12068a = context;
        this.f12069b = q42;
        this.f12070c = t7;
        this.f12071d = aVar;
        this.f12072e = vVar;
        this.f = c1773x6;
        this.f12073g = c1344ni;
        this.f12074h = binderC0857cn;
        this.i = xq;
    }

    public final InterfaceC0677Re a(Q2.a1 a1Var, Lq lq, Nq nq) {
        C1586t a5 = C1586t.a(a1Var);
        Mt mt = new Mt(23, this);
        U2.a aVar = this.f12071d;
        G.v vVar = this.f12072e;
        BinderC0857cn binderC0857cn = this.f12074h;
        Xq xq = this.i;
        Context context = this.f12068a;
        String str = a1Var.f4974k;
        return V9.f(vVar, aVar, context, a5, this.f12069b, this.f, this.f12070c, binderC0857cn, lq, nq, xq, mt, str, false, false);
    }
}
