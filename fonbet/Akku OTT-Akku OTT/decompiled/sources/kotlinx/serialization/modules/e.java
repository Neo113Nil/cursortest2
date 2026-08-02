package kotlinx.serialization.modules;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.C1173y0;
import kotlinx.serialization.k;
import kotlinx.serialization.modules.a;

@SourceDebugExtension({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n381#2,7:273\n381#2,7:280\n1#3:287\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n197#1:273,7\n199#1:280,7\n*E\n"})
/* loaded from: classes5.dex */
public final class e implements f {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    @PublishedApi
    public e() {
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base, Sub extends Base> void a(KClass<Base> baseClass, KClass<Sub> actualClass, kotlinx.serialization.b<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        i(baseClass, actualClass, actualSerializer, false);
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base> void b(KClass<Base> baseClass, Function1<? super String, ? extends kotlinx.serialization.a<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        g(baseClass, defaultDeserializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.f
    public final <T> void c(KClass<T> kClass, kotlinx.serialization.b<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        j(kClass, new a.C0164a(serializer), false);
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base> void d(KClass<Base> baseClass, Function1<? super Base, ? extends k<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        h(baseClass, defaultSerializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.f
    public final <T> void e(KClass<T> kClass, Function1<? super List<? extends kotlinx.serialization.b<?>>, ? extends kotlinx.serialization.b<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        j(kClass, new a.b(provider), false);
    }

    @PublishedApi
    public final b f() {
        return new b(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    @JvmName(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void g(KClass<Base> baseClass, Function1<? super String, ? extends kotlinx.serialization.a<? extends Base>> defaultDeserializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        HashMap hashMap = this.e;
        Function1 function1 = (Function1) hashMap.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultDeserializerProvider) || z) {
            hashMap.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @JvmName(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void h(KClass<Base> baseClass, Function1<? super Base, ? extends k<? super Base>> defaultSerializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        HashMap hashMap = this.c;
        Function1 function1 = (Function1) hashMap.get(baseClass);
        if (function1 == null || Intrinsics.areEqual(function1, defaultSerializerProvider) || z) {
            hashMap.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    @JvmName(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void i(KClass<Base> baseClass, KClass<Sub> concreteClass, kotlinx.serialization.b<Sub> concreteSerializer, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String h = concreteSerializer.getDescriptor().h();
        HashMap hashMap = this.b;
        Object obj2 = hashMap.get(baseClass);
        if (obj2 == null) {
            obj2 = new HashMap();
            hashMap.put(baseClass, obj2);
        }
        Map map = (Map) obj2;
        kotlinx.serialization.b bVar = (kotlinx.serialization.b) map.get(concreteClass);
        HashMap hashMap2 = this.d;
        Object obj3 = hashMap2.get(baseClass);
        if (obj3 == null) {
            obj3 = new HashMap();
            hashMap2.put(baseClass, obj3);
        }
        Map map2 = (Map) obj3;
        if (z) {
            if (bVar != null) {
                map2.remove(bVar.getDescriptor().h());
            }
            map.put(concreteClass, concreteSerializer);
            map2.put(h, concreteSerializer);
            return;
        }
        if (bVar != null) {
            if (!Intrinsics.areEqual(bVar, concreteSerializer)) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
                throw new c("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
            }
        }
        kotlinx.serialization.b bVar2 = (kotlinx.serialization.b) map2.get(h);
        if (bVar2 == null) {
            map.put(concreteClass, concreteSerializer);
            map2.put(h, concreteSerializer);
            return;
        }
        Object obj4 = hashMap.get(baseClass);
        Intrinsics.checkNotNull(obj4);
        Iterator it = MapsKt.asSequence((Map) obj4).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Map.Entry) obj).getValue() == bVar2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + h + "': '" + concreteClass + "' and '" + ((Map.Entry) obj) + '\'');
    }

    @JvmName(name = "registerSerializer")
    public final <T> void j(KClass<T> forClass, a provider, boolean z) {
        a aVar;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        HashMap hashMap = this.a;
        if (!z && (aVar = (a) hashMap.get(forClass)) != null && !Intrinsics.areEqual(aVar, provider)) {
            throw new c("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        hashMap.put(forClass, provider);
        if (C1173y0.c(forClass)) {
            this.f = true;
        }
    }
}
