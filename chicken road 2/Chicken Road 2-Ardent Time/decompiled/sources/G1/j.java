package G1;

/* loaded from: classes.dex */
public final class j extends G1.h {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f585c;

    public j(java.lang.Runnable runnable, long j2, G1.i iVar) {
        super(j2, iVar);
        this.f585c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f585c.run();
        } finally {
            this.f583b.getClass();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Task[");
        java.lang.Runnable runnable = this.f585c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(z1.AbstractC1068v.b(runnable));
        sb.append(", ");
        sb.append(this.f582a);
        sb.append(", ");
        sb.append(this.f583b);
        sb.append(']');
        return sb.toString();
    }
}
