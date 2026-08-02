package J0;

import B1.C2533b;
import B1.m0;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.w2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3358w2 implements B1.V {

    /* renamed from: J0.w2$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f13462c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.m0 f13463d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f13464e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f13465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B1.m0 m0Var, int i11, B1.m0 m0Var2, int i12, int i13) {
            super(1);
            this.f13461b = m0Var;
            this.f13462c = i11;
            this.f13463d = m0Var2;
            this.f13464e = i12;
            this.f13465f = i13;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            aVar2.h(this.f13461b, 0, this.f13462c, 0.0f);
            aVar2.h(this.f13463d, this.f13464e, this.f13465f, 0.0f);
            return Unit.f71690a;
        }
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        float f7;
        float f11;
        float f12;
        int max;
        int d11;
        int i11;
        B1.W z02;
        float f13;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            B1.U u11 = list.get(i12);
            if (Intrinsics.d(androidx.compose.ui.layout.a.a(u11), "action")) {
                long j12 = j11;
                B1.m0 a02 = u11.a0(j12);
                int k11 = Z1.b.k(j12) - a02.u0();
                f7 = J2.f12880e;
                int Y02 = k11 - y11.Y0(f7);
                int m11 = Z1.b.m(j12);
                int i13 = Y02 < m11 ? m11 : Y02;
                int size2 = list.size();
                int i14 = 0;
                while (i14 < size2) {
                    B1.U u12 = list.get(i14);
                    if (Intrinsics.d(androidx.compose.ui.layout.a.a(u12), "text")) {
                        B1.m0 a03 = u12.a0(Z1.b.c(0, i13, 0, 0, 9, j12));
                        int E11 = a03.E(C2533b.a());
                        int E12 = a03.E(C2533b.b());
                        boolean z11 = true;
                        boolean z12 = (E11 == Integer.MIN_VALUE || E12 == Integer.MIN_VALUE) ? false : true;
                        if (E11 != E12 && z12) {
                            z11 = false;
                        }
                        int k12 = Z1.b.k(j11) - a02.u0();
                        if (z11) {
                            f13 = J2.f12881f;
                            max = Math.max(y11.Y0(f13), a02.l0());
                            int d12 = C3354v2.d(max, 2, a03);
                            int E13 = a02.E(C2533b.a());
                            d11 = E13 != Integer.MIN_VALUE ? (E11 + d12) - E13 : 0;
                            i11 = d12;
                        } else {
                            f11 = J2.f12876a;
                            int Y03 = y11.Y0(f11) - E11;
                            f12 = J2.f12882g;
                            max = Math.max(y11.Y0(f12), a03.l0() + Y03);
                            d11 = C3354v2.d(max, 2, a02);
                            i11 = Y03;
                        }
                        z02 = y11.z0(Z1.b.k(j11), max, kotlin.collections.U.c(), new a(a03, i11, a02, k12, d11));
                        return z02;
                    }
                    i14++;
                    j12 = j11;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
