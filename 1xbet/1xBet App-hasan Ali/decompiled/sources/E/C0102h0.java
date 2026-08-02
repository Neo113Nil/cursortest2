package E;

import K0.C0203h;
import Q2.C0375o;
import java.util.List;

/* renamed from: E.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102h0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0203h f1193a;

    /* renamed from: b, reason: collision with root package name */
    public final K0.O f1194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1195c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1196d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1197e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final W0.c f1198g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.d f1199h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public C0375o f1200j;

    /* renamed from: k, reason: collision with root package name */
    public W0.m f1201k;

    public C0102h0(C0203h c0203h, K0.O o5, boolean z3, W0.c cVar, O0.d dVar, int i) {
        X3.v vVar = X3.v.f6090k;
        this.f1193a = c0203h;
        this.f1194b = o5;
        this.f1195c = Integer.MAX_VALUE;
        this.f1196d = 1;
        this.f1197e = z3;
        this.f = 1;
        this.f1198g = cVar;
        this.f1199h = dVar;
        this.i = vVar;
    }

    public final void a(W0.m mVar) {
        C0375o c0375o = this.f1200j;
        if (c0375o == null || mVar != this.f1201k || c0375o.c()) {
            this.f1201k = mVar;
            c0375o = new C0375o(this.f1193a, K0.F.h(this.f1194b, mVar), this.i, this.f1198g, this.f1199h);
        }
        this.f1200j = c0375o;
    }
}
