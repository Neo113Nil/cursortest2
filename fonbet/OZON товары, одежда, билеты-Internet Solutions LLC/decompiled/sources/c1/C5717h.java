package c1;

import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5717h {

    /* renamed from: a, reason: collision with root package name */
    private int f56233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f56234b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private int[] f56235c = new int[16];

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private int[] f56236d;

    /* renamed from: e, reason: collision with root package name */
    private int f56237e;

    public C5717h() {
        int[] iArr = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        this.f56236d = iArr;
    }

    private final void d(int i11, int i12) {
        int[] iArr = this.f56234b;
        int[] iArr2 = this.f56235c;
        int[] iArr3 = this.f56236d;
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
        int i14 = iArr2[i11];
        iArr2[i11] = iArr2[i12];
        iArr2[i12] = i14;
        iArr3[iArr2[i11]] = i11;
        iArr3[iArr2[i12]] = i12;
    }

    public final int a(int i11) {
        int i12 = this.f56233a + 1;
        int[] iArr = this.f56234b;
        int length = iArr.length;
        if (i12 > length) {
            int i13 = length * 2;
            int[] iArr2 = new int[i13];
            int[] iArr3 = new int[i13];
            C7705l.t(0, 0, iArr, iArr2, 14);
            C7705l.t(0, 0, this.f56235c, iArr3, 14);
            this.f56234b = iArr2;
            this.f56235c = iArr3;
        }
        int i14 = this.f56233a;
        this.f56233a = i14 + 1;
        int length2 = this.f56236d.length;
        if (this.f56237e >= length2) {
            int i15 = length2 * 2;
            int[] iArr4 = new int[i15];
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i16 + 1;
                iArr4[i16] = i17;
                i16 = i17;
            }
            C7705l.t(0, 0, this.f56236d, iArr4, 14);
            this.f56236d = iArr4;
        }
        int i18 = this.f56237e;
        int[] iArr5 = this.f56236d;
        this.f56237e = iArr5[i18];
        int[] iArr6 = this.f56234b;
        iArr6[i14] = i11;
        this.f56235c[i14] = i18;
        iArr5[i18] = i14;
        int i19 = iArr6[i14];
        while (i14 > 0) {
            int i21 = ((i14 + 1) >> 1) - 1;
            if (iArr6[i21] <= i19) {
                break;
            }
            d(i21, i14);
            i14 = i21;
        }
        return i18;
    }

    public final int b(int i11) {
        return this.f56233a > 0 ? this.f56234b[0] : i11;
    }

    public final void c(int i11) {
        int i12;
        int i13 = this.f56236d[i11];
        d(i13, this.f56233a - 1);
        this.f56233a--;
        int[] iArr = this.f56234b;
        int i14 = iArr[i13];
        int i15 = i13;
        while (i15 > 0) {
            int i16 = ((i15 + 1) >> 1) - 1;
            if (iArr[i16] <= i14) {
                break;
            }
            d(i16, i15);
            i15 = i16;
        }
        int[] iArr2 = this.f56234b;
        int i17 = this.f56233a >> 1;
        while (i13 < i17) {
            int i18 = (i13 + 1) << 1;
            int i19 = i18 - 1;
            if (i18 < this.f56233a && (i12 = iArr2[i18]) < iArr2[i19]) {
                if (i12 >= iArr2[i13]) {
                    break;
                }
                d(i18, i13);
                i13 = i18;
            } else {
                if (iArr2[i19] >= iArr2[i13]) {
                    break;
                }
                d(i19, i13);
                i13 = i19;
            }
        }
        this.f56236d[i11] = this.f56237e;
        this.f56237e = i11;
    }
}
