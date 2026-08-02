package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0428lc extends AbstractC0526o {

    /* JADX INFO: renamed from: o */
    public final Thread f4758o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0412kx f4759p;

    public C0428lc(InterfaceC0180en interfaceC0180en, Thread thread, AbstractC0412kx abstractC0412kx) {
        super(interfaceC0180en, true);
        this.f4758o = thread;
        this.f4759p = abstractC0412kx;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: o */
    public final void mo2625o(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f4758o;
        if (af0.m187a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
