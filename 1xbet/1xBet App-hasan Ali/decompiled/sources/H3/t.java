package H3;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2363b;

    public t(Method method) {
        this.f2363b = method;
    }

    @Override // H3.v
    public final Object a(Class cls) {
        String h3 = j3.i.h(cls);
        if (h3 == null) {
            return this.f2363b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(h3));
    }
}
