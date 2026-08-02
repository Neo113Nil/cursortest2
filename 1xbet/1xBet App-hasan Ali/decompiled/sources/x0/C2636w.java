package x0;

import java.util.Map;
import w0.AbstractC2540a;

/* renamed from: x0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2636w implements Q, InterfaceC2632s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2632s f21064k;

    /* renamed from: l, reason: collision with root package name */
    public final W0.m f21065l;

    public C2636w(InterfaceC2632s interfaceC2632s, W0.m mVar) {
        this.f21064k = interfaceC2632s;
        this.f21065l = mVar;
    }

    @Override // W0.c
    public final float D(long j5) {
        return this.f21064k.D(j5);
    }

    @Override // W0.c
    public final int K(float f) {
        return this.f21064k.K(f);
    }

    @Override // W0.c
    public final long S(long j5) {
        return this.f21064k.S(j5);
    }

    @Override // W0.c
    public final float V(long j5) {
        return this.f21064k.V(j5);
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f21064k.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f21064k.c();
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f21065l;
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f21064k.h0(i);
    }

    @Override // x0.Q
    public final P i(int i, int i5, Map map, i4.c cVar) {
        return p(i, i5, map, null, cVar);
    }

    @Override // W0.c
    public final float i0(float f) {
        return this.f21064k.i0(f);
    }

    @Override // W0.c
    public final float n() {
        return this.f21064k.n();
    }

    @Override // x0.Q
    public final P p(int i, int i5, Map map, i0.K k5, i4.c cVar) {
        if (i < 0) {
            i = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2540a.b("Size(" + i + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C2635v(i, i5, map, k5);
    }

    @Override // x0.InterfaceC2632s
    public final boolean t() {
        return this.f21064k.t();
    }

    @Override // W0.c
    public final long x(long j5) {
        return this.f21064k.x(j5);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f21064k.y(f);
    }
}
