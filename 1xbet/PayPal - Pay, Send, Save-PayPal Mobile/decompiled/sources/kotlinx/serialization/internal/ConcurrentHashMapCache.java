package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR,\u0010\u000f\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R*\u0010\u0016\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lkotlin/reflect/KClass;)Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/CacheEntry;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConcurrentHashMapCache<T> implements kotlinx.serialization.internal.SerializerCache<T> {
    private final kotlin.jvm.functions.Function1<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<T>> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.CacheEntry<T>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapCache(kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<?>, ? extends kotlinx.serialization.KSerializer<T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final kotlinx.serialization.KSerializer<T> get(kotlin.reflect.KClass<java.lang.Object> p0) {
        kotlinx.serialization.internal.CacheEntry<T> putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.CacheEntry<T>> concurrentHashMap = this.getHighSpeedVideoSizes;
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0);
        kotlinx.serialization.internal.CacheEntry<T> cacheEntry = concurrentHashMap.get(javaClass);
        if (cacheEntry == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (cacheEntry = new kotlinx.serialization.internal.CacheEntry<>(this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0))))) != null) {
            cacheEntry = putIfAbsent;
        }
        return cacheEntry.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final boolean isStored(kotlin.reflect.KClass<?> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighSpeedVideoSizes.containsKey(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0));
    }
}
