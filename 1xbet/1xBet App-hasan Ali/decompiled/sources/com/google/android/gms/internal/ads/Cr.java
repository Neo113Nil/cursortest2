package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Cr implements E3.a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f8091k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8092l;

    /* renamed from: m, reason: collision with root package name */
    public final E3.a f8093m;

    public Cr(Object obj, String str, E3.a aVar) {
        this.f8091k = obj;
        this.f8092l = str;
        this.f8093m = aVar;
    }

    @Override // E3.a
    public final void a(Runnable runnable, Executor executor) {
        this.f8093m.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f8093m.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8093m.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8093m.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8093m.isDone();
    }

    public final String toString() {
        return this.f8092l + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f8093m.get(j5, timeUnit);
    }
}
