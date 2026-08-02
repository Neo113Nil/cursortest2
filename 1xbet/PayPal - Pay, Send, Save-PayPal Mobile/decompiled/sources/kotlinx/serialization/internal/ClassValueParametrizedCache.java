package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR:\u0010\u0013\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/serialization/internal/ClassValueParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "p1", "Lkotlin/Result;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "getHighSpeedVideoFpsRanges", "Lkotlinx/serialization/internal/ClassValueReferences;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ClassValueParametrizedCache<T> implements kotlinx.serialization.internal.ParametrizedSerializerCache<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlin.reflect.KClass<java.lang.Object>, java.util.List<? extends kotlin.reflect.KType>, kotlinx.serialization.KSerializer<T>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.serialization.internal.ClassValueReferences<kotlinx.serialization.internal.ParametrizedCacheEntry<T>> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueParametrizedCache(kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<java.lang.Object>, ? super java.util.List<? extends kotlin.reflect.KType>, ? extends kotlinx.serialization.KSerializer<T>> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlinx.serialization.internal.ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public final java.lang.Object mo24214getgIAlus(kotlin.reflect.KClass<java.lang.Object> p0, java.util.List<? extends kotlin.reflect.KType> p1) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry = this.getHighResolutionOutputSizeshNQ4ISI.get(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parametrizedCacheEntry, "");
        kotlinx.serialization.internal.MutableSoftReference mutableSoftReference = (kotlinx.serialization.internal.MutableSoftReference) parametrizedCacheEntry;
        T t = mutableSoftReference.getHighResolutionOutputSizeshNQ4ISI.get();
        if (t == null) {
            t = (T) mutableSoftReference.getHighSpeedVideoFpsRangesFor(new kotlin.jvm.functions.Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return (T) new kotlinx.serialization.internal.ParametrizedCacheEntry();
                }
            });
        }
        kotlinx.serialization.internal.ParametrizedCacheEntry parametrizedCacheEntry2 = t;
        java.util.List<? extends kotlin.reflect.KType> list = p1;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlinx.serialization.internal.KTypeWrapper((kotlin.reflect.KType) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        concurrentHashMap = parametrizedCacheEntry2.getHighSpeedVideoFpsRanges;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        java.lang.Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(this.Camera2StreamConfigurationMap.invoke(p0, p1));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            obj = kotlin.Result.m23435boximpl(m23436constructorimpl);
            java.lang.Object putIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
    }
}
