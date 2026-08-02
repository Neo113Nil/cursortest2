package f0;

import e2.C1930k;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class c implements W0.c {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1937a f16923k = g.f16927k;

    /* renamed from: l, reason: collision with root package name */
    public C1930k f16924l;

    @Override // W0.c
    public final /* synthetic */ float D(long j5) {
        return L1.a.c(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ int K(float f) {
        return L1.a.b(f, this);
    }

    @Override // W0.c
    public final /* synthetic */ long S(long j5) {
        return L1.a.f(j5, this);
    }

    @Override // W0.c
    public final /* synthetic */ float V(long j5) {
        return L1.a.e(j5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1930k a(i4.c cVar) {
        C1930k c1930k = new C1930k(25, false);
        c1930k.f16910l = (m) cVar;
        this.f16924l = c1930k;
        return c1930k;
    }

    @Override // W0.c
    public final long b0(float f) {
        return L1.a.g(i0(f), this);
    }

    @Override // W0.c
    public final float c() {
        return this.f16923k.c().c();
    }

    @Override // W0.c
    public final float h0(int i) {
        return i / c();
    }

    @Override // W0.c
    public final float i0(float f) {
        return f / c();
    }

    @Override // W0.c
    public final float n() {
        return this.f16923k.c().n();
    }

    @Override // W0.c
    public final /* synthetic */ long x(long j5) {
        return L1.a.d(j5, this);
    }

    @Override // W0.c
    public final float y(float f) {
        return c() * f;
    }
}
