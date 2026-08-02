package p4;

import java.util.concurrent.locks.LockSupport;

/* renamed from: p4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2263c extends AbstractC2261a {

    /* renamed from: n, reason: collision with root package name */
    public final Thread f18782n;

    /* renamed from: o, reason: collision with root package name */
    public final K f18783o;

    public C2263c(a4.h hVar, Thread thread, K k5) {
        super(hVar, true);
        this.f18782n = thread;
        this.f18783o = k5;
    }

    @Override // p4.b0
    public final void w(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f18782n;
        if (kotlin.jvm.internal.l.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
