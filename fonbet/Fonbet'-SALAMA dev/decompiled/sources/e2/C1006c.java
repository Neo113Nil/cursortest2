package e2;

import A1.X;
import C1.C0095a;
import F1.u;
import F1.v;
import u2.InterfaceC1633j;
import v2.t;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1006c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f12577a;

    /* renamed from: b, reason: collision with root package name */
    public final X f12578b;

    /* renamed from: c, reason: collision with root package name */
    public final F1.j f12579c = new F1.j();

    /* renamed from: d, reason: collision with root package name */
    public X f12580d;

    /* renamed from: e, reason: collision with root package name */
    public v f12581e;

    /* renamed from: f, reason: collision with root package name */
    public long f12582f;

    public C1006c(int i7, int i8, X x4) {
        this.f12577a = i8;
        this.f12578b = x4;
    }

    @Override // F1.v
    public final void a(X x4) {
        X x7 = this.f12578b;
        if (x7 != null) {
            x4 = x4.d(x7);
        }
        this.f12580d = x4;
        v vVar = this.f12581e;
        int i7 = t.f17153a;
        vVar.a(x4);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        v vVar = this.f12581e;
        int i8 = t.f17153a;
        vVar.c(i7, c0095a);
    }

    @Override // F1.v
    public final int d(InterfaceC1633j interfaceC1633j, int i7, boolean z4) {
        v vVar = this.f12581e;
        int i8 = t.f17153a;
        return vVar.b(interfaceC1633j, i7, z4);
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        long j3 = this.f12582f;
        if (j3 != -9223372036854775807L && j >= j3) {
            this.f12581e = this.f12579c;
        }
        v vVar = this.f12581e;
        int i10 = t.f17153a;
        vVar.e(j, i7, i8, i9, uVar);
    }
}
