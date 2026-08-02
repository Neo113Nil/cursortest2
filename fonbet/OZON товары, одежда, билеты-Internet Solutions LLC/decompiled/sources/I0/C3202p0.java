package I0;

import I0.C3220z;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3202p0 {

    /* renamed from: I0.p0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11581a;

        static {
            int[] iArr = new int[EnumC3197n.values().length];
            try {
                iArr[EnumC3197n.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3197n.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3197n.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11581a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final V1.g b(K1.K k11, int i11) {
        if (k11.k().j().length() != 0) {
            int p11 = k11.p(i11);
            if ((i11 != 0 && p11 == k11.p(i11 - 1)) || (i11 != k11.k().j().length() && p11 == k11.p(i11 + 1))) {
                return k11.c(i11);
            }
        }
        return k11.x(i11);
    }

    @NotNull
    public static final InterfaceC3198n0 c(@NotNull K1.K k11, int i11, int i12, int i13, long j11, boolean z11, boolean z12) {
        C3220z c3220z;
        if (z11) {
            c3220z = null;
        } else {
            int i14 = K1.Q.f15010c;
            int i15 = (int) (j11 >> 32);
            int i16 = (int) (4294967295L & j11);
            c3220z = new C3220z(new C3220z.a(b(k11, i15), i15, 1L), new C3220z.a(b(k11, i16), i16, 1L), K1.Q.i(j11));
        }
        return new S0(z12, 1, 1, c3220z, new C3218y(1L, 1, i11, i12, i13, k11));
    }

    @NotNull
    public static final EnumC3197n d(@NotNull EnumC3197n enumC3197n, @NotNull EnumC3197n enumC3197n2) {
        int[] iArr = a.f11581a;
        int i11 = iArr[enumC3197n2.ordinal()];
        if (i11 == 1) {
            return EnumC3197n.BEFORE;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                return EnumC3197n.AFTER;
            }
            throw new Sc.o();
        }
        int i12 = iArr[enumC3197n.ordinal()];
        if (i12 == 1) {
            return EnumC3197n.BEFORE;
        }
        if (i12 == 2) {
            return EnumC3197n.ON;
        }
        if (i12 == 3) {
            return EnumC3197n.AFTER;
        }
        throw new Sc.o();
    }
}
