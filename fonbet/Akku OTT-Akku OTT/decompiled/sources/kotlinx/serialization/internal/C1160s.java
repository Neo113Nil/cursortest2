package kotlinx.serialization.internal;

import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,219:1\n84#2,3:220\n89#2:224\n1#3:223\n*S KotlinDebug\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n52#1:220,3\n52#1:224\n52#1:223\n*E\n"})
/* renamed from: kotlinx.serialization.internal.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1160s<T> implements O0<T> {
    public final Function1<KClass<?>, kotlinx.serialization.b<T>> a;
    public final C1166v<C1149m<T>> b;

    @SourceDebugExtension({"SMAP\nCaching.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Caching.kt\nkotlinx/serialization/internal/ClassValueReferences$getOrSet$2\n+ 2 Caching.kt\nkotlinx/serialization/internal/ClassValueCache\n*L\n1#1,89:1\n52#2:90\n*E\n"})
    /* renamed from: kotlinx.serialization.internal.s$a */
    public static final class a implements Function0<T> {
        public final /* synthetic */ KClass b;

        public a(KClass kClass) {
            this.b = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new C1149m(C1160s.this.a.invoke(this.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1160s(Function1<? super KClass<?>, ? extends kotlinx.serialization.b<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.a = compute;
        this.b = new C1166v<>();
    }

    @Override // kotlinx.serialization.internal.O0
    public final kotlinx.serialization.b<T> a(KClass<Object> key) {
        Object obj;
        Intrinsics.checkNotNullParameter(key, "key");
        obj = this.b.get(JvmClassMappingKt.getJavaClass((KClass) key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        C1148l0 c1148l0 = (C1148l0) obj;
        T t = c1148l0.reference.get();
        if (t == null) {
            t = (T) c1148l0.a(new a(key));
        }
        return t.a;
    }
}
