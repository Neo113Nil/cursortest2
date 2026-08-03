package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1154Xk extends java.lang.Thread implements java.io.Closeable {
    public boolean A00 = false;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1155Xl A01;

    public C1154Xk(com.facebook.ads.redexgen.core.C1155Xl c1155Xl) {
        this.A01 = c1155Xl;
        start();
    }

    public final synchronized void A00() {
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj;
        c1153Xj = this.A01.A02;
        c1153Xj.A02();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj;
        synchronized (this) {
            this.A00 = true;
            c1153Xj = this.A01.A02;
            c1153Xj.A02();
        }
        try {
            join();
        } catch (java.lang.InterruptedException unused) {
            throw new java.io.InterruptedIOException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r0 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002c, code lost:
    
        r0 = r5.A01.A03;
        r0.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005b, code lost:
    
        monitor-enter(r5.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005c, code lost:
    
        r0 = r5.A01.A02;
        r0.A03();
        r5.A01.A00 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        throw r2;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj;
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj2;
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj3;
        com.facebook.ads.redexgen.core.C1153Xj c1153Xj4;
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    try {
                        c1153Xj2 = this.A01.A02;
                        c1153Xj2.A04();
                        synchronized (this.A01) {
                            try {
                                synchronized (this) {
                                    try {
                                        boolean z = this.A00;
                                        c1153Xj3 = this.A01.A02;
                                        boolean A05 = c1153Xj3.A05();
                                    } finally {
                                        th = th;
                                        while (true) {
                                            try {
                                            } catch (java.lang.Throwable th) {
                                                th = th;
                                            }
                                        }
                                    }
                                }
                                try {
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    } catch (java.lang.Exception unused) {
                        synchronized (this.A01) {
                            try {
                                c1153Xj = this.A01.A02;
                                c1153Xj.A03();
                                this.A01.A00 = null;
                                return;
                            } finally {
                                th = th;
                                while (true) {
                                    try {
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                }
                            }
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    com.facebook.ads.redexgen.core.WU.A00(th5, this);
                    return;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        }
        synchronized (this.A01) {
            try {
                c1153Xj4 = this.A01.A02;
                c1153Xj4.A03();
                this.A01.A00 = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
                while (true) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th8) {
                    }
                }
            }
        }
    }
}
