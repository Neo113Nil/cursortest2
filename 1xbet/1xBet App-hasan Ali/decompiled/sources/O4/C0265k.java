package O4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: O4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265k extends AbstractC0260f {
    @Override // O4.AbstractC0260f
    public final InterfaceC0261g a(Type type, Annotation[] annotationArr) {
        if (Z.h(type) != A0.V.i()) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type g5 = Z.g(0, (ParameterizedType) type);
        if (Z.h(g5) != S.class) {
            return new H3.f(1, g5);
        }
        if (!(g5 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new H3.f(2, Z.g(0, (ParameterizedType) g5));
    }
}
