package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n72#2,2:220\n72#2,2:229\n1#3:222\n1#3:232\n212#4:223\n213#4:228\n214#4:231\n1557#5:224\n1628#5,3:225\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapParametrizedCache\n*L\n158#1:220,2\n159#1:229,2\n158#1:222\n159#1:232\n159#1:223\n159#1:228\n159#1:231\n159#1:224\n159#1:225,3\n*E\n"})
/* renamed from: kotlinx.serialization.internal.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1174z<T> implements InterfaceC1171x0<T> {
    public final Function2<KClass<Object>, List<? extends KType>, kotlinx.serialization.b<T>> a;
    public final ConcurrentHashMap<Class<?>, C1169w0<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1174z(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends kotlinx.serialization.b<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = compute;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC1171x0
    public final Object a(KClass key, ArrayList types) {
        int collectionSizeOrDefault;
        Object m1716constructorimpl;
        C1169w0<T> putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Class<?> javaClass = JvmClassMappingKt.getJavaClass(key);
        ConcurrentHashMap<Class<?>, C1169w0<T>> concurrentHashMap = this.b;
        C1169w0<T> c1169w0 = concurrentHashMap.get(javaClass);
        if (c1169w0 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (c1169w0 = new C1169w0<>()))) != null) {
            c1169w0 = putIfAbsent;
        }
        C1169w0<T> c1169w02 = c1169w0;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(types, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new X((KType) it.next()));
        }
        ConcurrentHashMap<List<X>, Result<kotlinx.serialization.b<T>>> concurrentHashMap2 = c1169w02.a;
        Result<kotlinx.serialization.b<T>> result = concurrentHashMap2.get(arrayList);
        if (result == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m1716constructorimpl = Result.m1716constructorimpl(this.a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
            }
            Result<kotlinx.serialization.b<T>> m1715boximpl = Result.m1715boximpl(m1716constructorimpl);
            Result<kotlinx.serialization.b<T>> putIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList, m1715boximpl);
            result = putIfAbsent2 == null ? m1715boximpl : putIfAbsent2;
        }
        Intrinsics.checkNotNullExpressionValue(result, "getOrPut(...)");
        return result.getValue();
    }
}
