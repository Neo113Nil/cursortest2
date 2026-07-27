package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class E9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f6745a;

    /* renamed from: b, reason: collision with root package name */
    public final C0639fa f6746b;

    public E9(Context context, String str) {
        this(new ReentrantLock(), new C0639fa(context, str));
    }

    public final void a() {
        this.f6745a.lock();
        this.f6746b.a();
    }

    public final void b() {
        this.f6746b.b();
        this.f6745a.unlock();
    }

    public final void c() {
        C0639fa c0639fa = this.f6746b;
        synchronized (c0639fa) {
            c0639fa.b();
            c0639fa.f8177a.delete();
        }
        this.f6745a.unlock();
    }

    public E9(ReentrantLock reentrantLock, C0639fa c0639fa) {
        this.f6745a = reentrantLock;
        this.f6746b = c0639fa;
    }
}
