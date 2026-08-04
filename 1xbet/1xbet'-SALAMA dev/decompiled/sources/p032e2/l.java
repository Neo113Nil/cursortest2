package p032e2;

import A1.X;
import F1.h;
import F1.v;
import com.google.android.gms.common.api.f;
import p018c2.V;
import p028d6.k;
import p146u2.C0958q;
import p146u2.InterfaceC0954m;
import p146u2.T;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f12647F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final X f12648G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f12649H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f12650I;

    public l(InterfaceC0954m interfaceC0954m, C0958q c0958q, X x4, int i7, Object obj, long j, long j3, long j7, int i8, X x7) {
        super(interfaceC0954m, c0958q, x4, i7, obj, j, j3, -9223372036854775807L, -9223372036854775807L, j7);
        this.f12647F = i8;
        this.f12648G = x7;
    }

    @Override // p032e2.j
    public final boolean b() {
        return this.f12650I;
    }

    @Override // p146u2.H
    public final void load() {
        T t7 = this.f12607z;
        k kVar = this.f12578D;
        a.i(kVar);
        for (V v6 : (V[]) kVar.f12448c) {
            if (v6.f10266F != 0) {
                v6.f10266F = 0L;
                v6.f10292z = true;
            }
        }
        v vVarT = kVar.t(this.f12647F);
        vVarT.a(this.f12648G);
        try {
            long jO = t7.o(this.f12600b.a(this.f12649H));
            if (jO != -1) {
                jO += this.f12649H;
            }
            h hVar = new h(this.f12607z, this.f12649H, jO);
            for (int iD = 0; iD != -1; iD = vVarT.d(hVar, f.API_PRIORITY_OTHER, true)) {
                this.f12649H += (long) iD;
            }
            vVarT.e(this.f12605x, 1, (int) this.f12649H, 0, null);
            q6.a.b(t7);
            this.f12650I = true;
        } catch (Throwable th) {
            q6.a.b(t7);
            throw th;
        }
    }

    @Override // p146u2.H
    public final void l() {
    }
}
