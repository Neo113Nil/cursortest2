package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class my {

    /* renamed from: a, reason: collision with root package name */
    public static int f3670a;
    public static int c;

    public long a() throws java.io.IOException {
        return -1L;
    }

    @javax.annotation.Nullable
    public abstract com.facetec.sdk.mr c();

    public abstract void d(com.facetec.sdk.pj pjVar) throws java.io.IOException;

    public static com.facetec.sdk.my c(@javax.annotation.Nullable com.facetec.sdk.mr mrVar, java.lang.String str) {
        java.nio.charset.Charset charset = com.facetec.sdk.nh.f3678a;
        if (mrVar != null && (charset = mrVar.d()) == null) {
            charset = com.facetec.sdk.nh.f3678a;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(mrVar);
            sb.append("; charset=utf-8");
            mrVar = com.facetec.sdk.mr.d(sb.toString());
        }
        return b(mrVar, str.getBytes(charset));
    }

    public static com.facetec.sdk.my b(@javax.annotation.Nullable com.facetec.sdk.mr mrVar, byte[] bArr) {
        return c(mrVar, bArr, bArr.length);
    }

    private static com.facetec.sdk.my c(@javax.annotation.Nullable com.facetec.sdk.mr mrVar, byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("content == null");
        }
        com.facetec.sdk.nh.d(bArr.length, 0L, i);
        return new com.facetec.sdk.my(i, bArr, 0) { // from class: com.facetec.sdk.my.1
            private /* synthetic */ byte[] b;
            private /* synthetic */ int e;
            private /* synthetic */ int f = 0;

            @Override // com.facetec.sdk.my
            @javax.annotation.Nullable
            public final com.facetec.sdk.mr c() {
                return com.facetec.sdk.mr.this;
            }

            @Override // com.facetec.sdk.my
            public final long a() {
                return this.e;
            }

            @Override // com.facetec.sdk.my
            public final void d(com.facetec.sdk.pj pjVar) throws java.io.IOException {
                pjVar.e(this.b, this.f, this.e);
            }
        };
    }

    public static int b() {
        int i = f3670a;
        f3670a = i + 1;
        if (i % 8598051 != 0) {
            return c;
        }
        int myPid = android.os.Process.myPid();
        c = myPid;
        return myPid;
    }
}
