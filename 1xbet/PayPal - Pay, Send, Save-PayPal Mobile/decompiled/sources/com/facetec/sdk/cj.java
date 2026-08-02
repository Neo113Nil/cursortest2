package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class cj extends com.facetec.sdk.fd implements com.facetec.sdk.ha {

    /* renamed from: a, reason: collision with root package name */
    private com.facetec.sdk.gz f3464a;
    private com.facetec.sdk.eo c;
    private com.facetec.sdk.gy d;

    public cj(com.facetec.sdk.eo eoVar, com.facetec.sdk.gz gzVar, com.facetec.sdk.gy gyVar) {
        this.c = eoVar;
        this.f3464a = gzVar;
        this.d = gyVar;
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            guVar.g();
        } else {
            this.d.b(guVar, obj == com.facetec.sdk.p.ID_SCAN_MATCH ? 5 : obj == com.facetec.sdk.p.FACE_SCAN ? 11 : obj == com.facetec.sdk.p.ID_SCAN_ONLY ? 0 : -1);
        }
    }

    @Override // com.facetec.sdk.fd
    public final java.lang.Object b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        int d = this.f3464a.d(gtVar);
        if (d == 0) {
            return com.facetec.sdk.p.ID_SCAN_MATCH;
        }
        if (d == 2) {
            return com.facetec.sdk.p.FACE_SCAN;
        }
        if (d != 10) {
            return null;
        }
        return com.facetec.sdk.p.ID_SCAN_ONLY;
    }
}
