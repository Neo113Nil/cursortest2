package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00042\u0006\u0010\u0007\u001a\u00020\u00062.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0004\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f\u001aY\u0010\u000e\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "K", "V", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "recursiveFetchHashMap", "(Ljava/util/HashMap;ZLkotlin/jvm/functions/Function1;)V", "Landroidx/collection/ArrayMap;", "recursiveFetchArrayMap", "(Landroidx/collection/ArrayMap;ZLkotlin/jvm/functions/Function1;)V"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/RelationUtil")
/* loaded from: classes7.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    public static final <K, V> void recursiveFetchHashMap(java.util.HashMap<K, V> hashMap, boolean z, kotlin.jvm.functions.Function1<? super java.util.HashMap<K, V>, kotlin.Unit> function1) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.HashMap hashMap2 = new java.util.HashMap(999);
        loop0: while (true) {
            i = 0;
            for (K k : hashMap.keySet()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "");
                if (z) {
                    hashMap2.put(k, hashMap.get(k));
                } else {
                    hashMap2.put(k, null);
                }
                i++;
                if (i == 999) {
                    function1.invoke(hashMap2);
                    if (!z) {
                        hashMap.putAll(hashMap2);
                    }
                    hashMap2.clear();
                }
            }
            break loop0;
        }
        if (i > 0) {
            function1.invoke(hashMap2);
            if (z) {
                return;
            }
            hashMap.putAll(hashMap2);
        }
    }

    public static final <K, V> void recursiveFetchArrayMap(androidx.collection.ArrayMap<K, V> arrayMap, boolean z, kotlin.jvm.functions.Function1<? super androidx.collection.ArrayMap<K, V>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap(999);
        int camera2StreamConfigurationMap = arrayMap.getCamera2StreamConfigurationMap();
        int i = 0;
        int i2 = 0;
        while (i < camera2StreamConfigurationMap) {
            if (z) {
                arrayMap2.put(arrayMap.keyAt(i), arrayMap.valueAt(i));
            } else {
                arrayMap2.put(arrayMap.keyAt(i), null);
            }
            i++;
            i2++;
            if (i2 == 999) {
                function1.invoke(arrayMap2);
                if (!z) {
                    arrayMap.putAll((java.util.Map) arrayMap2);
                }
                arrayMap2.clear();
                i2 = 0;
            }
        }
        if (i2 > 0) {
            function1.invoke(arrayMap2);
            if (z) {
                return;
            }
            arrayMap.putAll((java.util.Map) arrayMap2);
        }
    }
}
