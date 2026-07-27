package w2;

import e2.C0289d;

/* loaded from: classes.dex */
public abstract class H extends AbstractC1239s {
    public static final /* synthetic */ int f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f10469c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10470d;

    /* renamed from: e, reason: collision with root package name */
    public C0289d f10471e;

    public final void e(boolean z3) {
        long j3 = this.f10469c - (z3 ? 4294967296L : 1L);
        this.f10469c = j3;
        if (j3 <= 0 && this.f10470d) {
            shutdown();
        }
    }

    public abstract Thread f();

    public final void j(boolean z3) {
        this.f10469c = (z3 ? 4294967296L : 1L) + this.f10469c;
        if (z3) {
            return;
        }
        this.f10470d = true;
    }

    public abstract long l();

    public final boolean m() {
        C0289d c0289d = this.f10471e;
        if (c0289d == null) {
            return false;
        }
        A a3 = (A) (c0289d.isEmpty() ? null : c0289d.removeFirst());
        if (a3 == null) {
            return false;
        }
        a3.run();
        return true;
    }

    public abstract void shutdown();
}
