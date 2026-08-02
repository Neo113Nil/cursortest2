package w4;

import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f20566m;

    public j(Runnable runnable, long j5, boolean z3) {
        super(j5, z3);
        this.f20566m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20566m.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f20566m;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC2282w.i(runnable));
        sb.append(", ");
        sb.append(this.f20564k);
        sb.append(", ");
        return L1.a.p(sb, this.f20565l ? "Blocking" : "Non-blocking", ']');
    }
}
