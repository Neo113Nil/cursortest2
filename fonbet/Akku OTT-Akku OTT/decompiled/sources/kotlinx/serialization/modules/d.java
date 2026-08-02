package kotlinx.serialization.modules;

import java.util.List;
import kotlin.reflect.KClass;
import kotlinx.serialization.k;

/* loaded from: classes5.dex */
public abstract class d {
    public abstract void a(f fVar);

    public abstract <T> kotlinx.serialization.b<T> b(KClass<T> kClass, List<? extends kotlinx.serialization.b<?>> list);

    public abstract boolean d();

    public abstract kotlinx.serialization.a e(String str, KClass kClass);

    public abstract <T> k<T> f(KClass<? super T> kClass, T t);
}
