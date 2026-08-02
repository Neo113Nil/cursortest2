package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r {
    public static final void a(androidx.compose.ui.e eVar, A0.g gVar, long j11, float f7, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        l1.J0 j02 = gVar;
        if ((i12 & 2) != 0) {
            j02 = ((C3286e2) interfaceC3967k.m(C3291f2.a())).b();
        }
        l1.J0 j03 = j02;
        if ((i12 & 4) != 0) {
            j11 = ((C3339s) interfaceC3967k.m(C3343t.d())).l();
        }
        long j12 = j11;
        long b11 = C3343t.b(j12, interfaceC3967k);
        if ((i12 & 32) != 0) {
            f7 = 1;
        }
        R2.a(eVar, j03, j12, b11, f7, c4912a, interfaceC3967k, i11 & 4194302, 0);
    }
}
