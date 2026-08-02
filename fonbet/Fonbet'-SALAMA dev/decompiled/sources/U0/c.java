package U0;

import f6.C1116i;
import io.sentry.protocol.Request;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import t6.q;
import t6.s;

/* loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final t6.d f6379a;

    /* renamed from: b, reason: collision with root package name */
    public final Z0.b f6380b;

    public c(t6.d dVar, Z0.b bVar) {
        this.f6379a = dVar;
        this.f6380b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        t6.h.e(obj, "obj");
        t6.h.e(method, Request.JsonKeys.METHOD);
        boolean a2 = t6.h.a(method.getName(), "accept");
        Z0.b bVar = this.f6380b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((t6.h.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((t6.h.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (t6.h.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class cls = this.f6379a.f16464a;
        t6.h.e(cls, "jClass");
        Map map = t6.d.f16461b;
        t6.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            isInstance = s.b(num.intValue(), obj2);
        } else {
            isInstance = (cls.isPrimitive() ? r6.a.c(q.a(cls)) : cls).isInstance(obj2);
        }
        if (isInstance) {
            t6.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return C1116i.f13008a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            HashMap hashMap = t6.d.f16462c;
            if (isArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls.getName());
                if (str2 == null) {
                    str2 = cls.getCanonicalName();
                }
            }
        }
        sb.append(str2);
        throw new ClassCastException(sb.toString());
    }
}
