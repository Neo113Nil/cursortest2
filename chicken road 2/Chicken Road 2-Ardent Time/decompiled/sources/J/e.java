package J;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f888a;

    /* renamed from: b, reason: collision with root package name */
    public final long f889b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f888a = 0L;
            this.f889b = 1L;
        } else {
            this.f888a = j2;
            this.f889b = j3;
        }
    }

    public final java.lang.String toString() {
        return this.f888a + "/" + this.f889b;
    }
}
