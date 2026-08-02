package u;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2462i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19819a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48};

    public static boolean a(InterfaceC2461h interfaceC2461h, long j5) {
        return j5 >= interfaceC2461h.d();
    }

    public static /* synthetic */ int b(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] c(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f19819a, 0, iArr, 0, i);
        return iArr;
    }
}
