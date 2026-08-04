package D6;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: D6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0123h extends AbstractC0109a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f1838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f1839e;

    public C0123h(p065i6.i iVar, Thread thread, X x4) {
        super(iVar, true);
        this.f1838d = thread;
        this.f1839e = x4;
    }

    @Override // D6.s0
    public final void h(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f1838d;
        if (t6.h.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
