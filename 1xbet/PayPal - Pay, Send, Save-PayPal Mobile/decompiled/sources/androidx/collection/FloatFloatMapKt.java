package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0019\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u0011\u001a-\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u0014\u001a=\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u0017\u001aM\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001a\u001a]\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\r\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010 \u001a-\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010!\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\"\u001aM\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010#\u001a]\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010$\"\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/FloatFloatMap;", "buildFloatFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "emptyFloatFloatMap", "()Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "", "key1", "value1", "(FF)Landroidx/collection/FloatFloatMap;", "key2", "value2", "(FFFF)Landroidx/collection/FloatFloatMap;", "key3", "value3", "(FFFFFF)Landroidx/collection/FloatFloatMap;", "key4", "value4", "(FFFFFFFF)Landroidx/collection/FloatFloatMap;", "key5", "value5", "(FFFFFFFFFF)Landroidx/collection/FloatFloatMap;", "mutableFloatFloatMapOf", "()Landroidx/collection/MutableFloatFloatMap;", "(FF)Landroidx/collection/MutableFloatFloatMap;", "(FFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableFloatFloatMap;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatFloatMapKt {
    private static final androidx.collection.MutableFloatFloatMap getHighSpeedVideoFpsRangesFor = new androidx.collection.MutableFloatFloatMap(0);

    public static final androidx.collection.FloatFloatMap emptyFloatFloatMap() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float f, float f2) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new androidx.collection.MutableFloatFloatMap(0, 1, null);
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap buildFloatFloatMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(0, 1, null);
        function1.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final androidx.collection.FloatFloatMap buildFloatFloatMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatFloatMap, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatFloatMap mutableFloatFloatMap = new androidx.collection.MutableFloatFloatMap(i);
        function1.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }
}
