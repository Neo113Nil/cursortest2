package com.startapp.sdk.internal;

import android.os.HandlerThread;

/* loaded from: classes.dex */
public final class l8 extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3983a;

    public l8(String str) {
        super(str);
        this.f3983a = new Object();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        synchronized (this.f3983a) {
            this.f3983a.notifyAll();
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        synchronized (this.f3983a) {
            try {
                super.start();
                try {
                    this.f3983a.wait();
                } catch (InterruptedException e3) {
                    throw new RuntimeException(e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
