package p032e2;

import D1.h;
import p018c2.I;
import p018c2.V;
import p018c2.W;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f12609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f12612e;

    public f(g gVar, g gVar2, V v6, int i7) {
        this.f12612e = gVar;
        this.f12608a = gVar2;
        this.f12609b = v6;
        this.f12610c = i7;
    }

    public final void a() {
        if (this.f12611d) {
            return;
        }
        g gVar = this.f12612e;
        I i7 = gVar.f12632x;
        int[] iArr = gVar.f12627b;
        int i8 = this.f12610c;
        i7.b(iArr[i8], gVar.f12628c[i8], 0, null, gVar.f12623K);
        this.f12611d = true;
    }

    @Override // p018c2.W
    public final boolean b() {
        g gVar = this.f12612e;
        return !gVar.m() && this.f12609b.s(gVar.f12625M);
    }

    @Override // p018c2.W
    public final int d(long j) {
        g gVar = this.f12612e;
        if (gVar.m()) {
            return 0;
        }
        boolean z4 = gVar.f12625M;
        V v6 = this.f12609b;
        int iP = v6.p(j, z4);
        v6.A(iP);
        if (iP > 0) {
            a();
        }
        return iP;
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        g gVar = this.f12612e;
        if (gVar.m()) {
            return -3;
        }
        a();
        return this.f12609b.x(v6, hVar, i7, gVar.f12625M);
    }

    @Override // p018c2.W
    public final void c() {
    }
}
