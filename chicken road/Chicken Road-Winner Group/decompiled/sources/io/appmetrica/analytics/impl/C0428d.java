package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f7130a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0453e f7131b;

    public C0428d(C0453e c0453e) {
        this.f7131b = c0453e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f7130a.get()) {
            this.f7131b.f7175e.set(false);
            C0453e c0453e = this.f7131b;
            c0453e.f7173c.postAtFrontOfQueue(c0453e.f);
            int i3 = this.f7131b.f7172b.get();
            while (i3 > 0) {
                try {
                    Thread.sleep(C0453e.f7169g);
                    if (this.f7131b.f7175e.get()) {
                        break;
                    } else {
                        i3--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i3 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f7131b.f7171a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0402c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f7131b.f7175e.get()) {
                Thread.sleep(C0453e.f7169g);
            }
        }
    }
}
