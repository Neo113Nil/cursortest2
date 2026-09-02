package x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.e f6760a;

    /* renamed from: b, reason: collision with root package name */
    public final C.b f6761b;

    public C0858c(kotlin.jvm.internal.e eVar, C.b bVar) {
        this.f6760a = eVar;
        this.f6761b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean isInstance;
        String str;
        kotlin.jvm.internal.j.e(obj, "obj");
        kotlin.jvm.internal.j.e(method, "method");
        boolean a2 = kotlin.jvm.internal.j.a(method.getName(), "accept");
        C.b bVar = this.f6761b;
        r2 = null;
        r2 = null;
        r2 = null;
        String str2 = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((kotlin.jvm.internal.j.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((kotlin.jvm.internal.j.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) == true) {
                return Integer.valueOf(bVar.hashCode());
            }
            if (kotlin.jvm.internal.j.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                return bVar.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        Object obj2 = objArr[0];
        Class jClass = this.f6760a.f6077a;
        kotlin.jvm.internal.j.e(jClass, "jClass");
        Map map = kotlin.jvm.internal.e.f6074b;
        kotlin.jvm.internal.j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            isInstance = p.b(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? V.a.n(n.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return K0.i.f206a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            HashMap hashMap = kotlin.jvm.internal.e.f6075c;
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
