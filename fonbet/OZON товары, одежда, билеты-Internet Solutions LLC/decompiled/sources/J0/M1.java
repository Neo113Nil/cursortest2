package J0;

import fd.InterfaceC6511n;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class M1 extends AbstractC7737t implements InterfaceC6511n<B1.Y, B1.U, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f12899b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    M1(float f7) {
        super(3);
        this.f12899b = f7;
    }

    @Override // fd.InterfaceC6511n
    public final B1.W invoke(B1.Y y11, B1.U u11, Z1.b bVar) {
        B1.W z02;
        B1.Y y12 = y11;
        long p11 = bVar.p();
        int Y02 = y12.Y0(this.f12899b);
        int i11 = Y02 * 2;
        B1.m0 a02 = u11.a0(Z1.c.k(0, i11, p11));
        z02 = y12.z0(a02.u0(), a02.l0() - i11, kotlin.collections.U.c(), new L1(a02, Y02));
        return z02;
    }
}
