package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0013\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0016\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0019\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u001c\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u001f\u001a\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b \u0010\r\u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"\u001a9\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b!\u0010#\u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b!\u0010$\u001aY\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b!\u0010%\u001ai\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b!\u0010&\"\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "Lkotlin/Function1;", "Landroidx/collection/MutableObjectLongMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/ObjectLongMap;", "buildObjectLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectLongMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectLongMap;", "emptyObjectLongMap", "()Landroidx/collection/ObjectLongMap;", "mutableObjectLongMapOf", "()Landroidx/collection/MutableObjectLongMap;", "key1", "", "value1", "(Ljava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key2", "value2", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key3", "value3", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key4", "value4", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "key5", "value5", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/MutableObjectLongMap;", "objectLongMap", "objectLongMapOf", "(Ljava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "(Ljava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;JLjava/lang/Object;J)Landroidx/collection/ObjectLongMap;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableObjectLongMap;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ObjectLongMapKt {
    private static final androidx.collection.MutableObjectLongMap<java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.MutableObjectLongMap<>(0);

    public static final <K> androidx.collection.ObjectLongMap<K> emptyObjectLongMap() {
        androidx.collection.MutableObjectLongMap<java.lang.Object> mutableObjectLongMap = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectLongMap, "");
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMap() {
        androidx.collection.MutableObjectLongMap<java.lang.Object> mutableObjectLongMap = getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectLongMap, "");
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K k, long j) {
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k, j);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K k, long j, K k2, long j2) {
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K k, long j, K k2, long j2, K k3, long j3) {
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K k, long j, K k2, long j2, K k3, long j3, K k4, long j4) {
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        mutableObjectLongMap.set(k4, j4);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> objectLongMapOf(K k, long j, K k2, long j2, K k3, long j3, K k4, long j4, K k5, long j5) {
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        mutableObjectLongMap.set(k4, j4);
        mutableObjectLongMap.set(k5, j5);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf() {
        return new androidx.collection.MutableObjectLongMap<>(0, 1, null);
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K k, long j) {
        androidx.collection.MutableObjectLongMap<K> mutableObjectLongMap = new androidx.collection.MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k, j);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K k, long j, K k2, long j2) {
        androidx.collection.MutableObjectLongMap<K> mutableObjectLongMap = new androidx.collection.MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K k, long j, K k2, long j2, K k3, long j3) {
        androidx.collection.MutableObjectLongMap<K> mutableObjectLongMap = new androidx.collection.MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K k, long j, K k2, long j2, K k3, long j3, K k4, long j4) {
        androidx.collection.MutableObjectLongMap<K> mutableObjectLongMap = new androidx.collection.MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        mutableObjectLongMap.set(k4, j4);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.MutableObjectLongMap<K> mutableObjectLongMapOf(K k, long j, K k2, long j2, K k3, long j3, K k4, long j4, K k5, long j5) {
        androidx.collection.MutableObjectLongMap<K> mutableObjectLongMap = new androidx.collection.MutableObjectLongMap<>(0, 1, null);
        mutableObjectLongMap.set(k, j);
        mutableObjectLongMap.set(k2, j2);
        mutableObjectLongMap.set(k3, j3);
        mutableObjectLongMap.set(k4, j4);
        mutableObjectLongMap.set(k5, j5);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> buildObjectLongMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectLongMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(0, 1, null);
        function1.invoke(mutableObjectLongMap);
        return mutableObjectLongMap;
    }

    public static final <K> androidx.collection.ObjectLongMap<K> buildObjectLongMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectLongMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectLongMap mutableObjectLongMap = new androidx.collection.MutableObjectLongMap(i);
        function1.invoke(mutableObjectLongMap);
        return mutableObjectLongMap;
    }
}
