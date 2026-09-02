package o;

/* renamed from: o.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807e {

    /* renamed from: a, reason: collision with root package name */
    public final long f6213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6214b;

    public C0807e(long j2, long j3) {
        if (j3 == 0) {
            this.f6213a = 0L;
            this.f6214b = 1L;
        } else {
            this.f6213a = j2;
            this.f6214b = j3;
        }
    }

    public final String toString() {
        return this.f6213a + "/" + this.f6214b;
    }
}
