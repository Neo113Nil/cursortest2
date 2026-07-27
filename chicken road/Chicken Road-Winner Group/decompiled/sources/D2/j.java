package D2;

import w2.AbstractC1242v;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f318c;

    public j(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f318c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f318c.run();
        } finally {
            this.f316b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f318c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC1242v.c(runnable));
        sb.append(", ");
        sb.append(this.f315a);
        sb.append(", ");
        sb.append(this.f316b);
        sb.append(']');
        return sb.toString();
    }
}
