package F0;

import B0.C2459b1;
import E0.C2948t0;
import E0.EnumC2911a0;
import E0.c1;
import E0.g1;
import K1.Q;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class O {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8211a;

        static {
            int[] iArr = new int[EnumC2911a0.values().length];
            try {
                iArr[EnumC2911a0.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2911a0.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2911a0.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2911a0.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f8211a = iArr;
        }
    }

    public static final int a(@NotNull String str, int i11, boolean z11, @NotNull c1 c1Var) {
        int a11 = z11 ? C2459b1.a(i11, str) : C2459b1.b(i11, str);
        if (a11 == -1) {
            return i11;
        }
        long l11 = c1Var.l(a11);
        long n11 = c1Var.n(l11);
        int i12 = a.f8211a[((Q.e(l11) && Q.e(n11)) ? EnumC2911a0.Untransformed : (Q.e(l11) || Q.e(n11)) ? (!Q.e(l11) || Q.e(n11)) ? EnumC2911a0.Deletion : EnumC2911a0.Insertion : EnumC2911a0.Replacement).ordinal()];
        if (i12 == 1 || i12 == 2) {
            return a11;
        }
        if (i12 == 3) {
            return z11 ? (int) (n11 & 4294967295L) : (int) (n11 >> 32);
        }
        if (i12 != 4) {
            throw new Sc.o();
        }
        if (z11) {
            if (a11 == ((int) (n11 >> 32))) {
                c1Var.v(new C2948t0(g1.Start));
                return a11;
            }
            c1Var.v(new C2948t0(g1.End));
            return i11;
        }
        if (a11 == ((int) (n11 & 4294967295L))) {
            c1Var.v(new C2948t0(g1.End));
            return a11;
        }
        c1Var.v(new C2948t0(g1.Start));
        return i11;
    }
}
