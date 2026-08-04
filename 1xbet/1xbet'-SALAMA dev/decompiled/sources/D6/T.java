package D6;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E0 f1804c;

    public T(long j, E0 e7) {
        super(j);
        this.f1804c = e7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1804c.run();
    }

    @Override // D6.U
    public final String toString() {
        return super.toString() + this.f1804c;
    }
}
