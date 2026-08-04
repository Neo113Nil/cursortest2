package p032e2;

import A1.X;
import F1.h;
import p028d6.k;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p146u2.T;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final d f12641A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public k f12642B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12643C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f12644D;

    public i(InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, int i7, Object obj, d dVar) {
        super(interfaceC0954m, c0958q, 2, x4, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12641A = dVar;
    }

    @Override // p146u2.H
    public final void l() {
        this.f12644D = true;
    }

    @Override // p146u2.H
    public final void load() {
        if (this.f12643C == 0) {
            this.f12641A.a(this.f12642B, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C0958q c0958qA = this.f12600b.a(this.f12643C);
            T t7 = this.f12607z;
            h hVar = new h(t7, c0958qA.f16818e, t7.o(c0958qA));
            while (!this.f12644D) {
                try {
                    int iF = this.f12641A.f12590a.f(hVar, d.f12589A);
                    boolean z4 = false;
                    a.h(iF != 1);
                    if (iF == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f12643C = hVar.f2534d - this.f12600b.f16818e;
                    throw th;
                }
            }
            this.f12643C = hVar.f2534d - this.f12600b.f16818e;
            q6.a.b(this.f12607z);
        } catch (Throwable th2) {
            q6.a.b(this.f12607z);
            throw th2;
        }
    }
}
