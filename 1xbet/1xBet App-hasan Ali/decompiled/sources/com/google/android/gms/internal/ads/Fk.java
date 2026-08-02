package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class Fk {

    /* renamed from: a, reason: collision with root package name */
    public final Nm f9103a;

    /* renamed from: b, reason: collision with root package name */
    public final C1439pn f9104b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1166jk f9105c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f9106d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f9107e;
    public final ArrayDeque f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9108g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9109h;
    public final boolean i;

    public Fk(Looper looper, Nm nm, InterfaceC1166jk interfaceC1166jk) {
        this(new CopyOnWriteArraySet(), looper, nm, interfaceC1166jk, true);
    }

    public final void a(Object obj) {
        synchronized (this.f9108g) {
            try {
                if (this.f9109h) {
                    return;
                }
                this.f9106d.add(new C1525rk(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        e();
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        C1439pn c1439pn = this.f9104b;
        if (!c1439pn.f15040a.hasMessages(1)) {
            c1439pn.getClass();
            Vm e3 = C1439pn.e();
            Handler handler = c1439pn.f15040a;
            Message obtainMessage = handler.obtainMessage(1);
            e3.f11938a = obtainMessage;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
            e3.f11938a = null;
            C1439pn.d(e3);
        }
        ArrayDeque arrayDeque2 = this.f9107e;
        boolean isEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (isEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, Yj yj) {
        e();
        this.f.add(new Nj(i, 0, new CopyOnWriteArraySet(this.f9106d), yj));
    }

    public final void d() {
        e();
        synchronized (this.f9108g) {
            this.f9109h = true;
        }
        Iterator it = this.f9106d.iterator();
        while (it.hasNext()) {
            C1525rk c1525rk = (C1525rk) it.next();
            InterfaceC1166jk interfaceC1166jk = this.f9105c;
            c1525rk.f15370d = true;
            if (c1525rk.f15369c) {
                c1525rk.f15369c = false;
                interfaceC1166jk.c(c1525rk.f15367a, c1525rk.f15368b.b());
            }
        }
        this.f9106d.clear();
    }

    public final void e() {
        if (this.i) {
            AbstractC1668us.a0(Thread.currentThread() == this.f9104b.f15040a.getLooper().getThread());
        }
    }

    public Fk(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Nm nm, InterfaceC1166jk interfaceC1166jk, boolean z3) {
        this.f9103a = nm;
        this.f9106d = copyOnWriteArraySet;
        this.f9105c = interfaceC1166jk;
        this.f9108g = new Object();
        this.f9107e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.f9104b = nm.a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.Bj
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Fk fk = Fk.this;
                Iterator it = fk.f9106d.iterator();
                while (it.hasNext()) {
                    C1525rk c1525rk = (C1525rk) it.next();
                    if (!c1525rk.f15370d && c1525rk.f15369c) {
                        WG b3 = c1525rk.f15368b.b();
                        c1525rk.f15368b = new Sm();
                        c1525rk.f15369c = false;
                        fk.f9105c.c(c1525rk.f15367a, b3);
                    }
                    if (fk.f9104b.f15040a.hasMessages(1)) {
                        break;
                    }
                }
                return true;
            }
        });
        this.i = z3;
    }
}
