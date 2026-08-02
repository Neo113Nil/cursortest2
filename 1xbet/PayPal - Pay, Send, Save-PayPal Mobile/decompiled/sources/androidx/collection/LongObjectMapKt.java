package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u0001\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0012\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0015\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0018\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u001b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u001e\u001a\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010!\u001a9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010\"\u001aI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010#\u001aY\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010$\u001ai\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010%\"\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"V", "Lkotlin/Function1;", "Landroidx/collection/MutableLongObjectMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/LongObjectMap;", "buildLongObjectMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongObjectMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongObjectMap;", "emptyLongObjectMap", "()Landroidx/collection/LongObjectMap;", "longObjectMapOf", "", "key1", "value1", "(JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key2", "value2", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key3", "value3", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key4", "value4", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "key5", "value5", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/LongObjectMap;", "mutableLongObjectMapOf", "()Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "(JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;)Landroidx/collection/MutableLongObjectMap;", "", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableLongObjectMap;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LongObjectMapKt {
    private static final androidx.collection.MutableLongObjectMap getHighSpeedVideoFpsRanges = new androidx.collection.MutableLongObjectMap(0);

    public static final <V> androidx.collection.LongObjectMap<V> emptyLongObjectMap() {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableLongObjectMap, "");
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf() {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableLongObjectMap, "");
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long j, V v) {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j, v);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long j, V v, long j2, V v2) {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long j, V v, long j2, V v2, long j3, V v3) {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long j, V v, long j2, V v2, long j3, V v3, long j4, V v4) {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> longObjectMapOf(long j, V v, long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5) {
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new androidx.collection.MutableLongObjectMap<>(0, 1, null);
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long j, V v) {
        androidx.collection.MutableLongObjectMap<V> mutableLongObjectMap = new androidx.collection.MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j, v);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long j, V v, long j2, V v2) {
        androidx.collection.MutableLongObjectMap<V> mutableLongObjectMap = new androidx.collection.MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long j, V v, long j2, V v2, long j3, V v3) {
        androidx.collection.MutableLongObjectMap<V> mutableLongObjectMap = new androidx.collection.MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long j, V v, long j2, V v2, long j3, V v3, long j4, V v4) {
        androidx.collection.MutableLongObjectMap<V> mutableLongObjectMap = new androidx.collection.MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.MutableLongObjectMap<V> mutableLongObjectMapOf(long j, V v, long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5) {
        androidx.collection.MutableLongObjectMap<V> mutableLongObjectMap = new androidx.collection.MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j, v);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> buildLongObjectMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongObjectMap<V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(0, 1, null);
        function1.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }

    public static final <V> androidx.collection.LongObjectMap<V> buildLongObjectMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableLongObjectMap<V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableLongObjectMap mutableLongObjectMap = new androidx.collection.MutableLongObjectMap(i);
        function1.invoke(mutableLongObjectMap);
        return mutableLongObjectMap;
    }
}
