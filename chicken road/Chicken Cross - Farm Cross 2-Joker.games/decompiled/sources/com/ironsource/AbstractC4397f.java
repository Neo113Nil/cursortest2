package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4397f<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f8179a = new Object();
    private Timer b;
    protected long c;
    protected T d;

    /* renamed from: com.ironsource.f$a */
    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4397f.this.b();
        }
    }

    public AbstractC4397f() {
    }

    protected boolean a() {
        return this.c <= 0;
    }

    protected abstract void b();

    protected void c() {
        synchronized (this.f8179a) {
            Timer timer = this.b;
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
        synchronized (this.f8179a) {
            Timer timer = new Timer();
            this.b = timer;
            timer.schedule(new a(), this.c);
        }
    }

    public AbstractC4397f(long j) {
        this.c = j;
    }
}
