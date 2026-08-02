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

@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Caching.kt\nkotlinx/serialization/internal/ParametrizedCacheEntry\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n1#3:234\n212#4:225\n213#4:230\n214#4:233\n1557#5:226\n1628#5,3:227\n72#6,2:231\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueParametrizedCache\n*L\n128#1:220,3\n128#1:224\n128#1:223\n129#1:234\n129#1:225\n129#1:230\n129#1:233\n129#1:226\n129#1:227,3\n129#1:231,2\n*E\n"})
/* renamed from: kotlinx.serialization.internal.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1164u<T> implements InterfaceC1171x0<T> {
    public final Function2<KClass<Object>, List<? extends KType>, kotlinx.serialization.b<T>> a;
    public final C1166v<C1169w0<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1164u(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends kotlinx.serialization.b<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = compute;
        this.b = new C1166v<>();
    }

    @Override // kotlinx.serialization.internal.InterfaceC1171x0
    public final Object a(KClass key, ArrayList types) {
        Object obj;
        int collectionSizeOrDefault;
        Object m1716constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        obj = this.b.get(JvmClassMappingKt.getJavaClass(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C1148l0 c1148l0 = (C1148l0) obj;
        T t = c1148l0.reference.get();
        if (t == null) {
            t = (T) c1148l0.a(new C1162t());
        }
        C1169w0 c1169w0 = t;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(types, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new X((KType) it.next()));
        }
        ConcurrentHashMap<List<X>, Result<kotlinx.serialization.b<T>>> concurrentHashMap = c1169w0.a;
        Result<kotlinx.serialization.b<T>> result = concurrentHashMap.get(arrayList);
        if (result == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m1716constructorimpl = Result.m1716constructorimpl(this.a.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m1716constructorimpl = Result.m1716constructorimpl(ResultKt.createFailure(th));
            }
            Result<kotlinx.serialization.b<T>> m1715boximpl = Result.m1715boximpl(m1716constructorimpl);
            Result<kotlinx.serialization.b<T>> putIfAbsent = concurrentHashMap.putIfAbsent(arrayList, m1715boximpl);
            result = putIfAbsent == null ? m1715boximpl : putIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(result, "getOrPut(...)");
        return result.getValue();
    }
}
