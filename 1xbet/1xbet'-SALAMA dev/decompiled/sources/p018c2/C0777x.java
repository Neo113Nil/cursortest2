package p018c2;

import A1.C0022h0;
import A1.P0;
import A1.Q0;
import A1.R0;
import p024d2.b;

/* JADX INFO: renamed from: c2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777x extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0022h0 f10416b;

    public C0777x(C0022h0 c0022h0) {
        this.f10416b = c0022h0;
    }

    @Override // A1.R0
    public final int b(Object obj) {
        return obj == C0776w.f10413e ? 0 : -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        p5.h(z4 ? 0 : null, z4 ? C0776w.f10413e : null, 0, -9223372036854775807L, 0L, b.f12387f, true);
        return p5;
    }

    @Override // A1.R0
    public final int h() {
        return 1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        return C0776w.f10413e;
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        q1.b(Q0.f200I, this.f10416b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        q1.f205C = true;
        return q1;
    }

    @Override // A1.R0
    public final int o() {
        return 1;
    }
}
