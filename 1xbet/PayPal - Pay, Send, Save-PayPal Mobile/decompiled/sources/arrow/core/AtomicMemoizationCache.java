package arrow.core;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\u00120\b\u0002\u0010\u0007\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR<\u0010\u001d\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0088\u0001\u0007\u0092\u0001*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005`\u0006"}, d2 = {"Larrow/core/AtomicMemoizationCache;", "K", "V", "Larrow/core/MemoizationCache;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Larrow/atomic/getHighResolutionOutputSizeshNQ4ISI;", com.datadog.trace.api.DDSpanTypes.CACHE, "constructor-impl", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/concurrent/atomic/AtomicReference;", "key", "get-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)Ljava/lang/Object;", "get", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "set-impl", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "set", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReference;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes7.dex */
public final class AtomicMemoizationCache<K, V> implements arrow.core.MemoizationCache<K, V> {
    private final java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> getHighSpeedVideoSizes;

    private /* synthetic */ AtomicMemoizationCache(java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.getHighSpeedVideoSizes = atomicReference;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.util.concurrent.atomic.AtomicReference m9530constructorimpl$default(java.util.concurrent.atomic.AtomicReference atomicReference, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            atomicReference = new java.util.concurrent.atomic.AtomicReference(kotlin.collections.MapsKt.emptyMap());
        }
        return m9529constructorimpl(atomicReference);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static V m9533getimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference, K k) {
        return atomicReference.get().get(k);
    }

    @Override // arrow.core.MemoizationCache
    public final V get(K k) {
        return (V) m9533getimpl(this.getHighSpeedVideoSizes, k);
    }

    @Override // arrow.core.MemoizationCache
    public final V set(K k, V v) {
        return (V) m9535setimpl(this.getHighSpeedVideoSizes, k, v);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static V m9535setimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference, K k, V v) {
        java.lang.Object value;
        java.util.Map map;
        do {
            value = arrow.atomic.AtomicKt.getValue(atomicReference);
            map = (java.util.Map) arrow.atomic.AtomicKt.getValue(atomicReference);
            if (!map.containsKey(k)) {
                map = kotlin.collections.MapsKt.plus(map, kotlin.TuplesKt.to(k, v));
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, value, map));
        return (V) kotlin.collections.MapsKt.getValue(map, k);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m9536toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m9534hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m9531equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9536toStringimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AtomicMemoizationCache(cache=");
        sb.append(atomicReference);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9534hashCodeimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference) {
        return atomicReference.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9532equalsimpl0(java.util.concurrent.atomic.AtomicReference<java.util.Map<java.lang.Object, java.lang.Object>> atomicReference, java.util.concurrent.atomic.AtomicReference<java.util.Map<java.lang.Object, java.lang.Object>> atomicReference2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, atomicReference2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9531equalsimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference, java.lang.Object obj) {
        return (obj instanceof arrow.core.AtomicMemoizationCache) && kotlin.jvm.internal.Intrinsics.areEqual(atomicReference, ((arrow.core.AtomicMemoizationCache) obj).getGetHighSpeedVideoSizes());
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> m9529constructorimpl(java.util.concurrent.atomic.AtomicReference<java.util.Map<K, V>> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        return atomicReference;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ arrow.core.AtomicMemoizationCache m9528boximpl(java.util.concurrent.atomic.AtomicReference atomicReference) {
        return new arrow.core.AtomicMemoizationCache(atomicReference);
    }
}
