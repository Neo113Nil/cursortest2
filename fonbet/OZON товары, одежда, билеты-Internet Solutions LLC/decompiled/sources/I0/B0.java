package I0;

import B0.EnumC2526y0;
import I0.C3220z;
import java.util.List;
import k1.C7459e;
import k1.C7460f;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C7460f f11298a = new C7460f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11299a;

        static {
            int[] iArr = new int[EnumC2526y0.values().length];
            try {
                iArr[EnumC2526y0.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2526y0.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2526y0.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11299a = iArr;
        }
    }

    public static final long b(@NotNull C3215w0 c3215w0, long j11) {
        C3220z x11 = c3215w0.x();
        if (x11 == null) {
            return 9205357640488583168L;
        }
        EnumC2526y0 r11 = c3215w0.r();
        int i11 = r11 == null ? -1 : a.f11299a[r11.ordinal()];
        if (i11 == -1) {
            return 9205357640488583168L;
        }
        if (i11 == 1) {
            return d(c3215w0, j11, x11.d());
        }
        if (i11 == 2) {
            return d(c3215w0, j11, x11.b());
        }
        if (i11 != 3) {
            throw new Sc.o();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor");
    }

    public static final boolean c(long j11, @NotNull C7460f c7460f) {
        float n11 = c7460f.n();
        float o11 = c7460f.o();
        float g10 = C7459e.g(j11);
        if (n11 > g10 || g10 > o11) {
            return false;
        }
        float q11 = c7460f.q();
        float h11 = c7460f.h();
        float h12 = C7459e.h(j11);
        return q11 <= h12 && h12 <= h11;
    }

    private static final long d(C3215w0 c3215w0, long j11, C3220z.a aVar) {
        B1.B n11;
        B1.B v11;
        int c11;
        float d11;
        InterfaceC3216x m11 = c3215w0.m(aVar);
        if (m11 == null || (n11 = c3215w0.n()) == null || (v11 = m11.v()) == null || (c11 = aVar.c()) > m11.e()) {
            return 9205357640488583168L;
        }
        C7459e o11 = c3215w0.o();
        Intrinsics.f(o11);
        float g10 = C7459e.g(v11.W(n11, o11.n()));
        long j12 = m11.j(c11);
        if (K1.Q.e(j12)) {
            d11 = m11.b(c11);
        } else {
            float b11 = m11.b((int) (j12 >> 32));
            float d12 = m11.d(((int) (j12 & 4294967295L)) - 1);
            d11 = kotlin.ranges.h.d(g10, Math.min(b11, d12), Math.max(b11, d12));
        }
        if (d11 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!Z1.q.c(j11, 0L) && Math.abs(g10 - d11) > ((int) (j11 >> 32)) / 2) {
            return 9205357640488583168L;
        }
        float f7 = m11.f(c11);
        if (f7 == -1.0f) {
            return 9205357640488583168L;
        }
        return n11.W(v11, P9.a.a(d11, f7));
    }

    @NotNull
    public static final C7460f e(@NotNull List<? extends Pair<? extends InterfaceC3216x, C3220z>> list, @NotNull B1.B b11) {
        C7460f c7460f;
        int i11;
        B1.B v11;
        int[] iArr;
        boolean isEmpty = list.isEmpty();
        C7460f c7460f2 = f11298a;
        if (isEmpty) {
            return c7460f2;
        }
        float b12 = c7460f2.b();
        float c11 = c7460f2.c();
        float d11 = c7460f2.d();
        float e11 = c7460f2.e();
        int size = list.size();
        char c12 = 0;
        int i12 = 0;
        while (i12 < size) {
            Pair<? extends InterfaceC3216x, C3220z> pair = list.get(i12);
            InterfaceC3216x a11 = pair.a();
            C3220z b13 = pair.b();
            int c13 = b13.d().c();
            int c14 = b13.b().c();
            if (c13 == c14 || (v11 = a11.v()) == null) {
                c7460f = c7460f2;
                i11 = size;
            } else {
                int min = Math.min(c13, c14);
                int max = Math.max(c13, c14) - 1;
                if (min == max) {
                    iArr = new int[1];
                    iArr[c12] = min;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c12] = min;
                    iArr2[1] = max;
                    iArr = iArr2;
                }
                float b14 = c7460f2.b();
                float c15 = c7460f2.c();
                float d12 = c7460f2.d();
                float e12 = c7460f2.e();
                int length = iArr.length;
                c7460f = c7460f2;
                float f7 = e12;
                i11 = size;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13;
                    C7460f g10 = a11.g(iArr[i14]);
                    b14 = Math.min(b14, g10.n());
                    c15 = Math.min(c15, g10.q());
                    d12 = Math.max(d12, g10.o());
                    f7 = Math.max(f7, g10.h());
                    i13 = i14 + 1;
                }
                long a12 = P9.a.a(b14, c15);
                long a13 = P9.a.a(d12, f7);
                long W11 = b11.W(v11, a12);
                long W12 = b11.W(v11, a13);
                b12 = Math.min(b12, C7459e.g(W11));
                float min2 = Math.min(c11, C7459e.h(W11));
                float max2 = Math.max(d11, C7459e.g(W12));
                e11 = Math.max(e11, C7459e.h(W12));
                d11 = max2;
                c11 = min2;
            }
            i12++;
            c7460f2 = c7460f;
            size = i11;
            c12 = 0;
        }
        return new C7460f(b12, c11, d11, e11);
    }

    @NotNull
    public static final C7460f f(@NotNull B1.B b11) {
        C7460f b12 = B1.C.b(b11);
        long L11 = b11.L(b12.s());
        long L12 = b11.L(b12.k());
        return new C7460f(C7459e.g(L11), C7459e.h(L11), C7459e.g(L12), C7459e.h(L12));
    }
}
