package e2;

import c2.I;
import c2.V;
import c2.W;
import w1.V0;

/* renamed from: e2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1009f implements W {

    /* renamed from: a, reason: collision with root package name */
    public final C1010g f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final V f12603b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12604c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1010g f12606e;

    public C1009f(C1010g c1010g, C1010g c1010g2, V v6, int i7) {
        this.f12606e = c1010g;
        this.f12602a = c1010g2;
        this.f12603b = v6;
        this.f12604c = i7;
    }

    public final void a() {
        if (this.f12605d) {
            return;
        }
        C1010g c1010g = this.f12606e;
        I i7 = c1010g.f12626x;
        int[] iArr = c1010g.f12621b;
        int i8 = this.f12604c;
        i7.b(iArr[i8], c1010g.f12622c[i8], 0, null, c1010g.f12617K);
        this.f12605d = true;
    }

    @Override // c2.W
    public final boolean b() {
        C1010g c1010g = this.f12606e;
        return !c1010g.m() && this.f12603b.s(c1010g.f12619M);
    }

    @Override // c2.W
    public final int d(long j) {
        C1010g c1010g = this.f12606e;
        if (c1010g.m()) {
            return 0;
        }
        boolean z4 = c1010g.f12619M;
        V v6 = this.f12603b;
        int p5 = v6.p(j, z4);
        v6.A(p5);
        if (p5 > 0) {
            a();
        }
        return p5;
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        C1010g c1010g = this.f12606e;
        if (c1010g.m()) {
            return -3;
        }
        a();
        return this.f12603b.x(v02, hVar, i7, c1010g.f12619M);
    }

    @Override // c2.W
    public final void c() {
    }
}
