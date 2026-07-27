package com.ironsource;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class I3 {

    /* renamed from: a, reason: collision with root package name */
    private a f7672a = a.NOT_READY;
    private ArrayList b = new ArrayList();
    private String c;

    enum a {
        NOT_READY,
        READY
    }

    public I3(String str) {
        this.c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f7672a != a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f7672a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f7672a = a.READY;
    }

    public synchronized void a() {
        Object[] array = this.b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.b.clear();
    }
}
