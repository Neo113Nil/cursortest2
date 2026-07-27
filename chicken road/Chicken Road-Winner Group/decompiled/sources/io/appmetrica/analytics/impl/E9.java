package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class E9 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f5904a;

    /* renamed from: b, reason: collision with root package name */
    public final C0490fa f5905b;

    public E9(Context context, String str) {
        this(new ReentrantLock(), new C0490fa(context, str));
    }

    public final void a() {
        this.f5904a.lock();
        this.f5905b.a();
    }

    public final void b() {
        this.f5905b.b();
        this.f5904a.unlock();
    }

    public final void c() {
        C0490fa c0490fa = this.f5905b;
        synchronized (c0490fa) {
            c0490fa.b();
            c0490fa.f7282a.delete();
        }
        this.f5904a.unlock();
    }

    public E9(ReentrantLock reentrantLock, C0490fa c0490fa) {
        this.f5904a = reentrantLock;
        this.f5905b = c0490fa;
    }
}
