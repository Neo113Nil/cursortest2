package B0;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class P1 extends AbstractC7737t implements InterfaceC6511n<B1.Y, B1.U, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N1 f1493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P1(N1 n12) {
        super(3);
        this.f1493b = n12;
    }

    @Override // fd.InterfaceC6511n
    public final B1.W invoke(B1.Y y11, B1.U u11, Z1.b bVar) {
        B1.W z02;
        long p11 = bVar.p();
        long a11 = this.f1493b.a();
        B1.m0 a02 = u11.a0(Z1.b.c(kotlin.ranges.h.e((int) (a11 >> 32), Z1.b.m(p11), Z1.b.k(p11)), 0, kotlin.ranges.h.e((int) (a11 & 4294967295L), Z1.b.l(p11), Z1.b.j(p11)), 0, 10, p11));
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new O1(a02));
        return z02;
    }
}
