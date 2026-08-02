package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ep extends com.facetec.sdk.es {
    private final com.facetec.sdk.fp<java.lang.String, com.facetec.sdk.es> d = new com.facetec.sdk.fp<>((byte) 0);

    public final void b(java.lang.String str, com.facetec.sdk.es esVar) {
        com.facetec.sdk.fp<java.lang.String, com.facetec.sdk.es> fpVar = this.d;
        if (esVar == null) {
            esVar = com.facetec.sdk.eq.b;
        }
        fpVar.put(str, esVar);
    }

    public final void a(java.lang.String str, java.lang.String str2) {
        b(str, str2 == null ? com.facetec.sdk.eq.b : new com.facetec.sdk.ex(str2));
    }

    public final void d(java.lang.String str, java.lang.Number number) {
        b(str, number == null ? com.facetec.sdk.eq.b : new com.facetec.sdk.ex(number));
    }

    public final java.util.Set<java.util.Map.Entry<java.lang.String, com.facetec.sdk.es>> m() {
        return this.d.entrySet();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.facetec.sdk.ep) && ((com.facetec.sdk.ep) obj).d.equals(this.d);
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
