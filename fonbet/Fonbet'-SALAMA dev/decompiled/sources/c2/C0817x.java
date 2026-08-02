package c2;

import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import d2.C0959b;

/* renamed from: c2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817x extends R0 {

    /* renamed from: b, reason: collision with root package name */
    public final C0022h0 f10416b;

    public C0817x(C0022h0 c0022h0) {
        this.f10416b = c0022h0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        return obj == C0816w.f10413e ? 0 : -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        p02.h(z4 ? 0 : null, z4 ? C0816w.f10413e : null, 0, -9223372036854775807L, 0L, C0959b.f12381f, true);
        return p02;
    }

    @Override // A1.R0
    public final int h() {
        return 1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        return C0816w.f10413e;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q02, long j) {
        q02.b(Q0.f200I, this.f10416b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        q02.f205C = true;
        return q02;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}
