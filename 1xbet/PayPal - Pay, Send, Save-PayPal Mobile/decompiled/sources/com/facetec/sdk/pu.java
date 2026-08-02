package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pu implements com.facetec.sdk.pz {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.zip.Inflater f3753a;
    private final com.facetec.sdk.pr b;
    private int c;
    private boolean e;

    pu(com.facetec.sdk.pr prVar, java.util.zip.Inflater inflater) {
        if (prVar == null) {
            throw new java.lang.IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new java.lang.IllegalArgumentException("inflater == null");
        }
        this.b = prVar;
        this.f3753a = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[Catch: DataFormatException -> 0x009e, TryCatch #0 {DataFormatException -> 0x009e, blocks: (B:16:0x0047, B:36:0x0061, B:18:0x006d, B:20:0x0075, B:25:0x0081, B:26:0x0088, B:29:0x0089, B:31:0x0092), top: B:15:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[SYNTHETIC] */
    @Override // com.facetec.sdk.pz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        boolean z;
        int inflate;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
        }
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (j == 0) {
            return 0L;
        }
        do {
            try {
                if (this.f3753a.needsInput()) {
                    a();
                    if (this.f3753a.getRemaining() != 0) {
                        throw new java.lang.IllegalStateException(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
                    }
                    if (this.b.b()) {
                        z = true;
                        com.facetec.sdk.qc c = pkVar.c(1);
                        inflate = this.f3753a.inflate(c.d, c.f3761a, (int) java.lang.Math.min(j, 8192 - c.f3761a));
                        if (inflate <= 0) {
                            c.f3761a += inflate;
                            long j2 = inflate;
                            pkVar.b += j2;
                            return j2;
                        }
                        if (!this.f3753a.finished() && !this.f3753a.needsDictionary()) {
                        }
                        a();
                        if (c.e != c.f3761a) {
                            return -1L;
                        }
                        pkVar.c = c.e();
                        com.facetec.sdk.py.b(c);
                        return -1L;
                    }
                    com.facetec.sdk.qc qcVar = this.b.c().c;
                    this.c = qcVar.f3761a - qcVar.e;
                    this.f3753a.setInput(qcVar.d, qcVar.e, this.c);
                }
                com.facetec.sdk.qc c2 = pkVar.c(1);
                inflate = this.f3753a.inflate(c2.d, c2.f3761a, (int) java.lang.Math.min(j, 8192 - c2.f3761a));
                if (inflate <= 0) {
                }
            } catch (java.util.zip.DataFormatException e) {
                throw new java.io.IOException(e);
            }
            z = false;
        } while (!z);
        throw new java.io.EOFException("source exhausted prematurely");
    }

    private void a() throws java.io.IOException {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f3753a.getRemaining();
        this.c -= remaining;
        this.b.g(remaining);
    }

    @Override // com.facetec.sdk.pz
    public final com.facetec.sdk.qe d() {
        return this.b.d();
    }

    @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.e) {
            return;
        }
        this.f3753a.end();
        this.e = true;
        this.b.close();
    }
}
