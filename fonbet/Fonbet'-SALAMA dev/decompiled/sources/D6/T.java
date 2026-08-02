package D6;

/* loaded from: classes2.dex */
public final class T extends U {

    /* renamed from: c, reason: collision with root package name */
    public final E0 f1804c;

    public T(long j, E0 e02) {
        super(j);
        this.f1804c = e02;
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
