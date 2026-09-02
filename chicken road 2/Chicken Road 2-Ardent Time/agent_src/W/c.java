package W;

/* loaded from: classes.dex */
public final class c implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.d f1809a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.C0092b f1810b;

    public c(kotlin.jvm.internal.d dVar, b0.C0092b c0092b) {
        this.f1809a = dVar;
        this.f1810b = c0092b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        boolean isInstance;
        java.lang.String b2;
        kotlin.jvm.internal.i.e(obj, "obj");
        kotlin.jvm.internal.i.e(method, "method");
        boolean a2 = kotlin.jvm.internal.i.a(method.getName(), "accept");
        b0.C0092b c0092b = this.f1810b;
        r2 = null;
        r2 = null;
        r2 = null;
        java.lang.String str = null;
        if (!a2 || objArr == null || objArr.length != 1) {
            if ((kotlin.jvm.internal.i.a(method.getName(), "equals") && method.getReturnType().equals(java.lang.Boolean.TYPE) && objArr != null && objArr.length == 1) == true) {
                return java.lang.Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if ((kotlin.jvm.internal.i.a(method.getName(), "hashCode") && method.getReturnType().equals(java.lang.Integer.TYPE) && objArr == null) == true) {
                return java.lang.Integer.valueOf(c0092b.hashCode());
            }
            if (kotlin.jvm.internal.i.a(method.getName(), "toString") && method.getReturnType().equals(java.lang.String.class) && objArr == null) {
                return c0092b.toString();
            }
            throw new java.lang.UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
        java.lang.Object obj2 = objArr[0];
        java.lang.Class jClass = this.f1809a.f7954a;
        kotlin.jvm.internal.i.e(jClass, "jClass");
        java.util.Map map = kotlin.jvm.internal.d.f7953b;
        kotlin.jvm.internal.i.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        java.lang.Integer num = (java.lang.Integer) map.get(jClass);
        if (num != null) {
            isInstance = kotlin.jvm.internal.s.c(num.intValue(), obj2);
        } else {
            isInstance = (jClass.isPrimitive() ? Q1.d.n(kotlin.jvm.internal.q.a(jClass)) : jClass).isInstance(obj2);
        }
        if (isInstance) {
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            c0092b.invoke(obj2);
            return h1.C0177i.f3302a;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Value cannot be cast to ");
        if (!jClass.isAnonymousClass() && !jClass.isLocalClass()) {
            if (jClass.isArray()) {
                java.lang.Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (b2 = kotlin.jvm.internal.s.b(componentType.getName())) != null) {
                    str = b2.concat("Array");
                }
                if (str == null) {
                    str = "kotlin.Array";
                }
            } else {
                str = kotlin.jvm.internal.s.b(jClass.getName());
                if (str == null) {
                    str = jClass.getCanonicalName();
                }
            }
        }
        sb.append(str);
        throw new java.lang.ClassCastException(sb.toString());
    }
}
