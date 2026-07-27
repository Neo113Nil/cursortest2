package d0;

import d2.C0279i;
import i0.C0329b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.t;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f4826a;

    /* renamed from: b, reason: collision with root package name */
    public final C0329b f4827b;

    public C0263c(kotlin.jvm.internal.e eVar, C0329b c0329b) {
        this.f4826a = eVar;
        this.f4827b = c0329b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        j.e(obj, "obj");
        j.e(method, "method");
        boolean a3 = j.a(method.getName(), "accept");
        C0329b c0329b = this.f4827b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a3 || objArr == null || objArr.length != 1) {
            if ((j.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((j.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(c0329b.hashCode());
            }
            if (j.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return c0329b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class jClass = this.f4826a.f9666a;
        j.e(jClass, "jClass");
        Map map = kotlin.jvm.internal.e.f9663b;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = t.b(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? F2.b.x(r.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            j.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0329b.invoke(obj2);
            return C0279i.f4852a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            HashMap hashMap = kotlin.jvm.internal.e.f9664c;
            if (isArray) {
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(jClass.getName());
                if (str2 == null) {
                    str2 = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str2);
        throw new ClassCastException(sb.toString());
    }
}
