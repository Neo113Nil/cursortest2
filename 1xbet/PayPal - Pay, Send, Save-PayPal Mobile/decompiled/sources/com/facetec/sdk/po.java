package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class po implements com.facetec.sdk.qa {
    private final com.facetec.sdk.qa d;

    public po(com.facetec.sdk.qa qaVar) {
        if (qaVar == null) {
            throw new java.lang.IllegalArgumentException("delegate == null");
        }
        this.d = qaVar;
    }

    @Override // com.facetec.sdk.qa
    public void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        this.d.c(pkVar, j);
    }

    @Override // com.facetec.sdk.qa, java.io.Flushable
    public void flush() throws java.io.IOException {
        this.d.flush();
    }

    @Override // com.facetec.sdk.qa
    public final com.facetec.sdk.qe d() {
        return this.d.d();
    }

    @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.d.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.d.toString());
        sb.append(")");
        return sb.toString();
    }
}
