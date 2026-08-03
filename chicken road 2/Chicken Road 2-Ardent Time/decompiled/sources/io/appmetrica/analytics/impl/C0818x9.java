package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0818x9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f7103a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Y9 f7104b;

    public C0818x9(android.content.Context context, java.lang.String str) {
        this(new java.util.concurrent.locks.ReentrantLock(), new io.appmetrica.analytics.impl.Y9(context, str));
    }

    public final void a() {
        this.f7103a.lock();
        this.f7104b.a();
    }

    public final void b() {
        this.f7104b.b();
        this.f7103a.unlock();
    }

    public final void c() {
        io.appmetrica.analytics.impl.Y9 y9 = this.f7104b;
        synchronized (y9) {
            y9.b();
            y9.f5333a.delete();
        }
        this.f7103a.unlock();
    }

    public C0818x9(java.util.concurrent.locks.ReentrantLock reentrantLock, io.appmetrica.analytics.impl.Y9 y9) {
        this.f7103a = reentrantLock;
        this.f7104b = y9;
    }
}
