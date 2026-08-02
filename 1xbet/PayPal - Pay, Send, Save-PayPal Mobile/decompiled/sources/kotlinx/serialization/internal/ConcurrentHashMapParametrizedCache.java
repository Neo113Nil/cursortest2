package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B5\u0012,\u0010\t\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u0003¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR:\u0010\u0013\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0011\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "p1", "Lkotlin/Result;", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "get", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConcurrentHashMapParametrizedCache<T> implements kotlinx.serialization.internal.ParametrizedSerializerCache<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.ParametrizedCacheEntry<T>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlin.reflect.KClass<java.lang.Object>, java.util.List<? extends kotlin.reflect.KType>, kotlinx.serialization.KSerializer<T>> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapParametrizedCache(kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<java.lang.Object>, ? super java.util.List<? extends kotlin.reflect.KType>, ? extends kotlinx.serialization.KSerializer<T>> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public final java.lang.Object mo24214getgIAlus(kotlin.reflect.KClass<java.lang.Object> p0, java.util.List<? extends kotlin.reflect.KType> p1) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.lang.Object m23436constructorimpl;
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.ParametrizedCacheEntry<T>> concurrentHashMap2 = this.getHighSpeedVideoSizes;
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) p0);
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry = concurrentHashMap2.get(javaClass);
        if (parametrizedCacheEntry == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(javaClass, (parametrizedCacheEntry = new kotlinx.serialization.internal.ParametrizedCacheEntry<>()))) != null) {
            parametrizedCacheEntry = putIfAbsent;
        }
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntry;
        java.util.List<? extends kotlin.reflect.KType> list = p1;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlinx.serialization.internal.KTypeWrapper((kotlin.reflect.KType) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        concurrentHashMap = ((kotlinx.serialization.internal.ParametrizedCacheEntry) parametrizedCacheEntry2).getHighSpeedVideoFpsRanges;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = concurrentHashMap;
        java.lang.Object obj = concurrentHashMap3.get(arrayList2);
        if (obj == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(this.getHighResolutionOutputSizeshNQ4ISI.invoke(p0, p1));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            obj = kotlin.Result.m23435boximpl(m23436constructorimpl);
            java.lang.Object putIfAbsent2 = concurrentHashMap3.putIfAbsent(arrayList2, obj);
            if (putIfAbsent2 != null) {
                obj = putIfAbsent2;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
    }
}
