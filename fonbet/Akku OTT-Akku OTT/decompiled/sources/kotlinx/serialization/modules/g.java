package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.k;
import kotlinx.serialization.modules.a;

/* loaded from: classes5.dex */
public final class g implements f {
    public final /* synthetic */ e a;

    public g(e eVar) {
        this.a = eVar;
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base, Sub extends Base> void a(KClass<Base> baseClass, KClass<Sub> actualClass, kotlinx.serialization.b<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        this.a.i(baseClass, actualClass, actualSerializer, true);
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base> void b(KClass<Base> baseClass, Function1<? super String, ? extends kotlinx.serialization.a<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        this.a.g(baseClass, defaultDeserializerProvider, true);
    }

    @Override // kotlinx.serialization.modules.f
    public final <T> void c(KClass<T> kClass, kotlinx.serialization.b<T> serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.a.j(kClass, new a.C0164a(serializer), true);
    }

    @Override // kotlinx.serialization.modules.f
    public final <Base> void d(KClass<Base> baseClass, Function1<? super Base, ? extends k<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        this.a.h(baseClass, defaultSerializerProvider, true);
    }

    @Override // kotlinx.serialization.modules.f
    public final <T> void e(KClass<T> kClass, Function1<? super List<? extends kotlinx.serialization.b<?>>, ? extends kotlinx.serialization.b<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.a.j(kClass, new a.b(provider), true);
    }
}
