package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hg implements com.facetec.sdk.fb {
    private static final com.facetec.sdk.hb c = new com.facetec.sdk.hb();
    private static final com.facetec.sdk.he d = new com.facetec.sdk.he();

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        try {
            if (gwVar.a() == com.facetec.sdk.o.class) {
                return new com.facetec.sdk.ci(eoVar, c, d);
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        try {
            if (com.facetec.sdk.p.class.isAssignableFrom(gwVar.a())) {
                return new com.facetec.sdk.cj(eoVar, c, d);
            }
            return null;
        } catch (java.lang.NoClassDefFoundError unused2) {
            return null;
        }
    }
}
