package com.facetec.sdk;

/* loaded from: classes8.dex */
final class gk<T> extends com.facetec.sdk.fd<T> {
    private final com.facetec.sdk.fd<T> b;
    private final java.lang.reflect.Type c;
    private final com.facetec.sdk.eo e;

    gk(com.facetec.sdk.eo eoVar, com.facetec.sdk.fd<T> fdVar, java.lang.reflect.Type type) {
        this.e = eoVar;
        this.b = fdVar;
        this.c = type;
    }

    @Override // com.facetec.sdk.fd
    public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        return this.b.b(gtVar);
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
        com.facetec.sdk.fd<T> b;
        com.facetec.sdk.fd<T> fdVar = this.b;
        java.lang.reflect.Type type = this.c;
        if (t != null && ((type instanceof java.lang.Class) || (type instanceof java.lang.reflect.TypeVariable))) {
            type = t.getClass();
        }
        if (type != this.c) {
            fdVar = this.e.a((com.facetec.sdk.gw) com.facetec.sdk.gw.d(type));
            if (fdVar instanceof com.facetec.sdk.ge.a) {
                com.facetec.sdk.fd<T> fdVar2 = this.b;
                while ((fdVar2 instanceof com.facetec.sdk.gi) && (b = ((com.facetec.sdk.gi) fdVar2).b()) != fdVar2) {
                    fdVar2 = b;
                }
                if (!(fdVar2 instanceof com.facetec.sdk.ge.a)) {
                    fdVar = this.b;
                }
            }
        }
        fdVar.a(guVar, t);
    }
}
