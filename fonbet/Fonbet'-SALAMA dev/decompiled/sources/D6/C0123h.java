package D6;

import i6.InterfaceC1292i;
import java.util.concurrent.locks.LockSupport;

/* renamed from: D6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0123h extends AbstractC0109a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f1838d;

    /* renamed from: e, reason: collision with root package name */
    public final X f1839e;

    public C0123h(InterfaceC1292i interfaceC1292i, Thread thread, X x4) {
        super(interfaceC1292i, true);
        this.f1838d = thread;
        this.f1839e = x4;
    }

    @Override // D6.s0
    public final void h(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1838d;
        if (t6.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
