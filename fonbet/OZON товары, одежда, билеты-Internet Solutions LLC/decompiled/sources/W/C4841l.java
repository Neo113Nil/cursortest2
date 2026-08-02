package W;

import androidx.annotation.NonNull;

/* renamed from: W.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4841l extends X {

    /* renamed from: a, reason: collision with root package name */
    private final long f33085a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33086b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC4831b f33087c;

    C4841l(long j11, long j12, AbstractC4831b abstractC4831b) {
        this.f33085a = j11;
        this.f33086b = j12;
        this.f33087c = abstractC4831b;
    }

    @Override // W.X
    @NonNull
    public final AbstractC4831b a() {
        return this.f33087c;
    }

    @Override // W.X
    public final long b() {
        return this.f33086b;
    }

    @Override // W.X
    public final long c() {
        return this.f33085a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x11 = (X) obj;
        return this.f33085a == x11.c() && this.f33086b == x11.b() && this.f33087c.equals(x11.a());
    }

    public final int hashCode() {
        long j11 = this.f33085a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f33086b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f33087c.hashCode();
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.f33085a + ", numBytesRecorded=" + this.f33086b + ", audioStats=" + this.f33087c + "}";
    }
}
