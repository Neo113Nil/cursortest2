package androidx.core.content.res;

/* loaded from: classes3.dex */
final class GrowingArrayUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    public static <T> T[] getHighSpeedVideoSizes(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            ?? r0 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i <= 4 ? 8 : i * 2);
            java.lang.System.arraycopy(tArr, 0, r0, 0, i);
            tArr = r0;
        }
        tArr[i] = t;
        return tArr;
    }

    public static int[] getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[i <= 4 ? 8 : i * 2];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    private GrowingArrayUtils() {
    }
}
