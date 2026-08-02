package e2;

import A1.X;
import F1.v;
import c2.V;
import d6.C0977k;
import u2.C1640q;
import u2.InterfaceC1636m;
import u2.T;
import v2.AbstractC1664a;

/* renamed from: e2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015l extends AbstractC1004a {

    /* renamed from: F, reason: collision with root package name */
    public final int f12641F;

    /* renamed from: G, reason: collision with root package name */
    public final X f12642G;

    /* renamed from: H, reason: collision with root package name */
    public long f12643H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f12644I;

    public C1015l(InterfaceC1636m interfaceC1636m, C1640q c1640q, X x4, int i7, Object obj, long j, long j3, long j7, int i8, X x7) {
        super(interfaceC1636m, c1640q, x4, i7, obj, j, j3, -9223372036854775807L, -9223372036854775807L, j7);
        this.f12641F = i8;
        this.f12642G = x7;
    }

    @Override // e2.AbstractC1013j
    public final boolean b() {
        return this.f12644I;
    }

    @Override // u2.H
    public final void load() {
        T t7 = this.f12601z;
        C0977k c0977k = this.f12572D;
        AbstractC1664a.i(c0977k);
        for (V v6 : (V[]) c0977k.f12442c) {
            if (v6.f10266F != 0) {
                v6.f10266F = 0L;
                v6.f10292z = true;
            }
        }
        v t8 = c0977k.t(this.f12641F);
        t8.a(this.f12642G);
        try {
            long o7 = t7.o(this.f12594b.a(this.f12643H));
            if (o7 != -1) {
                o7 += this.f12643H;
            }
            F1.h hVar = new F1.h(this.f12601z, this.f12643H, o7);
            for (int i7 = 0; i7 != -1; i7 = t8.d(hVar, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, true)) {
                this.f12643H += i7;
            }
            t8.e(this.f12599x, 1, (int) this.f12643H, 0, null);
            q6.a.b(t7);
            this.f12644I = true;
        } catch (Throwable th) {
            q6.a.b(t7);
            throw th;
        }
    }

    @Override // u2.H
    public final void l() {
    }
}
