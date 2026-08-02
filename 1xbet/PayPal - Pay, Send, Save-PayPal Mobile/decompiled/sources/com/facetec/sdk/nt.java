package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nt implements com.facetec.sdk.mu {
    private final com.facetec.sdk.mi c;

    public nt(com.facetec.sdk.mi miVar) {
        this.c = miVar;
    }

    @Override // com.facetec.sdk.mu
    public final com.facetec.sdk.mw e(com.facetec.sdk.mu.e eVar) throws java.io.IOException {
        boolean z;
        com.facetec.sdk.mx a2 = eVar.a();
        com.facetec.sdk.mx.a e = a2.e();
        com.facetec.sdk.my b = a2.b();
        if (b != null) {
            com.facetec.sdk.mr c = b.c();
            if (c != null) {
                e.b("Content-Type", c.toString());
            }
            long a3 = b.a();
            if (a3 == -1) {
                e.b(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, "chunked");
                e.d("Content-Length");
            } else {
                e.b("Content-Length", java.lang.Long.toString(a3));
                e.d(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
            }
        }
        if (a2.d(com.google.common.net.HttpHeaders.HOST) == null) {
            e.b(com.google.common.net.HttpHeaders.HOST, com.facetec.sdk.nh.e(a2.c(), false));
        }
        if (a2.d(com.google.common.net.HttpHeaders.CONNECTION) == null) {
            e.b(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        }
        if (a2.d(com.google.common.net.HttpHeaders.ACCEPT_ENCODING) == null && a2.d(com.google.common.net.HttpHeaders.RANGE) == null) {
            e.b(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
            z = true;
        } else {
            z = false;
        }
        com.facetec.sdk.mi miVar = this.c;
        a2.c();
        java.util.List<com.facetec.sdk.ml> a4 = miVar.a();
        if (!a4.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int size = a4.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                com.facetec.sdk.ml mlVar = a4.get(i);
                sb.append(mlVar.e);
                sb.append('=');
                sb.append(mlVar.d);
            }
            e.b("Cookie", sb.toString());
        }
        if (a2.d("User-Agent") == null) {
            e.b("User-Agent", com.facetec.sdk.ng.a());
        }
        com.facetec.sdk.mw e2 = eVar.e(e.c());
        com.facetec.sdk.nz.a(this.c, a2.c(), e2.c());
        com.facetec.sdk.mw.c c2 = e2.g().c(a2);
        if (z && com.statsig.androidsdk.HttpUtils.ENCODING_GZIP.equalsIgnoreCase(e2.b("Content-Encoding")) && com.facetec.sdk.nz.a(e2)) {
            com.facetec.sdk.pv pvVar = new com.facetec.sdk.pv(e2.b().b());
            c2.a(e2.c().c().e("Content-Encoding").e("Content-Length").b());
            c2.d(new com.facetec.sdk.ob(e2.b("Content-Type"), -1L, com.facetec.sdk.pt.d(pvVar)));
        }
        return c2.b();
    }
}
