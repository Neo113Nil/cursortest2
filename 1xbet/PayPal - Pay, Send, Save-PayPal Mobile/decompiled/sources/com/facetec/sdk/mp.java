package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mp extends com.facetec.sdk.my {
    private static final com.facetec.sdk.mr b = com.facetec.sdk.mr.e("application/x-www-form-urlencoded");
    private final java.util.List<java.lang.String> d;
    private final java.util.List<java.lang.String> e;

    mp(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.e = com.facetec.sdk.nh.e(list);
        this.d = com.facetec.sdk.nh.e(list2);
    }

    @Override // com.facetec.sdk.my
    public final com.facetec.sdk.mr c() {
        return b;
    }

    @Override // com.facetec.sdk.my
    public final long a() {
        return a(null, true);
    }

    @Override // com.facetec.sdk.my
    public final void d(com.facetec.sdk.pj pjVar) throws java.io.IOException {
        a(pjVar, false);
    }

    private long a(@javax.annotation.Nullable com.facetec.sdk.pj pjVar, boolean z) {
        com.facetec.sdk.pk c;
        if (z) {
            c = new com.facetec.sdk.pk();
        } else {
            c = pjVar.c();
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c.g(38);
            }
            c.c(this.e.get(i));
            c.g(61);
            c.c(this.d.get(i));
        }
        if (!z) {
            return 0L;
        }
        long e = c.e();
        c.q();
        return e;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final java.util.List<java.lang.String> f3655a;
        private final java.util.List<java.lang.String> c;
        private final java.nio.charset.Charset e;

        public a() {
            this((byte) 0);
        }

        private a(byte b) {
            this.f3655a = new java.util.ArrayList();
            this.c = new java.util.ArrayList();
            this.e = null;
        }

        public final com.facetec.sdk.mp.a a(java.lang.String str, java.lang.String str2) {
            if (str == null) {
                throw new java.lang.NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new java.lang.NullPointerException("value == null");
            }
            this.f3655a.add(com.facetec.sdk.mv.b(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", this.e));
            this.c.add(com.facetec.sdk.mv.b(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", this.e));
            return this;
        }

        public final com.facetec.sdk.mp c() {
            return new com.facetec.sdk.mp(this.f3655a, this.c);
        }
    }
}
