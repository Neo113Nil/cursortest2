package p032e2;

import A1.X;
import p018c2.V;
import p028d6.k;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p146u2.T;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f12635F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f12636G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final d f12637H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public long f12638I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public volatile boolean f12639J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f12640K;

    public h(InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, int i7, Object obj, long j, long j3, long j7, long j8, long j9, int i8, long j10, d dVar) {
        super(interfaceC0954m, c0958q, x4, i7, obj, j, j3, j7, j8, j9);
        this.f12635F = i8;
        this.f12636G = j10;
        this.f12637H = dVar;
    }

    @Override // p032e2.j
    public final long a() {
        return this.f12645A + ((long) this.f12635F);
    }

    @Override // p032e2.j
    public final boolean b() {
        return this.f12640K;
    }

    @Override // p146u2.H
    public final void l() {
        this.f12639J = true;
    }

    @Override // p146u2.H
    public final void load() {
        if (this.f12638I == 0) {
            k kVar = this.f12578D;
            a.i(kVar);
            long j = this.f12636G;
            for (V v6 : (V[]) kVar.f12448c) {
                if (v6.f10266F != j) {
                    v6.f10266F = j;
                    v6.f10292z = true;
                }
            }
            d dVar = this.f12637H;
            long j3 = this.f12576B;
            long j7 = j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.f12636G;
            long j8 = this.f12577C;
            dVar.a(kVar, j7, j8 != -9223372036854775807L ? j8 - this.f12636G : -9223372036854775807L);
        }
        try {
            C0958q c0958qA = this.f12600b.a(this.f12638I);
            T t7 = this.f12607z;
            F1.h hVar = new F1.h(t7, c0958qA.f16818e, t7.o(c0958qA));
            while (!this.f12639J) {
                try {
                    int iF = this.f12637H.f12590a.f(hVar, d.f12589A);
                    a.h(iF != 1);
                    if (!(iF == 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f12638I = hVar.f2534d - this.f12600b.f16818e;
                    throw th;
                }
            }
            this.f12638I = hVar.f2534d - this.f12600b.f16818e;
            q6.a.b(this.f12607z);
            this.f12640K = !this.f12639J;
        } catch (Throwable th2) {
            q6.a.b(this.f12607z);
            throw th2;
        }
    }
}
