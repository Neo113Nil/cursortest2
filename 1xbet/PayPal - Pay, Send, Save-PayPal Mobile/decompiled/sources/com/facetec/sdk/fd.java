package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class fd<T> {
    public abstract void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException;

    public abstract T b(com.facetec.sdk.gt gtVar) throws java.io.IOException;

    public final com.facetec.sdk.fd<T> e() {
        return new com.facetec.sdk.fd<T>() { // from class: com.facetec.sdk.fd.3
            @Override // com.facetec.sdk.fd
            public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
                if (t == null) {
                    guVar.g();
                } else {
                    com.facetec.sdk.fd.this.a(guVar, t);
                }
            }

            @Override // com.facetec.sdk.fd
            public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
                if (gtVar.f() == com.facetec.sdk.gs.NULL) {
                    gtVar.k();
                    return null;
                }
                return (T) com.facetec.sdk.fd.this.b(gtVar);
            }
        };
    }

    public final com.facetec.sdk.es a(T t) {
        try {
            com.facetec.sdk.gf gfVar = new com.facetec.sdk.gf();
            a(gfVar, t);
            return gfVar.c();
        } catch (java.io.IOException e) {
            throw new com.facetec.sdk.et(e);
        }
    }
}
