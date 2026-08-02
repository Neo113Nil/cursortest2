package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ok implements com.facetec.sdk.nx {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.mu.e f3710a;
    final com.facetec.sdk.nu b;
    private final com.facetec.sdk.ol c;
    private final com.facetec.sdk.na h;
    private com.facetec.sdk.os j;
    private static final java.util.List<java.lang.String> e = com.facetec.sdk.nh.c("connection", com.datadog.android.log.LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", okhttp3.internal.http2.Header.TARGET_METHOD_UTF8, okhttp3.internal.http2.Header.TARGET_PATH_UTF8, okhttp3.internal.http2.Header.TARGET_SCHEME_UTF8, okhttp3.internal.http2.Header.TARGET_AUTHORITY_UTF8);
    private static final java.util.List<java.lang.String> d = com.facetec.sdk.nh.c("connection", com.datadog.android.log.LogAttributes.HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public ok(com.facetec.sdk.ms msVar, com.facetec.sdk.mu.e eVar, com.facetec.sdk.nu nuVar, com.facetec.sdk.ol olVar) {
        com.facetec.sdk.na naVar;
        this.f3710a = eVar;
        this.b = nuVar;
        this.c = olVar;
        if (msVar.k().contains(com.facetec.sdk.na.H2_PRIOR_KNOWLEDGE)) {
            naVar = com.facetec.sdk.na.H2_PRIOR_KNOWLEDGE;
        } else {
            naVar = com.facetec.sdk.na.HTTP_2;
        }
        this.h = naVar;
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.qa e(com.facetec.sdk.mx mxVar, long j) {
        return this.j.b();
    }

    @Override // com.facetec.sdk.nx
    public final void b(com.facetec.sdk.mx mxVar) throws java.io.IOException {
        if (this.j != null) {
            return;
        }
        boolean z = mxVar.b() != null;
        com.facetec.sdk.mm d2 = mxVar.d();
        java.util.ArrayList arrayList = new java.util.ArrayList(d2.e() + 4);
        arrayList.add(new com.facetec.sdk.of(com.facetec.sdk.of.e, mxVar.a()));
        arrayList.add(new com.facetec.sdk.of(com.facetec.sdk.of.f3703a, com.facetec.sdk.oa.b(mxVar.c())));
        java.lang.String d3 = mxVar.d(com.google.common.net.HttpHeaders.HOST);
        if (d3 != null) {
            arrayList.add(new com.facetec.sdk.of(com.facetec.sdk.of.h, d3));
        }
        arrayList.add(new com.facetec.sdk.of(com.facetec.sdk.of.b, mxVar.c().c()));
        int e2 = d2.e();
        for (int i = 0; i < e2; i++) {
            com.facetec.sdk.pq d4 = com.facetec.sdk.pq.d(d2.a(i).toLowerCase(java.util.Locale.US));
            if (!e.contains(d4.e())) {
                arrayList.add(new com.facetec.sdk.of(d4, d2.e(i)));
            }
        }
        com.facetec.sdk.os d5 = this.c.d(arrayList, z);
        this.j = d5;
        d5.j.a(this.f3710a.c(), java.util.concurrent.TimeUnit.MILLISECONDS);
        this.j.h.a(this.f3710a.b(), java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // com.facetec.sdk.nx
    public final void e() throws java.io.IOException {
        this.c.c();
    }

    @Override // com.facetec.sdk.nx
    public final void a() throws java.io.IOException {
        this.j.b().close();
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.mw.c d(boolean z) throws java.io.IOException {
        com.facetec.sdk.mm e2 = this.j.e();
        com.facetec.sdk.na naVar = this.h;
        com.facetec.sdk.mm.b bVar = new com.facetec.sdk.mm.b();
        int e3 = e2.e();
        com.facetec.sdk.od odVar = null;
        for (int i = 0; i < e3; i++) {
            java.lang.String a2 = e2.a(i);
            java.lang.String e4 = e2.e(i);
            if (a2.equals(okhttp3.internal.http2.Header.RESPONSE_STATUS_UTF8)) {
                odVar = com.facetec.sdk.od.b("HTTP/1.1 ".concat(java.lang.String.valueOf(e4)));
            } else if (!d.contains(a2)) {
                com.facetec.sdk.nd.d.c(bVar, a2, e4);
            }
        }
        if (odVar == null) {
            throw new java.net.ProtocolException("Expected ':status' header not present");
        }
        com.facetec.sdk.mw.c a3 = new com.facetec.sdk.mw.c().c(naVar).d(odVar.d).d(odVar.e).a(bVar.b());
        if (z && com.facetec.sdk.nd.d.d(a3) == 100) {
            return null;
        }
        return a3;
    }

    @Override // com.facetec.sdk.nx
    public final com.facetec.sdk.nf c(com.facetec.sdk.mw mwVar) throws java.io.IOException {
        com.facetec.sdk.mo moVar = this.b.c;
        com.facetec.sdk.md mdVar = this.b.b;
        return new com.facetec.sdk.ob(mwVar.b("Content-Type"), com.facetec.sdk.nz.e(mwVar), com.facetec.sdk.pt.d(new com.facetec.sdk.ok.a(this.j.g)));
    }

    @Override // com.facetec.sdk.nx
    public final void b() {
        com.facetec.sdk.os osVar = this.j;
        if (osVar != null) {
            osVar.b(com.facetec.sdk.og.CANCEL);
        }
    }

    final class a extends com.facetec.sdk.ps {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3711a;
        private long e;

        a(com.facetec.sdk.pz pzVar) {
            super(pzVar);
            this.f3711a = false;
            this.e = 0L;
        }

        @Override // com.facetec.sdk.ps, com.facetec.sdk.pz
        public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
            try {
                long b = a().b(pkVar, j);
                if (b > 0) {
                    this.e += b;
                }
                return b;
            } catch (java.io.IOException e) {
                e(e);
                throw e;
            }
        }

        @Override // com.facetec.sdk.ps, com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            super.close();
            e(null);
        }

        private void e(java.io.IOException iOException) {
            if (this.f3711a) {
                return;
            }
            this.f3711a = true;
            com.facetec.sdk.ok.this.b.d(false, (com.facetec.sdk.nx) com.facetec.sdk.ok.this, iOException);
        }
    }
}
