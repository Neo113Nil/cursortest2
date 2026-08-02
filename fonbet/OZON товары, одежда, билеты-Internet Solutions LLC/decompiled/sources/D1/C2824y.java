package D1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2824y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private int[] f5573a;

    /* renamed from: b, reason: collision with root package name */
    private int f5574b;

    public C2824y(int i11) {
        this.f5573a = new int[i11];
    }

    private final void g(int i11, int i12) {
        if (i11 < i12) {
            int i13 = i11 - 3;
            for (int i14 = i11; i14 < i12; i14 += 3) {
                int[] iArr = this.f5573a;
                int i15 = iArr[i14];
                int i16 = iArr[i12];
                if (i15 < i16 || (i15 == i16 && iArr[i14 + 1] <= iArr[i12 + 1])) {
                    i13 += 3;
                    i(i13, i14);
                }
            }
            i(i13 + 3, i12);
            g(i11, i13);
            g(i13 + 6, i12);
        }
    }

    private final void i(int i11, int i12) {
        int[] iArr = this.f5573a;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = i11 + 1;
        int i15 = i12 + 1;
        int i16 = iArr[i14];
        iArr[i14] = iArr[i15];
        iArr[i15] = i16;
        int i17 = i11 + 2;
        int i18 = i12 + 2;
        int i19 = iArr[i17];
        iArr[i17] = iArr[i18];
        iArr[i18] = i19;
    }

    public final int a(int i11) {
        return this.f5573a[i11];
    }

    public final int b() {
        return this.f5574b;
    }

    public final boolean c() {
        return this.f5574b != 0;
    }

    public final int d() {
        int[] iArr = this.f5573a;
        int i11 = this.f5574b - 1;
        this.f5574b = i11;
        return iArr[i11];
    }

    public final void e(int i11, int i12, int i13) {
        int i14 = this.f5574b;
        int i15 = i14 + 3;
        int[] iArr = this.f5573a;
        if (i15 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f5573a = copyOf;
        }
        int[] iArr2 = this.f5573a;
        iArr2[i14] = i11 + i13;
        iArr2[i14 + 1] = i12 + i13;
        iArr2[i14 + 2] = i13;
        this.f5574b = i15;
    }

    public final void f(int i11, int i12, int i13, int i14) {
        int i15 = this.f5574b;
        int i16 = i15 + 4;
        int[] iArr = this.f5573a;
        if (i16 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f5573a = copyOf;
        }
        int[] iArr2 = this.f5573a;
        iArr2[i15] = i11;
        iArr2[i15 + 1] = i12;
        iArr2[i15 + 2] = i13;
        iArr2[i15 + 3] = i14;
        this.f5574b = i16;
    }

    public final void h() {
        int i11 = this.f5574b;
        if (i11 % 3 != 0) {
            A1.a.b("Array size not a multiple of 3");
            throw null;
        }
        if (i11 > 3) {
            g(0, i11 - 3);
        }
    }
}
