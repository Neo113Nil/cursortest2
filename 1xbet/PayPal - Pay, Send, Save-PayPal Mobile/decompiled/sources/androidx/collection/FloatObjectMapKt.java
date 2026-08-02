package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0015\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0018\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u001b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u001e\u001a\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010!\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\"\u001aI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010#\u001aY\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010$\u001ai\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010%\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"V", "Lkotlin/Function1;", "Landroidx/collection/MutableFloatObjectMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/FloatObjectMap;", "buildFloatObjectMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatObjectMap;", "emptyFloatObjectMap", "()Landroidx/collection/FloatObjectMap;", "floatObjectMapOf", "", "key1", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "mutableFloatObjectMapOf", "()Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableFloatObjectMap;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FloatObjectMapKt {
    private static final androidx.collection.MutableFloatObjectMap getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.MutableFloatObjectMap(0);

    public static final <V> androidx.collection.FloatObjectMap<V> emptyFloatObjectMap() {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableFloatObjectMap, "");
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf() {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableFloatObjectMap, "");
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf(float f, V v) {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf(float f, V v, float f2, V v2) {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3) {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3, float f4, V v4) {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        mutableFloatObjectMap.set(f4, v4);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> floatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3, float f4, V v4, float f5, V v5) {
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        mutableFloatObjectMap.set(f4, v4);
        mutableFloatObjectMap.set(f5, v5);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f, V v) {
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f, V v, float f2, V v2) {
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3) {
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3, float f4, V v4) {
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        mutableFloatObjectMap.set(f4, v4);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f, V v, float f2, V v2, float f3, V v3, float f4, V v4, float f5, V v5) {
        androidx.collection.MutableFloatObjectMap<V> mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f, v);
        mutableFloatObjectMap.set(f2, v2);
        mutableFloatObjectMap.set(f3, v3);
        mutableFloatObjectMap.set(f4, v4);
        mutableFloatObjectMap.set(f5, v5);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> buildFloatObjectMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatObjectMap<V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(0, 1, null);
        function1.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }

    public static final <V> androidx.collection.FloatObjectMap<V> buildFloatObjectMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableFloatObjectMap<V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableFloatObjectMap mutableFloatObjectMap = new androidx.collection.MutableFloatObjectMap(i);
        function1.invoke(mutableFloatObjectMap);
        return mutableFloatObjectMap;
    }
}
