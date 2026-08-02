package N3;

/* loaded from: classes8.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final I f18506c = new I(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f18507a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18508b;

    public I(long j11, long j12) {
        this.f18507a = j11;
        this.f18508b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && I.class == obj.getClass()) {
            I i11 = (I) obj;
            if (this.f18507a == i11.f18507a && this.f18508b == i11.f18508b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f18507a) * 31) + ((int) this.f18508b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.f18507a);
        sb2.append(", position=");
        return P4.f.a(this.f18508b, "]", sb2);
    }
}
