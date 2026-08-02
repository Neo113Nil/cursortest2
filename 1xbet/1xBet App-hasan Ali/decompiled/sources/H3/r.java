package H3;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2360c;

    public r(Method method, Object obj) {
        this.f2359b = method;
        this.f2360c = obj;
    }

    @Override // H3.v
    public final Object a(Class cls) {
        String h3 = j3.i.h(cls);
        if (h3 == null) {
            return this.f2359b.invoke(this.f2360c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(h3));
    }
}
