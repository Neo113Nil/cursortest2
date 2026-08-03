package Q1;

/* loaded from: classes.dex */
public final class i implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f1625a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1626b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1627c;

    public i(java.util.ArrayList arrayList) {
        this.f1625a = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        kotlin.jvm.internal.i.e(proxy, "proxy");
        kotlin.jvm.internal.i.e(method, "method");
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.lang.String name = method.getName();
        java.lang.Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.i.a(name, "supports") && kotlin.jvm.internal.i.a(java.lang.Boolean.TYPE, returnType)) {
            return java.lang.Boolean.TRUE;
        }
        if (kotlin.jvm.internal.i.a(name, "unsupported") && kotlin.jvm.internal.i.a(java.lang.Void.TYPE, returnType)) {
            this.f1626b = true;
            return null;
        }
        boolean a2 = kotlin.jvm.internal.i.a(name, "protocols");
        java.util.ArrayList arrayList = this.f1625a;
        if (a2 && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.i.a(name, "selectProtocol") || kotlin.jvm.internal.i.a(name, "select")) && java.lang.String.class.equals(returnType) && objArr.length == 1) {
            java.lang.Object obj = objArr[0];
            if (obj instanceof java.util.List) {
                if (obj == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                }
                java.util.List list = (java.util.List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        java.lang.Object obj2 = list.get(i2);
                        if (obj2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        java.lang.String str = (java.lang.String) obj2;
                        if (arrayList.contains(str)) {
                            this.f1627c = str;
                            return str;
                        }
                        if (i2 == size) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                java.lang.String str2 = (java.lang.String) arrayList.get(0);
                this.f1627c = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.i.a(name, "protocolSelected") && !kotlin.jvm.internal.i.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, java.util.Arrays.copyOf(objArr, objArr.length));
        }
        java.lang.Object obj3 = objArr[0];
        if (obj3 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f1627c = (java.lang.String) obj3;
        return null;
    }
}
