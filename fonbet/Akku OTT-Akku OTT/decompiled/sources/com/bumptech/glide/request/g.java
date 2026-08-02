package com.bumptech.glide.request;

import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.util.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class g<R> implements Future, com.bumptech.glide.request.target.b, h<R> {

    @Nullable
    @GuardedBy("this")
    public R a;

    @Nullable
    @GuardedBy("this")
    public d b;

    @GuardedBy("this")
    public boolean c;

    @GuardedBy("this")
    public boolean d;

    @GuardedBy("this")
    public boolean e;

    @Nullable
    @GuardedBy("this")
    public s f;

    @VisibleForTesting
    public static class a {
    }

    @Override // com.bumptech.glide.request.target.b
    public final synchronized void a(@NonNull Object obj) {
    }

    @Override // com.bumptech.glide.request.target.b
    public final void b(@NonNull j jVar) {
        jVar.j(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.b
    public final synchronized void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.c = true;
                notifyAll();
                d dVar = null;
                if (z) {
                    d dVar2 = this.b;
                    this.b = null;
                    dVar = dVar2;
                }
                if (dVar != null) {
                    dVar.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.target.b
    @Nullable
    public final synchronized d d() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.h
    public final synchronized void e(@NonNull Object obj) {
        this.d = true;
        this.a = obj;
        notifyAll();
    }

    @Override // com.bumptech.glide.request.h
    public final synchronized void f(@Nullable s sVar) {
        this.e = true;
        this.f = sVar;
        notifyAll();
    }

    @Override // com.bumptech.glide.request.target.b
    public final synchronized void g(@Nullable d dVar) {
        this.b = dVar;
    }

    @Override // java.util.concurrent.Future
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return j(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.bumptech.glide.manager.l
    public final void h() {
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.c && !this.d) {
            z = this.e;
        }
        return z;
    }

    public final synchronized R j(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            char[] cArr = m.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.d) {
            return this.a;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.c) {
            throw new CancellationException();
        }
        if (this.d) {
            return this.a;
        }
        throw new TimeoutException();
    }

    @Override // com.bumptech.glide.manager.l
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.l
    public final void onStart() {
    }

    public final String toString() {
        d dVar;
        String str;
        String a2 = androidx.concurrent.futures.a.a(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                dVar = null;
                if (this.c) {
                    str = "CANCELLED";
                } else if (this.e) {
                    str = "FAILURE";
                } else if (this.d) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    dVar = this.b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar == null) {
            return android.support.v4.media.session.f.b(a2, str, "]");
        }
        return a2 + str + ", request=[" + dVar + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return j(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // com.bumptech.glide.request.target.b
    public final void i() {
    }
}
