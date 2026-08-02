package J0;

import S0.InterfaceC3967k;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class D implements InterfaceC3264a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final D f12717a = new D();

    @Override // J0.InterfaceC3264a0
    public final long a(long j11, float f7, InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-1687113661);
        C3339s c3339s = (C3339s) interfaceC3967k.m(C3343t.d());
        if (Float.compare(f7, 0) <= 0 || c3339s.m()) {
            interfaceC3967k.o(1169152471);
            interfaceC3967k.k();
        } else {
            interfaceC3967k.o(1169013963);
            int i12 = C3269b0.f13137c;
            j11 = C7811b0.f(C7807Z.o(((((float) Math.log(f7 + 1)) * 4.5f) + 2.0f) / 100.0f, C3343t.b(j11, interfaceC3967k)), j11);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return j11;
    }
}
