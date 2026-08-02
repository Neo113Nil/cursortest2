package O4;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public final class E extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4122d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4123e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4124g;

    public /* synthetic */ E(Method method, int i, boolean z3, int i5) {
        this.f4122d = i5;
        this.f4123e = method;
        this.f = i;
        this.f4124g = z3;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        switch (this.f4122d) {
            case 0:
                Map map = (Map) obj;
                Method method = this.f4123e;
                int i = this.f;
                if (map == null) {
                    throw Z.o(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw Z.o(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw Z.o(method, i, L1.a.n("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw Z.o(method, i, "Field map value '" + value + "' converted to null by " + C0256b.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    o5.a(str, obj2, this.f4124g);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                Method method2 = this.f4123e;
                int i5 = this.f;
                if (map2 == null) {
                    throw Z.o(method2, i5, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw Z.o(method2, i5, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw Z.o(method2, i5, L1.a.n("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    o5.b(str2, value2.toString(), this.f4124g);
                }
                return;
            default:
                Map map3 = (Map) obj;
                Method method3 = this.f4123e;
                int i6 = this.f;
                if (map3 == null) {
                    throw Z.o(method3, i6, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw Z.o(method3, i6, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw Z.o(method3, i6, L1.a.n("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String obj3 = value3.toString();
                    if (obj3 == null) {
                        throw Z.o(method3, i6, "Query map value '" + value3 + "' converted to null by " + C0256b.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    o5.d(str3, obj3, this.f4124g);
                }
                return;
        }
    }
}
