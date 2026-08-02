package O4;

import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class C extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final Method f4117d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4118e;
    public final InterfaceC0267m f;

    public C(Method method, int i, InterfaceC0267m interfaceC0267m) {
        this.f4117d = method;
        this.f4118e = i;
        this.f = interfaceC0267m;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        Method method = this.f4117d;
        int i = this.f4118e;
        if (obj == null) {
            throw Z.o(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            o5.f4155k = (y4.x) this.f.g(obj);
        } catch (IOException e3) {
            throw Z.p(method, e3, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
