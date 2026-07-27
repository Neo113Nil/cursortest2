package w2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224c extends AbstractC1222a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f10497d;

    /* renamed from: e, reason: collision with root package name */
    public final H f10498e;

    public C1224c(g2.h hVar, Thread thread, H h3) {
        super(hVar, true);
        this.f10497d = thread;
        this.f10498e = h3;
    }

    @Override // w2.Z
    public final void o(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f10497d;
        if (kotlin.jvm.internal.j.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
