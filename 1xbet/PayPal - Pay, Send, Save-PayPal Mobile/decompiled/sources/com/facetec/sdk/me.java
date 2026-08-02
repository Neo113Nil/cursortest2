package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class me {
    public static final com.facetec.sdk.me c = new com.facetec.sdk.me.a().a();

    @javax.annotation.Nullable
    final com.facetec.sdk.pg d;
    final java.util.Set<com.facetec.sdk.me.c> e;

    me(java.util.Set<com.facetec.sdk.me.c> set, @javax.annotation.Nullable com.facetec.sdk.pg pgVar) {
        this.e = set;
        this.d = pgVar;
    }

    public final boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.facetec.sdk.me)) {
            return false;
        }
        com.facetec.sdk.me meVar = (com.facetec.sdk.me) obj;
        return com.facetec.sdk.nh.d(this.d, meVar.d) && this.e.equals(meVar.e);
    }

    public final int hashCode() {
        com.facetec.sdk.pg pgVar = this.d;
        return ((pgVar != null ? pgVar.hashCode() : 0) * 31) + this.e.hashCode();
    }

    public static java.lang.String e(java.security.cert.Certificate certificate) {
        if (!(certificate instanceof java.security.cert.X509Certificate)) {
            throw new java.lang.IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("sha256/");
        sb.append(e((java.security.cert.X509Certificate) certificate).d());
        return sb.toString();
    }

    private static com.facetec.sdk.pq e(java.security.cert.X509Certificate x509Certificate) {
        return com.facetec.sdk.pq.d(x509Certificate.getPublicKey().getEncoded()).b();
    }

    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* renamed from: a, reason: collision with root package name */
        private static int f3641a;
        private static int g;
        final java.lang.String b;
        final java.lang.String c;
        final com.facetec.sdk.pq d;
        final java.lang.String e;

        private static void f(short s, byte b, byte b2, java.lang.Object[] objArr) {
            int i = (s * 2) + 99;
            int i2 = 20 - (b2 * 17);
            byte[] bArr = $$a;
            int i3 = b * 17;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i = i3 + (-i) + 3;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i;
                i2++;
                if (i4 == i3) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i = i + (-bArr[i2]) + 3;
            }
        }

        static void init$0() {
            $$a = new byte[]{com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -25, 39, -86, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
        }

        public c(java.lang.String str, java.lang.String str2) {
            java.lang.String g2;
            this.c = str;
            if (str.startsWith("*.")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("http://");
                sb.append(str.substring(2));
                g2 = com.facetec.sdk.mv.c(sb.toString()).g();
            } else {
                g2 = com.facetec.sdk.mv.c("http://".concat(java.lang.String.valueOf(str))).g();
            }
            this.b = g2;
            if (str2.startsWith("sha1/")) {
                this.e = "sha1/";
                this.d = com.facetec.sdk.pq.e(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.e = "sha256/";
                this.d = com.facetec.sdk.pq.e(str2.substring(7));
            } else {
                throw new java.lang.IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(java.lang.String.valueOf(str2)));
            }
            if (this.d == null) {
                throw new java.lang.IllegalArgumentException("pins must be base64: ".concat(java.lang.String.valueOf(str2)));
            }
        }

        public static void c(long j, long j2) {
            int i = g;
            int i2 = (i ^ 11) + ((i & 11) << 1);
            f3641a = i2 % 128;
            java.lang.Object obj = null;
            if (i2 % 2 != 0) {
                com.facetec.sdk.by.e.class.getField(util.h.xy.cb.b.f1091).get(null);
                obj.hashCode();
                throw null;
            }
            java.lang.Object obj2 = com.facetec.sdk.by.e.class.getField(util.h.xy.cb.b.f1091).get(null);
            f3641a = (g + 105) % 128;
            try {
                byte[] bArr = $$a;
                byte b = bArr[9];
                byte b2 = (byte) (b - 1);
                byte b3 = b;
                java.lang.Object[] objArr = new java.lang.Object[1];
                f(b2, b3, b3, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b4 = bArr[9];
                byte b5 = (byte) (b4 - 1);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                f(b4, b5, b5, objArr2);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, null, obj2);
                int i3 = g + 84;
                f3641a = ((~i3) + (i3 << 1)) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.facetec.sdk.me.c)) {
                return false;
            }
            com.facetec.sdk.me.c cVar = (com.facetec.sdk.me.c) obj;
            return this.c.equals(cVar.c) && this.e.equals(cVar.e) && this.d.equals(cVar.d);
        }

        public final int hashCode() {
            return ((((this.c.hashCode() + 527) * 31) + this.e.hashCode()) * 31) + this.d.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.e);
            sb.append(this.d.d());
            return sb.toString();
        }

        static {
            init$0();
            f3641a = 0;
            g = 1;
        }
    }

    public static final class a {
        public final java.util.List<com.facetec.sdk.me.c> c = new java.util.ArrayList();

        public final com.facetec.sdk.me a() {
            return new com.facetec.sdk.me(new java.util.LinkedHashSet(this.c), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(java.lang.String str, java.util.List<java.security.cert.Certificate> list) throws javax.net.ssl.SSLPeerUnverifiedException {
        java.util.List emptyList = java.util.Collections.emptyList();
        for (com.facetec.sdk.me.c cVar : this.e) {
            if (cVar.c.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == cVar.b.length()) {
                    if (str.regionMatches(false, indexOf + 1, cVar.b, 0, cVar.b.length())) {
                        if (emptyList.isEmpty()) {
                            emptyList = new java.util.ArrayList();
                        }
                        emptyList.add(cVar);
                    }
                }
            } else if (str.equals(cVar.b)) {
                if (emptyList.isEmpty()) {
                }
                emptyList.add(cVar);
            }
        }
        if (emptyList.isEmpty()) {
            return;
        }
        com.facetec.sdk.pg pgVar = this.d;
        if (pgVar != null) {
            list = pgVar.e(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) list.get(i);
            int size2 = emptyList.size();
            com.facetec.sdk.pq pqVar = null;
            com.facetec.sdk.pq pqVar2 = null;
            for (int i2 = 0; i2 < size2; i2++) {
                com.facetec.sdk.me.c cVar2 = (com.facetec.sdk.me.c) emptyList.get(i2);
                if (cVar2.e.equals("sha256/")) {
                    if (pqVar == null) {
                        pqVar = e(x509Certificate);
                    }
                    if (cVar2.d.equals(pqVar)) {
                        return;
                    }
                } else if (cVar2.e.equals("sha1/")) {
                    if (pqVar2 == null) {
                        pqVar2 = com.facetec.sdk.pq.d(x509Certificate.getPublicKey().getEncoded()).c();
                    }
                    if (cVar2.d.equals(pqVar2)) {
                        return;
                    }
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unsupported hashAlgorithm: ");
                    sb.append(cVar2.e);
                    throw new java.lang.AssertionError(sb.toString());
                }
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) list.get(i3);
            sb2.append("\n    ");
            sb2.append(e((java.security.cert.Certificate) x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
        int size4 = emptyList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            java.lang.Object obj = emptyList.get(i4);
            sb2.append("\n    ");
            sb2.append(obj);
        }
        throw new javax.net.ssl.SSLPeerUnverifiedException(sb2.toString());
    }
}
