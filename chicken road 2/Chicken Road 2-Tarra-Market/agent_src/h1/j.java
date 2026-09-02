package h1;

import b1.AbstractC0030s;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f1246c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f1246c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f1246c.run();
        } finally {
            this.f1244b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1246c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0030s.a(runnable));
        sb.append(", ");
        sb.append(this.f1243a);
        sb.append(", ");
        sb.append(this.f1244b);
        sb.append(']');
        return sb.toString();
    }
}
