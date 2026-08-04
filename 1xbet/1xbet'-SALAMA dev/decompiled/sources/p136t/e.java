package p136t;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16254a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    public static /* synthetic */ int a(int i7, int i8) {
        if (i7 == 0 || i8 == 0) {
            throw null;
        }
        return i7 - i8;
    }

    public static /* synthetic */ boolean b(int i7, int i8) {
        if (i7 != 0) {
            return i7 == i8;
        }
        throw null;
    }

    public static StringBuilder c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ int e(int i7) {
        if (i7 != 0) {
            return i7 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] f(int i7) {
        int[] iArr = new int[i7];
        System.arraycopy(f16254a, 0, iArr, 0, i7);
        return iArr;
    }
}
