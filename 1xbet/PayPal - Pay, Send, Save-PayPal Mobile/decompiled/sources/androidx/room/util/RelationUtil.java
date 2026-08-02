package androidx.room.util;

@kotlin.Metadata(d1 = {"androidx/room/util/RelationUtil__RelationUtilKt", "androidx/room/util/RelationUtil__RelationUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RelationUtil {
    public static final int MAX_BIND_PARAMETER_CNT = 999;

    public static final <K, V> void recursiveFetchArrayMap(androidx.collection.ArrayMap<K, V> arrayMap, boolean z, kotlin.jvm.functions.Function1<? super androidx.collection.ArrayMap<K, V>, kotlin.Unit> function1) {
        androidx.room.util.RelationUtil__RelationUtil_androidKt.recursiveFetchArrayMap(arrayMap, z, function1);
    }

    public static final <K, V> void recursiveFetchHashMap(java.util.HashMap<K, V> hashMap, boolean z, kotlin.jvm.functions.Function1<? super java.util.HashMap<K, V>, kotlin.Unit> function1) {
        androidx.room.util.RelationUtil__RelationUtil_androidKt.recursiveFetchHashMap(hashMap, z, function1);
    }

    public static final <V> void recursiveFetchLongSparseArray(androidx.collection.LongSparseArray<V> longSparseArray, boolean z, kotlin.jvm.functions.Function1<? super androidx.collection.LongSparseArray<V>, kotlin.Unit> function1) {
        androidx.room.util.RelationUtil__RelationUtilKt.recursiveFetchLongSparseArray(longSparseArray, z, function1);
    }

    public static final <K, V> void recursiveFetchMap(java.util.Map<K, V> map, boolean z, kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> function1) {
        androidx.room.util.RelationUtil__RelationUtilKt.recursiveFetchMap(map, z, function1);
    }
}
