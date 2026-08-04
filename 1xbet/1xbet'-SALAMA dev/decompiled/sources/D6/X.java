package D6;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X extends A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1811f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p050g6.f f1814e;

    public final void f(boolean z4) {
        long j = this.f1812c - (z4 ? 4294967296L : 1L);
        this.f1812c = j;
        if (j <= 0 && this.f1813d) {
            shutdown();
        }
    }

    public abstract Thread g();

    public final void h(boolean z4) {
        this.f1812c = (z4 ? 4294967296L : 1L) + this.f1812c;
        if (z4) {
            return;
        }
        this.f1813d = true;
    }

    public abstract long i();

    public final boolean j() throws IllegalAccessException, InvocationTargetException {
        p050g6.f fVar = this.f1814e;
        if (fVar == null) {
            return false;
        }
        L l7 = (L) (fVar.isEmpty() ? null : fVar.removeFirst());
        if (l7 == null) {
            return false;
        }
        l7.run();
        return true;
    }

    public void k(long j, U u4) {
        F.f1788A.q(j, u4);
    }

    public abstract void shutdown();
}
