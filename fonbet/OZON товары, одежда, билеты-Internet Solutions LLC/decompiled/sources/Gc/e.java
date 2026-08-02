package Gc;

import java.util.concurrent.CountDownLatch;
import qc.InterfaceC9019a;

/* loaded from: classes9.dex */
public final class e extends CountDownLatch implements qc.g<Throwable>, InterfaceC9019a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f9906a;

    @Override // qc.g
    public final void accept(Throwable th2) throws Exception {
        this.f9906a = th2;
        countDown();
    }

    @Override // qc.InterfaceC9019a
    public final void run() {
        countDown();
    }
}
