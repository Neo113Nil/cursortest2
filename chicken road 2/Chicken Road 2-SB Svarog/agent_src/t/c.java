package t;

import a.AbstractC0018a;
import g0.l;
import g0.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import y.C0101b;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final g0.e f1255a;

    /* renamed from: b, reason: collision with root package name */
    public final C0101b f1256b;

    public c(g0.e eVar, C0101b c0101b) {
        this.f1255a = eVar;
        this.f1256b = c0101b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String b2;
        g0.h.e(obj, "obj");
        g0.h.e(method, "method");
        boolean a2 = g0.h.a(method.getName(), "accept");
        C0101b c0101b = this.f1256b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((g0.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((g0.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(c0101b.hashCode());
            }
            if (g0.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                r3 = true;
            }
            if (r3) {
                return c0101b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f1255a.f540a;
        g0.h.e(cls, "jClass");
        Map map = g0.e.f539b;
        g0.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = n.c(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? AbstractC0018a.k(l.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            g0.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0101b.i(obj2);
            return W.g.f394a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (b2 = n.b(componentType.getName())) != null) {
                    str = b2.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = n.b(cls.getName());
                if (str == null) {
                    str = cls.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new ClassCastException(sb.toString());
    }
}
