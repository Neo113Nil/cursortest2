package kotlinx.serialization.modules;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.k;
import kotlinx.serialization.modules.a;

@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
/* loaded from: classes5.dex */
public final class b extends d {
    public final Map<KClass<?>, a> a;

    @JvmField
    public final Map<KClass<?>, Map<KClass<?>, kotlinx.serialization.b<?>>> b;
    public final Map<KClass<?>, Function1<?, k<?>>> c;
    public final Map<KClass<?>, Map<String, kotlinx.serialization.b<?>>> d;
    public final Map<KClass<?>, Function1<String, kotlinx.serialization.a<?>>> e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<KClass<?>, ? extends a> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends kotlinx.serialization.b<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends k<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends kotlinx.serialization.b<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends kotlinx.serialization.a<?>>> polyBase2DefaultDeserializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.a = class2ContextualFactory;
        this.b = polyBase2Serializers;
        this.c = polyBase2DefaultSerializerProvider;
        this.d = polyBase2NamedSerializers;
        this.e = polyBase2DefaultDeserializerProvider;
        this.f = z;
    }

    @Override // kotlinx.serialization.modules.d
    public final void a(f collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<KClass<?>, a> entry : this.a.entrySet()) {
            KClass<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0164a) {
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlinx.serialization.b<?> bVar = ((a.C0164a) value).a;
                Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.c(key, bVar);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.e(key, ((a.b) value).a);
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, kotlinx.serialization.b<?>>> entry2 : this.b.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, kotlinx.serialization.b<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                kotlinx.serialization.b<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.a(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, k<?>>> entry4 : this.c.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, k<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.d(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, kotlinx.serialization.a<?>>> entry5 : this.e.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, kotlinx.serialization.a<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.b(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }

    @Override // kotlinx.serialization.modules.d
    public final <T> kotlinx.serialization.b<T> b(KClass<T> kClass, List<? extends kotlinx.serialization.b<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.a.get(kClass);
        kotlinx.serialization.b<T> bVar = aVar != null ? (kotlinx.serialization.b<T>) aVar.a(typeArgumentsSerializers) : null;
        if (bVar instanceof kotlinx.serialization.b) {
            return bVar;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.d
    public final boolean d() {
        return this.f;
    }

    @Override // kotlinx.serialization.modules.d
    public final kotlinx.serialization.a e(String str, KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, kotlinx.serialization.b<?>> map = this.d.get(baseClass);
        kotlinx.serialization.b<?> bVar = map != null ? map.get(str) : null;
        if (!(bVar instanceof kotlinx.serialization.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Function1<String, kotlinx.serialization.a<?>> function1 = this.e.get(baseClass);
        Function1<String, kotlinx.serialization.a<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return function12.invoke(str);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.d
    public final <T> k<T> f(KClass<? super T> baseClass, T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (baseClass.isInstance(value)) {
            Map<KClass<?>, kotlinx.serialization.b<?>> map = this.b.get(baseClass);
            kotlinx.serialization.b<?> bVar = map != null ? map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
            kotlinx.serialization.b<?> bVar2 = bVar instanceof k ? bVar : null;
            if (bVar2 != null) {
                return bVar2;
            }
            Function1<?, k<?>> function1 = this.c.get(baseClass);
            Function1<?, k<?>> function12 = TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
            if (function12 != null) {
                return (k) function12.invoke(value);
            }
        }
        return null;
    }
}
