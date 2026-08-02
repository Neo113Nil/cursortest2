package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mt extends com.facetec.sdk.my {
    private static final byte[] b;
    public static final com.facetec.sdk.mr d;
    public static final com.facetec.sdk.mr e = com.facetec.sdk.mr.e("multipart/mixed");
    private static final byte[] f;
    private static final byte[] h;
    private final com.facetec.sdk.pq g;
    private final com.facetec.sdk.mr i;
    private final com.facetec.sdk.mr j;
    private long l = -1;
    private final java.util.List<com.facetec.sdk.mt.c> n;

    static {
        com.facetec.sdk.mr.e("multipart/alternative");
        com.facetec.sdk.mr.e("multipart/digest");
        com.facetec.sdk.mr.e("multipart/parallel");
        d = com.facetec.sdk.mr.e(androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_MULTIPART);
        b = new byte[]{58, 32};
        h = new byte[]{13, 10};
        f = new byte[]{45, 45};
    }

    public mt(com.facetec.sdk.pq pqVar, com.facetec.sdk.mr mrVar, java.util.List<com.facetec.sdk.mt.c> list) {
        this.g = pqVar;
        this.j = mrVar;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(mrVar);
        sb.append("; boundary=");
        sb.append(pqVar.e());
        this.i = com.facetec.sdk.mr.e(sb.toString());
        this.n = com.facetec.sdk.nh.e(list);
    }

    @Override // com.facetec.sdk.my
    public final com.facetec.sdk.mr c() {
        return this.i;
    }

    @Override // com.facetec.sdk.my
    public final long a() throws java.io.IOException {
        long j = this.l;
        if (j != -1) {
            return j;
        }
        long a2 = a(null, true);
        this.l = a2;
        return a2;
    }

    @Override // com.facetec.sdk.my
    public final void d(com.facetec.sdk.pj pjVar) throws java.io.IOException {
        a(pjVar, false);
    }

    private long a(@javax.annotation.Nullable com.facetec.sdk.pj pjVar, boolean z) throws java.io.IOException {
        com.facetec.sdk.pj pjVar2;
        com.facetec.sdk.pk pkVar;
        if (z) {
            pkVar = new com.facetec.sdk.pk();
            pjVar2 = pkVar;
        } else {
            pjVar2 = pjVar;
            pkVar = null;
        }
        int size = this.n.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            com.facetec.sdk.mt.c cVar = this.n.get(i);
            com.facetec.sdk.mm mmVar = cVar.b;
            com.facetec.sdk.my myVar = cVar.f3661a;
            pjVar2.c(f);
            pjVar2.b(this.g);
            pjVar2.c(h);
            if (mmVar != null) {
                int e2 = mmVar.e();
                for (int i2 = 0; i2 < e2; i2++) {
                    pjVar2.c(mmVar.a(i2)).c(b).c(mmVar.e(i2)).c(h);
                }
            }
            com.facetec.sdk.mr c2 = myVar.c();
            if (c2 != null) {
                pjVar2.c("Content-Type: ").c(c2.toString()).c(h);
            }
            long a2 = myVar.a();
            if (a2 != -1) {
                pjVar2.c("Content-Length: ").l(a2).c(h);
            } else if (z) {
                pkVar.q();
                return -1L;
            }
            byte[] bArr = h;
            pjVar2.c(bArr);
            if (z) {
                j += a2;
            } else {
                myVar.d(pjVar2);
            }
            pjVar2.c(bArr);
        }
        byte[] bArr2 = f;
        pjVar2.c(bArr2);
        pjVar2.b(this.g);
        pjVar2.c(bArr2);
        pjVar2.c(h);
        if (!z) {
            return j;
        }
        long e3 = j + pkVar.e();
        pkVar.q();
        return e3;
    }

    static java.lang.StringBuilder b(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
        return sb;
    }

    public static final class c {
        public static int c;
        public static int d;

        /* renamed from: a, reason: collision with root package name */
        final com.facetec.sdk.my f3661a;

        @javax.annotation.Nullable
        final com.facetec.sdk.mm b;

        private static com.facetec.sdk.mt.c a(@javax.annotation.Nullable com.facetec.sdk.mm mmVar, com.facetec.sdk.my myVar) {
            if (myVar == null) {
                throw new java.lang.NullPointerException("body == null");
            }
            if (mmVar != null && mmVar.c("Content-Type") != null) {
                throw new java.lang.IllegalArgumentException("Unexpected header: Content-Type");
            }
            if (mmVar != null && mmVar.c("Content-Length") != null) {
                throw new java.lang.IllegalArgumentException("Unexpected header: Content-Length");
            }
            return new com.facetec.sdk.mt.c(mmVar, myVar);
        }

        public static com.facetec.sdk.mt.c d(java.lang.String str, @javax.annotation.Nullable java.lang.String str2, com.facetec.sdk.my myVar) {
            if (str == null) {
                throw new java.lang.NullPointerException("name == null");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("form-data; name=");
            com.facetec.sdk.mt.b(sb, str);
            if (str2 != null) {
                sb.append("; filename=");
                com.facetec.sdk.mt.b(sb, str2);
            }
            return a(new com.facetec.sdk.mm.b().e("Content-Disposition", sb.toString()).b(), myVar);
        }

        private c(@javax.annotation.Nullable com.facetec.sdk.mm mmVar, com.facetec.sdk.my myVar) {
            this.b = mmVar;
            this.f3661a = myVar;
        }

        public static int d() {
            int i = d;
            d = i + 1;
            if (i % 7532049 != 0) {
                return c;
            }
            int myTid = android.os.Process.myTid();
            c = myTid;
            return myTid;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final com.facetec.sdk.pq f3662a;
        public com.facetec.sdk.mr b;
        public final java.util.List<com.facetec.sdk.mt.c> c;

        public d() {
            this(java.util.UUID.randomUUID().toString());
        }

        private d(java.lang.String str) {
            this.b = com.facetec.sdk.mt.e;
            this.c = new java.util.ArrayList();
            this.f3662a = com.facetec.sdk.pq.d(str);
        }

        public final com.facetec.sdk.mt.d d(com.facetec.sdk.mt.c cVar) {
            if (cVar == null) {
                throw new java.lang.NullPointerException("part == null");
            }
            this.c.add(cVar);
            return this;
        }
    }
}
