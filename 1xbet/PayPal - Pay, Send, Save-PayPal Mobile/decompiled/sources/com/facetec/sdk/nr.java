package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class nr {
    private final java.util.Set<com.facetec.sdk.nc> c = new java.util.LinkedHashSet();

    public final void b(com.facetec.sdk.nc ncVar) {
        synchronized (this) {
            this.c.add(ncVar);
        }
    }

    public final void d(com.facetec.sdk.nc ncVar) {
        synchronized (this) {
            this.c.remove(ncVar);
        }
    }

    public final boolean e(com.facetec.sdk.nc ncVar) {
        boolean contains;
        synchronized (this) {
            contains = this.c.contains(ncVar);
        }
        return contains;
    }
}
