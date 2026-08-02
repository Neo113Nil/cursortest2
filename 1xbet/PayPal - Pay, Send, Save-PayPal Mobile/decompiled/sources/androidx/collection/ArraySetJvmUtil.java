package androidx.collection;

/* loaded from: classes3.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    static <T> T[] getHighSpeedVideoFpsRanges(T[] tArr, int i) {
        if (tArr.length < i) {
            return (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
