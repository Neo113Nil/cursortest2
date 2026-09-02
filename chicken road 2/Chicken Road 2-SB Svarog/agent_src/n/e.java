package n;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f974a;

    /* renamed from: b, reason: collision with root package name */
    public final long f975b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f974a = 0L;
            this.f975b = 1L;
        } else {
            this.f974a = j2;
            this.f975b = j3;
        }
    }

    public final String toString() {
        return this.f974a + "/" + this.f975b;
    }
}
