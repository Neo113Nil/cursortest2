package p032e2;

import A1.X;
import C1.C0095a;
import F1.j;
import F1.u;
import F1.v;
import p146u2.InterfaceC0951j;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f12584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f12585c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public X f12586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f12587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12588f;

    public c(int i7, int i8, X x4) {
        this.f12583a = i8;
        this.f12584b = x4;
    }

    @Override // F1.v
    public final void a(X x4) {
        X x7 = this.f12584b;
        if (x7 != null) {
            x4 = x4.d(x7);
        }
        this.f12586d = x4;
        v vVar = this.f12587e;
        int i7 = t.f17159a;
        vVar.a(x4);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        v vVar = this.f12587e;
        int i8 = t.f17159a;
        vVar.c(i7, c0095a);
    }

    @Override // F1.v
    public final int d(InterfaceC0951j interfaceC0951j, int i7, boolean z4) {
        v vVar = this.f12587e;
        int i8 = t.f17159a;
        return vVar.b(interfaceC0951j, i7, z4);
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        long j3 = this.f12588f;
        if (j3 != -9223372036854775807L && j >= j3) {
            this.f12587e = this.f12585c;
        }
        v vVar = this.f12587e;
        int i10 = t.f17159a;
        vVar.e(j, i7, i8, i9, uVar);
    }
}
