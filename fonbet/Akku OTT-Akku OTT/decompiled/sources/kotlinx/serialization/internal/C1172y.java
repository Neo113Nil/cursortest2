package kotlinx.serialization.internal;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n72#2,2:220\n1#3:222\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ConcurrentHashMapCache\n*L\n142#1:220,2\n142#1:222\n*E\n"})
/* renamed from: kotlinx.serialization.internal.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1172y<T> implements O0<T> {
    public final Function1<KClass<?>, kotlinx.serialization.b<T>> a;
    public final ConcurrentHashMap<Class<?>, C1149m<T>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1172y(Function1<? super KClass<?>, ? extends kotlinx.serialization.b<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = compute;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.O0
    public final kotlinx.serialization.b<T> a(KClass<Object> key) {
        C1149m<T> putIfAbsent;
        Intrinsics.checkNotNullParameter(key, "key");
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        ConcurrentHashMap<Class<?>, C1149m<T>> concurrentHashMap = this.b;
        C1149m<T> c1149m = concurrentHashMap.get(javaClass);
        if (c1149m == null && (putIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (c1149m = new C1149m<>(this.a.invoke(key))))) != null) {
            c1149m = putIfAbsent;
        }
        return c1149m.a;
    }
}
