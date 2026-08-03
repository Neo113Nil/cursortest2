package kotlinx.serialization.internal;

/* compiled from: Caching.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JE\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R.\u0010\u0005\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlinx/serialization/internal/ParametrizedCacheEntry;", "T", "", "<init>", "()V", "serializers", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/Result;", "Lkotlinx/serialization/KSerializer;", "computeIfAbsent", "types", "Lkotlin/reflect/KType;", "producer", "Lkotlin/Function0;", "computeIfAbsent-gIAlu-s", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ParametrizedCacheEntry<T> {
    private final java.util.concurrent.ConcurrentHashMap<java.util.List<kotlinx.serialization.internal.KTypeWrapper>, kotlin.Result<kotlinx.serialization.KSerializer<T>>> serializers = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final java.lang.Object m12408computeIfAbsentgIAlus(java.util.List<? extends kotlin.reflect.KType> types, kotlin.jvm.functions.Function0<? extends kotlinx.serialization.KSerializer<T>> producer) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "types");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producer, "producer");
        java.util.List<? extends kotlin.reflect.KType> list = types;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlinx.serialization.internal.KTypeWrapper((kotlin.reflect.KType) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.serializers;
        java.lang.Object obj = concurrentHashMap.get(arrayList2);
        if (obj == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m10798constructorimpl = kotlin.Result.m10798constructorimpl(producer.invoke());
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
