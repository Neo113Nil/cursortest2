package P0;

import S0.C3996z;
import S0.InterfaceC3967k;
import a1.C4912a;
import i1.C6988h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final S0.O f21019a = new S0.O(a.f21020b);

    static final class a extends AbstractC7737t implements Function0<Z1.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21020b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Z1.h invoke() {
            return Z1.h.a(0);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, l1.J0 j02, long j11, long j12, float f7, float f11, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 2) != 0) {
            j02 = l1.y0.a();
        }
        l1.J0 j03 = j02;
        if ((i12 & 8) != 0) {
            j12 = C3759o.b(j11, interfaceC3967k);
        }
        float f12 = (i12 & 16) != 0 ? 0 : f7;
        float f13 = (i12 & 32) != 0 ? 0 : f11;
        S0.O o11 = f21019a;
        float d11 = ((Z1.h) interfaceC3967k.m(o11)).d() + f12;
        C3996z.b(new S0.H0[]{C3776u.a().c(C7807Z.m(j12)), o11.c(Z1.h.a(d11))}, a1.c.c(-70914509, new h2(eVar, j03, j11, d11, f13, c4912a), interfaceC3967k), interfaceC3967k, 56);
    }

    public static final void b(@NotNull Function0 function0, androidx.compose.ui.e eVar, boolean z11, l1.J0 j02, long j11, long j12, float f7, t0.q qVar, @NotNull C4912a c4912a, InterfaceC3967k interfaceC3967k, int i11) {
        S0.O o11 = f21019a;
        float d11 = ((Z1.h) interfaceC3967k.m(o11)).d() + 0;
        C3996z.b(new S0.H0[]{C3776u.a().c(C7807Z.m(j12)), o11.c(Z1.h.a(d11))}, a1.c.c(1279702876, new i2(d11, f7, j11, c4912a, eVar, function0, j02, qVar, z11), interfaceC3967k), interfaceC3967k, 56);
    }

    public static final androidx.compose.ui.e c(float f7, long j11, androidx.compose.ui.e eVar, l1.J0 j02) {
        l1.J0 j03;
        androidx.compose.ui.e eVar2;
        if (f7 > 0.0f) {
            j03 = j02;
            eVar2 = androidx.compose.ui.graphics.a.b(androidx.compose.ui.e.f40358c0, 0.0f, 0.0f, 0.0f, 0.0f, f7, 0.0f, j03, false, 124895);
        } else {
            j03 = j02;
            eVar2 = androidx.compose.ui.e.f40358c0;
        }
        return C6988h.a(androidx.compose.foundation.e.b(eVar.l0(eVar2).l0(androidx.compose.ui.e.f40358c0), j11, j03), j03);
    }
}
