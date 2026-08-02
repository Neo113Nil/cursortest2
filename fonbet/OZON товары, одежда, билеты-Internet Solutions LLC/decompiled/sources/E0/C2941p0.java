package E0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.p0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2941p0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f7280a = new int[30];

    /* renamed from: b, reason: collision with root package name */
    private int f7281b;

    private final long a(int i11, boolean z11) {
        int i12;
        int i13;
        int i14 = -1;
        int[] iArr = this.f7280a;
        int i15 = this.f7281b;
        if (i15 < 0) {
            i12 = i11;
            i13 = i12;
        } else if (z11) {
            i13 = i11;
            int i16 = 0;
            i12 = i13;
            while (i16 < i15) {
                int i17 = i16 * 3;
                int i18 = iArr[i17];
                int i19 = iArr[i17 + 1];
                int i21 = iArr[i17 + 2];
                long d11 = d(i12, i18, i19, i21, z11);
                long d12 = d(i13, i18, i19, i21, z11);
                int i22 = K1.Q.f15010c;
                int min = Math.min((int) (d11 >> 32), (int) (d12 >> 32));
                i13 = Math.max((int) (d11 & 4294967295L), (int) (d12 & 4294967295L));
                i16++;
                i12 = min;
            }
        } else {
            int i23 = i11;
            int i24 = i15 - 1;
            int i25 = i23;
            while (i14 < i24) {
                int i26 = i24 * 3;
                int i27 = iArr[i26];
                int i28 = iArr[i26 + 1];
                int i29 = iArr[i26 + 2];
                long d13 = d(i25, i27, i28, i29, z11);
                long d14 = d(i23, i27, i28, i29, z11);
                int i31 = K1.Q.f15010c;
                int i32 = i14;
                i25 = Math.min((int) (d13 >> 32), (int) (d14 >> 32));
                i23 = Math.max((int) (d13 & 4294967295L), (int) (d14 & 4294967295L));
                i24 += i32;
                i14 = i32;
                iArr = iArr;
            }
            i12 = i25;
            i13 = i23;
        }
        return K1.S.a(i12, i13);
    }

    private static long d(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = z11 ? i13 : i14;
        if (z11) {
            i13 = i14;
        }
        if (i11 < i12) {
            return K1.S.a(i11, i11);
        }
        if (i11 == i12) {
            return i15 == 0 ? K1.S.a(i12, i13 + i12) : K1.S.a(i12, i12);
        }
        if (i11 < i12 + i15) {
            return i13 == 0 ? K1.S.a(i12, i12) : K1.S.a(i12, i13 + i12);
        }
        int i16 = (i11 - i15) + i13;
        return K1.S.a(i16, i16);
    }

    public final long b(int i11) {
        return a(i11, false);
    }

    public final long c(int i11) {
        return a(i11, true);
    }

    public final void e(int i11, int i12, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i13, "Expected newLen to be ≥ 0, was ").toString());
        }
        int min = Math.min(i11, i12);
        int max = Math.max(min, i12) - min;
        if (max >= 2 || max != i13) {
            int i14 = this.f7281b + 1;
            int[] iArr = this.f7280a;
            if (i14 > iArr.length / 3) {
                int[] copyOf = Arrays.copyOf(this.f7280a, Math.max(i14 * 2, (iArr.length / 3) * 2) * 3);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.f7280a = copyOf;
            }
            int[] iArr2 = this.f7280a;
            int i15 = this.f7281b * 3;
            iArr2[i15] = min;
            iArr2[i15 + 1] = max;
            iArr2[i15 + 2] = i13;
            this.f7281b = i14;
        }
    }
}
