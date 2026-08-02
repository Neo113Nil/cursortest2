package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class ps implements com.facetec.sdk.pz {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.pz f3750a;

    public ps(com.facetec.sdk.pz pzVar) {
        if (pzVar == null) {
            throw new java.lang.IllegalArgumentException("delegate == null");
        }
        this.f3750a = pzVar;
    }

    public final com.facetec.sdk.pz a() {
        return this.f3750a;
    }

    @Override // com.facetec.sdk.pz
    public long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        return this.f3750a.b(pkVar, j);
    }

    @Override // com.facetec.sdk.pz
    public final com.facetec.sdk.qe d() {
        return this.f3750a.d();
    }

    @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f3750a.close();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append(this.f3750a.toString());
        sb.append(")");
        return sb.toString();
    }
}
