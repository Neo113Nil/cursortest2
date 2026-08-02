package com.facetec.sdk;

/* loaded from: classes8.dex */
class oy extends com.facetec.sdk.pa {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.oz<java.net.Socket> f3735a;
    private final com.facetec.sdk.oz<java.net.Socket> b;
    private final com.facetec.sdk.oz<java.net.Socket> c;
    private final java.lang.Class<?> d;
    private final com.facetec.sdk.oz<java.net.Socket> e;
    private final com.facetec.sdk.oy.a f = com.facetec.sdk.oy.a.e();

    oy(java.lang.Class<?> cls, com.facetec.sdk.oz<java.net.Socket> ozVar, com.facetec.sdk.oz<java.net.Socket> ozVar2, com.facetec.sdk.oz<java.net.Socket> ozVar3, com.facetec.sdk.oz<java.net.Socket> ozVar4) {
        this.d = cls;
        this.b = ozVar;
        this.c = ozVar2;
        this.f3735a = ozVar3;
        this.e = ozVar4;
    }

    @Override // com.facetec.sdk.pa
    public final void c(java.net.Socket socket, java.net.InetSocketAddress inetSocketAddress, int i) throws java.io.IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (java.lang.AssertionError e2) {
            if (!com.facetec.sdk.nh.b(e2)) {
                throw e2;
            }
            throw new java.io.IOException(e2);
        } catch (java.lang.ClassCastException e3) {
            if (android.os.Build.VERSION.SDK_INT == 26) {
                java.io.IOException iOException = new java.io.IOException("Exception in connect");
                iOException.initCause(e3);
                throw iOException;
            }
            throw e3;
        } catch (java.lang.SecurityException e4) {
            java.io.IOException iOException2 = new java.io.IOException("Exception in connect");
            iOException2.initCause(e4);
            throw iOException2;
        }
    }

    @Override // com.facetec.sdk.pa
    public void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List<com.facetec.sdk.na> list) throws java.io.IOException {
        if (str != null) {
            this.b.e(sSLSocket, java.lang.Boolean.TRUE);
            this.c.e(sSLSocket, str);
        }
        com.facetec.sdk.oz<java.net.Socket> ozVar = this.e;
        if (ozVar == null || !ozVar.d(sSLSocket)) {
            return;
        }
        com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.facetec.sdk.na naVar = list.get(i);
            if (naVar != com.facetec.sdk.na.HTTP_1_0) {
                pkVar.g(naVar.toString().length());
                pkVar.c(naVar.toString());
            }
        }
        this.e.d(sSLSocket, pkVar.n());
    }

    @Override // com.facetec.sdk.pa
    @javax.annotation.Nullable
    public java.lang.String b(javax.net.ssl.SSLSocket sSLSocket) {
        byte[] bArr;
        com.facetec.sdk.oz<java.net.Socket> ozVar = this.f3735a;
        if (ozVar == null || !ozVar.d(sSLSocket) || (bArr = (byte[]) this.f3735a.d(sSLSocket, new java.lang.Object[0])) == null) {
            return null;
        }
        return new java.lang.String(bArr, com.facetec.sdk.nh.f3678a);
    }

    @Override // com.facetec.sdk.pa
    public final void d(int i, java.lang.String str, @javax.annotation.Nullable java.lang.Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append('\n');
            sb.append(android.util.Log.getStackTraceString(th));
            str = sb.toString();
        }
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = java.lang.Math.min(indexOf, i3 + 4000);
                android.util.Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i3 = min;
                }
            }
            i3 = min + 1;
        }
    }

    @Override // com.facetec.sdk.pa
    public final java.lang.Object d(java.lang.String str) {
        return this.f.a(str);
    }

    @Override // com.facetec.sdk.pa
    public final void a(java.lang.String str, java.lang.Object obj) {
        if (this.f.d(obj)) {
            return;
        }
        d(5, str, null);
    }

    @Override // com.facetec.sdk.pa
    public final boolean b(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return super.b(str);
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
            throw com.facetec.sdk.nh.d("unable to determine cleartext support", e);
        } catch (java.lang.IllegalArgumentException e3) {
            e = e3;
            throw com.facetec.sdk.nh.d("unable to determine cleartext support", e);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            e = e4;
            throw com.facetec.sdk.nh.d("unable to determine cleartext support", e);
        }
    }

    private boolean a(java.lang.String str, java.lang.Class<?> cls, java.lang.Object obj) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        try {
            return ((java.lang.Boolean) cls.getMethod("isCleartextTrafficPermitted", java.lang.String.class).invoke(obj, str)).booleanValue();
        } catch (java.lang.NoSuchMethodException unused) {
            return b(str, cls, obj);
        }
    }

    private boolean b(java.lang.String str, java.lang.Class<?> cls, java.lang.Object obj) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        try {
            return ((java.lang.Boolean) cls.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    private static boolean c() {
        if (java.security.Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            java.lang.Class.forName("android.net.Network");
            return true;
        } catch (java.lang.ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.facetec.sdk.pa
    public final com.facetec.sdk.pg a(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.net.http.X509TrustManagerExtensions");
            return new com.facetec.sdk.oy.e(cls.getConstructor(javax.net.ssl.X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", java.security.cert.X509Certificate[].class, java.lang.String.class, java.lang.String.class));
        } catch (java.lang.Exception unused) {
            return super.a(x509TrustManager);
        }
    }

    public static com.facetec.sdk.pa a() {
        java.lang.Class<?> cls;
        com.facetec.sdk.oz ozVar;
        com.facetec.sdk.oz ozVar2;
        if (!com.facetec.sdk.pa.g()) {
            return null;
        }
        try {
            try {
                cls = java.lang.Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (java.lang.ClassNotFoundException unused) {
                cls = java.lang.Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            java.lang.Class<?> cls2 = cls;
            com.facetec.sdk.oz ozVar3 = new com.facetec.sdk.oz(null, "setUseSessionTickets", java.lang.Boolean.TYPE);
            com.facetec.sdk.oz ozVar4 = new com.facetec.sdk.oz(null, "setHostname", java.lang.String.class);
            if (c()) {
                com.facetec.sdk.oz ozVar5 = new com.facetec.sdk.oz(byte[].class, "getAlpnSelectedProtocol", new java.lang.Class[0]);
                ozVar2 = new com.facetec.sdk.oz(null, "setAlpnProtocols", byte[].class);
                ozVar = ozVar5;
            } else {
                ozVar = null;
                ozVar2 = null;
            }
            return new com.facetec.sdk.oy(cls2, ozVar3, ozVar4, ozVar, ozVar2);
        } catch (java.lang.ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.facetec.sdk.pa
    public final com.facetec.sdk.pm e(javax.net.ssl.X509TrustManager x509TrustManager) {
        try {
            java.lang.reflect.Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", java.security.cert.X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new com.facetec.sdk.oy.c(x509TrustManager, declaredMethod);
        } catch (java.lang.NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    static final class e extends com.facetec.sdk.pg {
        private final java.lang.reflect.Method c;
        private final java.lang.Object e;

        public final int hashCode() {
            return 0;
        }

        e(java.lang.Object obj, java.lang.reflect.Method method) {
            this.e = obj;
            this.c = method;
        }

        @Override // com.facetec.sdk.pg
        public final java.util.List<java.security.cert.Certificate> e(java.util.List<java.security.cert.Certificate> list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException {
            try {
                return (java.util.List) this.c.invoke(this.e, (java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[list.size()]), "RSA", str);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            } catch (java.lang.reflect.InvocationTargetException e2) {
                javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            return obj instanceof com.facetec.sdk.oy.e;
        }
    }

    static final class a {
        private final java.lang.reflect.Method b;
        private final java.lang.reflect.Method c;
        private final java.lang.reflect.Method e;

        private a(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3) {
            this.e = method;
            this.c = method2;
            this.b = method3;
        }

        final java.lang.Object a(java.lang.String str) {
            java.lang.reflect.Method method = this.e;
            if (method != null) {
                try {
                    java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
                    this.c.invoke(invoke, str);
                    return invoke;
                } catch (java.lang.Exception unused) {
                }
            }
            return null;
        }

        final boolean d(java.lang.Object obj) {
            if (obj != null) {
                try {
                    this.b.invoke(obj, new java.lang.Object[0]);
                    return true;
                } catch (java.lang.Exception unused) {
                }
            }
            return false;
        }

        static com.facetec.sdk.oy.a e() {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method method3;
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new java.lang.Class[0]);
                method3 = cls.getMethod("open", java.lang.String.class);
                method2 = cls.getMethod("warnIfOpen", new java.lang.Class[0]);
            } catch (java.lang.Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new com.facetec.sdk.oy.a(method, method3, method2);
        }
    }

    static final class c implements com.facetec.sdk.pm {

        /* renamed from: a, reason: collision with root package name */
        private final javax.net.ssl.X509TrustManager f3736a;
        private final java.lang.reflect.Method b;

        c(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
            this.b = method;
            this.f3736a = x509TrustManager;
        }

        @Override // com.facetec.sdk.pm
        public final java.security.cert.X509Certificate e(java.security.cert.X509Certificate x509Certificate) {
            try {
                java.security.cert.TrustAnchor trustAnchor = (java.security.cert.TrustAnchor) this.b.invoke(this.f3736a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (java.lang.IllegalAccessException e) {
                throw com.facetec.sdk.nh.d("unable to get issues and signature", (java.lang.Exception) e);
            } catch (java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.facetec.sdk.oy.c)) {
                return false;
            }
            com.facetec.sdk.oy.c cVar = (com.facetec.sdk.oy.c) obj;
            return this.f3736a.equals(cVar.f3736a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.f3736a.hashCode() + (this.b.hashCode() * 31);
        }
    }

    @Override // com.facetec.sdk.pa
    public final javax.net.ssl.SSLContext b() {
        try {
            return javax.net.ssl.SSLContext.getInstance("TLS");
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new java.lang.IllegalStateException("No TLS provider", e2);
        }
    }

    static int e() {
        try {
            return android.os.Build.VERSION.SDK_INT;
        } catch (java.lang.NoClassDefFoundError unused) {
            return 0;
        }
    }
}
