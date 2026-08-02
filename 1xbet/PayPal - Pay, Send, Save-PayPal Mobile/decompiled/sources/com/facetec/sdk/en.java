package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class en extends com.facetec.sdk.es implements java.lang.Iterable<com.facetec.sdk.es> {
    private final java.util.ArrayList<com.facetec.sdk.es> d = new java.util.ArrayList<>();

    public final void c(java.lang.String str) {
        this.d.add(str == null ? com.facetec.sdk.eq.b : new com.facetec.sdk.ex(str));
    }

    public final void c(com.facetec.sdk.es esVar) {
        if (esVar == null) {
            esVar = com.facetec.sdk.eq.b;
        }
        this.d.add(esVar);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.facetec.sdk.es> iterator() {
        return this.d.iterator();
    }

    private com.facetec.sdk.es k() {
        int size = this.d.size();
        if (size == 1) {
            return this.d.get(0);
        }
        throw new java.lang.IllegalStateException("Array must have size 1, but has size ".concat(java.lang.String.valueOf(size)));
    }

    @Override // com.facetec.sdk.es
    public final java.lang.Number b() {
        return k().b();
    }

    @Override // com.facetec.sdk.es
    public final java.lang.String c() {
        return k().c();
    }

    @Override // com.facetec.sdk.es
    public final double d() {
        return k().d();
    }

    @Override // com.facetec.sdk.es
    public final long a() {
        return k().a();
    }

    @Override // com.facetec.sdk.es
    public final int e() {
        return k().e();
    }

    @Override // com.facetec.sdk.es
    public final boolean h() {
        return k().h();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.facetec.sdk.en) && ((com.facetec.sdk.en) obj).d.equals(this.d);
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
