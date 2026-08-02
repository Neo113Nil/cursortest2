package androidx.collection;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0013\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0016\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0019\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u001c\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u001f\u001a\u0019\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b \u0010\r\u001a)\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b!\u0010\"\u001a9\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b!\u0010#\u001aI\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b!\u0010$\u001aY\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b!\u0010%\u001ai\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b!\u0010&\"\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "Lkotlin/Function1;", "Landroidx/collection/MutableObjectFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/ObjectFloatMap;", "buildObjectFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectFloatMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectFloatMap;", "emptyObjectFloatMap", "()Landroidx/collection/ObjectFloatMap;", "mutableObjectFloatMapOf", "()Landroidx/collection/MutableObjectFloatMap;", "key1", "", "value1", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "", "getHighSpeedVideoSizes", "Landroidx/collection/MutableObjectFloatMap;", "Camera2StreamConfigurationMap"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectFloatMapKt {
    private static final androidx.collection.MutableObjectFloatMap<java.lang.Object> getHighSpeedVideoSizes = new androidx.collection.MutableObjectFloatMap<>(0);

    public static final <K> androidx.collection.ObjectFloatMap<K> emptyObjectFloatMap() {
        androidx.collection.MutableObjectFloatMap<java.lang.Object> mutableObjectFloatMap = getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectFloatMap, "");
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMap() {
        androidx.collection.MutableObjectFloatMap<java.lang.Object> mutableObjectFloatMap = getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectFloatMap, "");
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K k, float f) {
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2) {
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3) {
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4) {
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> objectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f) {
        androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2) {
        androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3) {
        androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4) {
        androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k, float f, K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        androidx.collection.MutableObjectFloatMap<K> mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k, f);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> buildObjectFloatMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectFloatMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(0, 1, null);
        function1.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }

    public static final <K> androidx.collection.ObjectFloatMap<K> buildObjectFloatMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectFloatMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectFloatMap mutableObjectFloatMap = new androidx.collection.MutableObjectFloatMap(i);
        function1.invoke(mutableObjectFloatMap);
        return mutableObjectFloatMap;
    }
}
