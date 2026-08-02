package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: rx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0671rx {

    /* JADX INFO: renamed from: a */
    public static final C0634qx f6987a = new C0634qx("No further exceptions");

    /* JADX INFO: renamed from: a */
    public static boolean m4415a(AtomicReference atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = (Throwable) atomicReference.get();
            if (th2 == f6987a) {
                return false;
            }
            Throwable c0658rk = th2 == null ? th : new C0658rk(th2, th);
            while (!atomicReference.compareAndSet(th2, c0658rk)) {
                if (atomicReference.get() != th2) {
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Throwable m4416b(AtomicReference atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        C0634qx c0634qx = f6987a;
        return th != c0634qx ? (Throwable) atomicReference.getAndSet(c0634qx) : th;
    }

    /* JADX INFO: renamed from: c */
    public static RuntimeException m4417c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}
