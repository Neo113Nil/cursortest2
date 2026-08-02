package androidx.collection.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001f\b\u0016\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000eR#\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00140\u00138G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/collection/internal/LruHashMap;", "", "K", "V", com.visa.cbp.DeviceInfo.valueOf, "<init>", "(Landroidx/collection/internal/LruHashMap;)V", "", "initialCapacity", "", "loadFactor", "(IF)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "", "getEntries", "()Ljava/util/Set;", "entries", "", "isEmpty", "()Z", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/getHighSpeedVideoSizes;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/LinkedHashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LruHashMap<K, V> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.LinkedHashMap<K, V> getHighSpeedVideoSizes;

    public LruHashMap(int i, float f) {
        this.getHighSpeedVideoSizes = new java.util.LinkedHashMap<>(i, f, true);
    }

    public /* synthetic */ LruHashMap(int i, float f, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i, (i2 & 2) != 0 ? 0.75f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(androidx.collection.internal.LruHashMap<? extends K, V> lruHashMap) {
        this(0, 0.0f, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lruHashMap, "");
        for (java.util.Map.Entry<? extends K, V> entry : lruHashMap.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    public final java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        java.util.Set<java.util.Map.Entry<K, V>> entrySet = this.getHighSpeedVideoSizes.entrySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(entrySet, "");
        return entrySet;
    }

    public final V get(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoSizes.get(key);
    }

    public final V put(K key, V value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return this.getHighSpeedVideoSizes.put(key, value);
    }

    public final V remove(K key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return this.getHighSpeedVideoSizes.remove(key);
    }

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }
}
