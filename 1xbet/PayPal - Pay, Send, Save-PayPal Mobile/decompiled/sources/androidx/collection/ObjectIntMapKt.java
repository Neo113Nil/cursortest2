package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001aS\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001d\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0012\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0015\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u0018\u001aY\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u001b\u001ai\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u001e\u001a\u0019\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u001f\u0010\r\u001a)\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b \u0010!\u001a9\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b \u0010\"\u001aI\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b \u0010#\u001aY\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b \u0010$\u001ai\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b \u0010%\"\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"K", "Lkotlin/Function1;", "Landroidx/collection/MutableObjectIntMap;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Landroidx/collection/ObjectIntMap;", "buildObjectIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectIntMap;", "", "initialCapacity", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/ObjectIntMap;", "emptyObjectIntMap", "()Landroidx/collection/ObjectIntMap;", "mutableObjectIntMapOf", "()Landroidx/collection/MutableObjectIntMap;", "key1", "value1", "(Ljava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key2", "value2", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key3", "value3", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key4", "value4", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "key5", "value5", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/MutableObjectIntMap;", "objectIntMap", "objectIntMapOf", "(Ljava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;I)Landroidx/collection/ObjectIntMap;", "", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableObjectIntMap;", "getHighSpeedVideoSizes"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ObjectIntMapKt {
    private static final androidx.collection.MutableObjectIntMap<java.lang.Object> Camera2StreamConfigurationMap = new androidx.collection.MutableObjectIntMap<>(0);

    public static final <K> androidx.collection.ObjectIntMap<K> emptyObjectIntMap() {
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectIntMap, "");
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMap() {
        androidx.collection.MutableObjectIntMap<java.lang.Object> mutableObjectIntMap = Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutableObjectIntMap, "");
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMapOf(K k, int i) {
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2) {
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3) {
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4) {
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> objectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4, K k5, int i5) {
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        mutableObjectIntMap.set(k5, i5);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf() {
        return new androidx.collection.MutableObjectIntMap<>(0, 1, null);
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i) {
        androidx.collection.MutableObjectIntMap<K> mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2) {
        androidx.collection.MutableObjectIntMap<K> mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3) {
        androidx.collection.MutableObjectIntMap<K> mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4) {
        androidx.collection.MutableObjectIntMap<K> mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.MutableObjectIntMap<K> mutableObjectIntMapOf(K k, int i, K k2, int i2, K k3, int i3, K k4, int i4, K k5, int i5) {
        androidx.collection.MutableObjectIntMap<K> mutableObjectIntMap = new androidx.collection.MutableObjectIntMap<>(0, 1, null);
        mutableObjectIntMap.set(k, i);
        mutableObjectIntMap.set(k2, i2);
        mutableObjectIntMap.set(k3, i3);
        mutableObjectIntMap.set(k4, i4);
        mutableObjectIntMap.set(k5, i5);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> buildObjectIntMap(kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectIntMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(0, 1, null);
        function1.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }

    public static final <K> androidx.collection.ObjectIntMap<K> buildObjectIntMap(int i, kotlin.jvm.functions.Function1<? super androidx.collection.MutableObjectIntMap<K>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.MutableObjectIntMap mutableObjectIntMap = new androidx.collection.MutableObjectIntMap(i);
        function1.invoke(mutableObjectIntMap);
        return mutableObjectIntMap;
    }
}
