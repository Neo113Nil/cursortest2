package H3;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f2361b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2362c;

    public s(Method method, int i) {
        this.f2361b = method;
        this.f2362c = i;
    }

    @Override // H3.v
    public final Object a(Class cls) {
        String h3 = j3.i.h(cls);
        if (h3 == null) {
            return this.f2361b.invoke(null, cls, Integer.valueOf(this.f2362c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(h3));
    }
}
