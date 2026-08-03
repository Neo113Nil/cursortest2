package com.ironsource;

/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3032f<T> {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Object f6233a = new java.lang.Object();
    private java.util.Timer b;
    protected long c;
    protected T d;

    /* renamed from: com.ironsource.f$a */
    class a extends java.util.TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.ironsource.AbstractC3032f.this.b();
        }
    }

    public AbstractC3032f() {
    }

    protected boolean a() {
        return this.c <= 0;
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.f6233a) {
            java.util.Timer timer = this.b;
            if (timer != null) {
                timer.cancel();
                this.b = null;
            }
        }
    }

    public void d() {
        this.d = null;
    }

    protected void a(T t) {
        if (a() || t == null) {
            return;
        }
        this.d = t;
        c();
        synchronized (this.f6233a) {
            java.util.Timer timer = new java.util.Timer();
            this.b = timer;
            timer.schedule(new com.ironsource.AbstractC3032f.a(), this.c);
        }
    }

    public AbstractC3032f(long j) {
        this.c = j;
    }
}
