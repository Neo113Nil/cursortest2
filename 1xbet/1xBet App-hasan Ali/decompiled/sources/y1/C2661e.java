package y1;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2661e {

    /* renamed from: a, reason: collision with root package name */
    public final long f21150a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21151b;

    public C2661e(long j5, long j6) {
        if (j6 == 0) {
            this.f21150a = 0L;
            this.f21151b = 1L;
        } else {
            this.f21150a = j5;
            this.f21151b = j6;
        }
    }

    public final String toString() {
        return this.f21150a + "/" + this.f21151b;
    }
}
