package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1663un implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final C0578Df f15900a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f15901b;

    /* renamed from: c, reason: collision with root package name */
    public final Wq f15902c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f15903d;

    /* renamed from: e, reason: collision with root package name */
    public final U2.a f15904e;
    public final A9 f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15905g = ((Boolean) Q2.r.f5053d.f5056c.a(F7.y8)).booleanValue();

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0857cn f15906h;
    public final C1392ol i;

    /* renamed from: j, reason: collision with root package name */
    public final C1482ql f15907j;

    public C1663un(C0578Df c0578Df, Context context, Executor executor, Wk wk, Wq wq, U2.a aVar, A9 a9, BinderC0857cn binderC0857cn, C1392ol c1392ol, C1482ql c1482ql) {
        this.f15900a = c0578Df;
        this.f15903d = executor;
        this.f15901b = wk;
        this.f15902c = wq;
        this.f15904e = aVar;
        this.f = a9;
        this.f15906h = binderC0857cn;
        this.i = c1392ol;
        this.f15907j = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        Pq pq = lq.f10523s;
        return (pq == null || pq.f11126a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        Oi oi = new Oi(12);
        Mw mw = Mw.f10750l;
        C1030gh c1030gh = new C1030gh(this, lq, sq, oi, 2);
        Executor executor = this.f15903d;
        C1537rw j02 = AbstractC1400ot.j0(mw, c1030gh, executor);
        j02.a(new C4(oi, 3), executor);
        return j02;
    }
}
