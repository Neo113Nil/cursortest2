package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mj {

    /* renamed from: a, reason: collision with root package name */
    public static final com.facetec.sdk.mj f3647a;
    public static final com.facetec.sdk.mj e;
    private static final com.facetec.sdk.mc[] f;
    private static final com.facetec.sdk.mc[] j;

    @javax.annotation.Nullable
    final java.lang.String[] b;
    final boolean c;
    final boolean d;

    @javax.annotation.Nullable
    final java.lang.String[] h;

    static {
        com.facetec.sdk.mc[] mcVarArr = {com.facetec.sdk.mc.l, com.facetec.sdk.mc.p, com.facetec.sdk.mc.q, com.facetec.sdk.mc.r, com.facetec.sdk.mc.s, com.facetec.sdk.mc.h, com.facetec.sdk.mc.k, com.facetec.sdk.mc.g, com.facetec.sdk.mc.n, com.facetec.sdk.mc.m, com.facetec.sdk.mc.f3640o};
        f = mcVarArr;
        com.facetec.sdk.mc[] mcVarArr2 = {com.facetec.sdk.mc.l, com.facetec.sdk.mc.p, com.facetec.sdk.mc.q, com.facetec.sdk.mc.r, com.facetec.sdk.mc.s, com.facetec.sdk.mc.h, com.facetec.sdk.mc.k, com.facetec.sdk.mc.g, com.facetec.sdk.mc.n, com.facetec.sdk.mc.m, com.facetec.sdk.mc.f3640o, com.facetec.sdk.mc.f, com.facetec.sdk.mc.j, com.facetec.sdk.mc.d, com.facetec.sdk.mc.i, com.facetec.sdk.mc.b, com.facetec.sdk.mc.f3639a, com.facetec.sdk.mc.c};
        j = mcVarArr2;
        new com.facetec.sdk.mj.b(true).c(mcVarArr).c(com.facetec.sdk.nb.TLS_1_3, com.facetec.sdk.nb.TLS_1_2).a().e();
        f3647a = new com.facetec.sdk.mj.b(true).c(mcVarArr2).c(com.facetec.sdk.nb.TLS_1_3, com.facetec.sdk.nb.TLS_1_2, com.facetec.sdk.nb.TLS_1_1, com.facetec.sdk.nb.TLS_1_0).a().e();
        new com.facetec.sdk.mj.b(true).c(mcVarArr2).c(com.facetec.sdk.nb.TLS_1_0).a().e();
        e = new com.facetec.sdk.mj.b(false).e();
    }

    mj(com.facetec.sdk.mj.b bVar) {
        this.d = bVar.c;
        this.b = bVar.f3648a;
        this.h = bVar.b;
        this.c = bVar.d;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean e(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.d) {
            return false;
        }
        if (this.h == null || com.facetec.sdk.nh.d(com.facetec.sdk.nh.i, this.h, sSLSocket.getEnabledProtocols())) {
            return this.b == null || com.facetec.sdk.nh.d(com.facetec.sdk.mc.e, this.b, sSLSocket.getEnabledCipherSuites());
        }
        return false;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof com.facetec.sdk.mj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.facetec.sdk.mj mjVar = (com.facetec.sdk.mj) obj;
        boolean z = this.d;
        if (z != mjVar.d) {
            return false;
        }
        return !z || (java.util.Arrays.equals(this.b, mjVar.b) && java.util.Arrays.equals(this.h, mjVar.h) && this.c == mjVar.c);
    }

    public final int hashCode() {
        if (!this.d) {
            return 17;
        }
        return ((((java.util.Arrays.hashCode(this.b) + 527) * 31) + java.util.Arrays.hashCode(this.h)) * 31) + (!this.c ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (!this.d) {
            return "ConnectionSpec()";
        }
        java.lang.String[] strArr = this.b;
        java.lang.String str2 = "[all enabled]";
        if (strArr != null) {
            str = (strArr != null ? com.facetec.sdk.mc.a(strArr) : null).toString();
        } else {
            str = "[all enabled]";
        }
        java.lang.String[] strArr2 = this.h;
        if (strArr2 != null) {
            str2 = (strArr2 != null ? com.facetec.sdk.nb.b(strArr2) : null).toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @javax.annotation.Nullable
        java.lang.String[] f3648a;

        @javax.annotation.Nullable
        java.lang.String[] b;
        boolean c;
        boolean d;

        b(boolean z) {
            this.c = z;
        }

        public b(com.facetec.sdk.mj mjVar) {
            this.c = mjVar.d;
            this.f3648a = mjVar.b;
            this.b = mjVar.h;
            this.d = mjVar.c;
        }

        public final com.facetec.sdk.mj.b c(com.facetec.sdk.mc... mcVarArr) {
            if (!this.c) {
                throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
            }
            java.lang.String[] strArr = new java.lang.String[mcVarArr.length];
            for (int i = 0; i < mcVarArr.length; i++) {
                strArr[i] = mcVarArr[i].t;
            }
            return c(strArr);
        }

        public final com.facetec.sdk.mj.b c(java.lang.String... strArr) {
            if (!this.c) {
                throw new java.lang.IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
            }
            this.f3648a = (java.lang.String[]) strArr.clone();
            return this;
        }

        public final com.facetec.sdk.mj.b c(com.facetec.sdk.nb... nbVarArr) {
            if (!this.c) {
                throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
            }
            java.lang.String[] strArr = new java.lang.String[nbVarArr.length];
            for (int i = 0; i < nbVarArr.length; i++) {
                strArr[i] = nbVarArr[i].c;
            }
            return b(strArr);
        }

        public final com.facetec.sdk.mj.b b(java.lang.String... strArr) {
            if (!this.c) {
                throw new java.lang.IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new java.lang.IllegalArgumentException("At least one TLS version is required");
            }
            this.b = (java.lang.String[]) strArr.clone();
            return this;
        }

        public final com.facetec.sdk.mj.b a() {
            if (!this.c) {
                throw new java.lang.IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = true;
            return this;
        }

        public final com.facetec.sdk.mj e() {
            return new com.facetec.sdk.mj(this);
        }
    }
}
