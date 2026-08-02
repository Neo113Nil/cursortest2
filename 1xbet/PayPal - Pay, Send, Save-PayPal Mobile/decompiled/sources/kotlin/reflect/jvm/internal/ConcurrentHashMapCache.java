package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/ConcurrentHashMapCache;", "V", "Lkotlin/reflect/jvm/internal/CacheByClass;", "Lkotlin/Function1;", "Ljava/lang/Class;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "clear", "()V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ConcurrentHashMap;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ConcurrentHashMapCache<V> extends kotlin.reflect.jvm.internal.CacheByClass<V> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Class<?>, V> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapCache(kotlin.jvm.functions.Function1<? super java.lang.Class<?>, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public final V get(java.lang.Class<?> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, V> concurrentHashMap = this.getHighSpeedVideoSizes;
        V v = (V) concurrentHashMap.get(p0);
        if (v != null) {
            return v;
        }
        V invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0);
        V v2 = (V) concurrentHashMap.putIfAbsent(p0, invoke);
        return v2 == null ? invoke : v2;
    }

    @Override // kotlin.reflect.jvm.internal.CacheByClass
    public final void clear() {
        this.getHighSpeedVideoSizes.clear();
    }
}
