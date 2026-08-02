package com.facetec.sdk;

/* loaded from: classes8.dex */
final class mz implements com.facetec.sdk.md {

    /* renamed from: a, reason: collision with root package name */
    final com.facetec.sdk.ms f3671a;

    @javax.annotation.Nullable
    com.facetec.sdk.mo b;
    final com.facetec.sdk.mx c;
    final com.facetec.sdk.pn d;
    final com.facetec.sdk.oe e;
    final boolean g;
    private boolean i;

    private mz(com.facetec.sdk.ms msVar, com.facetec.sdk.mx mxVar, boolean z) {
        this.f3671a = msVar;
        this.c = mxVar;
        this.g = z;
        this.e = new com.facetec.sdk.oe(msVar, z);
        com.facetec.sdk.pn pnVar = new com.facetec.sdk.pn() { // from class: com.facetec.sdk.mz.5
            @Override // com.facetec.sdk.pn
            public final void a() {
                com.facetec.sdk.mz.this.d();
            }
        };
        this.d = pnVar;
        pnVar.a(msVar.l, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    static com.facetec.sdk.mz a(com.facetec.sdk.ms msVar, com.facetec.sdk.mx mxVar, boolean z) {
        com.facetec.sdk.mz mzVar = new com.facetec.sdk.mz(msVar, mxVar, z);
        mzVar.b = msVar.e.c();
        return mzVar;
    }

    @javax.annotation.Nullable
    final java.io.IOException a(@javax.annotation.Nullable java.io.IOException iOException) {
        if (!this.d.e()) {
            return iOException;
        }
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException(com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // com.facetec.sdk.md
    public final void a(com.facetec.sdk.mg mgVar) {
        synchronized (this) {
            if (this.i) {
                throw new java.lang.IllegalStateException("Already Executed");
            }
            this.i = true;
        }
        this.e.e = com.facetec.sdk.pa.d().d("response.body().close()");
        com.facetec.sdk.mh m = this.f3671a.m();
        com.facetec.sdk.mz.a aVar = new com.facetec.sdk.mz.a(mgVar);
        synchronized (m) {
            m.c.add(aVar);
        }
        m.a();
    }

    public final void d() {
        com.facetec.sdk.nx nxVar;
        com.facetec.sdk.nl nlVar;
        com.facetec.sdk.oe oeVar = this.e;
        oeVar.b = true;
        com.facetec.sdk.nu nuVar = oeVar.c;
        if (nuVar != null) {
            synchronized (nuVar.e) {
                nuVar.h = true;
                nxVar = nuVar.j;
                nlVar = nuVar.f3692a;
            }
            if (nxVar != null) {
                nxVar.b();
            } else if (nlVar != null) {
                nlVar.d();
            }
        }
    }

    final class a extends com.facetec.sdk.ne {
        static final /* synthetic */ boolean c = true;

        /* renamed from: a, reason: collision with root package name */
        final com.facetec.sdk.mg f3672a;

        a(com.facetec.sdk.mg mgVar) {
            super("OkHttp %s", com.facetec.sdk.mz.this.c());
            this.f3672a = mgVar;
        }

        final java.lang.String b() {
            return com.facetec.sdk.mz.this.c.c().g();
        }

        @Override // com.facetec.sdk.ne
        public final void c() {
            com.facetec.sdk.mz mzVar;
            com.facetec.sdk.mw e;
            com.facetec.sdk.mz.this.d.b();
            try {
                try {
                    mzVar = com.facetec.sdk.mz.this;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.addAll(mzVar.f3671a.b);
                    arrayList.add(mzVar.e);
                    arrayList.add(new com.facetec.sdk.nt(mzVar.f3671a.c()));
                    com.facetec.sdk.ms msVar = mzVar.f3671a;
                    arrayList.add(new com.facetec.sdk.ni(msVar.f != null ? msVar.f.d : msVar.h));
                    arrayList.add(new com.facetec.sdk.nn(mzVar.f3671a));
                    if (!mzVar.g) {
                        arrayList.addAll(mzVar.f3671a.d);
                    }
                    arrayList.add(new com.facetec.sdk.nw(mzVar.g));
                    e = new com.facetec.sdk.oc(arrayList, null, null, null, 0, mzVar.c, mzVar, mzVar.b, mzVar.f3671a.n, mzVar.f3671a.m, mzVar.f3671a.k).e(mzVar.c);
                } finally {
                    com.facetec.sdk.mz.this.f3671a.m().c(this);
                }
            } catch (java.io.IOException e2) {
                java.io.IOException a2 = com.facetec.sdk.mz.this.a(e2);
                if (0 == 0) {
                    com.facetec.sdk.mo unused = com.facetec.sdk.mz.this.b;
                    this.f3672a.c(a2);
                } else {
                    com.facetec.sdk.pa d = com.facetec.sdk.pa.d();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Callback failure for ");
                    com.facetec.sdk.mz mzVar2 = com.facetec.sdk.mz.this;
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(mzVar2.e.a() ? "canceled " : "");
                    sb2.append(mzVar2.g ? "web socket" : androidx.core.app.NotificationCompat.CATEGORY_CALL);
                    sb2.append(" to ");
                    sb2.append(mzVar2.c());
                    sb.append(sb2.toString());
                    d.d(4, sb.toString(), a2);
                }
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.mz.this.d();
                if (0 == 0) {
                    this.f3672a.c(new java.io.IOException("canceled due to ".concat(java.lang.String.valueOf(th))));
                }
                throw th;
            }
            if (!mzVar.e.a()) {
                this.f3672a.d(e);
            } else {
                com.facetec.sdk.nh.c(e);
                throw new java.io.IOException("Canceled");
            }
        }
    }

    final java.lang.String c() {
        com.facetec.sdk.mv.d b = this.c.c().b("/...");
        b.c = com.facetec.sdk.mv.d("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        b.b = com.facetec.sdk.mv.d("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return b.a().toString();
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return a(this.f3671a, this.c, this.g);
    }
}
