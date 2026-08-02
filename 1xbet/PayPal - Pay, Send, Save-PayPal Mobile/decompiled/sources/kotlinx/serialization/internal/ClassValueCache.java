package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\u001e\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR)\u0010\u0011\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00050\u00038\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/serialization/internal/ClassValueCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "Lkotlin/Function1;", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "get", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;", "", "isStored", "(Lkotlin/reflect/KClass;)Z", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/CacheEntry;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/internal/ClassValueReferences;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClassValueCache<T> implements kotlinx.serialization.internal.SerializerCache<T> {
    private final kotlinx.serialization.internal.ClassValueReferences<kotlinx.serialization.internal.CacheEntry<T>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final kotlin.jvm.functions.Function1<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<T>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueCache(kotlin.jvm.functions.Function1<? super kotlin.reflect.KClass<?>, ? extends kotlinx.serialization.KSerializer<T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = new kotlinx.serialization.internal.ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final kotlinx.serialization.KSerializer<T> get(final kotlin.reflect.KClass<java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.internal.CacheEntry<T> cacheEntry = this.getHighSpeedVideoFpsRanges.get(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheEntry, "");
        kotlinx.serialization.internal.MutableSoftReference mutableSoftReference = (kotlinx.serialization.internal.MutableSoftReference) cacheEntry;
        T t = mutableSoftReference.getHighResolutionOutputSizeshNQ4ISI.get();
        if (t == null) {
            t = (T) mutableSoftReference.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return (T) new kotlinx.serialization.internal.CacheEntry(kotlinx.serialization.internal.ClassValueCache.this.getHighSpeedVideoSizes.invoke(p0));
                }
            });
        }
        return t.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public final boolean isStored(kotlin.reflect.KClass<?> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlinx.serialization.internal.ClassValueReferences<kotlinx.serialization.internal.CacheEntry<T>> classValueReferences = this.getHighSpeedVideoFpsRanges;
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        return ((kotlinx.serialization.internal.MutableSoftReference) classValueReferences.get(javaClass)).getHighResolutionOutputSizeshNQ4ISI.get() != null;
    }
}
