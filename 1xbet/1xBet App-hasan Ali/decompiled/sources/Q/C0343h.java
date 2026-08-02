package Q;

import I.C0160m;
import P.AbstractC0287d0;
import P.AbstractC0317t;
import P.AbstractC0321v;
import P.InterfaceC0284c;
import P.P0;
import Q2.C0;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343h extends I {

    /* renamed from: c, reason: collision with root package name */
    public static final C0343h f4829c = new C0343h(0, 4, 1);

    @Override // Q.I
    public final void a(C0160m c0160m, InterfaceC0284c interfaceC0284c, P0 p02, C0 c02, J j5) {
        AbstractC0287d0 abstractC0287d0 = (AbstractC0287d0) c0160m.e(2);
        AbstractC0321v abstractC0321v = (AbstractC0321v) c0160m.e(1);
        abstractC0321v.k(abstractC0287d0);
        AbstractC0317t.d("Could not resolve state for movable content");
        throw new D2.e();
    }
}
