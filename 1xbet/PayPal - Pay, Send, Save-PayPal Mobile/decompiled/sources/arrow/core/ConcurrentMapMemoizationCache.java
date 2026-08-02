package arrow.core;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0088\u0001\u0006\u0092\u0001\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005"}, d2 = {"Larrow/core/ConcurrentMapMemoizationCache;", "", "K", "V", "Larrow/core/MemoizationCache;", "Ljava/util/concurrent/ConcurrentMap;", com.datadog.trace.api.DDSpanTypes.CACHE, "constructor-impl", "(Ljava/util/concurrent/ConcurrentMap;)Ljava/util/concurrent/ConcurrentMap;", "key", "get-impl", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;)Ljava/lang/Object;", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set-impl", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "set", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ConcurrentMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes7.dex */
public final class ConcurrentMapMemoizationCache<K, V> implements arrow.core.MemoizationCache<K, V> {
    private final java.util.concurrent.ConcurrentMap<K, V> getHighSpeedVideoFpsRangesFor;

    private /* synthetic */ ConcurrentMapMemoizationCache(java.util.concurrent.ConcurrentMap concurrentMap) {
        this.getHighSpeedVideoFpsRangesFor = concurrentMap;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.ConcurrentMap m9540constructorimpl$default(java.util.concurrent.ConcurrentMap concurrentMap, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            concurrentMap = new java.util.concurrent.ConcurrentHashMap();
        }
        return m9539constructorimpl(concurrentMap);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static V m9543getimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
        return concurrentMap.get(k);
    }

    @Override // arrow.core.MemoizationCache
    public final V get(K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
        return (V) m9543getimpl(this.getHighSpeedVideoFpsRangesFor, k);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static V m9545setimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap, K k, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
        V putIfAbsent = concurrentMap.putIfAbsent(k, v);
        return putIfAbsent == null ? v : putIfAbsent;
    }

    @Override // arrow.core.MemoizationCache
    public final V set(K k, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
        return (V) m9545setimpl(this.getHighSpeedVideoFpsRangesFor, k, v);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.concurrent.ConcurrentMap getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m9546toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m9544hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m9541equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9546toStringimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConcurrentMapMemoizationCache(cache=");
        sb.append(concurrentMap);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9544hashCodeimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap) {
        return concurrentMap.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9542equalsimpl0(java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Object> concurrentMap, java.util.concurrent.ConcurrentMap<java.lang.Object, java.lang.Object> concurrentMap2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(concurrentMap, concurrentMap2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9541equalsimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap, java.lang.Object obj) {
        return (obj instanceof arrow.core.ConcurrentMapMemoizationCache) && kotlin.jvm.internal.Intrinsics.areEqual(concurrentMap, ((arrow.core.ConcurrentMapMemoizationCache) obj).getGetHighSpeedVideoFpsRangesFor());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> java.util.concurrent.ConcurrentMap<K, V> m9539constructorimpl(java.util.concurrent.ConcurrentMap<K, V> concurrentMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentMap, "");
        return concurrentMap;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ arrow.core.ConcurrentMapMemoizationCache m9538boximpl(java.util.concurrent.ConcurrentMap concurrentMap) {
        return new arrow.core.ConcurrentMapMemoizationCache(concurrentMap);
    }
}
