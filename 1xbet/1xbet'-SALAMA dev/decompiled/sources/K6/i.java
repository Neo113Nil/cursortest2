package K6;

import D6.E;
import p023d1.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f4165c;

    public i(Runnable runnable, long j, n nVar) {
        super(j, nVar);
        this.f4165c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4165c.run();
        } finally {
            this.f4164b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4165c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(E.i(runnable));
        sb.append(", ");
        sb.append(this.f4163a);
        sb.append(", ");
        sb.append(this.f4164b);
        sb.append(']');
        return sb.toString();
    }
}
