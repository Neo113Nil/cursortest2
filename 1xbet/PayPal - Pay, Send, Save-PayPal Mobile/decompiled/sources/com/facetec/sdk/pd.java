package com.facetec.sdk;

/* loaded from: classes8.dex */
final class pd extends com.facetec.sdk.pa {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Class<?> f3740a;
    private final java.lang.Class<?> b;
    private final java.lang.reflect.Method c;
    private final java.lang.reflect.Method d;
    private final java.lang.reflect.Method e;

    private pd(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        this.e = method;
        this.c = method2;
        this.d = method3;
        this.b = cls;
        this.f3740a = cls2;
    }

    @Override // com.facetec.sdk.pa
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<com.facetec.sdk.na> list) {
        try {
            this.e.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(com.facetec.sdk.pa.class.getClassLoader(), new java.lang.Class[]{this.b, this.f3740a}, new com.facetec.sdk.pd.d(e(list))));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw com.facetec.sdk.nh.d("unable to set alpn", (java.lang.Exception) e);
        }
    }

    @Override // com.facetec.sdk.pa
    public final void d(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.d.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw com.facetec.sdk.nh.d("unable to remove alpn", (java.lang.Exception) e);
        }
    }

    @Override // com.facetec.sdk.pa
    @javax.annotation.Nullable
    public final java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            com.facetec.sdk.pd.d dVar = (com.facetec.sdk.pd.d) java.lang.reflect.Proxy.getInvocationHandler(this.c.invoke(null, sSLSocket));
            if (!dVar.e && dVar.f3741a == null) {
                com.facetec.sdk.pa.d().d(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (dVar.e) {
                return null;
            }
            return dVar.f3741a;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw com.facetec.sdk.nh.d("unable to get selected protocol", (java.lang.Exception) e);
        }
    }

    public static com.facetec.sdk.pa c() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN");
            java.lang.Class<?> cls2 = java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
            return new com.facetec.sdk.pd(cls.getMethod("put", javax.net.ssl.SSLSocket.class, cls2), cls.getMethod("get", javax.net.ssl.SSLSocket.class), cls.getMethod("remove", javax.net.ssl.SSLSocket.class), java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), java.lang.Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"));
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    static final class d implements java.lang.reflect.InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f3741a;
        private final java.util.List<java.lang.String> c;
        boolean e;

        d(java.util.List<java.lang.String> list) {
            this.c = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
            java.lang.String name2 = method.getName();
            java.lang.Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = com.facetec.sdk.nh.d;
            }
            if (name2.equals("supports") && java.lang.Boolean.TYPE == returnType) {
                return java.lang.Boolean.TRUE;
            }
            if (name2.equals("unsupported") && java.lang.Void.TYPE == returnType) {
                this.e = true;
                return null;
            }
            if (name2.equals("protocols") && objArr.length == 0) {
                return this.c;
            }
            if ((name2.equals("selectProtocol") || name2.equals("select")) && java.lang.String.class == returnType && objArr.length == 1) {
                java.lang.Object obj2 = objArr[0];
                if (obj2 instanceof java.util.List) {
                    java.util.List list = (java.util.List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.c.contains(list.get(i))) {
                            java.lang.String str = (java.lang.String) list.get(i);
                            this.f3741a = str;
                            return str;
                        }
                    }
                    java.lang.String str2 = this.c.get(0);
                    this.f3741a = str2;
                    return str2;
                }
            }
            if ((name2.equals("protocolSelected") || name2.equals(com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag)) && objArr.length == 1) {
                this.f3741a = (java.lang.String) objArr[0];
                return null;
            }
            return method.invoke(this, objArr);
        }
    }
}
