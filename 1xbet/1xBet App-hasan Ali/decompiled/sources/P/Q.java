package P;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public int[] f4388a;

    /* renamed from: b, reason: collision with root package name */
    public int f4389b;

    public Q() {
        this.f4388a = new int[10];
    }

    public int a(int i) {
        int i5 = this.f4389b - 1;
        return i5 >= 0 ? this.f4388a[i5] : i;
    }

    public int b() {
        int[] iArr = this.f4388a;
        int i = this.f4389b - 1;
        this.f4389b = i;
        return iArr[i];
    }

    public void c(int i) {
        int[] iArr = this.f4388a;
        if (this.f4389b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", iArr);
            this.f4388a = iArr;
        }
        int i5 = this.f4389b;
        this.f4389b = i5 + 1;
        iArr[i5] = i;
    }

    public void d(int i, int i5, int i6) {
        int i7 = this.f4389b;
        int[] iArr = this.f4388a;
        int i8 = i7 + 3;
        if (i8 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", iArr);
            this.f4388a = iArr;
        }
        iArr[i7] = i + i6;
        iArr[i7 + 1] = i5 + i6;
        iArr[i7 + 2] = i6;
        this.f4389b = i8;
    }

    public void e(int i, int i5, int i6, int i7) {
        int i8 = this.f4389b;
        int[] iArr = this.f4388a;
        int i9 = i8 + 4;
        if (i9 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            kotlin.jvm.internal.l.e("copyOf(...)", iArr);
            this.f4388a = iArr;
        }
        iArr[i8] = i;
        iArr[i8 + 1] = i5;
        iArr[i8 + 2] = i6;
        iArr[i8 + 3] = i7;
        this.f4389b = i9;
    }

    public void f(int i, int i5) {
        if (i < i5) {
            int i6 = i - 3;
            for (int i7 = i; i7 < i5; i7 += 3) {
                int[] iArr = this.f4388a;
                int i8 = iArr[i7];
                int i9 = iArr[i5];
                if (i8 < i9 || (i8 == i9 && iArr[i7 + 1] <= iArr[i5 + 1])) {
                    i6 += 3;
                    g(i6, i7);
                }
            }
            g(i6 + 3, i5);
            f(i, i6);
            f(i6 + 6, i5);
        }
    }

    public void g(int i, int i5) {
        int[] iArr = this.f4388a;
        int i6 = iArr[i];
        iArr[i] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 1;
        int i8 = i5 + 1;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
        int i10 = i + 2;
        int i11 = i5 + 2;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }

    public Q(int i) {
        this.f4388a = new int[i];
    }
}
