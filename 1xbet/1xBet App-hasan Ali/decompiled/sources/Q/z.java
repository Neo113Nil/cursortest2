package Q;

import I.C0160m;
import P.AbstractC0317t;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* loaded from: classes.dex */
public final class z extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final z f4850c = new z(0, 0, 3);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        if (p02.f4377n != 0) {
            AbstractC0317t.c("Cannot reset when inserting");
        }
        p02.F();
        p02.f4383t = 0;
        p02.f4384u = p02.o() - p02.f4372h;
        p02.i = 0;
        p02.f4373j = 0;
        p02.f4378o = 0;
    }
}
