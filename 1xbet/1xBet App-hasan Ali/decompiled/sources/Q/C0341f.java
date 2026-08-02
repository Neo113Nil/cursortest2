package Q;

import I.C0160m;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* renamed from: Q.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341f extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final C0341f f4827c = new C0341f(0, 2, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        X.f fVar = (X.f) c0160m.e(1);
        int i = fVar != null ? fVar.f6057a : 0;
        C0336a c0336a = (C0336a) c0160m.e(0);
        if (i > 0) {
            interfaceC0284c = new F4.y(interfaceC0284c, i);
        }
        c0336a.s0(interfaceC0284c, p02, c02, j5 != null ? new v3.g(10, j5, p02) : null);
    }
}
