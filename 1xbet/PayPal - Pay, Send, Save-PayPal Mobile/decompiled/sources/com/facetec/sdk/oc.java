package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class oc implements com.facetec.sdk.mu.e {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.facetec.sdk.mu> f3699a;
    final com.facetec.sdk.nx b;
    private final int c;
    final com.facetec.sdk.nl d;
    private final com.facetec.sdk.nu e;
    private final int f;
    private final com.facetec.sdk.md g;
    private final int h;
    private final com.facetec.sdk.mx i;
    private final com.facetec.sdk.mo j;
    private int l;

    /* renamed from: o, reason: collision with root package name */
    private final int f3700o;

    public oc(java.util.List<com.facetec.sdk.mu> list, com.facetec.sdk.nu nuVar, com.facetec.sdk.nx nxVar, com.facetec.sdk.nl nlVar, int i, com.facetec.sdk.mx mxVar, com.facetec.sdk.md mdVar, com.facetec.sdk.mo moVar, int i2, int i3, int i4) {
        this.f3699a = list;
        this.d = nlVar;
        this.e = nuVar;
        this.b = nxVar;
        this.c = i;
        this.i = mxVar;
        this.g = mdVar;
        this.j = moVar;
        this.h = i2;
        this.f = i3;
        this.f3700o = i4;
    }

    @Override // com.facetec.sdk.mu.e
    public final int e() {
        return this.h;
    }

    @Override // com.facetec.sdk.mu.e
    public final int c() {
        return this.f;
    }

    @Override // com.facetec.sdk.mu.e
    public final int b() {
        return this.f3700o;
    }

    public final com.facetec.sdk.nu d() {
        return this.e;
    }

    public final com.facetec.sdk.md i() {
        return this.g;
    }

    public final com.facetec.sdk.mo j() {
        return this.j;
    }

    @Override // com.facetec.sdk.mu.e
    public final com.facetec.sdk.mx a() {
        return this.i;
    }

    @Override // com.facetec.sdk.mu.e
    public final com.facetec.sdk.mw e(com.facetec.sdk.mx mxVar) throws java.io.IOException {
        return c(mxVar, this.e, this.b, this.d);
    }

    public final com.facetec.sdk.mw c(com.facetec.sdk.mx mxVar, com.facetec.sdk.nu nuVar, com.facetec.sdk.nx nxVar, com.facetec.sdk.nl nlVar) throws java.io.IOException {
        if (this.c >= this.f3699a.size()) {
            throw new java.lang.AssertionError();
        }
        this.l++;
        if (this.b != null && !this.d.b(mxVar.c())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("network interceptor ");
            sb.append(this.f3699a.get(this.c - 1));
            sb.append(" must retain the same host and port");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.b != null && this.l > 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("network interceptor ");
            sb2.append(this.f3699a.get(this.c - 1));
            sb2.append(" must call proceed() exactly once");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        com.facetec.sdk.oc ocVar = new com.facetec.sdk.oc(this.f3699a, nuVar, nxVar, nlVar, this.c + 1, mxVar, this.g, this.j, this.h, this.f, this.f3700o);
        com.facetec.sdk.mu muVar = this.f3699a.get(this.c);
        com.facetec.sdk.mw e = muVar.e(ocVar);
        if (nxVar != null && this.c + 1 < this.f3699a.size() && ocVar.l != 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("network interceptor ");
            sb3.append(muVar);
            sb3.append(" must call proceed() exactly once");
            throw new java.lang.IllegalStateException(sb3.toString());
        }
        if (e == null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("interceptor ");
            sb4.append(muVar);
            sb4.append(" returned null");
            throw new java.lang.NullPointerException(sb4.toString());
        }
        if (e.b() != null) {
            return e;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("interceptor ");
        sb5.append(muVar);
        sb5.append(" returned a response with no body");
        throw new java.lang.IllegalStateException(sb5.toString());
    }
}
