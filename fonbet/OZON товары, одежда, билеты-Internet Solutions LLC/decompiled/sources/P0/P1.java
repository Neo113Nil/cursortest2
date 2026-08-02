package P0;

import B1.C2533b;
import B1.m0;
import J0.C3354v2;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class P1 implements B1.V {

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20754b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f20755c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20756d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f20757e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f20758f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B1.m0 f20759g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f20760h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f20761i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.m0 m0Var, int i11, B1.m0 m0Var2, int i12, int i13, B1.m0 m0Var3, int i14, int i15) {
            super(1);
            this.f20754b = m0Var;
            this.f20755c = i11;
            this.f20756d = m0Var2;
            this.f20757e = i12;
            this.f20758f = i13;
            this.f20759g = m0Var3;
            this.f20760h = i14;
            this.f20761i = i15;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            aVar2.h(this.f20754b, 0, this.f20755c, 0.0f);
            B1.m0 m0Var = this.f20756d;
            if (m0Var != null) {
                aVar2.h(m0Var, this.f20757e, this.f20758f, 0.0f);
            }
            B1.m0 m0Var2 = this.f20759g;
            if (m0Var2 != null) {
                aVar2.h(m0Var2, this.f20760h, this.f20761i, 0.0f);
            }
            return Unit.f71690a;
        }
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        float f7;
        B1.U u11;
        B1.U u12;
        int i11;
        float f11;
        int Y02;
        int max;
        int d11;
        B1.W z02;
        int E11;
        float f12;
        List<? extends B1.U> list2 = list;
        long j12 = j11;
        int k11 = Z1.b.k(j12);
        f7 = b2.f20980a;
        int min = Math.min(k11, y11.Y0(f7));
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                u11 = null;
                break;
            }
            u11 = list2.get(i12);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "action")) {
                break;
            }
            i12++;
        }
        B1.U u13 = u11;
        B1.m0 a02 = u13 != null ? u13.a0(j12) : null;
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                u12 = null;
                break;
            }
            u12 = list2.get(i13);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "dismissAction")) {
                break;
            }
            i13++;
        }
        B1.U u14 = u12;
        B1.m0 a03 = u14 != null ? u14.a0(j12) : null;
        int u02 = a02 != null ? a02.u0() : 0;
        int l02 = a02 != null ? a02.l0() : 0;
        int u03 = a03 != null ? a03.u0() : 0;
        int l03 = a03 != null ? a03.l0() : 0;
        if (u03 == 0) {
            f12 = b2.f20985f;
            i11 = y11.Y0(f12);
        } else {
            i11 = 0;
        }
        int i14 = ((min - u02) - u03) - i11;
        int m11 = Z1.b.m(j12);
        if (i14 >= m11) {
            m11 = i14;
        }
        int size3 = list2.size();
        int i15 = 0;
        while (i15 < size3) {
            B1.U u15 = list2.get(i15);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u15), "text")) {
                B1.m0 a04 = u15.a0(Z1.b.c(0, m11, 0, 0, 9, j12));
                int E12 = a04.E(C2533b.a());
                int E13 = a04.E(C2533b.b());
                boolean z11 = true;
                boolean z12 = (E12 == Integer.MIN_VALUE || E13 == Integer.MIN_VALUE) ? false : true;
                if (E12 != E13 && z12) {
                    z11 = false;
                }
                int i16 = min - u03;
                int i17 = i16 - u02;
                if (z11) {
                    max = Math.max(y11.Y0(R0.o.g()), Math.max(l02, l03));
                    Y02 = C3354v2.d(max, 2, a04);
                    if (a02 != null && (E11 = a02.E(C2533b.a())) != Integer.MIN_VALUE) {
                        d11 = (E12 + Y02) - E11;
                    }
                    d11 = 0;
                } else {
                    f11 = b2.f20981b;
                    Y02 = y11.Y0(f11) - E12;
                    max = Math.max(y11.Y0(R0.o.j()), a04.l0() + Y02);
                    if (a02 != null) {
                        d11 = C3354v2.d(max, 2, a02);
                    }
                    d11 = 0;
                }
                z02 = y11.z0(min, max, kotlin.collections.U.c(), new a(a04, Y02, a03, i16, a03 != null ? C3354v2.d(max, 2, a03) : 0, a02, i17, d11));
                return z02;
            }
            i15++;
            j12 = j11;
            m11 = m11;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
