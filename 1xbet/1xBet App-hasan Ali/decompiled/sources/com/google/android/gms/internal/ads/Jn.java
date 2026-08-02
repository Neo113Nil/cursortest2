package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Jn implements InterfaceC1259ln {

    /* renamed from: b, reason: collision with root package name */
    public final Context f10054b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f10055c;

    /* renamed from: d, reason: collision with root package name */
    public final Wq f10056d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f10057e;
    public final U2.a f;

    /* renamed from: g, reason: collision with root package name */
    public final A9 f10058g;
    public final BinderC0857cn i;

    /* renamed from: j, reason: collision with root package name */
    public final C1392ol f10060j;

    /* renamed from: k, reason: collision with root package name */
    public final C1482ql f10061k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10062l;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10053a = 0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10059h = ((Boolean) Q2.r.f5053d.f5056c.a(F7.y8)).booleanValue();

    public Jn(Context context, U2.a aVar, Wq wq, Executor executor, C0622Jf c0622Jf, Wk wk, A9 a9, BinderC0857cn binderC0857cn, C1392ol c1392ol, C1482ql c1482ql) {
        this.f10054b = context;
        this.f10056d = wq;
        this.f10062l = c0622Jf;
        this.f10057e = executor;
        this.f = aVar;
        this.f10055c = wk;
        this.f10058g = a9;
        this.i = binderC0857cn;
        this.f10060j = c1392ol;
        this.f10061k = c1482ql;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        switch (this.f10053a) {
            case 0:
                Pq pq = lq.f10523s;
                if (pq == null || pq.f11126a == null) {
                }
                break;
            default:
                Pq pq2 = lq.f10523s;
                if (pq2 == null || pq2.f11126a == null) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        switch (this.f10053a) {
            case 0:
                Oi oi = new Oi(12);
                Mw mw = Mw.f10750l;
                C1030gh c1030gh = new C1030gh(this, lq, sq, oi, 6);
                Executor executor = this.f10057e;
                C1537rw j02 = AbstractC1400ot.j0(mw, c1030gh, executor);
                j02.a(new C4(oi, 4), executor);
                return j02;
            default:
                Oi oi2 = new Oi(12);
                Mw mw2 = Mw.f10750l;
                C1030gh c1030gh2 = new C1030gh(this, lq, sq, oi2, 8);
                Executor executor2 = this.f10057e;
                C1537rw j03 = AbstractC1400ot.j0(mw2, c1030gh2, executor2);
                j03.a(new C4(oi2, 5), executor2);
                return j03;
        }
    }

    public Jn(Context context, U2.a aVar, Wq wq, Executor executor, C0636Lf c0636Lf, Wk wk, A9 a9, BinderC0857cn binderC0857cn, C1392ol c1392ol, C1482ql c1482ql) {
        this.f10054b = context;
        this.f10056d = wq;
        this.f10062l = c0636Lf;
        this.f10057e = executor;
        this.f = aVar;
        this.f10055c = wk;
        this.f10058g = a9;
        this.i = binderC0857cn;
        this.f10060j = c1392ol;
        this.f10061k = c1482ql;
    }
}
