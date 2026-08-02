package com.facetec.sdk;

/* loaded from: classes8.dex */
final class px implements com.facetec.sdk.pj {

    /* renamed from: a, reason: collision with root package name */
    public static int f3756a;
    public static int e;
    private boolean b;
    private com.facetec.sdk.qa c;
    private com.facetec.sdk.pk d = new com.facetec.sdk.pk();

    px(com.facetec.sdk.qa qaVar) {
        if (qaVar == null) {
            throw new java.lang.NullPointerException("sink == null");
        }
        this.c = qaVar;
    }

    @Override // com.facetec.sdk.pj, com.facetec.sdk.pr
    public final com.facetec.sdk.pk c() {
        return this.d;
    }

    @Override // com.facetec.sdk.qa
    public final void c(com.facetec.sdk.pk pkVar, long j) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.c(pkVar, j);
        t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj b(com.facetec.sdk.pq pqVar) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.b(pqVar);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj c(java.lang.String str) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.c(str);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj c(byte[] bArr) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.c(bArr);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj e(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.e(bArr, i, i2);
        return t();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        int write = this.d.write(byteBuffer);
        t();
        return write;
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj g(int i) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.g(i);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj j(int i) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.j(i);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj h(int i) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.h(i);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj l(long j) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.l(j);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj h(long j) throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        this.d.h(j);
        return t();
    }

    @Override // com.facetec.sdk.pj
    public final com.facetec.sdk.pj t() throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        long a2 = this.d.a();
        if (a2 > 0) {
            this.c.c(this.d, a2);
        }
        return this;
    }

    @Override // com.facetec.sdk.pj, com.facetec.sdk.qa, java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.b) {
            throw new java.lang.IllegalStateException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
        }
        if (this.d.b > 0) {
            com.facetec.sdk.qa qaVar = this.c;
            com.facetec.sdk.pk pkVar = this.d;
            qaVar.c(pkVar, pkVar.b);
        }
        this.c.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.b;
    }

    @Override // com.facetec.sdk.qa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.b) {
            return;
        }
        try {
            if (this.d.b > 0) {
                com.facetec.sdk.qa qaVar = this.c;
                com.facetec.sdk.pk pkVar = this.d;
                qaVar.c(pkVar, pkVar.b);
            }
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            this.c.close();
        } catch (java.lang.Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            com.facetec.sdk.qd.a(th);
        }
    }

    @Override // com.facetec.sdk.qa
    public final com.facetec.sdk.qe d() {
        return this.c.d();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("buffer(");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    public static int b() {
        int i = e;
        e = i + 1;
        if (i % 7675577 != 0) {
            return f3756a;
        }
        int nextInt = new java.util.Random().nextInt(276923876);
        f3756a = nextInt;
        return nextInt;
    }
}
