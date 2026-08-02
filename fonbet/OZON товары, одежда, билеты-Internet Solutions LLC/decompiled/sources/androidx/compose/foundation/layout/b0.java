package androidx.compose.foundation.layout;

import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b0 extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    private float f39465a;

    /* renamed from: b, reason: collision with root package name */
    private float f39466b;

    /* renamed from: c, reason: collision with root package name */
    private float f39467c;

    /* renamed from: d, reason: collision with root package name */
    private float f39468d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39469e;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39470b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f39470b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f39470b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public b0(float f7, float f11, float f12, float f13, boolean z11) {
        this.f39465a = f7;
        this.f39466b = f11;
        this.f39467c = f12;
        this.f39468d = f13;
        this.f39469e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long I1(InterfaceC2553w interfaceC2553w) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (Z1.h.b(this.f39467c, Float.NaN)) {
            i11 = Integer.MAX_VALUE;
        } else {
            i11 = interfaceC2553w.Y0(this.f39467c);
            if (i11 < 0) {
                i11 = 0;
            }
        }
        if (Z1.h.b(this.f39468d, Float.NaN)) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = interfaceC2553w.Y0(this.f39468d);
            if (i12 < 0) {
                i12 = 0;
            }
        }
        if (!Z1.h.b(this.f39465a, Float.NaN)) {
            i13 = interfaceC2553w.Y0(this.f39465a);
            if (i13 > i11) {
                i13 = i11;
            }
            if (i13 < 0) {
                i13 = 0;
            }
        }
        i13 = 0;
        if (!Z1.h.b(this.f39466b, Float.NaN)) {
            int Y02 = interfaceC2553w.Y0(this.f39466b);
            if (Y02 > i12) {
                Y02 = i12;
            }
            if (Y02 < 0) {
                Y02 = 0;
            }
            if (Y02 != Integer.MAX_VALUE) {
                i14 = Y02;
            }
        }
        return Z1.c.a(i13, i11, i14, i12);
    }

    @Override // D1.E
    public final int A(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        long I12 = I1(v11);
        return Z1.b.i(I12) ? Z1.b.k(I12) : Z1.c.h(interfaceC2552v.T(i11), I12);
    }

    @Override // D1.E
    @NotNull
    public final B1.W D(@NotNull B1.Y y11, @NotNull B1.U u11, long j11) {
        int m11;
        int k11;
        int l11;
        int j12;
        long a11;
        B1.W z02;
        long I12 = I1(y11);
        if (this.f39469e) {
            a11 = Z1.c.f(j11, I12);
        } else {
            if (Z1.h.b(this.f39465a, Float.NaN)) {
                m11 = Z1.b.m(j11);
                int k12 = Z1.b.k(I12);
                if (m11 > k12) {
                    m11 = k12;
                }
            } else {
                m11 = Z1.b.m(I12);
            }
            if (Z1.h.b(this.f39467c, Float.NaN)) {
                k11 = Z1.b.k(j11);
                int m12 = Z1.b.m(I12);
                if (k11 < m12) {
                    k11 = m12;
                }
            } else {
                k11 = Z1.b.k(I12);
            }
            if (Z1.h.b(this.f39466b, Float.NaN)) {
                l11 = Z1.b.l(j11);
                int j13 = Z1.b.j(I12);
                if (l11 > j13) {
                    l11 = j13;
                }
            } else {
                l11 = Z1.b.l(I12);
            }
            if (Z1.h.b(this.f39468d, Float.NaN)) {
                j12 = Z1.b.j(j11);
                int l12 = Z1.b.l(I12);
                if (j12 < l12) {
                    j12 = l12;
                }
            } else {
                j12 = Z1.b.j(I12);
            }
            a11 = Z1.c.a(m11, k11, l11, j12);
        }
        m0 a02 = u11.a0(a11);
        z02 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new a(a02));
        return z02;
    }

    @Override // D1.E
    public final int I(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        long I12 = I1(v11);
        return Z1.b.h(I12) ? Z1.b.j(I12) : Z1.c.g(interfaceC2552v.D(i11), I12);
    }

    public final void J1(boolean z11) {
        this.f39469e = z11;
    }

    @Override // D1.E
    public final int K(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        long I12 = I1(v11);
        return Z1.b.h(I12) ? Z1.b.j(I12) : Z1.c.g(interfaceC2552v.O(i11), I12);
    }

    public final void K1(float f7) {
        this.f39468d = f7;
    }

    public final void L1(float f7) {
        this.f39467c = f7;
    }

    public final void M1(float f7) {
        this.f39466b = f7;
    }

    public final void N1(float f7) {
        this.f39465a = f7;
    }

    @Override // D1.E
    public final int u(@NotNull D1.V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        long I12 = I1(v11);
        return Z1.b.i(I12) ? Z1.b.k(I12) : Z1.c.h(interfaceC2552v.Y(i11), I12);
    }
}
