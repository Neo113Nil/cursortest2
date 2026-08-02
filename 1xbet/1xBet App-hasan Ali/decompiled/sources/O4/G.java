package O4;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import v.AbstractC2527w;

/* loaded from: classes.dex */
public final class G extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4127d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4128e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0267m f4129g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4130h;

    public G(Method method, int i, InterfaceC0267m interfaceC0267m, String str) {
        this.f4128e = method;
        this.f = i;
        this.f4129g = interfaceC0267m;
        this.f4130h = str;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        InterfaceC0267m interfaceC0267m = this.f4129g;
        Object obj2 = this.f4130h;
        int i = this.f;
        Method method = this.f4128e;
        switch (this.f4127d) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    o5.c((y4.m) obj2, (y4.x) interfaceC0267m.g(obj));
                    return;
                } catch (IOException e3) {
                    throw Z.o(method, i, "Unable to convert " + obj + " to RequestBody", e3);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw Z.o(method, i, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw Z.o(method, i, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw Z.o(method, i, L1.a.n("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    o5.c(AbstractC2527w.e("Content-Disposition", L1.a.n("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2), (y4.x) interfaceC0267m.g(value));
                }
                return;
        }
    }

    public G(Method method, int i, y4.m mVar, InterfaceC0267m interfaceC0267m) {
        this.f4128e = method;
        this.f = i;
        this.f4130h = mVar;
        this.f4129g = interfaceC0267m;
    }
}
