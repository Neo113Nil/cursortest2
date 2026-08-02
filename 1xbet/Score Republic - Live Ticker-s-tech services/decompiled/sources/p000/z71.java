package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z71 {
    /* JADX INFO: renamed from: a */
    public final void m5865a(c81 c81Var) {
        try {
            mo602b(c81Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo602b(c81 c81Var);
}
