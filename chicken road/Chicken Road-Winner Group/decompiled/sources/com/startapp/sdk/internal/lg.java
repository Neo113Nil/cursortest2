package com.startapp.sdk.internal;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lg implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Queue f4013a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4014b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f4015c;

    public lg(Executor executor) {
        this.f4014b = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) ((ArrayDeque) this.f4013a).poll();
        this.f4015c = runnable;
        if (runnable != null) {
            this.f4014b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        ((ArrayDeque) this.f4013a).offer(new kg(this, runnable));
        if (this.f4015c == null) {
            a();
        }
    }
}
