package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gb implements com.facetec.sdk.fb {
    private final com.facetec.sdk.fl b;

    public gb(com.facetec.sdk.fl flVar) {
        this.b = flVar;
    }

    @Override // com.facetec.sdk.fb
    public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
        com.facetec.sdk.ff ffVar = (com.facetec.sdk.ff) gwVar.a().getAnnotation(com.facetec.sdk.ff.class);
        if (ffVar == null) {
            return null;
        }
        return (com.facetec.sdk.fd<T>) d(this.b, eoVar, gwVar, ffVar);
    }

    static com.facetec.sdk.fd<?> d(com.facetec.sdk.fl flVar, com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<?> gwVar, com.facetec.sdk.ff ffVar) {
        com.facetec.sdk.fd<?> glVar;
        java.lang.Object e = flVar.d(com.facetec.sdk.gw.c(ffVar.e())).e();
        boolean a2 = ffVar.a();
        if (e instanceof com.facetec.sdk.fd) {
            glVar = (com.facetec.sdk.fd) e;
        } else if (e instanceof com.facetec.sdk.fb) {
            glVar = ((com.facetec.sdk.fb) e).d(eoVar, gwVar);
        } else {
            boolean z = e instanceof com.facetec.sdk.eu;
            if (z || (e instanceof com.facetec.sdk.er)) {
                glVar = new com.facetec.sdk.gl<>(z ? (com.facetec.sdk.eu) e : null, e instanceof com.facetec.sdk.er ? (com.facetec.sdk.er) e : null, eoVar, gwVar, a2);
                a2 = false;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(e.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(gwVar.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        return (glVar == null || !a2) ? glVar : glVar.e();
    }
}
