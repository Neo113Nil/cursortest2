package z1;

/* renamed from: z1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050c extends z1.AbstractC1048a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Thread f8560d;

    /* renamed from: e, reason: collision with root package name */
    public final z1.H f8561e;

    public C1050c(k1.i iVar, java.lang.Thread thread, z1.H h2) {
        super(iVar, true);
        this.f8560d = thread;
        this.f8561e = h2;
    }

    @Override // z1.Z
    public final void p(java.lang.Object obj) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f8560d;
        if (kotlin.jvm.internal.i.a(currentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}
