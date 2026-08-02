package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Iw extends Hw {

    /* renamed from: r, reason: collision with root package name */
    public final E3.a f9643r;

    public Iw(E3.a aVar) {
        aVar.getClass();
        this.f9643r = aVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, E3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f9643r.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f9643r.cancel(z3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, java.util.concurrent.Future
    public final Object get() {
        return this.f9643r.get();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9643r.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9643r.isDone();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow
    public final String toString() {
        return this.f9643r.toString();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1403ow, java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f9643r.get(j5, timeUnit);
    }
}
