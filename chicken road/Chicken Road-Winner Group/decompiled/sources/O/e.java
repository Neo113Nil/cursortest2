package O;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f1020a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1021b;

    public e(long j3, long j4) {
        if (j4 == 0) {
            this.f1020a = 0L;
            this.f1021b = 1L;
        } else {
            this.f1020a = j3;
            this.f1021b = j4;
        }
    }

    public final String toString() {
        return this.f1020a + "/" + this.f1021b;
    }
}
