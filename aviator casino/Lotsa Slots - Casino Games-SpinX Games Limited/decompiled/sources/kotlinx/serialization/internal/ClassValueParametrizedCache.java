package kotlinx.serialization.internal;

/* compiled from: Caching.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B5\u0012,\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R4\u0010\u0003\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/internal/ClassValueParametrizedCache;", "T", "Lkotlinx/serialization/internal/ParametrizedSerializerCache;", "compute", "Lkotlin/Function2;", "Lkotlin/reflect/KClass;", "", "", "Lkotlin/reflect/KType;", "Lkotlinx/serialization/KSerializer;", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "classValue", "Lkotlinx/serialization/internal/ClassValueReferences;", "Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "get", "Lkotlin/Result;", com.ironsource.X3.i.W, "types", "get-gIAlu-s", "(Lkotlin/reflect/KClass;Ljava/util/List;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClassValueParametrizedCache<T> implements kotlinx.serialization.internal.ParametrizedSerializerCache<T> {
    private final kotlinx.serialization.internal.ClassValueReferences<kotlinx.serialization.internal.ParametrizedCacheEntry<T>> classValue;
    private final kotlin.jvm.functions.Function2<kotlin.reflect.KClass<java.lang.Object>, java.util.List<? extends kotlin.reflect.KType>, kotlinx.serialization.KSerializer<T>> compute;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueParametrizedCache(kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<java.lang.Object>, ? super java.util.List<? extends kotlin.reflect.KType>, ? extends kotlinx.serialization.KSerializer<T>> compute) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new kotlinx.serialization.internal.ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public java.lang.Object mo12403getgIAlus(kotlin.reflect.KClass<java.lang.Object> key, java.util.List<? extends kotlin.reflect.KType> types) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        kotlinx.serialization.internal.ParametrizedCacheEntry<T> parametrizedCacheEntry = this.classValue.get(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) key));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parametrizedCacheEntry, "get(...)");
        kotlinx.serialization.internal.MutableSoftReference mutableSoftReference = (kotlinx.serialization.internal.MutableSoftReference) parametrizedCacheEntry;
        T t = mutableSoftReference.reference.get();
        if (t == null) {
            t = (T) mutableSoftReference.getOrSetWithLock(new kotlin.jvm.functions.Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                @Override // kotlin.jvm.functions.Function0
                public final T invoke() {
                    return (T) new kotlinx.serialization.internal.ParametrizedCacheEntry();
                }
            });
        }
        kotlinx.serialization.internal.ParametrizedCacheEntry parametrizedCacheEntry2 = t;
        java.util.List<? extends kotlin.reflect.KType> list = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlinx.serialization.internal.KTypeWrapper((kotlin.reflect.KType) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = parametrizedCacheEntry2.serializers;
        java.lang.Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(this.compute.invoke(key, types));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            kotlin.Result m10797boximpl = kotlin.Result.m10797boximpl(m10798constructorimpl);
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, m10797boximpl);
            obj = putIfAbsent == null ? m10797boximpl : putIfAbsent;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((kotlin.Result) obj).getValue();
    }
}
