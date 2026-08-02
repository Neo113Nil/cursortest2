package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class mh {
    private static /* synthetic */ boolean j = true;

    @javax.annotation.Nullable
    private java.util.concurrent.ExecutorService d;

    @javax.annotation.Nullable
    private java.lang.Runnable e;
    public int b = 64;

    /* renamed from: a, reason: collision with root package name */
    private int f3645a = 5;
    final java.util.Deque<com.facetec.sdk.mz.a> c = new java.util.ArrayDeque();
    private final java.util.Deque<com.facetec.sdk.mz.a> f = new java.util.ArrayDeque();
    private final java.util.Deque<com.facetec.sdk.mz> h = new java.util.ArrayDeque();

    private java.util.concurrent.ExecutorService b() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (this) {
            if (this.d == null) {
                this.d = new java.util.concurrent.ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), com.facetec.sdk.nh.c("OkHttp Dispatcher", false));
            }
            executorService = this.d;
        }
        return executorService;
    }

    public final boolean a() {
        int i;
        boolean z;
        if (!j && java.lang.Thread.holdsLock(this)) {
            throw new java.lang.AssertionError();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this) {
            java.util.Iterator<com.facetec.sdk.mz.a> it = this.c.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                com.facetec.sdk.mz.a next = it.next();
                if (this.f.size() >= this.b) {
                    break;
                }
                for (com.facetec.sdk.mz.a aVar : this.f) {
                    if (!com.facetec.sdk.mz.this.g && aVar.b().equals(next.b())) {
                        i++;
                    }
                }
                if (i < this.f3645a) {
                    it.remove();
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = c() > 0;
        }
        int size = arrayList.size();
        while (i < size) {
            com.facetec.sdk.mz.a aVar2 = (com.facetec.sdk.mz.a) arrayList.get(i);
            java.util.concurrent.ExecutorService b = b();
            if (!com.facetec.sdk.mz.a.c && java.lang.Thread.holdsLock(com.facetec.sdk.mz.this.f3671a.m())) {
                throw new java.lang.AssertionError();
            }
            try {
                try {
                    b.execute(aVar2);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    com.facetec.sdk.mo unused = com.facetec.sdk.mz.this.b;
                    com.facetec.sdk.mz mzVar = com.facetec.sdk.mz.this;
                    com.facetec.sdk.mg mgVar = aVar2.f3672a;
                    com.facetec.sdk.mz mzVar2 = com.facetec.sdk.mz.this;
                    mgVar.c(interruptedIOException);
                    com.facetec.sdk.mz.this.f3671a.m().c(aVar2);
                }
                i++;
            } catch (java.lang.Throwable th) {
                com.facetec.sdk.mz.this.f3671a.m().c(aVar2);
                throw th;
            }
        }
        return z;
    }

    final void c(com.facetec.sdk.mz.a aVar) {
        d(this.f, aVar);
    }

    private <T> void d(java.util.Deque<T> deque, T t) {
        java.lang.Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new java.lang.AssertionError("Call wasn't in-flight!");
            }
            runnable = this.e;
        }
        if (a() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private int c() {
        int size;
        int size2;
        synchronized (this) {
            size = this.f.size();
            size2 = this.h.size();
        }
        return size + size2;
    }
}
