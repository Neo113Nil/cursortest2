package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.k;

/* loaded from: classes5.dex */
public interface f {
    <Base, Sub extends Base> void a(KClass<Base> kClass, KClass<Sub> kClass2, kotlinx.serialization.b<Sub> bVar);

    <Base> void b(KClass<Base> kClass, Function1<? super String, ? extends kotlinx.serialization.a<? extends Base>> function1);

    <T> void c(KClass<T> kClass, kotlinx.serialization.b<T> bVar);

    <Base> void d(KClass<Base> kClass, Function1<? super Base, ? extends k<? super Base>> function1);

    <T> void e(KClass<T> kClass, Function1<? super List<? extends kotlinx.serialization.b<?>>, ? extends kotlinx.serialization.b<?>> function1);
}
