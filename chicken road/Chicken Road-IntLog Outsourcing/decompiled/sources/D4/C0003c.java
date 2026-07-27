package D4;

import java.util.concurrent.locks.LockSupport;
import k4.InterfaceC1223i;

/* renamed from: D4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003c extends AbstractC0001a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f490d;

    /* renamed from: e, reason: collision with root package name */
    public final O f491e;

    public C0003c(InterfaceC1223i interfaceC1223i, Thread thread, O o2) {
        super(interfaceC1223i, true);
        this.f490d = thread;
        this.f491e = o2;
    }

    @Override // D4.g0
    public final void l(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f490d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
