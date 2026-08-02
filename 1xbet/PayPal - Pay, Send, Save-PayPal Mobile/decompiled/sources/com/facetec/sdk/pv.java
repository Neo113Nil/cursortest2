package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pv implements com.facetec.sdk.pz {

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.pr f3754a;
    private final com.facetec.sdk.pu b;
    private final java.util.zip.Inflater c;
    private int e = 0;
    private final java.util.zip.CRC32 d = new java.util.zip.CRC32();

    public pv(com.facetec.sdk.pz pzVar) {
        if (pzVar == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.c = inflater;
        com.facetec.sdk.pr d = com.facetec.sdk.pt.d(pzVar);
        this.f3754a = d;
        this.b = new com.facetec.sdk.pu(d, inflater);
    }

    @Override // com.facetec.sdk.pz
    public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        long j2;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
        }
        if (j == 0) {
            return 0L;
        }
        if (this.e == 0) {
            this.f3754a.b(10L);
            byte d = this.f3754a.c().d(3L);
            boolean z = ((d >> 1) & 1) == 1;
            if (z) {
                e(this.f3754a.c(), 0L, 10L);
            }
            a("ID1ID2", 8075, this.f3754a.g());
            this.f3754a.g(8L);
            if (((d >> 2) & 1) == 1) {
                this.f3754a.b(2L);
                if (z) {
                    e(this.f3754a.c(), 0L, 2L);
                }
                long i = this.f3754a.c().i();
                this.f3754a.b(i);
                if (z) {
                    j2 = i;
                    e(this.f3754a.c(), 0L, i);
                } else {
                    j2 = i;
                }
                this.f3754a.g(j2);
            }
            if (((d >> 3) & 1) == 1) {
                long p = this.f3754a.p();
                if (p == -1) {
                    throw new java.io.EOFException();
                }
                if (z) {
                    e(this.f3754a.c(), 0L, p + 1);
                }
                this.f3754a.g(p + 1);
            }
            if (((d >> 4) & 1) == 1) {
                long p2 = this.f3754a.p();
                if (p2 == -1) {
                    throw new java.io.EOFException();
                }
                if (z) {
                    e(this.f3754a.c(), 0L, p2 + 1);
                }
                this.f3754a.g(p2 + 1);
            }
            if (z) {
                a("FHCRC", this.f3754a.i(), (short) this.d.getValue());
                this.d.reset();
            }
            this.e = 1;
        }
        if (this.e == 1) {
            long j3 = pkVar.b;
            long b = this.b.b(pkVar, j);
            if (b != -1) {
                e(pkVar, j3, b);
                return b;
            }
            this.e = 2;
        }
        if (this.e == 2) {
            a("CRC", this.f3754a.h(), (int) this.d.getValue());
            a("ISIZE", this.f3754a.h(), (int) this.c.getBytesWritten());
            this.e = 3;
            if (!this.f3754a.b()) {
                throw new java.io.IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.facetec.sdk.pz
    public final com.facetec.sdk.qe d() {
        return this.f3754a.d();
    }

    @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.b.close();
    }

    private void e(com.facetec.sdk.pk pkVar, long j, long j2) {
        com.facetec.sdk.qc qcVar = pkVar.c;
        while (j >= qcVar.f3761a - qcVar.e) {
            j -= qcVar.f3761a - qcVar.e;
            qcVar = qcVar.j;
        }
        while (j2 > 0) {
            int min = (int) java.lang.Math.min(qcVar.f3761a - r6, j2);
            this.d.update(qcVar.d, (int) (qcVar.e + j), min);
            j2 -= min;
            qcVar = qcVar.j;
            j = 0;
        }
    }

    private static void a(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (i2 != i) {
            throw new java.io.IOException(java.lang.String.format("%s: actual 0x%08x != expected 0x%08x", str, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
