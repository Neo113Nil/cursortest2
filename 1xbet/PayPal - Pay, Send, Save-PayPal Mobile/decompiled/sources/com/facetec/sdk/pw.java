package com.facetec.sdk;

/* loaded from: classes8.dex */
final class pw implements com.facetec.sdk.pr {

    /* renamed from: a, reason: collision with root package name */
    private com.facetec.sdk.pk f3755a = new com.facetec.sdk.pk();
    private com.facetec.sdk.pz c;
    private boolean e;

    pw(com.facetec.sdk.pz pzVar) {
        if (pzVar == null) {
            throw new java.lang.NullPointerException("source == null");
        }
        this.c = pzVar;
    }

    @Override // com.facetec.sdk.pr
    public final com.facetec.sdk.pk c() {
        return this.f3755a;
    }

    @Override // com.facetec.sdk.pz
    public final long b(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        if (pkVar == null) {
            throw new java.lang.IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
        }
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (this.f3755a.b == 0 && this.c.b(this.f3755a, 8192L) == -1) {
            return -1L;
        }
        return this.f3755a.b(pkVar, java.lang.Math.min(j, this.f3755a.b));
    }

    @Override // com.facetec.sdk.pr
    public final boolean b() throws java.io.IOException {
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        return this.f3755a.b() && this.c.b(this.f3755a, 8192L) == -1;
    }

    @Override // com.facetec.sdk.pr
    public final void b(long j) throws java.io.IOException {
        if (!c(j)) {
            throw new java.io.EOFException();
        }
    }

    private boolean c(long j) throws java.io.IOException {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("byteCount < 0: ".concat(java.lang.String.valueOf(j)));
        }
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        while (this.f3755a.b < j) {
            if (this.c.b(this.f3755a, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facetec.sdk.pr
    public final byte j() throws java.io.IOException {
        b(1L);
        return this.f3755a.j();
    }

    @Override // com.facetec.sdk.pr
    public final com.facetec.sdk.pq a(long j) throws java.io.IOException {
        b(j);
        return this.f3755a.a(j);
    }

    @Override // com.facetec.sdk.pr
    public final byte[] i(long j) throws java.io.IOException {
        b(j);
        return this.f3755a.i(j);
    }

    @Override // com.facetec.sdk.pr
    public final void d(byte[] bArr) throws java.io.IOException {
        try {
            b(bArr.length);
            this.f3755a.d(bArr);
        } catch (java.io.EOFException e) {
            int i = 0;
            while (this.f3755a.b > 0) {
                com.facetec.sdk.pk pkVar = this.f3755a;
                int c = pkVar.c(bArr, i, (int) pkVar.b);
                if (c == -1) {
                    throw new java.lang.AssertionError();
                }
                i += c;
            }
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (this.f3755a.b == 0 && this.c.b(this.f3755a, 8192L) == -1) {
            return -1;
        }
        return this.f3755a.read(byteBuffer);
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String d(java.nio.charset.Charset charset) throws java.io.IOException {
        if (charset == null) {
            throw new java.lang.IllegalArgumentException("charset == null");
        }
        this.f3755a.e(this.c);
        return this.f3755a.d(charset);
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String m() throws java.io.IOException {
        return e(Long.MAX_VALUE);
    }

    @Override // com.facetec.sdk.pr
    public final java.lang.String e(long j) throws java.io.IOException {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("limit < 0: ".concat(java.lang.String.valueOf(j)));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long b = b((byte) 10, 0L, j2);
        if (b != -1) {
            return this.f3755a.c(b);
        }
        if (j2 < Long.MAX_VALUE && c(j2) && this.f3755a.d(j2 - 1) == 13 && c(1 + j2) && this.f3755a.d(j2) == 10) {
            return this.f3755a.c(j2);
        }
        com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
        com.facetec.sdk.pk pkVar2 = this.f3755a;
        pkVar2.b(pkVar, 0L, java.lang.Math.min(32L, pkVar2.e()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\\n not found: limit=");
        sb.append(java.lang.Math.min(this.f3755a.e(), j));
        sb.append(" content=");
        sb.append(pkVar.o().a());
        sb.append(kotlin.text.Typography.ellipsis);
        throw new java.io.EOFException(sb.toString());
    }

    @Override // com.facetec.sdk.pr
    public final short g() throws java.io.IOException {
        b(2L);
        return this.f3755a.g();
    }

    @Override // com.facetec.sdk.pr
    public final short i() throws java.io.IOException {
        b(2L);
        return this.f3755a.i();
    }

    @Override // com.facetec.sdk.pr
    public final int f() throws java.io.IOException {
        b(4L);
        return this.f3755a.f();
    }

    @Override // com.facetec.sdk.pr
    public final int h() throws java.io.IOException {
        b(4L);
        return this.f3755a.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r2)));
     */
    @Override // com.facetec.sdk.pr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l() throws java.io.IOException {
        b(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!c(i2)) {
                break;
            }
            byte d = this.f3755a.d(i);
            if ((d < 48 || d > 57) && ((d < 97 || d > 102) && (d < 65 || d > 70))) {
                break;
            }
            i = i2;
        }
        return this.f3755a.l();
    }

    @Override // com.facetec.sdk.pr
    public final void g(long j) throws java.io.IOException {
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        while (j > 0) {
            if (this.f3755a.b == 0 && this.c.b(this.f3755a, 8192L) == -1) {
                throw new java.io.EOFException();
            }
            long min = java.lang.Math.min(j, this.f3755a.e());
            this.f3755a.g(min);
            j -= min;
        }
    }

    @Override // com.facetec.sdk.pr
    public final long p() throws java.io.IOException {
        return b((byte) 0, 0L, Long.MAX_VALUE);
    }

    private long b(byte b, long j, long j2) throws java.io.IOException {
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("fromIndex=%s toIndex=%s", 0L, java.lang.Long.valueOf(j2)));
        }
        while (j < j2) {
            long c = this.f3755a.c(b, j, j2);
            if (c == -1) {
                long j3 = this.f3755a.b;
                if (j3 >= j2 || this.c.b(this.f3755a, 8192L) == -1) {
                    break;
                }
                j = java.lang.Math.max(j, j3);
            } else {
                return c;
            }
        }
        return -1L;
    }

    @Override // com.facetec.sdk.pr
    public final boolean e(com.facetec.sdk.pq pqVar) throws java.io.IOException {
        int j = pqVar.j();
        if (this.e) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (j < 0 || pqVar.j() < j) {
            return false;
        }
        for (int i = 0; i < j; i++) {
            long j2 = i;
            if (!c(1 + j2) || this.f3755a.d(j2) != pqVar.c(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.e;
    }

    @Override // com.facetec.sdk.pz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        this.c.close();
        this.f3755a.q();
    }

    @Override // com.facetec.sdk.pz
    public final com.facetec.sdk.qe d() {
        return this.c.d();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
