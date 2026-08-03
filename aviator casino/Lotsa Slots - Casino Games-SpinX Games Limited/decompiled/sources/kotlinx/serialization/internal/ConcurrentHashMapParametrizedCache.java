package kotlinx.serialization.internal;

/* compiled from: Caching.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012,\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R4\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "compute", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "get", "Lkotlin/Result;", com.ironsource.X3.i.W, "types", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConcurrentHashMapParametrizedCache<T> implements kotlinx.serialization.internal.ParametrizedSerializerCache<T> {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.ParametrizedCacheEntry<T>> cache;
    private final kotlin.jvm.functions.Function2<kotlin.reflect.KClass<java.lang.Object>, java.util.List<? extends kotlin.reflect.KType>, kotlinx.serialization.KSerializer<T>> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapParametrizedCache(kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<java.lang.Object>, ? super java.util.List<? extends kotlin.reflect.KType>, ? extends kotlinx.serialization.KSerializer<T>> compute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new java.util.concurrent.ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s */
    public java.lang.Object mo12403getgIAlus(kotlin.reflect.KClass<java.lang.Object> key, java.util.List<? extends kotlin.reflect.KType> types) {
        java.lang.Object m10798constructorimpl;
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> putIfAbsent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, kotlinx.serialization.internal.ParametrizedCacheEntry<T>> concurrentHashMap = this.cache;
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) key);
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry = concurrentHashMap.get(javaClass);
        if (parametrizedCacheEntry == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (parametrizedCacheEntry = new kotlinx.serialization.internal.ParametrizedCacheEntry<>()))) != null) {
            parametrizedCacheEntry = putIfAbsent;
        }
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntry;
        java.util.List<? extends kotlin.reflect.KType> list = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlinx.serialization.internal.KTypeWrapper((kotlin.reflect.KType) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = ((kotlinx.serialization.internal.ParametrizedCacheEntry) parametrizedCacheEntry2).serializers;
        java.lang.Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(this.compute.invoke(key, types));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            kotlin.Result m10797boximpl = kotlin.Result.m10797boximpl(m10798constructorimpl);
            java.lang.Object putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, m10797boximpl);
            obj = putIfAbsent2 == null ? m10797boximpl : putIfAbsent2;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((kotlin.Result) obj).getValue();
    }
}
