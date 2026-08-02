package e2;

import A1.X;
import c2.V;
import d6.C0977k;
import u2.C1640q;
import u2.InterfaceC1636m;
import u2.T;
import v2.AbstractC1664a;

/* renamed from: e2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011h extends AbstractC1004a {

    /* renamed from: F, reason: collision with root package name */
    public final int f12629F;

    /* renamed from: G, reason: collision with root package name */
    public final long f12630G;

    /* renamed from: H, reason: collision with root package name */
    public final C1007d f12631H;

    /* renamed from: I, reason: collision with root package name */
    public long f12632I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f12633J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f12634K;

    public C1011h(InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, int i7, Object obj, long j, long j3, long j7, long j8, long j9, int i8, long j10, C1007d c1007d) {
        super(interfaceC1636m, c1640q, x4, i7, obj, j, j3, j7, j8, j9);
        this.f12629F = i8;
        this.f12630G = j10;
        this.f12631H = c1007d;
    }

    @Override // e2.AbstractC1013j
    public final long a() {
        return this.f12639A + this.f12629F;
    }

    @Override // e2.AbstractC1013j
    public final boolean b() {
        return this.f12634K;
    }

    @Override // u2.H
    public final void l() {
        this.f12633J = true;
    }

    @Override // u2.H
    public final void load() {
        if (this.f12632I == 0) {
            C0977k c0977k = this.f12572D;
            AbstractC1664a.i(c0977k);
            long j = this.f12630G;
            for (V v6 : (V[]) c0977k.f12442c) {
                if (v6.f10266F != j) {
                    v6.f10266F = j;
                    v6.f10292z = true;
                }
            }
            C1007d c1007d = this.f12631H;
            long j3 = this.f12570B;
            long j7 = j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f12630G;
            long j8 = this.f12571C;
            c1007d.a(c0977k, j7, j8 != -9223372036854775807L ? j8 - this.f12630G : -9223372036854775807L);
        }
        try {
            C1640q a2 = this.f12594b.a(this.f12632I);
            T t7 = this.f12601z;
            F1.h hVar = new F1.h(t7, a2.f16812e, t7.o(a2));
            while (!this.f12633J) {
                try {
                    int f7 = this.f12631H.f12584a.f(hVar, C1007d.f12583A);
                    AbstractC1664a.h(f7 != 1);
                    if (!(f7 == 0)) {
                        break;
                    }
                } finally {
                    this.f12632I = hVar.f2534d - this.f12594b.f16812e;
                }
            }
            q6.a.b(this.f12601z);
            this.f12634K = !this.f12633J;
        } catch (Throwable th) {
            q6.a.b(this.f12601z);
            throw th;
        }
    }
}
