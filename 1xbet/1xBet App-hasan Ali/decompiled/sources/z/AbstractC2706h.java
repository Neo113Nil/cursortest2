package z;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2706h {

    /* renamed from: a, reason: collision with root package name */
    public static final C2700b f21534a = new C2700b(3);

    /* renamed from: b, reason: collision with root package name */
    public static final C2700b f21535b = new C2700b(4);

    /* renamed from: c, reason: collision with root package name */
    public static final O3.m f21536c = new O3.m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final O3.m f21537d = new O3.m(4);

    /* renamed from: e, reason: collision with root package name */
    public static final O3.m f21538e = new O3.m(3);

    static {
        new O3.m(2);
    }

    public static void a(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float f = (i - i6) / 2;
        if (!z3) {
            int length = iArr.length;
            int i8 = 0;
            while (i5 < length) {
                int i9 = iArr[i5];
                iArr2[i8] = Math.round(f);
                f += i9;
                i5++;
                i8++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i10 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i10;
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z3) {
        int i = 0;
        if (!z3) {
            int length = iArr.length;
            int i5 = 0;
            int i6 = 0;
            while (i < length) {
                int i7 = iArr[i];
                iArr2[i5] = i6;
                i6 += i7;
                i++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i8 = iArr[length2];
            iArr2[length2] = i;
            i += i8;
        }
    }

    public static void c(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        int i8 = i - i6;
        if (!z3) {
            int length = iArr.length;
            int i9 = 0;
            while (i5 < length) {
                int i10 = iArr[i5];
                iArr2[i9] = i8;
                i8 += i10;
                i5++;
                i9++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i11 = iArr[length2];
            iArr2[length2] = i8;
            i8 += i11;
        }
    }

    public static void d(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i6) / iArr.length;
        float f = length / 2;
        if (!z3) {
            int length2 = iArr.length;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                iArr2[i8] = Math.round(f);
                f += i9 + length;
                i5++;
                i8++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i10 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i10 + length;
        }
    }

    public static void e(int i, int[] iArr, int[] iArr2, boolean z3) {
        if (iArr.length == 0) {
            return;
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float max = (i - i6) / Math.max(iArr.length - 1, 1);
        float f = (z3 && iArr.length == 1) ? max : 0.0f;
        if (z3) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i8 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i8 + max;
            }
            return;
        }
        int length2 = iArr.length;
        int i9 = 0;
        while (i5 < length2) {
            int i10 = iArr[i5];
            iArr2[i9] = Math.round(f);
            f += i10 + max;
            i5++;
            i9++;
        }
    }

    public static void f(int i, int[] iArr, int[] iArr2, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 : iArr) {
            i6 += i7;
        }
        float length = (i - i6) / (iArr.length + 1);
        if (z3) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i8 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f5 = length;
        int i9 = 0;
        while (i5 < length3) {
            int i10 = iArr[i5];
            iArr2[i9] = Math.round(f5);
            f5 += i10 + length;
            i5++;
            i9++;
        }
    }
}
