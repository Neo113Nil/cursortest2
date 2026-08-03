package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.4y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableFutureC04464y<R, E extends java.lang.Exception> implements java.util.concurrent.RunnableFuture<R> {
    public java.lang.Exception A00;
    public R A01;
    public java.lang.Thread A02;
    public boolean A03;
    public final com.facebook.ads.redexgen.core.AnonymousClass48 A05 = new com.facebook.ads.redexgen.core.AnonymousClass48();
    public final com.facebook.ads.redexgen.core.AnonymousClass48 A04 = new com.facebook.ads.redexgen.core.AnonymousClass48();
    public final java.lang.Object A06 = new java.lang.Object();

    public abstract R A01() throws java.lang.Exception;

    public abstract void A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    private R A00() throws java.util.concurrent.ExecutionException {
        if (!this.A03) {
            if (this.A00 == null) {
                return this.A01;
            }
            throw new java.util.concurrent.ExecutionException(this.A00);
        }
        throw new java.util.concurrent.CancellationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    public final void A02() {
        this.A04.A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.A06) {
            if (this.A03 || this.A04.A03()) {
                return false;
            }
            this.A03 = true;
            A03();
            java.lang.Thread thread = this.A02;
            if (thread != null) {
                if (z) {
                    thread.interrupt();
                }
            } else {
                this.A05.A04();
                this.A04.A04();
            }
            return true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final R get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        this.A04.A00();
        return A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final R get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (this.A04.A05(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return A00();
        }
        throw new java.util.concurrent.TimeoutException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A03;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A04.A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<R, E extends java.lang.Exception> */
    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A06) {
                try {
                    if (this.A03) {
                        try {
                            return;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    this.A02 = java.lang.Thread.currentThread();
                    this.A05.A04();
                    try {
                        try {
                            this.A01 = A01();
                            synchronized (this.A06) {
                                try {
                                    this.A04.A04();
                                    this.A02 = null;
                                    java.lang.Thread.interrupted();
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (java.lang.Throwable th3) {
                                        }
                                    }
                                }
                            }
                        } catch (java.lang.Exception e) {
                            this.A00 = e;
                            synchronized (this.A06) {
                                try {
                                    this.A04.A04();
                                    this.A02 = null;
                                    java.lang.Thread.interrupted();
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
                        synchronized (this.A06) {
                            this.A04.A04();
                            this.A02 = null;
                            java.lang.Thread.interrupted();
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            }
        } catch (java.lang.Throwable th7) {
            com.facebook.ads.redexgen.core.WU.A00(th7, this);
        }
    }
}
