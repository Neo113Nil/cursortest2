package Lb;

import Mb.a;
import Nb.C3666a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3573a[] f16673a;

    public b() {
        this(0);
    }

    @NotNull
    public final C3573a a(int i11) {
        return this.f16673a[i11];
    }

    @NotNull
    public final void b(@NotNull Mb.a ep, @NotNull Rb.a scalar) {
        Intrinsics.checkNotNullParameter(ep, "out");
        Intrinsics.checkNotNullParameter(scalar, "scalar");
        byte[] c11 = Rb.a.c(scalar);
        int i11 = Mb.a.f17792e;
        a.C0340a.a(ep);
        Pb.b bVar = new Pb.b();
        kotlin.ranges.e m11 = h.m(h.o(1, 64), 2);
        int f71842a = m11.getF71842a();
        int f71843b = m11.getF71843b();
        int f71844c = m11.getF71844c();
        C3573a[] c3573aArr = this.f16673a;
        if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
            while (true) {
                bVar.a(ep, C3573a.b(c3573aArr[f71842a / 2], c11[f71842a]));
                ep.e(bVar);
                if (f71842a == f71843b) {
                    break;
                } else {
                    f71842a += f71844c;
                }
            }
        }
        Intrinsics.checkNotNullParameter(ep, "t");
        Pb.b cp2 = new Pb.b();
        Pb.c output = new Pb.c();
        Intrinsics.checkNotNullParameter(ep, "ep");
        Intrinsics.checkNotNullParameter(ep, "ep");
        Intrinsics.checkNotNullParameter(output, "output");
        C3666a.k(output.a(), ep.b());
        C3666a.k(output.b(), ep.c());
        C3666a.k(output.c(), ep.d());
        for (int i12 = 0; i12 < 3; i12++) {
            cp2.b(output);
            Intrinsics.checkNotNullParameter(cp2, "cp");
            Intrinsics.checkNotNullParameter(cp2, "cp");
            Intrinsics.checkNotNullParameter(output, "output");
            output.a().h(cp2.d(), cp2.c());
            output.b().h(cp2.e(), cp2.f());
            output.c().h(cp2.f(), cp2.c());
        }
        cp2.b(output);
        ep.e(cp2);
        kotlin.ranges.e m12 = h.m(h.o(0, 64), 2);
        int f71842a2 = m12.getF71842a();
        int f71843b2 = m12.getF71843b();
        int f71844c2 = m12.getF71844c();
        if ((f71844c2 <= 0 || f71842a2 > f71843b2) && (f71844c2 >= 0 || f71843b2 > f71842a2)) {
            return;
        }
        while (true) {
            bVar.a(ep, C3573a.b(c3573aArr[f71842a2 / 2], c11[f71842a2]));
            ep.e(bVar);
            if (f71842a2 == f71843b2) {
                return;
            } else {
                f71842a2 += f71844c2;
            }
        }
    }

    public b(int i11) {
        C3573a[] data = new C3573a[32];
        for (int i12 = 0; i12 < 32; i12++) {
            data[i12] = new C3573a();
        }
        Intrinsics.checkNotNullParameter(data, "data");
        this.f16673a = data;
    }
}
