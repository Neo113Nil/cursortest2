package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pp extends com.facetec.sdk.qe {
    public com.facetec.sdk.qe b;

    public pp(com.facetec.sdk.qe qeVar) {
        if (qeVar == null) {
            throw new java.lang.IllegalArgumentException("delegate == null");
        }
        this.b = qeVar;
    }

    @Override // com.facetec.sdk.qe
    public final com.facetec.sdk.qe a(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.b.a(j, timeUnit);
    }

    @Override // com.facetec.sdk.qe
    public final long e_() {
        return this.b.e_();
    }

    @Override // com.facetec.sdk.qe
    public final boolean a_() {
        return this.b.a_();
    }

    @Override // com.facetec.sdk.qe
    public final long b_() {
        return this.b.b_();
    }

    @Override // com.facetec.sdk.qe
    public final com.facetec.sdk.qe c(long j) {
        return this.b.c(j);
    }

    @Override // com.facetec.sdk.qe
    public final com.facetec.sdk.qe c_() {
        return this.b.c_();
    }

    @Override // com.facetec.sdk.qe
    public final com.facetec.sdk.qe d_() {
        return this.b.d_();
    }

    @Override // com.facetec.sdk.qe
    public final void j() throws java.io.IOException {
        this.b.j();
    }
}
