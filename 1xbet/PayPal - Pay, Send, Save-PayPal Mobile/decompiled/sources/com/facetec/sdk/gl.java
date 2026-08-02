package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class gl<T> extends com.facetec.sdk.gi<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.gw<T> f3609a;
    private final com.facetec.sdk.eu<T> c;
    private final com.facetec.sdk.er<T> d;
    private com.facetec.sdk.eo e;
    private final boolean g;
    private volatile com.facetec.sdk.fd<T> i;
    private final com.facetec.sdk.gl<T>.a f = new com.facetec.sdk.gl.a(this, 0);
    private final com.facetec.sdk.fb b = null;

    public gl(com.facetec.sdk.eu<T> euVar, com.facetec.sdk.er<T> erVar, com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar, boolean z) {
        this.c = euVar;
        this.d = erVar;
        this.e = eoVar;
        this.f3609a = gwVar;
        this.g = z;
    }

    @Override // com.facetec.sdk.fd
    public final T b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        if (this.d == null) {
            return a().b(gtVar);
        }
        com.facetec.sdk.es b = com.facetec.sdk.fv.b(gtVar);
        if (this.g && b.i()) {
            return null;
        }
        com.facetec.sdk.er<T> erVar = this.d;
        this.f3609a.b();
        return erVar.c();
    }

    @Override // com.facetec.sdk.fd
    public final void a(com.facetec.sdk.gu guVar, T t) throws java.io.IOException {
        com.facetec.sdk.eu<T> euVar = this.c;
        if (euVar == null) {
            a().a(guVar, t);
        } else if (this.g && t == null) {
            guVar.g();
        } else {
            this.f3609a.b();
            com.facetec.sdk.fv.c(euVar.c(), guVar);
        }
    }

    private com.facetec.sdk.fd<T> a() {
        com.facetec.sdk.fd<T> fdVar = this.i;
        if (fdVar != null) {
            return fdVar;
        }
        com.facetec.sdk.fd<T> e = this.e.e(this.b, this.f3609a);
        this.i = e;
        return e;
    }

    @Override // com.facetec.sdk.gi
    public final com.facetec.sdk.fd<T> b() {
        return this.c != null ? this : a();
    }

    final class a {
        private a() {
        }

        /* synthetic */ a(com.facetec.sdk.gl glVar, byte b) {
            this();
        }
    }
}
