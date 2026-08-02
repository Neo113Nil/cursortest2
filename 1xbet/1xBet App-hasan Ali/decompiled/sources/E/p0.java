package E;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Z f1248a;

    /* renamed from: b, reason: collision with root package name */
    public final I.O f1249b;

    /* renamed from: c, reason: collision with root package name */
    public final P0.w f1250c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1251d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1252e;
    public final I.V f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.q f1253g;

    /* renamed from: h, reason: collision with root package name */
    public final G0 f1254h;
    public final L i;

    /* renamed from: j, reason: collision with root package name */
    public final T f1255j;

    /* renamed from: k, reason: collision with root package name */
    public final C0116v f1256k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1257l;

    public p0(Z z3, I.O o5, P0.w wVar, boolean z5, boolean z6, I.V v4, P0.q qVar, G0 g02, L l5, C0116v c0116v, int i) {
        T t5 = W.f1083a;
        this.f1248a = z3;
        this.f1249b = o5;
        this.f1250c = wVar;
        this.f1251d = z5;
        this.f1252e = z6;
        this.f = v4;
        this.f1253g = qVar;
        this.f1254h = g02;
        this.i = l5;
        this.f1255j = t5;
        this.f1256k = c0116v;
        this.f1257l = i;
    }

    public final void a(List list) {
        v3.g gVar = this.f1248a.f1091d;
        ArrayList n02 = X3.m.n0(list);
        n02.add(0, new P0.i());
        this.f1256k.c(gVar.t(n02));
    }
}
