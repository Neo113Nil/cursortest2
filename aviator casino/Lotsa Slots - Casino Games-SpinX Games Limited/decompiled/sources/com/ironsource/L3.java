package com.ironsource;

/* loaded from: classes5.dex */
public class L3 {

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.L3.a f5811a = com.ironsource.L3.a.NOT_READY;
    private java.util.ArrayList b = new java.util.ArrayList();
    private java.lang.String c;

    enum a {
        NOT_READY,
        READY
    }

    public L3(java.lang.String str) {
        this.c = str;
    }

    public synchronized void a(java.lang.Runnable runnable) {
        if (this.f5811a != com.ironsource.L3.a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f5811a = com.ironsource.L3.a.NOT_READY;
    }

    public synchronized void c() {
        this.f5811a = com.ironsource.L3.a.READY;
    }

    public synchronized void a() {
        java.lang.Object[] array = this.b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((java.lang.Runnable) array[i]).run();
            array[i] = null;
        }
        this.b.clear();
    }
}
