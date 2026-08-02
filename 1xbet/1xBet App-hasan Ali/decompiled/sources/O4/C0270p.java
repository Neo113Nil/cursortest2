package O4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: O4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270p extends AbstractC0260f {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC0255a f4221a;

    public C0270p(ExecutorC0255a executorC0255a) {
        this.f4221a = executorC0255a;
    }

    @Override // O4.AbstractC0260f
    public final InterfaceC0261g a(Type type, Annotation[] annotationArr) {
        if (Z.h(type) != InterfaceC0259e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new v3.g(7, Z.g(0, (ParameterizedType) type), Z.l(annotationArr, U.class) ? null : this.f4221a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
