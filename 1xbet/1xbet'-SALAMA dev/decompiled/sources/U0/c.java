package U0;

import io.sentry.protocol.Request;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import t6.q;
import t6.s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.d f6379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z0.b f6380b;

    public c(t6.d dVar, Z0.b bVar) {
        this.f6379a = dVar;
        this.f6380b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        boolean zIsInstance;
        String str;
        t6.h.e(obj, "obj");
        t6.h.e(method, Request.JsonKeys.METHOD);
        boolean zA = t6.h.a(method.getName(), "accept");
        Z0.b bVar = this.f6380b;
        canonicalName = null;
        canonicalName = null;
        canonicalName = null;
        String canonicalName = null;
        if (!zA || objArr == null || objArr.length != 1) {
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
        Class cls = this.f6379a.f16470a;
        t6.h.e(cls, "jClass");
        Map map = t6.d.f16467b;
        t6.h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            zIsInstance = s.b(num.intValue(), obj2);
        } else {
            zIsInstance = (cls.isPrimitive() ? r6.a.c(q.a(cls)) : cls).isInstance(obj2);
        }
        if (zIsInstance) {
            t6.h.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            bVar.invoke(obj2);
            return p044f6.i.f13014a;
        }
        StringBuilder sb = new StringBuilder("Value cannot be cast to ");
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            HashMap map2 = t6.d.f16468c;
            if (zIsArray) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) map2.get(componentType.getName())) != null) {
                    canonicalName = str.concat("Array");
                }
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                canonicalName = (String) map2.get(cls.getName());
                if (canonicalName == null) {
                    canonicalName = cls.getCanonicalName();
                }
            }
        }
        sb.append(canonicalName);
        throw new ClassCastException(sb.toString());
    }
}
