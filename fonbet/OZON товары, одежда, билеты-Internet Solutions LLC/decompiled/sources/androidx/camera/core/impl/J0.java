package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.Set;

/* loaded from: classes8.dex */
public interface J0 extends T {
    @Override // androidx.camera.core.impl.T
    default <ValueT> ValueT a(@NonNull T.a<ValueT> aVar) {
        return (ValueT) s().a(aVar);
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    default Set<T.b> b(@NonNull T.a<?> aVar) {
        return s().b(aVar);
    }

    @Override // androidx.camera.core.impl.T
    default <ValueT> ValueT c(@NonNull T.a<ValueT> aVar, ValueT valuet) {
        return (ValueT) s().c(aVar, valuet);
    }

    @Override // androidx.camera.core.impl.T
    default boolean d(@NonNull T.a<?> aVar) {
        return s().d(aVar);
    }

    @Override // androidx.camera.core.impl.T
    default void e(@NonNull B.i iVar) {
        s().e(iVar);
    }

    @Override // androidx.camera.core.impl.T
    default <ValueT> ValueT f(@NonNull T.a<ValueT> aVar, @NonNull T.b bVar) {
        return (ValueT) s().f(aVar, bVar);
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    default Set<T.a<?>> g() {
        return s().g();
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    default T.b h(@NonNull T.a<?> aVar) {
        return s().h(aVar);
    }

    @NonNull
    T s();
}
