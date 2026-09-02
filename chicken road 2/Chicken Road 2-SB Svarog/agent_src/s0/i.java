package s0;

import F.E;
import m0.AbstractC0062t;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f1235d;

    public i(Runnable runnable, long j2, E e2) {
        super(j2, e2);
        this.f1235d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1235d.run();
        } finally {
            this.f1234c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1235d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0062t.a(runnable));
        sb.append(", ");
        sb.append(this.f1233b);
        sb.append(", ");
        sb.append(this.f1234c);
        sb.append(']');
        return sb.toString();
    }
}
