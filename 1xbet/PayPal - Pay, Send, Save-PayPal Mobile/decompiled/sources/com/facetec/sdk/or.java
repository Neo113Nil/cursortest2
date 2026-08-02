package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class or implements java.io.Closeable {
    private static final java.util.logging.Logger e = java.util.logging.Logger.getLogger(com.facetec.sdk.on.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final com.facetec.sdk.pj f3728a;
    private final com.facetec.sdk.pk b;
    int c;
    private final boolean d;
    private boolean f;
    private com.facetec.sdk.om.a h;

    or(com.facetec.sdk.pj pjVar, boolean z) {
        this.f3728a = pjVar;
        this.d = z;
        com.facetec.sdk.pk pkVar = new com.facetec.sdk.pk();
        this.b = pkVar;
        this.h = new com.facetec.sdk.om.a(pkVar);
        this.c = 16384;
    }

    public final void d() throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (this.d) {
                java.util.logging.Logger logger = e;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    logger.fine(com.facetec.sdk.nh.c(">> CONNECTION %s", com.facetec.sdk.on.e.a()));
                }
                this.f3728a.c(com.facetec.sdk.on.e.i());
                this.f3728a.flush();
            }
        }
    }

    public final void d(com.facetec.sdk.oq oqVar) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            int i = this.c;
            if ((oqVar.e & 32) != 0) {
                i = oqVar.b[5];
            }
            this.c = i;
            if (oqVar.d() != -1) {
                com.facetec.sdk.om.a aVar = this.h;
                int d = oqVar.d();
                aVar.e = d;
                int min = java.lang.Math.min(d, 16384);
                if (aVar.c != min) {
                    if (min < aVar.c) {
                        aVar.d = java.lang.Math.min(aVar.d, min);
                    }
                    aVar.b = true;
                    aVar.c = min;
                    if (aVar.c < aVar.j) {
                        if (aVar.c == 0) {
                            aVar.d();
                        } else {
                            aVar.c(aVar.j - aVar.c);
                        }
                    }
                }
            }
            c(0, 0, (byte) 4, (byte) 1);
            this.f3728a.flush();
        }
    }

    public final void b() throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            this.f3728a.flush();
        }
    }

    public final void d(boolean z, int i, java.util.List<com.facetec.sdk.of> list) throws java.io.IOException {
        int i2;
        int i3;
        synchronized (this) {
            boolean z2 = this.f;
            if (z2) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (z2) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            com.facetec.sdk.om.a aVar = this.h;
            if (aVar.b) {
                if (aVar.d < aVar.c) {
                    aVar.e(aVar.d, 31, 32);
                }
                aVar.b = false;
                aVar.d = Integer.MAX_VALUE;
                aVar.e(aVar.c, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                com.facetec.sdk.of ofVar = list.get(i4);
                com.facetec.sdk.pq h = ofVar.j.h();
                com.facetec.sdk.pq pqVar = ofVar.i;
                java.lang.Integer num = com.facetec.sdk.om.e.get(h);
                if (num != null) {
                    int intValue = num.intValue();
                    i3 = intValue + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (com.facetec.sdk.nh.d(com.facetec.sdk.om.c[intValue].i, pqVar)) {
                            i2 = i3;
                        } else if (com.facetec.sdk.nh.d(com.facetec.sdk.om.c[i3].i, pqVar)) {
                            i2 = intValue + 2;
                        }
                    }
                    i2 = -1;
                } else {
                    i2 = -1;
                    i3 = -1;
                }
                if (i2 == -1) {
                    int i5 = aVar.g + 1;
                    int length = aVar.f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (com.facetec.sdk.nh.d(aVar.f[i5].j, h)) {
                            if (com.facetec.sdk.nh.d(aVar.f[i5].i, pqVar)) {
                                i2 = (i5 - aVar.g) + com.facetec.sdk.om.c.length;
                                break;
                            } else if (i3 == -1) {
                                i3 = (i5 - aVar.g) + com.facetec.sdk.om.c.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    aVar.e(i2, 127, 128);
                } else if (i3 == -1) {
                    aVar.f3723a.g(64);
                    aVar.e(h);
                    aVar.e(pqVar);
                    aVar.d(ofVar);
                } else {
                    com.facetec.sdk.pq pqVar2 = com.facetec.sdk.of.c;
                    if (h.a(0, pqVar2, 0, pqVar2.j()) && !com.facetec.sdk.of.h.equals(h)) {
                        aVar.e(i3, 15, 0);
                        aVar.e(pqVar);
                    } else {
                        aVar.e(i3, 63, 64);
                        aVar.e(pqVar);
                        aVar.d(ofVar);
                    }
                }
            }
            long e2 = this.b.e();
            int min = (int) java.lang.Math.min(this.c, e2);
            long j = min;
            byte b = e2 == j ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            c(i, min, (byte) 1, b);
            this.f3728a.c(this.b, j);
            if (e2 > j) {
                long j2 = e2 - j;
                while (j2 > 0) {
                    int min2 = (int) java.lang.Math.min(this.c, j2);
                    long j3 = min2;
                    j2 -= j3;
                    c(i, min2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                    this.f3728a.c(this.b, j3);
                }
            }
        }
    }

    public final void b(int i, com.facetec.sdk.og ogVar) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (ogVar.h == -1) {
                throw new java.lang.IllegalArgumentException();
            }
            c(i, 4, (byte) 3, (byte) 0);
            this.f3728a.h(ogVar.h);
            this.f3728a.flush();
        }
    }

    public final void a(boolean z, int i, com.facetec.sdk.pk pkVar, int i2) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            c(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
            if (i2 > 0) {
                this.f3728a.c(pkVar, i2);
            }
        }
    }

    public final void c(com.facetec.sdk.oq oqVar) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            int i = 0;
            c(0, java.lang.Integer.bitCount(oqVar.e) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (oqVar.a(i)) {
                    this.f3728a.j(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f3728a.h(oqVar.b(i));
                }
                i++;
            }
            this.f3728a.flush();
        }
    }

    public final void b(boolean z, int i, int i2) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            c(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.f3728a.h(i);
            this.f3728a.h(i2);
            this.f3728a.flush();
        }
    }

    public final void b(int i, com.facetec.sdk.og ogVar, byte[] bArr) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (ogVar.h == -1) {
                throw com.facetec.sdk.on.c("errorCode.httpCode == -1", new java.lang.Object[0]);
            }
            c(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f3728a.h(i);
            this.f3728a.h(ogVar.h);
            if (bArr.length > 0) {
                this.f3728a.c(bArr);
            }
            this.f3728a.flush();
        }
    }

    public final void c(int i, long j) throws java.io.IOException {
        synchronized (this) {
            if (this.f) {
                throw new java.io.IOException(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED);
            }
            if (j == 0 || j > androidx.collection.SieveCacheKt.NodeLinkMask) {
                throw com.facetec.sdk.on.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", java.lang.Long.valueOf(j));
            }
            c(i, 4, (byte) 8, (byte) 0);
            this.f3728a.h((int) j);
            this.f3728a.flush();
        }
    }

    private void c(int i, int i2, byte b, byte b2) throws java.io.IOException {
        java.util.logging.Logger logger = e;
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            logger.fine(com.facetec.sdk.on.d(false, i, i2, b, b2));
        }
        int i3 = this.c;
        if (i2 > i3) {
            throw com.facetec.sdk.on.c("FRAME_SIZE_ERROR length > %d: %d", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2));
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw com.facetec.sdk.on.c("reserved bit set: %s", java.lang.Integer.valueOf(i));
        }
        c(this.f3728a, i2);
        this.f3728a.g(b & 255);
        this.f3728a.g(b2 & 255);
        this.f3728a.h(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        synchronized (this) {
            this.f = true;
            this.f3728a.close();
        }
    }

    private static void c(com.facetec.sdk.pj pjVar, int i) throws java.io.IOException {
        pjVar.g((i >>> 16) & 255);
        pjVar.g((i >>> 8) & 255);
        pjVar.g(i & 255);
    }
}
