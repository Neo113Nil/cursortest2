package M10;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private volatile long f17242a;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f17243b;

    public final long a() {
        if (this.f17243b) {
            return 0L;
        }
        return this.f17242a;
    }

    public final void b() {
        this.f17243b = true;
    }

    public final void c(int i11) {
        if (this.f17243b) {
            return;
        }
        this.f17242a += i11;
        if (this.f17242a < 0) {
            this.f17242a = 0L;
        }
    }

    public final void d() {
        this.f17243b = false;
        this.f17242a = 0L;
    }
}
