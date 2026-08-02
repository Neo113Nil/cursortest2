package androidx.collection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0012\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0015\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u0018\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u001b\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\r\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010!\u001a-\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\"\u001a=\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010#\u001aM\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010$\u001a]\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010%\"\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatLongMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/FloatLongMap;", "buildFloatLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "()Landroidx/collection/FloatLongMap;", "floatLongMapOf", "", "key1", "", "value1", "(FJ)Landroidx/collection/FloatLongMap;", "key2", "value2", "(FJFJ)Landroidx/collection/FloatLongMap;", "key3", "value3", "(FJFJFJ)Landroidx/collection/FloatLongMap;", "key4", "value4", "(FJFJFJFJ)Landroidx/collection/FloatLongMap;", "key5", "value5", "(FJFJFJFJFJ)Landroidx/collection/FloatLongMap;", "mutableFloatLongMapOf", "()Landroidx/collection/MutableFloatLongMap;", "(FJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableFloatLongMap;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatLongMapKt {
    private static final androidx.collection.MutableFloatLongMap getHighSpeedVideoFpsRanges = new androidx.collection.MutableFloatLongMap(0);

    public static final androidx.collection.FloatLongMap emptyFloatLongMap() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf(float f, long j) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf(float f, long j, float f2, long j2) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf() {
        return new androidx.collection.MutableFloatLongMap(0, 1, null);
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf(float f, long j) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap buildFloatLongMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatLongMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(0, 1, null);
        function1.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    public static final androidx.collection.FloatLongMap buildFloatLongMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatLongMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatLongMap mutableFloatLongMap = new androidx.collection.MutableFloatLongMap(i);
        function1.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }
}
